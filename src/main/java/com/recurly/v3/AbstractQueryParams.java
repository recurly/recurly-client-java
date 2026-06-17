package com.recurly.v3;

import java.util.HashMap;
import java.util.List;

public abstract class AbstractQueryParams
 {

  private HashMap<String, Object> params;

  public AbstractQueryParams() {
    this.params = new HashMap<String, Object>();
  }

  public HashMap<String, Object> getParams() {
    return this.params;
  }

  protected void add(final String key, final Object value) {
    this.params.put(key, value);
  }
}
