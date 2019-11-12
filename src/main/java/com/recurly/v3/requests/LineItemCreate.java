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

public class LineItemCreate extends Request {

  /**
   * The reason the credit was given when line item is `type=credit`. When the Credit Invoices
   * feature is enabled, the value can be set and will default to `general`. When the Credit
   * Invoices feature is not enabled, the value will always be `null`.
   */
  @SerializedName("credit_reason_code")
  @Expose
  private String creditReasonCode;

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /** Description that appears on the invoice. */
  @SerializedName("description")
  @Expose
  private String description;

  /** If this date is provided, it indicates the end of a time range. */
  @SerializedName("end_date")
  @Expose
  private DateTime endDate;

  /**
   * This number will be multiplied by the unit amount to compute the subtotal before any discounts
   * or taxes.
   */
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /**
   * If an end date is present, this is value indicates the beginning of a billing time range. If no
   * end date is present it indicates billing for a specific date. Defaults to the current
   * date-time.
   */
  @SerializedName("start_date")
  @Expose
  private DateTime startDate;

  /**
   * Optional field used by Avalara, Vertex, and Recurly's EU VAT tax feature to determine taxation
   * rules. If you have your own AvaTax or Vertex account configured, use their tax codes to assign
   * specific tax rules. If you are using Recurly's EU VAT feature, you can use values of `unknown`,
   * `physical`, or `digital`.
   */
  @SerializedName("tax_code")
  @Expose
  private String taxCode;

  /**
   * `true` exempts tax on charges, `false` applies tax on charges. If not defined, then defaults to
   * the Plan and Site settings. This attribute does not work for credits (negative line items).
   * Credits are always applied post-tax. Pre-tax discounts should use the Coupons feature.
   */
  @SerializedName("tax_exempt")
  @Expose
  private Boolean taxExempt;

  /** Line item type. */
  @SerializedName("type")
  @Expose
  private String type;

  /**
   * A positive or negative amount with `type=charge` will result in a positive `unit_amount`. A
   * positive or negative amount with `type=credit` will result in a negative `unit_amount`.
   */
  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;

  /**
   * The reason the credit was given when line item is `type=credit`. When the Credit Invoices
   * feature is enabled, the value can be set and will default to `general`. When the Credit
   * Invoices feature is not enabled, the value will always be `null`.
   */
  public String getCreditReasonCode() {
    return this.creditReasonCode;
  }

  /**
   * @param creditReasonCode The reason the credit was given when line item is `type=credit`. When
   *     the Credit Invoices feature is enabled, the value can be set and will default to `general`.
   *     When the Credit Invoices feature is not enabled, the value will always be `null`.
   */
  public void setCreditReasonCode(final String creditReasonCode) {
    this.creditReasonCode = creditReasonCode;
  }

  /** 3-letter ISO 4217 currency code. */
  public String getCurrency() {
    return this.currency;
  }

  /** @param currency 3-letter ISO 4217 currency code. */
  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  /** Description that appears on the invoice. */
  public String getDescription() {
    return this.description;
  }

  /** @param description Description that appears on the invoice. */
  public void setDescription(final String description) {
    this.description = description;
  }

  /** If this date is provided, it indicates the end of a time range. */
  public DateTime getEndDate() {
    return this.endDate;
  }

  /** @param endDate If this date is provided, it indicates the end of a time range. */
  public void setEndDate(final DateTime endDate) {
    this.endDate = endDate;
  }

  /**
   * This number will be multiplied by the unit amount to compute the subtotal before any discounts
   * or taxes.
   */
  public Integer getQuantity() {
    return this.quantity;
  }

  /**
   * @param quantity This number will be multiplied by the unit amount to compute the subtotal
   *     before any discounts or taxes.
   */
  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * If an end date is present, this is value indicates the beginning of a billing time range. If no
   * end date is present it indicates billing for a specific date. Defaults to the current
   * date-time.
   */
  public DateTime getStartDate() {
    return this.startDate;
  }

  /**
   * @param startDate If an end date is present, this is value indicates the beginning of a billing
   *     time range. If no end date is present it indicates billing for a specific date. Defaults to
   *     the current date-time.
   */
  public void setStartDate(final DateTime startDate) {
    this.startDate = startDate;
  }

  /**
   * Optional field used by Avalara, Vertex, and Recurly's EU VAT tax feature to determine taxation
   * rules. If you have your own AvaTax or Vertex account configured, use their tax codes to assign
   * specific tax rules. If you are using Recurly's EU VAT feature, you can use values of `unknown`,
   * `physical`, or `digital`.
   */
  public String getTaxCode() {
    return this.taxCode;
  }

  /**
   * @param taxCode Optional field used by Avalara, Vertex, and Recurly's EU VAT tax feature to
   *     determine taxation rules. If you have your own AvaTax or Vertex account configured, use
   *     their tax codes to assign specific tax rules. If you are using Recurly's EU VAT feature,
   *     you can use values of `unknown`, `physical`, or `digital`.
   */
  public void setTaxCode(final String taxCode) {
    this.taxCode = taxCode;
  }

  /**
   * `true` exempts tax on charges, `false` applies tax on charges. If not defined, then defaults to
   * the Plan and Site settings. This attribute does not work for credits (negative line items).
   * Credits are always applied post-tax. Pre-tax discounts should use the Coupons feature.
   */
  public Boolean getTaxExempt() {
    return this.taxExempt;
  }

  /**
   * @param taxExempt `true` exempts tax on charges, `false` applies tax on charges. If not defined,
   *     then defaults to the Plan and Site settings. This attribute does not work for credits
   *     (negative line items). Credits are always applied post-tax. Pre-tax discounts should use
   *     the Coupons feature.
   */
  public void setTaxExempt(final Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  /** Line item type. */
  public String getType() {
    return this.type;
  }

  /** @param type Line item type. */
  public void setType(final String type) {
    this.type = type;
  }

  /**
   * A positive or negative amount with `type=charge` will result in a positive `unit_amount`. A
   * positive or negative amount with `type=credit` will result in a negative `unit_amount`.
   */
  public Float getUnitAmount() {
    return this.unitAmount;
  }

  /**
   * @param unitAmount A positive or negative amount with `type=charge` will result in a positive
   *     `unit_amount`. A positive or negative amount with `type=credit` will result in a negative
   *     `unit_amount`.
   */
  public void setUnitAmount(final Float unitAmount) {
    this.unitAmount = unitAmount;
  }
}
