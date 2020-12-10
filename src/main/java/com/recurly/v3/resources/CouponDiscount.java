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
import java.util.List;

public class CouponDiscount extends Resource {

  /** This is only present when `type=fixed`. */
  @SerializedName("currencies")
  @Expose
  private List<CouponDiscountPricing> currencies;

  /** This is only present when `type=percent`. */
  @SerializedName("percent")
  @Expose
  private Integer percent;

  /** This is only present when `type=free_trial`. */
  @SerializedName("trial")
  @Expose
  private CouponDiscountTrial trial;

  @SerializedName("type")
  @Expose
  private Constants.DiscountType type;

  /** This is only present when `type=fixed`. */
  public List<CouponDiscountPricing> getCurrencies() {
    return this.currencies;
  }

  /** @param currencies This is only present when `type=fixed`. */
  public void setCurrencies(final List<CouponDiscountPricing> currencies) {
    this.currencies = currencies;
  }

  /** This is only present when `type=percent`. */
  public Integer getPercent() {
    return this.percent;
  }

  /** @param percent This is only present when `type=percent`. */
  public void setPercent(final Integer percent) {
    this.percent = percent;
  }

  /** This is only present when `type=free_trial`. */
  public CouponDiscountTrial getTrial() {
    return this.trial;
  }

  /** @param trial This is only present when `type=free_trial`. */
  public void setTrial(final CouponDiscountTrial trial) {
    this.trial = trial;
  }

  public Constants.DiscountType getType() {
    return this.type;
  }

  /** @param type */
  public void setType(final Constants.DiscountType type) {
    this.type = type;
  }
}
