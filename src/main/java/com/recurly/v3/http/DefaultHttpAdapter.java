package com.recurly.v3.http;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;

public class DefaultHttpAdapter implements HttpAdapter {
  private static final int DEFAULT_TIMEOUT_MS = 60_000;

  private final OkHttpClient httpClient;

  public DefaultHttpAdapter() {
    this(DEFAULT_TIMEOUT_MS);
  }

  public DefaultHttpAdapter(final int timeoutMs) {
    final OkHttpClient.Builder builder =
        new OkHttpClient.Builder()
            .connectTimeout(timeoutMs, TimeUnit.MILLISECONDS)
            .readTimeout(timeoutMs, TimeUnit.MILLISECONDS)
            .writeTimeout(timeoutMs, TimeUnit.MILLISECONDS);

    if (envEnabled("RECURLY_INSECURE") && envEnabled("RECURLY_DEBUG")) {
      final HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
      logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
      builder.addInterceptor(logging);
    }

    this.httpClient = builder.build();
  }

  @Override
  public HttpResponse execute(
      final String method,
      final String url,
      final Map<String, String> headers,
      final String body)
      throws IOException {
    final Request.Builder requestBuilder = new Request.Builder().url(url);

    for (final Map.Entry<String, String> header : headers.entrySet()) {
      requestBuilder.header(header.getKey(), header.getValue());
    }

    final RequestBody requestBody =
        body != null
            ? RequestBody.create(body, MediaType.parse("application/json; charset=utf-8"))
            : RequestBody.create(new byte[0]);

    switch (method) {
      case "HEAD":
        requestBuilder.head();
        break;
      case "GET":
        requestBuilder.get();
        break;
      case "POST":
        requestBuilder.post(requestBody);
        break;
      case "PUT":
        requestBuilder.put(requestBody);
        break;
      case "DELETE":
        requestBuilder.delete();
        break;
      default:
        throw new IllegalArgumentException(method + " is not a valid Recurly HTTP method");
    }

    try (final Response response = httpClient.newCall(requestBuilder.build()).execute()) {
      final int statusCode = response.code();

      final Map<String, String> responseHeaders = new HashMap<>();
      final Headers okHeaders = response.headers();
      for (int i = 0; i < okHeaders.size(); i++) {
        responseHeaders.put(okHeaders.name(i).toLowerCase(), okHeaders.value(i));
      }

      final ResponseBody responseBody = response.body();
      final byte[] responseBodyBytes = responseBody != null ? responseBody.bytes() : new byte[0];

      return new HttpResponse(statusCode, responseHeaders, responseBodyBytes);
    }
  }

  private static boolean envEnabled(final String envVar) {
    return "true".equals(System.getenv(envVar));
  }
}
