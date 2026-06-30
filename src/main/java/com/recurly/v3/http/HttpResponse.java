package com.recurly.v3.http;

import java.util.Map;

public class HttpResponse {
  private final int statusCode;
  private final Map<String, String> headers;
  private final byte[] body;

  public HttpResponse(final int statusCode, final Map<String, String> headers, final byte[] body) {
    this.statusCode = statusCode;
    this.headers = headers;
    this.body = body;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }

  public byte[] getBody() {
    return body;
  }
}
