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

public class CouponCreate extends Request {

  /**
   * The coupon is valid for all plans if true. If false then `plans` will list the applicable
   * plans.
   */
  @SerializedName("applies_to_all_plans")
  @Expose
  private Boolean appliesToAllPlans;

  /** The coupon is valid for one-time, non-plan charges if true. */
  @SerializedName("applies_to_non_plan_charges")
  @Expose
  private Boolean appliesToNonPlanCharges;

  /** The code the customer enters to redeem the coupon. */
  @SerializedName("code")
  @Expose
  private String code;

  /**
   * Whether the coupon is "single_code" or "bulk". Bulk coupons will require a
   * `unique_code_template` and will generate unique codes through the `/generate` endpoint.
   */
  @SerializedName("coupon_type")
  @Expose
  private String couponType;

  /**
   * Fixed discount currencies by currency. Required if the coupon type is `fixed`. This parameter
   * should contain the coupon discount values
   */
  @SerializedName("currencies")
  @Expose
  private List<CouponPricing> currencies;

  /**
   * The percent of the price discounted by the coupon. Required if `discount_type` is `percent`.
   */
  @SerializedName("discount_percent")
  @Expose
  private Integer discountPercent;

  /** The type of discount provided by the coupon (how the amount discounted is calculated) */
  @SerializedName("discount_type")
  @Expose
  private String discountType;

  /**
   * This field does not apply when the discount_type is `free_trial`. - "single_use" coupons
   * applies to the first invoice only. - "temporal" coupons will apply to invoices for the duration
   * determined by the `temporal_unit` and `temporal_amount` attributes. - "forever" coupons will
   * apply to invoices forever.
   */
  @SerializedName("duration")
  @Expose
  private String duration;

  /**
   * Sets the duration of time the `free_trial_unit` is for. Required if `discount_type` is
   * `free_trial`.
   */
  @SerializedName("free_trial_amount")
  @Expose
  private Integer freeTrialAmount;

  /**
   * Description of the unit of time the coupon is for. Used with `free_trial_amount` to determine
   * the duration of time the coupon is for. Required if `discount_type` is `free_trial`.
   */
  @SerializedName("free_trial_unit")
  @Expose
  private String freeTrialUnit;

  /**
   * This description will show up when a customer redeems a coupon on your Hosted Payment Pages, or
   * if you choose to show the description on your own checkout page.
   */
  @SerializedName("hosted_description")
  @Expose
  private String hostedDescription;

  /** Description of the coupon on the invoice. */
  @SerializedName("invoice_description")
  @Expose
  private String invoiceDescription;

  /**
   * A maximum number of redemptions for the coupon. The coupon will expire when it hits its maximum
   * redemptions.
   */
  @SerializedName("max_redemptions")
  @Expose
  private Integer maxRedemptions;

  /**
   * Redemptions per account is the number of times a specific account can redeem the coupon. Set
   * redemptions per account to `1` if you want to keep customers from gaming the system and getting
   * more than one discount from the coupon campaign.
   */
  @SerializedName("max_redemptions_per_account")
  @Expose
  private Integer maxRedemptionsPerAccount;

  /** The internal name for the coupon. */
  @SerializedName("name")
  @Expose
  private String name;

  /**
   * List of plan codes to which this coupon applies. Required if `applies_to_all_plans` is false.
   * Overrides `applies_to_all_plans` when `applies_to_all_plans` is true.
   */
  @SerializedName("plan_codes")
  @Expose
  private List<String> planCodes;

  /**
   * The date and time the coupon will expire and can no longer be redeemed. Time is always
   * 11:59:59, the end-of-day Pacific time.
   */
  @SerializedName("redeem_by_date")
  @Expose
  private String redeemByDate;

  /**
   * Whether the discount is for all eligible charges on the account, or only a specific
   * subscription.
   */
  @SerializedName("redemption_resource")
  @Expose
  private String redemptionResource;

  /**
   * If `duration` is "temporal" than `temporal_amount` is an integer which is multiplied by
   * `temporal_unit` to define the duration that the coupon will be applied to invoices for.
   */
  @SerializedName("temporal_amount")
  @Expose
  private Integer temporalAmount;

  /**
   * If `duration` is "temporal" than `temporal_unit` is multiplied by `temporal_amount` to define
   * the duration that the coupon will be applied to invoices for.
   */
  @SerializedName("temporal_unit")
  @Expose
  private String temporalUnit;

  /**
   * On a bulk coupon, the template from which unique coupon codes are generated. - You must start
   * the template with your coupon_code wrapped in single quotes. - Outside of single quotes, use a
   * 9 for a character that you want to be a random number. - Outside of single quotes, use an "x"
   * for a character that you want to be a random letter. - Outside of single quotes, use an * for a
   * character that you want to be a random number or letter. - Use single quotes ' ' for characters
   * that you want to remain static. These strings can be alphanumeric and may contain a - _ or +.
   * For example: "'abc-'****'-def'"
   */
  @SerializedName("unique_code_template")
  @Expose
  private String uniqueCodeTemplate;

  /**
   * The coupon is valid for all plans if true. If false then `plans` will list the applicable
   * plans.
   */
  public Boolean getAppliesToAllPlans() {
    return this.appliesToAllPlans;
  }

  /**
   * @param appliesToAllPlans The coupon is valid for all plans if true. If false then `plans` will
   *     list the applicable plans.
   */
  public void setAppliesToAllPlans(final Boolean appliesToAllPlans) {
    this.appliesToAllPlans = appliesToAllPlans;
  }

  /** The coupon is valid for one-time, non-plan charges if true. */
  public Boolean getAppliesToNonPlanCharges() {
    return this.appliesToNonPlanCharges;
  }

  /** @param appliesToNonPlanCharges The coupon is valid for one-time, non-plan charges if true. */
  public void setAppliesToNonPlanCharges(final Boolean appliesToNonPlanCharges) {
    this.appliesToNonPlanCharges = appliesToNonPlanCharges;
  }

  /** The code the customer enters to redeem the coupon. */
  public String getCode() {
    return this.code;
  }

  /** @param code The code the customer enters to redeem the coupon. */
  public void setCode(final String code) {
    this.code = code;
  }

  /**
   * Whether the coupon is "single_code" or "bulk". Bulk coupons will require a
   * `unique_code_template` and will generate unique codes through the `/generate` endpoint.
   */
  public String getCouponType() {
    return this.couponType;
  }

  /**
   * @param couponType Whether the coupon is "single_code" or "bulk". Bulk coupons will require a
   *     `unique_code_template` and will generate unique codes through the `/generate` endpoint.
   */
  public void setCouponType(final String couponType) {
    this.couponType = couponType;
  }

  /**
   * Fixed discount currencies by currency. Required if the coupon type is `fixed`. This parameter
   * should contain the coupon discount values
   */
  public List<CouponPricing> getCurrencies() {
    return this.currencies;
  }

  /**
   * @param currencies Fixed discount currencies by currency. Required if the coupon type is
   *     `fixed`. This parameter should contain the coupon discount values
   */
  public void setCurrencies(final List<CouponPricing> currencies) {
    this.currencies = currencies;
  }

  /**
   * The percent of the price discounted by the coupon. Required if `discount_type` is `percent`.
   */
  public Integer getDiscountPercent() {
    return this.discountPercent;
  }

  /**
   * @param discountPercent The percent of the price discounted by the coupon. Required if
   *     `discount_type` is `percent`.
   */
  public void setDiscountPercent(final Integer discountPercent) {
    this.discountPercent = discountPercent;
  }

  /** The type of discount provided by the coupon (how the amount discounted is calculated) */
  public String getDiscountType() {
    return this.discountType;
  }

  /**
   * @param discountType The type of discount provided by the coupon (how the amount discounted is
   *     calculated)
   */
  public void setDiscountType(final String discountType) {
    this.discountType = discountType;
  }

  /**
   * This field does not apply when the discount_type is `free_trial`. - "single_use" coupons
   * applies to the first invoice only. - "temporal" coupons will apply to invoices for the duration
   * determined by the `temporal_unit` and `temporal_amount` attributes. - "forever" coupons will
   * apply to invoices forever.
   */
  public String getDuration() {
    return this.duration;
  }

  /**
   * @param duration This field does not apply when the discount_type is `free_trial`. -
   *     "single_use" coupons applies to the first invoice only. - "temporal" coupons will apply to
   *     invoices for the duration determined by the `temporal_unit` and `temporal_amount`
   *     attributes. - "forever" coupons will apply to invoices forever.
   */
  public void setDuration(final String duration) {
    this.duration = duration;
  }

  /**
   * Sets the duration of time the `free_trial_unit` is for. Required if `discount_type` is
   * `free_trial`.
   */
  public Integer getFreeTrialAmount() {
    return this.freeTrialAmount;
  }

  /**
   * @param freeTrialAmount Sets the duration of time the `free_trial_unit` is for. Required if
   *     `discount_type` is `free_trial`.
   */
  public void setFreeTrialAmount(final Integer freeTrialAmount) {
    this.freeTrialAmount = freeTrialAmount;
  }

  /**
   * Description of the unit of time the coupon is for. Used with `free_trial_amount` to determine
   * the duration of time the coupon is for. Required if `discount_type` is `free_trial`.
   */
  public String getFreeTrialUnit() {
    return this.freeTrialUnit;
  }

  /**
   * @param freeTrialUnit Description of the unit of time the coupon is for. Used with
   *     `free_trial_amount` to determine the duration of time the coupon is for. Required if
   *     `discount_type` is `free_trial`.
   */
  public void setFreeTrialUnit(final String freeTrialUnit) {
    this.freeTrialUnit = freeTrialUnit;
  }

  /**
   * This description will show up when a customer redeems a coupon on your Hosted Payment Pages, or
   * if you choose to show the description on your own checkout page.
   */
  public String getHostedDescription() {
    return this.hostedDescription;
  }

  /**
   * @param hostedDescription This description will show up when a customer redeems a coupon on your
   *     Hosted Payment Pages, or if you choose to show the description on your own checkout page.
   */
  public void setHostedDescription(final String hostedDescription) {
    this.hostedDescription = hostedDescription;
  }

  /** Description of the coupon on the invoice. */
  public String getInvoiceDescription() {
    return this.invoiceDescription;
  }

  /** @param invoiceDescription Description of the coupon on the invoice. */
  public void setInvoiceDescription(final String invoiceDescription) {
    this.invoiceDescription = invoiceDescription;
  }

  /**
   * A maximum number of redemptions for the coupon. The coupon will expire when it hits its maximum
   * redemptions.
   */
  public Integer getMaxRedemptions() {
    return this.maxRedemptions;
  }

  /**
   * @param maxRedemptions A maximum number of redemptions for the coupon. The coupon will expire
   *     when it hits its maximum redemptions.
   */
  public void setMaxRedemptions(final Integer maxRedemptions) {
    this.maxRedemptions = maxRedemptions;
  }

  /**
   * Redemptions per account is the number of times a specific account can redeem the coupon. Set
   * redemptions per account to `1` if you want to keep customers from gaming the system and getting
   * more than one discount from the coupon campaign.
   */
  public Integer getMaxRedemptionsPerAccount() {
    return this.maxRedemptionsPerAccount;
  }

  /**
   * @param maxRedemptionsPerAccount Redemptions per account is the number of times a specific
   *     account can redeem the coupon. Set redemptions per account to `1` if you want to keep
   *     customers from gaming the system and getting more than one discount from the coupon
   *     campaign.
   */
  public void setMaxRedemptionsPerAccount(final Integer maxRedemptionsPerAccount) {
    this.maxRedemptionsPerAccount = maxRedemptionsPerAccount;
  }

  /** The internal name for the coupon. */
  public String getName() {
    return this.name;
  }

  /** @param name The internal name for the coupon. */
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * List of plan codes to which this coupon applies. Required if `applies_to_all_plans` is false.
   * Overrides `applies_to_all_plans` when `applies_to_all_plans` is true.
   */
  public List<String> getPlanCodes() {
    return this.planCodes;
  }

  /**
   * @param planCodes List of plan codes to which this coupon applies. Required if
   *     `applies_to_all_plans` is false. Overrides `applies_to_all_plans` when
   *     `applies_to_all_plans` is true.
   */
  public void setPlanCodes(final List<String> planCodes) {
    this.planCodes = planCodes;
  }

  /**
   * The date and time the coupon will expire and can no longer be redeemed. Time is always
   * 11:59:59, the end-of-day Pacific time.
   */
  public String getRedeemByDate() {
    return this.redeemByDate;
  }

  /**
   * @param redeemByDate The date and time the coupon will expire and can no longer be redeemed.
   *     Time is always 11:59:59, the end-of-day Pacific time.
   */
  public void setRedeemByDate(final String redeemByDate) {
    this.redeemByDate = redeemByDate;
  }

  /**
   * Whether the discount is for all eligible charges on the account, or only a specific
   * subscription.
   */
  public String getRedemptionResource() {
    return this.redemptionResource;
  }

  /**
   * @param redemptionResource Whether the discount is for all eligible charges on the account, or
   *     only a specific subscription.
   */
  public void setRedemptionResource(final String redemptionResource) {
    this.redemptionResource = redemptionResource;
  }

  /**
   * If `duration` is "temporal" than `temporal_amount` is an integer which is multiplied by
   * `temporal_unit` to define the duration that the coupon will be applied to invoices for.
   */
  public Integer getTemporalAmount() {
    return this.temporalAmount;
  }

  /**
   * @param temporalAmount If `duration` is "temporal" than `temporal_amount` is an integer which is
   *     multiplied by `temporal_unit` to define the duration that the coupon will be applied to
   *     invoices for.
   */
  public void setTemporalAmount(final Integer temporalAmount) {
    this.temporalAmount = temporalAmount;
  }

  /**
   * If `duration` is "temporal" than `temporal_unit` is multiplied by `temporal_amount` to define
   * the duration that the coupon will be applied to invoices for.
   */
  public String getTemporalUnit() {
    return this.temporalUnit;
  }

  /**
   * @param temporalUnit If `duration` is "temporal" than `temporal_unit` is multiplied by
   *     `temporal_amount` to define the duration that the coupon will be applied to invoices for.
   */
  public void setTemporalUnit(final String temporalUnit) {
    this.temporalUnit = temporalUnit;
  }

  /**
   * On a bulk coupon, the template from which unique coupon codes are generated. - You must start
   * the template with your coupon_code wrapped in single quotes. - Outside of single quotes, use a
   * 9 for a character that you want to be a random number. - Outside of single quotes, use an "x"
   * for a character that you want to be a random letter. - Outside of single quotes, use an * for a
   * character that you want to be a random number or letter. - Use single quotes ' ' for characters
   * that you want to remain static. These strings can be alphanumeric and may contain a - _ or +.
   * For example: "'abc-'****'-def'"
   */
  public String getUniqueCodeTemplate() {
    return this.uniqueCodeTemplate;
  }

  /**
   * @param uniqueCodeTemplate On a bulk coupon, the template from which unique coupon codes are
   *     generated. - You must start the template with your coupon_code wrapped in single quotes. -
   *     Outside of single quotes, use a 9 for a character that you want to be a random number. -
   *     Outside of single quotes, use an "x" for a character that you want to be a random letter. -
   *     Outside of single quotes, use an * for a character that you want to be a random number or
   *     letter. - Use single quotes ' ' for characters that you want to remain static. These
   *     strings can be alphanumeric and may contain a - _ or +. For example: "'abc-'****'-def'"
   */
  public void setUniqueCodeTemplate(final String uniqueCodeTemplate) {
    this.uniqueCodeTemplate = uniqueCodeTemplate;
  }
}
