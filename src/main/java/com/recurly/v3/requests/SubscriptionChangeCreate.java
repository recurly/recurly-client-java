package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class SubscriptionChangeCreate extends Request {

  @SerializedName("add_ons")
  @Expose
  private List<SubscriptionAddOnCreate> addOns;

  @SerializedName("collection_method")
  @Expose
  private String collectionMethod;

  @SerializedName("coupon_codes")
  @Expose
  private List<String> couponCodes;

  @SerializedName("net_terms")
  @Expose
  private Integer netTerms;

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

  @SerializedName("timeframe")
  @Expose
  private String timeframe;

  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;


  public List<SubscriptionAddOnCreate> getAddOns() { return this.addOns; }
  public void setAddOns(final List<SubscriptionAddOnCreate> addOns) { this.addOns = addOns; }

  public String getCollectionMethod() { return this.collectionMethod; }
  public void setCollectionMethod(final String collectionMethod) { this.collectionMethod = collectionMethod; }

  public List<String> getCouponCodes() { return this.couponCodes; }
  public void setCouponCodes(final List<String> couponCodes) { this.couponCodes = couponCodes; }

  public Integer getNetTerms() { return this.netTerms; }
  public void setNetTerms(final Integer netTerms) { this.netTerms = netTerms; }

  public String getPlanCode() { return this.planCode; }
  public void setPlanCode(final String planCode) { this.planCode = planCode; }

  public String getPlanId() { return this.planId; }
  public void setPlanId(final String planId) { this.planId = planId; }

  public String getPoNumber() { return this.poNumber; }
  public void setPoNumber(final String poNumber) { this.poNumber = poNumber; }

  public Integer getQuantity() { return this.quantity; }
  public void setQuantity(final Integer quantity) { this.quantity = quantity; }

  public String getTimeframe() { return this.timeframe; }
  public void setTimeframe(final String timeframe) { this.timeframe = timeframe; }

  public Float getUnitAmount() { return this.unitAmount; }
  public void setUnitAmount(final Float unitAmount) { this.unitAmount = unitAmount; }

}
