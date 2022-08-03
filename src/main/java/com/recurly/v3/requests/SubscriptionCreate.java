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

public class SubscriptionCreate extends Request {

  @SerializedName("account")
  @Expose
  private AccountCreate account;

  /** Add-ons */
  @SerializedName("add_ons")
  @Expose
  private List<SubscriptionAddOnCreate> addOns;

  /** Whether the subscription renews at the end of its term. */
  @SerializedName("auto_renew")
  @Expose
  private Boolean autoRenew;

  /**
   * The `billing_info_id` is the value that represents a specific billing info for an end customer.
   * When `billing_info_id` is used to assign billing info to the subscription, all future billing
   * events for the subscription will bill to the specified billing info. `billing_info_id` can ONLY
   * be used for sites utilizing the Wallet feature.
   */
  @SerializedName("billing_info_id")
  @Expose
  private String billingInfoId;

  /** Collection method */
  @SerializedName("collection_method")
  @Expose
  private Constants.CollectionMethod collectionMethod;

  /** A list of coupon_codes to be redeemed on the subscription or account during the purchase. */
  @SerializedName("coupon_codes")
  @Expose
  private List<String> couponCodes;

  /**
   * If there are pending credits on the account that will be invoiced during the subscription
   * creation, these will be used as the Customer Notes on the credit invoice.
   */
  @SerializedName("credit_customer_notes")
  @Expose
  private String creditCustomerNotes;

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  @SerializedName("custom_fields")
  @Expose
  private List<CustomField> customFields;

  /**
   * This will default to the Customer Notes text specified on the Invoice Settings. Specify custom
   * notes to add or override Customer Notes. Custom notes will stay with a subscription on all
   * renewals.
   */
  @SerializedName("customer_notes")
  @Expose
  private String customerNotes;

  /**
   * Integer representing the number of days after an invoice's creation that the invoice will
   * become past due. If an invoice's net terms are set to '0', it is due 'On Receipt' and will
   * become past due 24 hours after it’s created. If an invoice is due net 30, it will become past
   * due at 31 days exactly.
   */
  @SerializedName("net_terms")
  @Expose
  private Integer netTerms;

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

  /**
   * You must provide either a `plan_code` or `plan_id`. If both are provided the `plan_id` will be
   * used.
   */
  @SerializedName("plan_code")
  @Expose
  private String planCode;

  /**
   * You must provide either a `plan_code` or `plan_id`. If both are provided the `plan_id` will be
   * used.
   */
  @SerializedName("plan_id")
  @Expose
  private String planId;

  /** For manual invoicing, this identifies the PO number associated with the subscription. */
  @SerializedName("po_number")
  @Expose
  private String poNumber;

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
  private SubscriptionShippingCreate shipping;

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
   * This will default to the Terms and Conditions text specified on the Invoice Settings page in
   * your Recurly admin. Specify custom notes to add or override Terms and Conditions. Custom notes
   * will stay with a subscription on all renewals.
   */
  @SerializedName("terms_and_conditions")
  @Expose
  private String termsAndConditions;

  /**
   * The number of cycles/billing periods in a term. When `remaining_billing_cycles=0`, if
   * `auto_renew=true` the subscription will renew and a new term will begin, otherwise the
   * subscription will expire.
   */
  @SerializedName("total_billing_cycles")
  @Expose
  private Integer totalBillingCycles;

  /**
   * An optional type designation for the payment gateway transaction created by this request.
   * Supports 'moto' value, which is the acronym for mail order and telephone transactions.
   */
  @SerializedName("transaction_type")
  @Expose
  private Constants.GatewayTransactionType transactionType;

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

  public AccountCreate getAccount() {
    return this.account;
  }

  /** @param account */
  public void setAccount(final AccountCreate account) {
    this.account = account;
  }

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
   * The `billing_info_id` is the value that represents a specific billing info for an end customer.
   * When `billing_info_id` is used to assign billing info to the subscription, all future billing
   * events for the subscription will bill to the specified billing info. `billing_info_id` can ONLY
   * be used for sites utilizing the Wallet feature.
   */
  public String getBillingInfoId() {
    return this.billingInfoId;
  }

  /**
   * @param billingInfoId The `billing_info_id` is the value that represents a specific billing info
   *     for an end customer. When `billing_info_id` is used to assign billing info to the
   *     subscription, all future billing events for the subscription will bill to the specified
   *     billing info. `billing_info_id` can ONLY be used for sites utilizing the Wallet feature.
   */
  public void setBillingInfoId(final String billingInfoId) {
    this.billingInfoId = billingInfoId;
  }

  /** Collection method */
  public Constants.CollectionMethod getCollectionMethod() {
    return this.collectionMethod;
  }

  /** @param collectionMethod Collection method */
  public void setCollectionMethod(final Constants.CollectionMethod collectionMethod) {
    this.collectionMethod = collectionMethod;
  }

  /** A list of coupon_codes to be redeemed on the subscription or account during the purchase. */
  public List<String> getCouponCodes() {
    return this.couponCodes;
  }

  /**
   * @param couponCodes A list of coupon_codes to be redeemed on the subscription or account during
   *     the purchase.
   */
  public void setCouponCodes(final List<String> couponCodes) {
    this.couponCodes = couponCodes;
  }

  /**
   * If there are pending credits on the account that will be invoiced during the subscription
   * creation, these will be used as the Customer Notes on the credit invoice.
   */
  public String getCreditCustomerNotes() {
    return this.creditCustomerNotes;
  }

  /**
   * @param creditCustomerNotes If there are pending credits on the account that will be invoiced
   *     during the subscription creation, these will be used as the Customer Notes on the credit
   *     invoice.
   */
  public void setCreditCustomerNotes(final String creditCustomerNotes) {
    this.creditCustomerNotes = creditCustomerNotes;
  }

  /** 3-letter ISO 4217 currency code. */
  public String getCurrency() {
    return this.currency;
  }

  /** @param currency 3-letter ISO 4217 currency code. */
  public void setCurrency(final String currency) {
    this.currency = currency;
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
   * This will default to the Customer Notes text specified on the Invoice Settings. Specify custom
   * notes to add or override Customer Notes. Custom notes will stay with a subscription on all
   * renewals.
   */
  public String getCustomerNotes() {
    return this.customerNotes;
  }

  /**
   * @param customerNotes This will default to the Customer Notes text specified on the Invoice
   *     Settings. Specify custom notes to add or override Customer Notes. Custom notes will stay
   *     with a subscription on all renewals.
   */
  public void setCustomerNotes(final String customerNotes) {
    this.customerNotes = customerNotes;
  }

  /**
   * Integer representing the number of days after an invoice's creation that the invoice will
   * become past due. If an invoice's net terms are set to '0', it is due 'On Receipt' and will
   * become past due 24 hours after it’s created. If an invoice is due net 30, it will become past
   * due at 31 days exactly.
   */
  public Integer getNetTerms() {
    return this.netTerms;
  }

  /**
   * @param netTerms Integer representing the number of days after an invoice's creation that the
   *     invoice will become past due. If an invoice's net terms are set to '0', it is due 'On
   *     Receipt' and will become past due 24 hours after it’s created. If an invoice is due net 30,
   *     it will become past due at 31 days exactly.
   */
  public void setNetTerms(final Integer netTerms) {
    this.netTerms = netTerms;
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

  /**
   * You must provide either a `plan_code` or `plan_id`. If both are provided the `plan_id` will be
   * used.
   */
  public String getPlanCode() {
    return this.planCode;
  }

  /**
   * @param planCode You must provide either a `plan_code` or `plan_id`. If both are provided the
   *     `plan_id` will be used.
   */
  public void setPlanCode(final String planCode) {
    this.planCode = planCode;
  }

  /**
   * You must provide either a `plan_code` or `plan_id`. If both are provided the `plan_id` will be
   * used.
   */
  public String getPlanId() {
    return this.planId;
  }

  /**
   * @param planId You must provide either a `plan_code` or `plan_id`. If both are provided the
   *     `plan_id` will be used.
   */
  public void setPlanId(final String planId) {
    this.planId = planId;
  }

  /** For manual invoicing, this identifies the PO number associated with the subscription. */
  public String getPoNumber() {
    return this.poNumber;
  }

  /**
   * @param poNumber For manual invoicing, this identifies the PO number associated with the
   *     subscription.
   */
  public void setPoNumber(final String poNumber) {
    this.poNumber = poNumber;
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
  public SubscriptionShippingCreate getShipping() {
    return this.shipping;
  }

  /** @param shipping Create a shipping address on the account and assign it to the subscription. */
  public void setShipping(final SubscriptionShippingCreate shipping) {
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
   * This will default to the Terms and Conditions text specified on the Invoice Settings page in
   * your Recurly admin. Specify custom notes to add or override Terms and Conditions. Custom notes
   * will stay with a subscription on all renewals.
   */
  public String getTermsAndConditions() {
    return this.termsAndConditions;
  }

  /**
   * @param termsAndConditions This will default to the Terms and Conditions text specified on the
   *     Invoice Settings page in your Recurly admin. Specify custom notes to add or override Terms
   *     and Conditions. Custom notes will stay with a subscription on all renewals.
   */
  public void setTermsAndConditions(final String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
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
   * An optional type designation for the payment gateway transaction created by this request.
   * Supports 'moto' value, which is the acronym for mail order and telephone transactions.
   */
  public Constants.GatewayTransactionType getTransactionType() {
    return this.transactionType;
  }

  /**
   * @param transactionType An optional type designation for the payment gateway transaction created
   *     by this request. Supports 'moto' value, which is the acronym for mail order and telephone
   *     transactions.
   */
  public void setTransactionType(final Constants.GatewayTransactionType transactionType) {
    this.transactionType = transactionType;
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
