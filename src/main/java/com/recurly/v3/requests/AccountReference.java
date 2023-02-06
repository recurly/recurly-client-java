/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import com.recurly.v3.resources.*;

public class AccountReference extends Request {

  @SerializedName("code")
  @Expose
  private String code;

  @SerializedName("id")
  @Expose
  private String id;

  public String getCode() {
    return this.code;
  }

  /** @param code */
  public void setCode(final String code) {
    this.code = code;
  }

  public String getId() {
    return this.id;
  }

  /** @param id */
  public void setId(final String id) {
    this.id = id;
  }
}
