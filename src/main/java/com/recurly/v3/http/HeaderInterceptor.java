package com.recurly.v3.http;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class HeaderInterceptor implements Interceptor {

  private final String apiVersion;
  private final String authToken;

  public HeaderInterceptor(final String authToken, final String apiVersion) {
    this.apiVersion = apiVersion;
    this.authToken = authToken;
  }

  public Response intercept(final Chain chain) throws IOException {
    Request original = chain.request();

    Request.Builder builder =
        original
            .newBuilder()
            .header("Authorization", authToken)
            .header("Accept", "application/vnd.recurly." + apiVersion)
            .header("Content-Type", "application/json")
            .header("User-Agent", userAgent());

    Request request = builder.build();
    return chain.proceed(request);
  }

  private String userAgent() {
    // TODO: pull version from pom.xml
    final String version = "3.0.0-beta-1";
    return String.format("Recurly/%s; Java V3 Client", version);
  }
}
