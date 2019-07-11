package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class SubscriptionChange extends Resource {

  @SerializedName("activate_at")
  @Expose
  private DateTime activateAt;

  @SerializedName("activated")
  @Expose
  private Boolean activated;

  @SerializedName("add_ons")
  @Expose
  private List<SubscriptionAddOn> addOns;

  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  @SerializedName("deleted_at")
  @Expose
  private DateTime deletedAt;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("plan")
  @Expose
  private PlanMini plan;

  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  @SerializedName("subscription_id")
  @Expose
  private String subscriptionId;

  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;

  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;


  public DateTime getActivateAt() { return this.activateAt; }
  public void setActivateAt(final DateTime activateAt) { this.activateAt = activateAt; }

  public Boolean getActivated() { return this.activated; }
  public void setActivated(final Boolean activated) { this.activated = activated; }

  public List<SubscriptionAddOn> getAddOns() { return this.addOns; }
  public void setAddOns(final List<SubscriptionAddOn> addOns) { this.addOns = addOns; }

  public DateTime getCreatedAt() { return this.createdAt; }
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  public DateTime getDeletedAt() { return this.deletedAt; }
  public void setDeletedAt(final DateTime deletedAt) { this.deletedAt = deletedAt; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public PlanMini getPlan() { return this.plan; }
  public void setPlan(final PlanMini plan) { this.plan = plan; }

  public Integer getQuantity() { return this.quantity; }
  public void setQuantity(final Integer quantity) { this.quantity = quantity; }

  public String getSubscriptionId() { return this.subscriptionId; }
  public void setSubscriptionId(final String subscriptionId) { this.subscriptionId = subscriptionId; }

  public Float getUnitAmount() { return this.unitAmount; }
  public void setUnitAmount(final Float unitAmount) { this.unitAmount = unitAmount; }

  public DateTime getUpdatedAt() { return this.updatedAt; }
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

}
