package com.recurly.v3;

import com.recurly.v3.http.HttpAdapter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

public class ClientOptionsTest {

  @Test
  public void testBuilderDefaultsToUSRegion() {
    final ClientOptions options = ClientOptions.builder().build();
    assertEquals("https://v3.recurly.com", options.getBaseUrl());
  }

  @Test
  public void testBuilderWithEURegion() {
    final ClientOptions options = ClientOptions.builder().region(ClientOptions.Regions.EU).build();
    assertEquals("https://v3.eu.recurly.com", options.getBaseUrl());
  }

  @Test
  public void testBuilderWithHttpAdapter() {
    final HttpAdapter adapter = mock(HttpAdapter.class);
    final ClientOptions options = ClientOptions.builder().httpAdapter(adapter).build();
    assertSame(adapter, options.getHttpAdapter());
  }

  @Test
  public void testBuilderChaining() {
    final HttpAdapter adapter = mock(HttpAdapter.class);
    final ClientOptions options =
        ClientOptions.builder().region(ClientOptions.Regions.EU).httpAdapter(adapter).build();
    assertEquals("https://v3.eu.recurly.com", options.getBaseUrl());
    assertSame(adapter, options.getHttpAdapter());
  }
}
