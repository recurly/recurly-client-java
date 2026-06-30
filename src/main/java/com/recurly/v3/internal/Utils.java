package com.recurly.v3.internal;

/** Internal helpers shared across the client library. Not part of the public API. */
@InternalApi
public final class Utils {

  private Utils() {}

  public static boolean envEnabled(final String envVar) {
    return "true".equals(System.getenv(envVar));
  }
}
