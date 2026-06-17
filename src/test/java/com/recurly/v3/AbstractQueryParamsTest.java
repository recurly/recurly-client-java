package com.recurly.v3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import org.junit.jupiter.api.Test;

public class AbstractQueryParamsTest {

  private static class TestParams extends AbstractQueryParams {
    public void setLimit(final Integer limit) {
      this.add("limit", limit);
    }
  }

  @Test
  public void testConstructor() {
    TestParams qp = new TestParams();
    assertEquals(qp.getParams(), new HashMap<String, Object>());
  }

  @Test
  public void testSetLimit() {
    TestParams qp = new TestParams();
    qp.setLimit(200);
    assertEquals(qp.getParams().get("limit"), 200);
  }
}
