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

public class CouponRedemption extends Resource {

  /** The Account on which the coupon was applied. */
  @SerializedName("account")
  @Expose
  private AccountMini account;

  @SerializedName("coupon")
  @Expose
  private Coupon coupon;

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

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

  /** The date and time the redemption was removed from the account (un-redeemed). */
  @SerializedName("removed_at")
  @Expose
  private DateTime removedAt;

  /** Coupon Redemption state */
  @SerializedName("state")
  @Expose
  private Constants.ActiveState state;

  /** Subscription ID */
  @SerializedName("subscription_id")
  @Expose
  private String subscriptionId;

  /** Last updated at */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /** The Account on which the coupon was applied. */
  public AccountMini getAccount() {
    return this.account;
  }

  /** @param account The Account on which the coupon was applied. */
  public void setAccount(final AccountMini account) {
    this.account = account;
  }

  public Coupon getCoupon() {
    return this.coupon;
  }

  /** @param coupon */
  public void setCoupon(final Coupon coupon) {
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

  /** 3-letter ISO 4217 currency code. */
  public String getCurrency() {
    return this.currency;
  }

  /** @param currency 3-letter ISO 4217 currency code. */
  public void setCurrency(final String currency) {
    this.currency = currency;
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

  /** The date and time the redemption was removed from the account (un-redeemed). */
  public DateTime getRemovedAt() {
    return this.removedAt;
  }

  /**
   * @param removedAt The date and time the redemption was removed from the account (un-redeemed).
   */
  public void setRemovedAt(final DateTime removedAt) {
    this.removedAt = removedAt;
  }

  /** Coupon Redemption state */
  public Constants.ActiveState getState() {
    return this.state;
  }

  /** @param state Coupon Redemption state */
  public void setState(final Constants.ActiveState state) {
    this.state = state;
  }

  /** Subscription ID */
  public String getSubscriptionId() {
    return this.subscriptionId;
  }

  /** @param subscriptionId Subscription ID */
  public void setSubscriptionId(final String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  /** Last updated at */
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt Last updated at */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
}
