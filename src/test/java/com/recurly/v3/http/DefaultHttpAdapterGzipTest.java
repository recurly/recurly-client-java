package com.recurly.v3.http;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.verification.LoggedRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.JRE;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Gzip-specific behavior of {@link DefaultHttpAdapter}. Not part of {@link HttpAdapterContract}
 * because transparent gzip is an implementation detail of the HttpURLConnection-based default
 * adapter, not a requirement of the {@link HttpAdapter} interface itself.
 */
@DisabledOnJre(JRE.JAVA_8)
class DefaultHttpAdapterGzipTest {

  private WireMockServer server;
  private HttpAdapter adapter;

  @BeforeEach
  void setUp() {
    // Disable WireMock's own auto-gzip of stub responses so tests control compression explicitly.
    server = new WireMockServer(wireMockConfig().dynamicPort().gzipDisabled(true));
    server.start();
    adapter = new DefaultHttpAdapter();
  }

  @AfterEach
  void tearDown() {
    server.stop();
  }

  @Test
  void acceptEncodingGzip_addedWhenNotPresent() throws Exception {
    server.stubFor(any(urlPathEqualTo("/accounts")).willReturn(ok().withBody("{}")));

    adapter.execute("GET", url("/accounts"), new HashMap<>(), null);

    LoggedRequest req = singleRequest();
    assertEquals("gzip", req.getHeader("Accept-Encoding"),
        "Accept-Encoding: gzip must be added when the caller did not specify one");
  }

  @Test
  void acceptEncodingGzip_notOverridden_whenCallerSetsOwn() throws Exception {
    server.stubFor(any(urlPathEqualTo("/accounts")).willReturn(ok().withBody("{}")));

    Map<String, String> headers = new HashMap<>();
    headers.put("Accept-Encoding", "identity");
    adapter.execute("GET", url("/accounts"), headers, null);

    LoggedRequest req = singleRequest();
    assertEquals("identity", req.getHeader("Accept-Encoding"),
        "Caller-supplied Accept-Encoding must not be overridden");
  }

  @Test
  void gzipResponse_decompressedTransparently() throws Exception {
    byte[] gzipped = gzip("{\"hello\":\"world\"}");
    server.stubFor(any(urlPathEqualTo("/accounts"))
        .willReturn(aResponse().withStatus(200)
            .withHeader("Content-Encoding", "gzip")
            .withBody(gzipped)));

    HttpResponse response = adapter.execute("GET", url("/accounts"), new HashMap<>(), null);

    assertEquals("{\"hello\":\"world\"}", new String(response.getBody(), StandardCharsets.UTF_8),
        "Gzip-encoded response body must be transparently decompressed");
  }

  @Test
  void gzipResponse_stripsContentEncodingAndContentLengthHeaders() throws Exception {
    byte[] gzipped = gzip("{\"hello\":\"world\"}");
    server.stubFor(any(urlPathEqualTo("/accounts"))
        .willReturn(aResponse().withStatus(200)
            .withHeader("Content-Encoding", "gzip")
            .withBody(gzipped)));

    HttpResponse response = adapter.execute("GET", url("/accounts"), new HashMap<>(), null);

    Map<String, String> headers = response.getHeaders();
    assertFalse(headers.containsKey("content-encoding"),
        "content-encoding must be stripped once the body has been decompressed");
    assertFalse(headers.containsKey("content-length"),
        "content-length (of the compressed body) must be stripped once decompressed");
  }

  @Test
  void gzipErrorResponse_decompressedTransparently() throws Exception {
    byte[] gzipped = gzip("{\"error\":\"boom\"}");
    server.stubFor(any(urlPathEqualTo("/accounts"))
        .willReturn(aResponse().withStatus(500)
            .withHeader("Content-Encoding", "gzip")
            .withBody(gzipped)));

    HttpResponse response = adapter.execute("GET", url("/accounts"), new HashMap<>(), null);

    assertEquals(500, response.getStatusCode());
    assertEquals("{\"error\":\"boom\"}", new String(response.getBody(), StandardCharsets.UTF_8),
        "Gzip-encoded error response body must be transparently decompressed");
  }

  @Test
  void malformedGzipBody_throwsInsteadOfLeaking() {
    server.stubFor(any(urlPathEqualTo("/accounts"))
        .willReturn(aResponse().withStatus(200)
            .withHeader("Content-Encoding", "gzip")
            .withBody("not actually gzip")));

    assertThrows(java.io.IOException.class,
        () -> adapter.execute("GET", url("/accounts"), new HashMap<>(), null),
        "A Content-Encoding: gzip response with a non-gzip body must fail loudly "
            + "instead of leaking the underlying connection");
  }

  @Test
  void nonGzipResponse_bodyAndHeadersUntouched() throws Exception {
    server.stubFor(any(urlPathEqualTo("/accounts"))
        .willReturn(ok().withBody("{\"hello\":\"world\"}")));

    HttpResponse response = adapter.execute("GET", url("/accounts"), new HashMap<>(), null);

    assertEquals("{\"hello\":\"world\"}", new String(response.getBody(), StandardCharsets.UTF_8));
    assertFalse(response.getHeaders().containsKey("content-encoding"));
  }

  private String url(final String path) {
    return WireMockTestSupport.url(server, path);
  }

  private LoggedRequest singleRequest() {
    return WireMockTestSupport.singleRequest(server);
  }

  private static byte[] gzip(final String content) throws Exception {
    final ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try (final GZIPOutputStream gzos = new GZIPOutputStream(baos)) {
      gzos.write(content.getBytes(StandardCharsets.UTF_8));
    }
    return baos.toByteArray();
  }
}
