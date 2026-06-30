// Example HttpAdapter implementation backed by java.net.http.HttpClient (JDK 11+).
//
// This file is documentation only — it is not compiled as part of this library, which
// targets Java 8. Copy it into your own project if you're on Java 11+ and want to use
// the JDK's built-in HTTP client instead of adding a third-party dependency.

import com.recurly.v3.http.HttpAdapter;
import com.recurly.v3.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class JdkHttpClientAdapter implements HttpAdapter {

    private final HttpClient client = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(60))
            .build();

    @Override
    public HttpResponse execute(String method, String url,
                                Map<String, String> headers, String body) throws IOException {
        HttpRequest.Builder builder = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .timeout(Duration.ofSeconds(60));

        for (Map.Entry<String, String> header : headers.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }

        HttpRequest.BodyPublisher bodyPublisher = body != null
                ? HttpRequest.BodyPublishers.ofString(body)
                : HttpRequest.BodyPublishers.noBody();

        switch (method) {
            case "HEAD":   builder.method("HEAD", HttpRequest.BodyPublishers.noBody()); break;
            case "GET":    builder.GET();                break;
            case "POST":   builder.POST(bodyPublisher);   break;
            case "PUT":    builder.PUT(bodyPublisher);    break;
            case "DELETE": builder.DELETE();              break;
            default:
                throw new IllegalArgumentException(method + " is not a valid Recurly HTTP method");
        }

        java.net.http.HttpResponse<byte[]> response;
        try {
            response = client.send(builder.build(), BodyHandlers.ofByteArray());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Request interrupted", e);
        }

        int statusCode = response.statusCode();

        Map<String, String> responseHeaders = new HashMap<>();
        response.headers().map().forEach((name, values) -> {
            if (!values.isEmpty()) {
                responseHeaders.put(name, values.get(0));
            }
        });

        byte[] responseBodyBytes = "HEAD".equals(method) ? new byte[0] : response.body();

        return new HttpResponse(statusCode, responseHeaders, responseBodyBytes);
    }
}
