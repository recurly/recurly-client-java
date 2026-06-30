package com.recurly.v3.fixtures;

import com.recurly.v3.ClientOptions;
import com.recurly.v3.http.HttpAdapter;
import com.recurly.v3.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public final class HttpTestFixtures {

  private HttpTestFixtures() {}

  public static HttpResponse jsonResponse(final int statusCode, final String body) {
    final Map<String, String> headers = new HashMap<>();
    headers.put("content-type", "application/json; charset=utf-8");
    return new HttpResponse(statusCode, headers, body.getBytes(StandardCharsets.UTF_8));
  }

  public static MockClient mockClientWith(final HttpAdapter adapter) {
    final ClientOptions options = ClientOptions.builder().httpAdapter(adapter).build();
    return new MockClient("apiKey", options);
  }
}
