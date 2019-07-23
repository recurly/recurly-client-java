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

public class CouponPricing extends Request {

  @SerializedName("currency")
  @Expose
  private String currency;

  @SerializedName("discount")
  @Expose
  private Float discount;

  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  public Float getDiscount() {
    return this.discount;
  }

  public void setDiscount(final Float discount) {
    this.discount = discount;
  }
}
