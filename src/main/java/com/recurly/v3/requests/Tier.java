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
import java.util.List;

public class Tier extends Request {

  /** Tier pricing */
  @SerializedName("currencies")
  @Expose
  private List<TierPricing> currencies;

  /**
   * Ending quantity for the tier. This represents a unit amount for unit-priced add ons, but for
   * percentage type usage add ons, represents the site default currency in its minimum divisible
   * unit.
   */
  @SerializedName("ending_quantity")
  @Expose
  private Integer endingQuantity;

  /** Decimal usage percentage. */
  @SerializedName("usage_percentage")
  @Expose
  private String usagePercentage;

  /** Tier pricing */
  public List<TierPricing> getCurrencies() {
    return this.currencies;
  }

  /** @param currencies Tier pricing */
  public void setCurrencies(final List<TierPricing> currencies) {
    this.currencies = currencies;
  }

  /**
   * Ending quantity for the tier. This represents a unit amount for unit-priced add ons, but for
   * percentage type usage add ons, represents the site default currency in its minimum divisible
   * unit.
   */
  public Integer getEndingQuantity() {
    return this.endingQuantity;
  }

  /**
   * @param endingQuantity Ending quantity for the tier. This represents a unit amount for
   *     unit-priced add ons, but for percentage type usage add ons, represents the site default
   *     currency in its minimum divisible unit.
   */
  public void setEndingQuantity(final Integer endingQuantity) {
    this.endingQuantity = endingQuantity;
  }

  /** Decimal usage percentage. */
  public String getUsagePercentage() {
    return this.usagePercentage;
  }

  /** @param usagePercentage Decimal usage percentage. */
  public void setUsagePercentage(final String usagePercentage) {
    this.usagePercentage = usagePercentage;
  }
}
