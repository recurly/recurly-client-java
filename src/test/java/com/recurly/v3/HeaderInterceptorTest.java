package com.recurly.v3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.recurly.v3.fixtures.MockClient;
import com.recurly.v3.fixtures.MockHttpTransport;
import com.recurly.v3.http.SimpleHttpRequest;
import java.io.IOException;
import java.util.Base64;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

public class HeaderInterceptorTest {
  @Test
  public void testHttpHeaders() throws IOException {
    final MockHttpTransport transport = new MockHttpTransport();
    transport.enqueue(MockClient.buildResponse(200, "{}"));

    final String apiKey = "myApiKey";
    final MockClient client = new MockClient(apiKey, transport);
    client.getResource("some-id");

    final SimpleHttpRequest request = transport.getLastRequest();
    final java.util.Map<String, String> headers = request.getHeaders();

    // Authorization uses Basic auth encoding of "apiKey:"
    final String expectedAuth = "Basic " + Base64.getEncoder()
        .encodeToString((apiKey + ":").getBytes(StandardCharsets.UTF_8));
    assertEquals(expectedAuth, headers.get("Authorization"));

    // Accept header includes the API version
    assertEquals("application/vnd.recurly." + Client.API_VERSION, headers.get("Accept"));

    // Content-Type is always application/json
    assertEquals("application/json", headers.get("Content-Type"));

    // User-Agent matches the expected format
    final String agentFormat = "Recurly/\\d+\\.\\d+\\.\\d+(-SNAPSHOT)?;\\s+java\\s+\\d+.*";
    assertTrue(headers.get("User-Agent").matches(agentFormat),
        "User-Agent did not match expected format: " + headers.get("User-Agent"));
  }


  @Test
  public void testEmptyBodyPutHasNonNullBody() throws IOException {
    // A PUT with no request body (e.g. reactivateItem) must pass a non-null, zero-length
    // byte array to the transport so that HttpURLConnection sends Content-Length: 0.
    // A null body would skip setDoOutput(true) and cause a 411 Length Required response.
    final MockHttpTransport transport = new MockHttpTransport();
    transport.enqueue(MockClient.buildResponse(200, "{}"));

    final MockClient client = new MockClient("myApiKey", transport);
    client.reactivateResource("some-id");

    final SimpleHttpRequest request = transport.getLastRequest();
    assertNotNull(request.getBody(), "Body must not be null for a no-body PUT");
    assertEquals(0, request.getBody().length, "Body must be empty for a no-body PUT");
  }
}
