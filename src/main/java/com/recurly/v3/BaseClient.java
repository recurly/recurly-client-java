package com.recurly.v3;

import okhttp3.OkHttpClient;
import java.util.HashMap;
import com.recurly.v3.Resource;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Headers;
import okhttp3.MediaType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.joda.time.DateTime;
import java.util.TimeZone;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public abstract class BaseClient {
    class DateDeserializer implements JsonDeserializer<DateTime> {

        @Override
        public DateTime deserialize(JsonElement element, Type arg1, JsonDeserializationContext arg2) throws JsonParseException {
            String string = element.getAsString();
            DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");

            return formatter.parseDateTime(string);
        }
    }

    protected OkHttpClient client;
    protected String apiKey;
    protected String siteId;
    protected String apiUrl;

    public BaseClient(OkHttpClient client, String siteId, String apiKey) {
        if (siteId == null && siteId.isEmpty()) {
            throw new IllegalArgumentException("siteId is required. You passed in " + siteId);
        }

        if (apiKey == null && apiKey.isEmpty()) {
            throw new IllegalArgumentException("apiKey is required. You passed in " + apiKey);
        }

        this.client = client;
        this.siteId = siteId;
        this.apiKey = apiKey;
    }

    public <T> T makeRequest(String method, String url, Class<T> resourceClass) throws IOException {
        return makeRequest(method, url, null, null, resourceClass);
    }

    public <T> T makeRequest(String method, String url, String body, Class<T> resourceClass) throws IOException {
        return makeRequest(method, url, body, null, resourceClass);
    }

    public <T> T makeRequest(String method, String url, HashMap<String, String> queryParams, Class<T> resourceClass) throws IOException {
        return makeRequest(method, url, null, queryParams, resourceClass);
    }

    public <T> T makeRequest(String method, String url, String body, HashMap<String, String> queryParams, Class<T> resourceClass) throws IOException {
        String requestUrl = this.apiUrl + url;

        if (System.getenv("RECURLY_INSECURE") == "true") {
            System.out.println("Performing " + method + " request to " + requestUrl);
        }

        Builder requestBuilder = new Request.Builder()
        .url(requestUrl);

        if (body != null) {
            requestBuilder = requestBuilder.post(
                RequestBody.create(
                    MediaType.parse("application/json; charset=utf-8"),
                    body
                )
            );
        }

        if (queryParams != null) {
            for(Map.Entry<String, String> param : queryParams.entrySet()) {
                requestBuilder.addQueryParameter(param.getKey(),param.getValue());
            }
        }

        Request request = requestBuilder.build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            Headers responseHeaders = response.headers();
            String responseBody = response.body().string();

            if (System.getenv("RECURLY_INSECURE") != null && System.getenv("RECURLY_INSECURE").equals("true")) {
                for (int i = 0; i < responseHeaders.size(); i++) {
                    System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
                }
                System.out.println(responseBody);
            }

            return processResponse(responseBody, resourceClass);
        }
    }

    public <T> T processResponse(String ResponseBody, Class<T> resourceClass) {
        Gson gson = new GsonBuilder().registerTypeAdapter(DateTime.class, new DateDeserializer()).create();
        return gson.fromJson(responseBody, resourceClass);
    }

    String interpolatePath(String path, HashMap<String, String> urlParams) {
        urlParams.put("site_id", this.siteId);
        Pattern p = Pattern.compile("\\{([A-Za-z|_]*)\\}");
        Matcher m = p.matcher(path);

        while(m.find()) {
            String key = m.group(1).replace("{", "").replace("}", "");
            String value = urlParams.get(key);
            path = path.replace(m.group(1), value);
        }

        path = path.replaceAll("\\{", "").replaceAll("\\}", "");

        return path;
    }

    public void _setApiUrl(String uri) {
        System.out.println("[SECURITY WARNING] _SetApiUrl is for testing only and not supported in production.");

        if (System.getenv("RECURLY_INSECURE") != null && System.getenv("RECURLY_INSECURE").equals("true")) {
            this.apiUrl = uri;
        } else {
            System.out.println("ApiUrl not changed. To change, set the environment variable RECURLY_INSECURE to true");
        }
    }
}
