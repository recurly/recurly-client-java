/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.time.ZonedDateTime;
import java.util.List;

public class ExternalSubscription extends Resource {

  /** Account mini details */
  @SerializedName("account")
  @Expose
  private AccountMini account;

  /** When the external subscription was activated in the external platform. */
  @SerializedName("activated_at")
  @Expose
  private ZonedDateTime activatedAt;

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

  /** When the external subscription was canceled in the external platform. */
  @SerializedName("canceled_at")
  @Expose
  private ZonedDateTime canceledAt;

  /** When the external subscription was created in Recurly. */
  @SerializedName("created_at")
  @Expose
  private ZonedDateTime createdAt;

  /** When the external subscription expires in the external platform. */
  @SerializedName("expires_at")
  @Expose
  private ZonedDateTime expiresAt;

  /**
   * The id of the subscription in the external systems., I.e. Apple App Store or Google Play Store.
   */
  @SerializedName("external_id")
  @Expose
  private String externalId;

  /** The phases of the external subscription payment lifecycle. */
  @SerializedName("external_payment_phases")
  @Expose
  private List<ExternalPaymentPhase> externalPaymentPhases;

  /** External Product Reference details */
  @SerializedName("external_product_reference")
  @Expose
  private ExternalProductReferenceMini externalProductReference;

  /** System-generated unique identifier for an external subscription ID, e.g. `e28zov4fw0v2`. */
  @SerializedName("id")
  @Expose
  private String id;

  /**
   * An indication of whether or not the external subscription was created by a historical data
   * import.
   */
  @SerializedName("imported")
  @Expose
  private Boolean imported;

  /** An indication of whether or not the external subscription is in a grace period. */
  @SerializedName("in_grace_period")
  @Expose
  private Boolean inGracePeriod;

  /**
   * When a new billing event occurred on the external subscription in conjunction with a recent
   * billing period, reactivation or upgrade/downgrade.
   */
  @SerializedName("last_purchased")
  @Expose
  private ZonedDateTime lastPurchased;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

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

  /**
   * An indication of whether or not the external subscription was purchased in a sandbox
   * environment.
   */
  @SerializedName("test")
  @Expose
  private Boolean test;

  /** When the external subscription trial period ends in the external platform. */
  @SerializedName("trial_ends_at")
  @Expose
  private ZonedDateTime trialEndsAt;

  /** When the external subscription trial period started in the external platform. */
  @SerializedName("trial_started_at")
  @Expose
  private ZonedDateTime trialStartedAt;

  /** When the external subscription was updated in Recurly. */
  @SerializedName("updated_at")
  @Expose
  private ZonedDateTime updatedAt;

  /** Universally Unique Identifier created automatically. */
  @SerializedName("uuid")
  @Expose
  private String uuid;

  /** Account mini details */
  public AccountMini getAccount() {
    return this.account;
  }

  /**
   * @param account Account mini details
   */
  public void setAccount(final AccountMini account) {
    this.account = account;
  }

  /** When the external subscription was activated in the external platform. */
  public ZonedDateTime getActivatedAt() {
    return this.activatedAt;
  }

  /**
   * @param activatedAt When the external subscription was activated in the external platform.
   */
  public void setActivatedAt(final ZonedDateTime activatedAt) {
    this.activatedAt = activatedAt;
  }

  /** Identifier of the app that generated the external subscription. */
  public String getAppIdentifier() {
    return this.appIdentifier;
  }

  /**
   * @param appIdentifier Identifier of the app that generated the external subscription.
   */
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

  /** When the external subscription was canceled in the external platform. */
  public ZonedDateTime getCanceledAt() {
    return this.canceledAt;
  }

  /**
   * @param canceledAt When the external subscription was canceled in the external platform.
   */
  public void setCanceledAt(final ZonedDateTime canceledAt) {
    this.canceledAt = canceledAt;
  }

  /** When the external subscription was created in Recurly. */
  public ZonedDateTime getCreatedAt() {
    return this.createdAt;
  }

  /**
   * @param createdAt When the external subscription was created in Recurly.
   */
  public void setCreatedAt(final ZonedDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** When the external subscription expires in the external platform. */
  public ZonedDateTime getExpiresAt() {
    return this.expiresAt;
  }

  /**
   * @param expiresAt When the external subscription expires in the external platform.
   */
  public void setExpiresAt(final ZonedDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The id of the subscription in the external systems., I.e. Apple App Store or Google Play Store.
   */
  public String getExternalId() {
    return this.externalId;
  }

  /**
   * @param externalId The id of the subscription in the external systems., I.e. Apple App Store or
   *     Google Play Store.
   */
  public void setExternalId(final String externalId) {
    this.externalId = externalId;
  }

  /** The phases of the external subscription payment lifecycle. */
  public List<ExternalPaymentPhase> getExternalPaymentPhases() {
    return this.externalPaymentPhases;
  }

  /**
   * @param externalPaymentPhases The phases of the external subscription payment lifecycle.
   */
  public void setExternalPaymentPhases(final List<ExternalPaymentPhase> externalPaymentPhases) {
    this.externalPaymentPhases = externalPaymentPhases;
  }

  /** External Product Reference details */
  public ExternalProductReferenceMini getExternalProductReference() {
    return this.externalProductReference;
  }

  /**
   * @param externalProductReference External Product Reference details
   */
  public void setExternalProductReference(
      final ExternalProductReferenceMini externalProductReference) {
    this.externalProductReference = externalProductReference;
  }

  /** System-generated unique identifier for an external subscription ID, e.g. `e28zov4fw0v2`. */
  public String getId() {
    return this.id;
  }

  /**
   * @param id System-generated unique identifier for an external subscription ID, e.g.
   *     `e28zov4fw0v2`.
   */
  public void setId(final String id) {
    this.id = id;
  }

  /**
   * An indication of whether or not the external subscription was created by a historical data
   * import.
   */
  public Boolean getImported() {
    return this.imported;
  }

  /**
   * @param imported An indication of whether or not the external subscription was created by a
   *     historical data import.
   */
  public void setImported(final Boolean imported) {
    this.imported = imported;
  }

  /** An indication of whether or not the external subscription is in a grace period. */
  public Boolean getInGracePeriod() {
    return this.inGracePeriod;
  }

  /**
   * @param inGracePeriod An indication of whether or not the external subscription is in a grace
   *     period.
   */
  public void setInGracePeriod(final Boolean inGracePeriod) {
    this.inGracePeriod = inGracePeriod;
  }

  /**
   * When a new billing event occurred on the external subscription in conjunction with a recent
   * billing period, reactivation or upgrade/downgrade.
   */
  public ZonedDateTime getLastPurchased() {
    return this.lastPurchased;
  }

  /**
   * @param lastPurchased When a new billing event occurred on the external subscription in
   *     conjunction with a recent billing period, reactivation or upgrade/downgrade.
   */
  public void setLastPurchased(final ZonedDateTime lastPurchased) {
    this.lastPurchased = lastPurchased;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /**
   * @param object Object type
   */
  public void setObject(final String object) {
    this.object = object;
  }

  /** An indication of the quantity of a subscribed item's quantity. */
  public Integer getQuantity() {
    return this.quantity;
  }

  /**
   * @param quantity An indication of the quantity of a subscribed item's quantity.
   */
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

  /**
   * An indication of whether or not the external subscription was purchased in a sandbox
   * environment.
   */
  public Boolean getTest() {
    return this.test;
  }

  /**
   * @param test An indication of whether or not the external subscription was purchased in a
   *     sandbox environment.
   */
  public void setTest(final Boolean test) {
    this.test = test;
  }

  /** When the external subscription trial period ends in the external platform. */
  public ZonedDateTime getTrialEndsAt() {
    return this.trialEndsAt;
  }

  /**
   * @param trialEndsAt When the external subscription trial period ends in the external platform.
   */
  public void setTrialEndsAt(final ZonedDateTime trialEndsAt) {
    this.trialEndsAt = trialEndsAt;
  }

  /** When the external subscription trial period started in the external platform. */
  public ZonedDateTime getTrialStartedAt() {
    return this.trialStartedAt;
  }

  /**
   * @param trialStartedAt When the external subscription trial period started in the external
   *     platform.
   */
  public void setTrialStartedAt(final ZonedDateTime trialStartedAt) {
    this.trialStartedAt = trialStartedAt;
  }

  /** When the external subscription was updated in Recurly. */
  public ZonedDateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * @param updatedAt When the external subscription was updated in Recurly.
   */
  public void setUpdatedAt(final ZonedDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /** Universally Unique Identifier created automatically. */
  public String getUuid() {
    return this.uuid;
  }

  /**
   * @param uuid Universally Unique Identifier created automatically.
   */
  public void setUuid(final String uuid) {
    this.uuid = uuid;
  }
}
