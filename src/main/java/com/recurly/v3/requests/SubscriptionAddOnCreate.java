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

public class SubscriptionAddOnCreate extends Request {

  /**
   * Used to determine where the associated add-on data is pulled from. If this value is set to
   * `plan_add_on` or left blank, then add_on data will be pulled from the plan's add-ons. If the
   * associated `plan` has `allow_any_item_on_subscriptions` set to `true` and this field is set to
   * `item`, then the associated add-on data will be pulled from the site's item catalog.
   */
  @SerializedName("add_on_source")
  @Expose
  private String addOnSource;

  /**
   * If `add_on_source` is set to `plan_add_on` or left blank, then plan's add-on `code` should be
   * used. If `add_on_source` is set to `item`, then the `code` from the associated item should be
   * used.
   */
  @SerializedName("code")
  @Expose
  private String code;

  /** Quantity */
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /** Revenue schedule type */
  @SerializedName("revenue_schedule_type")
  @Expose
  private String revenueScheduleType;

  /**
   * If the plan add-on's `tier_type` is `flat`, then `tiers` must be absent. The `tiers` object
   * must include one to many tiers with `ending_quantity` and `unit_amount`. There must be one tier
   * with an `ending_quantity` of 999999999 which is the default if not provided. See our
   * [Guide](https://recurly.com/developers/guides/item-addon-guide.html) for an overview of how to
   * configure quantity-based pricing models.
   */
  @SerializedName("tiers")
  @Expose
  private List<SubscriptionAddOnTier> tiers;

  /**
   * * Optionally, override the add-on's default unit amount. If the plan add-on's `tier_type` is
   * `tiered`, `volume`, or `stairstep`, then `unit_amount` must be absent.
   */
  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;

  /**
   * The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal
   * places. A value between 0.0 and 100.0. Required if `add_on_type` is usage and `usage_type` is
   * percentage. Must be omitted otherwise. `usage_percentage` does not support tiers. See our
   * [Guide](https://recurly.com/developers/guides/usage-based-billing-guide.html) for an overview
   * of how to configure usage add-ons.
   */
  @SerializedName("usage_percentage")
  @Expose
  private Float usagePercentage;

  /**
   * Used to determine where the associated add-on data is pulled from. If this value is set to
   * `plan_add_on` or left blank, then add_on data will be pulled from the plan's add-ons. If the
   * associated `plan` has `allow_any_item_on_subscriptions` set to `true` and this field is set to
   * `item`, then the associated add-on data will be pulled from the site's item catalog.
   */
  public String getAddOnSource() {
    return this.addOnSource;
  }

  /**
   * @param addOnSource Used to determine where the associated add-on data is pulled from. If this
   *     value is set to `plan_add_on` or left blank, then add_on data will be pulled from the
   *     plan's add-ons. If the associated `plan` has `allow_any_item_on_subscriptions` set to
   *     `true` and this field is set to `item`, then the associated add-on data will be pulled from
   *     the site's item catalog.
   */
  public void setAddOnSource(final String addOnSource) {
    this.addOnSource = addOnSource;
  }

  /**
   * If `add_on_source` is set to `plan_add_on` or left blank, then plan's add-on `code` should be
   * used. If `add_on_source` is set to `item`, then the `code` from the associated item should be
   * used.
   */
  public String getCode() {
    return this.code;
  }

  /**
   * @param code If `add_on_source` is set to `plan_add_on` or left blank, then plan's add-on `code`
   *     should be used. If `add_on_source` is set to `item`, then the `code` from the associated
   *     item should be used.
   */
  public void setCode(final String code) {
    this.code = code;
  }

  /** Quantity */
  public Integer getQuantity() {
    return this.quantity;
  }

  /** @param quantity Quantity */
  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  /** Revenue schedule type */
  public String getRevenueScheduleType() {
    return this.revenueScheduleType;
  }

  /** @param revenueScheduleType Revenue schedule type */
  public void setRevenueScheduleType(final String revenueScheduleType) {
    this.revenueScheduleType = revenueScheduleType;
  }

  /**
   * If the plan add-on's `tier_type` is `flat`, then `tiers` must be absent. The `tiers` object
   * must include one to many tiers with `ending_quantity` and `unit_amount`. There must be one tier
   * with an `ending_quantity` of 999999999 which is the default if not provided. See our
   * [Guide](https://recurly.com/developers/guides/item-addon-guide.html) for an overview of how to
   * configure quantity-based pricing models.
   */
  public List<SubscriptionAddOnTier> getTiers() {
    return this.tiers;
  }

  /**
   * @param tiers If the plan add-on's `tier_type` is `flat`, then `tiers` must be absent. The
   *     `tiers` object must include one to many tiers with `ending_quantity` and `unit_amount`.
   *     There must be one tier with an `ending_quantity` of 999999999 which is the default if not
   *     provided. See our [Guide](https://recurly.com/developers/guides/item-addon-guide.html) for
   *     an overview of how to configure quantity-based pricing models.
   */
  public void setTiers(final List<SubscriptionAddOnTier> tiers) {
    this.tiers = tiers;
  }

  /**
   * * Optionally, override the add-on's default unit amount. If the plan add-on's `tier_type` is
   * `tiered`, `volume`, or `stairstep`, then `unit_amount` must be absent.
   */
  public Float getUnitAmount() {
    return this.unitAmount;
  }

  /**
   * @param unitAmount * Optionally, override the add-on's default unit amount. If the plan add-on's
   *     `tier_type` is `tiered`, `volume`, or `stairstep`, then `unit_amount` must be absent.
   */
  public void setUnitAmount(final Float unitAmount) {
    this.unitAmount = unitAmount;
  }

  /**
   * The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal
   * places. A value between 0.0 and 100.0. Required if `add_on_type` is usage and `usage_type` is
   * percentage. Must be omitted otherwise. `usage_percentage` does not support tiers. See our
   * [Guide](https://recurly.com/developers/guides/usage-based-billing-guide.html) for an overview
   * of how to configure usage add-ons.
   */
  public Float getUsagePercentage() {
    return this.usagePercentage;
  }

  /**
   * @param usagePercentage The percentage taken of the monetary amount of usage tracked. This can
   *     be up to 4 decimal places. A value between 0.0 and 100.0. Required if `add_on_type` is
   *     usage and `usage_type` is percentage. Must be omitted otherwise. `usage_percentage` does
   *     not support tiers. See our
   *     [Guide](https://recurly.com/developers/guides/usage-based-billing-guide.html) for an
   *     overview of how to configure usage add-ons.
   */
  public void setUsagePercentage(final Float usagePercentage) {
    this.usagePercentage = usagePercentage;
  }
}
