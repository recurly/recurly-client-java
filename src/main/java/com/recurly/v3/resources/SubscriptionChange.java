/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.util.List;
import org.joda.time.DateTime;

public class SubscriptionChange extends Resource {

  /** Activated at */
  @SerializedName("activate_at")
  @Expose
  private DateTime activateAt;

  /** Returns `true` if the subscription change is activated. */
  @SerializedName("activated")
  @Expose
  private Boolean activated;

  /** These add-ons will be used when the subscription renews. */
  @SerializedName("add_ons")
  @Expose
  private List<SubscriptionAddOn> addOns;

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** Deleted at */
  @SerializedName("deleted_at")
  @Expose
  private DateTime deletedAt;

  /** The ID of the Subscription Change. */
  @SerializedName("id")
  @Expose
  private String id;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** Just the important parts. */
  @SerializedName("plan")
  @Expose
  private PlanMini plan;

  /** Subscription quantity */
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /** Subscription shipping details */
  @SerializedName("shipping")
  @Expose
  private SubscriptionShipping shipping;

  /** The ID of the subscription that is going to be changed. */
  @SerializedName("subscription_id")
  @Expose
  private String subscriptionId;

  /** Unit amount */
  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;

  /** Updated at */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /** Activated at */
  public DateTime getActivateAt() {
    return this.activateAt;
  }

  /** @param activateAt Activated at */
  public void setActivateAt(final DateTime activateAt) {
    this.activateAt = activateAt;
  }

  /** Returns `true` if the subscription change is activated. */
  public Boolean getActivated() {
    return this.activated;
  }

  /** @param activated Returns `true` if the subscription change is activated. */
  public void setActivated(final Boolean activated) {
    this.activated = activated;
  }

  /** These add-ons will be used when the subscription renews. */
  public List<SubscriptionAddOn> getAddOns() {
    return this.addOns;
  }

  /** @param addOns These add-ons will be used when the subscription renews. */
  public void setAddOns(final List<SubscriptionAddOn> addOns) {
    this.addOns = addOns;
  }

  /** Created at */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt Created at */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** Deleted at */
  public DateTime getDeletedAt() {
    return this.deletedAt;
  }

  /** @param deletedAt Deleted at */
  public void setDeletedAt(final DateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  /** The ID of the Subscription Change. */
  public String getId() {
    return this.id;
  }

  /** @param id The ID of the Subscription Change. */
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

  /** Just the important parts. */
  public PlanMini getPlan() {
    return this.plan;
  }

  /** @param plan Just the important parts. */
  public void setPlan(final PlanMini plan) {
    this.plan = plan;
  }

  /** Subscription quantity */
  public Integer getQuantity() {
    return this.quantity;
  }

  /** @param quantity Subscription quantity */
  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  /** Subscription shipping details */
  public SubscriptionShipping getShipping() {
    return this.shipping;
  }

  /** @param shipping Subscription shipping details */
  public void setShipping(final SubscriptionShipping shipping) {
    this.shipping = shipping;
  }

  /** The ID of the subscription that is going to be changed. */
  public String getSubscriptionId() {
    return this.subscriptionId;
  }

  /** @param subscriptionId The ID of the subscription that is going to be changed. */
  public void setSubscriptionId(final String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  /** Unit amount */
  public Float getUnitAmount() {
    return this.unitAmount;
  }

  /** @param unitAmount Unit amount */
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
