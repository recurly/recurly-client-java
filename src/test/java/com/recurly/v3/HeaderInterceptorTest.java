package com.recurly.v3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.recurly.v3.http.HeaderInterceptor;
import java.io.IOException;
import okhttp3.*;
import okhttp3.Request;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.jupiter.api.Test;

public class HeaderInterceptorTest {
  @Test
  public void testHttpHeaders() throws IOException, InterruptedException {
    MockWebServer mockWebServer = new MockWebServer();
    mockWebServer.start();
    mockWebServer.enqueue(new MockResponse());

    OkHttpClient okHttpClient =
        new OkHttpClient()
            .newBuilder()
            .addInterceptor(new HeaderInterceptor("apikey", "version"))
            .build();

    okHttpClient.newCall(new Request.Builder().url(mockWebServer.url("/")).build()).execute();

    RecordedRequest request = mockWebServer.takeRequest();
    assertEquals("apikey", request.getHeader("Authorization"));
    assertEquals("application/vnd.recurly.version", request.getHeader("Accept"));
    assertEquals("application/json", request.getHeader("Content-Type"));

    // TODO this regex will change on GA
    // BETA semver sequence is forced until then
    final String agentFormat = "Recurly/3\\.\\d+\\.\\d+-beta-\\d+-SNAPSHOT;\\s+java\\s+\\d+\\.\\d+\\.\\d+.*";
    assertEquals(request.getHeader("User-Agent").matches(agentFormat), true);

    mockWebServer.shutdown();
  }
}
