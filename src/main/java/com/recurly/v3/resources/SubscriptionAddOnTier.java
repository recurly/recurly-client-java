/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.math.BigDecimal;

public class SubscriptionAddOnTier extends Resource {

  /** Ending quantity */
  @SerializedName("ending_quantity")
  @Expose
  private Integer endingQuantity;

  /**
   * Allows up to 2 decimal places. Optionally, override the tiers' default unit amount. If add-on's
   * `add_on_type` is `usage` and `usage_type` is `percentage`, cannot be provided.
   */
  @SerializedName("unit_amount")
  @Expose
  private BigDecimal unitAmount;

  /**
   * Allows up to 9 decimal places. Optionally, override tiers' default unit amount. If
   * `unit_amount_decimal` is provided, `unit_amount` cannot be provided. If add-on's `add_on_type`
   * is `usage` and `usage_type` is `percentage`, cannot be provided.
   */
  @SerializedName("unit_amount_decimal")
  @Expose
  private String unitAmountDecimal;

  /**
   * This field is deprecated. Do not used it anymore for percentage tiers subscription add ons. Use
   * the percentage_tiers object instead.
   */
  @SerializedName("usage_percentage")
  @Expose
  private String usagePercentage;

  /** Ending quantity */
  public Integer getEndingQuantity() {
    return this.endingQuantity;
  }

  /** @param endingQuantity Ending quantity */
  public void setEndingQuantity(final Integer endingQuantity) {
    this.endingQuantity = endingQuantity;
  }

  /**
   * Allows up to 2 decimal places. Optionally, override the tiers' default unit amount. If add-on's
   * `add_on_type` is `usage` and `usage_type` is `percentage`, cannot be provided.
   */
  public BigDecimal getUnitAmount() {
    return this.unitAmount;
  }

  /**
   * @param unitAmount Allows up to 2 decimal places. Optionally, override the tiers' default unit
   *     amount. If add-on's `add_on_type` is `usage` and `usage_type` is `percentage`, cannot be
   *     provided.
   */
  public void setUnitAmount(final BigDecimal unitAmount) {
    this.unitAmount = unitAmount;
  }

  /**
   * Allows up to 9 decimal places. Optionally, override tiers' default unit amount. If
   * `unit_amount_decimal` is provided, `unit_amount` cannot be provided. If add-on's `add_on_type`
   * is `usage` and `usage_type` is `percentage`, cannot be provided.
   */
  public String getUnitAmountDecimal() {
    return this.unitAmountDecimal;
  }

  /**
   * @param unitAmountDecimal Allows up to 9 decimal places. Optionally, override tiers' default
   *     unit amount. If `unit_amount_decimal` is provided, `unit_amount` cannot be provided. If
   *     add-on's `add_on_type` is `usage` and `usage_type` is `percentage`, cannot be provided.
   */
  public void setUnitAmountDecimal(final String unitAmountDecimal) {
    this.unitAmountDecimal = unitAmountDecimal;
  }

  /**
   * This field is deprecated. Do not used it anymore for percentage tiers subscription add ons. Use
   * the percentage_tiers object instead.
   */
  public String getUsagePercentage() {
    return this.usagePercentage;
  }

  /**
   * @param usagePercentage This field is deprecated. Do not used it anymore for percentage tiers
   *     subscription add ons. Use the percentage_tiers object instead.
   */
  public void setUsagePercentage(final String usagePercentage) {
    this.usagePercentage = usagePercentage;
  }
}
