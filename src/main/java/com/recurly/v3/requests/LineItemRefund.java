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

public class LineItemRefund extends Request {

  /** Line item ID */
  @SerializedName("id")
  @Expose
  private String id;

  /**
   * Set to `true` if the line item should be prorated; set to `false` if not. This can only be used
   * on line items that have a start and end date.
   */
  @SerializedName("prorate")
  @Expose
  private Boolean prorate;

  /** Line item quantity to be refunded. */
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /**
   * A floating-point alternative to Quantity. If this value is present, it will be used in place of
   * Quantity for calculations, and Quantity will be the rounded integer value of this number. This
   * field supports up to 9 decimal places. The Decimal Quantity feature must be enabled to utilize
   * this field.
   */
  @SerializedName("quantity_decimal")
  @Expose
  private String quantityDecimal;

  /** Line item ID */
  public String getId() {
    return this.id;
  }

  /** @param id Line item ID */
  public void setId(final String id) {
    this.id = id;
  }

  /**
   * Set to `true` if the line item should be prorated; set to `false` if not. This can only be used
   * on line items that have a start and end date.
   */
  public Boolean getProrate() {
    return this.prorate;
  }

  /**
   * @param prorate Set to `true` if the line item should be prorated; set to `false` if not. This
   *     can only be used on line items that have a start and end date.
   */
  public void setProrate(final Boolean prorate) {
    this.prorate = prorate;
  }

  /** Line item quantity to be refunded. */
  public Integer getQuantity() {
    return this.quantity;
  }

  /** @param quantity Line item quantity to be refunded. */
  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * A floating-point alternative to Quantity. If this value is present, it will be used in place of
   * Quantity for calculations, and Quantity will be the rounded integer value of this number. This
   * field supports up to 9 decimal places. The Decimal Quantity feature must be enabled to utilize
   * this field.
   */
  public String getQuantityDecimal() {
    return this.quantityDecimal;
  }

  /**
   * @param quantityDecimal A floating-point alternative to Quantity. If this value is present, it
   *     will be used in place of Quantity for calculations, and Quantity will be the rounded
   *     integer value of this number. This field supports up to 9 decimal places. The Decimal
   *     Quantity feature must be enabled to utilize this field.
   */
  public void setQuantityDecimal(final String quantityDecimal) {
    this.quantityDecimal = quantityDecimal;
  }
}
