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

public class Usage extends Resource {

  /**
   * The amount of usage. Can be positive, negative, or 0. If the Decimal Quantity feature is
   * enabled, this value will be rounded to nine decimal places. Otherwise, all digits after the
   * decimal will be stripped. If the usage-based add-on is billed with a percentage, your usage
   * should be a monetary amount formatted in cents (e.g., $5.00 is "500").
   */
  @SerializedName("amount")
  @Expose
  private Float amount;

  /** When the usage record was billed on an invoice. */
  @SerializedName("billed_at")
  @Expose
  private DateTime billedAt;

  /** When the usage record was created in Recurly. */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  @SerializedName("id")
  @Expose
  private String id;

  /** The ID of the measured unit associated with the add-on the usage record is for. */
  @SerializedName("measured_unit_id")
  @Expose
  private String measuredUnitId;

  /**
   * Custom field for recording the id in your own system associated with the usage, so you can
   * provide auditable usage displays to your customers using a GET on this endpoint.
   */
  @SerializedName("merchant_tag")
  @Expose
  private String merchantTag;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** When the usage was recorded in your system. */
  @SerializedName("recording_timestamp")
  @Expose
  private DateTime recordingTimestamp;

  /**
   * The pricing model for the add-on. For more information, [click
   * here](https://docs.recurly.com/docs/billing-models#section-quantity-based).
   */
  @SerializedName("tier_type")
  @Expose
  private String tierType;

  /**
   * The tiers and prices of the subscription based on the usage_timestamp. If tier_type = flat,
   * tiers = null
   */
  @SerializedName("tiers")
  @Expose
  private List<SubscriptionAddOnTier> tiers;

  /** Unit price */
  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;

  /** When the usage record was billed on an invoice. */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /**
   * The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal
   * places. A value between 0.0 and 100.0.
   */
  @SerializedName("usage_percentage")
  @Expose
  private Float usagePercentage;

  /**
   * When the usage actually happened. This will define the line item dates this usage is billed
   * under and is important for revenue recognition.
   */
  @SerializedName("usage_timestamp")
  @Expose
  private DateTime usageTimestamp;

  /** Type of usage, returns usage type if `add_on_type` is `usage`. */
  @SerializedName("usage_type")
  @Expose
  private String usageType;

  /**
   * The amount of usage. Can be positive, negative, or 0. If the Decimal Quantity feature is
   * enabled, this value will be rounded to nine decimal places. Otherwise, all digits after the
   * decimal will be stripped. If the usage-based add-on is billed with a percentage, your usage
   * should be a monetary amount formatted in cents (e.g., $5.00 is "500").
   */
  public Float getAmount() {
    return this.amount;
  }

  /**
   * @param amount The amount of usage. Can be positive, negative, or 0. If the Decimal Quantity
   *     feature is enabled, this value will be rounded to nine decimal places. Otherwise, all
   *     digits after the decimal will be stripped. If the usage-based add-on is billed with a
   *     percentage, your usage should be a monetary amount formatted in cents (e.g., $5.00 is
   *     "500").
   */
  public void setAmount(final Float amount) {
    this.amount = amount;
  }

  /** When the usage record was billed on an invoice. */
  public DateTime getBilledAt() {
    return this.billedAt;
  }

  /** @param billedAt When the usage record was billed on an invoice. */
  public void setBilledAt(final DateTime billedAt) {
    this.billedAt = billedAt;
  }

  /** When the usage record was created in Recurly. */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt When the usage record was created in Recurly. */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public String getId() {
    return this.id;
  }

  /** @param id */
  public void setId(final String id) {
    this.id = id;
  }

  /** The ID of the measured unit associated with the add-on the usage record is for. */
  public String getMeasuredUnitId() {
    return this.measuredUnitId;
  }

  /**
   * @param measuredUnitId The ID of the measured unit associated with the add-on the usage record
   *     is for.
   */
  public void setMeasuredUnitId(final String measuredUnitId) {
    this.measuredUnitId = measuredUnitId;
  }

  /**
   * Custom field for recording the id in your own system associated with the usage, so you can
   * provide auditable usage displays to your customers using a GET on this endpoint.
   */
  public String getMerchantTag() {
    return this.merchantTag;
  }

  /**
   * @param merchantTag Custom field for recording the id in your own system associated with the
   *     usage, so you can provide auditable usage displays to your customers using a GET on this
   *     endpoint.
   */
  public void setMerchantTag(final String merchantTag) {
    this.merchantTag = merchantTag;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  /** When the usage was recorded in your system. */
  public DateTime getRecordingTimestamp() {
    return this.recordingTimestamp;
  }

  /** @param recordingTimestamp When the usage was recorded in your system. */
  public void setRecordingTimestamp(final DateTime recordingTimestamp) {
    this.recordingTimestamp = recordingTimestamp;
  }

  /**
   * The pricing model for the add-on. For more information, [click
   * here](https://docs.recurly.com/docs/billing-models#section-quantity-based).
   */
  public String getTierType() {
    return this.tierType;
  }

  /**
   * @param tierType The pricing model for the add-on. For more information, [click
   *     here](https://docs.recurly.com/docs/billing-models#section-quantity-based).
   */
  public void setTierType(final String tierType) {
    this.tierType = tierType;
  }

  /**
   * The tiers and prices of the subscription based on the usage_timestamp. If tier_type = flat,
   * tiers = null
   */
  public List<SubscriptionAddOnTier> getTiers() {
    return this.tiers;
  }

  /**
   * @param tiers The tiers and prices of the subscription based on the usage_timestamp. If
   *     tier_type = flat, tiers = null
   */
  public void setTiers(final List<SubscriptionAddOnTier> tiers) {
    this.tiers = tiers;
  }

  /** Unit price */
  public Float getUnitAmount() {
    return this.unitAmount;
  }

  /** @param unitAmount Unit price */
  public void setUnitAmount(final Float unitAmount) {
    this.unitAmount = unitAmount;
  }

  /** When the usage record was billed on an invoice. */
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt When the usage record was billed on an invoice. */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal
   * places. A value between 0.0 and 100.0.
   */
  public Float getUsagePercentage() {
    return this.usagePercentage;
  }

  /**
   * @param usagePercentage The percentage taken of the monetary amount of usage tracked. This can
   *     be up to 4 decimal places. A value between 0.0 and 100.0.
   */
  public void setUsagePercentage(final Float usagePercentage) {
    this.usagePercentage = usagePercentage;
  }

  /**
   * When the usage actually happened. This will define the line item dates this usage is billed
   * under and is important for revenue recognition.
   */
  public DateTime getUsageTimestamp() {
    return this.usageTimestamp;
  }

  /**
   * @param usageTimestamp When the usage actually happened. This will define the line item dates
   *     this usage is billed under and is important for revenue recognition.
   */
  public void setUsageTimestamp(final DateTime usageTimestamp) {
    this.usageTimestamp = usageTimestamp;
  }

  /** Type of usage, returns usage type if `add_on_type` is `usage`. */
  public String getUsageType() {
    return this.usageType;
  }

  /** @param usageType Type of usage, returns usage type if `add_on_type` is `usage`. */
  public void setUsageType(final String usageType) {
    this.usageType = usageType;
  }
}
