package com.recurly.v3;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ClientTest {
  private static final String apiKey = "myapikey";

  @Test
  public void testCantInitializeWithoutApiKey() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new Client(null);
        });
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new Client("");
        });
  }

  @Test
  public void testRespondsWithValidApiVersion() {
    assertTrue(Client.API_VERSION.matches("v\\d{4}-\\d{2}-\\d{2}"));
  }
}
