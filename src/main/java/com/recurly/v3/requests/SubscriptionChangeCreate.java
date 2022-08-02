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

public class SubscriptionChangeCreate extends Request {

  /**
   * If this value is omitted your existing add-ons will be removed. If you provide a value for this
   * field it will replace any existing add-ons. So, when adding or modifying an add-on, you need to
   * include the existing subscription add-ons. Unchanged add-ons can be included just using the
   * subscription add-on's ID: `{"id": "abc123"}`.
   *
   * <p>If a subscription add-on's `code` is supplied without the `id`, `{"code": "def456"}`, the
   * subscription add-on attributes will be set to the current values of the plan add-on unless
   * provided in the request.
   *
   * <p>- If an `id` is passed, any attributes not passed in will pull from the existing
   * subscription add-on - If a `code` is passed, any attributes not passed in will pull from the
   * current values of the plan add-on - Attributes passed in as part of the request will override
   * either of the above scenarios
   */
  @SerializedName("add_ons")
  @Expose
  private List<SubscriptionAddOnUpdate> addOns;

  @SerializedName("billing_info")
  @Expose
  private SubscriptionChangeBillingInfoCreate billingInfo;

  /** Collection method */
  @SerializedName("collection_method")
  @Expose
  private String collectionMethod;

  /**
   * A list of coupon_codes to be redeemed on the subscription during the change. Only allowed if
   * timeframe is now and you change something about the subscription that creates an invoice.
   */
  @SerializedName("coupon_codes")
  @Expose
  private List<String> couponCodes;

  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  @SerializedName("custom_fields")
  @Expose
  private List<CustomField> customFields;

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
   * If you want to change to a new plan, you can provide the plan's code or id. If both are
   * provided the `plan_id` will be used.
   */
  @SerializedName("plan_code")
  @Expose
  private String planCode;

  /**
   * If you want to change to a new plan, you can provide the plan's code or id. If both are
   * provided the `plan_id` will be used.
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

  /** Revenue schedule type */
  @SerializedName("revenue_schedule_type")
  @Expose
  private String revenueScheduleType;

  /** The shipping address can currently only be changed immediately, using SubscriptionUpdate. */
  @SerializedName("shipping")
  @Expose
  private SubscriptionChangeShippingCreate shipping;

  /** This field is deprecated. Please do not use it. */
  @SerializedName("tax_inclusive")
  @Expose
  private Boolean taxInclusive;

  /**
   * The timeframe parameter controls when the upgrade or downgrade takes place. The subscription
   * change can occur now, when the subscription is next billed, or when the subscription term ends.
   * Generally, if you're performing an upgrade, you will want the change to occur immediately
   * (now). If you're performing a downgrade, you should set the timeframe to `term_end` or
   * `bill_date` so the change takes effect at a scheduled billing date. The `renewal` timeframe
   * option is accepted as an alias for `term_end`.
   */
  @SerializedName("timeframe")
  @Expose
  private String timeframe;

  /**
   * An optional type designation for the payment gateway transaction created by this request.
   * Supports 'moto' value, which is the acronym for mail order and telephone transactions.
   */
  @SerializedName("transaction_type")
  @Expose
  private String transactionType;

  /**
   * Optionally, sets custom pricing for the subscription, overriding the plan's default unit
   * amount. The subscription's current currency will be used.
   */
  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;

  /**
   * If this value is omitted your existing add-ons will be removed. If you provide a value for this
   * field it will replace any existing add-ons. So, when adding or modifying an add-on, you need to
   * include the existing subscription add-ons. Unchanged add-ons can be included just using the
   * subscription add-on's ID: `{"id": "abc123"}`.
   *
   * <p>If a subscription add-on's `code` is supplied without the `id`, `{"code": "def456"}`, the
   * subscription add-on attributes will be set to the current values of the plan add-on unless
   * provided in the request.
   *
   * <p>- If an `id` is passed, any attributes not passed in will pull from the existing
   * subscription add-on - If a `code` is passed, any attributes not passed in will pull from the
   * current values of the plan add-on - Attributes passed in as part of the request will override
   * either of the above scenarios
   */
  public List<SubscriptionAddOnUpdate> getAddOns() {
    return this.addOns;
  }

  /**
   * @param addOns If this value is omitted your existing add-ons will be removed. If you provide a
   *     value for this field it will replace any existing add-ons. So, when adding or modifying an
   *     add-on, you need to include the existing subscription add-ons. Unchanged add-ons can be
   *     included just using the subscription add-on's ID: `{"id": "abc123"}`.
   *     <p>If a subscription add-on's `code` is supplied without the `id`, `{"code": "def456"}`,
   *     the subscription add-on attributes will be set to the current values of the plan add-on
   *     unless provided in the request.
   *     <p>- If an `id` is passed, any attributes not passed in will pull from the existing
   *     subscription add-on - If a `code` is passed, any attributes not passed in will pull from
   *     the current values of the plan add-on - Attributes passed in as part of the request will
   *     override either of the above scenarios
   */
  public void setAddOns(final List<SubscriptionAddOnUpdate> addOns) {
    this.addOns = addOns;
  }

  public SubscriptionChangeBillingInfoCreate getBillingInfo() {
    return this.billingInfo;
  }

  /** @param billingInfo */
  public void setBillingInfo(final SubscriptionChangeBillingInfoCreate billingInfo) {
    this.billingInfo = billingInfo;
  }

  /** Collection method */
  public String getCollectionMethod() {
    return this.collectionMethod;
  }

  /** @param collectionMethod Collection method */
  public void setCollectionMethod(final String collectionMethod) {
    this.collectionMethod = collectionMethod;
  }

  /**
   * A list of coupon_codes to be redeemed on the subscription during the change. Only allowed if
   * timeframe is now and you change something about the subscription that creates an invoice.
   */
  public List<String> getCouponCodes() {
    return this.couponCodes;
  }

  /**
   * @param couponCodes A list of coupon_codes to be redeemed on the subscription during the change.
   *     Only allowed if timeframe is now and you change something about the subscription that
   *     creates an invoice.
   */
  public void setCouponCodes(final List<String> couponCodes) {
    this.couponCodes = couponCodes;
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
   * If you want to change to a new plan, you can provide the plan's code or id. If both are
   * provided the `plan_id` will be used.
   */
  public String getPlanCode() {
    return this.planCode;
  }

  /**
   * @param planCode If you want to change to a new plan, you can provide the plan's code or id. If
   *     both are provided the `plan_id` will be used.
   */
  public void setPlanCode(final String planCode) {
    this.planCode = planCode;
  }

  /**
   * If you want to change to a new plan, you can provide the plan's code or id. If both are
   * provided the `plan_id` will be used.
   */
  public String getPlanId() {
    return this.planId;
  }

  /**
   * @param planId If you want to change to a new plan, you can provide the plan's code or id. If
   *     both are provided the `plan_id` will be used.
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

  /** Revenue schedule type */
  public String getRevenueScheduleType() {
    return this.revenueScheduleType;
  }

  /** @param revenueScheduleType Revenue schedule type */
  public void setRevenueScheduleType(final String revenueScheduleType) {
    this.revenueScheduleType = revenueScheduleType;
  }

  /** The shipping address can currently only be changed immediately, using SubscriptionUpdate. */
  public SubscriptionChangeShippingCreate getShipping() {
    return this.shipping;
  }

  /**
   * @param shipping The shipping address can currently only be changed immediately, using
   *     SubscriptionUpdate.
   */
  public void setShipping(final SubscriptionChangeShippingCreate shipping) {
    this.shipping = shipping;
  }

  /** This field is deprecated. Please do not use it. */
  public Boolean getTaxInclusive() {
    return this.taxInclusive;
  }

  /** @param taxInclusive This field is deprecated. Please do not use it. */
  public void setTaxInclusive(final Boolean taxInclusive) {
    this.taxInclusive = taxInclusive;
  }

  /**
   * The timeframe parameter controls when the upgrade or downgrade takes place. The subscription
   * change can occur now, when the subscription is next billed, or when the subscription term ends.
   * Generally, if you're performing an upgrade, you will want the change to occur immediately
   * (now). If you're performing a downgrade, you should set the timeframe to `term_end` or
   * `bill_date` so the change takes effect at a scheduled billing date. The `renewal` timeframe
   * option is accepted as an alias for `term_end`.
   */
  public String getTimeframe() {
    return this.timeframe;
  }

  /**
   * @param timeframe The timeframe parameter controls when the upgrade or downgrade takes place.
   *     The subscription change can occur now, when the subscription is next billed, or when the
   *     subscription term ends. Generally, if you're performing an upgrade, you will want the
   *     change to occur immediately (now). If you're performing a downgrade, you should set the
   *     timeframe to `term_end` or `bill_date` so the change takes effect at a scheduled billing
   *     date. The `renewal` timeframe option is accepted as an alias for `term_end`.
   */
  public void setTimeframe(final String timeframe) {
    this.timeframe = timeframe;
  }

  /**
   * An optional type designation for the payment gateway transaction created by this request.
   * Supports 'moto' value, which is the acronym for mail order and telephone transactions.
   */
  public String getTransactionType() {
    return this.transactionType;
  }

  /**
   * @param transactionType An optional type designation for the payment gateway transaction created
   *     by this request. Supports 'moto' value, which is the acronym for mail order and telephone
   *     transactions.
   */
  public void setTransactionType(final String transactionType) {
    this.transactionType = transactionType;
  }

  /**
   * Optionally, sets custom pricing for the subscription, overriding the plan's default unit
   * amount. The subscription's current currency will be used.
   */
  public Float getUnitAmount() {
    return this.unitAmount;
  }

  /**
   * @param unitAmount Optionally, sets custom pricing for the subscription, overriding the plan's
   *     default unit amount. The subscription's current currency will be used.
   */
  public void setUnitAmount(final Float unitAmount) {
    this.unitAmount = unitAmount;
  }
}
