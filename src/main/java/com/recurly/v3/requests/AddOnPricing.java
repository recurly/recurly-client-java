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
   * The unit amount to use as the price per unit. Allows up to 2 decimal places. It is required
   * unless `add_on_type` = `usage` and `usage_type` = `price` and `unit_amount_decimal` is
   * provided. If `unit_amount_decimal` is provided, `unit_amount` cannot be provided.
   */
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
   * The unit amount to use as the price per unit. Allows up to 2 decimal places. It is required
   * unless `add_on_type` = `usage` and `usage_type` = `price` and `unit_amount_decimal` is
   * provided. If `unit_amount_decimal` is provided, `unit_amount` cannot be provided.
   */
  public Float getUnitAmount() {
    return this.unitAmount;
  }

  /**
   * @param unitAmount The unit amount to use as the price per unit. Allows up to 2 decimal places.
   *     It is required unless `add_on_type` = `usage` and `usage_type` = `price` and
   *     `unit_amount_decimal` is provided. If `unit_amount_decimal` is provided, `unit_amount`
   *     cannot be provided.
   */
  public void setUnitAmount(final Float unitAmount) {
    this.unitAmount = unitAmount;
  }
}
