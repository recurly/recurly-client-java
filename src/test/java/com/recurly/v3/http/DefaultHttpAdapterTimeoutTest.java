package com.recurly.v3.http;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.JRE;

import java.io.IOException;
import java.util.HashMap;

import static com.github.tomakehurst.wiremock.client.WireMock.any;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Verifies that {@link DefaultHttpAdapter#DefaultHttpAdapter(int)} actually bounds the read phase
 * with the supplied timeout, rather than always falling back to the default.
 */
@DisabledOnJre(JRE.JAVA_8)
class DefaultHttpAdapterTimeoutTest {

  private WireMockServer server;

  @BeforeEach
  void setUp() {
    server = new WireMockServer(wireMockConfig().dynamicPort());
    server.start();
  }

  @AfterEach
  void tearDown() {
    server.stop();
  }

  @Test
  void customTimeout_boundsReadPhase() {
    server.stubFor(any(urlPathEqualTo("/accounts"))
        .willReturn(aResponse().withStatus(200).withBody("{}").withFixedDelay(500)));

    final HttpAdapter adapter = new DefaultHttpAdapter(100);

    assertThrows(IOException.class,
        () -> adapter.execute("GET", WireMockTestSupport.url(server, "/accounts"), new HashMap<>(), null),
        "A response slower than the configured timeout must fail with an IOException");
  }
}
