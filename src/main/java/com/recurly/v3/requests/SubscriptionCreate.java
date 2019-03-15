package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class SubscriptionCreate extends Request {

  @SerializedName("account")
  private AccountCreate account;

  @SerializedName("add_ons")
  private List<SubscriptionAddOnCreate> addOns;

  @SerializedName("auto_renew")
  private Boolean autoRenew;

  @SerializedName("collection_method")
  private String collectionMethod;

  @SerializedName("coupon_code")
  private String couponCode;

  @SerializedName("credit_customer_notes")
  private String creditCustomerNotes;

  @SerializedName("currency")
  private String currency;

  @SerializedName("custom_fields")
  private List<CustomField> customFields;

  @SerializedName("customer_notes")
  private String customerNotes;

  @SerializedName("net_terms")
  private Integer netTerms;

  @SerializedName("next_bill_date")
  private DateTime nextBillDate;

  @SerializedName("plan_code")
  private String planCode;

  @SerializedName("plan_id")
  private String planId;

  @SerializedName("po_number")
  private String poNumber;

  @SerializedName("quantity")
  private Integer quantity;

  @SerializedName("renewal_billing_cycles")
  private Integer renewalBillingCycles;

  @SerializedName("shipping_address")
  private Map<String, String> shippingAddress;

  @SerializedName("shipping_address_id")
  private String shippingAddressId;

  @SerializedName("starts_at")
  private DateTime startsAt;

  @SerializedName("terms_and_conditions")
  private String termsAndConditions;

  @SerializedName("total_billing_cycles")
  private Integer totalBillingCycles;

  @SerializedName("trial_ends_at")
  private DateTime trialEndsAt;

  @SerializedName("unit_amount")
  private Float unitAmount;


  public AccountCreate getAccount() { return this.account; }
  public void setAccount(final AccountCreate account) { this.account = account; }

  public List<SubscriptionAddOnCreate> getAddOns() { return this.addOns; }
  public void setAddOns(final List<SubscriptionAddOnCreate> addOns) { this.addOns = addOns; }

  public Boolean getAutoRenew() { return this.autoRenew; }
  public void setAutoRenew(final Boolean autoRenew) { this.autoRenew = autoRenew; }

  public String getCollectionMethod() { return this.collectionMethod; }
  public void setCollectionMethod(final String collectionMethod) { this.collectionMethod = collectionMethod; }

  public String getCouponCode() { return this.couponCode; }
  public void setCouponCode(final String couponCode) { this.couponCode = couponCode; }

  public String getCreditCustomerNotes() { return this.creditCustomerNotes; }
  public void setCreditCustomerNotes(final String creditCustomerNotes) { this.creditCustomerNotes = creditCustomerNotes; }

  public String getCurrency() { return this.currency; }
  public void setCurrency(final String currency) { this.currency = currency; }

  public List<CustomField> getCustomFields() { return this.customFields; }
  public void setCustomFields(final List<CustomField> customFields) { this.customFields = customFields; }

  public String getCustomerNotes() { return this.customerNotes; }
  public void setCustomerNotes(final String customerNotes) { this.customerNotes = customerNotes; }

  public Integer getNetTerms() { return this.netTerms; }
  public void setNetTerms(final Integer netTerms) { this.netTerms = netTerms; }

  public DateTime getNextBillDate() { return this.nextBillDate; }
  public void setNextBillDate(final DateTime nextBillDate) { this.nextBillDate = nextBillDate; }

  public String getPlanCode() { return this.planCode; }
  public void setPlanCode(final String planCode) { this.planCode = planCode; }

  public String getPlanId() { return this.planId; }
  public void setPlanId(final String planId) { this.planId = planId; }

  public String getPoNumber() { return this.poNumber; }
  public void setPoNumber(final String poNumber) { this.poNumber = poNumber; }

  public Integer getQuantity() { return this.quantity; }
  public void setQuantity(final Integer quantity) { this.quantity = quantity; }

  public Integer getRenewalBillingCycles() { return this.renewalBillingCycles; }
  public void setRenewalBillingCycles(final Integer renewalBillingCycles) { this.renewalBillingCycles = renewalBillingCycles; }

  public Map<String, String> getShippingAddress() { return this.shippingAddress; }
  public void setShippingAddress(final Map<String, String> shippingAddress) { this.shippingAddress = shippingAddress; }

  public String getShippingAddressId() { return this.shippingAddressId; }
  public void setShippingAddressId(final String shippingAddressId) { this.shippingAddressId = shippingAddressId; }

  public DateTime getStartsAt() { return this.startsAt; }
  public void setStartsAt(final DateTime startsAt) { this.startsAt = startsAt; }

  public String getTermsAndConditions() { return this.termsAndConditions; }
  public void setTermsAndConditions(final String termsAndConditions) { this.termsAndConditions = termsAndConditions; }

  public Integer getTotalBillingCycles() { return this.totalBillingCycles; }
  public void setTotalBillingCycles(final Integer totalBillingCycles) { this.totalBillingCycles = totalBillingCycles; }

  public DateTime getTrialEndsAt() { return this.trialEndsAt; }
  public void setTrialEndsAt(final DateTime trialEndsAt) { this.trialEndsAt = trialEndsAt; }

  public Float getUnitAmount() { return this.unitAmount; }
  public void setUnitAmount(final Float unitAmount) { this.unitAmount = unitAmount; }

}
