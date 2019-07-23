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

public class CouponRedemption extends Resource {

  @SerializedName("account")
  @Expose
  private AccountMini account;

  @SerializedName("coupon")
  @Expose
  private Coupon coupon;

  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  @SerializedName("currency")
  @Expose
  private String currency;

  @SerializedName("discounted")
  @Expose
  private String discounted;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("removed_at")
  @Expose
  private DateTime removedAt;

  @SerializedName("state")
  @Expose
  private String state;

  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  public AccountMini getAccount() {
    return this.account;
  }

  public void setAccount(final AccountMini account) {
    this.account = account;
  }

  public Coupon getCoupon() {
    return this.coupon;
  }

  public void setCoupon(final Coupon coupon) {
    this.coupon = coupon;
  }

  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  public String getDiscounted() {
    return this.discounted;
  }

  public void setDiscounted(final String discounted) {
    this.discounted = discounted;
  }

  public String getId() {
    return this.id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getObject() {
    return this.object;
  }

  public void setObject(final String object) {
    this.object = object;
  }

  public DateTime getRemovedAt() {
    return this.removedAt;
  }

  public void setRemovedAt(final DateTime removedAt) {
    this.removedAt = removedAt;
  }

  public String getState() {
    return this.state;
  }

  public void setState(final String state) {
    this.state = state;
  }

  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
}
