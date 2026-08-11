package com.recurly.v3;

/**
 * Regression coverage for ClientOptions' deprecated no-arg constructor and setters. This whole
 * file can be deleted once the deprecated API is removed in the next major version.
 */
import com.recurly.v3.http.HttpAdapter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

@SuppressWarnings("deprecation")
public class ClientOptionsLegacyApiTest {

  @Test
  public void testNoArgConstructorDefaultsToUSRegion() {
    final ClientOptions options = new ClientOptions();
    assertEquals("https://v3.recurly.com", options.getBaseUrl());
  }

  @Test
  public void testSetRegionEU() {
    final ClientOptions options = new ClientOptions();
    options.setRegion(ClientOptions.Regions.EU);
    assertEquals("https://v3.eu.recurly.com", options.getBaseUrl());
  }

  @Test
  public void testSetHttpAdapter() {
    final HttpAdapter adapter = mock(HttpAdapter.class);
    final ClientOptions options = new ClientOptions();
    options.setHttpAdapter(adapter);
    assertSame(adapter, options.getHttpAdapter());
  }
}
