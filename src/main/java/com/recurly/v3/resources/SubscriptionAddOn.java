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

public class SubscriptionAddOn extends Resource {

  /** Just the important parts. */
  @SerializedName("add_on")
  @Expose
  private AddOnMini addOn;

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** Expired at */
  @SerializedName("expired_at")
  @Expose
  private DateTime expiredAt;

  /** Subscription Add-on ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** Add-on quantity */
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /** Subscription ID */
  @SerializedName("subscription_id")
  @Expose
  private String subscriptionId;

  /** This is priced in the subscription's currency. */
  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;

  /** Updated at */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /** Just the important parts. */
  public AddOnMini getAddOn() {
    return this.addOn;
  }

  /** @param addOn Just the important parts. */
  public void setAddOn(final AddOnMini addOn) {
    this.addOn = addOn;
  }

  /** Created at */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt Created at */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** Expired at */
  public DateTime getExpiredAt() {
    return this.expiredAt;
  }

  /** @param expiredAt Expired at */
  public void setExpiredAt(final DateTime expiredAt) {
    this.expiredAt = expiredAt;
  }

  /** Subscription Add-on ID */
  public String getId() {
    return this.id;
  }

  /** @param id Subscription Add-on ID */
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

  /** Add-on quantity */
  public Integer getQuantity() {
    return this.quantity;
  }

  /** @param quantity Add-on quantity */
  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  /** Subscription ID */
  public String getSubscriptionId() {
    return this.subscriptionId;
  }

  /** @param subscriptionId Subscription ID */
  public void setSubscriptionId(final String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  /** This is priced in the subscription's currency. */
  public Float getUnitAmount() {
    return this.unitAmount;
  }

  /** @param unitAmount This is priced in the subscription's currency. */
  public void setUnitAmount(final Float unitAmount) {
    this.unitAmount = unitAmount;
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
