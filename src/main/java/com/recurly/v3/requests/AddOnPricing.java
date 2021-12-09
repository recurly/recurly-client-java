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

public class AddOnPricing extends Request {

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /**
   * Determines whether or not tax is included in the unit amount. The Tax Inclusive Pricing feature
   * (separate from the Mixed Tax Pricing feature) must be enabled to use this flag.
   */
  @SerializedName("tax_inclusive")
  @Expose
  private Boolean taxInclusive;

  /** Unit price */
  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;

  /** 3-letter ISO 4217 currency code. */
  public String getCurrency() {
    return this.currency;
  }

  /** @param currency 3-letter ISO 4217 currency code. */
  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  /**
   * Determines whether or not tax is included in the unit amount. The Tax Inclusive Pricing feature
   * (separate from the Mixed Tax Pricing feature) must be enabled to use this flag.
   */
  public Boolean getTaxInclusive() {
    return this.taxInclusive;
  }

  /**
   * @param taxInclusive Determines whether or not tax is included in the unit amount. The Tax
   *     Inclusive Pricing feature (separate from the Mixed Tax Pricing feature) must be enabled to
   *     use this flag.
   */
  public void setTaxInclusive(final Boolean taxInclusive) {
    this.taxInclusive = taxInclusive;
  }

  /** Unit price */
  public Float getUnitAmount() {
    return this.unitAmount;
  }

  /** @param unitAmount Unit price */
  public void setUnitAmount(final Float unitAmount) {
    this.unitAmount = unitAmount;
  }
}
