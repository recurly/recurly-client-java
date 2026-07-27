package com.recurly.v3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RequestOptions {
  private final String idempotencyKey;
  private final Map<String, String> headers;

  private RequestOptions(final Builder builder) {
    this.idempotencyKey = builder.idempotencyKey;
    this.headers = Collections.unmodifiableMap(new HashMap<>(builder.headers));
  }

  public static Builder builder() {
    return new Builder();
  }

  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }

  public static class Builder {
    private String idempotencyKey;
    private Map<String, String> headers = new HashMap<>();

    private Builder() {}

    public Builder idempotencyKey(final String idempotencyKey) {
      this.idempotencyKey = idempotencyKey;
      return this;
    }

    public Builder header(final String name, final String value) {
      this.headers.put(name, value);
      return this;
    }

    public RequestOptions build() {
      return new RequestOptions(this);
    }
  }
}
