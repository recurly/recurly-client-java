package com.recurly.v3;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.matchesPattern;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    assertThat(Client.API_VERSION, matchesPattern("v\\d{4}-\\d{2}-\\d{2}"));
  }
}
