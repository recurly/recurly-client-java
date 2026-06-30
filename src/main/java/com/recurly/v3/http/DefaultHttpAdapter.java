package com.recurly.v3.http;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultHttpAdapter implements HttpAdapter {
  private static final int DEFAULT_TIMEOUT_MS = 60_000;

  private final int timeoutMs;
  private final boolean debugLogging;

  public DefaultHttpAdapter() {
    this(DEFAULT_TIMEOUT_MS);
  }

  public DefaultHttpAdapter(final int timeoutMs) {
    this.timeoutMs = timeoutMs;
    this.debugLogging = envEnabled("RECURLY_INSECURE") && envEnabled("RECURLY_DEBUG");
  }

  @Override
  public HttpResponse execute(
      final String method,
      final String url,
      final Map<String, String> headers,
      final String body)
      throws IOException {
    if (!isValidMethod(method)) {
      throw new IllegalArgumentException(method + " is not a valid Recurly HTTP method");
    }

    final HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
    conn.setRequestMethod(method);
    conn.setConnectTimeout(timeoutMs);
    conn.setReadTimeout(timeoutMs);
    conn.setUseCaches(false);

    for (final Map.Entry<String, String> header : headers.entrySet()) {
      conn.setRequestProperty(header.getKey(), header.getValue());
    }

    if (body != null) {
      conn.setDoOutput(true);
      conn.getOutputStream().write(body.getBytes(StandardCharsets.UTF_8));
      conn.getOutputStream().close();
    }

    if (debugLogging) {
      System.err.println("--> " + method + " " + url);
    }

    final int statusCode = conn.getResponseCode();

    final Map<String, String> responseHeaders = new HashMap<>();
    for (final Map.Entry<String, List<String>> entry : conn.getHeaderFields().entrySet()) {
      if (entry.getKey() != null && !entry.getValue().isEmpty()) {
        responseHeaders.put(
            entry.getKey().toLowerCase(), entry.getValue().get(entry.getValue().size() - 1));
      }
    }

    final InputStream responseStream =
        statusCode >= 400 ? conn.getErrorStream() : conn.getInputStream();
    final byte[] responseBodyBytes = responseStream != null ? readAllBytes(responseStream) : new byte[0];

    if (debugLogging) {
      System.err.println("<-- " + statusCode + " " + url);
    }

    return new HttpResponse(statusCode, responseHeaders, responseBodyBytes);
  }

  private static boolean isValidMethod(final String method) {
    switch (method) {
      case "HEAD":
      case "GET":
      case "POST":
      case "PUT":
      case "DELETE":
        return true;
      default:
        return false;
    }
  }

  private static byte[] readAllBytes(final InputStream is) throws IOException {
    final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    final byte[] chunk = new byte[8192];
    int n;
    while ((n = is.read(chunk)) != -1) {
      buffer.write(chunk, 0, n);
    }
    return buffer.toByteArray();
  }

  private static boolean envEnabled(final String envVar) {
    return "true".equals(System.getenv(envVar));
  }
}
