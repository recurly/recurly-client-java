package com.recurly.v3;

import com.recurly.v3.http.HeaderInterceptor;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import okhttp3.*;
import okhttp3.Request.Builder;
import okhttp3.logging.HttpLoggingInterceptor;
import org.joda.time.DateTime;

public abstract class BaseClient {
  private static final String API_URL = "https://v3.recurly.com";
  private static final List<String> BINARY_TYPES = Arrays.asList("application/pdf");

  private static OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
  private static final JsonSerializer jsonSerializer = new JsonSerializer();
  private static final FileSerializer fileSerializer = new FileSerializer();
  private final String apiKey;
  private final OkHttpClient client;
  private String apiUrl;

  protected BaseClient(final String apiKey) {
    this(apiKey, newHttpClient(apiKey));
  }

  protected BaseClient(final String apiKey, final OkHttpClient client) {
    if (apiKey == null || apiKey.isEmpty()) {
      throw new IllegalArgumentException("apiKey cannot be null or empty");
    }

    this.apiKey = apiKey;
    this.client = client;
    this.apiUrl = API_URL;
  }

  private static OkHttpClient newHttpClient(final String apiKey) {
    final String authToken = Credentials.basic(apiKey, "");
    final HeaderInterceptor headerInterceptor =
        new HeaderInterceptor(authToken, Client.API_VERSION);

    if (!httpClientBuilder.interceptors().contains(headerInterceptor)) {
      httpClientBuilder.addInterceptor(headerInterceptor);
    }

    if ("true".equals(System.getenv("RECURLY_INSECURE"))
        && "true".equals(System.getenv("RECURLY_DEBUG"))) {
      final HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
      logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
      httpClientBuilder.addInterceptor(logging);
    }

    return httpClientBuilder.build();
  }

  protected void makeRequest(final String method, final String url) {
    final okhttp3.Request request = buildRequest(method, url, null, null);

    try (final Response response = client.newCall(request).execute()) {
      if (!response.isSuccessful()) {
        String responseString = response.body().string();
        if ("true".equals(System.getenv("RECURLY_INSECURE"))
            && "true".equals(System.getenv("RECURLY_DEBUG"))) {
          System.out.println(responseString);
        }
        throw jsonSerializer.deserializeError(responseString);
      }

      final Headers responseHeaders = response.headers();

      if ("true".equals(System.getenv("RECURLY_INSECURE"))
          && "true".equals(System.getenv("RECURLY_DEBUG"))) {
        for (int i = 0; i < responseHeaders.size(); i++) {
          System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
        }
      }

      this.warnIfDeprecated(responseHeaders);

    } catch (IOException e) {
      throw new NetworkException(e);
    }
  }

  protected <T> T makeRequest(final String method, final String url, final Type resourceClass) {
    return makeRequest(method, url, null, null, resourceClass);
  }

  protected <T> T makeRequest(
      final String method, final String url, final Request body, final Type resourceClass) {
    return makeRequest(method, url, body, null, resourceClass);
  }

  protected <T> T makeRequest(
      final String method,
      final String url,
      final HashMap<String, Object> queryParams,
      final Type resourceClass) {
    return makeRequest(method, url, null, queryParams, resourceClass);
  }

  protected <T> T makeRequest(
      final String method,
      final String url,
      final Request body,
      final HashMap<String, Object> queryParams,
      final Type resourceClass) {
    final okhttp3.Request request = buildRequest(method, url, body, queryParams);

    try (final Response response = client.newCall(request).execute()) {

      final Headers responseHeaders = response.headers();
      final ResponseBody responseBody = response.body();

      if (!response.isSuccessful()) {
        throw jsonSerializer.deserializeError(responseBody.string());
      }

      this.warnIfDeprecated(responseHeaders);

      MediaType contentType = responseBody.contentType();
      if (BINARY_TYPES.contains(contentType.type() + "/" + contentType.subtype())) {
        return fileSerializer.deserialize(responseBody.bytes(), resourceClass);
      } else {
        return jsonSerializer.deserialize(responseBody.string(), resourceClass);
      }

    } catch (IOException e) {
      throw new NetworkException(e);
    }
  }

  public int getRecordCount(final String url, final HashMap<String, Object> queryParams) {
    final okhttp3.Request request = buildRequest("HEAD", url, null, queryParams);

    try (final Response response = client.newCall(request).execute()) {

      final Headers responseHeaders = response.headers();
      final ResponseBody responseBody = response.body();

      if (!response.isSuccessful()) {
        throw jsonSerializer.deserializeError(responseBody.string());
      }

      this.warnIfDeprecated(responseHeaders);

      String count = responseHeaders.get("Recurly-Total-Records");
      return Integer.parseInt(count);

    } catch (IOException e) {
      throw new NetworkException(e);
    }
  }

  private okhttp3.Request buildRequest(
      final String method,
      final String url,
      final Request body,
      final HashMap<String, Object> queryParams) {
    final HttpUrl.Builder httpBuilder = HttpUrl.parse(this.apiUrl + url).newBuilder();

    final RequestBody requestBody =
        RequestBody.create(
            MediaType.parse("application/json; charset=utf-8"), jsonSerializer.serialize(body));

    if (queryParams != null) {
      for (Map.Entry<String, Object> param : queryParams.entrySet()) {
        final Object value = param.getValue();
        final String stringValue;

        if (value == null) {
          continue;
        } else if (value instanceof String) {
          stringValue = value.toString();
        } else if (value instanceof DateTime) {
          final DateTime dt = (DateTime) value;
          stringValue = value.toString();
        } else if (value instanceof Integer) {
          stringValue = Integer.toString((Integer) value);
        } else if (value instanceof Float) {
          stringValue = Float.toString((Float) value);
        } else if (value instanceof Double) {
          stringValue = Double.toString((Double) value);
        } else if (value instanceof Long) {
          stringValue = Long.toString((Long) value);
        } else {
          stringValue = value.toString();
        }

        httpBuilder.addQueryParameter(param.getKey(), stringValue);
      }
    }

    final HttpUrl requestUrl = httpBuilder.build();

    if ("true".equals(System.getenv("RECURLY_INSECURE"))
        && "true".equals(System.getenv("RECURLY_DEBUG"))) {
      System.out.println("Performing " + method + " request to " + requestUrl);
    }

    final Builder requestBuilder = new okhttp3.Request.Builder().url(requestUrl);

    switch (method) {
      case "HEAD":
        return requestBuilder.head().build();

      case "GET":
        return requestBuilder.build();

      case "POST":
        return requestBuilder.post(requestBody).build();

      case "PUT":
        return requestBuilder.put(requestBody).build();

      case "DELETE":
        return requestBuilder.delete().build();

      default:
        String message = method + " is not a valid Recurly HTTP method";
        throw new IllegalArgumentException(message);
    }
  }

  private void validatePathParameters(final HashMap<String, String> urlParams) {
    Map<String, String> invalidParams = urlParams.entrySet().stream()
        .filter(p -> p.getValue() == null || p.getValue().trim().isEmpty())
        .collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
    if (!invalidParams.isEmpty()) {
      String invalidKeys = String.join(",", invalidParams.keySet());
      throw new RecurlyException(invalidKeys + " cannot be an empty value");
    }
  }

  protected String interpolatePath(final String path) {
    return interpolatePath(path, new HashMap<String, String>());
  }

  protected String interpolatePath(String path, final HashMap<String, String> urlParams) {
    validatePathParameters(urlParams);
    final Pattern p = Pattern.compile("\\{([A-Za-z|_]*)\\}");
    final Matcher m = p.matcher(path);

    while (m.find()) {
      final String key = m.group(1).replace("{", "").replace("}", "");
      final String value = urlParams.get(key);
      path = path.replace(m.group(1), value);
    }

    return path.replaceAll("\\{", "").replaceAll("\\}", "");
  }

  public void _setApiUrl(final String uri) {
    System.out.println(
        "[SECURITY WARNING] _setApiUrl is for testing only and not supported in production.");

    if ("true".equals(System.getenv("RECURLY_INSECURE"))) {
      this.apiUrl = uri;
    } else {
      System.out.println(
          "ApiUrl not changed. To change, set the environment variable RECURLY_INSECURE to true");
    }
  }

  public String getApiUrl() {
    return this.apiUrl;
  }

  private void warnIfDeprecated(Headers responseHeaders) {
    String deprecated = responseHeaders.get("Recurly-Deprecated");

    if (deprecated != null && deprecated.toUpperCase() == "TRUE") {
      String sunset = responseHeaders.get("Recurly-Sunset-Date");

      String warning =
          "[recurly-client-java] WARNING: Your current API version \""
              + Client.API_VERSION
              + "\" is deprecated and will be sunset on "
              + sunset;

      System.out.println(warning);
    }
  }
}
