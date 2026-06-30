package com.recurly.v3;

import com.recurly.v3.exception.ExceptionFactory;
import com.recurly.v3.exception.InternalServerException;
import com.recurly.v3.exception.InvalidApiKeyException;
import com.recurly.v3.exception.NotFoundException;
import com.recurly.v3.exception.TransactionException;
import com.recurly.v3.exception.ValidationException;
import com.recurly.v3.fixtures.FixtureConstants;
import com.recurly.v3.fixtures.HttpTestFixtures;
import com.recurly.v3.fixtures.MockClient;
import com.recurly.v3.fixtures.MockQueryParams;
import com.recurly.v3.fixtures.MyRequest;
import com.recurly.v3.fixtures.MyResource;
import com.recurly.v3.RequestOptions;
import com.recurly.v3.http.HttpAdapter;
import com.recurly.v3.internal.Utils;
import com.recurly.v3.http.HttpResponse;
import org.apache.commons.io.IOUtils;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.MockedStatic;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static com.recurly.v3.fixtures.HttpTestFixtures.jsonResponse;
import static com.recurly.v3.fixtures.HttpTestFixtures.mockClientWith;
import static org.mockito.Mockito.*;

@SuppressWarnings("unchecked")
public class BaseClientTest {

  private static HttpResponse htmlResponse(final int statusCode, final String body) {
    final Map<String, String> headers = new HashMap<>();
    headers.put("content-type", "text/html; charset=UTF-8");
    return new HttpResponse(statusCode, headers, body.getBytes(StandardCharsets.UTF_8));
  }

  @Test
  public void testMakeRequestWithResource() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(eq("GET"), contains("/resources/code-aaron"), any(), isNull()))
        .thenReturn(jsonResponse(200, getResponseJson()));

    final MyResource resource = mockClientWith(mockAdapter).getResource("code-aaron");
    assertEquals(MyResource.class, resource.getClass());
  }

  @Test
  public void testMakeRequestWithBody() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any()))
        .thenReturn(jsonResponse(200, getResponseJson()));

    final MockClient client = mockClientWith(mockAdapter);
    final MyRequest newResource = new MyRequest();
    newResource.setMyString("aaron");

    final MyResource resource = client.createResource(newResource);
    verify(mockAdapter).execute(eq("POST"), contains("/resources"), any(), notNull());
    assertEquals(MyResource.class, resource.getClass());
    assertEquals("aaron", resource.getMyString());

    final MyResource anotherResource = client.updateResource("someId", newResource);
    verify(mockAdapter).execute(eq("PUT"), contains("/resources/someId"), any(), notNull());
    assertEquals(MyResource.class, anotherResource.getClass());
    assertEquals("aaron", anotherResource.getMyString());
  }

  @Test
  public void testMakeRequestWithoutResource() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(eq("DELETE"), contains("/resources/resource-id"), any(), isNull()))
        .thenReturn(jsonResponse(200, ""));

    mockClientWith(mockAdapter).removeResource("resource-id");
    verify(mockAdapter).execute(eq("DELETE"), contains("/resources/resource-id"), any(), isNull());
  }

  @Test
  public void testBuildHeadersSendsCorrectAuthAcceptAndUserAgent() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any())).thenReturn(jsonResponse(200, "{}"));
    final ArgumentCaptor<Map<String, String>> headersCaptor = ArgumentCaptor.forClass(Map.class);

    mockClientWith(mockAdapter).getResource("resource-id");

    verify(mockAdapter).execute(any(), any(), headersCaptor.capture(), any());
    final Map<String, String> headers = headersCaptor.getValue();

    assertEquals(
        "Basic " + java.util.Base64.getEncoder().encodeToString("apiKey:".getBytes(StandardCharsets.ISO_8859_1)),
        headers.get("authorization"));
    assertEquals("application/vnd.recurly." + Client.API_VERSION, headers.get("accept"));
    assertTrue(
        headers.get("user-agent").matches("Recurly/\\d+\\.\\d+\\.\\d+(-SNAPSHOT)?;\\s+java\\s+\\d+.*"),
        "User-Agent header should match the expected format, was: " + headers.get("user-agent"));
  }

  @Test
  public void testWarnIfDeprecatedPrintsWarningWhenHeaderPresent() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    final Map<String, String> responseHeaders = new HashMap<>();
    responseHeaders.put("content-type", "application/json; charset=utf-8");
    responseHeaders.put("recurly-deprecated", "true");
    responseHeaders.put("recurly-sunset-date", "2026-01-01");
    when(mockAdapter.execute(any(), any(), any(), any()))
        .thenReturn(new HttpResponse(200, responseHeaders, "{}".getBytes(StandardCharsets.UTF_8)));

    final java.io.PrintStream originalOut = System.out;
    final java.io.ByteArrayOutputStream captured = new java.io.ByteArrayOutputStream();
    System.setOut(new java.io.PrintStream(captured));
    try {
      mockClientWith(mockAdapter).getResource("resource-id");
    } finally {
      System.setOut(originalOut);
    }

    final String output = captured.toString(StandardCharsets.UTF_8.name());
    assertTrue(output.contains("WARNING"), "Expected a deprecation warning, got: " + output);
    assertTrue(output.contains("2026-01-01"), "Expected the sunset date in the warning, got: " + output);
  }


  @Test
  public void testWarnIfDeprecatedPrintsWarningWhenHeaderPresentOnVoidResponse() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    final Map<String, String> responseHeaders = new HashMap<>();
    responseHeaders.put("content-type", "application/json; charset=utf-8");
    responseHeaders.put("recurly-deprecated", "true");
    responseHeaders.put("recurly-sunset-date", "2026-01-01");
    when(mockAdapter.execute(any(), any(), any(), any()))
        .thenReturn(new HttpResponse(200, responseHeaders, "{}".getBytes(StandardCharsets.UTF_8)));

    final java.io.PrintStream originalOut = System.out;
    final java.io.ByteArrayOutputStream captured = new java.io.ByteArrayOutputStream();
    System.setOut(new java.io.PrintStream(captured));
    try {
      mockClientWith(mockAdapter).removeResource("resource-id");
    } finally {
      System.setOut(originalOut);
    }

    final String output = captured.toString(StandardCharsets.UTF_8.name());
    assertTrue(output.contains("WARNING"), "Expected a deprecation warning, got: " + output);
    assertTrue(output.contains("2026-01-01"), "Expected the sunset date in the warning, got: " + output);
  }

  @Test
  public void testMakeRequestWithQueryParams() throws IOException {
    final ZonedDateTime dateTime = ZonedDateTime.now();
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any()))
        .thenReturn(jsonResponse(200, getResponseListJson()));

    final MockQueryParams qp = new MockQueryParams();
    qp.setMyString("Aaron");
    qp.setMyDateTime(dateTime);
    qp.setMyInteger(1);
    qp.setMyFloat(2.3f);
    qp.setMyDouble(4.5);
    qp.setMyLong(6L);
    qp.setMyEnum(FixtureConstants.ConstantType.TWENTY_THREE);
    qp.setMyRandom(null);
    qp.setUnsupported(new ArrayList<>());

    final ArgumentCaptor<String> urlCaptor = ArgumentCaptor.forClass(String.class);
    mockClientWith(mockAdapter).listResources(qp).getNextPage();

    verify(mockAdapter).execute(eq("GET"), urlCaptor.capture(), any(), isNull());
    final String url = urlCaptor.getValue();

    assertTrue(url.contains("my_string=Aaron"));
    assertTrue(
        url.contains(
            "my_date_time="
                + URLEncoder.encode(
                    DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(dateTime), "UTF-8")));
    assertTrue(url.contains("my_integer=1"));
    assertTrue(url.contains("my_float=2.3"));
    assertTrue(url.contains("my_double=4.5"));
    assertTrue(url.contains("my_long=6"));
    assertTrue(url.contains("my_enum=twenty-three"));
    assertFalse(url.contains("my_random"));
    assertTrue(url.contains("unsupported=%5B%5D"));
  }

  @Test
  public void testNonJsonError0() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any()))
        .thenReturn(htmlResponse(0, "<html>badness</html>"));

    assertThrows(ApiException.class, () -> mockClientWith(mockAdapter).getResource("code-aaron"));
  }

  @Test
  public void testNonJsonError500() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any()))
        .thenReturn(htmlResponse(500, "<html>badness</html>"));

    assertThrows(
        InternalServerException.class,
        () -> mockClientWith(mockAdapter).getResource("code-aaron"));
  }

  @Test
  public void testNonJsonErrorViaRemoveResource() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any()))
        .thenReturn(htmlResponse(500, "<html>badness</html>"));

    assertThrows(
        InternalServerException.class,
        () -> mockClientWith(mockAdapter).removeResource("code-aaron"));
  }

  @Test
  public void testInvalidApiKey() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any()))
        .thenReturn(jsonResponse(404, getErrorJson("invalid_api_key")));

    assertThrows(
        InvalidApiKeyException.class,
        () -> mockClientWith(mockAdapter).getResource("code-aaron"));
  }

  @Test
  public void testNotFoundError() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any()))
        .thenReturn(jsonResponse(404, getErrorJson("not_found")));

    assertThrows(
        NotFoundException.class,
        () -> mockClientWith(mockAdapter).getResource("code-aaron"));
  }

  @Test
  public void testUnknownError() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any()))
        .thenReturn(jsonResponse(999, getErrorJson("unknown")));

    assertThrows(ApiException.class, () -> mockClientWith(mockAdapter).getResource("code-aaron"));

    final Map<String, String> headers = new HashMap<>();
    headers.put("content-type", "application/json");
    final HttpResponse httpResponse =
        new HttpResponse(999, headers, getErrorJson("unknown").getBytes(StandardCharsets.UTF_8));
    final RecurlyException exception = ExceptionFactory.getExceptionClass(httpResponse);
    assertTrue(exception.toString().contains("ApiException"));
  }

  @Test
  public void testValidationError() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any()))
        .thenReturn(jsonResponse(422, getErrorResponse("validation")));

    assertThrows(
        ValidationException.class,
        () -> mockClientWith(mockAdapter).removeResource("code-aaron"));
  }

  @Test
  public void testTransactionError() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any()))
        .thenReturn(jsonResponse(422, getErrorResponse("transaction")));

    final TransactionException t =
        assertThrows(
            TransactionException.class,
            () -> mockClientWith(mockAdapter).removeResource("code-aaron"));
    assertEquals("mbca9aaao6xr", t.getError().getTransactionError().getTransactionId());
  }

  @Test
  public void testNetworkError() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any())).thenThrow(new IOException());

    assertThrows(NetworkException.class, () -> mockClientWith(mockAdapter).getResource("code-aaron"));
  }

  @Test
  public void testNetworkErrorWithoutResource() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any())).thenThrow(new IOException());

    assertThrows(
        NetworkException.class,
        () -> mockClientWith(mockAdapter).removeResource("code-aaron"));
  }

  @Test
  public void testBadMethodError() {
    final MockClient client = new MockClient("apiKey");
    assertThrows(IllegalArgumentException.class, () -> client.badRequestMethod());
  }

  @Test
  public void testSetApiUrl() {
    try (MockedStatic<Utils> theMock = mockStatic(Utils.class)) {
      theMock.when(() -> Utils.envEnabled(eq("RECURLY_INSECURE"))).thenReturn(true);

      final MockClient client = new MockClient("apiKey");
      final String newApiUrl = "https://my.base.url/";
      client._setApiUrl(newApiUrl);

      assertEquals(newApiUrl, client.getApiUrl());
    }
  }

  @Test
  public void testCantSetApiUrlWithoutRecurlyInsecure() {
    try (MockedStatic<Utils> theMock = mockStatic(Utils.class)) {
      theMock.when(() -> Utils.envEnabled(eq("RECURLY_INSECURE"))).thenReturn(false);

      final MockClient client = new MockClient("apiKey");
      final String originalUrl = client.getApiUrl();
      client._setApiUrl("https://my.base.url/");

      assertEquals(originalUrl, client.getApiUrl());
    }
  }

  @Test
  public void testWithoutClientOptions() {
    assertEquals("https://v3.recurly.com", new MockClient("apiKey").getApiUrl());
  }

  @Test
  public void testUsingRegionUSClientOptions() {
    final ClientOptions options = ClientOptions.builder().region(ClientOptions.Regions.US).build();
    assertEquals("https://v3.recurly.com", new MockClient("apiKey", options).getApiUrl());
  }

  @Test
  public void testUsingRegionEUClientOptions() {
    final ClientOptions options = ClientOptions.builder().region(ClientOptions.Regions.EU).build();
    assertEquals("https://v3.eu.recurly.com", new MockClient("apiKey", options).getApiUrl());
  }

  @Test
  public void testIdempotencyKeyHeader() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any())).thenReturn(jsonResponse(200, getResponseJson()));
    final ArgumentCaptor<Map<String, String>> headersCaptor = ArgumentCaptor.forClass(Map.class);

    final String idempotencyKey = "test-idempotency-key-123";
    final MockClient client = mockClientWith(mockAdapter);
    final MyRequest body = new MyRequest();
    final RequestOptions options = RequestOptions.builder().idempotencyKey(idempotencyKey).build();
    client.createResource(body, options);

    verify(mockAdapter).execute(any(), any(), headersCaptor.capture(), any());
    assertEquals(idempotencyKey, headersCaptor.getValue().get("idempotency-key"));
  }

  @Test
  public void testRawHeaders() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any())).thenReturn(jsonResponse(200, getResponseJson()));
    final ArgumentCaptor<Map<String, String>> headersCaptor = ArgumentCaptor.forClass(Map.class);

    final MockClient client = mockClientWith(mockAdapter);
    final MyRequest body = new MyRequest();
    final RequestOptions options = RequestOptions.builder()
        .header("X-Custom-Foo", "bar")
        .header("X-Custom-Qux", "baz")
        .build();
    client.createResource(body, options);

    verify(mockAdapter).execute(any(), any(), headersCaptor.capture(), any());
    final Map<String, String> headers = headersCaptor.getValue();
    assertEquals("bar", headers.get("x-custom-foo"));
    assertEquals("baz", headers.get("x-custom-qux"));
  }

  @Test
  public void testRequestOptionsCannotOverrideBuiltInHeaders() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any())).thenReturn(jsonResponse(200, getResponseJson()));
    final ArgumentCaptor<Map<String, String>> headersCaptor = ArgumentCaptor.forClass(Map.class);

    final MockClient client = mockClientWith(mockAdapter);
    final MyRequest body = new MyRequest();
    // Caller supplies the reserved headers in two different casings: Title-case
    // ("Authorization") and lower-case ("content-type"). Both must be overridden by the
    // client's built-in values, and neither casing may survive as a stray duplicate.
    final RequestOptions options = RequestOptions.builder()
        .header("Authorization", "Bearer evil")
        .header("content-type", "text/plain")
        .build();
    client.createResource(body, options);

    verify(mockAdapter).execute(any(), any(), headersCaptor.capture(), any());
    final Map<String, String> headers = headersCaptor.getValue();
    assertFalse(headers.get("authorization").contains("evil"));
    assertEquals("application/json", headers.get("content-type"));
    // No Title-cased duplicate lingers, so the effective header is deterministic.
    assertEquals(null, headers.get("Authorization"));
    assertEquals(null, headers.get("Content-Type"));
  }

  @Test
  public void testNoIdempotencyKeyHeader() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any())).thenReturn(jsonResponse(200, getResponseJson()));
    final ArgumentCaptor<Map<String, String>> headersCaptor = ArgumentCaptor.forClass(Map.class);

    final MockClient client = mockClientWith(mockAdapter);
    final MyRequest body = new MyRequest();
    client.createResource(body);

    verify(mockAdapter).execute(any(), any(), headersCaptor.capture(), any());
    assertEquals(null, headersCaptor.getValue().get("idempotency-key"));
  }

  @Test
  public void testInterpolatePathWithoutParams() {
    assertEquals("/accounts", new MockClient("apiKey").interpolatePath("/accounts"));
  }

  @Test
  public void testInterpolatePathWithParams() {
    final HashMap<String, String> urlParams = new HashMap<>();
    urlParams.put("account_id", "accountId/");
    urlParams.put("account_note_id", "noteId,");
    assertEquals(
        "/accounts/accountId%2F/notes/noteId%2C",
        new MockClient("apiKey")
            .interpolatePath("/accounts/{account_id}/notes/{account_note_id}", urlParams));
  }

  @Test
  public void testGetRecordCountNonSuccessThrowsRecurlyException() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(eq("HEAD"), any(), any(), isNull()))
        .thenReturn(new HttpResponse(404, new HashMap<>(), new byte[0]));

    assertThrows(
        RecurlyException.class,
        () -> mockClientWith(mockAdapter).getRecordCount("/resources", null));
  }

  @Test
  public void testGetRecordCountMissingHeader() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    final Map<String, String> headers = new HashMap<>();
    when(mockAdapter.execute(eq("HEAD"), any(), any(), isNull()))
        .thenReturn(new HttpResponse(200, headers, new byte[0]));

    assertThrows(
        RecurlyException.class,
        () -> mockClientWith(mockAdapter).getRecordCount("/resources", null));
  }

  @Test
  public void testGetRecordCountMergesQueryParamsIntoPathWithExistingQueryString() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    final Map<String, String> headers = new HashMap<>();
    headers.put("recurly-total-records", "5");
    when(mockAdapter.execute(eq("HEAD"), any(), any(), isNull()))
        .thenReturn(new HttpResponse(200, headers, new byte[0]));

    final HashMap<String, Object> queryParams = new HashMap<>();
    queryParams.put("limit", 20);

    final ArgumentCaptor<String> urlCaptor = ArgumentCaptor.forClass(String.class);
    mockClientWith(mockAdapter).getRecordCount("/resources?cursor=xyz", queryParams);

    verify(mockAdapter).execute(eq("HEAD"), urlCaptor.capture(), any(), isNull());
    final String url = urlCaptor.getValue();

    assertEquals(1, url.length() - url.replace("?", "").length());
    assertTrue(url.contains("cursor=xyz"));
    assertTrue(url.contains("limit=20"));
  }

  @Test
  public void testHttpResponseNullHeadersThrows() {
    assertThrows(NullPointerException.class, () -> new HttpResponse(200, null, new byte[0]));
  }

  @Test
  public void testMixedCaseHeadersAreNormalized() throws IOException {
    // Without normalization BaseClient looks up "content-type" but finds nothing (key is
    // "Content-Type"), falls back to "application/json", and tries to JSON-parse an HTML body.
    // With normalization it correctly routes to ExceptionFactory → InternalServerException.
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    final Map<String, String> headers = new HashMap<>();
    headers.put("Content-Type", "text/html; charset=UTF-8");
    when(mockAdapter.execute(any(), any(), any(), any()))
        .thenReturn(new HttpResponse(500, headers, "<html>error</html>".getBytes(StandardCharsets.UTF_8)));

    assertThrows(
        InternalServerException.class,
        () -> mockClientWith(mockAdapter).getResource("code-aaron"));
  }

  @Test
  public void testInterpolatePathValidations() {
    final HashMap<String, String> urlParams = new HashMap<>();
    urlParams.put("account_id", "");
    urlParams.put("account_note_id", "");
    assertThrows(
        RecurlyException.class,
        () ->
            new MockClient("apiKey")
                .interpolatePath(
                    "/accounts/{account_id}/notes/{account_note_id}", urlParams));
  }

  @Test
  public void testInterpolatePathMatching() {
    final HashMap<String, String> urlParams = new HashMap<>();
    urlParams.put("url_path", "replacement");
    assertEquals(
        "/url_path/replacement",
        new MockClient("apiKey").interpolatePath("/url_path/{url_path}", urlParams));
  }

  private static String getResponseJson() {
    return "{ \"my_string\": \"aaron\" }";
  }

  private static String getResponseListJson() {
    return ""
        + "{"
        + "\"object\":\"list\","
        + "\"has_more\":false,"
        + "\"next\":null,"
        + "\"data\": ["
        + "{"
        + "\"my_string\":\"Du Monde\""
        + "},"
        + "]"
        + "}";
  }

  private static String getErrorJson(final String exception) {
    return ""
        + "{\n"
        + "    \"error\": {\n"
        + "       \"type\":"
        + exception
        + ",\n"
        + "       \"message\": \"Resource has an error\",\n"
        + "       \"params\": [\n"
        + "           {\"param\":\"some_param\"}\n"
        + "        ]\n"
        + "    }\n"
        + "}";
  }

  private static String getErrorResponse(final String exception) {
    InputStream resource = null;

    if ("validation".equals(exception)) {
      resource = BaseClientTest.class.getResourceAsStream("/errors/validationError.json");
    } else if ("transaction".equals(exception)) {
      resource = BaseClientTest.class.getResourceAsStream("/errors/transactionError.json");
    }

    if (resource != null) {
      try {
        return IOUtils.toString(resource, StandardCharsets.UTF_8);
      } catch (IOException e) {
        throw new IllegalStateException(e.getMessage(), e);
      }
    }

    return getErrorJson(exception);
  }
}
