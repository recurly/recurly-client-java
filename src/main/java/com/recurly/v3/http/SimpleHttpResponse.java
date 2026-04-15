package com.recurly.v3.http;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SimpleHttpResponse {
  private final int statusCode;
  private final Map<String, List<String>> headers;
  private final byte[] body;

  static final String REQUEST_ID_HEADER = "X-Request-Id";

  public SimpleHttpResponse(int statusCode, Map<String, List<String>> headers, byte[] body) {
    this.statusCode = statusCode;
    this.headers = Collections.unmodifiableMap(headers);
    this.body = body;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public byte[] getBody() {
    return body;
  }

  public Map<String, List<String>> getHeaders() {
    return headers;
  }

  public String getHeader(String name) {
    for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
      if (entry.getKey() != null
          && entry.getKey().equalsIgnoreCase(name)
          && !entry.getValue().isEmpty()) {
        return entry.getValue().get(0);
      }
    }
    return null;
  }

  public boolean isSuccessful() {
    return statusCode >= 200 && statusCode < 300;
  }

  public String getRequestId() {
    String requestId = this.getHeader(REQUEST_ID_HEADER);
    return requestId == null ? "none" : requestId;
  }
}
