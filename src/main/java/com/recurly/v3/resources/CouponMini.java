/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;

public class CouponMini extends Resource {

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

  @SerializedName("discount")
  @Expose
  private CouponDiscount discount;

  /** The date and time the coupon was expired early or reached its `max_redemptions`. */
  @SerializedName("expired_at")
  @Expose
  private DateTime expiredAt;

  /** Coupon ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** The internal name for the coupon. */
  @SerializedName("name")
  @Expose
  private String name;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** Indicates if the coupon is redeemable, and if it is not, why. */
  @SerializedName("state")
  @Expose
  private String state;

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

  public CouponDiscount getDiscount() {
    return this.discount;
  }

  /** @param discount */
  public void setDiscount(final CouponDiscount discount) {
    this.discount = discount;
  }

  /** The date and time the coupon was expired early or reached its `max_redemptions`. */
  public DateTime getExpiredAt() {
    return this.expiredAt;
  }

  /**
   * @param expiredAt The date and time the coupon was expired early or reached its
   *     `max_redemptions`.
   */
  public void setExpiredAt(final DateTime expiredAt) {
    this.expiredAt = expiredAt;
  }

  /** Coupon ID */
  public String getId() {
    return this.id;
  }

  /** @param id Coupon ID */
  public void setId(final String id) {
    this.id = id;
  }

  /** The internal name for the coupon. */
  public String getName() {
    return this.name;
  }

  /** @param name The internal name for the coupon. */
  public void setName(final String name) {
    this.name = name;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  /** Indicates if the coupon is redeemable, and if it is not, why. */
  public String getState() {
    return this.state;
  }

  /** @param state Indicates if the coupon is redeemable, and if it is not, why. */
  public void setState(final String state) {
    this.state = state;
  }
}
