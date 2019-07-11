package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class SubscriptionCreate extends Request {

  @SerializedName("account")
  @Expose
  private AccountCreate account;

  @SerializedName("add_ons")
  @Expose
  private List<SubscriptionAddOnCreate> addOns;

  @SerializedName("auto_renew")
  @Expose
  private Boolean autoRenew;

  @SerializedName("collection_method")
  @Expose
  private String collectionMethod;

  @SerializedName("coupon_code")
  @Expose
  private String couponCode;

  @SerializedName("credit_customer_notes")
  @Expose
  private String creditCustomerNotes;

  @SerializedName("currency")
  @Expose
  private String currency;

  @SerializedName("custom_fields")
  @Expose
  private List<CustomField> customFields;

  @SerializedName("customer_notes")
  @Expose
  private String customerNotes;

  @SerializedName("net_terms")
  @Expose
  private Integer netTerms;

  @SerializedName("next_bill_date")
  @Expose
  private DateTime nextBillDate;

  @SerializedName("plan_code")
  @Expose
  private String planCode;

  @SerializedName("plan_id")
  @Expose
  private String planId;

  @SerializedName("po_number")
  @Expose
  private String poNumber;

  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  @SerializedName("renewal_billing_cycles")
  @Expose
  private Integer renewalBillingCycles;

  @SerializedName("shipping_address")
  @Expose
  private ShippingAddressCreate shippingAddress;

  @SerializedName("shipping_address_id")
  @Expose
  private String shippingAddressId;

  @SerializedName("starts_at")
  @Expose
  private DateTime startsAt;

  @SerializedName("terms_and_conditions")
  @Expose
  private String termsAndConditions;

  @SerializedName("total_billing_cycles")
  @Expose
  private Integer totalBillingCycles;

  @SerializedName("trial_ends_at")
  @Expose
  private DateTime trialEndsAt;

  @SerializedName("unit_amount")
  @Expose
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

  public ShippingAddressCreate getShippingAddress() { return this.shippingAddress; }
  public void setShippingAddress(final ShippingAddressCreate shippingAddress) { this.shippingAddress = shippingAddress; }

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
