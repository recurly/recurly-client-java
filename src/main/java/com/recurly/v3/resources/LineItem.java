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

public class LineItem extends Resource {

  @SerializedName("account")
  @Expose
  private AccountMini account;

  /**
   * Internal accounting code to help you reconcile your revenue to the correct ledger. Line items
   * created as part of a subscription invoice will use the plan or add-on's accounting code,
   * otherwise the value will only be present if you define an accounting code when creating the
   * line item.
   */
  @SerializedName("accounting_code")
  @Expose
  private String accountingCode;

  /** If the line item is a charge or credit for an add-on, this is its code. */
  @SerializedName("add_on_code")
  @Expose
  private String addOnCode;

  /** If the line item is a charge or credit for an add-on this is its ID. */
  @SerializedName("add_on_id")
  @Expose
  private String addOnId;

  /** `(quantity * unit_amount) - (discount + tax)` */
  @SerializedName("amount")
  @Expose
  private Float amount;

  /** When the line item was created. */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** The amount of credit from this line item that was applied to the invoice. */
  @SerializedName("credit_applied")
  @Expose
  private Float creditApplied;

  /** The reason the credit was given when line item is `type=credit`. */
  @SerializedName("credit_reason_code")
  @Expose
  private String creditReasonCode;

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /**
   * Description that appears on the invoice. For subscription related items this will be filled in
   * automatically.
   */
  @SerializedName("description")
  @Expose
  private String description;

  /** The discount applied to the line item. */
  @SerializedName("discount")
  @Expose
  private Float discount;

  /** If this date is provided, it indicates the end of a time range. */
  @SerializedName("end_date")
  @Expose
  private DateTime endDate;

  /** Line item ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** Once the line item has been invoiced this will be the invoice's ID. */
  @SerializedName("invoice_id")
  @Expose
  private String invoiceId;

  /**
   * Once the line item has been invoiced this will be the invoice's number. If VAT taxation and the
   * Country Invoice Sequencing feature are enabled, invoices will have country-specific invoice
   * numbers for invoices billed to EU countries (ex: FR1001). Non-EU invoices will continue to use
   * the site-level invoice number sequence.
   */
  @SerializedName("invoice_number")
  @Expose
  private String invoiceNumber;

  /**
   * Category to describe the role of a line item on a legacy invoice: - "charges" refers to charges
   * being billed for on this invoice. - "credits" refers to refund or proration credits. This
   * portion of the invoice can be considered a credit memo. - "applied_credits" refers to previous
   * credits applied to this invoice. See their `original_line_item_invoice_id` to determine where
   * the credit first originated. - "carryforwards" can be ignored. They exist to consume any
   * remaining credit balance. A new credit with the same amount will be created and placed back on
   * the account.
   */
  @SerializedName("legacy_category")
  @Expose
  private String legacyCategory;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** A credit created from an original charge will have the value of the charge's origin. */
  @SerializedName("origin")
  @Expose
  private String origin;

  /**
   * The invoice where the credit originated. Will only have a value if the line item is a credit
   * created from a previous credit, or if the credit was created from a charge refund.
   */
  @SerializedName("original_line_item_invoice_id")
  @Expose
  private String originalLineItemInvoiceId;

  /** If the line item is a charge or credit for a plan or add-on, this is the plan's code. */
  @SerializedName("plan_code")
  @Expose
  private String planCode;

  /** If the line item is a charge or credit for a plan or add-on, this is the plan's ID. */
  @SerializedName("plan_id")
  @Expose
  private String planId;

  /**
   * Will only have a value if the line item is a credit created from a previous credit, or if the
   * credit was created from a charge refund.
   */
  @SerializedName("previous_line_item_id")
  @Expose
  private String previousLineItemId;

  /**
   * For plan related line items this will be the plan's code, for add-on related line items it will
   * be the add-on's code.
   */
  @SerializedName("product_code")
  @Expose
  private String productCode;

  /**
   * When a line item has been prorated, this is the rate of the proration. Proration rates were
   * made available for line items created after March 30, 2017. For line items created prior to
   * that date, the proration rate will be `null`, even if the line item was prorated.
   */
  @SerializedName("proration_rate")
  @Expose
  private Float prorationRate;

  /**
   * This number will be multiplied by the unit amount to compute the subtotal before any discounts
   * or taxes.
   */
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /** Refund? */
  @SerializedName("refund")
  @Expose
  private Boolean refund;

  /**
   * For refund charges, the quantity being refunded. For non-refund charges, the total quantity
   * refunded (possibly over multiple refunds).
   */
  @SerializedName("refunded_quantity")
  @Expose
  private Integer refundedQuantity;

  @SerializedName("shipping_address")
  @Expose
  private ShippingAddress shippingAddress;

  /**
   * If an end date is present, this is value indicates the beginning of a billing time range. If no
   * end date is present it indicates billing for a specific date.
   */
  @SerializedName("start_date")
  @Expose
  private DateTime startDate;

  /**
   * Pending line items are charges or credits on an account that have not been applied to an
   * invoice yet. Invoiced line items will always have an `invoice_id` value.
   */
  @SerializedName("state")
  @Expose
  private String state;

  /** If the line item is a charge or credit for a subscription, this is its ID. */
  @SerializedName("subscription_id")
  @Expose
  private String subscriptionId;

  /** `quantity * unit_amount` */
  @SerializedName("subtotal")
  @Expose
  private Float subtotal;

  /** The tax amount for the line item. */
  @SerializedName("tax")
  @Expose
  private Float tax;

  /**
   * Used by Avalara, Vertex, and Recurly’s EU VAT tax feature. The tax code values are specific to
   * each tax system. If you are using Recurly’s EU VAT feature `P0000000` is `physical`, `D0000000`
   * is `digital`, and an empty string is `unknown`.
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

  /** `true` if the line item is taxable, `false` if it is not. */
  @SerializedName("taxable")
  @Expose
  private Boolean taxable;

  /**
   * Charges are positive line items that debit the account. Credits are negative line items that
   * credit the account.
   */
  @SerializedName("type")
  @Expose
  private String type;

  /** Positive amount for a charge, negative amount for a credit. */
  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;

  /** When the line item was last changed. */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /**
   * The UUID is useful for matching data with the CSV exports and building URLs into Recurly's UI.
   */
  @SerializedName("uuid")
  @Expose
  private String uuid;

  public AccountMini getAccount() {
    return this.account;
  }

  /** @param account */
  public void setAccount(final AccountMini account) {
    this.account = account;
  }

  /**
   * Internal accounting code to help you reconcile your revenue to the correct ledger. Line items
   * created as part of a subscription invoice will use the plan or add-on's accounting code,
   * otherwise the value will only be present if you define an accounting code when creating the
   * line item.
   */
  public String getAccountingCode() {
    return this.accountingCode;
  }

  /**
   * @param accountingCode Internal accounting code to help you reconcile your revenue to the
   *     correct ledger. Line items created as part of a subscription invoice will use the plan or
   *     add-on's accounting code, otherwise the value will only be present if you define an
   *     accounting code when creating the line item.
   */
  public void setAccountingCode(final String accountingCode) {
    this.accountingCode = accountingCode;
  }

  /** If the line item is a charge or credit for an add-on, this is its code. */
  public String getAddOnCode() {
    return this.addOnCode;
  }

  /** @param addOnCode If the line item is a charge or credit for an add-on, this is its code. */
  public void setAddOnCode(final String addOnCode) {
    this.addOnCode = addOnCode;
  }

  /** If the line item is a charge or credit for an add-on this is its ID. */
  public String getAddOnId() {
    return this.addOnId;
  }

  /** @param addOnId If the line item is a charge or credit for an add-on this is its ID. */
  public void setAddOnId(final String addOnId) {
    this.addOnId = addOnId;
  }

  /** `(quantity * unit_amount) - (discount + tax)` */
  public Float getAmount() {
    return this.amount;
  }

  /** @param amount `(quantity * unit_amount) - (discount + tax)` */
  public void setAmount(final Float amount) {
    this.amount = amount;
  }

  /** When the line item was created. */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt When the line item was created. */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** The amount of credit from this line item that was applied to the invoice. */
  public Float getCreditApplied() {
    return this.creditApplied;
  }

  /**
   * @param creditApplied The amount of credit from this line item that was applied to the invoice.
   */
  public void setCreditApplied(final Float creditApplied) {
    this.creditApplied = creditApplied;
  }

  /** The reason the credit was given when line item is `type=credit`. */
  public String getCreditReasonCode() {
    return this.creditReasonCode;
  }

  /** @param creditReasonCode The reason the credit was given when line item is `type=credit`. */
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

  /**
   * Description that appears on the invoice. For subscription related items this will be filled in
   * automatically.
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * @param description Description that appears on the invoice. For subscription related items this
   *     will be filled in automatically.
   */
  public void setDescription(final String description) {
    this.description = description;
  }

  /** The discount applied to the line item. */
  public Float getDiscount() {
    return this.discount;
  }

  /** @param discount The discount applied to the line item. */
  public void setDiscount(final Float discount) {
    this.discount = discount;
  }

  /** If this date is provided, it indicates the end of a time range. */
  public DateTime getEndDate() {
    return this.endDate;
  }

  /** @param endDate If this date is provided, it indicates the end of a time range. */
  public void setEndDate(final DateTime endDate) {
    this.endDate = endDate;
  }

  /** Line item ID */
  public String getId() {
    return this.id;
  }

  /** @param id Line item ID */
  public void setId(final String id) {
    this.id = id;
  }

  /** Once the line item has been invoiced this will be the invoice's ID. */
  public String getInvoiceId() {
    return this.invoiceId;
  }

  /** @param invoiceId Once the line item has been invoiced this will be the invoice's ID. */
  public void setInvoiceId(final String invoiceId) {
    this.invoiceId = invoiceId;
  }

  /**
   * Once the line item has been invoiced this will be the invoice's number. If VAT taxation and the
   * Country Invoice Sequencing feature are enabled, invoices will have country-specific invoice
   * numbers for invoices billed to EU countries (ex: FR1001). Non-EU invoices will continue to use
   * the site-level invoice number sequence.
   */
  public String getInvoiceNumber() {
    return this.invoiceNumber;
  }

  /**
   * @param invoiceNumber Once the line item has been invoiced this will be the invoice's number. If
   *     VAT taxation and the Country Invoice Sequencing feature are enabled, invoices will have
   *     country-specific invoice numbers for invoices billed to EU countries (ex: FR1001). Non-EU
   *     invoices will continue to use the site-level invoice number sequence.
   */
  public void setInvoiceNumber(final String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  /**
   * Category to describe the role of a line item on a legacy invoice: - "charges" refers to charges
   * being billed for on this invoice. - "credits" refers to refund or proration credits. This
   * portion of the invoice can be considered a credit memo. - "applied_credits" refers to previous
   * credits applied to this invoice. See their `original_line_item_invoice_id` to determine where
   * the credit first originated. - "carryforwards" can be ignored. They exist to consume any
   * remaining credit balance. A new credit with the same amount will be created and placed back on
   * the account.
   */
  public String getLegacyCategory() {
    return this.legacyCategory;
  }

  /**
   * @param legacyCategory Category to describe the role of a line item on a legacy invoice: -
   *     "charges" refers to charges being billed for on this invoice. - "credits" refers to refund
   *     or proration credits. This portion of the invoice can be considered a credit memo. -
   *     "applied_credits" refers to previous credits applied to this invoice. See their
   *     `original_line_item_invoice_id` to determine where the credit first originated. -
   *     "carryforwards" can be ignored. They exist to consume any remaining credit balance. A new
   *     credit with the same amount will be created and placed back on the account.
   */
  public void setLegacyCategory(final String legacyCategory) {
    this.legacyCategory = legacyCategory;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  /** A credit created from an original charge will have the value of the charge's origin. */
  public String getOrigin() {
    return this.origin;
  }

  /**
   * @param origin A credit created from an original charge will have the value of the charge's
   *     origin.
   */
  public void setOrigin(final String origin) {
    this.origin = origin;
  }

  /**
   * The invoice where the credit originated. Will only have a value if the line item is a credit
   * created from a previous credit, or if the credit was created from a charge refund.
   */
  public String getOriginalLineItemInvoiceId() {
    return this.originalLineItemInvoiceId;
  }

  /**
   * @param originalLineItemInvoiceId The invoice where the credit originated. Will only have a
   *     value if the line item is a credit created from a previous credit, or if the credit was
   *     created from a charge refund.
   */
  public void setOriginalLineItemInvoiceId(final String originalLineItemInvoiceId) {
    this.originalLineItemInvoiceId = originalLineItemInvoiceId;
  }

  /** If the line item is a charge or credit for a plan or add-on, this is the plan's code. */
  public String getPlanCode() {
    return this.planCode;
  }

  /**
   * @param planCode If the line item is a charge or credit for a plan or add-on, this is the plan's
   *     code.
   */
  public void setPlanCode(final String planCode) {
    this.planCode = planCode;
  }

  /** If the line item is a charge or credit for a plan or add-on, this is the plan's ID. */
  public String getPlanId() {
    return this.planId;
  }

  /**
   * @param planId If the line item is a charge or credit for a plan or add-on, this is the plan's
   *     ID.
   */
  public void setPlanId(final String planId) {
    this.planId = planId;
  }

  /**
   * Will only have a value if the line item is a credit created from a previous credit, or if the
   * credit was created from a charge refund.
   */
  public String getPreviousLineItemId() {
    return this.previousLineItemId;
  }

  /**
   * @param previousLineItemId Will only have a value if the line item is a credit created from a
   *     previous credit, or if the credit was created from a charge refund.
   */
  public void setPreviousLineItemId(final String previousLineItemId) {
    this.previousLineItemId = previousLineItemId;
  }

  /**
   * For plan related line items this will be the plan's code, for add-on related line items it will
   * be the add-on's code.
   */
  public String getProductCode() {
    return this.productCode;
  }

  /**
   * @param productCode For plan related line items this will be the plan's code, for add-on related
   *     line items it will be the add-on's code.
   */
  public void setProductCode(final String productCode) {
    this.productCode = productCode;
  }

  /**
   * When a line item has been prorated, this is the rate of the proration. Proration rates were
   * made available for line items created after March 30, 2017. For line items created prior to
   * that date, the proration rate will be `null`, even if the line item was prorated.
   */
  public Float getProrationRate() {
    return this.prorationRate;
  }

  /**
   * @param prorationRate When a line item has been prorated, this is the rate of the proration.
   *     Proration rates were made available for line items created after March 30, 2017. For line
   *     items created prior to that date, the proration rate will be `null`, even if the line item
   *     was prorated.
   */
  public void setProrationRate(final Float prorationRate) {
    this.prorationRate = prorationRate;
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

  /** Refund? */
  public Boolean getRefund() {
    return this.refund;
  }

  /** @param refund Refund? */
  public void setRefund(final Boolean refund) {
    this.refund = refund;
  }

  /**
   * For refund charges, the quantity being refunded. For non-refund charges, the total quantity
   * refunded (possibly over multiple refunds).
   */
  public Integer getRefundedQuantity() {
    return this.refundedQuantity;
  }

  /**
   * @param refundedQuantity For refund charges, the quantity being refunded. For non-refund
   *     charges, the total quantity refunded (possibly over multiple refunds).
   */
  public void setRefundedQuantity(final Integer refundedQuantity) {
    this.refundedQuantity = refundedQuantity;
  }

  public ShippingAddress getShippingAddress() {
    return this.shippingAddress;
  }

  /** @param shippingAddress */
  public void setShippingAddress(final ShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /**
   * If an end date is present, this is value indicates the beginning of a billing time range. If no
   * end date is present it indicates billing for a specific date.
   */
  public DateTime getStartDate() {
    return this.startDate;
  }

  /**
   * @param startDate If an end date is present, this is value indicates the beginning of a billing
   *     time range. If no end date is present it indicates billing for a specific date.
   */
  public void setStartDate(final DateTime startDate) {
    this.startDate = startDate;
  }

  /**
   * Pending line items are charges or credits on an account that have not been applied to an
   * invoice yet. Invoiced line items will always have an `invoice_id` value.
   */
  public String getState() {
    return this.state;
  }

  /**
   * @param state Pending line items are charges or credits on an account that have not been applied
   *     to an invoice yet. Invoiced line items will always have an `invoice_id` value.
   */
  public void setState(final String state) {
    this.state = state;
  }

  /** If the line item is a charge or credit for a subscription, this is its ID. */
  public String getSubscriptionId() {
    return this.subscriptionId;
  }

  /**
   * @param subscriptionId If the line item is a charge or credit for a subscription, this is its
   *     ID.
   */
  public void setSubscriptionId(final String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  /** `quantity * unit_amount` */
  public Float getSubtotal() {
    return this.subtotal;
  }

  /** @param subtotal `quantity * unit_amount` */
  public void setSubtotal(final Float subtotal) {
    this.subtotal = subtotal;
  }

  /** The tax amount for the line item. */
  public Float getTax() {
    return this.tax;
  }

  /** @param tax The tax amount for the line item. */
  public void setTax(final Float tax) {
    this.tax = tax;
  }

  /**
   * Used by Avalara, Vertex, and Recurly’s EU VAT tax feature. The tax code values are specific to
   * each tax system. If you are using Recurly’s EU VAT feature `P0000000` is `physical`, `D0000000`
   * is `digital`, and an empty string is `unknown`.
   */
  public String getTaxCode() {
    return this.taxCode;
  }

  /**
   * @param taxCode Used by Avalara, Vertex, and Recurly’s EU VAT tax feature. The tax code values
   *     are specific to each tax system. If you are using Recurly’s EU VAT feature `P0000000` is
   *     `physical`, `D0000000` is `digital`, and an empty string is `unknown`.
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

  /** `true` if the line item is taxable, `false` if it is not. */
  public Boolean getTaxable() {
    return this.taxable;
  }

  /** @param taxable `true` if the line item is taxable, `false` if it is not. */
  public void setTaxable(final Boolean taxable) {
    this.taxable = taxable;
  }

  /**
   * Charges are positive line items that debit the account. Credits are negative line items that
   * credit the account.
   */
  public String getType() {
    return this.type;
  }

  /**
   * @param type Charges are positive line items that debit the account. Credits are negative line
   *     items that credit the account.
   */
  public void setType(final String type) {
    this.type = type;
  }

  /** Positive amount for a charge, negative amount for a credit. */
  public Float getUnitAmount() {
    return this.unitAmount;
  }

  /** @param unitAmount Positive amount for a charge, negative amount for a credit. */
  public void setUnitAmount(final Float unitAmount) {
    this.unitAmount = unitAmount;
  }

  /** When the line item was last changed. */
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt When the line item was last changed. */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The UUID is useful for matching data with the CSV exports and building URLs into Recurly's UI.
   */
  public String getUuid() {
    return this.uuid;
  }

  /**
   * @param uuid The UUID is useful for matching data with the CSV exports and building URLs into
   *     Recurly's UI.
   */
  public void setUuid(final String uuid) {
    this.uuid = uuid;
  }
}
