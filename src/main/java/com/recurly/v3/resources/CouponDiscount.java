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

public class CouponDiscount extends Resource {

  @SerializedName("currencies")
  @Expose
  private List<CouponDiscountPricing> currencies;

  @SerializedName("percent")
  @Expose
  private Integer percent;

  @SerializedName("trial")
  @Expose
  private CouponDiscountTrial trial;

  @SerializedName("type")
  @Expose
  private String type;

  public List<CouponDiscountPricing> getCurrencies() {
    return this.currencies;
  }

  /** @param currencies */
  public void setCurrencies(final List<CouponDiscountPricing> currencies) {
    this.currencies = currencies;
  }

  public Integer getPercent() {
    return this.percent;
  }

  /** @param percent */
  public void setPercent(final Integer percent) {
    this.percent = percent;
  }

  public CouponDiscountTrial getTrial() {
    return this.trial;
  }

  /** @param trial */
  public void setTrial(final CouponDiscountTrial trial) {
    this.trial = trial;
  }

  public String getType() {
    return this.type;
  }

  /** @param type */
  public void setType(final String type) {
    this.type = type;
  }
}
