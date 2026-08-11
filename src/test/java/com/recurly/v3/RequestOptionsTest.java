package com.recurly.v3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Map;
import org.junit.jupiter.api.Test;

public class RequestOptionsTest {

  @Test
  public void headerNormalizesReservedHeaderNameToLowerCase() {
    final RequestOptions options =
        RequestOptions.builder().header("Authorization", "Bearer token").build();

    final Map<String, String> headers = options.getHeaders();
    assertEquals("Bearer token", headers.get("authorization"));
    assertNull(headers.get("Authorization"), "header name must be normalized to lower case");
  }

  @Test
  public void headerNormalizesCustomHeaderNameToLowerCase() {
    final RequestOptions options =
        RequestOptions.builder().header("X-Custom-Header", "value").build();

    final Map<String, String> headers = options.getHeaders();
    assertEquals("value", headers.get("x-custom-header"));
    assertNull(headers.get("X-Custom-Header"));
  }

  @Test
  public void headerWithDifferentCasingCollapsesToSingleEntry() {
    final RequestOptions options =
        RequestOptions.builder().header("X-Dup", "first").header("x-dup", "second").build();

    final Map<String, String> headers = options.getHeaders();
    assertEquals(1, headers.size());
    assertEquals("second", headers.get("x-dup"));
  }
}
