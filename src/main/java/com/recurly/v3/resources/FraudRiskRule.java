/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class FraudRiskRule extends Resource {

  /** The Kount rule number. */
  @SerializedName("code")
  @Expose
  private String code;

  /** Description of why the rule was triggered */
  @SerializedName("message")
  @Expose
  private String message;

  /** The Kount rule number. */
  public String getCode() {
    return this.code;
  }

  /** @param code The Kount rule number. */
  public void setCode(final String code) {
    this.code = code;
  }

  /** Description of why the rule was triggered */
  public String getMessage() {
    return this.message;
  }

  /** @param message Description of why the rule was triggered */
  public void setMessage(final String message) {
    this.message = message;
  }
}
