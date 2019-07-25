package com.recurly.v3.http;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class HeaderInterceptor implements Interceptor {

  private final String apiVersion;
  private final String authToken;
  private static String USER_AGENT = buildUserAgent();

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
            .header("User-Agent", USER_AGENT);

    Request request = builder.build();
    return chain.proceed(request);
  }

  private static String buildUserAgent() {
    final String defaultVersion = "3.?.?";
    final String defaultJvmInfo = "?";
    final Properties properties = new Properties();

    try {
      final InputStream inputStream = HeaderInterceptor.class.getResourceAsStream("/version.properties");
      if (inputStream != null) {
        properties.load(inputStream);
        final String version = properties.getProperty("version", defaultVersion);
        final String jvmInfo = System.getProperty("java.version", defaultJvmInfo);
        return String.format("Recurly/%s; java %s", version, jvmInfo);
      }
    } catch (Exception e) {
      // TODO rethrow exception in strict-mode
      System.out.println("[Recurly][WARNING] " + e.getStackTrace().toString());
    }

    System.out.println("[Recurly][WARNING] Could not set user agent header.");
    return String.format("Recurly/%s; java %s", defaultVersion, defaultJvmInfo);
  }
}
