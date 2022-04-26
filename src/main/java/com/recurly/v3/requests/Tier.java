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
   * Ending quantity for the tier. This represents a unit amount for unit-priced add ons. Must be
   * left empty if it is the final tier.
   */
  @SerializedName("ending_quantity")
  @Expose
  private Integer endingQuantity;

  /** Tier pricing */
  public List<TierPricing> getCurrencies() {
    return this.currencies;
  }

  /** @param currencies Tier pricing */
  public void setCurrencies(final List<TierPricing> currencies) {
    this.currencies = currencies;
  }

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
}
