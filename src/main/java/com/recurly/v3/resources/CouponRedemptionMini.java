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

public class CouponRedemptionMini extends Resource {

  @SerializedName("coupon")
  @Expose
  private CouponMini coupon;

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /**
   * The amount that was discounted upon the application of the coupon, formatted with the currency.
   */
  @SerializedName("discounted")
  @Expose
  private Float discounted;

  /** Coupon Redemption ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** Will always be `coupon`. */
  @SerializedName("object")
  @Expose
  private String object;

  /** Invoice state */
  @SerializedName("state")
  @Expose
  private String state;

  public CouponMini getCoupon() {
    return this.coupon;
  }

  /** @param coupon */
  public void setCoupon(final CouponMini coupon) {
    this.coupon = coupon;
  }

  /** Created at */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt Created at */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The amount that was discounted upon the application of the coupon, formatted with the currency.
   */
  public Float getDiscounted() {
    return this.discounted;
  }

  /**
   * @param discounted The amount that was discounted upon the application of the coupon, formatted
   *     with the currency.
   */
  public void setDiscounted(final Float discounted) {
    this.discounted = discounted;
  }

  /** Coupon Redemption ID */
  public String getId() {
    return this.id;
  }

  /** @param id Coupon Redemption ID */
  public void setId(final String id) {
    this.id = id;
  }

  /** Will always be `coupon`. */
  public String getObject() {
    return this.object;
  }

  /** @param object Will always be `coupon`. */
  public void setObject(final String object) {
    this.object = object;
  }

  /** Invoice state */
  public String getState() {
    return this.state;
  }

  /** @param state Invoice state */
  public void setState(final String state) {
    this.state = state;
  }
}
