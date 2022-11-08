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

public class ExternalSubscription extends Resource {

  /** Account mini details */
  @SerializedName("account")
  @Expose
  private AccountMini account;

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

  /** When the external subscription was created in Recurly. */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** When the external subscription expires in the external platform. */
  @SerializedName("expires_at")
  @Expose
  private DateTime expiresAt;

  /** External Product Reference details */
  @SerializedName("external_product_reference")
  @Expose
  private ExternalProductReferenceMini externalProductReference;

  /** External Resource mini details */
  @SerializedName("external_resource")
  @Expose
  private ExternalResourceMini externalResource;

  /** System-generated unique identifier for an external subscription ID, e.g. `e28zov4fw0v2`. */
  @SerializedName("id")
  @Expose
  private String id;

  /**
   * When a new billing event occurred on the external subscription in conjunction with a recent
   * billing period, reactivation or upgrade/downgrade.
   */
  @SerializedName("last_purchased")
  @Expose
  private DateTime lastPurchased;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** An indication of the quantity of a subscribed item's quantity. */
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /** When the external subscription was updated in Recurly. */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /** Account mini details */
  public AccountMini getAccount() {
    return this.account;
  }

  /** @param account Account mini details */
  public void setAccount(final AccountMini account) {
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

  /** When the external subscription was created in Recurly. */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt When the external subscription was created in Recurly. */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** When the external subscription expires in the external platform. */
  public DateTime getExpiresAt() {
    return this.expiresAt;
  }

  /** @param expiresAt When the external subscription expires in the external platform. */
  public void setExpiresAt(final DateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  /** External Product Reference details */
  public ExternalProductReferenceMini getExternalProductReference() {
    return this.externalProductReference;
  }

  /** @param externalProductReference External Product Reference details */
  public void setExternalProductReference(
      final ExternalProductReferenceMini externalProductReference) {
    this.externalProductReference = externalProductReference;
  }

  /** External Resource mini details */
  public ExternalResourceMini getExternalResource() {
    return this.externalResource;
  }

  /** @param externalResource External Resource mini details */
  public void setExternalResource(final ExternalResourceMini externalResource) {
    this.externalResource = externalResource;
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

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  /** An indication of the quantity of a subscribed item's quantity. */
  public Integer getQuantity() {
    return this.quantity;
  }

  /** @param quantity An indication of the quantity of a subscribed item's quantity. */
  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
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
