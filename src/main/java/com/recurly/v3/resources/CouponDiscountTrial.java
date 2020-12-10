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

public class CouponDiscountTrial extends Resource {

  /** Trial length measured in the units specified by the sibling `unit` property */
  @SerializedName("length")
  @Expose
  private Integer length;

  /** Temporal unit of the free trial */
  @SerializedName("unit")
  @Expose
  private Constants.FreeTrialUnit unit;

  /** Trial length measured in the units specified by the sibling `unit` property */
  public Integer getLength() {
    return this.length;
  }

  /** @param length Trial length measured in the units specified by the sibling `unit` property */
  public void setLength(final Integer length) {
    this.length = length;
  }

  /** Temporal unit of the free trial */
  public Constants.FreeTrialUnit getUnit() {
    return this.unit;
  }

  /** @param unit Temporal unit of the free trial */
  public void setUnit(final Constants.FreeTrialUnit unit) {
    this.unit = unit;
  }
}
