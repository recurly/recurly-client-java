/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import com.recurly.v3.Constants;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

public class Coupon extends Resource {

  
  /**
   * The coupon is valid for all items if true. If false then `items`
will list the applicable items.

   */
  
  @SerializedName("applies_to_all_items")
  @Expose
  private Boolean appliesToAllItems;

  
  /**
   * The coupon is valid for all plans if true. If false then `plans` will list the applicable plans.
   */
  
  @SerializedName("applies_to_all_plans")
  @Expose
  private Boolean appliesToAllPlans;

  
  /**
   * The coupon is valid for one-time, non-plan charges if true.
   */
  
  @SerializedName("applies_to_non_plan_charges")
  @Expose
  private Boolean appliesToNonPlanCharges;

  
  /**
   * The code the customer enters to redeem the coupon.
   */
  
  @SerializedName("code")
  @Expose
  private String code;

  
  /**
   * Whether the coupon is "single_code" or "bulk". Bulk coupons will require a `unique_code_template` and will generate unique codes through the `/generate` endpoint.
   */
  
  @SerializedName("coupon_type")
  @Expose
  private Constants.CouponType couponType;

  
  /**
   * Created at
   */
  
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  
  /**
   * Details of the discount a coupon applies. Will contain a `type`
property and one of the following properties: `percent`, `fixed`, `trial`.

   */
  
  @SerializedName("discount")
  @Expose
  private CouponDiscount discount;

  
  /**
   * - "single_use" coupons applies to the first invoice only.
- "temporal" coupons will apply to invoices for the duration determined by the `temporal_unit` and `temporal_amount` attributes.

   */
  
  @SerializedName("duration")
  @Expose
  private Constants.CouponDuration duration;

  
  /**
   * The date and time the coupon was expired early or reached its `max_redemptions`.
   */
  
  @SerializedName("expired_at")
  @Expose
  private DateTime expiredAt;

  
  /**
   * Sets the duration of time the `free_trial_unit` is for.
   */
  
  @SerializedName("free_trial_amount")
  @Expose
  private Integer freeTrialAmount;

  
  /**
   * Description of the unit of time the coupon is for. Used with `free_trial_amount` to determine the duration of time the coupon is for.
   */
  
  @SerializedName("free_trial_unit")
  @Expose
  private Constants.FreeTrialUnit freeTrialUnit;

  
  /**
   * This description will show up when a customer redeems a coupon on your Hosted Payment Pages, or if you choose to show the description on your own checkout page.
   */
  
  @SerializedName("hosted_page_description")
  @Expose
  private String hostedPageDescription;

  
  /**
   * Coupon ID
   */
  
  @SerializedName("id")
  @Expose
  private String id;

  
  /**
   * Description of the coupon on the invoice.
   */
  
  @SerializedName("invoice_description")
  @Expose
  private String invoiceDescription;

  
  /**
   * A list of items for which this coupon applies. This will be
`null` if `applies_to_all_items=true`.

   */
  
  @SerializedName("items")
  @Expose
  private List<ItemMini> items;

  
  /**
   * A maximum number of redemptions for the coupon. The coupon will expire when it hits its maximum redemptions.
   */
  
  @SerializedName("max_redemptions")
  @Expose
  private Integer maxRedemptions;

  
  /**
   * Redemptions per account is the number of times a specific account can redeem the coupon. Set redemptions per account to `1` if you want to keep customers from gaming the system and getting more than one discount from the coupon campaign.
   */
  
  @SerializedName("max_redemptions_per_account")
  @Expose
  private Integer maxRedemptionsPerAccount;

  
  /**
   * The internal name for the coupon.
   */
  
  @SerializedName("name")
  @Expose
  private String name;

  
  /**
   * Object type
   */
  
  @SerializedName("object")
  @Expose
  private String object;

  
  /**
   * A list of plans for which this coupon applies. This will be `null` if `applies_to_all_plans=true`.
   */
  
  @SerializedName("plans")
  @Expose
  private List<PlanMini> plans;

  
  /**
   * The date and time the coupon will expire and can no longer be redeemed. Time is always 11:59:59, the end-of-day Pacific time.
   */
  
  @SerializedName("redeem_by")
  @Expose
  private DateTime redeemBy;

  
  /**
   * Whether the discount is for all eligible charges on the account, or only a specific subscription.
   */
  
  @SerializedName("redemption_resource")
  @Expose
  private Constants.RedemptionResource redemptionResource;

  
  /**
   * Indicates if the coupon is redeemable, and if it is not, why.
   */
  
  @SerializedName("state")
  @Expose
  private Constants.CouponState state;

  
  /**
   * If `duration` is "temporal" than `temporal_amount` is an integer which is multiplied by `temporal_unit` to define the duration that the coupon will be applied to invoices for.
   */
  
  @SerializedName("temporal_amount")
  @Expose
  private Integer temporalAmount;

  
  /**
   * If `duration` is "temporal" than `temporal_unit` is multiplied by `temporal_amount` to define the duration that the coupon will be applied to invoices for.
   */
  
  @SerializedName("temporal_unit")
  @Expose
  private Constants.TemporalUnit temporalUnit;

  
  /**
   * On a bulk coupon, the template from which unique coupon codes are generated.
   */
  
  @SerializedName("unique_code_template")
  @Expose
  private String uniqueCodeTemplate;

  
  /**
   * Will be populated when the Coupon being returned is a `UniqueCouponCode`.
   */
  
  @SerializedName("unique_coupon_code")
  @Expose
  private Map uniqueCouponCode;

  
  /**
   * When this number reaches `max_redemptions` the coupon will no longer be redeemable.
   */
  
  @SerializedName("unique_coupon_codes_count")
  @Expose
  private Integer uniqueCouponCodesCount;

  
  /**
   * Last updated at
   */
  
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;



  
  /**
   * The coupon is valid for all items if true. If false then `items`
will list the applicable items.

   */
  
  public Boolean getAppliesToAllItems() { return this.appliesToAllItems; }

  
  /**
   * @param appliesToAllItems The coupon is valid for all items if true. If false then `items`
will list the applicable items.

   */
  
  public void setAppliesToAllItems(final Boolean appliesToAllItems) { this.appliesToAllItems = appliesToAllItems; }

  
  /**
   * The coupon is valid for all plans if true. If false then `plans` will list the applicable plans.
   */
  
  public Boolean getAppliesToAllPlans() { return this.appliesToAllPlans; }

  
  /**
   * @param appliesToAllPlans The coupon is valid for all plans if true. If false then `plans` will list the applicable plans.
   */
  
  public void setAppliesToAllPlans(final Boolean appliesToAllPlans) { this.appliesToAllPlans = appliesToAllPlans; }

  
  /**
   * The coupon is valid for one-time, non-plan charges if true.
   */
  
  public Boolean getAppliesToNonPlanCharges() { return this.appliesToNonPlanCharges; }

  
  /**
   * @param appliesToNonPlanCharges The coupon is valid for one-time, non-plan charges if true.
   */
  
  public void setAppliesToNonPlanCharges(final Boolean appliesToNonPlanCharges) { this.appliesToNonPlanCharges = appliesToNonPlanCharges; }

  
  /**
   * The code the customer enters to redeem the coupon.
   */
  
  public String getCode() { return this.code; }

  
  /**
   * @param code The code the customer enters to redeem the coupon.
   */
  
  public void setCode(final String code) { this.code = code; }

  
  /**
   * Whether the coupon is "single_code" or "bulk". Bulk coupons will require a `unique_code_template` and will generate unique codes through the `/generate` endpoint.
   */
  
  public Constants.CouponType getCouponType() { return this.couponType; }

  
  /**
   * @param couponType Whether the coupon is "single_code" or "bulk". Bulk coupons will require a `unique_code_template` and will generate unique codes through the `/generate` endpoint.
   */
  
  public void setCouponType(final Constants.CouponType couponType) { this.couponType = couponType; }

  
  /**
   * Created at
   */
  
  public DateTime getCreatedAt() { return this.createdAt; }

  
  /**
   * @param createdAt Created at
   */
  
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  
  /**
   * Details of the discount a coupon applies. Will contain a `type`
property and one of the following properties: `percent`, `fixed`, `trial`.

   */
  
  public CouponDiscount getDiscount() { return this.discount; }

  
  /**
   * @param discount Details of the discount a coupon applies. Will contain a `type`
property and one of the following properties: `percent`, `fixed`, `trial`.

   */
  
  public void setDiscount(final CouponDiscount discount) { this.discount = discount; }

  
  /**
   * - "single_use" coupons applies to the first invoice only.
- "temporal" coupons will apply to invoices for the duration determined by the `temporal_unit` and `temporal_amount` attributes.

   */
  
  public Constants.CouponDuration getDuration() { return this.duration; }

  
  /**
   * @param duration - "single_use" coupons applies to the first invoice only.
- "temporal" coupons will apply to invoices for the duration determined by the `temporal_unit` and `temporal_amount` attributes.

   */
  
  public void setDuration(final Constants.CouponDuration duration) { this.duration = duration; }

  
  /**
   * The date and time the coupon was expired early or reached its `max_redemptions`.
   */
  
  public DateTime getExpiredAt() { return this.expiredAt; }

  
  /**
   * @param expiredAt The date and time the coupon was expired early or reached its `max_redemptions`.
   */
  
  public void setExpiredAt(final DateTime expiredAt) { this.expiredAt = expiredAt; }

  
  /**
   * Sets the duration of time the `free_trial_unit` is for.
   */
  
  public Integer getFreeTrialAmount() { return this.freeTrialAmount; }

  
  /**
   * @param freeTrialAmount Sets the duration of time the `free_trial_unit` is for.
   */
  
  public void setFreeTrialAmount(final Integer freeTrialAmount) { this.freeTrialAmount = freeTrialAmount; }

  
  /**
   * Description of the unit of time the coupon is for. Used with `free_trial_amount` to determine the duration of time the coupon is for.
   */
  
  public Constants.FreeTrialUnit getFreeTrialUnit() { return this.freeTrialUnit; }

  
  /**
   * @param freeTrialUnit Description of the unit of time the coupon is for. Used with `free_trial_amount` to determine the duration of time the coupon is for.
   */
  
  public void setFreeTrialUnit(final Constants.FreeTrialUnit freeTrialUnit) { this.freeTrialUnit = freeTrialUnit; }

  
  /**
   * This description will show up when a customer redeems a coupon on your Hosted Payment Pages, or if you choose to show the description on your own checkout page.
   */
  
  public String getHostedPageDescription() { return this.hostedPageDescription; }

  
  /**
   * @param hostedPageDescription This description will show up when a customer redeems a coupon on your Hosted Payment Pages, or if you choose to show the description on your own checkout page.
   */
  
  public void setHostedPageDescription(final String hostedPageDescription) { this.hostedPageDescription = hostedPageDescription; }

  
  /**
   * Coupon ID
   */
  
  public String getId() { return this.id; }

  
  /**
   * @param id Coupon ID
   */
  
  public void setId(final String id) { this.id = id; }

  
  /**
   * Description of the coupon on the invoice.
   */
  
  public String getInvoiceDescription() { return this.invoiceDescription; }

  
  /**
   * @param invoiceDescription Description of the coupon on the invoice.
   */
  
  public void setInvoiceDescription(final String invoiceDescription) { this.invoiceDescription = invoiceDescription; }

  
  /**
   * A list of items for which this coupon applies. This will be
`null` if `applies_to_all_items=true`.

   */
  
  public List<ItemMini> getItems() { return this.items; }

  
  /**
   * @param items A list of items for which this coupon applies. This will be
`null` if `applies_to_all_items=true`.

   */
  
  public void setItems(final List<ItemMini> items) { this.items = items; }

  
  /**
   * A maximum number of redemptions for the coupon. The coupon will expire when it hits its maximum redemptions.
   */
  
  public Integer getMaxRedemptions() { return this.maxRedemptions; }

  
  /**
   * @param maxRedemptions A maximum number of redemptions for the coupon. The coupon will expire when it hits its maximum redemptions.
   */
  
  public void setMaxRedemptions(final Integer maxRedemptions) { this.maxRedemptions = maxRedemptions; }

  
  /**
   * Redemptions per account is the number of times a specific account can redeem the coupon. Set redemptions per account to `1` if you want to keep customers from gaming the system and getting more than one discount from the coupon campaign.
   */
  
  public Integer getMaxRedemptionsPerAccount() { return this.maxRedemptionsPerAccount; }

  
  /**
   * @param maxRedemptionsPerAccount Redemptions per account is the number of times a specific account can redeem the coupon. Set redemptions per account to `1` if you want to keep customers from gaming the system and getting more than one discount from the coupon campaign.
   */
  
  public void setMaxRedemptionsPerAccount(final Integer maxRedemptionsPerAccount) { this.maxRedemptionsPerAccount = maxRedemptionsPerAccount; }

  
  /**
   * The internal name for the coupon.
   */
  
  public String getName() { return this.name; }

  
  /**
   * @param name The internal name for the coupon.
   */
  
  public void setName(final String name) { this.name = name; }

  
  /**
   * Object type
   */
  
  public String getObject() { return this.object; }

  
  /**
   * @param object Object type
   */
  
  public void setObject(final String object) { this.object = object; }

  
  /**
   * A list of plans for which this coupon applies. This will be `null` if `applies_to_all_plans=true`.
   */
  
  public List<PlanMini> getPlans() { return this.plans; }

  
  /**
   * @param plans A list of plans for which this coupon applies. This will be `null` if `applies_to_all_plans=true`.
   */
  
  public void setPlans(final List<PlanMini> plans) { this.plans = plans; }

  
  /**
   * The date and time the coupon will expire and can no longer be redeemed. Time is always 11:59:59, the end-of-day Pacific time.
   */
  
  public DateTime getRedeemBy() { return this.redeemBy; }

  
  /**
   * @param redeemBy The date and time the coupon will expire and can no longer be redeemed. Time is always 11:59:59, the end-of-day Pacific time.
   */
  
  public void setRedeemBy(final DateTime redeemBy) { this.redeemBy = redeemBy; }

  
  /**
   * Whether the discount is for all eligible charges on the account, or only a specific subscription.
   */
  
  public Constants.RedemptionResource getRedemptionResource() { return this.redemptionResource; }

  
  /**
   * @param redemptionResource Whether the discount is for all eligible charges on the account, or only a specific subscription.
   */
  
  public void setRedemptionResource(final Constants.RedemptionResource redemptionResource) { this.redemptionResource = redemptionResource; }

  
  /**
   * Indicates if the coupon is redeemable, and if it is not, why.
   */
  
  public Constants.CouponState getState() { return this.state; }

  
  /**
   * @param state Indicates if the coupon is redeemable, and if it is not, why.
   */
  
  public void setState(final Constants.CouponState state) { this.state = state; }

  
  /**
   * If `duration` is "temporal" than `temporal_amount` is an integer which is multiplied by `temporal_unit` to define the duration that the coupon will be applied to invoices for.
   */
  
  public Integer getTemporalAmount() { return this.temporalAmount; }

  
  /**
   * @param temporalAmount If `duration` is "temporal" than `temporal_amount` is an integer which is multiplied by `temporal_unit` to define the duration that the coupon will be applied to invoices for.
   */
  
  public void setTemporalAmount(final Integer temporalAmount) { this.temporalAmount = temporalAmount; }

  
  /**
   * If `duration` is "temporal" than `temporal_unit` is multiplied by `temporal_amount` to define the duration that the coupon will be applied to invoices for.
   */
  
  public Constants.TemporalUnit getTemporalUnit() { return this.temporalUnit; }

  
  /**
   * @param temporalUnit If `duration` is "temporal" than `temporal_unit` is multiplied by `temporal_amount` to define the duration that the coupon will be applied to invoices for.
   */
  
  public void setTemporalUnit(final Constants.TemporalUnit temporalUnit) { this.temporalUnit = temporalUnit; }

  
  /**
   * On a bulk coupon, the template from which unique coupon codes are generated.
   */
  
  public String getUniqueCodeTemplate() { return this.uniqueCodeTemplate; }

  
  /**
   * @param uniqueCodeTemplate On a bulk coupon, the template from which unique coupon codes are generated.
   */
  
  public void setUniqueCodeTemplate(final String uniqueCodeTemplate) { this.uniqueCodeTemplate = uniqueCodeTemplate; }

  
  /**
   * Will be populated when the Coupon being returned is a `UniqueCouponCode`.
   */
  
  public Map getUniqueCouponCode() { return this.uniqueCouponCode; }

  
  /**
   * @param uniqueCouponCode Will be populated when the Coupon being returned is a `UniqueCouponCode`.
   */
  
  public void setUniqueCouponCode(final Map uniqueCouponCode) { this.uniqueCouponCode = uniqueCouponCode; }

  
  /**
   * When this number reaches `max_redemptions` the coupon will no longer be redeemable.
   */
  
  public Integer getUniqueCouponCodesCount() { return this.uniqueCouponCodesCount; }

  
  /**
   * @param uniqueCouponCodesCount When this number reaches `max_redemptions` the coupon will no longer be redeemable.
   */
  
  public void setUniqueCouponCodesCount(final Integer uniqueCouponCodesCount) { this.uniqueCouponCodesCount = uniqueCouponCodesCount; }

  
  /**
   * Last updated at
   */
  
  public DateTime getUpdatedAt() { return this.updatedAt; }

  
  /**
   * @param updatedAt Last updated at
   */
  
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

}
