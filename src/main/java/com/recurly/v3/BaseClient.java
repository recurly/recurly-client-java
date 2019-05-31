package com.recurly.v3;

import com.recurly.v3.Resource;
import com.recurly.v3.Request;
import com.recurly.v3.JsonSerializer;
import com.recurly.v3.http.HeaderInterceptor;
import com.recurly.v3.resources.Error;
import com.recurly.v3.ApiException;
import com.recurly.v3.NetworkException;

import java.io.IOException;
import java.lang.reflect.Type;
import java.security.cert.CertificateException;
import java.util.Map;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Request.Builder;
import okhttp3.Response;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public abstract class BaseClient {
    private static final String API_URL = "https://partner-api.recurly.com/";
    private static final DateTimeFormatter DT_FORMATTER = ISODateTimeFormat.dateTimeParser();

    //private static OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
    // TODO will want to use safe ^ version by default
    private static final OkHttpClient.Builder httpClientBuilder = getUnsafeOkHttpClientBuilder();
    private static final JsonSerializer jsonSerializer = new JsonSerializer();
    private final String apiKey;
    private final String siteId;
    private final OkHttpClient client;
    private String apiUrl;

    protected BaseClient(final String siteId, final String apiKey) {
        this(siteId, apiKey, newHttpClient(apiKey));
    }

    protected BaseClient(final String siteId, final String apiKey, final OkHttpClient client) {
        if (siteId == null || siteId.isEmpty()) {
            throw new IllegalArgumentException("siteId cannot be null or empty");
        }

        if (apiKey == null || apiKey.isEmpty()) {
            throw new IllegalArgumentException("apiKey cannot be null or empty");
        }

        this.siteId = siteId;
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

        if ("true".equals(System.getenv("RECURLY_INSECURE")) && "true".equals(System.getenv("RECURLY_DEBUG"))) {
            final HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
            httpClientBuilder.addInterceptor(logging);
        }

        return httpClientBuilder.build();
    }

    @SuppressWarnings("deprecation")
    private static OkHttpClient.Builder getUnsafeOkHttpClientBuilder() {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[] {
                    new X509TrustManager() {
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException { }

                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException { }
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
            };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            final OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(sslSocketFactory);
            builder.hostnameVerifier(new HostnameVerifier() {
                public boolean verify(final String hostname, final SSLSession session) {
                    return true;
                }
            });

            return builder;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected void makeRequest(final String method, final String url) {
        final okhttp3.Request request = buildRequest(method, url, null, null);

        try (final Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                String responseString = response.body().string();
                if ("true".equals(System.getenv("RECURLY_INSECURE")) && "true".equals(System.getenv("RECURLY_DEBUG"))) {
                    System.out.println(responseString);
                }
                throw jsonSerializer.deserializeError(responseString);
            }

            final Headers responseHeaders = response.headers();

            if ("true".equals(System.getenv("RECURLY_INSECURE")) && "true".equals(System.getenv("RECURLY_DEBUG"))) {
                for (int i = 0; i < responseHeaders.size(); i++) {
                    System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
                }
            }

            String deprecated = responseHeaders.get("Recurly-Deprecated");

            if (deprecated != null && deprecated.toUpperCase() == "TRUE") {
                String sunset = responseHeaders.get("Recurly-Sunset-Date");

                String warning = "[recurly-client-java] WARNING: Your current API version \"" +
                                 Client.API_VERSION +
                                 "\" is deprecated and will be sunset on " + sunset;

                System.out.println(warning);
            }

        } catch (IOException e) {
            throw new NetworkException(e);
        }
    }

    protected <T> T makeRequest(final String method, final String url, final Type resourceClass){
        return makeRequest(method, url, null, null, resourceClass);
    }

    protected <T> T makeRequest(final String method, final String url, final Request body, final Type resourceClass) {
        return makeRequest(method, url, body, null, resourceClass);
    }

    protected <T> T makeRequest(final String method, final String url, final HashMap<String, Object> queryParams, final Type resourceClass) {
        return makeRequest(method, url, null, queryParams, resourceClass);
    }

    protected <T> T makeRequest(final String method, final String url, final Request body, final HashMap<String, Object> queryParams, final Type resourceClass) {
        final okhttp3.Request request = buildRequest(method, url, body, queryParams);

        try (final Response response = client.newCall(request).execute()) {

            final Headers responseHeaders = response.headers();
            final String responseBody = response.body().string();

            if (!response.isSuccessful()) {
                throw jsonSerializer.deserializeError(responseBody);
            }

            if ("true".equals(System.getenv("RECURLY_INSECURE")) && "true".equals(System.getenv("RECURLY_DEBUG"))) {
                for (int i = 0; i < responseHeaders.size(); i++) {
                    System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
                }
                System.out.println(responseBody);
            }

            String deprecated = responseHeaders.get("Recurly-Deprecated");

            if (deprecated != null && deprecated.toUpperCase() == "TRUE") {
                String sunset = responseHeaders.get("Recurly-Sunset-Date");

                String warning = "[recurly-client-java] WARNING: Your current API version \"" +
                                 Client.API_VERSION +
                                 "\" is deprecated and will be sunset on " + sunset;

                System.out.println(warning);
            }

            return jsonSerializer.deserialize(responseBody, resourceClass);
        } catch (IOException e) {
            throw new NetworkException(e);
        }
    }

    private okhttp3.Request buildRequest(final String method, final String url, final Request body, final HashMap<String, Object> queryParams) {
        final HttpUrl.Builder httpBuilder = HttpUrl.parse(this.apiUrl + url).newBuilder();

        final RequestBody requestBody = RequestBody.create(
            MediaType.parse("application/json; charset=utf-8"),
            jsonSerializer.serialize(body)
        );

        if (queryParams != null) {
            for (Map.Entry<String, Object> param : queryParams.entrySet()) {
                final Object value = param.getValue();
                final String stringValue;
                if (value instanceof String) {
                    stringValue = value.toString();
                } else if (value instanceof DateTime) {
                    final DateTime dt = (DateTime) value;
                    stringValue = DT_FORMATTER.print(dt.withZone(DateTimeZone.UTC));
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

        if ("true".equals(System.getenv("RECURLY_INSECURE")) && "true".equals(System.getenv("RECURLY_DEBUG"))) {
            System.out.println("Performing " + method + " request to " + requestUrl);
        }

        final Builder requestBuilder = new okhttp3.Request.Builder().url(requestUrl);

        switch(method) {
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

    protected String interpolatePath(final String path) {
        return interpolatePath(path, new HashMap<String, String>());
    }

    protected String interpolatePath(String path, final HashMap<String, String> urlParams) {
        urlParams.put("site_id", this.siteId);
        final Pattern p = Pattern.compile("\\{([A-Za-z|_]*)\\}");
        final Matcher m = p.matcher(path);

        while(m.find()) {
            final String key = m.group(1).replace("{", "").replace("}", "");
            final String value = urlParams.get(key);
            path = path.replace(m.group(1), value);
        }

        return path.replaceAll("\\{", "").replaceAll("\\}", "");
    }

    public void _setApiUrl(final String uri) {
        System.out.println("[SECURITY WARNING] _setApiUrl is for testing only and not supported in production.");

        if ("true".equals(System.getenv("RECURLY_INSECURE"))) {
            this.apiUrl = uri;
        } else {
            System.out.println("ApiUrl not changed. To change, set the environment variable RECURLY_INSECURE to true");
        }
    }

    public String getApiUrl()
    {
        return this.apiUrl;
    }
}
