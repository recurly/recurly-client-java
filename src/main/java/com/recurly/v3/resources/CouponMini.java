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

  @SerializedName("code")
  @Expose
  private String code;

  @SerializedName("coupon_type")
  @Expose
  private String couponType;

  @SerializedName("discount")
  @Expose
  private CouponDiscount discount;

  @SerializedName("expired_at")
  @Expose
  private DateTime expiredAt;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("name")
  @Expose
  private String name;

  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("state")
  @Expose
  private String state;

  public String getCode() {
    return this.code;
  }

  public void setCode(final String code) {
    this.code = code;
  }

  public String getCouponType() {
    return this.couponType;
  }

  public void setCouponType(final String couponType) {
    this.couponType = couponType;
  }

  public CouponDiscount getDiscount() {
    return this.discount;
  }

  public void setDiscount(final CouponDiscount discount) {
    this.discount = discount;
  }

  public DateTime getExpiredAt() {
    return this.expiredAt;
  }

  public void setExpiredAt(final DateTime expiredAt) {
    this.expiredAt = expiredAt;
  }

  public String getId() {
    return this.id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getObject() {
    return this.object;
  }

  public void setObject(final String object) {
    this.object = object;
  }

  public String getState() {
    return this.state;
  }

  public void setState(final String state) {
    this.state = state;
  }
}
