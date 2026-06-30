# Implementing a Custom `HttpAdapter`

The `HttpAdapter` interface lets you replace the default transport with any HTTP library or
middleware you prefer. Common reasons to do this:

- Use a company-standard HTTP client (e.g. Apache HttpClient, `java.net.http.HttpClient`)
- Route requests through a proxy
- Add observability (logging, metrics, distributed tracing)
- Inject a fake transport in tests without hitting the network

## Registering your implementation

```java
ClientOptions options = new ClientOptions();
options.setHttpAdapter(new MyHttpAdapter());
Client client = new Client(apiKey, options);
```

When no adapter is set, the client uses `DefaultHttpAdapter`.

---

## The `execute` contract

```java
HttpResponse execute(String method, String url, Map<String, String> headers, String body)
    throws IOException;
```

### Method

Always one of: `GET`, `POST`, `PUT`, `DELETE`, `HEAD`. No other values are sent by the client.

### URL

A fully-qualified absolute URL, e.g. `https://v3.recurly.com/accounts?limit=20`. Never `null`.
Query parameters are already encoded and appended by the client.

### Headers

All headers the client wants to send, including:

| Header          | Value                                              |
|-----------------|----------------------------------------------------|
| `Authorization` | `Basic <base64-encoded-key>`                       |
| `Accept`        | Recurly API version string                         |
| `Content-Type`  | `application/json`                                 |
| `User-Agent`    | `Recurly/<version>; java <jvm-version>`            |

**Forward every entry without modification.** Do not add, remove, or override headers in the
adapter. The client owns header construction; the adapter owns transport.

### Body

- `POST` and `PUT` requests: a UTF-8-encoded JSON string.
- `GET`, `HEAD`, `DELETE` requests: `null`.

When `body` is `null` and the HTTP method requires a body (e.g. `DELETE` with some servers), send
an empty body (`Content-Length: 0`).

---

## Building the `HttpResponse`

```java
return new HttpResponse(statusCode, responseHeaders, responseBodyBytes);
```

### Status code

Return the exact HTTP status code from the server (e.g. `200`, `404`, `500`). The client uses it
to decide success vs. error and to select the right typed exception. Do not normalise or translate
status codes.

### Response headers

Pass a `Map<String, String>` of all response headers. `HttpResponse` normalises keys to lower-case
internally, so you do not need to do it yourself — but passing lower-case keys is fine too.

The client reads these specific headers:

| Header                  | Purpose                                           |
|-------------------------|---------------------------------------------------|
| `content-type`          | Determines JSON vs. binary (PDF) deserialisation  |
| `x-request-id`          | Included in error messages                        |
| `recurly-deprecated`    | Triggers a deprecation warning log                |
| `recurly-sunset-date`   | Included in the deprecation warning               |
| `recurly-total-records` | Returned by `getRecordCount()` (HEAD requests)    |

Include all headers from the server response, not just these. Future library versions may read
additional headers without a breaking change.

### Response body

- Read the body **fully** before returning. Do not return a lazy or streaming reference — `HttpResponse`
  takes a `byte[]` and the underlying stream will be closed once `execute` returns.
- Pass an empty `byte[]` (never `null`) when there is no body (e.g. `204 No Content`, `HEAD`).
- The client interprets the bytes as UTF-8 text for JSON and as raw bytes for binary types (PDF).

---

## Error handling

| Situation                         | What to do                                         |
|-----------------------------------|----------------------------------------------------|
| Network failure (timeout, refused)| Throw `IOException`. The client wraps it in `NetworkException`. |
| TLS / certificate error           | Throw `IOException`.                               |
| HTTP 4xx / 5xx response           | Return the `HttpResponse` — do not throw. The client maps status codes to typed exceptions. |
| `InterruptedException` (JDK `HttpClient` only) | Restore the interrupt flag, then throw `IOException`. |

Most HTTP libraries handle thread cancellation through their own timeout/cancellation mechanism and
only throw `IOException` from their synchronous execute call. You only need the pattern below if
your underlying client declares `throws InterruptedException` — notably
`java.net.http.HttpClient.send()`:

```java
} catch (InterruptedException e) {
    Thread.currentThread().interrupt();        // restore the flag
    throw new IOException("Request interrupted", e);
}
```

---

## Thread safety

A single `HttpAdapter` instance is shared across all requests made by one `Client` instance, and
`Client` is designed to be shared across threads. Your adapter must be safe for concurrent use.

In practice this means:
- Hold your underlying HTTP client as a **field** (not a local variable per call).
- Ensure any client configuration (timeouts, proxy settings) is immutable after construction, or
  protected by synchronisation.

---

## Connection pooling

Creating a new TCP connection for every request adds 50–200 ms of latency and wastes server
resources. Use an HTTP client that maintains a connection pool and hold it as a field:

```java
public class MyHttpAdapter implements HttpAdapter {
    // Shared, thread-safe; connection pool lives here.
    private final java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();

    @Override
    public HttpResponse execute(String method, String url,
                                Map<String, String> headers, String body) throws IOException {
        // ...
    }
}
```

---

## Timeouts

The Recurly client does not enforce timeouts. Set connect, read, and write timeouts inside your
adapter and adjust to your SLA requirements.

---

## Minimal example

```java
import com.recurly.v3.http.HttpAdapter;
import com.recurly.v3.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class JavaNetHttpAdapter implements HttpAdapter {

    private final HttpClient client = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(30))
            .build();

    @Override
    public HttpResponse execute(String method, String url,
                                Map<String, String> headers, String body) throws IOException {
        HttpRequest.Builder builder = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .method(method, body != null
                        ? BodyPublishers.ofString(body)
                        : BodyPublishers.noBody());

        headers.forEach(builder::header);

        try {
            java.net.http.HttpResponse<byte[]> resp =
                    client.send(builder.build(), java.net.http.HttpResponse.BodyHandlers.ofByteArray());

            Map<String, String> responseHeaders = new HashMap<>();
            resp.headers().map().forEach((k, vs) -> {
                if (k != null && !vs.isEmpty()) responseHeaders.put(k, vs.get(0));
            });

            return new HttpResponse(resp.statusCode(), responseHeaders,
                    resp.body() != null ? resp.body() : new byte[0]);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("HTTP request interrupted", e);
        }
    }
}
```

---

## Verifying your implementation with `HttpAdapterContract`

The library ships `HttpAdapterContract`, a portable JUnit 5 contract test that verifies any
`HttpAdapter` against the full behavioural requirements above. Extend it and implement
`createAdapter()`:

```java
class MyAdapterTest extends HttpAdapterContract {
    @Override
    protected HttpAdapter createAdapter() {
        return new MyHttpAdapter();
    }
}
```

**Java 11 required at test runtime.** `HttpAdapterContract` depends on WireMock 3, which requires
Java 11+. Tests are automatically skipped on Java 8 via `@DisabledOnJre(JRE.JAVA_8)`. Your
compiled adapter can still target Java 8 bytecode — only the test JVM must be Java 11+.

Add these test-scope dependencies to your project:

```xml
<dependency>
    <groupId>org.wiremock</groupId>
    <artifactId>wiremock</artifactId>
    <version>3.13.2</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.12.2</version>
    <scope>test</scope>
</dependency>
```

---

## Test doubles

To test code that uses the Recurly client without network calls, implement `HttpAdapter` to return
canned `HttpResponse` objects:

```java
public class FakeHttpAdapter implements HttpAdapter {
    private final Queue<HttpResponse> responses = new ArrayDeque<>();

    public void enqueue(HttpResponse r) { responses.add(r); }

    @Override
    public HttpResponse execute(String method, String url,
                                Map<String, String> headers, String body) {
        HttpResponse r = responses.poll();
        if (r == null) throw new IllegalStateException("No response queued for " + method + " " + url);
        return r;
    }
}
```

See `DefaultHttpAdapter` for the complete production reference implementation.
