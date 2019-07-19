package com.recurly.v3;

import org.junit.jupiter.api.Test;

import javax.management.Query;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
