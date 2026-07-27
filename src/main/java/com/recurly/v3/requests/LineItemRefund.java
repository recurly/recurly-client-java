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
import java.math.BigDecimal;

public class LineItemRefund extends Request {

  /**
   * The specific amount to be refunded from the adjustment. Must be less than or equal to the
   * adjustment's remaining balance. If `quantity`, `quantity_decimal` and `percentage` are not
   * present, `amount` is required. If `quantity`, `quantity_decimal`, or `percentage` is present,
   * `amount` must be absent.
   */
  @SerializedName("amount")
  @Expose
  private BigDecimal amount;

  /** Line item ID */
  @SerializedName("id")
  @Expose
  private String id;

  /**
   * The percentage of the adjustment's remaining balance to refund. If `quantity`,
   * `quantity_decimal` and `amount_in_cents` are not present, `percentage` is required. If
   * `quantity`, `quantity_decimal` or `amount_in_cents` is present, `percentage` must be absent.
   */
  @SerializedName("percentage")
  @Expose
  private Integer percentage;

  /**
   * Set to `true` if the line item should be prorated; set to `false` if not. This can only be used
   * on line items that have a start and end date.
   */
  @SerializedName("prorate")
  @Expose
  private Boolean prorate;

  /**
   * Line item quantity to be refunded. Must be less than or equal to the `quantity_remaining`. If
   * `quantity_decimal`, `amount`, and `percentage` are not present, `quantity` is required. If
   * `amount` or `percentage` is present, `quantity` must be absent.
   */
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /**
   * Decimal quantity to refund. The `quantity_decimal` will be used to refund charges that has a
   * NOT null quantity decimal. Must be less than or equal to the `quantity_decimal_remaining`. If
   * `quantity`, `amount`, and `percentage` are not present, `quantity_decimal` is required. If
   * `amount` or `percentage` is present, `quantity_decimal` must be absent. The Decimal Quantity
   * feature must be enabled to utilize this field.
   */
  @SerializedName("quantity_decimal")
  @Expose
  private String quantityDecimal;

  /**
   * The specific amount to be refunded from the adjustment. Must be less than or equal to the
   * adjustment's remaining balance. If `quantity`, `quantity_decimal` and `percentage` are not
   * present, `amount` is required. If `quantity`, `quantity_decimal`, or `percentage` is present,
   * `amount` must be absent.
   */
  public BigDecimal getAmount() {
    return this.amount;
  }

  /**
   * @param amount The specific amount to be refunded from the adjustment. Must be less than or
   *     equal to the adjustment's remaining balance. If `quantity`, `quantity_decimal` and
   *     `percentage` are not present, `amount` is required. If `quantity`, `quantity_decimal`, or
   *     `percentage` is present, `amount` must be absent.
   */
  public void setAmount(final BigDecimal amount) {
    this.amount = amount;
  }

  /** Line item ID */
  public String getId() {
    return this.id;
  }

  /**
   * @param id Line item ID
   */
  public void setId(final String id) {
    this.id = id;
  }

  /**
   * The percentage of the adjustment's remaining balance to refund. If `quantity`,
   * `quantity_decimal` and `amount_in_cents` are not present, `percentage` is required. If
   * `quantity`, `quantity_decimal` or `amount_in_cents` is present, `percentage` must be absent.
   */
  public Integer getPercentage() {
    return this.percentage;
  }

  /**
   * @param percentage The percentage of the adjustment's remaining balance to refund. If
   *     `quantity`, `quantity_decimal` and `amount_in_cents` are not present, `percentage` is
   *     required. If `quantity`, `quantity_decimal` or `amount_in_cents` is present, `percentage`
   *     must be absent.
   */
  public void setPercentage(final Integer percentage) {
    this.percentage = percentage;
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

  /**
   * Line item quantity to be refunded. Must be less than or equal to the `quantity_remaining`. If
   * `quantity_decimal`, `amount`, and `percentage` are not present, `quantity` is required. If
   * `amount` or `percentage` is present, `quantity` must be absent.
   */
  public Integer getQuantity() {
    return this.quantity;
  }

  /**
   * @param quantity Line item quantity to be refunded. Must be less than or equal to the
   *     `quantity_remaining`. If `quantity_decimal`, `amount`, and `percentage` are not present,
   *     `quantity` is required. If `amount` or `percentage` is present, `quantity` must be absent.
   */
  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * Decimal quantity to refund. The `quantity_decimal` will be used to refund charges that has a
   * NOT null quantity decimal. Must be less than or equal to the `quantity_decimal_remaining`. If
   * `quantity`, `amount`, and `percentage` are not present, `quantity_decimal` is required. If
   * `amount` or `percentage` is present, `quantity_decimal` must be absent. The Decimal Quantity
   * feature must be enabled to utilize this field.
   */
  public String getQuantityDecimal() {
    return this.quantityDecimal;
  }

  /**
   * @param quantityDecimal Decimal quantity to refund. The `quantity_decimal` will be used to
   *     refund charges that has a NOT null quantity decimal. Must be less than or equal to the
   *     `quantity_decimal_remaining`. If `quantity`, `amount`, and `percentage` are not present,
   *     `quantity_decimal` is required. If `amount` or `percentage` is present, `quantity_decimal`
   *     must be absent. The Decimal Quantity feature must be enabled to utilize this field.
   */
  public void setQuantityDecimal(final String quantityDecimal) {
    this.quantityDecimal = quantityDecimal;
  }
}
