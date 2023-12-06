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

public class ExternalPaymentPhase extends Resource {

  /** Allows up to 9 decimal places */
  @SerializedName("amount")
  @Expose
  private String amount;

  /** When the external subscription was created in Recurly. */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /** Ending Billing Period Index */
  @SerializedName("ending_billing_period_index")
  @Expose
  private Integer endingBillingPeriodIndex;

  /** Ends At */
  @SerializedName("ends_at")
  @Expose
  private DateTime endsAt;

  /** Subscription from an external resource such as Apple App Store or Google Play Store. */
  @SerializedName("external_subscription")
  @Expose
  private ExternalSubscription externalSubscription;

  /** System-generated unique identifier for an external payment phase ID, e.g. `e28zov4fw0v2`. */
  @SerializedName("id")
  @Expose
  private String id;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** Name of the discount offer given, e.g. "introductory" */
  @SerializedName("offer_name")
  @Expose
  private String offerName;

  /** Type of discount offer given, e.g. "FREE_TRIAL" */
  @SerializedName("offer_type")
  @Expose
  private String offerType;

  /** Number of billing periods */
  @SerializedName("period_count")
  @Expose
  private Integer periodCount;

  /** Billing cycle length */
  @SerializedName("period_length")
  @Expose
  private String periodLength;

  /** Started At */
  @SerializedName("started_at")
  @Expose
  private DateTime startedAt;

  /** Starting Billing Period Index */
  @SerializedName("starting_billing_period_index")
  @Expose
  private Integer startingBillingPeriodIndex;

  /** When the external subscription was updated in Recurly. */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /** Allows up to 9 decimal places */
  public String getAmount() {
    return this.amount;
  }

  /** @param amount Allows up to 9 decimal places */
  public void setAmount(final String amount) {
    this.amount = amount;
  }

  /** When the external subscription was created in Recurly. */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt When the external subscription was created in Recurly. */
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

  /** Ending Billing Period Index */
  public Integer getEndingBillingPeriodIndex() {
    return this.endingBillingPeriodIndex;
  }

  /** @param endingBillingPeriodIndex Ending Billing Period Index */
  public void setEndingBillingPeriodIndex(final Integer endingBillingPeriodIndex) {
    this.endingBillingPeriodIndex = endingBillingPeriodIndex;
  }

  /** Ends At */
  public DateTime getEndsAt() {
    return this.endsAt;
  }

  /** @param endsAt Ends At */
  public void setEndsAt(final DateTime endsAt) {
    this.endsAt = endsAt;
  }

  /** Subscription from an external resource such as Apple App Store or Google Play Store. */
  public ExternalSubscription getExternalSubscription() {
    return this.externalSubscription;
  }

  /**
   * @param externalSubscription Subscription from an external resource such as Apple App Store or
   *     Google Play Store.
   */
  public void setExternalSubscription(final ExternalSubscription externalSubscription) {
    this.externalSubscription = externalSubscription;
  }

  /** System-generated unique identifier for an external payment phase ID, e.g. `e28zov4fw0v2`. */
  public String getId() {
    return this.id;
  }

  /**
   * @param id System-generated unique identifier for an external payment phase ID, e.g.
   *     `e28zov4fw0v2`.
   */
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

  /** Name of the discount offer given, e.g. "introductory" */
  public String getOfferName() {
    return this.offerName;
  }

  /** @param offerName Name of the discount offer given, e.g. "introductory" */
  public void setOfferName(final String offerName) {
    this.offerName = offerName;
  }

  /** Type of discount offer given, e.g. "FREE_TRIAL" */
  public String getOfferType() {
    return this.offerType;
  }

  /** @param offerType Type of discount offer given, e.g. "FREE_TRIAL" */
  public void setOfferType(final String offerType) {
    this.offerType = offerType;
  }

  /** Number of billing periods */
  public Integer getPeriodCount() {
    return this.periodCount;
  }

  /** @param periodCount Number of billing periods */
  public void setPeriodCount(final Integer periodCount) {
    this.periodCount = periodCount;
  }

  /** Billing cycle length */
  public String getPeriodLength() {
    return this.periodLength;
  }

  /** @param periodLength Billing cycle length */
  public void setPeriodLength(final String periodLength) {
    this.periodLength = periodLength;
  }

  /** Started At */
  public DateTime getStartedAt() {
    return this.startedAt;
  }

  /** @param startedAt Started At */
  public void setStartedAt(final DateTime startedAt) {
    this.startedAt = startedAt;
  }

  /** Starting Billing Period Index */
  public Integer getStartingBillingPeriodIndex() {
    return this.startingBillingPeriodIndex;
  }

  /** @param startingBillingPeriodIndex Starting Billing Period Index */
  public void setStartingBillingPeriodIndex(final Integer startingBillingPeriodIndex) {
    this.startingBillingPeriodIndex = startingBillingPeriodIndex;
  }

  /** When the external subscription was updated in Recurly. */
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt When the external subscription was updated in Recurly. */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
}
