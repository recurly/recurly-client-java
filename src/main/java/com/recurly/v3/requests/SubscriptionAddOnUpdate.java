/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import com.recurly.v3.Constants;
import com.recurly.v3.resources.*;
import org.joda.time.DateTime;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class SubscriptionAddOnUpdate extends Request {

  
  /**
   * Used to determine where the associated add-on data is pulled from. If this value is set to
`plan_add_on` or left blank, then add-on data will be pulled from the plan's add-ons. If the associated
`plan` has `allow_any_item_on_subscriptions` set to `true` and this field is set to `item`, then
the associated add-on data will be pulled from the site's item catalog.

   */
  
  @SerializedName("add_on_source")
  @Expose
  private Constants.AddOnSource addOnSource;

  
  /**
   * If a code is provided without an id, the subscription add-on attributes
will be set to the current value for those attributes on the plan add-on
unless provided in the request. If `add_on_source` is set to `plan_add_on`
or left blank, then plan's add-on `code` should be used. If `add_on_source`
is set to `item`, then the `code` from the associated item should be used.

   */
  
  @SerializedName("code")
  @Expose
  private String code;

  
  /**
   * When an id is provided, the existing subscription add-on attributes will
persist unless overridden in the request.

   */
  
  @SerializedName("id")
  @Expose
  private String id;

  
  /**
   * If percentage tiers are provided in the request, all existing percentage tiers on the Subscription Add-on will be
removed and replaced by the percentage tiers in the request. Use only if add_on.tier_type is tiered or volume and
add_on.usage_type is percentage. There must be one tier without an `ending_amount` value which represents the
final tier. This feature is currently in development and requires approval and enablement, please contact support.

   */
  
  @SerializedName("percentage_tiers")
  @Expose
  private List<SubscriptionAddOnPercentageTier> percentageTiers;

  
  /**
   * Quantity
   */
  
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  
  /**
   * Revenue schedule type
   */
  
  @SerializedName("revenue_schedule_type")
  @Expose
  private Constants.RevenueScheduleType revenueScheduleType;

  
  /**
   * If the plan add-on's `tier_type` is `flat`, then `tiers` must be absent. The `tiers` object
must include one to many tiers with `ending_quantity` and `unit_amount`.
There must be one tier without an `ending_quantity` value which represents the final tier.

   */
  
  @SerializedName("tiers")
  @Expose
  private List<SubscriptionAddOnTier> tiers;

  
  /**
   * Allows up to 2 decimal places. Optionally, override the add-on's default unit amount.
If the plan add-on's `tier_type` is `tiered`, `volume`, or `stairstep`, then `unit_amount` cannot be provided.

   */
  
  @SerializedName("unit_amount")
  @Expose
  private BigDecimal unitAmount;

  
  /**
   * Allows up to 9 decimal places. Optionally, override the add-on's default unit amount.
If the plan add-on's `tier_type` is `tiered`, `volume`, or `stairstep`, then `unit_amount_decimal` cannot be provided.
Only supported when the plan add-on's `add_on_type` = `usage`.
If `unit_amount_decimal` is provided, `unit_amount` cannot be provided.

   */
  
  @SerializedName("unit_amount_decimal")
  @Expose
  private String unitAmountDecimal;

  
  /**
   * The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal places. A value between 0.0 and 100.0. Required if add_on_type is usage and usage_type is percentage.
   */
  
  @SerializedName("usage_percentage")
  @Expose
  private BigDecimal usagePercentage;


  
  /**
   * Used to determine where the associated add-on data is pulled from. If this value is set to
`plan_add_on` or left blank, then add-on data will be pulled from the plan's add-ons. If the associated
`plan` has `allow_any_item_on_subscriptions` set to `true` and this field is set to `item`, then
the associated add-on data will be pulled from the site's item catalog.

   */
  
  public Constants.AddOnSource getAddOnSource() { return this.addOnSource; }

  
  /**
   * @param addOnSource Used to determine where the associated add-on data is pulled from. If this value is set to
`plan_add_on` or left blank, then add-on data will be pulled from the plan's add-ons. If the associated
`plan` has `allow_any_item_on_subscriptions` set to `true` and this field is set to `item`, then
the associated add-on data will be pulled from the site's item catalog.

   */
  
  public void setAddOnSource(final Constants.AddOnSource addOnSource) { this.addOnSource = addOnSource; }

  
  /**
   * If a code is provided without an id, the subscription add-on attributes
will be set to the current value for those attributes on the plan add-on
unless provided in the request. If `add_on_source` is set to `plan_add_on`
or left blank, then plan's add-on `code` should be used. If `add_on_source`
is set to `item`, then the `code` from the associated item should be used.

   */
  
  public String getCode() { return this.code; }

  
  /**
   * @param code If a code is provided without an id, the subscription add-on attributes
will be set to the current value for those attributes on the plan add-on
unless provided in the request. If `add_on_source` is set to `plan_add_on`
or left blank, then plan's add-on `code` should be used. If `add_on_source`
is set to `item`, then the `code` from the associated item should be used.

   */
  
  public void setCode(final String code) { this.code = code; }

  
  /**
   * When an id is provided, the existing subscription add-on attributes will
persist unless overridden in the request.

   */
  
  public String getId() { return this.id; }

  
  /**
   * @param id When an id is provided, the existing subscription add-on attributes will
persist unless overridden in the request.

   */
  
  public void setId(final String id) { this.id = id; }

  
  /**
   * If percentage tiers are provided in the request, all existing percentage tiers on the Subscription Add-on will be
removed and replaced by the percentage tiers in the request. Use only if add_on.tier_type is tiered or volume and
add_on.usage_type is percentage. There must be one tier without an `ending_amount` value which represents the
final tier. This feature is currently in development and requires approval and enablement, please contact support.

   */
  
  public List<SubscriptionAddOnPercentageTier> getPercentageTiers() { return this.percentageTiers; }

  
  /**
   * @param percentageTiers If percentage tiers are provided in the request, all existing percentage tiers on the Subscription Add-on will be
removed and replaced by the percentage tiers in the request. Use only if add_on.tier_type is tiered or volume and
add_on.usage_type is percentage. There must be one tier without an `ending_amount` value which represents the
final tier. This feature is currently in development and requires approval and enablement, please contact support.

   */
  
  public void setPercentageTiers(final List<SubscriptionAddOnPercentageTier> percentageTiers) { this.percentageTiers = percentageTiers; }

  
  /**
   * Quantity
   */
  
  public Integer getQuantity() { return this.quantity; }

  
  /**
   * @param quantity Quantity
   */
  
  public void setQuantity(final Integer quantity) { this.quantity = quantity; }

  
  /**
   * Revenue schedule type
   */
  
  public Constants.RevenueScheduleType getRevenueScheduleType() { return this.revenueScheduleType; }

  
  /**
   * @param revenueScheduleType Revenue schedule type
   */
  
  public void setRevenueScheduleType(final Constants.RevenueScheduleType revenueScheduleType) { this.revenueScheduleType = revenueScheduleType; }

  
  /**
   * If the plan add-on's `tier_type` is `flat`, then `tiers` must be absent. The `tiers` object
must include one to many tiers with `ending_quantity` and `unit_amount`.
There must be one tier without an `ending_quantity` value which represents the final tier.

   */
  
  public List<SubscriptionAddOnTier> getTiers() { return this.tiers; }

  
  /**
   * @param tiers If the plan add-on's `tier_type` is `flat`, then `tiers` must be absent. The `tiers` object
must include one to many tiers with `ending_quantity` and `unit_amount`.
There must be one tier without an `ending_quantity` value which represents the final tier.

   */
  
  public void setTiers(final List<SubscriptionAddOnTier> tiers) { this.tiers = tiers; }

  
  /**
   * Allows up to 2 decimal places. Optionally, override the add-on's default unit amount.
If the plan add-on's `tier_type` is `tiered`, `volume`, or `stairstep`, then `unit_amount` cannot be provided.

   */
  
  public BigDecimal getUnitAmount() { return this.unitAmount; }

  
  /**
   * @param unitAmount Allows up to 2 decimal places. Optionally, override the add-on's default unit amount.
If the plan add-on's `tier_type` is `tiered`, `volume`, or `stairstep`, then `unit_amount` cannot be provided.

   */
  
  public void setUnitAmount(final BigDecimal unitAmount) { this.unitAmount = unitAmount; }

  
  /**
   * Allows up to 9 decimal places. Optionally, override the add-on's default unit amount.
If the plan add-on's `tier_type` is `tiered`, `volume`, or `stairstep`, then `unit_amount_decimal` cannot be provided.
Only supported when the plan add-on's `add_on_type` = `usage`.
If `unit_amount_decimal` is provided, `unit_amount` cannot be provided.

   */
  
  public String getUnitAmountDecimal() { return this.unitAmountDecimal; }

  
  /**
   * @param unitAmountDecimal Allows up to 9 decimal places. Optionally, override the add-on's default unit amount.
If the plan add-on's `tier_type` is `tiered`, `volume`, or `stairstep`, then `unit_amount_decimal` cannot be provided.
Only supported when the plan add-on's `add_on_type` = `usage`.
If `unit_amount_decimal` is provided, `unit_amount` cannot be provided.

   */
  
  public void setUnitAmountDecimal(final String unitAmountDecimal) { this.unitAmountDecimal = unitAmountDecimal; }

  
  /**
   * The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal places. A value between 0.0 and 100.0. Required if add_on_type is usage and usage_type is percentage.
   */
  
  public BigDecimal getUsagePercentage() { return this.usagePercentage; }

  
  /**
   * @param usagePercentage The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal places. A value between 0.0 and 100.0. Required if add_on_type is usage and usage_type is percentage.
   */
  
  public void setUsagePercentage(final BigDecimal usagePercentage) { this.usagePercentage = usagePercentage; }

}
