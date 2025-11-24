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

public class CreditApplicationPolicy extends Resource {

  /**
   * Determines which credit invoices are applied to invoices: - `all`: All available credit
   * invoices are applied (default) - `none`: No credit invoices are applied automatically
   */
  @SerializedName("mode")
  @Expose
  private Constants.CreditApplicationMode mode;

  /**
   * Determines which credit invoices are applied to invoices: - `all`: All available credit
   * invoices are applied (default) - `none`: No credit invoices are applied automatically
   */
  public Constants.CreditApplicationMode getMode() {
    return this.mode;
  }

  /**
   * @param mode Determines which credit invoices are applied to invoices: - `all`: All available
   *     credit invoices are applied (default) - `none`: No credit invoices are applied
   *     automatically
   */
  public void setMode(final Constants.CreditApplicationMode mode) {
    this.mode = mode;
  }
}
