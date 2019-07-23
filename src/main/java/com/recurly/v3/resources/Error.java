/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.util.List;
import java.util.Map;

public class Error extends Resource {

  @SerializedName("message")
  @Expose
  private String message;

  @SerializedName("params")
  @Expose
  private List<Map> params;

  @SerializedName("type")
  @Expose
  private String type;

  public String getMessage() {
    return this.message;
  }

  public void setMessage(final String message) {
    this.message = message;
  }

  public List<Map> getParams() {
    return this.params;
  }

  public void setParams(final List<Map> params) {
    this.params = params;
  }

  public String getType() {
    return this.type;
  }

  public void setType(final String type) {
    this.type = type;
  }
}
