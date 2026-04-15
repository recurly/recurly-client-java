package com.recurly.v3.http;

import java.util.Collections;
import java.util.Map;

public class SimpleHttpRequest {
  private final String method;
  private final String url;
  private final Map<String, String> headers;
  private final byte[] body;

  public SimpleHttpRequest(String method, String url, Map<String, String> headers, byte[] body) {
    this.method = method;
    this.url = url;
    this.headers = Collections.unmodifiableMap(headers);
    this.body = body;
  }

  public String getMethod() {
    return method;
  }

  public String getUrl() {
    return url;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }

  public byte[] getBody() {
    return body;
  }
}
