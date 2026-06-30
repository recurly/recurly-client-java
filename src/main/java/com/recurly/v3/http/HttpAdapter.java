package com.recurly.v3.http;

import java.io.IOException;
import java.util.Map;

/**
 * Pluggable HTTP transport layer for the Recurly Java client.
 *
 * <p>The client ships with {@link DefaultHttpAdapter}. Implement this interface when you need to
 * supply a different HTTP library, add middleware (logging, metrics, proxy routing), or inject a
 * fake transport in tests.
 *
 * <p><b>Registration</b>
 *
 * <pre>{@code
 * ClientOptions options = new ClientOptions();
 * options.setHttpAdapter(new MyHttpAdapter());
 * Client client = new Client(apiKey, options);
 * }</pre>
 *
 * <p><b>Thread safety</b><br>
 * A single {@code HttpAdapter} instance is shared across all requests made by a {@code Client}.
 * Implementations must be safe for concurrent use from multiple threads.
 *
 * <p><b>Connection pooling</b><br>
 * Implementations should reuse connections across calls (e.g. via an {@code HttpClient} instance
 * held as a field) to avoid the overhead of establishing a new TCP connection on every request.
 *
 * <p><b>Timeouts</b><br>
 * The client imposes no timeout of its own. Set connect, read, and write timeouts inside the
 * implementation.
 *
 * <p>See {@code docs/http-adapter-implementation-guide.md} for a full contract reference and
 * worked examples.
 */
public interface HttpAdapter {

  /**
   * Executes a single HTTP request and returns the complete response.
   *
   * <p><b>Parameters</b>
   *
   * <ul>
   *   <li>{@code method} — always one of {@code GET}, {@code POST}, {@code PUT}, {@code DELETE},
   *       {@code HEAD}.
   *   <li>{@code url} — fully-qualified URL including scheme, host, path, and any query string.
   *       Never {@code null}.
   *   <li>{@code headers} — all request headers the client wants sent (Authorization,
   *       Accept, Content-Type, User-Agent, etc.). Forward every entry without modification;
   *       do not add, remove, or override headers in the adapter.
   *   <li>{@code body} — UTF-8 JSON string for {@code POST} and {@code PUT} requests; {@code null}
   *       for {@code GET}, {@code HEAD}, and {@code DELETE}.
   * </ul>
   *
   * <p><b>Return value</b><br>
   * Return an {@link HttpResponse} containing:
   *
   * <ul>
   *   <li>The HTTP status code exactly as received.
   *   <li>All response headers. {@link HttpResponse} normalises header names to lower-case
   *       internally, so case in the map passed to the constructor does not matter. The client
   *       reads {@code content-type}, {@code x-request-id}, {@code recurly-deprecated},
   *       {@code recurly-sunset-date}, and {@code recurly-total-records}.
   *   <li>The complete response body as a byte array. Read the body fully before returning; do not
   *       return a lazy or streaming reference. Pass an empty {@code byte[]} (never {@code null})
   *       when there is no body.
   * </ul>
   *
   * <p><b>Error handling</b><br>
   * Throw {@link IOException} for any network-level failure (connection refused, timeout, TLS
   * error, etc.). The client wraps it in a {@code NetworkException}. Do <em>not</em> throw for
   * HTTP-level errors (4xx/5xx) — return the response and let the client map those to typed
   * exceptions.
   *
   * @param method HTTP method ({@code GET}, {@code POST}, {@code PUT}, {@code DELETE},
   *     {@code HEAD})
   * @param url absolute URL to request
   * @param headers request headers to send; must be forwarded unmodified
   * @param body request body as a JSON string, or {@code null} if there is no body
   * @return the complete HTTP response
   * @throws IOException on network or I/O failure
   */
  HttpResponse execute(String method, String url, Map<String, String> headers, String body)
      throws IOException;
}
