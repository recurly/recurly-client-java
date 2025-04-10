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

public class ExternalChargeCreate extends Request {

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  @SerializedName("description")
  @Expose
  private String description;

  @SerializedName("external_product_reference")
  @Expose
  private ExternalProductReferenceCreate externalProductReference;

  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  @SerializedName("unit_amount")
  @Expose
  private String unitAmount;

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

  public ExternalProductReferenceCreate getExternalProductReference() {
    return this.externalProductReference;
  }

  /** @param externalProductReference */
  public void setExternalProductReference(
      final ExternalProductReferenceCreate externalProductReference) {
    this.externalProductReference = externalProductReference;
  }

  public Integer getQuantity() {
    return this.quantity;
  }

  /** @param quantity */
  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  public String getUnitAmount() {
    return this.unitAmount;
  }

  /** @param unitAmount */
  public void setUnitAmount(final String unitAmount) {
    this.unitAmount = unitAmount;
  }
}
