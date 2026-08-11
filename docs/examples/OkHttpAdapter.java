// Example HttpAdapter implementation backed by OkHttp.
//
// This file is documentation only — it is not compiled as part of this library
// and OkHttp is NOT a dependency of this project. Copy it into your own
// project and add the OkHttp dependency shown in
// docs/http-adapter-implementation-guide.md if you want to use it.

import com.recurly.v3.http.HttpAdapter;
import com.recurly.v3.http.HttpResponse;

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

public class OkHttpAdapter implements HttpAdapter {

    private final OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .build();

    @Override
    public HttpResponse execute(String method, String url,
                                Map<String, String> headers, String body) throws IOException {
        Request.Builder builder = new Request.Builder().url(url);

        for (Map.Entry<String, String> header : headers.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }

        RequestBody requestBody = body != null
                ? RequestBody.create(body, MediaType.parse("application/json; charset=utf-8"))
                : RequestBody.create(new byte[0], MediaType.parse("application/json; charset=utf-8"));

        switch (method) {
            case "HEAD":   builder.head();            break;
            case "GET":    builder.get();             break;
            case "POST":   builder.post(requestBody); break;
            case "PUT":    builder.put(requestBody);  break;
            case "DELETE": builder.delete();          break;
            default:
                throw new IllegalArgumentException(method + " is not a valid Recurly HTTP method");
        }

        try (Response response = client.newCall(builder.build()).execute()) {
            int statusCode = response.code();

            Map<String, String> responseHeaders = new HashMap<>();
            Headers okHeaders = response.headers();
            for (int i = 0; i < okHeaders.size(); i++) {
                responseHeaders.put(okHeaders.name(i).toLowerCase(), okHeaders.value(i));
            }

            ResponseBody responseBody = response.body();
            byte[] responseBodyBytes = responseBody != null ? responseBody.bytes() : new byte[0];

            return new HttpResponse(statusCode, responseHeaders, responseBodyBytes);
        }
    }
}
