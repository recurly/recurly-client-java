/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.util.List;
import org.joda.time.DateTime;

public class Subscription extends Resource {

  @SerializedName("account")
  @Expose
  private AccountMini account;

  /** Activated at */
  @SerializedName("activated_at")
  @Expose
  private DateTime activatedAt;

  /** Add-ons */
  @SerializedName("add_ons")
  @Expose
  private List<SubscriptionAddOn> addOns;

  /** Total price of add-ons */
  @SerializedName("add_ons_total")
  @Expose
  private Float addOnsTotal;

  /**
   * Recurring subscriptions paid with ACH will have this attribute set. This timestamp is used for
   * alerting customers to reauthorize in 3 years in accordance with NACHA rules. If a subscription
   * becomes inactive or the billing info is no longer a bank account, this timestamp is cleared.
   */
  @SerializedName("bank_account_authorized_at")
  @Expose
  private DateTime bankAccountAuthorizedAt;

  /** Canceled at */
  @SerializedName("canceled_at")
  @Expose
  private DateTime canceledAt;

  /** Collection method */
  @SerializedName("collection_method")
  @Expose
  private String collectionMethod;

  /** Coupon redemptions */
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

  @SerializedName("pending_change")
  @Expose
  private SubscriptionChange pendingChange;

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

  /** Remaining billing cycles */
  @SerializedName("remaining_billing_cycles")
  @Expose
  private Integer remainingBillingCycles;

  @SerializedName("shipping_address")
  @Expose
  private ShippingAddress shippingAddress;

  /** State */
  @SerializedName("state")
  @Expose
  private String state;

  /** Estimated total, before tax. */
  @SerializedName("subtotal")
  @Expose
  private Float subtotal;

  /** Terms and conditions */
  @SerializedName("terms_and_conditions")
  @Expose
  private String termsAndConditions;

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
  private Float unitAmount;

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

  public AccountMini getAccount() {
    return this.account;
  }

  /** @param account */
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

  /** Add-ons */
  public List<SubscriptionAddOn> getAddOns() {
    return this.addOns;
  }

  /** @param addOns Add-ons */
  public void setAddOns(final List<SubscriptionAddOn> addOns) {
    this.addOns = addOns;
  }

  /** Total price of add-ons */
  public Float getAddOnsTotal() {
    return this.addOnsTotal;
  }

  /** @param addOnsTotal Total price of add-ons */
  public void setAddOnsTotal(final Float addOnsTotal) {
    this.addOnsTotal = addOnsTotal;
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

  /** Canceled at */
  public DateTime getCanceledAt() {
    return this.canceledAt;
  }

  /** @param canceledAt Canceled at */
  public void setCanceledAt(final DateTime canceledAt) {
    this.canceledAt = canceledAt;
  }

  /** Collection method */
  public String getCollectionMethod() {
    return this.collectionMethod;
  }

  /** @param collectionMethod Collection method */
  public void setCollectionMethod(final String collectionMethod) {
    this.collectionMethod = collectionMethod;
  }

  /** Coupon redemptions */
  public List<CouponRedemptionMini> getCouponRedemptions() {
    return this.couponRedemptions;
  }

  /** @param couponRedemptions Coupon redemptions */
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

  public SubscriptionChange getPendingChange() {
    return this.pendingChange;
  }

  /** @param pendingChange */
  public void setPendingChange(final SubscriptionChange pendingChange) {
    this.pendingChange = pendingChange;
  }

  public PlanMini getPlan() {
    return this.plan;
  }

  /** @param plan */
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

  /** Remaining billing cycles */
  public Integer getRemainingBillingCycles() {
    return this.remainingBillingCycles;
  }

  /** @param remainingBillingCycles Remaining billing cycles */
  public void setRemainingBillingCycles(final Integer remainingBillingCycles) {
    this.remainingBillingCycles = remainingBillingCycles;
  }

  public ShippingAddress getShippingAddress() {
    return this.shippingAddress;
  }

  /** @param shippingAddress */
  public void setShippingAddress(final ShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /** State */
  public String getState() {
    return this.state;
  }

  /** @param state State */
  public void setState(final String state) {
    this.state = state;
  }

  /** Estimated total, before tax. */
  public Float getSubtotal() {
    return this.subtotal;
  }

  /** @param subtotal Estimated total, before tax. */
  public void setSubtotal(final Float subtotal) {
    this.subtotal = subtotal;
  }

  /** Terms and conditions */
  public String getTermsAndConditions() {
    return this.termsAndConditions;
  }

  /** @param termsAndConditions Terms and conditions */
  public void setTermsAndConditions(final String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
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
  public Float getUnitAmount() {
    return this.unitAmount;
  }

  /** @param unitAmount Subscription unit price */
  public void setUnitAmount(final Float unitAmount) {
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
