package com.recurly.v3.http;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.stubbing.ServeEvent;
import com.github.tomakehurst.wiremock.verification.LoggedRequest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

final class WireMockTestSupport {

  private WireMockTestSupport() {}

  static String url(final WireMockServer server, final String path) {
    return "http://localhost:" + server.port() + path;
  }

  static LoggedRequest singleRequest(final WireMockServer server) {
    final List<ServeEvent> events = server.getAllServeEvents();
    assertFalse(events.isEmpty(), "No request was received by the mock server");
    return events.get(0).getRequest();
  }
}
