/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class SubscriptionAddOn extends Resource {

  @SerializedName("add_on")
  @Expose
  private AddOnMini addOn;

  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  @SerializedName("expired_at")
  @Expose
  private DateTime expiredAt;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("object")
  @Expose
  private String object;

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
