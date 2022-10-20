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
import java.math.BigDecimal;
import java.util.List;
import org.joda.time.DateTime;

public class Subscription extends Resource {

  /** Account mini details */
  @SerializedName("account")
  @Expose
  private AccountMini account;

  /** Activated at */
  @SerializedName("activated_at")
  @Expose
  private DateTime activatedAt;

  /** The invoice ID of the latest invoice created for an active subscription. */
  @SerializedName("active_invoice_id")
  @Expose
  private String activeInvoiceId;

  /** Add-ons */
  @SerializedName("add_ons")
  @Expose
  private List<SubscriptionAddOn> addOns;

  /** Total price of add-ons */
  @SerializedName("add_ons_total")
  @Expose
  private BigDecimal addOnsTotal;

  /** Whether the subscription renews at the end of its term. */
  @SerializedName("auto_renew")
  @Expose
  private Boolean autoRenew;

  /**
   * Recurring subscriptions paid with ACH will have this attribute set. This timestamp is used for
   * alerting customers to reauthorize in 3 years in accordance with NACHA rules. If a subscription
   * becomes inactive or the billing info is no longer a bank account, this timestamp is cleared.
   */
  @SerializedName("bank_account_authorized_at")
  @Expose
  private DateTime bankAccountAuthorizedAt;

  /** Billing Info ID. */
  @SerializedName("billing_info_id")
  @Expose
  private String billingInfoId;

  /** Canceled at */
  @SerializedName("canceled_at")
  @Expose
  private DateTime canceledAt;

  /** Collection method */
  @SerializedName("collection_method")
  @Expose
  private Constants.CollectionMethod collectionMethod;

  /** Returns subscription level coupon redemptions that are tied to this subscription. */
  @SerializedName("coupon_redemptions")
  @Expose
  private List<CouponRedemptionMini> couponRedemptions;

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /** Current billing period ends at */
  @SerializedName("current_period_ends_at")
  @Expose
  private DateTime currentPeriodEndsAt;

  /** Current billing period started at */
  @SerializedName("current_period_started_at")
  @Expose
  private DateTime currentPeriodStartedAt;

  /**
   * When the term ends. This is calculated by a plan's interval and `total_billing_cycles` in a
   * term. Subscription changes with a `timeframe=renewal` will be applied on this date.
   */
  @SerializedName("current_term_ends_at")
  @Expose
  private DateTime currentTermEndsAt;

  /**
   * The start date of the term when the first billing period starts. The subscription term is the
   * length of time that a customer will be committed to a subscription. A term can span multiple
   * billing periods.
   */
  @SerializedName("current_term_started_at")
  @Expose
  private DateTime currentTermStartedAt;

  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  @SerializedName("custom_fields")
  @Expose
  private List<CustomField> customFields;

  /** Customer notes */
  @SerializedName("customer_notes")
  @Expose
  private String customerNotes;

  /** Expiration reason */
  @SerializedName("expiration_reason")
  @Expose
  private String expirationReason;

  /** Expires at */
  @SerializedName("expires_at")
  @Expose
  private DateTime expiresAt;

  /** If present, this subscription's transactions will use the payment gateway with this code. */
  @SerializedName("gateway_code")
  @Expose
  private String gatewayCode;

  /** Subscription ID */
  @SerializedName("id")
  @Expose
  private String id;

  /**
   * Integer representing the number of days after an invoice's creation that the invoice will
   * become past due. If an invoice's net terms are set to '0', it is due 'On Receipt' and will
   * become past due 24 hours after it’s created. If an invoice is due net 30, it will become past
   * due at 31 days exactly.
   */
  @SerializedName("net_terms")
  @Expose
  private Integer netTerms;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** Null unless subscription is paused or will pause at the end of the current billing period. */
  @SerializedName("paused_at")
  @Expose
  private DateTime pausedAt;

  /** Subscription Change */
  @SerializedName("pending_change")
  @Expose
  private SubscriptionChange pendingChange;

  /** Just the important parts. */
  @SerializedName("plan")
  @Expose
  private PlanMini plan;

  /** For manual invoicing, this identifies the PO number associated with the subscription. */
  @SerializedName("po_number")
  @Expose
  private String poNumber;

  /** Subscription quantity */
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /** The ramp intervals representing the pricing schedule for the subscription. */
  @SerializedName("ramp_intervals")
  @Expose
  private List<SubscriptionRampIntervalResponse> rampIntervals;

  /** The remaining billing cycles in the current term. */
  @SerializedName("remaining_billing_cycles")
  @Expose
  private Integer remainingBillingCycles;

  /** Null unless subscription is paused or will pause at the end of the current billing period. */
  @SerializedName("remaining_pause_cycles")
  @Expose
  private Integer remainingPauseCycles;

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

  /** Subscription shipping details */
  @SerializedName("shipping")
  @Expose
  private SubscriptionShipping shipping;

  /** State */
  @SerializedName("state")
  @Expose
  private Constants.SubscriptionState state;

  /** Estimated total, before tax. */
  @SerializedName("subtotal")
  @Expose
  private BigDecimal subtotal;

  /** Estimated tax */
  @SerializedName("tax")
  @Expose
  private BigDecimal tax;

  /**
   * Determines whether or not tax is included in the unit amount. The Tax Inclusive Pricing feature
   * (separate from the Mixed Tax Pricing feature) must be enabled to utilize this flag.
   */
  @SerializedName("tax_inclusive")
  @Expose
  private Boolean taxInclusive;

  /** Tax info */
  @SerializedName("tax_info")
  @Expose
  private TaxInfo taxInfo;

  /** Terms and conditions */
  @SerializedName("terms_and_conditions")
  @Expose
  private String termsAndConditions;

  /** Estimated total */
  @SerializedName("total")
  @Expose
  private BigDecimal total;

  /**
   * The number of cycles/billing periods in a term. When `remaining_billing_cycles=0`, if
   * `auto_renew=true` the subscription will renew and a new term will begin, otherwise the
   * subscription will expire.
   */
  @SerializedName("total_billing_cycles")
  @Expose
  private Integer totalBillingCycles;

  /** Trial period ends at */
  @SerializedName("trial_ends_at")
  @Expose
  private DateTime trialEndsAt;

  /** Trial period started at */
  @SerializedName("trial_started_at")
  @Expose
  private DateTime trialStartedAt;

  /** Subscription unit price */
  @SerializedName("unit_amount")
  @Expose
  private BigDecimal unitAmount;

  /** Last updated at */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /**
   * The UUID is useful for matching data with the CSV exports and building URLs into Recurly's UI.
   */
  @SerializedName("uuid")
  @Expose
  private String uuid;

  /** Account mini details */
  public AccountMini getAccount() {
    return this.account;
  }

  /** @param account Account mini details */
  public void setAccount(final AccountMini account) {
    this.account = account;
  }

  /** Activated at */
  public DateTime getActivatedAt() {
    return this.activatedAt;
  }

  /** @param activatedAt Activated at */
  public void setActivatedAt(final DateTime activatedAt) {
    this.activatedAt = activatedAt;
  }

  /** The invoice ID of the latest invoice created for an active subscription. */
  public String getActiveInvoiceId() {
    return this.activeInvoiceId;
  }

  /**
   * @param activeInvoiceId The invoice ID of the latest invoice created for an active subscription.
   */
  public void setActiveInvoiceId(final String activeInvoiceId) {
    this.activeInvoiceId = activeInvoiceId;
  }

  /** Add-ons */
  public List<SubscriptionAddOn> getAddOns() {
    return this.addOns;
  }

  /** @param addOns Add-ons */
  public void setAddOns(final List<SubscriptionAddOn> addOns) {
    this.addOns = addOns;
  }

  /** Total price of add-ons */
  public BigDecimal getAddOnsTotal() {
    return this.addOnsTotal;
  }

  /** @param addOnsTotal Total price of add-ons */
  public void setAddOnsTotal(final BigDecimal addOnsTotal) {
    this.addOnsTotal = addOnsTotal;
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
   * Recurring subscriptions paid with ACH will have this attribute set. This timestamp is used for
   * alerting customers to reauthorize in 3 years in accordance with NACHA rules. If a subscription
   * becomes inactive or the billing info is no longer a bank account, this timestamp is cleared.
   */
  public DateTime getBankAccountAuthorizedAt() {
    return this.bankAccountAuthorizedAt;
  }

  /**
   * @param bankAccountAuthorizedAt Recurring subscriptions paid with ACH will have this attribute
   *     set. This timestamp is used for alerting customers to reauthorize in 3 years in accordance
   *     with NACHA rules. If a subscription becomes inactive or the billing info is no longer a
   *     bank account, this timestamp is cleared.
   */
  public void setBankAccountAuthorizedAt(final DateTime bankAccountAuthorizedAt) {
    this.bankAccountAuthorizedAt = bankAccountAuthorizedAt;
  }

  /** Billing Info ID. */
  public String getBillingInfoId() {
    return this.billingInfoId;
  }

  /** @param billingInfoId Billing Info ID. */
  public void setBillingInfoId(final String billingInfoId) {
    this.billingInfoId = billingInfoId;
  }

  /** Canceled at */
  public DateTime getCanceledAt() {
    return this.canceledAt;
  }

  /** @param canceledAt Canceled at */
  public void setCanceledAt(final DateTime canceledAt) {
    this.canceledAt = canceledAt;
  }

  /** Collection method */
  public Constants.CollectionMethod getCollectionMethod() {
    return this.collectionMethod;
  }

  /** @param collectionMethod Collection method */
  public void setCollectionMethod(final Constants.CollectionMethod collectionMethod) {
    this.collectionMethod = collectionMethod;
  }

  /** Returns subscription level coupon redemptions that are tied to this subscription. */
  public List<CouponRedemptionMini> getCouponRedemptions() {
    return this.couponRedemptions;
  }

  /**
   * @param couponRedemptions Returns subscription level coupon redemptions that are tied to this
   *     subscription.
   */
  public void setCouponRedemptions(final List<CouponRedemptionMini> couponRedemptions) {
    this.couponRedemptions = couponRedemptions;
  }

  /** Created at */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt Created at */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** 3-letter ISO 4217 currency code. */
  public String getCurrency() {
    return this.currency;
  }

  /** @param currency 3-letter ISO 4217 currency code. */
  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  /** Current billing period ends at */
  public DateTime getCurrentPeriodEndsAt() {
    return this.currentPeriodEndsAt;
  }

  /** @param currentPeriodEndsAt Current billing period ends at */
  public void setCurrentPeriodEndsAt(final DateTime currentPeriodEndsAt) {
    this.currentPeriodEndsAt = currentPeriodEndsAt;
  }

  /** Current billing period started at */
  public DateTime getCurrentPeriodStartedAt() {
    return this.currentPeriodStartedAt;
  }

  /** @param currentPeriodStartedAt Current billing period started at */
  public void setCurrentPeriodStartedAt(final DateTime currentPeriodStartedAt) {
    this.currentPeriodStartedAt = currentPeriodStartedAt;
  }

  /**
   * When the term ends. This is calculated by a plan's interval and `total_billing_cycles` in a
   * term. Subscription changes with a `timeframe=renewal` will be applied on this date.
   */
  public DateTime getCurrentTermEndsAt() {
    return this.currentTermEndsAt;
  }

  /**
   * @param currentTermEndsAt When the term ends. This is calculated by a plan's interval and
   *     `total_billing_cycles` in a term. Subscription changes with a `timeframe=renewal` will be
   *     applied on this date.
   */
  public void setCurrentTermEndsAt(final DateTime currentTermEndsAt) {
    this.currentTermEndsAt = currentTermEndsAt;
  }

  /**
   * The start date of the term when the first billing period starts. The subscription term is the
   * length of time that a customer will be committed to a subscription. A term can span multiple
   * billing periods.
   */
  public DateTime getCurrentTermStartedAt() {
    return this.currentTermStartedAt;
  }

  /**
   * @param currentTermStartedAt The start date of the term when the first billing period starts.
   *     The subscription term is the length of time that a customer will be committed to a
   *     subscription. A term can span multiple billing periods.
   */
  public void setCurrentTermStartedAt(final DateTime currentTermStartedAt) {
    this.currentTermStartedAt = currentTermStartedAt;
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

  /** Customer notes */
  public String getCustomerNotes() {
    return this.customerNotes;
  }

  /** @param customerNotes Customer notes */
  public void setCustomerNotes(final String customerNotes) {
    this.customerNotes = customerNotes;
  }

  /** Expiration reason */
  public String getExpirationReason() {
    return this.expirationReason;
  }

  /** @param expirationReason Expiration reason */
  public void setExpirationReason(final String expirationReason) {
    this.expirationReason = expirationReason;
  }

  /** Expires at */
  public DateTime getExpiresAt() {
    return this.expiresAt;
  }

  /** @param expiresAt Expires at */
  public void setExpiresAt(final DateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  /** If present, this subscription's transactions will use the payment gateway with this code. */
  public String getGatewayCode() {
    return this.gatewayCode;
  }

  /**
   * @param gatewayCode If present, this subscription's transactions will use the payment gateway
   *     with this code.
   */
  public void setGatewayCode(final String gatewayCode) {
    this.gatewayCode = gatewayCode;
  }

  /** Subscription ID */
  public String getId() {
    return this.id;
  }

  /** @param id Subscription ID */
  public void setId(final String id) {
    this.id = id;
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

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  /** Null unless subscription is paused or will pause at the end of the current billing period. */
  public DateTime getPausedAt() {
    return this.pausedAt;
  }

  /**
   * @param pausedAt Null unless subscription is paused or will pause at the end of the current
   *     billing period.
   */
  public void setPausedAt(final DateTime pausedAt) {
    this.pausedAt = pausedAt;
  }

  /** Subscription Change */
  public SubscriptionChange getPendingChange() {
    return this.pendingChange;
  }

  /** @param pendingChange Subscription Change */
  public void setPendingChange(final SubscriptionChange pendingChange) {
    this.pendingChange = pendingChange;
  }

  /** Just the important parts. */
  public PlanMini getPlan() {
    return this.plan;
  }

  /** @param plan Just the important parts. */
  public void setPlan(final PlanMini plan) {
    this.plan = plan;
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

  /** Subscription quantity */
  public Integer getQuantity() {
    return this.quantity;
  }

  /** @param quantity Subscription quantity */
  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  /** The ramp intervals representing the pricing schedule for the subscription. */
  public List<SubscriptionRampIntervalResponse> getRampIntervals() {
    return this.rampIntervals;
  }

  /**
   * @param rampIntervals The ramp intervals representing the pricing schedule for the subscription.
   */
  public void setRampIntervals(final List<SubscriptionRampIntervalResponse> rampIntervals) {
    this.rampIntervals = rampIntervals;
  }

  /** The remaining billing cycles in the current term. */
  public Integer getRemainingBillingCycles() {
    return this.remainingBillingCycles;
  }

  /** @param remainingBillingCycles The remaining billing cycles in the current term. */
  public void setRemainingBillingCycles(final Integer remainingBillingCycles) {
    this.remainingBillingCycles = remainingBillingCycles;
  }

  /** Null unless subscription is paused or will pause at the end of the current billing period. */
  public Integer getRemainingPauseCycles() {
    return this.remainingPauseCycles;
  }

  /**
   * @param remainingPauseCycles Null unless subscription is paused or will pause at the end of the
   *     current billing period.
   */
  public void setRemainingPauseCycles(final Integer remainingPauseCycles) {
    this.remainingPauseCycles = remainingPauseCycles;
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

  /** Subscription shipping details */
  public SubscriptionShipping getShipping() {
    return this.shipping;
  }

  /** @param shipping Subscription shipping details */
  public void setShipping(final SubscriptionShipping shipping) {
    this.shipping = shipping;
  }

  /** State */
  public Constants.SubscriptionState getState() {
    return this.state;
  }

  /** @param state State */
  public void setState(final Constants.SubscriptionState state) {
    this.state = state;
  }

  /** Estimated total, before tax. */
  public BigDecimal getSubtotal() {
    return this.subtotal;
  }

  /** @param subtotal Estimated total, before tax. */
  public void setSubtotal(final BigDecimal subtotal) {
    this.subtotal = subtotal;
  }

  /** Estimated tax */
  public BigDecimal getTax() {
    return this.tax;
  }

  /** @param tax Estimated tax */
  public void setTax(final BigDecimal tax) {
    this.tax = tax;
  }

  /**
   * Determines whether or not tax is included in the unit amount. The Tax Inclusive Pricing feature
   * (separate from the Mixed Tax Pricing feature) must be enabled to utilize this flag.
   */
  public Boolean getTaxInclusive() {
    return this.taxInclusive;
  }

  /**
   * @param taxInclusive Determines whether or not tax is included in the unit amount. The Tax
   *     Inclusive Pricing feature (separate from the Mixed Tax Pricing feature) must be enabled to
   *     utilize this flag.
   */
  public void setTaxInclusive(final Boolean taxInclusive) {
    this.taxInclusive = taxInclusive;
  }

  /** Tax info */
  public TaxInfo getTaxInfo() {
    return this.taxInfo;
  }

  /** @param taxInfo Tax info */
  public void setTaxInfo(final TaxInfo taxInfo) {
    this.taxInfo = taxInfo;
  }

  /** Terms and conditions */
  public String getTermsAndConditions() {
    return this.termsAndConditions;
  }

  /** @param termsAndConditions Terms and conditions */
  public void setTermsAndConditions(final String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  /** Estimated total */
  public BigDecimal getTotal() {
    return this.total;
  }

  /** @param total Estimated total */
  public void setTotal(final BigDecimal total) {
    this.total = total;
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

  /** Trial period ends at */
  public DateTime getTrialEndsAt() {
    return this.trialEndsAt;
  }

  /** @param trialEndsAt Trial period ends at */
  public void setTrialEndsAt(final DateTime trialEndsAt) {
    this.trialEndsAt = trialEndsAt;
  }

  /** Trial period started at */
  public DateTime getTrialStartedAt() {
    return this.trialStartedAt;
  }

  /** @param trialStartedAt Trial period started at */
  public void setTrialStartedAt(final DateTime trialStartedAt) {
    this.trialStartedAt = trialStartedAt;
  }

  /** Subscription unit price */
  public BigDecimal getUnitAmount() {
    return this.unitAmount;
  }

  /** @param unitAmount Subscription unit price */
  public void setUnitAmount(final BigDecimal unitAmount) {
    this.unitAmount = unitAmount;
  }

  /** Last updated at */
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt Last updated at */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The UUID is useful for matching data with the CSV exports and building URLs into Recurly's UI.
   */
  public String getUuid() {
    return this.uuid;
  }

  /**
   * @param uuid The UUID is useful for matching data with the CSV exports and building URLs into
   *     Recurly's UI.
   */
  public void setUuid(final String uuid) {
    this.uuid = uuid;
  }
}
