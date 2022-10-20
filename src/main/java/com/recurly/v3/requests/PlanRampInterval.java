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

public class PlanRampInterval extends Request {

  /** Represents the price for the ramp interval. */
  @SerializedName("currencies")
  @Expose
  private List<PlanRampPricing> currencies;

  /** Represents the billing cycle where a ramp interval starts. */
  @SerializedName("starting_billing_cycle")
  @Expose
  private Integer startingBillingCycle;

  /** Represents the price for the ramp interval. */
  public List<PlanRampPricing> getCurrencies() {
    return this.currencies;
  }

  /** @param currencies Represents the price for the ramp interval. */
  public void setCurrencies(final List<PlanRampPricing> currencies) {
    this.currencies = currencies;
  }

  /** Represents the billing cycle where a ramp interval starts. */
  public Integer getStartingBillingCycle() {
    return this.startingBillingCycle;
  }

  /** @param startingBillingCycle Represents the billing cycle where a ramp interval starts. */
  public void setStartingBillingCycle(final Integer startingBillingCycle) {
    this.startingBillingCycle = startingBillingCycle;
  }
}
