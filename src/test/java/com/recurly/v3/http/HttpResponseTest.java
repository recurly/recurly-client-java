package com.recurly.v3.http;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class HttpResponseTest {

  private static final Map<String, String> EMPTY_HEADERS = Collections.emptyMap();
  private static final byte[] EMPTY_BODY = new byte[0];

  @Test
  public void nullHeadersThrows() {
    assertThrows(NullPointerException.class, () ->
        new HttpResponse(200, null, EMPTY_BODY));
  }

  @Test
  public void nullBodyThrows() {
    assertThrows(NullPointerException.class, () ->
        new HttpResponse(200, EMPTY_HEADERS, null));
  }

  @Test
  public void validConstructionSucceeds() {
    final HttpResponse response = new HttpResponse(200, EMPTY_HEADERS, EMPTY_BODY);
    assertEquals(200, response.getStatusCode());
    assertNotNull(response.getHeaders());
    assertNotNull(response.getBody());
  }

  @Test
  public void headersAreNormalizedToLowercase() {
    final Map<String, String> headers = new HashMap<>();
    headers.put("Content-Type", "application/json");
    headers.put("X-Custom-Header", "value");

    final HttpResponse response = new HttpResponse(200, headers, EMPTY_BODY);

    assertEquals("application/json", response.getHeaders().get("content-type"));
    assertEquals("value", response.getHeaders().get("x-custom-header"));
    assertNull(response.getHeaders().get("Content-Type"));
  }

  @Test
  public void headersAreImmutable() {
    final Map<String, String> headers = new HashMap<>();
    headers.put("content-type", "application/json");

    final HttpResponse response = new HttpResponse(200, headers, EMPTY_BODY);

    assertThrows(UnsupportedOperationException.class, () ->
        response.getHeaders().put("x-injected", "value"));
  }
}
