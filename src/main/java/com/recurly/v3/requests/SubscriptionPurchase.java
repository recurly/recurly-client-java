package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class SubscriptionPurchase extends Request {

  @SerializedName("add_ons")
  @Expose
  private List<SubscriptionAddOnCreate> addOns;

  @SerializedName("auto_renew")
  @Expose
  private Boolean autoRenew;

  @SerializedName("custom_fields")
  @Expose
  private List<CustomField> customFields;

  @SerializedName("next_bill_date")
  @Expose
  private DateTime nextBillDate;

  @SerializedName("plan_code")
  @Expose
  private String planCode;

  @SerializedName("plan_id")
  @Expose
  private String planId;

  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  @SerializedName("renewal_billing_cycles")
  @Expose
  private Integer renewalBillingCycles;

  @SerializedName("shipping")
  @Expose
  private SubscriptionShippingPurchase shipping;

  @SerializedName("total_billing_cycles")
  @Expose
  private Integer totalBillingCycles;

  @SerializedName("trial_ends_at")
  @Expose
  private DateTime trialEndsAt;

  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;


  public List<SubscriptionAddOnCreate> getAddOns() { return this.addOns; }
  public void setAddOns(final List<SubscriptionAddOnCreate> addOns) { this.addOns = addOns; }

  public Boolean getAutoRenew() { return this.autoRenew; }
  public void setAutoRenew(final Boolean autoRenew) { this.autoRenew = autoRenew; }

  public List<CustomField> getCustomFields() { return this.customFields; }
  public void setCustomFields(final List<CustomField> customFields) { this.customFields = customFields; }

  public DateTime getNextBillDate() { return this.nextBillDate; }
  public void setNextBillDate(final DateTime nextBillDate) { this.nextBillDate = nextBillDate; }

  public String getPlanCode() { return this.planCode; }
  public void setPlanCode(final String planCode) { this.planCode = planCode; }

  public String getPlanId() { return this.planId; }
  public void setPlanId(final String planId) { this.planId = planId; }

  public Integer getQuantity() { return this.quantity; }
  public void setQuantity(final Integer quantity) { this.quantity = quantity; }

  public Integer getRenewalBillingCycles() { return this.renewalBillingCycles; }
  public void setRenewalBillingCycles(final Integer renewalBillingCycles) { this.renewalBillingCycles = renewalBillingCycles; }

  public SubscriptionShippingPurchase getShipping() { return this.shipping; }
  public void setShipping(final SubscriptionShippingPurchase shipping) { this.shipping = shipping; }

  public Integer getTotalBillingCycles() { return this.totalBillingCycles; }
  public void setTotalBillingCycles(final Integer totalBillingCycles) { this.totalBillingCycles = totalBillingCycles; }

  public DateTime getTrialEndsAt() { return this.trialEndsAt; }
  public void setTrialEndsAt(final DateTime trialEndsAt) { this.trialEndsAt = trialEndsAt; }

  public Float getUnitAmount() { return this.unitAmount; }
  public void setUnitAmount(final Float unitAmount) { this.unitAmount = unitAmount; }

}
