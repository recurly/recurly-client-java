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

public class PlanRampPricing extends Resource {

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /**
   * The price segment ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For requests, the
   * code can also be used. Use prefix `code-`, e.g. `code-gold`.
   */
  @SerializedName("price_segment_id")
  @Expose
  private String priceSegmentId;

  /** Represents the price for the Ramp Interval. */
  @SerializedName("unit_amount")
  @Expose
  private BigDecimal unitAmount;

  /** 3-letter ISO 4217 currency code. */
  public String getCurrency() {
    return this.currency;
  }

  /**
   * @param currency 3-letter ISO 4217 currency code.
   */
  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  /**
   * The price segment ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For requests, the
   * code can also be used. Use prefix `code-`, e.g. `code-gold`.
   */
  public String getPriceSegmentId() {
    return this.priceSegmentId;
  }

  /**
   * @param priceSegmentId The price segment ID or code. For ID no prefix is used e.g.
   *     `e28zov4fw0v2`. For requests, the code can also be used. Use prefix `code-`, e.g.
   *     `code-gold`.
   */
  public void setPriceSegmentId(final String priceSegmentId) {
    this.priceSegmentId = priceSegmentId;
  }

  /** Represents the price for the Ramp Interval. */
  public BigDecimal getUnitAmount() {
    return this.unitAmount;
  }

  /**
   * @param unitAmount Represents the price for the Ramp Interval.
   */
  public void setUnitAmount(final BigDecimal unitAmount) {
    this.unitAmount = unitAmount;
  }
}
