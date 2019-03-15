package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class Subscription extends Resource {

  @SerializedName("account")
  private AccountMini account;

  @SerializedName("activated_at")
  private DateTime activatedAt;

  @SerializedName("add_ons")
  private List<SubscriptionAddOn> addOns;

  @SerializedName("add_ons_total")
  private Float addOnsTotal;

  @SerializedName("auto_renew")
  private Boolean autoRenew;

  @SerializedName("bank_account_authorized_at")
  private DateTime bankAccountAuthorizedAt;

  @SerializedName("canceled_at")
  private DateTime canceledAt;

  @SerializedName("collection_method")
  private String collectionMethod;

  @SerializedName("coupon_redemptions")
  private List<CouponRedemptionMini> couponRedemptions;

  @SerializedName("created_at")
  private DateTime createdAt;

  @SerializedName("currency")
  private String currency;

  @SerializedName("current_period_ends_at")
  private DateTime currentPeriodEndsAt;

  @SerializedName("current_period_started_at")
  private DateTime currentPeriodStartedAt;

  @SerializedName("current_term_ends_at")
  private DateTime currentTermEndsAt;

  @SerializedName("current_term_started_at")
  private DateTime currentTermStartedAt;

  @SerializedName("custom_fields")
  private List<CustomField> customFields;

  @SerializedName("customer_notes")
  private String customerNotes;

  @SerializedName("expiration_reason")
  private String expirationReason;

  @SerializedName("expires_at")
  private DateTime expiresAt;

  @SerializedName("id")
  private String id;

  @SerializedName("net_terms")
  private Integer netTerms;

  @SerializedName("object")
  private String object;

  @SerializedName("paused_at")
  private DateTime pausedAt;

  @SerializedName("pending_change")
  private SubscriptionChange pendingChange;

  @SerializedName("plan")
  private PlanMini plan;

  @SerializedName("po_number")
  private String poNumber;

  @SerializedName("quantity")
  private Integer quantity;

  @SerializedName("remaining_billing_cycles")
  private Integer remainingBillingCycles;

  @SerializedName("remaining_pause_cycles")
  private Integer remainingPauseCycles;

  @SerializedName("renewal_billing_cycles")
  private Integer renewalBillingCycles;

  @SerializedName("shipping_address")
  private ShippingAddress shippingAddress;

  @SerializedName("state")
  private String state;

  @SerializedName("subtotal")
  private Float subtotal;

  @SerializedName("terms_and_conditions")
  private String termsAndConditions;

  @SerializedName("total_billing_cycles")
  private Integer totalBillingCycles;

  @SerializedName("trial_ends_at")
  private DateTime trialEndsAt;

  @SerializedName("trial_started_at")
  private DateTime trialStartedAt;

  @SerializedName("unit_amount")
  private Float unitAmount;

  @SerializedName("updated_at")
  private DateTime updatedAt;

  @SerializedName("uuid")
  private String uuid;


  public AccountMini getAccount() { return this.account; }
  public void setAccount(final AccountMini account) { this.account = account; }

  public DateTime getActivatedAt() { return this.activatedAt; }
  public void setActivatedAt(final DateTime activatedAt) { this.activatedAt = activatedAt; }

  public List<SubscriptionAddOn> getAddOns() { return this.addOns; }
  public void setAddOns(final List<SubscriptionAddOn> addOns) { this.addOns = addOns; }

  public Float getAddOnsTotal() { return this.addOnsTotal; }
  public void setAddOnsTotal(final Float addOnsTotal) { this.addOnsTotal = addOnsTotal; }

  public Boolean getAutoRenew() { return this.autoRenew; }
  public void setAutoRenew(final Boolean autoRenew) { this.autoRenew = autoRenew; }

  public DateTime getBankAccountAuthorizedAt() { return this.bankAccountAuthorizedAt; }
  public void setBankAccountAuthorizedAt(final DateTime bankAccountAuthorizedAt) { this.bankAccountAuthorizedAt = bankAccountAuthorizedAt; }

  public DateTime getCanceledAt() { return this.canceledAt; }
  public void setCanceledAt(final DateTime canceledAt) { this.canceledAt = canceledAt; }

  public String getCollectionMethod() { return this.collectionMethod; }
  public void setCollectionMethod(final String collectionMethod) { this.collectionMethod = collectionMethod; }

  public List<CouponRedemptionMini> getCouponRedemptions() { return this.couponRedemptions; }
  public void setCouponRedemptions(final List<CouponRedemptionMini> couponRedemptions) { this.couponRedemptions = couponRedemptions; }

  public DateTime getCreatedAt() { return this.createdAt; }
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  public String getCurrency() { return this.currency; }
  public void setCurrency(final String currency) { this.currency = currency; }

  public DateTime getCurrentPeriodEndsAt() { return this.currentPeriodEndsAt; }
  public void setCurrentPeriodEndsAt(final DateTime currentPeriodEndsAt) { this.currentPeriodEndsAt = currentPeriodEndsAt; }

  public DateTime getCurrentPeriodStartedAt() { return this.currentPeriodStartedAt; }
  public void setCurrentPeriodStartedAt(final DateTime currentPeriodStartedAt) { this.currentPeriodStartedAt = currentPeriodStartedAt; }

  public DateTime getCurrentTermEndsAt() { return this.currentTermEndsAt; }
  public void setCurrentTermEndsAt(final DateTime currentTermEndsAt) { this.currentTermEndsAt = currentTermEndsAt; }

  public DateTime getCurrentTermStartedAt() { return this.currentTermStartedAt; }
  public void setCurrentTermStartedAt(final DateTime currentTermStartedAt) { this.currentTermStartedAt = currentTermStartedAt; }

  public List<CustomField> getCustomFields() { return this.customFields; }
  public void setCustomFields(final List<CustomField> customFields) { this.customFields = customFields; }

  public String getCustomerNotes() { return this.customerNotes; }
  public void setCustomerNotes(final String customerNotes) { this.customerNotes = customerNotes; }

  public String getExpirationReason() { return this.expirationReason; }
  public void setExpirationReason(final String expirationReason) { this.expirationReason = expirationReason; }

  public DateTime getExpiresAt() { return this.expiresAt; }
  public void setExpiresAt(final DateTime expiresAt) { this.expiresAt = expiresAt; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public Integer getNetTerms() { return this.netTerms; }
  public void setNetTerms(final Integer netTerms) { this.netTerms = netTerms; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public DateTime getPausedAt() { return this.pausedAt; }
  public void setPausedAt(final DateTime pausedAt) { this.pausedAt = pausedAt; }

  public SubscriptionChange getPendingChange() { return this.pendingChange; }
  public void setPendingChange(final SubscriptionChange pendingChange) { this.pendingChange = pendingChange; }

  public PlanMini getPlan() { return this.plan; }
  public void setPlan(final PlanMini plan) { this.plan = plan; }

  public String getPoNumber() { return this.poNumber; }
  public void setPoNumber(final String poNumber) { this.poNumber = poNumber; }

  public Integer getQuantity() { return this.quantity; }
  public void setQuantity(final Integer quantity) { this.quantity = quantity; }

  public Integer getRemainingBillingCycles() { return this.remainingBillingCycles; }
  public void setRemainingBillingCycles(final Integer remainingBillingCycles) { this.remainingBillingCycles = remainingBillingCycles; }

  public Integer getRemainingPauseCycles() { return this.remainingPauseCycles; }
  public void setRemainingPauseCycles(final Integer remainingPauseCycles) { this.remainingPauseCycles = remainingPauseCycles; }

  public Integer getRenewalBillingCycles() { return this.renewalBillingCycles; }
  public void setRenewalBillingCycles(final Integer renewalBillingCycles) { this.renewalBillingCycles = renewalBillingCycles; }

  public ShippingAddress getShippingAddress() { return this.shippingAddress; }
  public void setShippingAddress(final ShippingAddress shippingAddress) { this.shippingAddress = shippingAddress; }

  public String getState() { return this.state; }
  public void setState(final String state) { this.state = state; }

  public Float getSubtotal() { return this.subtotal; }
  public void setSubtotal(final Float subtotal) { this.subtotal = subtotal; }

  public String getTermsAndConditions() { return this.termsAndConditions; }
  public void setTermsAndConditions(final String termsAndConditions) { this.termsAndConditions = termsAndConditions; }

  public Integer getTotalBillingCycles() { return this.totalBillingCycles; }
  public void setTotalBillingCycles(final Integer totalBillingCycles) { this.totalBillingCycles = totalBillingCycles; }

  public DateTime getTrialEndsAt() { return this.trialEndsAt; }
  public void setTrialEndsAt(final DateTime trialEndsAt) { this.trialEndsAt = trialEndsAt; }

  public DateTime getTrialStartedAt() { return this.trialStartedAt; }
  public void setTrialStartedAt(final DateTime trialStartedAt) { this.trialStartedAt = trialStartedAt; }

  public Float getUnitAmount() { return this.unitAmount; }
  public void setUnitAmount(final Float unitAmount) { this.unitAmount = unitAmount; }

  public DateTime getUpdatedAt() { return this.updatedAt; }
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

  public String getUuid() { return this.uuid; }
  public void setUuid(final String uuid) { this.uuid = uuid; }

}
