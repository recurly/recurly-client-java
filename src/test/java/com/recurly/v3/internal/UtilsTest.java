package com.recurly.v3.internal;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class UtilsTest {

  @Test
  public void envEnabled_falseWhenVariableIsUnset() {
    assertFalse(Utils.envEnabled("RECURLY_JAVA_CLIENT_UTILS_TEST_UNSET_VAR"));
  }
}
