/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Constants;
import com.recurly.v3.Resource;
import java.util.List;
import java.util.Map;

public class Error extends Resource {

  /** Message */
  @SerializedName("message")
  @Expose
  private String message;

  /** Parameter specific errors */
  @SerializedName("params")
  @Expose
  private List<Map> params;

  /** Type */
  @SerializedName("type")
  @Expose
  private Constants.ErrorType type;

  /** Message */
  public String getMessage() {
    return this.message;
  }

  /** @param message Message */
  public void setMessage(final String message) {
    this.message = message;
  }

  /** Parameter specific errors */
  public List<Map> getParams() {
    return this.params;
  }

  /** @param params Parameter specific errors */
  public void setParams(final List<Map> params) {
    this.params = params;
  }

  /** Type */
  public Constants.ErrorType getType() {
    return this.type;
  }

  /** @param type Type */
  public void setType(final Constants.ErrorType type) {
    this.type = type;
  }
}
