/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.math.BigDecimal;
import org.joda.time.DateTime;

public class ExternalCharge extends Resource {

  /** Account mini details */
  @SerializedName("account")
  @Expose
  private AccountMini account;

  /** When the external charge was created in Recurly. */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  @SerializedName("description")
  @Expose
  private String description;

  /** External Product Reference details */
  @SerializedName("external_product_reference")
  @Expose
  private ExternalProductReferenceMini externalProductReference;

  /** System-generated unique identifier for an external charge ID, e.g. `e28zov4fw0v2`. */
  @SerializedName("id")
  @Expose
  private String id;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /** Unit Amount */
  @SerializedName("unit_amount")
  @Expose
  private BigDecimal unitAmount;

  /** When the external charge was updated in Recurly. */
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

  /** When the external charge was created in Recurly. */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt When the external charge was created in Recurly. */
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

  public String getDescription() {
    return this.description;
  }

  /** @param description */
  public void setDescription(final String description) {
    this.description = description;
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

  /** System-generated unique identifier for an external charge ID, e.g. `e28zov4fw0v2`. */
  public String getId() {
    return this.id;
  }

  /**
   * @param id System-generated unique identifier for an external charge ID, e.g. `e28zov4fw0v2`.
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

  public Integer getQuantity() {
    return this.quantity;
  }

  /** @param quantity */
  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  /** Unit Amount */
  public BigDecimal getUnitAmount() {
    return this.unitAmount;
  }

  /** @param unitAmount Unit Amount */
  public void setUnitAmount(final BigDecimal unitAmount) {
    this.unitAmount = unitAmount;
  }

  /** When the external charge was updated in Recurly. */
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt When the external charge was updated in Recurly. */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
}
