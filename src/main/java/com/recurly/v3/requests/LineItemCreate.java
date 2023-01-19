/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Constants;
import com.recurly.v3.Request;
import com.recurly.v3.resources.*;
import java.math.BigDecimal;
import java.util.List;
import org.joda.time.DateTime;

public class LineItemCreate extends Request {

  /**
   * Accounting Code for the `LineItem`. If `item_code`/`item_id` is part of the request then
   * `accounting_code` must be absent.
   */
  @SerializedName("accounting_code")
  @Expose
  private String accountingCode;

  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service
   * type describe how the line item is taxed. Refer to [the
   * documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   * for more available t/s types. If an `Item` is associated to the `LineItem`, then the
   * `avalara_service_type` must be absent.
   */
  @SerializedName("avalara_service_type")
  @Expose
  private Integer avalaraServiceType;

  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service
   * type describe how the line item is taxed. Refer to [the
   * documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   * for more available t/s types. If an `Item` is associated to the `LineItem`, then the
   * `avalara_transaction_type` must be absent.
   */
  @SerializedName("avalara_transaction_type")
  @Expose
  private Integer avalaraTransactionType;

  /**
   * The reason the credit was given when line item is `type=credit`. When the Credit Invoices
   * feature is enabled, the value can be set and will default to `general`. When the Credit
   * Invoices feature is not enabled, the value will always be `null`.
   */
  @SerializedName("credit_reason_code")
  @Expose
  private Constants.PartialCreditReasonCode creditReasonCode;

  /**
   * 3-letter ISO 4217 currency code. If `item_code`/`item_id` is part of the request then
   * `currency` is optional, if the site has a single default currency. `currency` is required if
   * `item_code`/`item_id` is present, and there are multiple currencies defined on the site. If
   * `item_code`/`item_id` is not present `currency` is required.
   */
  @SerializedName("currency")
  @Expose
  private String currency;

  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  @SerializedName("custom_fields")
  @Expose
  private List<CustomField> customFields;

  /**
   * Description that appears on the invoice. If `item_code`/`item_id` is part of the request then
   * `description` must be absent.
   */
  @SerializedName("description")
  @Expose
  private String description;

  /** If this date is provided, it indicates the end of a time range. */
  @SerializedName("end_date")
  @Expose
  private DateTime endDate;

  /** Unique code to identify an item. Available when the Credit Invoices feature is enabled. */
  @SerializedName("item_code")
  @Expose
  private String itemCode;

  /**
   * System-generated unique identifier for an item. Available when the Credit Invoices feature is
   * enabled.
   */
  @SerializedName("item_id")
  @Expose
  private String itemId;

  /**
   * Origin `external_gift_card` is allowed if the Gift Cards feature is enabled on your site and
   * `type` is `credit`. Set this value in order to track gift card credits from external gift cards
   * (like InComm). It also skips billing information requirements. Origin `prepayment` is only
   * allowed if `type` is `charge` and `tax_exempt` is left blank or set to true. This origin
   * creates a charge and opposite credit on the account to be used for future invoices.
   */
  @SerializedName("origin")
  @Expose
  private Constants.LineItemCreateOrigin origin;

  /**
   * Optional field to track a product code or SKU for the line item. This can be used to later
   * reporting on product purchases. For Vertex tax calculations, this field will be used as the
   * Vertex `product` field. If `item_code`/`item_id` is part of the request then `product_code`
   * must be absent.
   */
  @SerializedName("product_code")
  @Expose
  private String productCode;

  /**
   * This number will be multiplied by the unit amount to compute the subtotal before any discounts
   * or taxes.
   */
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /** Revenue schedule type */
  @SerializedName("revenue_schedule_type")
  @Expose
  private Constants.LineItemRevenueScheduleType revenueScheduleType;

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

  /**
   * Determines whether or not tax is included in the unit amount. The Tax Inclusive Pricing feature
   * (separate from the Mixed Tax Pricing feature) must be enabled to use this flag.
   */
  @SerializedName("tax_inclusive")
  @Expose
  private Boolean taxInclusive;

  /**
   * Line item type. If `item_code`/`item_id` is present then `type` should not be present. If
   * `item_code`/`item_id` is not present then `type` is required.
   */
  @SerializedName("type")
  @Expose
  private Constants.LineItemType type;

  /**
   * A positive or negative amount with `type=charge` will result in a positive `unit_amount`. A
   * positive or negative amount with `type=credit` will result in a negative `unit_amount`. If
   * `item_code`/`item_id` is present, `unit_amount` can be passed in, to override the `Item`'s
   * `unit_amount`. If `item_code`/`item_id` is not present then `unit_amount` is required.
   */
  @SerializedName("unit_amount")
  @Expose
  private BigDecimal unitAmount;

  /**
   * Accounting Code for the `LineItem`. If `item_code`/`item_id` is part of the request then
   * `accounting_code` must be absent.
   */
  public String getAccountingCode() {
    return this.accountingCode;
  }

  /**
   * @param accountingCode Accounting Code for the `LineItem`. If `item_code`/`item_id` is part of
   *     the request then `accounting_code` must be absent.
   */
  public void setAccountingCode(final String accountingCode) {
    this.accountingCode = accountingCode;
  }

  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service
   * type describe how the line item is taxed. Refer to [the
   * documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   * for more available t/s types. If an `Item` is associated to the `LineItem`, then the
   * `avalara_service_type` must be absent.
   */
  public Integer getAvalaraServiceType() {
    return this.avalaraServiceType;
  }

  /**
   * @param avalaraServiceType Used by Avalara for Communications taxes. The transaction type in
   *     combination with the service type describe how the line item is taxed. Refer to [the
   *     documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   *     for more available t/s types. If an `Item` is associated to the `LineItem`, then the
   *     `avalara_service_type` must be absent.
   */
  public void setAvalaraServiceType(final Integer avalaraServiceType) {
    this.avalaraServiceType = avalaraServiceType;
  }

  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service
   * type describe how the line item is taxed. Refer to [the
   * documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   * for more available t/s types. If an `Item` is associated to the `LineItem`, then the
   * `avalara_transaction_type` must be absent.
   */
  public Integer getAvalaraTransactionType() {
    return this.avalaraTransactionType;
  }

  /**
   * @param avalaraTransactionType Used by Avalara for Communications taxes. The transaction type in
   *     combination with the service type describe how the line item is taxed. Refer to [the
   *     documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   *     for more available t/s types. If an `Item` is associated to the `LineItem`, then the
   *     `avalara_transaction_type` must be absent.
   */
  public void setAvalaraTransactionType(final Integer avalaraTransactionType) {
    this.avalaraTransactionType = avalaraTransactionType;
  }

  /**
   * The reason the credit was given when line item is `type=credit`. When the Credit Invoices
   * feature is enabled, the value can be set and will default to `general`. When the Credit
   * Invoices feature is not enabled, the value will always be `null`.
   */
  public Constants.PartialCreditReasonCode getCreditReasonCode() {
    return this.creditReasonCode;
  }

  /**
   * @param creditReasonCode The reason the credit was given when line item is `type=credit`. When
   *     the Credit Invoices feature is enabled, the value can be set and will default to `general`.
   *     When the Credit Invoices feature is not enabled, the value will always be `null`.
   */
  public void setCreditReasonCode(final Constants.PartialCreditReasonCode creditReasonCode) {
    this.creditReasonCode = creditReasonCode;
  }

  /**
   * 3-letter ISO 4217 currency code. If `item_code`/`item_id` is part of the request then
   * `currency` is optional, if the site has a single default currency. `currency` is required if
   * `item_code`/`item_id` is present, and there are multiple currencies defined on the site. If
   * `item_code`/`item_id` is not present `currency` is required.
   */
  public String getCurrency() {
    return this.currency;
  }

  /**
   * @param currency 3-letter ISO 4217 currency code. If `item_code`/`item_id` is part of the
   *     request then `currency` is optional, if the site has a single default currency. `currency`
   *     is required if `item_code`/`item_id` is present, and there are multiple currencies defined
   *     on the site. If `item_code`/`item_id` is not present `currency` is required.
   */
  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  public List<CustomField> getCustomFields() {
    return this.customFields;
  }

  /**
   * @param customFields The custom fields will only be altered when they are included in a request.
   *     Sending an empty array will not remove any existing values. To remove a field send the name
   *     with a null or empty value.
   */
  public void setCustomFields(final List<CustomField> customFields) {
    this.customFields = customFields;
  }

  /**
   * Description that appears on the invoice. If `item_code`/`item_id` is part of the request then
   * `description` must be absent.
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * @param description Description that appears on the invoice. If `item_code`/`item_id` is part of
   *     the request then `description` must be absent.
   */
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

  /** Unique code to identify an item. Available when the Credit Invoices feature is enabled. */
  public String getItemCode() {
    return this.itemCode;
  }

  /**
   * @param itemCode Unique code to identify an item. Available when the Credit Invoices feature is
   *     enabled.
   */
  public void setItemCode(final String itemCode) {
    this.itemCode = itemCode;
  }

  /**
   * System-generated unique identifier for an item. Available when the Credit Invoices feature is
   * enabled.
   */
  public String getItemId() {
    return this.itemId;
  }

  /**
   * @param itemId System-generated unique identifier for an item. Available when the Credit
   *     Invoices feature is enabled.
   */
  public void setItemId(final String itemId) {
    this.itemId = itemId;
  }

  /**
   * Origin `external_gift_card` is allowed if the Gift Cards feature is enabled on your site and
   * `type` is `credit`. Set this value in order to track gift card credits from external gift cards
   * (like InComm). It also skips billing information requirements. Origin `prepayment` is only
   * allowed if `type` is `charge` and `tax_exempt` is left blank or set to true. This origin
   * creates a charge and opposite credit on the account to be used for future invoices.
   */
  public Constants.LineItemCreateOrigin getOrigin() {
    return this.origin;
  }

  /**
   * @param origin Origin `external_gift_card` is allowed if the Gift Cards feature is enabled on
   *     your site and `type` is `credit`. Set this value in order to track gift card credits from
   *     external gift cards (like InComm). It also skips billing information requirements. Origin
   *     `prepayment` is only allowed if `type` is `charge` and `tax_exempt` is left blank or set to
   *     true. This origin creates a charge and opposite credit on the account to be used for future
   *     invoices.
   */
  public void setOrigin(final Constants.LineItemCreateOrigin origin) {
    this.origin = origin;
  }

  /**
   * Optional field to track a product code or SKU for the line item. This can be used to later
   * reporting on product purchases. For Vertex tax calculations, this field will be used as the
   * Vertex `product` field. If `item_code`/`item_id` is part of the request then `product_code`
   * must be absent.
   */
  public String getProductCode() {
    return this.productCode;
  }

  /**
   * @param productCode Optional field to track a product code or SKU for the line item. This can be
   *     used to later reporting on product purchases. For Vertex tax calculations, this field will
   *     be used as the Vertex `product` field. If `item_code`/`item_id` is part of the request then
   *     `product_code` must be absent.
   */
  public void setProductCode(final String productCode) {
    this.productCode = productCode;
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

  /** Revenue schedule type */
  public Constants.LineItemRevenueScheduleType getRevenueScheduleType() {
    return this.revenueScheduleType;
  }

  /** @param revenueScheduleType Revenue schedule type */
  public void setRevenueScheduleType(
      final Constants.LineItemRevenueScheduleType revenueScheduleType) {
    this.revenueScheduleType = revenueScheduleType;
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

  /**
   * Determines whether or not tax is included in the unit amount. The Tax Inclusive Pricing feature
   * (separate from the Mixed Tax Pricing feature) must be enabled to use this flag.
   */
  public Boolean getTaxInclusive() {
    return this.taxInclusive;
  }

  /**
   * @param taxInclusive Determines whether or not tax is included in the unit amount. The Tax
   *     Inclusive Pricing feature (separate from the Mixed Tax Pricing feature) must be enabled to
   *     use this flag.
   */
  public void setTaxInclusive(final Boolean taxInclusive) {
    this.taxInclusive = taxInclusive;
  }

  /**
   * Line item type. If `item_code`/`item_id` is present then `type` should not be present. If
   * `item_code`/`item_id` is not present then `type` is required.
   */
  public Constants.LineItemType getType() {
    return this.type;
  }

  /**
   * @param type Line item type. If `item_code`/`item_id` is present then `type` should not be
   *     present. If `item_code`/`item_id` is not present then `type` is required.
   */
  public void setType(final Constants.LineItemType type) {
    this.type = type;
  }

  /**
   * A positive or negative amount with `type=charge` will result in a positive `unit_amount`. A
   * positive or negative amount with `type=credit` will result in a negative `unit_amount`. If
   * `item_code`/`item_id` is present, `unit_amount` can be passed in, to override the `Item`'s
   * `unit_amount`. If `item_code`/`item_id` is not present then `unit_amount` is required.
   */
  public BigDecimal getUnitAmount() {
    return this.unitAmount;
  }

  /**
   * @param unitAmount A positive or negative amount with `type=charge` will result in a positive
   *     `unit_amount`. A positive or negative amount with `type=credit` will result in a negative
   *     `unit_amount`. If `item_code`/`item_id` is present, `unit_amount` can be passed in, to
   *     override the `Item`'s `unit_amount`. If `item_code`/`item_id` is not present then
   *     `unit_amount` is required.
   */
  public void setUnitAmount(final BigDecimal unitAmount) {
    this.unitAmount = unitAmount;
  }
}
