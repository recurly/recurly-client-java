package com.recurly.v3.http;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HttpResponse {
  private final int statusCode;
  private final Map<String, String> headers;
  private final byte[] body;

  /**
   * Constructs an immutable HTTP response snapshot. The {@code body} array is defensively copied;
   * callers may not observe mutations to the original array through this object.
   *
   * @param headers response headers, keyed by name (case-insensitive). Only one value per name is
   *     supported; if a server sends multiple values for the same header name, pass the first
   *     value.
   */
  public HttpResponse(final int statusCode, final Map<String, String> headers, final byte[] body) {
    Objects.requireNonNull(headers, "headers must not be null");
    Objects.requireNonNull(body, "body must not be null");
    this.statusCode = statusCode;
    final Map<String, String> normalized = new HashMap<>();
    headers.forEach((k, v) -> normalized.put(k.toLowerCase(), v));
    this.headers = Collections.unmodifiableMap(normalized);
    this.body = body.clone();
  }

  public int getStatusCode() {
    return statusCode;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }

  /**
   * Returns a copy of the response body. Mutations to the returned array do not affect this object.
   */
  public byte[] getBody() {
    return body.clone();
  }
}
