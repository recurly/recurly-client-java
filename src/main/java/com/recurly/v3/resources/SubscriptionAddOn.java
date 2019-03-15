package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class SubscriptionAddOn extends Resource {

  @SerializedName("add_on")
  private AddOnMini addOn;

  @SerializedName("created_at")
  private DateTime createdAt;

  @SerializedName("expired_at")
  private DateTime expiredAt;

  @SerializedName("id")
  private String id;

  @SerializedName("object")
  private String object;

  @SerializedName("quantity")
  private Integer quantity;

  @SerializedName("subscription_id")
  private String subscriptionId;

  @SerializedName("unit_amount")
  private Float unitAmount;

  @SerializedName("updated_at")
  private DateTime updatedAt;


  public AddOnMini getAddOn() { return this.addOn; }
  public void setAddOn(final AddOnMini addOn) { this.addOn = addOn; }

  public DateTime getCreatedAt() { return this.createdAt; }
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  public DateTime getExpiredAt() { return this.expiredAt; }
  public void setExpiredAt(final DateTime expiredAt) { this.expiredAt = expiredAt; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public Integer getQuantity() { return this.quantity; }
  public void setQuantity(final Integer quantity) { this.quantity = quantity; }

  public String getSubscriptionId() { return this.subscriptionId; }
  public void setSubscriptionId(final String subscriptionId) { this.subscriptionId = subscriptionId; }

  public Float getUnitAmount() { return this.unitAmount; }
  public void setUnitAmount(final Float unitAmount) { this.unitAmount = unitAmount; }

  public DateTime getUpdatedAt() { return this.updatedAt; }
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

}
