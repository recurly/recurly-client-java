/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;

public class SubscriptionRampIntervalResponse extends Resource {

  /** Date the ramp interval ends */
  @SerializedName("ending_on")
  @Expose
  private DateTime endingOn;

  /** Represents how many billing cycles are left in a ramp interval. */
  @SerializedName("remaining_billing_cycles")
  @Expose
  private Integer remainingBillingCycles;

  /** Represents the billing cycle where a ramp interval starts. */
  @SerializedName("starting_billing_cycle")
  @Expose
  private Integer startingBillingCycle;

  /** Date the ramp interval starts */
  @SerializedName("starting_on")
  @Expose
  private DateTime startingOn;

  /** Represents the price for the ramp interval. */
  @SerializedName("unit_amount")
  @Expose
  private Integer unitAmount;

  /** Date the ramp interval ends */
  public DateTime getEndingOn() {
    return this.endingOn;
  }

  /** @param endingOn Date the ramp interval ends */
  public void setEndingOn(final DateTime endingOn) {
    this.endingOn = endingOn;
  }

  /** Represents how many billing cycles are left in a ramp interval. */
  public Integer getRemainingBillingCycles() {
    return this.remainingBillingCycles;
  }

  /**
   * @param remainingBillingCycles Represents how many billing cycles are left in a ramp interval.
   */
  public void setRemainingBillingCycles(final Integer remainingBillingCycles) {
    this.remainingBillingCycles = remainingBillingCycles;
  }

  /** Represents the billing cycle where a ramp interval starts. */
  public Integer getStartingBillingCycle() {
    return this.startingBillingCycle;
  }

  /** @param startingBillingCycle Represents the billing cycle where a ramp interval starts. */
  public void setStartingBillingCycle(final Integer startingBillingCycle) {
    this.startingBillingCycle = startingBillingCycle;
  }

  /** Date the ramp interval starts */
  public DateTime getStartingOn() {
    return this.startingOn;
  }

  /** @param startingOn Date the ramp interval starts */
  public void setStartingOn(final DateTime startingOn) {
    this.startingOn = startingOn;
  }

  /** Represents the price for the ramp interval. */
  public Integer getUnitAmount() {
    return this.unitAmount;
  }

  /** @param unitAmount Represents the price for the ramp interval. */
  public void setUnitAmount(final Integer unitAmount) {
    this.unitAmount = unitAmount;
  }
}
