package com.recurly.v3.http;

import com.recurly.v3.internal.Utils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/**
 * Default {@link HttpAdapter} backed by {@link HttpURLConnection}.
 *
 * <p>{@code timeoutMs} bounds the connect and read phases only. {@link HttpURLConnection} has no
 * write-timeout API, so a stalled request-body upload is not bounded by {@code timeoutMs} and can
 * block until the underlying OS-level TCP timeout is reached. Implement a custom {@link
 * HttpAdapter} (e.g. using OkHttp) if your SLA requires a bounded write phase.
 */
public class DefaultHttpAdapter implements HttpAdapter {
  private static final int DEFAULT_TIMEOUT_MS = 10_000;

  private final int timeoutMs;

  public DefaultHttpAdapter() {
    this(DEFAULT_TIMEOUT_MS);
  }

  public DefaultHttpAdapter(final int timeoutMs) {
    this.timeoutMs = timeoutMs;
  }

  @Override
  public HttpResponse execute(
      final String method,
      final String url,
      final Map<String, String> headers,
      final String body)
      throws IOException {
    final boolean debug = Utils.envEnabled("RECURLY_INSECURE") && Utils.envEnabled("RECURLY_DEBUG");
    if (debug) {
      System.out.println("--> " + method + " " + url);
    }
    final long startMs = System.currentTimeMillis();

    HttpURLConnection connection = null;
    boolean success = false;
    try {
      connection = (HttpURLConnection) new URL(url).openConnection();
      connection.setRequestMethod(method);
      connection.setConnectTimeout(timeoutMs);
      connection.setReadTimeout(timeoutMs);
      connection.setInstanceFollowRedirects(true);

      boolean callerSetAcceptEncoding = false;
      for (final Map.Entry<String, String> header : headers.entrySet()) {
        connection.setRequestProperty(header.getKey(), header.getValue());
        if ("Accept-Encoding".equalsIgnoreCase(header.getKey())) {
          callerSetAcceptEncoding = true;
        }
      }
      if (!callerSetAcceptEncoding) {
        connection.setRequestProperty("Accept-Encoding", "gzip");
      }

      if (body != null || "POST".equals(method) || "PUT".equals(method)) {
        connection.setDoOutput(true);
        final byte[] bodyBytes = body != null ? body.getBytes(StandardCharsets.UTF_8) : new byte[0];
        try (final OutputStream out = connection.getOutputStream()) {
          out.write(bodyBytes);
        }
      }

      final int statusCode = connection.getResponseCode();

      final Map<String, String> responseHeaders = new HashMap<>();
      for (final Map.Entry<String, List<String>> entry : connection.getHeaderFields().entrySet()) {
        final String key = entry.getKey();
        if (key != null && !entry.getValue().isEmpty()) {
          responseHeaders.put(key, entry.getValue().get(0));
        }
      }

      final InputStream inputStream;
      if ("HEAD".equals(method)) {
        inputStream = null;
      } else {
        inputStream = statusCode >= 400 ? connection.getErrorStream() : connection.getInputStream();
      }

      final String contentEncoding = findHeaderIgnoreCase(responseHeaders, "Content-Encoding");
      final boolean gzipEncoded = contentEncoding != null && "gzip".equalsIgnoreCase(contentEncoding.trim());

      final byte[] responseBodyBytes;
      if (inputStream == null) {
        responseBodyBytes = new byte[0];
      } else {
        try (final InputStream rawStream = inputStream;
            final InputStream is = gzipEncoded ? new GZIPInputStream(rawStream) : rawStream) {
          responseBodyBytes = readAllBytes(is);
        }
      }

      if (gzipEncoded) {
        removeHeaderIgnoreCase(responseHeaders, "Content-Encoding");
        removeHeaderIgnoreCase(responseHeaders, "Content-Length");
      }

      if (debug) {
        System.out.println(
            "<-- " + statusCode + " " + url + " (" + (System.currentTimeMillis() - startMs) + "ms)");
      }

      final HttpResponse response = new HttpResponse(statusCode, responseHeaders, responseBodyBytes);
      success = true;
      return response;
    } finally {
      if (!success && connection != null) {
        connection.disconnect();
      }
    }
  }

  private static String findHeaderIgnoreCase(final Map<String, String> headers, final String name) {
    for (final Map.Entry<String, String> entry : headers.entrySet()) {
      if (entry.getKey().equalsIgnoreCase(name)) {
        return entry.getValue();
      }
    }
    return null;
  }

  private static void removeHeaderIgnoreCase(final Map<String, String> headers, final String name) {
    headers.keySet().removeIf(key -> key.equalsIgnoreCase(name));
  }

  private static byte[] readAllBytes(final InputStream inputStream) throws IOException {
    final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    final byte[] chunk = new byte[8192];
    int n;
    while ((n = inputStream.read(chunk)) != -1) {
      buffer.write(chunk, 0, n);
    }
    return buffer.toByteArray();
  }

  
}
