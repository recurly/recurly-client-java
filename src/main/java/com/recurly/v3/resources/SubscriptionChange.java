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
import java.math.BigDecimal;
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

  /** Accept nested attributes for three_d_secure_action_result_token_id */
  @SerializedName("billing_info")
  @Expose
  private SubscriptionChangeBillingInfo billingInfo;

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  @SerializedName("custom_fields")
  @Expose
  private List<CustomField> customFields;

  /** Deleted at */
  @SerializedName("deleted_at")
  @Expose
  private DateTime deletedAt;

  /** The ID of the Subscription Change. */
  @SerializedName("id")
  @Expose
  private String id;

  /** Invoice Collection */
  @SerializedName("invoice_collection")
  @Expose
  private InvoiceCollection invoiceCollection;

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

  /** The ramp intervals representing the pricing schedule for the subscription. */
  @SerializedName("ramp_intervals")
  @Expose
  private List<SubscriptionRampIntervalResponse> rampIntervals;

  /** Revenue schedule type */
  @SerializedName("revenue_schedule_type")
  @Expose
  private Constants.RevenueScheduleType revenueScheduleType;

  /** Subscription shipping details */
  @SerializedName("shipping")
  @Expose
  private SubscriptionShipping shipping;

  /** The ID of the subscription that is going to be changed. */
  @SerializedName("subscription_id")
  @Expose
  private String subscriptionId;

  /** This field is deprecated. Please do not use it. */
  @SerializedName("tax_inclusive")
  @Expose
  private Boolean taxInclusive;

  /** Unit amount */
  @SerializedName("unit_amount")
  @Expose
  private BigDecimal unitAmount;

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

  /** Accept nested attributes for three_d_secure_action_result_token_id */
  public SubscriptionChangeBillingInfo getBillingInfo() {
    return this.billingInfo;
  }

  /** @param billingInfo Accept nested attributes for three_d_secure_action_result_token_id */
  public void setBillingInfo(final SubscriptionChangeBillingInfo billingInfo) {
    this.billingInfo = billingInfo;
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
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  public List<CustomField> getCustomFields() {
    return this.customFields;
  }

  /**
   * @param customFields The custom fields will only be altered when they are included in a request.
   *     Sending an empty array will not remove any existing values. To remove a field send the name
   *     with a null or empty value.
   */
  public void setCustomFields(final List<CustomField> customFields) {
    this.customFields = customFields;
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

  /** Invoice Collection */
  public InvoiceCollection getInvoiceCollection() {
    return this.invoiceCollection;
  }

  /** @param invoiceCollection Invoice Collection */
  public void setInvoiceCollection(final InvoiceCollection invoiceCollection) {
    this.invoiceCollection = invoiceCollection;
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

  /** The ramp intervals representing the pricing schedule for the subscription. */
  public List<SubscriptionRampIntervalResponse> getRampIntervals() {
    return this.rampIntervals;
  }

  /**
   * @param rampIntervals The ramp intervals representing the pricing schedule for the subscription.
   */
  public void setRampIntervals(final List<SubscriptionRampIntervalResponse> rampIntervals) {
    this.rampIntervals = rampIntervals;
  }

  /** Revenue schedule type */
  public Constants.RevenueScheduleType getRevenueScheduleType() {
    return this.revenueScheduleType;
  }

  /** @param revenueScheduleType Revenue schedule type */
  public void setRevenueScheduleType(final Constants.RevenueScheduleType revenueScheduleType) {
    this.revenueScheduleType = revenueScheduleType;
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

  /** This field is deprecated. Please do not use it. */
  public Boolean getTaxInclusive() {
    return this.taxInclusive;
  }

  /** @param taxInclusive This field is deprecated. Please do not use it. */
  public void setTaxInclusive(final Boolean taxInclusive) {
    this.taxInclusive = taxInclusive;
  }

  /** Unit amount */
  public BigDecimal getUnitAmount() {
    return this.unitAmount;
  }

  /** @param unitAmount Unit amount */
  public void setUnitAmount(final BigDecimal unitAmount) {
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
