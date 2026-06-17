/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import com.recurly.v3.resources.*;
import org.joda.time.DateTime;

public class ExternalSubscriptionCreate extends Request {

  @SerializedName("account")
  @Expose
  private AccountExternalSubscription account;

  /** When the external subscription was activated in the external platform. */
  @SerializedName("activated_at")
  @Expose
  private DateTime activatedAt;

  /** Identifier of the app that generated the external subscription. */
  @SerializedName("app_identifier")
  @Expose
  private String appIdentifier;

  /**
   * An indication of whether or not the external subscription will auto-renew at the expiration
   * date.
   */
  @SerializedName("auto_renew")
  @Expose
  private Boolean autoRenew;

  /** When the external subscription expires in the external platform. */
  @SerializedName("expires_at")
  @Expose
  private DateTime expiresAt;

  /** Id of the subscription in the external system, i.e. Apple App Store or Google Play Store. */
  @SerializedName("external_id")
  @Expose
  private String externalId;

  @SerializedName("external_product_reference")
  @Expose
  private ExternalProductReferenceCreate externalProductReference;

  /**
   * An indication of whether or not the external subscription was being created by a historical
   * data import.
   */
  @SerializedName("imported")
  @Expose
  private Boolean imported;

  /**
   * When a new billing event occurred on the external subscription in conjunction with a recent
   * billing period, reactivation or upgrade/downgrade.
   */
  @SerializedName("last_purchased")
  @Expose
  private DateTime lastPurchased;

  /** An indication of the quantity of a subscribed item's quantity. */
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /**
   * External subscriptions can be active, canceled, expired, past_due, voided, revoked, or paused.
   */
  @SerializedName("state")
  @Expose
  private String state;

  /** When the external subscription trial period ends in the external platform. */
  @SerializedName("trial_ends_at")
  @Expose
  private DateTime trialEndsAt;

  /** When the external subscription trial period started in the external platform. */
  @SerializedName("trial_started_at")
  @Expose
  private DateTime trialStartedAt;

  public AccountExternalSubscription getAccount() {
    return this.account;
  }

  /** @param account */
  public void setAccount(final AccountExternalSubscription account) {
    this.account = account;
  }

  /** When the external subscription was activated in the external platform. */
  public DateTime getActivatedAt() {
    return this.activatedAt;
  }

  /** @param activatedAt When the external subscription was activated in the external platform. */
  public void setActivatedAt(final DateTime activatedAt) {
    this.activatedAt = activatedAt;
  }

  /** Identifier of the app that generated the external subscription. */
  public String getAppIdentifier() {
    return this.appIdentifier;
  }

  /** @param appIdentifier Identifier of the app that generated the external subscription. */
  public void setAppIdentifier(final String appIdentifier) {
    this.appIdentifier = appIdentifier;
  }

  /**
   * An indication of whether or not the external subscription will auto-renew at the expiration
   * date.
   */
  public Boolean getAutoRenew() {
    return this.autoRenew;
  }

  /**
   * @param autoRenew An indication of whether or not the external subscription will auto-renew at
   *     the expiration date.
   */
  public void setAutoRenew(final Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  /** When the external subscription expires in the external platform. */
  public DateTime getExpiresAt() {
    return this.expiresAt;
  }

  /** @param expiresAt When the external subscription expires in the external platform. */
  public void setExpiresAt(final DateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  /** Id of the subscription in the external system, i.e. Apple App Store or Google Play Store. */
  public String getExternalId() {
    return this.externalId;
  }

  /**
   * @param externalId Id of the subscription in the external system, i.e. Apple App Store or Google
   *     Play Store.
   */
  public void setExternalId(final String externalId) {
    this.externalId = externalId;
  }

  public ExternalProductReferenceCreate getExternalProductReference() {
    return this.externalProductReference;
  }

  /** @param externalProductReference */
  public void setExternalProductReference(
      final ExternalProductReferenceCreate externalProductReference) {
    this.externalProductReference = externalProductReference;
  }

  /**
   * An indication of whether or not the external subscription was being created by a historical
   * data import.
   */
  public Boolean getImported() {
    return this.imported;
  }

  /**
   * @param imported An indication of whether or not the external subscription was being created by
   *     a historical data import.
   */
  public void setImported(final Boolean imported) {
    this.imported = imported;
  }

  /**
   * When a new billing event occurred on the external subscription in conjunction with a recent
   * billing period, reactivation or upgrade/downgrade.
   */
  public DateTime getLastPurchased() {
    return this.lastPurchased;
  }

  /**
   * @param lastPurchased When a new billing event occurred on the external subscription in
   *     conjunction with a recent billing period, reactivation or upgrade/downgrade.
   */
  public void setLastPurchased(final DateTime lastPurchased) {
    this.lastPurchased = lastPurchased;
  }

  /** An indication of the quantity of a subscribed item's quantity. */
  public Integer getQuantity() {
    return this.quantity;
  }

  /** @param quantity An indication of the quantity of a subscribed item's quantity. */
  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * External subscriptions can be active, canceled, expired, past_due, voided, revoked, or paused.
   */
  public String getState() {
    return this.state;
  }

  /**
   * @param state External subscriptions can be active, canceled, expired, past_due, voided,
   *     revoked, or paused.
   */
  public void setState(final String state) {
    this.state = state;
  }

  /** When the external subscription trial period ends in the external platform. */
  public DateTime getTrialEndsAt() {
    return this.trialEndsAt;
  }

  /**
   * @param trialEndsAt When the external subscription trial period ends in the external platform.
   */
  public void setTrialEndsAt(final DateTime trialEndsAt) {
    this.trialEndsAt = trialEndsAt;
  }

  /** When the external subscription trial period started in the external platform. */
  public DateTime getTrialStartedAt() {
    return this.trialStartedAt;
  }

  /**
   * @param trialStartedAt When the external subscription trial period started in the external
   *     platform.
   */
  public void setTrialStartedAt(final DateTime trialStartedAt) {
    this.trialStartedAt = trialStartedAt;
  }
}
