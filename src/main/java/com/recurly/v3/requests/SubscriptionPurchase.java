/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Constants;
import com.recurly.v3.Request;
import com.recurly.v3.resources.*;
import java.math.BigDecimal;
import java.util.List;
import org.joda.time.DateTime;

public class SubscriptionPurchase extends Request {

  /** Add-ons */
  @SerializedName("add_ons")
  @Expose
  private List<SubscriptionAddOnCreate> addOns;

  /** Whether the subscription renews at the end of its term. */
  @SerializedName("auto_renew")
  @Expose
  private Boolean autoRenew;

  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  @SerializedName("custom_fields")
  @Expose
  private List<CustomField> customFields;

  /**
   * If present, this sets the date the subscription's next billing period will start
   * (`current_period_ends_at`). This can be used to align the subscription’s billing to a specific
   * day of the month. The initial invoice will be prorated for the period between the
   * subscription's activation date and the billing period end date. Subsequent periods will be
   * based off the plan interval. For a subscription with a trial period, this will change when the
   * trial expires.
   */
  @SerializedName("next_bill_date")
  @Expose
  private DateTime nextBillDate;

  /** Plan code */
  @SerializedName("plan_code")
  @Expose
  private String planCode;

  /** Plan ID */
  @SerializedName("plan_id")
  @Expose
  private String planId;

  /** Optionally override the default quantity of 1. */
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /** The new set of ramp intervals for the subscription. */
  @SerializedName("ramp_intervals")
  @Expose
  private List<SubscriptionRampInterval> rampIntervals;

  /**
   * If `auto_renew=true`, when a term completes, `total_billing_cycles` takes this value as the
   * length of subsequent terms. Defaults to the plan's `total_billing_cycles`.
   */
  @SerializedName("renewal_billing_cycles")
  @Expose
  private Integer renewalBillingCycles;

  /** Revenue schedule type */
  @SerializedName("revenue_schedule_type")
  @Expose
  private Constants.RevenueScheduleType revenueScheduleType;

  /** Create a shipping address on the account and assign it to the subscription. */
  @SerializedName("shipping")
  @Expose
  private SubscriptionShippingPurchase shipping;

  /**
   * If set, the subscription will begin in the future on this date. The subscription will apply the
   * setup fee and trial period, unless the plan has no trial.
   */
  @SerializedName("starts_at")
  @Expose
  private DateTime startsAt;

  /**
   * Determines whether or not tax is included in the unit amount. The Tax Inclusive Pricing feature
   * (separate from the Mixed Tax Pricing feature) must be enabled to use this flag.
   */
  @SerializedName("tax_inclusive")
  @Expose
  private Boolean taxInclusive;

  /**
   * The number of cycles/billing periods in a term. When `remaining_billing_cycles=0`, if
   * `auto_renew=true` the subscription will renew and a new term will begin, otherwise the
   * subscription will expire.
   */
  @SerializedName("total_billing_cycles")
  @Expose
  private Integer totalBillingCycles;

  /**
   * If set, overrides the default trial behavior for the subscription. When the current date time
   * or a past date time is provided the subscription will begin with no trial phase (overriding any
   * plan default trial). When a future date time is provided the subscription will begin with a
   * trial phase ending at the specified date time.
   */
  @SerializedName("trial_ends_at")
  @Expose
  private DateTime trialEndsAt;

  /**
   * Override the unit amount of the subscription plan by setting this value. If not provided, the
   * subscription will inherit the price from the subscription plan for the provided currency.
   */
  @SerializedName("unit_amount")
  @Expose
  private BigDecimal unitAmount;

  /** Add-ons */
  public List<SubscriptionAddOnCreate> getAddOns() {
    return this.addOns;
  }

  /** @param addOns Add-ons */
  public void setAddOns(final List<SubscriptionAddOnCreate> addOns) {
    this.addOns = addOns;
  }

  /** Whether the subscription renews at the end of its term. */
  public Boolean getAutoRenew() {
    return this.autoRenew;
  }

  /** @param autoRenew Whether the subscription renews at the end of its term. */
  public void setAutoRenew(final Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  public List<CustomField> getCustomFields() {
    return this.customFields;
  }

  /**
   * @param customFields The custom fields will only be altered when they are included in a request.
   *     Sending an empty array will not remove any existing values. To remove a field send the name
   *     with a null or empty value.
   */
  public void setCustomFields(final List<CustomField> customFields) {
    this.customFields = customFields;
  }

  /**
   * If present, this sets the date the subscription's next billing period will start
   * (`current_period_ends_at`). This can be used to align the subscription’s billing to a specific
   * day of the month. The initial invoice will be prorated for the period between the
   * subscription's activation date and the billing period end date. Subsequent periods will be
   * based off the plan interval. For a subscription with a trial period, this will change when the
   * trial expires.
   */
  public DateTime getNextBillDate() {
    return this.nextBillDate;
  }

  /**
   * @param nextBillDate If present, this sets the date the subscription's next billing period will
   *     start (`current_period_ends_at`). This can be used to align the subscription’s billing to a
   *     specific day of the month. The initial invoice will be prorated for the period between the
   *     subscription's activation date and the billing period end date. Subsequent periods will be
   *     based off the plan interval. For a subscription with a trial period, this will change when
   *     the trial expires.
   */
  public void setNextBillDate(final DateTime nextBillDate) {
    this.nextBillDate = nextBillDate;
  }

  /** Plan code */
  public String getPlanCode() {
    return this.planCode;
  }

  /** @param planCode Plan code */
  public void setPlanCode(final String planCode) {
    this.planCode = planCode;
  }

  /** Plan ID */
  public String getPlanId() {
    return this.planId;
  }

  /** @param planId Plan ID */
  public void setPlanId(final String planId) {
    this.planId = planId;
  }

  /** Optionally override the default quantity of 1. */
  public Integer getQuantity() {
    return this.quantity;
  }

  /** @param quantity Optionally override the default quantity of 1. */
  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  /** The new set of ramp intervals for the subscription. */
  public List<SubscriptionRampInterval> getRampIntervals() {
    return this.rampIntervals;
  }

  /** @param rampIntervals The new set of ramp intervals for the subscription. */
  public void setRampIntervals(final List<SubscriptionRampInterval> rampIntervals) {
    this.rampIntervals = rampIntervals;
  }

  /**
   * If `auto_renew=true`, when a term completes, `total_billing_cycles` takes this value as the
   * length of subsequent terms. Defaults to the plan's `total_billing_cycles`.
   */
  public Integer getRenewalBillingCycles() {
    return this.renewalBillingCycles;
  }

  /**
   * @param renewalBillingCycles If `auto_renew=true`, when a term completes, `total_billing_cycles`
   *     takes this value as the length of subsequent terms. Defaults to the plan's
   *     `total_billing_cycles`.
   */
  public void setRenewalBillingCycles(final Integer renewalBillingCycles) {
    this.renewalBillingCycles = renewalBillingCycles;
  }

  /** Revenue schedule type */
  public Constants.RevenueScheduleType getRevenueScheduleType() {
    return this.revenueScheduleType;
  }

  /** @param revenueScheduleType Revenue schedule type */
  public void setRevenueScheduleType(final Constants.RevenueScheduleType revenueScheduleType) {
    this.revenueScheduleType = revenueScheduleType;
  }

  /** Create a shipping address on the account and assign it to the subscription. */
  public SubscriptionShippingPurchase getShipping() {
    return this.shipping;
  }

  /** @param shipping Create a shipping address on the account and assign it to the subscription. */
  public void setShipping(final SubscriptionShippingPurchase shipping) {
    this.shipping = shipping;
  }

  /**
   * If set, the subscription will begin in the future on this date. The subscription will apply the
   * setup fee and trial period, unless the plan has no trial.
   */
  public DateTime getStartsAt() {
    return this.startsAt;
  }

  /**
   * @param startsAt If set, the subscription will begin in the future on this date. The
   *     subscription will apply the setup fee and trial period, unless the plan has no trial.
   */
  public void setStartsAt(final DateTime startsAt) {
    this.startsAt = startsAt;
  }

  /**
   * Determines whether or not tax is included in the unit amount. The Tax Inclusive Pricing feature
   * (separate from the Mixed Tax Pricing feature) must be enabled to use this flag.
   */
  public Boolean getTaxInclusive() {
    return this.taxInclusive;
  }

  /**
   * @param taxInclusive Determines whether or not tax is included in the unit amount. The Tax
   *     Inclusive Pricing feature (separate from the Mixed Tax Pricing feature) must be enabled to
   *     use this flag.
   */
  public void setTaxInclusive(final Boolean taxInclusive) {
    this.taxInclusive = taxInclusive;
  }

  /**
   * The number of cycles/billing periods in a term. When `remaining_billing_cycles=0`, if
   * `auto_renew=true` the subscription will renew and a new term will begin, otherwise the
   * subscription will expire.
   */
  public Integer getTotalBillingCycles() {
    return this.totalBillingCycles;
  }

  /**
   * @param totalBillingCycles The number of cycles/billing periods in a term. When
   *     `remaining_billing_cycles=0`, if `auto_renew=true` the subscription will renew and a new
   *     term will begin, otherwise the subscription will expire.
   */
  public void setTotalBillingCycles(final Integer totalBillingCycles) {
    this.totalBillingCycles = totalBillingCycles;
  }

  /**
   * If set, overrides the default trial behavior for the subscription. When the current date time
   * or a past date time is provided the subscription will begin with no trial phase (overriding any
   * plan default trial). When a future date time is provided the subscription will begin with a
   * trial phase ending at the specified date time.
   */
  public DateTime getTrialEndsAt() {
    return this.trialEndsAt;
  }

  /**
   * @param trialEndsAt If set, overrides the default trial behavior for the subscription. When the
   *     current date time or a past date time is provided the subscription will begin with no trial
   *     phase (overriding any plan default trial). When a future date time is provided the
   *     subscription will begin with a trial phase ending at the specified date time.
   */
  public void setTrialEndsAt(final DateTime trialEndsAt) {
    this.trialEndsAt = trialEndsAt;
  }

  /**
   * Override the unit amount of the subscription plan by setting this value. If not provided, the
   * subscription will inherit the price from the subscription plan for the provided currency.
   */
  public BigDecimal getUnitAmount() {
    return this.unitAmount;
  }

  /**
   * @param unitAmount Override the unit amount of the subscription plan by setting this value. If
   *     not provided, the subscription will inherit the price from the subscription plan for the
   *     provided currency.
   */
  public void setUnitAmount(final BigDecimal unitAmount) {
    this.unitAmount = unitAmount;
  }
}
