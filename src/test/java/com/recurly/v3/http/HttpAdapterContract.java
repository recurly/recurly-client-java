package com.recurly.v3.http;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.verification.LoggedRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.JRE;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Portable contract test for {@link HttpAdapter} implementations.
 *
 * <p>Extend this class and implement {@link #createAdapter()} to verify that your adapter
 * satisfies the full behavioral contract required by the Recurly Java client.
 *
 * <pre>{@code
 * class MyAdapterTest extends HttpAdapterContract {
 *     @Override
 *     protected HttpAdapter createAdapter() {
 *         return new MyHttpAdapter();
 *     }
 * }
 * }</pre>
 *
 * <p>Each test starts a local {@link WireMockServer} on a random port, so no real network
 * access is needed. Requires Java 11 or later at test runtime (WireMock 3 constraint);
 * tests are automatically skipped on Java 8.
 *
 * <p>You will need the following test-scope dependencies in your project:
 *
 * <pre>{@code
 * <dependency>
 *     <groupId>org.wiremock</groupId>
 *     <artifactId>wiremock</artifactId>
 *     <version>3.13.2</version>
 *     <scope>test</scope>
 * </dependency>
 * <dependency>
 *     <groupId>org.junit.jupiter</groupId>
 *     <artifactId>junit-jupiter-engine</artifactId>
 *     <version>5.12.2</version>
 *     <scope>test</scope>
 * </dependency>
 * }</pre>
 */
@DisabledOnJre(JRE.JAVA_8)
public abstract class HttpAdapterContract {

  private WireMockServer server;
  protected HttpAdapter adapter;

  /**
   * Return the {@link HttpAdapter} implementation under test. Called once per test method; the
   * returned instance is assigned to {@link #adapter} before the test runs.
   */
  protected abstract HttpAdapter createAdapter();

  @BeforeEach
  final void setUp() {
    server = new WireMockServer(wireMockConfig().dynamicPort());
    server.start();
    adapter = createAdapter();
  }

  @AfterEach
  final void tearDown() {
    server.stop();
  }

  // ---------------------------------------------------------------------------
  // HTTP methods
  // ---------------------------------------------------------------------------

  @Test
  void getRequest_sendsCorrectMethodAndNoBody() throws Exception {
    server.stubFor(any(urlPathEqualTo("/accounts")).willReturn(ok().withBody("{}")));

    adapter.execute("GET", url("/accounts"), noHeaders(), null);

    LoggedRequest req = singleRequest();
    assertEquals("GET", req.getMethod().getName());
    assertEquals(0, req.getBody().length, "GET must not send a body");
  }

  @Test
  void postRequest_sendsBodyAndCorrectMethod() throws Exception {
    String body = "{\"code\":\"silver\"}";
    server.stubFor(any(urlPathEqualTo("/subscriptions"))
        .willReturn(aResponse().withStatus(201).withBody("{}")));

    adapter.execute("POST", url("/subscriptions"), jsonHeaders(), body);

    LoggedRequest req = singleRequest();
    assertEquals("POST", req.getMethod().getName());
    assertEquals(body, req.getBodyAsString(), "POST body must be forwarded verbatim");
  }

  @Test
  void putRequest_sendsBodyAndCorrectMethod() throws Exception {
    String body = "{\"first_name\":\"Jane\"}";
    server.stubFor(any(urlPathEqualTo("/accounts/abc123")).willReturn(ok().withBody("{}")));

    adapter.execute("PUT", url("/accounts/abc123"), jsonHeaders(), body);

    LoggedRequest req = singleRequest();
    assertEquals("PUT", req.getMethod().getName());
    assertEquals(body, req.getBodyAsString(), "PUT body must be forwarded verbatim");
  }

  @Test
  void postRequest_nullBody_sendsContentLengthZero() throws Exception {
    server.stubFor(any(urlPathEqualTo("/subscriptions")).willReturn(aResponse().withStatus(201).withBody("{}")));

    adapter.execute("POST", url("/subscriptions"), noHeaders(), null);

    LoggedRequest req = singleRequest();
    assertEquals("POST", req.getMethod().getName());
    assertEquals(0, req.getBody().length, "POST with null body must not send body bytes");
    assertEquals("0", req.getHeader("Content-Length"),
        "POST with null body must send Content-Length: 0");
  }

  @Test
  void putRequest_nullBody_sendsContentLengthZero() throws Exception {
    server.stubFor(any(urlPathEqualTo("/accounts/abc123")).willReturn(ok().withBody("{}")));

    adapter.execute("PUT", url("/accounts/abc123"), noHeaders(), null);

    LoggedRequest req = singleRequest();
    assertEquals("PUT", req.getMethod().getName());
    assertEquals(0, req.getBody().length, "PUT with null body must not send body bytes");
    assertEquals("0", req.getHeader("Content-Length"),
        "PUT with null body must send Content-Length: 0");
  }
  @Test
  void deleteRequest_sendsCorrectMethodAndNoBody() throws Exception {
    server.stubFor(any(urlPathEqualTo("/accounts/abc123"))
        .willReturn(aResponse().withStatus(204)));

    adapter.execute("DELETE", url("/accounts/abc123"), noHeaders(), null);

    LoggedRequest req = singleRequest();
    assertEquals("DELETE", req.getMethod().getName());
    assertEquals(0, req.getBody().length, "DELETE must not send a body");
  }

  @Test
  void headRequest_sendsCorrectMethodAndNoBody() throws Exception {
    server.stubFor(any(urlPathEqualTo("/accounts"))
        .willReturn(ok().withHeader("recurly-total-records", "42")));

    HttpResponse response = adapter.execute("HEAD", url("/accounts"), noHeaders(), null);

    LoggedRequest req = singleRequest();
    assertEquals("HEAD", req.getMethod().getName());
    assertEquals(0, req.getBody().length, "HEAD must not send a body");
    assertNotNull(response.getBody(), "HEAD response body must be a non-null byte array");
    assertEquals(0, response.getBody().length, "HEAD response body must be empty");
  }

  // ---------------------------------------------------------------------------
  // Request headers
  // ---------------------------------------------------------------------------

  @Test
  void requestHeaders_forwardedUnmodified() throws Exception {
    server.stubFor(any(urlPathEqualTo("/accounts")).willReturn(ok().withBody("{}")));

    Map<String, String> headers = new HashMap<>();
    headers.put("Authorization", "Basic dXNlcjpwYXNz");
    headers.put("Accept", "application/json");
    headers.put("X-Api-Version", "2021-02-25");
    adapter.execute("GET", url("/accounts"), headers, null);

    LoggedRequest req = singleRequest();
    assertEquals("Basic dXNlcjpwYXNz", req.getHeader("Authorization"),
        "Authorization header must be forwarded unmodified");
    assertEquals("application/json", req.getHeader("Accept"),
        "Accept header must be forwarded unmodified");
    assertEquals("2021-02-25", req.getHeader("X-Api-Version"),
        "Custom headers must be forwarded unmodified");
  }

  // ---------------------------------------------------------------------------
  // Response: status code, headers, body
  // ---------------------------------------------------------------------------

  @Test
  void responseStatusCode_matchesServerResponse() throws Exception {
    server.stubFor(any(urlPathEqualTo("/missing"))
        .willReturn(aResponse().withStatus(404).withBody("{}")));

    HttpResponse response = adapter.execute("GET", url("/missing"), noHeaders(), null);

    assertEquals(404, response.getStatusCode(),
        "Status code must match what the server returned");
  }

  @Test
  void responseHeaders_returnedInResponse() throws Exception {
    server.stubFor(any(urlPathEqualTo("/accounts"))
        .willReturn(ok().withBody("{}")
            .withHeader("X-Request-Id", "req-xyz")
            .withHeader("Recurly-Total-Records", "99")));

    HttpResponse response = adapter.execute("GET", url("/accounts"), noHeaders(), null);

    // HttpResponse normalises header names to lower-case
    Map<String, String> h = response.getHeaders();
    assertNotNull(h);
    assertTrue(h.containsKey("x-request-id"),
        "x-request-id response header must be present (case-insensitive lookup)");
    assertEquals("req-xyz", h.get("x-request-id"));
  }

  @Test
  void responseBody_returnedAsBytes() throws Exception {
    String json = "{\"object\":\"account\",\"code\":\"abc\"}";
    server.stubFor(any(urlPathEqualTo("/accounts/abc")).willReturn(ok().withBody(json)));

    HttpResponse response = adapter.execute("GET", url("/accounts/abc"), noHeaders(), null);

    assertNotNull(response.getBody(), "body must never be null");
    assertEquals(json, new String(response.getBody(), StandardCharsets.UTF_8));
  }

  @Test
  void emptyResponseBody_returnsEmptyByteArray_notNull() throws Exception {
    server.stubFor(any(urlPathEqualTo("/accounts/abc"))
        .willReturn(aResponse().withStatus(204)));

    HttpResponse response = adapter.execute("DELETE", url("/accounts/abc"), noHeaders(), null);

    assertNotNull(response.getBody(),
        "body must be a non-null byte[] even when the response has no body");
  }

  @Test
  void largeResponseBody_readFully() throws Exception {
    // 256 KB — guards against implementations that return a lazy or truncated stream
    StringBuilder sb = new StringBuilder(256 * 1024);
    for (int i = 0; i < 256 * 1024; i++) {
      sb.append('x');
    }
    String large = sb.toString();
    server.stubFor(any(urlPathEqualTo("/data")).willReturn(ok().withBody(large)));

    HttpResponse response = adapter.execute("GET", url("/data"), noHeaders(), null);

    assertEquals(large.length(), response.getBody().length,
        "Adapter must read the response body fully before returning");
  }

  // ---------------------------------------------------------------------------
  // URL forwarding
  // ---------------------------------------------------------------------------

  @Test
  void urlWithQueryString_forwardedUnmodified() throws Exception {
    server.stubFor(any(urlPathEqualTo("/accounts")).willReturn(ok().withBody("{}")));

    adapter.execute("GET", url("/accounts?limit=20&sort=created_at"), noHeaders(), null);

    LoggedRequest req = singleRequest();
    String fullUrl = req.getUrl();
    assertNotNull(fullUrl);
    assertTrue(fullUrl.contains("limit=20"), "Query parameter 'limit' must be forwarded");
    assertTrue(fullUrl.contains("sort=created_at"), "Query parameter 'sort' must be forwarded");
  }

  // ---------------------------------------------------------------------------
  // Error handling
  // ---------------------------------------------------------------------------

  @Test
  void httpErrors_returnedAsResponses_notThrown() throws Exception {
    // 4xx and 5xx must NOT cause an exception — return the response and let the client handle it
    server.stubFor(any(urlPathEqualTo("/subscriptions"))
        .willReturn(aResponse().withStatus(422).withBody("{\"error\":{}}")));

    HttpResponse response = adapter.execute("POST", url("/subscriptions"), jsonHeaders(), "{}");

    assertEquals(422, response.getStatusCode(),
        "HTTP error status codes must be returned as HttpResponse, not thrown as exceptions");
  }

  @Test
  void networkFailure_throwsIOException() {
    WireMockServer dead = new WireMockServer(wireMockConfig().dynamicPort());
    dead.start();
    int port = dead.port();
    dead.stop();

    assertThrows(IOException.class,
        () -> adapter.execute("GET", "http://localhost:" + port + "/test", noHeaders(), null),
        "Network-level failures must propagate as IOException");
  }

  // ---------------------------------------------------------------------------
  // Thread safety
  // ---------------------------------------------------------------------------

  @Test
  void concurrentRequests_completeSafely() throws Exception {
    int threadCount = 20;
    server.stubFor(any(anyUrl()).willReturn(ok().withBody("{}")));

    ExecutorService pool = Executors.newFixedThreadPool(threadCount);
    CountDownLatch allReady = new CountDownLatch(threadCount);
    CountDownLatch startGun = new CountDownLatch(1);
    AtomicInteger errors = new AtomicInteger(0);

    for (int i = 0; i < threadCount; i++) {
      pool.submit(() -> {
        allReady.countDown();
        try {
          startGun.await();
          adapter.execute("GET", url("/accounts"), noHeaders(), null);
        } catch (Exception e) {
          errors.incrementAndGet();
        }
      });
    }

    allReady.await(5, TimeUnit.SECONDS);
    startGun.countDown();
    pool.shutdown();
    assertTrue(pool.awaitTermination(15, TimeUnit.SECONDS),
        "All concurrent requests must complete within 15 seconds");
    assertEquals(0, errors.get(),
        "No exceptions should occur during concurrent use of the adapter");
  }

  // ---------------------------------------------------------------------------
  // Helpers
  // ---------------------------------------------------------------------------

  private String url(final String path) {
    return WireMockTestSupport.url(server, path);
  }

  private static Map<String, String> noHeaders() {
    return new HashMap<>();
  }

  private static Map<String, String> jsonHeaders() {
    Map<String, String> headers = new HashMap<>();
    headers.put("Content-Type", "application/json; charset=utf-8");
    return headers;
  }

  private LoggedRequest singleRequest() {
    return WireMockTestSupport.singleRequest(server);
  }
}
