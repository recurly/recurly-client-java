/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.util.List;
import org.joda.time.DateTime;

public class Invoice extends Resource {

  @SerializedName("account")
  @Expose
  private AccountMini account;

  @SerializedName("address")
  @Expose
  private Address address;

  /** Date invoice was marked paid or failed. */
  @SerializedName("closed_at")
  @Expose
  private DateTime closedAt;

  /**
   * An automatic invoice means a corresponding transaction is run using the account's billing
   * information at the same time the invoice is created. Manual invoices are created without a
   * corresponding transaction. The merchant must enter a manual payment transaction or have the
   * customer pay the invoice with an automatic method, like credit card, PayPal, Amazon, or ACH
   * bank payment.
   */
  @SerializedName("collection_method")
  @Expose
  private String collectionMethod;

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /**
   * This will default to the Customer Notes text specified on the Invoice Settings. Specify custom
   * notes to add or override Customer Notes.
   */
  @SerializedName("customer_notes")
  @Expose
  private String customerNotes;

  /** Total discounts applied to this invoice. */
  @SerializedName("discount")
  @Expose
  private Float discount;

  /** The outstanding balance remaining on this invoice. */
  @SerializedName("due")
  @Expose
  private Float due;

  /** Date invoice is due. This is the date the net terms are reached. */
  @SerializedName("due_at")
  @Expose
  private DateTime dueAt;

  /** Invoice ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** Line items are grouped by the role they play. */
  @SerializedName("line_items")
  @Expose
  private InvoiceLineItems lineItems;

  /**
   * Integer representing the number of days after an invoice's creation that the invoice will
   * become past due. If an invoice's net terms are set to '0', it is due 'On Receipt' and will
   * become past due 24 hours after it’s created. If an invoice is due net 30, it will become past
   * due at 31 days exactly.
   */
  @SerializedName("net_terms")
  @Expose
  private Integer netTerms;

  /**
   * If VAT taxation and the Country Invoice Sequencing feature are enabled, invoices will have
   * country-specific invoice numbers for invoices billed to EU countries (ex: FR1001). Non-EU
   * invoices will continue to use the site-level invoice number sequence.
   */
  @SerializedName("number")
  @Expose
  private String number;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** The total amount of successful payments transaction on this invoice. */
  @SerializedName("paid")
  @Expose
  private Float paid;

  /** For manual invoicing, this identifies the PO number associated with the subscription. */
  @SerializedName("po_number")
  @Expose
  private String poNumber;

  /**
   * On refund invoices, this value will exist and show the invoice ID of the purchase invoice the
   * refund was created from.
   */
  @SerializedName("previous_invoice_id")
  @Expose
  private String previousInvoiceId;

  /** Invoice state */
  @SerializedName("state")
  @Expose
  private String state;

  /** If the invoice is charging or refunding for a subscription, this is its ID. */
  @SerializedName("subscription_id")
  @Expose
  private String subscriptionId;

  /** The summation of charges, discounts, and credits, before tax. */
  @SerializedName("subtotal")
  @Expose
  private Float subtotal;

  /** The total tax on this invoice. */
  @SerializedName("tax")
  @Expose
  private Float tax;

  @SerializedName("tax_info")
  @Expose
  private TaxInfo taxInfo;

  /**
   * This will default to the Terms and Conditions text specified on the Invoice Settings page in
   * your Recurly admin. Specify custom notes to add or override Terms and Conditions.
   */
  @SerializedName("terms_and_conditions")
  @Expose
  private String termsAndConditions;

  /**
   * The final total on this invoice. The summation of invoice charges, discounts, credits, and tax.
   */
  @SerializedName("total")
  @Expose
  private Float total;

  /** Transactions */
  @SerializedName("transactions")
  @Expose
  private List<Transaction> transactions;

  /**
   * The original invoice will have a type of `purchase`. Any refunds or voids will create a
   * negative invoice to cancel out the original. `line_item_refund` indicates that specific line
   * items were refunded, while `open_amount_refund` only indicates money was refunded.
   */
  @SerializedName("type")
  @Expose
  private String type;

  /** Last updated at */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /**
   * VAT registration number for the customer on this invoice. This will come from the VAT Number
   * field in the Billing Info or the Account Info depending on your tax settings and the invoice
   * collection method.
   */
  @SerializedName("vat_number")
  @Expose
  private String vatNumber;

  /**
   * VAT Reverse Charge Notes only appear if you have EU VAT enabled or are using your own Avalara
   * AvaTax account and the customer is in the EU, has a VAT number, and is in a different country
   * than your own. This will default to the VAT Reverse Charge Notes text specified on the Tax
   * Settings page in your Recurly admin, unless custom notes were created with the original
   * subscription.
   */
  @SerializedName("vat_reverse_charge_notes")
  @Expose
  private String vatReverseChargeNotes;

  public AccountMini getAccount() {
    return this.account;
  }

  /** @param account */
  public void setAccount(final AccountMini account) {
    this.account = account;
  }

  public Address getAddress() {
    return this.address;
  }

  /** @param address */
  public void setAddress(final Address address) {
    this.address = address;
  }

  /** Date invoice was marked paid or failed. */
  public DateTime getClosedAt() {
    return this.closedAt;
  }

  /** @param closedAt Date invoice was marked paid or failed. */
  public void setClosedAt(final DateTime closedAt) {
    this.closedAt = closedAt;
  }

  /**
   * An automatic invoice means a corresponding transaction is run using the account's billing
   * information at the same time the invoice is created. Manual invoices are created without a
   * corresponding transaction. The merchant must enter a manual payment transaction or have the
   * customer pay the invoice with an automatic method, like credit card, PayPal, Amazon, or ACH
   * bank payment.
   */
  public String getCollectionMethod() {
    return this.collectionMethod;
  }

  /**
   * @param collectionMethod An automatic invoice means a corresponding transaction is run using the
   *     account's billing information at the same time the invoice is created. Manual invoices are
   *     created without a corresponding transaction. The merchant must enter a manual payment
   *     transaction or have the customer pay the invoice with an automatic method, like credit
   *     card, PayPal, Amazon, or ACH bank payment.
   */
  public void setCollectionMethod(final String collectionMethod) {
    this.collectionMethod = collectionMethod;
  }

  /** Created at */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt Created at */
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

  /**
   * This will default to the Customer Notes text specified on the Invoice Settings. Specify custom
   * notes to add or override Customer Notes.
   */
  public String getCustomerNotes() {
    return this.customerNotes;
  }

  /**
   * @param customerNotes This will default to the Customer Notes text specified on the Invoice
   *     Settings. Specify custom notes to add or override Customer Notes.
   */
  public void setCustomerNotes(final String customerNotes) {
    this.customerNotes = customerNotes;
  }

  /** Total discounts applied to this invoice. */
  public Float getDiscount() {
    return this.discount;
  }

  /** @param discount Total discounts applied to this invoice. */
  public void setDiscount(final Float discount) {
    this.discount = discount;
  }

  /** The outstanding balance remaining on this invoice. */
  public Float getDue() {
    return this.due;
  }

  /** @param due The outstanding balance remaining on this invoice. */
  public void setDue(final Float due) {
    this.due = due;
  }

  /** Date invoice is due. This is the date the net terms are reached. */
  public DateTime getDueAt() {
    return this.dueAt;
  }

  /** @param dueAt Date invoice is due. This is the date the net terms are reached. */
  public void setDueAt(final DateTime dueAt) {
    this.dueAt = dueAt;
  }

  /** Invoice ID */
  public String getId() {
    return this.id;
  }

  /** @param id Invoice ID */
  public void setId(final String id) {
    this.id = id;
  }

  /** Line items are grouped by the role they play. */
  public InvoiceLineItems getLineItems() {
    return this.lineItems;
  }

  /** @param lineItems Line items are grouped by the role they play. */
  public void setLineItems(final InvoiceLineItems lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * Integer representing the number of days after an invoice's creation that the invoice will
   * become past due. If an invoice's net terms are set to '0', it is due 'On Receipt' and will
   * become past due 24 hours after it’s created. If an invoice is due net 30, it will become past
   * due at 31 days exactly.
   */
  public Integer getNetTerms() {
    return this.netTerms;
  }

  /**
   * @param netTerms Integer representing the number of days after an invoice's creation that the
   *     invoice will become past due. If an invoice's net terms are set to '0', it is due 'On
   *     Receipt' and will become past due 24 hours after it’s created. If an invoice is due net 30,
   *     it will become past due at 31 days exactly.
   */
  public void setNetTerms(final Integer netTerms) {
    this.netTerms = netTerms;
  }

  /**
   * If VAT taxation and the Country Invoice Sequencing feature are enabled, invoices will have
   * country-specific invoice numbers for invoices billed to EU countries (ex: FR1001). Non-EU
   * invoices will continue to use the site-level invoice number sequence.
   */
  public String getNumber() {
    return this.number;
  }

  /**
   * @param number If VAT taxation and the Country Invoice Sequencing feature are enabled, invoices
   *     will have country-specific invoice numbers for invoices billed to EU countries (ex:
   *     FR1001). Non-EU invoices will continue to use the site-level invoice number sequence.
   */
  public void setNumber(final String number) {
    this.number = number;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  /** The total amount of successful payments transaction on this invoice. */
  public Float getPaid() {
    return this.paid;
  }

  /** @param paid The total amount of successful payments transaction on this invoice. */
  public void setPaid(final Float paid) {
    this.paid = paid;
  }

  /** For manual invoicing, this identifies the PO number associated with the subscription. */
  public String getPoNumber() {
    return this.poNumber;
  }

  /**
   * @param poNumber For manual invoicing, this identifies the PO number associated with the
   *     subscription.
   */
  public void setPoNumber(final String poNumber) {
    this.poNumber = poNumber;
  }

  /**
   * On refund invoices, this value will exist and show the invoice ID of the purchase invoice the
   * refund was created from.
   */
  public String getPreviousInvoiceId() {
    return this.previousInvoiceId;
  }

  /**
   * @param previousInvoiceId On refund invoices, this value will exist and show the invoice ID of
   *     the purchase invoice the refund was created from.
   */
  public void setPreviousInvoiceId(final String previousInvoiceId) {
    this.previousInvoiceId = previousInvoiceId;
  }

  /** Invoice state */
  public String getState() {
    return this.state;
  }

  /** @param state Invoice state */
  public void setState(final String state) {
    this.state = state;
  }

  /** If the invoice is charging or refunding for a subscription, this is its ID. */
  public String getSubscriptionId() {
    return this.subscriptionId;
  }

  /**
   * @param subscriptionId If the invoice is charging or refunding for a subscription, this is its
   *     ID.
   */
  public void setSubscriptionId(final String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  /** The summation of charges, discounts, and credits, before tax. */
  public Float getSubtotal() {
    return this.subtotal;
  }

  /** @param subtotal The summation of charges, discounts, and credits, before tax. */
  public void setSubtotal(final Float subtotal) {
    this.subtotal = subtotal;
  }

  /** The total tax on this invoice. */
  public Float getTax() {
    return this.tax;
  }

  /** @param tax The total tax on this invoice. */
  public void setTax(final Float tax) {
    this.tax = tax;
  }

  public TaxInfo getTaxInfo() {
    return this.taxInfo;
  }

  /** @param taxInfo */
  public void setTaxInfo(final TaxInfo taxInfo) {
    this.taxInfo = taxInfo;
  }

  /**
   * This will default to the Terms and Conditions text specified on the Invoice Settings page in
   * your Recurly admin. Specify custom notes to add or override Terms and Conditions.
   */
  public String getTermsAndConditions() {
    return this.termsAndConditions;
  }

  /**
   * @param termsAndConditions This will default to the Terms and Conditions text specified on the
   *     Invoice Settings page in your Recurly admin. Specify custom notes to add or override Terms
   *     and Conditions.
   */
  public void setTermsAndConditions(final String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  /**
   * The final total on this invoice. The summation of invoice charges, discounts, credits, and tax.
   */
  public Float getTotal() {
    return this.total;
  }

  /**
   * @param total The final total on this invoice. The summation of invoice charges, discounts,
   *     credits, and tax.
   */
  public void setTotal(final Float total) {
    this.total = total;
  }

  /** Transactions */
  public List<Transaction> getTransactions() {
    return this.transactions;
  }

  /** @param transactions Transactions */
  public void setTransactions(final List<Transaction> transactions) {
    this.transactions = transactions;
  }

  /**
   * The original invoice will have a type of `purchase`. Any refunds or voids will create a
   * negative invoice to cancel out the original. `line_item_refund` indicates that specific line
   * items were refunded, while `open_amount_refund` only indicates money was refunded.
   */
  public String getType() {
    return this.type;
  }

  /**
   * @param type The original invoice will have a type of `purchase`. Any refunds or voids will
   *     create a negative invoice to cancel out the original. `line_item_refund` indicates that
   *     specific line items were refunded, while `open_amount_refund` only indicates money was
   *     refunded.
   */
  public void setType(final String type) {
    this.type = type;
  }

  /** Last updated at */
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt Last updated at */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * VAT registration number for the customer on this invoice. This will come from the VAT Number
   * field in the Billing Info or the Account Info depending on your tax settings and the invoice
   * collection method.
   */
  public String getVatNumber() {
    return this.vatNumber;
  }

  /**
   * @param vatNumber VAT registration number for the customer on this invoice. This will come from
   *     the VAT Number field in the Billing Info or the Account Info depending on your tax settings
   *     and the invoice collection method.
   */
  public void setVatNumber(final String vatNumber) {
    this.vatNumber = vatNumber;
  }

  /**
   * VAT Reverse Charge Notes only appear if you have EU VAT enabled or are using your own Avalara
   * AvaTax account and the customer is in the EU, has a VAT number, and is in a different country
   * than your own. This will default to the VAT Reverse Charge Notes text specified on the Tax
   * Settings page in your Recurly admin, unless custom notes were created with the original
   * subscription.
   */
  public String getVatReverseChargeNotes() {
    return this.vatReverseChargeNotes;
  }

  /**
   * @param vatReverseChargeNotes VAT Reverse Charge Notes only appear if you have EU VAT enabled or
   *     are using your own Avalara AvaTax account and the customer is in the EU, has a VAT number,
   *     and is in a different country than your own. This will default to the VAT Reverse Charge
   *     Notes text specified on the Tax Settings page in your Recurly admin, unless custom notes
   *     were created with the original subscription.
   */
  public void setVatReverseChargeNotes(final String vatReverseChargeNotes) {
    this.vatReverseChargeNotes = vatReverseChargeNotes;
  }
}
