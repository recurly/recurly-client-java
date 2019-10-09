package com.recurly.v3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import org.junit.jupiter.api.Test;

public class QueryParamsTest {
  @Test
  public void testConstructor() {
    QueryParams qp = new QueryParams();
    assertEquals(qp.getParams(), new HashMap<String, Object>());
  }

  @Test
  public void testSetLimit() {
    QueryParams qp = new QueryParams();
    qp.setLimit(200);
    assertEquals(qp.getParams().get("limit"), 200);
  }
}
