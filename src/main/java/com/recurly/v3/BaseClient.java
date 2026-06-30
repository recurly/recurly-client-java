package com.recurly.v3;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.exception.ExceptionFactory;
import com.recurly.v3.http.HttpAdapter;
import com.recurly.v3.http.HttpResponse;
import com.recurly.v3.internal.Utils;
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
    this(apiKey, ClientOptions.builder().build());
  }

  protected BaseClient(final String apiKey, final ClientOptions clientOptions) {
    this.authToken = buildAuthToken(validateApiKey(apiKey));
    this.apiUrl = clientOptions.getBaseUrl();
    this.httpAdapter = clientOptions.getHttpAdapter();
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
    return buildHeaders(null);
  }

  private Map<String, String> buildHeaders(final RequestOptions options) {
    final Map<String, String> headers = new HashMap<>();

    if (options != null) {
      headers.putAll(options.getHeaders());
      if (options.getIdempotencyKey() != null) {
        headers.put("idempotency-key", options.getIdempotencyKey());
      }
    }

    headers.put("authorization", authToken);
    headers.put("accept", "application/vnd.recurly." + Client.API_VERSION);
    headers.put("content-type", "application/json");
    headers.put("user-agent", USER_AGENT);

    return headers;
  }

  private String buildUrl(final String path, final HashMap<String, Object> queryParams) {
    if (queryParams == null || queryParams.isEmpty()) {
      return this.apiUrl + path;
    }

    final StringBuilder sb = new StringBuilder(this.apiUrl).append(path);
    boolean first = !path.contains("?");

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
      } catch (UnsupportedEncodingException ex) {
        throw new RecurlyException(ex.getCause());
      }
      first = false;
    }

    return sb.toString();
  }

  private static boolean isSuccessful(final int statusCode) {
    return statusCode >= 200 && statusCode < 300;
  }

  

  protected void makeRequest(final String method, final String url) {
    makeRequest(method, url, (RequestOptions) null);
  }

  protected void makeRequest(final String method, final String url, final RequestOptions options) {
    validateMethod(method);
    final String fullUrl = buildUrl(url, null);
    final Map<String, String> headers = buildHeaders(options);

    try {
      final HttpResponse response = httpAdapter.execute(method, fullUrl, headers, null);

      if (!isSuccessful(response.getStatusCode())) {
        throwForErrorResponse(response);
      }

      warnIfDeprecated(response.getHeaders());

    } catch (IOException e) {
      throw new NetworkException(e);
    }
  }

  protected <T> T makeRequest(final String method, final String url, final Type resourceClass) {
    return makeRequest(method, url, null, null, null, resourceClass);
  }

  protected <T> T makeRequest(final String method, final String url, final RequestOptions options, final Type resourceClass) {
    return makeRequest(method, url, null, null, options, resourceClass);
  }

  protected <T> T makeRequest(
      final String method, final String url, final Request body, final Type resourceClass) {
    return makeRequest(method, url, body, null, null, resourceClass);
  }

  protected <T> T makeRequest(
      final String method, final String url, final Request body, final RequestOptions options, final Type resourceClass) {
    return makeRequest(method, url, body, null, options, resourceClass);
  }

  protected <T> T makeRequest(
      final String method,
      final String url,
      final HashMap<String, Object> queryParams,
      final Type resourceClass) {
    return makeRequest(method, url, null, queryParams, null, resourceClass);
  }

  protected <T> T makeRequest(
      final String method,
      final String url,
      final HashMap<String, Object> queryParams,
      final RequestOptions options,
      final Type resourceClass) {
    return makeRequest(method, url, null, queryParams, options, resourceClass);
  }

  protected <T> T makeRequest(
      final String method,
      final String url,
      final Request body,
      final HashMap<String, Object> queryParams,
      final Type resourceClass) {
    return makeRequest(method, url, body, queryParams, null, resourceClass);
  }

  protected <T> T makeRequest(
      final String method,
      final String url,
      final Request body,
      final HashMap<String, Object> queryParams,
      final RequestOptions options,
      final Type resourceClass) {
    validateMethod(method);
    final String fullUrl = buildUrl(url, queryParams);
    final String bodyString = body != null ? jsonSerializer.serialize(body) : null;
    final Map<String, String> headers = buildHeaders(options);

    try {
      final HttpResponse response = httpAdapter.execute(method, fullUrl, headers, bodyString);

      final int statusCode = response.getStatusCode();
      final String contentType = getContentType(response);

      if (!isSuccessful(statusCode)) {
        throwForErrorResponse(response);
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

  private static String getContentType(final HttpResponse response) {
    return response.getHeaders().getOrDefault("content-type", "application/json");
  }

  private void throwForErrorResponse(final HttpResponse response) {
    final byte[] body = response.getBody();
    final String contentType = getContentType(response);
    if (body.length > 0 && contentType.startsWith("application/json")) {
      throw jsonSerializer.deserializeError(new String(body, StandardCharsets.UTF_8));
    } else {
      throw ExceptionFactory.getExceptionClass(response);
    }
  }

  public int getRecordCount(final String url, final HashMap<String, Object> queryParams) {
    final String fullUrl = buildUrl(url, queryParams);
    final Map<String, String> headers = buildHeaders();

    try {
      final HttpResponse response = httpAdapter.execute("HEAD", fullUrl, headers, null);

      if (!isSuccessful(response.getStatusCode())) {
        throwForErrorResponse(response);
      }

      warnIfDeprecated(response.getHeaders());

      final String recordCount = response.getHeaders().get("recurly-total-records");
      try {
        return Integer.parseInt(recordCount);
      } catch (NumberFormatException e) {
        throw new RecurlyException("Invalid recurly-total-records header value: " + recordCount);
      }

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
        final String value = URLEncoder.encode(urlParams.get(key), StandardCharsets.UTF_8.toString());
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

    if (Utils.envEnabled("RECURLY_INSECURE")) {
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

    try (final InputStream inputStream =
        BaseClient.class.getResourceAsStream("/version.properties")) {
      if (inputStream != null) {
        properties.load(inputStream);
        final String version = properties.getProperty("version", defaultVersion);
        final String jvmInfo = System.getProperty("java.version", defaultJvmInfo);
        return String.format("Recurly/%s; java %s", version, jvmInfo);
      }
    } catch (Exception e) {
      System.out.println("[Recurly][WARNING] " + e.toString());
    }

    System.out.println("[Recurly][WARNING] Could not set user agent header.");
    return String.format("Recurly/%s; java %s", defaultVersion, defaultJvmInfo);
  }
}
