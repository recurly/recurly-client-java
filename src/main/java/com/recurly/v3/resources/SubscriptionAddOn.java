/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Constants;
import com.recurly.v3.Resource;
import java.util.List;
import org.joda.time.DateTime;

public class SubscriptionAddOn extends Resource {

  /** Just the important parts. */
  @SerializedName("add_on")
  @Expose
  private AddOnMini addOn;

  /**
   * Used to determine where the associated add-on data is pulled from. If this value is set to
   * `plan_add_on` or left blank, then add-on data will be pulled from the plan's add-ons. If the
   * associated `plan` has `allow_any_item_on_subscriptions` set to `true` and this field is set to
   * `item`, then the associated add-on data will be pulled from the site's item catalog.
   */
  @SerializedName("add_on_source")
  @Expose
  private Constants.AddOnSource addOnSource;

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** Expired at */
  @SerializedName("expired_at")
  @Expose
  private DateTime expiredAt;

  /** Subscription Add-on ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** Add-on quantity */
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /** Revenue schedule type */
  @SerializedName("revenue_schedule_type")
  @Expose
  private Constants.RevenueScheduleType revenueScheduleType;

  /** Subscription ID */
  @SerializedName("subscription_id")
  @Expose
  private String subscriptionId;

  /**
   * The pricing model for the add-on. For more information, [click
   * here](https://docs.recurly.com/docs/billing-models#section-quantity-based). See our
   * [Guide](https://developers.recurly.com/guides/item-addon-guide.html) for an overview of how to
   * configure quantity-based pricing models.
   */
  @SerializedName("tier_type")
  @Expose
  private Constants.TierType tierType;

  /**
   * If tiers are provided in the request, all existing tiers on the Subscription Add-on will be
   * removed and replaced by the tiers in the request.
   */
  @SerializedName("tiers")
  @Expose
  private List<SubscriptionAddOnTier> tiers;

  /** This is priced in the subscription's currency. */
  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;

  /** Updated at */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /**
   * The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal
   * places. A value between 0.0 and 100.0. Required if add_on_type is usage and usage_type is
   * percentage.
   */
  @SerializedName("usage_percentage")
  @Expose
  private Float usagePercentage;

  /** Just the important parts. */
  public AddOnMini getAddOn() {
    return this.addOn;
  }

  /** @param addOn Just the important parts. */
  public void setAddOn(final AddOnMini addOn) {
    this.addOn = addOn;
  }

  /**
   * Used to determine where the associated add-on data is pulled from. If this value is set to
   * `plan_add_on` or left blank, then add-on data will be pulled from the plan's add-ons. If the
   * associated `plan` has `allow_any_item_on_subscriptions` set to `true` and this field is set to
   * `item`, then the associated add-on data will be pulled from the site's item catalog.
   */
  public Constants.AddOnSource getAddOnSource() {
    return this.addOnSource;
  }

  /**
   * @param addOnSource Used to determine where the associated add-on data is pulled from. If this
   *     value is set to `plan_add_on` or left blank, then add-on data will be pulled from the
   *     plan's add-ons. If the associated `plan` has `allow_any_item_on_subscriptions` set to
   *     `true` and this field is set to `item`, then the associated add-on data will be pulled from
   *     the site's item catalog.
   */
  public void setAddOnSource(final Constants.AddOnSource addOnSource) {
    this.addOnSource = addOnSource;
  }

  /** Created at */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt Created at */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** Expired at */
  public DateTime getExpiredAt() {
    return this.expiredAt;
  }

  /** @param expiredAt Expired at */
  public void setExpiredAt(final DateTime expiredAt) {
    this.expiredAt = expiredAt;
  }

  /** Subscription Add-on ID */
  public String getId() {
    return this.id;
  }

  /** @param id Subscription Add-on ID */
  public void setId(final String id) {
    this.id = id;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  /** Add-on quantity */
  public Integer getQuantity() {
    return this.quantity;
  }

  /** @param quantity Add-on quantity */
  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  /** Revenue schedule type */
  public Constants.RevenueScheduleType getRevenueScheduleType() {
    return this.revenueScheduleType;
  }

  /** @param revenueScheduleType Revenue schedule type */
  public void setRevenueScheduleType(final Constants.RevenueScheduleType revenueScheduleType) {
    this.revenueScheduleType = revenueScheduleType;
  }

  /** Subscription ID */
  public String getSubscriptionId() {
    return this.subscriptionId;
  }

  /** @param subscriptionId Subscription ID */
  public void setSubscriptionId(final String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  /**
   * The pricing model for the add-on. For more information, [click
   * here](https://docs.recurly.com/docs/billing-models#section-quantity-based). See our
   * [Guide](https://developers.recurly.com/guides/item-addon-guide.html) for an overview of how to
   * configure quantity-based pricing models.
   */
  public Constants.TierType getTierType() {
    return this.tierType;
  }

  /**
   * @param tierType The pricing model for the add-on. For more information, [click
   *     here](https://docs.recurly.com/docs/billing-models#section-quantity-based). See our
   *     [Guide](https://developers.recurly.com/guides/item-addon-guide.html) for an overview of how
   *     to configure quantity-based pricing models.
   */
  public void setTierType(final Constants.TierType tierType) {
    this.tierType = tierType;
  }

  /**
   * If tiers are provided in the request, all existing tiers on the Subscription Add-on will be
   * removed and replaced by the tiers in the request.
   */
  public List<SubscriptionAddOnTier> getTiers() {
    return this.tiers;
  }

  /**
   * @param tiers If tiers are provided in the request, all existing tiers on the Subscription
   *     Add-on will be removed and replaced by the tiers in the request.
   */
  public void setTiers(final List<SubscriptionAddOnTier> tiers) {
    this.tiers = tiers;
  }

  /** This is priced in the subscription's currency. */
  public Float getUnitAmount() {
    return this.unitAmount;
  }

  /** @param unitAmount This is priced in the subscription's currency. */
  public void setUnitAmount(final Float unitAmount) {
    this.unitAmount = unitAmount;
  }

  /** Updated at */
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt Updated at */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal
   * places. A value between 0.0 and 100.0. Required if add_on_type is usage and usage_type is
   * percentage.
   */
  public Float getUsagePercentage() {
    return this.usagePercentage;
  }

  /**
   * @param usagePercentage The percentage taken of the monetary amount of usage tracked. This can
   *     be up to 4 decimal places. A value between 0.0 and 100.0. Required if add_on_type is usage
   *     and usage_type is percentage.
   */
  public void setUsagePercentage(final Float usagePercentage) {
    this.usagePercentage = usagePercentage;
  }
}
