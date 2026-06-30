package com.recurly.v3;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.exception.ExceptionFactory;
import com.recurly.v3.http.DefaultHttpAdapter;
import com.recurly.v3.http.HttpAdapter;
import com.recurly.v3.http.HttpResponse;
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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public abstract class BaseClient {
  private static final List<String> BINARY_TYPES = Arrays.asList("application/pdf");
  private static final Set<String> VALID_METHODS =
      new HashSet<>(Arrays.asList("GET", "POST", "PUT", "DELETE", "HEAD"));
  private static final String USER_AGENT = buildUserAgent();

  private static final JsonSerializer jsonSerializer = new JsonSerializer();
  private static final FileSerializer fileSerializer = new FileSerializer();

  private final String authToken;
  private final HttpAdapter httpAdapter;
  private String apiUrl;

  protected BaseClient(final String apiKey) {
    this(apiKey, new ClientOptions());
  }

  protected BaseClient(final String apiKey, final ClientOptions clientOptions) {
    this.authToken = buildAuthToken(validateApiKey(apiKey));
    this.apiUrl = clientOptions.getBaseUrl();
    this.httpAdapter =
        clientOptions.getHttpAdapter() != null
            ? clientOptions.getHttpAdapter()
            : new DefaultHttpAdapter();
  }

  private static String validateApiKey(final String apiKey) {
    if (apiKey == null || apiKey.isEmpty()) {
      throw new IllegalArgumentException("apiKey cannot be null or empty");
    }
    return apiKey;
  }

  private static String buildAuthToken(final String apiKey) {
    return "Basic "
        + Base64.getEncoder()
            .encodeToString((apiKey + ":").getBytes(StandardCharsets.ISO_8859_1));
  }

  private Map<String, String> buildHeaders() {
    final Map<String, String> headers = new HashMap<>();
    headers.put("Authorization", authToken);
    headers.put("Accept", "application/vnd.recurly." + Client.API_VERSION);
    headers.put("Content-Type", "application/json");
    headers.put("User-Agent", USER_AGENT);
    return headers;
  }

  private String buildUrl(final String path, final HashMap<String, Object> queryParams) {
    if (queryParams == null || queryParams.isEmpty()) {
      return this.apiUrl + path;
    }

    final StringBuilder sb = new StringBuilder(this.apiUrl).append(path);
    boolean first = true;

    for (final Map.Entry<String, Object> param : queryParams.entrySet()) {
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
        sb.append(first ? "?" : "&")
            .append(param.getKey())
            .append("=")
            .append(URLEncoder.encode(stringValue, StandardCharsets.UTF_8.toString()));
        first = false;
      } catch (UnsupportedEncodingException ex) {
        throw new RecurlyException(ex.getCause());
      }
    }

    return sb.toString();
  }

  private static boolean isSuccessful(final int statusCode) {
    return statusCode >= 200 && statusCode < 300;
  }

  protected static boolean envEnabled(final String envVar) {
    return "true".equals(System.getenv(envVar));
  }

  protected void makeRequest(final String method, final String url) {
    validateMethod(method);
    final String fullUrl = buildUrl(url, null);
    final Map<String, String> headers = buildHeaders();

    try {
      final HttpResponse response = httpAdapter.execute(method, fullUrl, headers, null);

      if (!isSuccessful(response.getStatusCode())) {
        throw jsonSerializer.deserializeError(
            new String(response.getBody(), StandardCharsets.UTF_8));
      }

      warnIfDeprecated(response.getHeaders());

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
    validateMethod(method);
    final String fullUrl = buildUrl(url, queryParams);
    final String bodyString = body != null ? jsonSerializer.serialize(body) : null;
    final Map<String, String> headers = buildHeaders();

    try {
      final HttpResponse response = httpAdapter.execute(method, fullUrl, headers, bodyString);

      final int statusCode = response.getStatusCode();
      final String contentType =
          response.getHeaders().getOrDefault("content-type", "application/json");

      if (!isSuccessful(statusCode)) {
        if (contentType.contains("application/json")) {
          throw jsonSerializer.deserializeError(
              new String(response.getBody(), StandardCharsets.UTF_8));
        } else {
          throw ExceptionFactory.getExceptionClass(response);
        }
      }

      warnIfDeprecated(response.getHeaders());

      if (BINARY_TYPES.stream().anyMatch(contentType::startsWith)) {
        return fileSerializer.deserialize(response.getBody(), resourceClass);
      } else {
        return jsonSerializer.deserialize(
            new String(response.getBody(), StandardCharsets.UTF_8), resourceClass);
      }

    } catch (IOException e) {
      throw new NetworkException(e);
    }
  }

  public int getRecordCount(final String url, final HashMap<String, Object> queryParams) {
    final String fullUrl = buildUrl(url, queryParams);
    final Map<String, String> headers = buildHeaders();

    try {
      final HttpResponse response = httpAdapter.execute("HEAD", fullUrl, headers, null);

      if (!isSuccessful(response.getStatusCode())) {
        throw jsonSerializer.deserializeError(
            new String(response.getBody(), StandardCharsets.UTF_8));
      }

      warnIfDeprecated(response.getHeaders());

      return Integer.parseInt(response.getHeaders().get("recurly-total-records"));

    } catch (IOException e) {
      throw new NetworkException(e);
    }
  }

  private static void validateMethod(final String method) {
    if (!VALID_METHODS.contains(method)) {
      throw new IllegalArgumentException(method + " is not a valid Recurly HTTP method");
    }
  }

  private String getSerializedEnumName(final Enum<?> e) {
    try {
      final Field f = e.getClass().getField(e.name());
      final SerializedName a = f.getAnnotation(SerializedName.class);
      return a == null ? null : a.value();
    } catch (NoSuchFieldException ignored) {
      return null;
    }
  }

  private void validatePathParameters(final HashMap<String, String> urlParams) {
    Map<String, String> invalidParams =
        urlParams.entrySet().stream()
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

  private void warnIfDeprecated(final Map<String, String> headers) {
    final String deprecated = headers.get("recurly-deprecated");

    if (deprecated != null && "TRUE".equalsIgnoreCase(deprecated)) {
      final String sunset = headers.get("recurly-sunset-date");
      System.out.println(
          "[recurly-client-java] WARNING: Your current API version \""
              + Client.API_VERSION
              + "\" is deprecated and will be sunset on "
              + sunset);
    }
  }

  private static String buildUserAgent() {
    final String defaultVersion = "3.?.?";
    final String defaultJvmInfo = "?";
    final Properties properties = new Properties();

    try {
      final InputStream inputStream = BaseClient.class.getResourceAsStream("/version.properties");
      if (inputStream != null) {
        properties.load(inputStream);
        final String version = properties.getProperty("version", defaultVersion);
        final String jvmInfo = System.getProperty("java.version", defaultJvmInfo);
        return String.format("Recurly/%s; java %s", version, jvmInfo);
      }
    } catch (Exception e) {
      System.out.println("[Recurly][WARNING] " + e.getStackTrace().toString());
    }

    System.out.println("[Recurly][WARNING] Could not set user agent header.");
    return String.format("Recurly/%s; java %s", defaultVersion, defaultJvmInfo);
  }
}
