package com.recurly.v3.http;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class HttpURLConnectionTransport implements HttpTransport {

  @Override
  public SimpleHttpResponse execute(SimpleHttpRequest request) throws IOException {
    final URL url = new URL(request.getUrl());
    final HttpURLConnection conn = (HttpURLConnection) url.openConnection();

    try {
      conn.setRequestMethod(request.getMethod());

      for (Map.Entry<String, String> header : request.getHeaders().entrySet()) {
        conn.setRequestProperty(header.getKey(), header.getValue());
      }

      final byte[] body = request.getBody();
      if (body != null) {
        conn.setDoOutput(true);
        final OutputStream out = conn.getOutputStream();
        try {
          if (body.length > 0) {
            out.write(body);
          }
        } finally {
          out.close();
        }
      }

      final int statusCode = conn.getResponseCode();
      final Map<String, List<String>> headers = conn.getHeaderFields();

      final InputStream inputStream;
      if (statusCode >= 200 && statusCode < 300) {
        inputStream = conn.getInputStream();
      } else {
        final InputStream errorStream = conn.getErrorStream();
        inputStream = (errorStream != null) ? errorStream : conn.getInputStream();
      }

      final byte[] responseBody = readAllBytes(inputStream);

      return new SimpleHttpResponse(statusCode, headers, responseBody);
    } finally {
      conn.disconnect();
    }
  }

  private static byte[] readAllBytes(InputStream inputStream) throws IOException {
    if (inputStream == null) return new byte[0];
    final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    final byte[] chunk = new byte[8192];
    int n;
    try {
      while ((n = inputStream.read(chunk)) != -1) {
        buffer.write(chunk, 0, n);
      }
    } finally {
      inputStream.close();
    }
    return buffer.toByteArray();
  }
}
