package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class Coupon extends Resource {

  @SerializedName("applies_to_all_plans")
  @Expose
  private Boolean appliesToAllPlans;

  @SerializedName("applies_to_non_plan_charges")
  @Expose
  private Boolean appliesToNonPlanCharges;

  @SerializedName("code")
  @Expose
  private String code;

  @SerializedName("coupon_type")
  @Expose
  private String couponType;

  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  @SerializedName("discount")
  @Expose
  private CouponDiscount discount;

  @SerializedName("duration")
  @Expose
  private String duration;

  @SerializedName("expired_at")
  @Expose
  private DateTime expiredAt;

  @SerializedName("free_trial_amount")
  @Expose
  private Integer freeTrialAmount;

  @SerializedName("free_trial_unit")
  @Expose
  private String freeTrialUnit;

  @SerializedName("hosted_page_description")
  @Expose
  private String hostedPageDescription;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("invoice_description")
  @Expose
  private String invoiceDescription;

  @SerializedName("max_redemptions")
  @Expose
  private Integer maxRedemptions;

  @SerializedName("max_redemptions_per_account")
  @Expose
  private Integer maxRedemptionsPerAccount;

  @SerializedName("name")
  @Expose
  private String name;

  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("plans_names")
  @Expose
  private List<String> plansNames;

  @SerializedName("redeem_by")
  @Expose
  private DateTime redeemBy;

  @SerializedName("redemption_resource")
  @Expose
  private String redemptionResource;

  @SerializedName("state")
  @Expose
  private String state;

  @SerializedName("temporal_amount")
  @Expose
  private Integer temporalAmount;

  @SerializedName("temporal_unit")
  @Expose
  private String temporalUnit;

  @SerializedName("unique_code_template")
  @Expose
  private String uniqueCodeTemplate;

  @SerializedName("unique_coupon_codes_count")
  @Expose
  private Integer uniqueCouponCodesCount;

  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;


  public Boolean getAppliesToAllPlans() { return this.appliesToAllPlans; }
  public void setAppliesToAllPlans(final Boolean appliesToAllPlans) { this.appliesToAllPlans = appliesToAllPlans; }

  public Boolean getAppliesToNonPlanCharges() { return this.appliesToNonPlanCharges; }
  public void setAppliesToNonPlanCharges(final Boolean appliesToNonPlanCharges) { this.appliesToNonPlanCharges = appliesToNonPlanCharges; }

  public String getCode() { return this.code; }
  public void setCode(final String code) { this.code = code; }

  public String getCouponType() { return this.couponType; }
  public void setCouponType(final String couponType) { this.couponType = couponType; }

  public DateTime getCreatedAt() { return this.createdAt; }
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  public CouponDiscount getDiscount() { return this.discount; }
  public void setDiscount(final CouponDiscount discount) { this.discount = discount; }

  public String getDuration() { return this.duration; }
  public void setDuration(final String duration) { this.duration = duration; }

  public DateTime getExpiredAt() { return this.expiredAt; }
  public void setExpiredAt(final DateTime expiredAt) { this.expiredAt = expiredAt; }

  public Integer getFreeTrialAmount() { return this.freeTrialAmount; }
  public void setFreeTrialAmount(final Integer freeTrialAmount) { this.freeTrialAmount = freeTrialAmount; }

  public String getFreeTrialUnit() { return this.freeTrialUnit; }
  public void setFreeTrialUnit(final String freeTrialUnit) { this.freeTrialUnit = freeTrialUnit; }

  public String getHostedPageDescription() { return this.hostedPageDescription; }
  public void setHostedPageDescription(final String hostedPageDescription) { this.hostedPageDescription = hostedPageDescription; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getInvoiceDescription() { return this.invoiceDescription; }
  public void setInvoiceDescription(final String invoiceDescription) { this.invoiceDescription = invoiceDescription; }

  public Integer getMaxRedemptions() { return this.maxRedemptions; }
  public void setMaxRedemptions(final Integer maxRedemptions) { this.maxRedemptions = maxRedemptions; }

  public Integer getMaxRedemptionsPerAccount() { return this.maxRedemptionsPerAccount; }
  public void setMaxRedemptionsPerAccount(final Integer maxRedemptionsPerAccount) { this.maxRedemptionsPerAccount = maxRedemptionsPerAccount; }

  public String getName() { return this.name; }
  public void setName(final String name) { this.name = name; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public List<String> getPlansNames() { return this.plansNames; }
  public void setPlansNames(final List<String> plansNames) { this.plansNames = plansNames; }

  public DateTime getRedeemBy() { return this.redeemBy; }
  public void setRedeemBy(final DateTime redeemBy) { this.redeemBy = redeemBy; }

  public String getRedemptionResource() { return this.redemptionResource; }
  public void setRedemptionResource(final String redemptionResource) { this.redemptionResource = redemptionResource; }

  public String getState() { return this.state; }
  public void setState(final String state) { this.state = state; }

  public Integer getTemporalAmount() { return this.temporalAmount; }
  public void setTemporalAmount(final Integer temporalAmount) { this.temporalAmount = temporalAmount; }

  public String getTemporalUnit() { return this.temporalUnit; }
  public void setTemporalUnit(final String temporalUnit) { this.temporalUnit = temporalUnit; }

  public String getUniqueCodeTemplate() { return this.uniqueCodeTemplate; }
  public void setUniqueCodeTemplate(final String uniqueCodeTemplate) { this.uniqueCodeTemplate = uniqueCodeTemplate; }

  public Integer getUniqueCouponCodesCount() { return this.uniqueCouponCodesCount; }
  public void setUniqueCouponCodesCount(final Integer uniqueCouponCodesCount) { this.uniqueCouponCodesCount = uniqueCouponCodesCount; }

  public DateTime getUpdatedAt() { return this.updatedAt; }
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

}
