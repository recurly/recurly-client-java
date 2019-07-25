/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class PlanPricing extends Resource {

  @SerializedName("currency")
  @Expose
  private String currency;

  @SerializedName("setup_fee")
  @Expose
  private Float setupFee;

  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;

  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  public Float getSetupFee() {
    return this.setupFee;
  }

  public void setSetupFee(final Float setupFee) {
    this.setupFee = setupFee;
  }

  public Float getUnitAmount() {
    return this.unitAmount;
  }

  public void setUnitAmount(final Float unitAmount) {
    this.unitAmount = unitAmount;
  }
}
