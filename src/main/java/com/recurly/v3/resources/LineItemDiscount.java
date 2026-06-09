/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.math.BigDecimal;

public class LineItemDiscount extends Resource {

  /** The ID of the coupon that generated this discount. */
  @SerializedName("coupon_id")
  @Expose
  private String couponId;

  /** The ID of the coupon redemption that generated this discount. */
  @SerializedName("coupon_redemption_id")
  @Expose
  private String couponRedemptionId;

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /** The amount discounted on this line item by this coupon redemption. */
  @SerializedName("discount_amount")
  @Expose
  private BigDecimal discountAmount;

  /** Will always be `line_item_discount`. */
  @SerializedName("object")
  @Expose
  private String object;

  /** The order in which this discount was applied when multiple coupons were redeemed. */
  @SerializedName("order_applied")
  @Expose
  private Integer orderApplied;

  /** The ID of the coupon that generated this discount. */
  public String getCouponId() {
    return this.couponId;
  }

  /** @param couponId The ID of the coupon that generated this discount. */
  public void setCouponId(final String couponId) {
    this.couponId = couponId;
  }

  /** The ID of the coupon redemption that generated this discount. */
  public String getCouponRedemptionId() {
    return this.couponRedemptionId;
  }

  /** @param couponRedemptionId The ID of the coupon redemption that generated this discount. */
  public void setCouponRedemptionId(final String couponRedemptionId) {
    this.couponRedemptionId = couponRedemptionId;
  }

  /** 3-letter ISO 4217 currency code. */
  public String getCurrency() {
    return this.currency;
  }

  /** @param currency 3-letter ISO 4217 currency code. */
  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  /** The amount discounted on this line item by this coupon redemption. */
  public BigDecimal getDiscountAmount() {
    return this.discountAmount;
  }

  /** @param discountAmount The amount discounted on this line item by this coupon redemption. */
  public void setDiscountAmount(final BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }

  /** Will always be `line_item_discount`. */
  public String getObject() {
    return this.object;
  }

  /** @param object Will always be `line_item_discount`. */
  public void setObject(final String object) {
    this.object = object;
  }

  /** The order in which this discount was applied when multiple coupons were redeemed. */
  public Integer getOrderApplied() {
    return this.orderApplied;
  }

  /**
   * @param orderApplied The order in which this discount was applied when multiple coupons were
   *     redeemed.
   */
  public void setOrderApplied(final Integer orderApplied) {
    this.orderApplied = orderApplied;
  }
}
