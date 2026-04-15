package com.recurly.v3;

import com.recurly.v3.exception.ExceptionFactory;
import com.recurly.v3.exception.InternalServerException;
import com.recurly.v3.exception.InvalidApiKeyException;
import com.recurly.v3.exception.NotFoundException;
import com.recurly.v3.exception.TransactionException;
import com.recurly.v3.exception.ValidationException;
import com.recurly.v3.fixtures.FixtureConstants;
import com.recurly.v3.ApiException;
import com.recurly.v3.fixtures.MockClient;
import com.recurly.v3.fixtures.MockHttpTransport;
import com.recurly.v3.fixtures.MockQueryParams;
import com.recurly.v3.fixtures.MyRequest;
import com.recurly.v3.fixtures.MyResource;
import com.recurly.v3.http.SimpleHttpRequest;
import com.recurly.v3.http.SimpleHttpResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.eq;

@SuppressWarnings("unchecked")
public class BaseClientTest {

  @Test
  public void testMakeRequestWithResource() throws IOException {
    final MockHttpTransport transport = new MockHttpTransport();
    transport.enqueue(MockClient.buildResponse(200, getResponseJson()));

    final MockClient client = new MockClient("apiKey", transport);
    final MyResource resource = client.getResource("code-aaron");

    assertEquals(MyResource.class, resource.getClass());

    final SimpleHttpRequest request = transport.getLastRequest();
    assertEquals("GET", request.getMethod());
    assertEquals("/resources/code-aaron", getPath(request.getUrl()));
  }

  @Test
  public void testMakeRequestWithBody() throws IOException {
    final MockHttpTransport transport = new MockHttpTransport();
    transport.enqueue(MockClient.buildResponse(200, getResponseJson()));
    transport.enqueue(MockClient.buildResponse(200, getResponseJson()));

    final MockClient client = new MockClient("apiKey", transport);
    final MyRequest newResource = new MyRequest();
    newResource.setMyString("aaron");

    final MyResource resource = client.createResource(newResource);
    assertEquals(MyResource.class, resource.getClass());
    assertEquals("aaron", resource.getMyString());

    final MyResource anotherResource = client.updateResource("someId", newResource);
    assertEquals(MyResource.class, anotherResource.getClass());
    assertEquals("aaron", anotherResource.getMyString());

    final List<SimpleHttpRequest> requests = transport.getRequests();
    assertEquals(2, requests.size());
    assertEquals("POST", requests.get(0).getMethod());
    assertEquals("/resources", getPath(requests.get(0).getUrl()));
    assertEquals("PUT", requests.get(1).getMethod());
    assertEquals("/resources/someId", getPath(requests.get(1).getUrl()));
  }

  @Test
  public void testMakeRequestWithoutResource() throws IOException {
    final MockHttpTransport transport = new MockHttpTransport();
    transport.enqueue(MockClient.buildResponse(200, ""));

    final MockClient client = new MockClient("apiKey", transport);
    client.removeResource("resource-id");

    final SimpleHttpRequest request = transport.getLastRequest();
    assertEquals("DELETE", request.getMethod());
    assertEquals("/resources/resource-id", getPath(request.getUrl()));
  }

  @Test
  public void testMakeRequestWithQueryParams() throws IOException {
    final ZonedDateTime dateTime = ZonedDateTime.now();

    final MockHttpTransport transport = new MockHttpTransport();
    transport.enqueue(MockClient.buildResponse(200, getResponseListJson()));

    final MockClient client = new MockClient("apiKey", transport);
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
    final Pager<MyResource> pager = client.listResources(qp);
    pager.getNextPage();

    final String url = transport.getLastRequest().getUrl();
    assertEquals("Aaron", getQueryParam(url, "my_string"));
    assertEquals(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(dateTime), getQueryParam(url, "my_date_time"));
    assertEquals("1", getQueryParam(url, "my_integer"));
    assertEquals("2.3", getQueryParam(url, "my_float"));
    assertEquals("4.5", getQueryParam(url, "my_double"));
    assertEquals("6", getQueryParam(url, "my_long"));
    assertEquals("twenty-three", getQueryParam(url, "my_enum"));
    assertEquals(null, getQueryParam(url, "my_random"));
    assertEquals("[]", getQueryParam(url, "unsupported"));
  }

  @Test
  public void testNonJsonError0() throws IOException {
    final MockHttpTransport transport = new MockHttpTransport();
    transport.enqueue(MockClient.buildResponse(0, "text/html; charset=UTF-8",
        "<html>badness</html>", Collections.<String, List<String>>emptyMap()));

    final MockClient client = new MockClient("apiKey", transport);

    assertThrows(
        ApiException.class,
        () -> {
          client.getResource("code-aaron");
        });
  }

  @Test
  public void testNonJsonError500() throws IOException {
    final MockHttpTransport transport = new MockHttpTransport();
    transport.enqueue(MockClient.buildResponse(500, "text/html; charset=UTF-8",
        "<html>badness</html>", Collections.<String, List<String>>emptyMap()));

    final MockClient client = new MockClient("apiKey", transport);

    assertThrows(
        InternalServerException.class,
        () -> {
          client.getResource("code-aaron");
        });
  }

  @Test
  public void testInvalidApiKey() throws IOException {
    final MockHttpTransport transport = new MockHttpTransport();
    transport.enqueue(MockClient.buildResponse(404, getErrorJson("invalid_api_key")));

    final MockClient client = new MockClient("apiKey", transport);

    // This test is important because it ensures that application/json response errors are based on the json
    // body's error type and not the status code based error
    assertThrows(
        InvalidApiKeyException.class,
        () -> {
          client.getResource("code-aaron");
        });
  }

  @Test
  public void testNotFoundError() throws IOException {
    final MockHttpTransport transport = new MockHttpTransport();
    transport.enqueue(MockClient.buildResponse(404, getErrorJson("not_found")));

    final MockClient client = new MockClient("apiKey", transport);

    assertThrows(
        NotFoundException.class,
        () -> {
          client.getResource("code-aaron");
        });
  }

  @Test
  public void testUnknownError() throws IOException {
    final MockHttpTransport transport = new MockHttpTransport();
    SimpleHttpResponse response = MockClient.buildResponse(999, getErrorJson("unknown"));
    transport.enqueue(response);

    final MockClient client = new MockClient("apiKey", transport);
    // asserts that generic api exception is thrown for unknown error
    assertThrows(
        ApiException.class,
        () -> {
          client.getResource("code-aaron");
        });
    final RecurlyException exception = ExceptionFactory.getExceptionClass(response);
    assertTrue(exception.toString().contains("ApiException"));
  }

  @Test
  public void testValidationError() throws IOException {
    final MockHttpTransport transport = new MockHttpTransport();
    transport.enqueue(MockClient.buildResponse(422, getErrorResponse("validation")));

    final MockClient client = new MockClient("apiKey", transport);

    assertThrows(
        ValidationException.class,
        () -> {
          client.removeResource("code-aaron");
        });
  }

  @Test
  public void testTransactionError() throws IOException {
    final MockHttpTransport transport = new MockHttpTransport();
    transport.enqueue(MockClient.buildResponse(422, getErrorResponse("transaction")));

    final MockClient client = new MockClient("apiKey", transport);

    TransactionException t = assertThrows(
        TransactionException.class,
        () -> {
          client.removeResource("code-aaron");
        });
    assertEquals("mbca9aaao6xr", t.getError().getTransactionError().getTransactionId());
  }

  @Test
  public void testNetworkError() throws IOException {
    final MockHttpTransport transport = new MockHttpTransport();
    transport.willThrow(new IOException());

    final MockClient client = new MockClient("apiKey", transport);
    assertThrows(
        NetworkException.class,
        () -> {
          client.getResource("code-aaron");
        });
  }

  @Test
  public void testNetworkErrorWithoutResource() throws IOException {
    final MockHttpTransport transport = new MockHttpTransport();
    transport.willThrow(new IOException());

    final MockClient client = new MockClient("apiKey", transport);
    assertThrows(
        NetworkException.class,
        () -> {
          client.removeResource("code-aaron");
        });
  }

  @Test
  public void testBadMethodError() throws IOException {
    final MockClient client = new MockClient("apiKey");

    assertThrows(
        IllegalArgumentException.class,
        () -> {
          client.badRequestMethod();
        });
  }

  @Test
  public void testSetApiUrl() {
    try (MockedStatic<BaseClient> theMock = mockStatic(BaseClient.class)) {
      theMock.when(() -> BaseClient.envEnabled(eq("RECURLY_INSECURE"))).thenReturn(true);

      final MockClient client = new MockClient("apiKey");
      final String newApiUrl = "https://my.base.url/";
      client._setApiUrl(newApiUrl);

      assertEquals(newApiUrl, client.getApiUrl());
    }
  }

  @Test
  public void testCantSetApiUrlWithoutRecurlyInsecure() throws Exception {
    try (MockedStatic<BaseClient> theMock = mockStatic(BaseClient.class)) {
      theMock.when(() -> BaseClient.envEnabled(eq("RECURLY_INSECURE"))).thenReturn(false);

      final MockClient client = new MockClient("apiKey");
      final String originalUrl = client.getApiUrl();
      final String newApiUrl = "https://my.base.url/";
      client._setApiUrl(newApiUrl);

      assertEquals(originalUrl, client.getApiUrl());
    }
  }

  @Test
  public void testWithoutClientOptions() {
    // The default region should be ClientOptions.Regions.US
    final MockClient client = new MockClient("apiKey");
    assertEquals("https://v3.recurly.com", client.getApiUrl());
  }

  @Test
  public void testUsingRegionUSClientOptions() {
    final ClientOptions options = new ClientOptions();
    options.setRegion(ClientOptions.Regions.US);
    final MockClient client = new MockClient("apiKey", options);
    assertEquals("https://v3.recurly.com", client.getApiUrl());
  }

  @Test
  public void testUsingRegionEUClientOptions() {
    final ClientOptions options = new ClientOptions();
    options.setRegion(ClientOptions.Regions.EU);
    final MockClient client = new MockClient("apiKey", options);
    assertEquals("https://v3.eu.recurly.com", client.getApiUrl());
  }

  @Test
  public void testInterpolatePathWithoutParams() {
    final MockClient client = new MockClient("apiKey");
    final String path = "/accounts";
    final String interpolatedPath = client.interpolatePath(path);

    assertEquals("/accounts", interpolatedPath);
  }

  @Test
  public void testInterpolatePathWithParams() {
    final MockClient client = new MockClient("apiKey");
    final String path = "/accounts/{account_id}/notes/{account_note_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", "accountId/");
    urlParams.put("account_note_id", "noteId,");
    final String interpolatedPath = client.interpolatePath(path, urlParams);

    assertEquals("/accounts/accountId%2F/notes/noteId%2C", interpolatedPath);
  }

  @Test
  public void testInterpolatePathValidations() {
    final MockClient client = new MockClient("apiKey");
    final String path = "/accounts/{account_id}/notes/{account_note_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", "");
    urlParams.put("account_note_id", "");

    assertThrows(
        RecurlyException.class,
        () -> {
          client.interpolatePath(path, urlParams);
        });
  }

  @Test
  public void testInterpolatePathMatching() {
    final MockClient client = new MockClient("apiKey");
    final String path = "/url_path/{url_path}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("url_path", "replacement");

    final String interpolatedPath = client.interpolatePath(path, urlParams);
    assertEquals("/url_path/replacement", interpolatedPath);
  }

  // --- Helpers ---

  private static String getPath(String url) {
    int schemeEnd = url.indexOf("://");
    if (schemeEnd < 0) return url;
    int pathStart = url.indexOf('/', schemeEnd + 3);
    if (pathStart < 0) return "/";
    int queryStart = url.indexOf('?', pathStart);
    return queryStart < 0 ? url.substring(pathStart) : url.substring(pathStart, queryStart);
  }

  private static String getQueryParam(String url, String name) {
    try {
      int qIdx = url.indexOf('?');
      if (qIdx < 0) return null;
      final String query = url.substring(qIdx + 1);
      for (String param : query.split("&")) {
        final int eqIdx = param.indexOf('=');
        final String key = URLDecoder.decode(
            eqIdx >= 0 ? param.substring(0, eqIdx) : param, "UTF-8");
        if (key.equals(name)) {
          return eqIdx >= 0 ? URLDecoder.decode(param.substring(eqIdx + 1), "UTF-8") : "";
        }
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    return null;
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

  private static String getErrorJson(String exception) {
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

  private static String getErrorResponse(String exception) {
    InputStream resource = null;

    if ("validation".equals(exception)) {
      resource = BaseClientTest.class.getResourceAsStream("/errors/validationError.json");
    } else if ("transaction".equals(exception)) {
      resource = BaseClientTest.class.getResourceAsStream("/errors/transactionError.json");
    }

    if (resource != null) {
      try {
        final BufferedReader reader =
            new BufferedReader(new InputStreamReader(resource, StandardCharsets.UTF_8));
        return reader.lines().collect(Collectors.joining("\n"));
      } catch (Exception e) {
        throw new IllegalStateException(e.getMessage(), e);
      }
    }

    return getErrorJson(exception);
  }
}
