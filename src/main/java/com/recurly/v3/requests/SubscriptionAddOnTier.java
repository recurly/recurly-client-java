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
import java.math.BigDecimal;

public class SubscriptionAddOnTier extends Request {

  /**
   * Ending quantity for the tier. This represents a unit amount for unit-priced add ons. Must be
   * left empty if it is the final tier.
   */
  @SerializedName("ending_quantity")
  @Expose
  private Integer endingQuantity;

  /** Allows up to 2 decimal places. Optionally, override the tiers' default unit amount. */
  @SerializedName("unit_amount")
  @Expose
  private BigDecimal unitAmount;

  /**
   * Allows up to 9 decimal places. Optionally, override tiers' default unit amount. If
   * `unit_amount_decimal` is provided, `unit_amount` cannot be provided.
   */
  @SerializedName("unit_amount_decimal")
  @Expose
  private String unitAmountDecimal;

  /**
   * Ending quantity for the tier. This represents a unit amount for unit-priced add ons. Must be
   * left empty if it is the final tier.
   */
  public Integer getEndingQuantity() {
    return this.endingQuantity;
  }

  /**
   * @param endingQuantity Ending quantity for the tier. This represents a unit amount for
   *     unit-priced add ons. Must be left empty if it is the final tier.
   */
  public void setEndingQuantity(final Integer endingQuantity) {
    this.endingQuantity = endingQuantity;
  }

  /** Allows up to 2 decimal places. Optionally, override the tiers' default unit amount. */
  public BigDecimal getUnitAmount() {
    return this.unitAmount;
  }

  /**
   * @param unitAmount Allows up to 2 decimal places. Optionally, override the tiers' default unit
   *     amount.
   */
  public void setUnitAmount(final BigDecimal unitAmount) {
    this.unitAmount = unitAmount;
  }

  /**
   * Allows up to 9 decimal places. Optionally, override tiers' default unit amount. If
   * `unit_amount_decimal` is provided, `unit_amount` cannot be provided.
   */
  public String getUnitAmountDecimal() {
    return this.unitAmountDecimal;
  }

  /**
   * @param unitAmountDecimal Allows up to 9 decimal places. Optionally, override tiers' default
   *     unit amount. If `unit_amount_decimal` is provided, `unit_amount` cannot be provided.
   */
  public void setUnitAmountDecimal(final String unitAmountDecimal) {
    this.unitAmountDecimal = unitAmountDecimal;
  }
}
