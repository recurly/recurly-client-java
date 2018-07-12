package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class CreateCoupon extends Request {

  @SerializedName("applies_to_all_plans")
  private Boolean appliesToAllPlans;

  @SerializedName("applies_to_non_plan_charges")
  private Boolean appliesToNonPlanCharges;

  @SerializedName("code")
  private String code;

  @SerializedName("coupon_type")
  private String couponType;

  @SerializedName("currencies")
  private List<String> currencies;

  @SerializedName("discount_percent")
  private Integer discountPercent;

  @SerializedName("discount_type")
  private String discountType;

  @SerializedName("duration")
  private String duration;

  @SerializedName("free_trial_amount")
  private Integer freeTrialAmount;

  @SerializedName("free_trial_unit")
  private String freeTrialUnit;

  @SerializedName("hosted_description")
  private String hostedDescription;

  @SerializedName("invoice_description")
  private String invoiceDescription;

  @SerializedName("max_redemptions")
  private Integer maxRedemptions;

  @SerializedName("max_redemptions_per_account")
  private Integer maxRedemptionsPerAccount;

  @SerializedName("name")
  private String name;

  @SerializedName("plan_codes")
  private List<String> planCodes;

  @SerializedName("redeem_by_date")
  private String redeemByDate;

  @SerializedName("redemption_resource")
  private String redemptionResource;

  @SerializedName("temporal_amount")
  private Integer temporalAmount;

  @SerializedName("temporal_unit")
  private String temporalUnit;

  @SerializedName("unique_code_template")
  private String uniqueCodeTemplate;


  public Boolean getAppliesToAllPlans() { return this.appliesToAllPlans; }
  public void setAppliesToAllPlans(final Boolean appliesToAllPlans) { this.appliesToAllPlans = appliesToAllPlans; }

  public Boolean getAppliesToNonPlanCharges() { return this.appliesToNonPlanCharges; }
  public void setAppliesToNonPlanCharges(final Boolean appliesToNonPlanCharges) { this.appliesToNonPlanCharges = appliesToNonPlanCharges; }

  public String getCode() { return this.code; }
  public void setCode(final String code) { this.code = code; }

  public String getCouponType() { return this.couponType; }
  public void setCouponType(final String couponType) { this.couponType = couponType; }

  public List<String> getCurrencies() { return this.currencies; }
  public void setCurrencies(final List<String> currencies) { this.currencies = currencies; }

  public Integer getDiscountPercent() { return this.discountPercent; }
  public void setDiscountPercent(final Integer discountPercent) { this.discountPercent = discountPercent; }

  public String getDiscountType() { return this.discountType; }
  public void setDiscountType(final String discountType) { this.discountType = discountType; }

  public String getDuration() { return this.duration; }
  public void setDuration(final String duration) { this.duration = duration; }

  public Integer getFreeTrialAmount() { return this.freeTrialAmount; }
  public void setFreeTrialAmount(final Integer freeTrialAmount) { this.freeTrialAmount = freeTrialAmount; }

  public String getFreeTrialUnit() { return this.freeTrialUnit; }
  public void setFreeTrialUnit(final String freeTrialUnit) { this.freeTrialUnit = freeTrialUnit; }

  public String getHostedDescription() { return this.hostedDescription; }
  public void setHostedDescription(final String hostedDescription) { this.hostedDescription = hostedDescription; }

  public String getInvoiceDescription() { return this.invoiceDescription; }
  public void setInvoiceDescription(final String invoiceDescription) { this.invoiceDescription = invoiceDescription; }

  public Integer getMaxRedemptions() { return this.maxRedemptions; }
  public void setMaxRedemptions(final Integer maxRedemptions) { this.maxRedemptions = maxRedemptions; }

  public Integer getMaxRedemptionsPerAccount() { return this.maxRedemptionsPerAccount; }
  public void setMaxRedemptionsPerAccount(final Integer maxRedemptionsPerAccount) { this.maxRedemptionsPerAccount = maxRedemptionsPerAccount; }

  public String getName() { return this.name; }
  public void setName(final String name) { this.name = name; }

  public List<String> getPlanCodes() { return this.planCodes; }
  public void setPlanCodes(final List<String> planCodes) { this.planCodes = planCodes; }

  public String getRedeemByDate() { return this.redeemByDate; }
  public void setRedeemByDate(final String redeemByDate) { this.redeemByDate = redeemByDate; }

  public String getRedemptionResource() { return this.redemptionResource; }
  public void setRedemptionResource(final String redemptionResource) { this.redemptionResource = redemptionResource; }

  public Integer getTemporalAmount() { return this.temporalAmount; }
  public void setTemporalAmount(final Integer temporalAmount) { this.temporalAmount = temporalAmount; }

  public String getTemporalUnit() { return this.temporalUnit; }
  public void setTemporalUnit(final String temporalUnit) { this.temporalUnit = temporalUnit; }

  public String getUniqueCodeTemplate() { return this.uniqueCodeTemplate; }
  public void setUniqueCodeTemplate(final String uniqueCodeTemplate) { this.uniqueCodeTemplate = uniqueCodeTemplate; }

}
