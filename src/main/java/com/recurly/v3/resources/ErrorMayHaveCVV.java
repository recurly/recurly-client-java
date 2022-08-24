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

public class ErrorMayHaveCVV extends Resource {

  /** The security code you entered does not match. Please update the CVV and try again. */
  @SerializedName("message")
  @Expose
  private String message;

  /** Type */
  @SerializedName("type")
  @Expose
  private Constants.ErrorType type;

  /** The security code you entered does not match. Please update the CVV and try again. */
  public String getMessage() {
    return this.message;
  }

  /**
   * @param message The security code you entered does not match. Please update the CVV and try
   *     again.
   */
  public void setMessage(final String message) {
    this.message = message;
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
