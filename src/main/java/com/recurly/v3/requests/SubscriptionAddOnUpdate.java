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

public class SubscriptionAddOnUpdate extends Request {

  /**
   * If a code is provided without an id, the subscription add-on attributes will be set to the
   * current value for those attributes on the plan add-on unless provided in the request.
   */
  @SerializedName("code")
  @Expose
  private String code;

  /**
   * When an id is provided, the existing subscription add-on attributes will persist unless
   * overridden in the request.
   */
  @SerializedName("id")
  @Expose
  private String id;

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
   * with an `ending_quantity` of 999999999 which is the default if not provided.
   */
  @SerializedName("tiers")
  @Expose
  private List<SubscriptionAddOnTier> tiers;

  /** Optionally, override the add-on's default unit amount. */
  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;

  /**
   * If a code is provided without an id, the subscription add-on attributes will be set to the
   * current value for those attributes on the plan add-on unless provided in the request.
   */
  public String getCode() {
    return this.code;
  }

  /**
   * @param code If a code is provided without an id, the subscription add-on attributes will be set
   *     to the current value for those attributes on the plan add-on unless provided in the
   *     request.
   */
  public void setCode(final String code) {
    this.code = code;
  }

  /**
   * When an id is provided, the existing subscription add-on attributes will persist unless
   * overridden in the request.
   */
  public String getId() {
    return this.id;
  }

  /**
   * @param id When an id is provided, the existing subscription add-on attributes will persist
   *     unless overridden in the request.
   */
  public void setId(final String id) {
    this.id = id;
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
   * with an `ending_quantity` of 999999999 which is the default if not provided.
   */
  public List<SubscriptionAddOnTier> getTiers() {
    return this.tiers;
  }

  /**
   * @param tiers If the plan add-on's `tier_type` is `flat`, then `tiers` must be absent. The
   *     `tiers` object must include one to many tiers with `ending_quantity` and `unit_amount`.
   *     There must be one tier with an `ending_quantity` of 999999999 which is the default if not
   *     provided.
   */
  public void setTiers(final List<SubscriptionAddOnTier> tiers) {
    this.tiers = tiers;
  }

  /** Optionally, override the add-on's default unit amount. */
  public Float getUnitAmount() {
    return this.unitAmount;
  }

  /** @param unitAmount Optionally, override the add-on's default unit amount. */
  public void setUnitAmount(final Float unitAmount) {
    this.unitAmount = unitAmount;
  }
}
