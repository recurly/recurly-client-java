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

public class CreditApplicationPolicy extends Resource {

  /**
   * Optional array of credit invoice origin types to allow when mode is `all`. If not specified
   * when mode is `all`, credits from all origins are applied. Only valid when mode is `all`.
   */
  @SerializedName("allowed_origins")
  @Expose
  private List<String> allowedOrigins;

  /**
   * Determines which credit invoices are applied to invoices: - `all`: All available credit
   * invoices are applied (default) - `none`: No credit invoices are applied automatically
   */
  @SerializedName("mode")
  @Expose
  private String mode;

  /**
   * Optional array of credit invoice origin types to allow when mode is `all`. If not specified
   * when mode is `all`, credits from all origins are applied. Only valid when mode is `all`.
   */
  public List<String> getAllowedOrigins() {
    return this.allowedOrigins;
  }

  /**
   * @param allowedOrigins Optional array of credit invoice origin types to allow when mode is
   *     `all`. If not specified when mode is `all`, credits from all origins are applied. Only
   *     valid when mode is `all`.
   */
  public void setAllowedOrigins(final List<String> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
  }

  /**
   * Determines which credit invoices are applied to invoices: - `all`: All available credit
   * invoices are applied (default) - `none`: No credit invoices are applied automatically
   */
  public String getMode() {
    return this.mode;
  }

  /**
   * @param mode Determines which credit invoices are applied to invoices: - `all`: All available
   *     credit invoices are applied (default) - `none`: No credit invoices are applied
   *     automatically
   */
  public void setMode(final String mode) {
    this.mode = mode;
  }
}
