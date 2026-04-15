package com.recurly.v3;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.exception.ExceptionFactory;
import com.recurly.v3.http.HttpTransport;
import com.recurly.v3.http.HttpURLConnectionTransport;
import com.recurly.v3.http.SimpleHttpRequest;
import com.recurly.v3.http.SimpleHttpResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public abstract class BaseClient {
  private static final List<String> BINARY_TYPES = Arrays.asList("application/pdf");

  private static final JsonSerializer jsonSerializer = new JsonSerializer();
  private static final FileSerializer fileSerializer = new FileSerializer();
  private static final String USER_AGENT = buildUserAgent();

  private final String apiKey;
  private final HttpTransport transport;
  private String apiUrl;

  protected BaseClient(final String apiKey) {
    this(apiKey, newTransport(), new ClientOptions());
  }

  protected BaseClient(final String apiKey, final ClientOptions clientOptions) {
    this(apiKey, newTransport(), clientOptions);
  }

  protected BaseClient(final String apiKey, final HttpTransport transport, final ClientOptions clientOptions) {
    this.apiKey = validateApiKey(apiKey);
    this.transport = transport;
    this.apiUrl = clientOptions.getBaseUrl();
  }

  private static String validateApiKey(final String apiKey) {
    if (apiKey == null || apiKey.isEmpty()) {
      throw new IllegalArgumentException("apiKey cannot be null or empty");
    }
    return apiKey;
  }

  private static HttpTransport newTransport() {
    return new HttpURLConnectionTransport();
  }

  protected static boolean envEnabled(final String envVar) {
    return "true".equals(System.getenv(envVar));
  }

  private String buildAuthorizationHeader() {
    return "Basic " + Base64.getEncoder()
        .encodeToString((apiKey + ":").getBytes(StandardCharsets.UTF_8));
  }

  private static String buildUserAgent() {
    final String defaultVersion = "3.?.?";
    final String defaultJvmInfo = "?";
    final Properties properties = new Properties();

    try {
      final InputStream inputStream =
          BaseClient.class.getResourceAsStream("/version.properties");
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

  private static String getMimeType(final String contentTypeHeader) {
    if (contentTypeHeader == null) return "";
    final int idx = contentTypeHeader.indexOf(';');
    return idx < 0 ? contentTypeHeader.trim() : contentTypeHeader.substring(0, idx).trim();
  }

  protected void makeRequest(final String method, final String url) {
    final SimpleHttpRequest request = buildRequest(method, url, null, null);

    try {
      final SimpleHttpResponse response = transport.execute(request);

      if (!response.isSuccessful()) {
        final String responseString = new String(response.getBody(), StandardCharsets.UTF_8);
        if (envEnabled("RECURLY_INSECURE") && envEnabled("RECURLY_DEBUG")) {
          System.out.println(responseString);
        }
        throw jsonSerializer.deserializeError(responseString);
      }

      if (envEnabled("RECURLY_INSECURE") && envEnabled("RECURLY_DEBUG")) {
        for (Map.Entry<String, List<String>> entry : response.getHeaders().entrySet()) {
          if (entry.getKey() != null) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
          }
        }
      }

      this.warnIfDeprecated(response);

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
    final SimpleHttpRequest request = buildRequest(method, url, body, queryParams);

    try {
      final SimpleHttpResponse response = transport.execute(request);

      final byte[] responseBodyBytes = response.getBody();
      final String contentTypeHeader = response.getHeader("Content-Type");
      final String mimeType = getMimeType(contentTypeHeader);

      if (!response.isSuccessful()) {
        if ("application/json".equals(mimeType)) {
          throw jsonSerializer.deserializeError(
              new String(responseBodyBytes, StandardCharsets.UTF_8));
        } else {
          throw ExceptionFactory.getExceptionClass(response);
        }
      }

      this.warnIfDeprecated(response);

      if (BINARY_TYPES.contains(mimeType)) {
        return fileSerializer.deserialize(responseBodyBytes, resourceClass);
      } else {
        return jsonSerializer.deserialize(
            new String(responseBodyBytes, StandardCharsets.UTF_8), resourceClass);
      }

    } catch (IOException e) {
      throw new NetworkException(e);
    }
  }

  public int getRecordCount(final String url, final HashMap<String, Object> queryParams) {
    final SimpleHttpRequest request = buildRequest("HEAD", url, null, queryParams);

    try {
      final SimpleHttpResponse response = transport.execute(request);

      if (!response.isSuccessful()) {
        final String responseString = new String(response.getBody(), StandardCharsets.UTF_8);
        throw jsonSerializer.deserializeError(responseString);
      }

      this.warnIfDeprecated(response);

      final String count = response.getHeader("Recurly-Total-Records");
      return Integer.parseInt(count);

    } catch (IOException e) {
      throw new NetworkException(e);
    }
  }

  private String getSerializedEnumName(Enum<?> e) {
    try {
      Field f = e.getClass().getField(e.name());
      SerializedName a = f.getAnnotation(SerializedName.class);
      return a == null ? null : a.value();
    } catch (NoSuchFieldException ignored) {
      return null;
    }
  }

  private SimpleHttpRequest buildRequest(
      final String method,
      final String url,
      final Request body,
      final HashMap<String, Object> queryParams) {

    final StringBuilder urlBuilder = new StringBuilder(this.apiUrl).append(url);

    if (queryParams != null) {
      boolean first = true;
      for (Map.Entry<String, Object> param : queryParams.entrySet()) {
        final Object value = param.getValue();

        if (value == null) continue;

        final String stringValue;
        if (value instanceof String) {
          stringValue = value.toString();
        } else if (value instanceof ZonedDateTime) {
          stringValue = DateTimeFormatter.ISO_OFFSET_DATE_TIME.format((ZonedDateTime) value);
        } else if (value instanceof Integer) {
          stringValue = Integer.toString((Integer) value);
        } else if (value instanceof Float) {
          stringValue = Float.toString((Float) value);
        } else if (value instanceof Double) {
          stringValue = Double.toString((Double) value);
        } else if (value instanceof Long) {
          stringValue = Long.toString((Long) value);
        } else if (value instanceof Enum) {
          stringValue = getSerializedEnumName((Enum<?>) value);
        } else {
          stringValue = value.toString();
        }

        if (stringValue == null) continue;

        try {
          urlBuilder.append(first ? "?" : "&");
          first = false;
          urlBuilder.append(URLEncoder.encode(param.getKey(), StandardCharsets.UTF_8.name()));
          urlBuilder.append("=");
          urlBuilder.append(URLEncoder.encode(stringValue, StandardCharsets.UTF_8.name()));
        } catch (UnsupportedEncodingException e) {
          throw new RecurlyException(e.getCause());
        }
      }
    }

    final String requestUrl = urlBuilder.toString();

    if (envEnabled("RECURLY_INSECURE") && envEnabled("RECURLY_DEBUG")) {
      System.out.println("Performing " + method + " request to " + requestUrl);
    }

    final Map<String, String> headers = new HashMap<>();
    headers.put("Authorization", buildAuthorizationHeader());
    headers.put("Accept", "application/vnd.recurly." + Client.API_VERSION);
    headers.put("Content-Type", "application/json");
    headers.put("User-Agent", USER_AGENT);

    final byte[] bodyBytes;
    switch (method) {
      case "HEAD":
      case "GET":
      case "DELETE":
        bodyBytes = null;
        break;
      case "POST":
      case "PUT":
        final String jsonBody = jsonSerializer.serialize(body);
        bodyBytes = (jsonBody != null && !jsonBody.isEmpty())
            ? jsonBody.getBytes(StandardCharsets.UTF_8)
            : new byte[0];
        break;
      default:
        throw new IllegalArgumentException(method + " is not a valid Recurly HTTP method");
    }

    return new SimpleHttpRequest(method, requestUrl, headers, bodyBytes);
  }

  private void validatePathParameters(final HashMap<String, String> urlParams) {
    Map<String, String> invalidParams = urlParams.entrySet().stream()
        .filter(p -> p.getValue() == null || p.getValue().trim().isEmpty())
        .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
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
    final Pattern p = Pattern.compile("(\\{[A-Za-z|_]*\\})");
    final Matcher m = p.matcher(path);

    while (m.find()) {
      final String key = m.group(1).replace("{", "").replace("}", "");
      try {
        final String value =
            URLEncoder.encode(urlParams.get(key), StandardCharsets.UTF_8.toString());
        path = path.replace(m.group(1), value);
      } catch (UnsupportedEncodingException ex) {
        throw new RecurlyException(ex.getCause());
      }
    }

    return path.replaceAll("\\{", "").replaceAll("\\}", "");
  }

  public void _setApiUrl(final String uri) {
    System.out.println(
        "[SECURITY WARNING] _setApiUrl is for testing only and not supported in production.");

    if (envEnabled("RECURLY_INSECURE")) {
      this.apiUrl = uri;
    } else {
      System.out.println(
          "ApiUrl not changed. To change, set the environment variable RECURLY_INSECURE to true");
    }
  }

  public String getApiUrl() {
    return this.apiUrl;
  }

  private void warnIfDeprecated(SimpleHttpResponse response) {
    final String deprecated = response.getHeader("Recurly-Deprecated");

    if (deprecated != null && deprecated.toUpperCase() == "TRUE") {
      final String sunset = response.getHeader("Recurly-Sunset-Date");

      final String warning =
          "[recurly-client-java] WARNING: Your current API version \""
              + Client.API_VERSION
              + "\" is deprecated and will be sunset on "
              + sunset;

      System.out.println(warning);
    }
  }
}
