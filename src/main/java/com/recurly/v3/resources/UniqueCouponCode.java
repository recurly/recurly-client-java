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
import org.joda.time.DateTime;

public class UniqueCouponCode extends Resource {

  /** The Coupon code of the parent Bulk Coupon */
  @SerializedName("bulk_coupon_code")
  @Expose
  private String bulkCouponCode;

  /** The Coupon ID of the parent Bulk Coupon */
  @SerializedName("bulk_coupon_id")
  @Expose
  private String bulkCouponId;

  /** The code the customer enters to redeem the coupon. */
  @SerializedName("code")
  @Expose
  private String code;

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** The date and time the coupon was expired early or reached its `max_redemptions`. */
  @SerializedName("expired_at")
  @Expose
  private DateTime expiredAt;

  /** Unique Coupon Code ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** The date and time the unique coupon code was redeemed. */
  @SerializedName("redeemed_at")
  @Expose
  private DateTime redeemedAt;

  /** Indicates if the unique coupon code is redeemable or why not. */
  @SerializedName("state")
  @Expose
  private Constants.CouponCodeState state;

  /** Updated at */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /** The Coupon code of the parent Bulk Coupon */
  public String getBulkCouponCode() {
    return this.bulkCouponCode;
  }

  /** @param bulkCouponCode The Coupon code of the parent Bulk Coupon */
  public void setBulkCouponCode(final String bulkCouponCode) {
    this.bulkCouponCode = bulkCouponCode;
  }

  /** The Coupon ID of the parent Bulk Coupon */
  public String getBulkCouponId() {
    return this.bulkCouponId;
  }

  /** @param bulkCouponId The Coupon ID of the parent Bulk Coupon */
  public void setBulkCouponId(final String bulkCouponId) {
    this.bulkCouponId = bulkCouponId;
  }

  /** The code the customer enters to redeem the coupon. */
  public String getCode() {
    return this.code;
  }

  /** @param code The code the customer enters to redeem the coupon. */
  public void setCode(final String code) {
    this.code = code;
  }

  /** Created at */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt Created at */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
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

  /** Unique Coupon Code ID */
  public String getId() {
    return this.id;
  }

  /** @param id Unique Coupon Code ID */
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

  /** The date and time the unique coupon code was redeemed. */
  public DateTime getRedeemedAt() {
    return this.redeemedAt;
  }

  /** @param redeemedAt The date and time the unique coupon code was redeemed. */
  public void setRedeemedAt(final DateTime redeemedAt) {
    this.redeemedAt = redeemedAt;
  }

  /** Indicates if the unique coupon code is redeemable or why not. */
  public Constants.CouponCodeState getState() {
    return this.state;
  }

  /** @param state Indicates if the unique coupon code is redeemable or why not. */
  public void setState(final Constants.CouponCodeState state) {
    this.state = state;
  }

  /** Updated at */
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt Updated at */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
}
