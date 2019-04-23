package com.recurly.v3;

import com.recurly.v3.Request;
import com.recurly.v3.http.HeaderInterceptor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import com.fatboyindustrial.gsonjodatime.Converters;

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
    class DateDeserializer implements JsonDeserializer<DateTime> {

        @Override
        public DateTime deserialize(JsonElement element, Type arg1, JsonDeserializationContext arg2) throws JsonParseException {
            final String string = element.getAsString();
            final DateTimeFormatter formatter = ISODateTimeFormat.dateTimeParser();

            return formatter.parseDateTime(string);
        }
    }

    private static final String API_URL = "https://partner-api.recurly.com/";
    private static final DateTimeFormatter DT_FORMATTER = ISODateTimeFormat.dateTimeParser();

    //private static OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
    // TODO will want to use safe ^ version by default
    private static final OkHttpClient.Builder httpClientBuilder = getUnsafeOkHttpClientBuilder();
    private static final Gson gson = Converters.registerDateTime(new GsonBuilder()).create();
    private final String apiKey;
    private final String siteId;
    private final OkHttpClient client;
    private String apiUrl;

    protected BaseClient(final String siteId, final String apiKey) {
        if (siteId == null || siteId.isEmpty()) {
            throw new IllegalArgumentException("siteId cannot be null or empty");
        }

        if (apiKey == null || apiKey.isEmpty()) {
            throw new IllegalArgumentException("apiKey cannot be null or empty");
        }

        this.siteId = siteId;
        this.apiKey = apiKey;

        final String authToken = Credentials.basic(this.apiKey, "");
        final HeaderInterceptor headerInterceptor =
                new HeaderInterceptor(authToken, Client.API_VERSION);

        if (!httpClientBuilder.interceptors().contains(headerInterceptor)) {
            httpClientBuilder.addInterceptor(headerInterceptor);
        }

        if ("true".equals(System.getenv("RECURLY_INSECURE"))) {
            final HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
            httpClientBuilder.addInterceptor(logging);
        }

        this.client = httpClientBuilder.build();
        this.apiUrl = API_URL;
    }

    private static OkHttpClient.Builder getUnsafeOkHttpClientBuilder() {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[] {
                    new X509TrustManager() {
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }
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

    protected void makeRequest(final String method, final String url) throws IOException {
        final okhttp3.Request request = buildRequest(method, url, null, null);

        try (final Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            final Headers responseHeaders = response.headers();

            if ("true".equals(System.getenv("RECURLY_INSECURE"))) {
                for (int i = 0; i < responseHeaders.size(); i++) {
                    System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
                }
            }
        }
    }

    protected <T> T makeRequest(final String method, final String url, final Type resourceClass) throws IOException {
        return makeRequest(method, url, null, null, resourceClass);
    }

    protected <T> T makeRequest(final String method, final String url, final Request body, final Type resourceClass) throws IOException {
        return makeRequest(method, url, body, null, resourceClass);
    }

    protected <T> T makeRequest(final String method, final String url, final Map<String, Object> queryParams, final Type resourceClass) throws IOException {
        return makeRequest(method, url, null, queryParams, resourceClass);
    }

    protected <T> T makeRequest(final String method, final String url, final Request body, final Map<String, Object> queryParams, final Type resourceClass) throws IOException {
        final okhttp3.Request request = buildRequest(method, url, body, queryParams);

        try (final Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            final Headers responseHeaders = response.headers();
            final String responseBody = response.body().string();

            if ("true".equals(System.getenv("RECURLY_INSECURE"))) {
                for (int i = 0; i < responseHeaders.size(); i++) {
                    System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
                }
                System.out.println(responseBody);
            }

            return processResponse(responseBody, resourceClass);
        }
    }

    private okhttp3.Request buildRequest(final String method, final String url, final Request body, final Map<String, Object> queryParams) {
        final HttpUrl.Builder httpBuilder = HttpUrl.parse(this.apiUrl + url).newBuilder();

        final RequestBody requestBody = RequestBody.create(
            MediaType.parse("application/json; charset=utf-8"),
            new Gson().toJson(body)
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

        if ("true".equals(System.getenv("RECURLY_INSECURE"))) {
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
                throw new RuntimeException("Invalid method (TODO: Make this a v3.resources.Error)");
        }
    }

    private <T> T processResponse(final String responseBody, final Type resourceClass) {
        final Gson gson = new GsonBuilder().registerTypeAdapter(DateTime.class, new DateDeserializer()).create();
        return gson.fromJson(responseBody, resourceClass);
    }

    protected String interpolatePath(final String path) {
        return interpolatePath(path, new HashMap<String, String>());
    }

    protected String interpolatePath(String path, final Map<String, String> urlParams) {
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
        System.out.println("[SECURITY WARNING] _SetApiUrl is for testing only and not supported in production.");

        if ("true".equals(System.getenv("RECURLY_INSECURE"))) {
            this.apiUrl = uri;
        } else {
            System.out.println("ApiUrl not changed. To change, set the environment variable RECURLY_INSECURE to true");
        }
    }
}
