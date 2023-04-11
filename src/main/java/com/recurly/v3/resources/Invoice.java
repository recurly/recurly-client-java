/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import com.recurly.v3.Constants;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

public class Invoice extends Resource {

  
  /**
   * Account mini details
   */
  
  @SerializedName("account")
  @Expose
  private AccountMini account;

  
  @SerializedName("address")
  @Expose
  private InvoiceAddress address;

  
  /**
   * The outstanding balance remaining on this invoice.
   */
  
  @SerializedName("balance")
  @Expose
  private BigDecimal balance;

  
  /**
   * The `billing_info_id` is the value that represents a specific billing info for an end customer. When `billing_info_id` is used to assign billing info to the subscription, all future billing events for the subscription will bill to the specified billing info. `billing_info_id` can ONLY be used for sites utilizing the Wallet feature.
   */
  
  @SerializedName("billing_info_id")
  @Expose
  private String billingInfoId;

  
  /**
   * Date invoice was marked paid or failed.
   */
  
  @SerializedName("closed_at")
  @Expose
  private DateTime closedAt;

  
  /**
   * An automatic invoice means a corresponding transaction is run using the account's billing information at the same time the invoice is created. Manual invoices are created without a corresponding transaction. The merchant must enter a manual payment transaction or have the customer pay the invoice with an automatic method, like credit card, PayPal, Amazon, or ACH bank payment.
   */
  
  @SerializedName("collection_method")
  @Expose
  private Constants.CollectionMethod collectionMethod;

  
  /**
   * Created at
   */
  
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  
  /**
   * Credit payments
   */
  
  @SerializedName("credit_payments")
  @Expose
  private List<CreditPayment> creditPayments;

  
  /**
   * 3-letter ISO 4217 currency code.
   */
  
  @SerializedName("currency")
  @Expose
  private String currency;

  
  /**
   * This will default to the Customer Notes text specified on the Invoice Settings. Specify custom notes to add or override Customer Notes.
   */
  
  @SerializedName("customer_notes")
  @Expose
  private String customerNotes;

  
  /**
   * Total discounts applied to this invoice.
   */
  
  @SerializedName("discount")
  @Expose
  private BigDecimal discount;

  
  /**
   * Date invoice is due. This is the date the net terms are reached.
   */
  
  @SerializedName("due_at")
  @Expose
  private DateTime dueAt;

  
  /**
   * Unique ID to identify the dunning campaign used when dunning the invoice. For sites without multiple dunning campaigns enabled, this will always be the default dunning campaign.
   */
  
  @SerializedName("dunning_campaign_id")
  @Expose
  private String dunningCampaignId;

  
  /**
   * Number of times the event was sent.
   */
  
  @SerializedName("dunning_events_sent")
  @Expose
  private Integer dunningEventsSent;

  
  /**
   * Last communication attempt.
   */
  
  @SerializedName("final_dunning_event")
  @Expose
  private Boolean finalDunningEvent;

  
  /**
   * Identifies if the invoice has more line items than are returned in `line_items`. If `has_more_line_items` is `true`, then a request needs to be made to the `list_invoice_line_items` endpoint.
   */
  
  @SerializedName("has_more_line_items")
  @Expose
  private Boolean hasMoreLineItems;

  
  /**
   * Invoice ID
   */
  
  @SerializedName("id")
  @Expose
  private String id;

  
  /**
   * Line Items
   */
  
  @SerializedName("line_items")
  @Expose
  private List<LineItem> lineItems;

  
  /**
   * Integer representing the number of days after an invoice's creation that the invoice will become past due. If an invoice's net terms are set to '0', it is due 'On Receipt' and will become past due 24 hours after it’s created. If an invoice is due net 30, it will become past due at 31 days exactly.
   */
  
  @SerializedName("net_terms")
  @Expose
  private Integer netTerms;

  
  /**
   * If VAT taxation and the Country Invoice Sequencing feature are enabled, invoices will have country-specific invoice numbers for invoices billed to EU countries (ex: FR1001). Non-EU invoices will continue to use the site-level invoice number sequence.
   */
  
  @SerializedName("number")
  @Expose
  private String number;

  
  /**
   * Object type
   */
  
  @SerializedName("object")
  @Expose
  private String object;

  
  /**
   * The event that created the invoice.
   */
  
  @SerializedName("origin")
  @Expose
  private Constants.Origin origin;

  
  /**
   * The total amount of successful payments transaction on this invoice.
   */
  
  @SerializedName("paid")
  @Expose
  private BigDecimal paid;

  
  /**
   * For manual invoicing, this identifies the PO number associated with the subscription.
   */
  
  @SerializedName("po_number")
  @Expose
  private String poNumber;

  
  /**
   * On refund invoices, this value will exist and show the invoice ID of the purchase invoice the refund was created from. This field is only populated for sites without the [Only Bill What Changed](https://docs.recurly.com/docs/only-bill-what-changed) feature enabled. Sites with Only Bill What Changed enabled should use the [related_invoices endpoint](https://recurly.com/developers/api/v2021-02-25/index.html#operation/list_related_invoices) to see purchase invoices refunded by this invoice.
   */
  
  @SerializedName("previous_invoice_id")
  @Expose
  private String previousInvoiceId;

  
  /**
   * The refundable amount on a charge invoice. It will be null for all other invoices.
   */
  
  @SerializedName("refundable_amount")
  @Expose
  private BigDecimal refundableAmount;

  
  @SerializedName("shipping_address")
  @Expose
  private ShippingAddress shippingAddress;

  
  /**
   * Invoice state
   */
  
  @SerializedName("state")
  @Expose
  private Constants.InvoiceState state;

  
  /**
   * If the invoice is charging or refunding for one or more subscriptions, these are their IDs.
   */
  
  @SerializedName("subscription_ids")
  @Expose
  private List<String> subscriptionIds;

  
  /**
   * The summation of charges and credits, before discounts and taxes.
   */
  
  @SerializedName("subtotal")
  @Expose
  private BigDecimal subtotal;

  
  /**
   * The total tax on this invoice.
   */
  
  @SerializedName("tax")
  @Expose
  private BigDecimal tax;

  
  /**
   * Tax info
   */
  
  @SerializedName("tax_info")
  @Expose
  private TaxInfo taxInfo;

  
  /**
   * This will default to the Terms and Conditions text specified on the Invoice Settings page in your Recurly admin. Specify custom notes to add or override Terms and Conditions.
   */
  
  @SerializedName("terms_and_conditions")
  @Expose
  private String termsAndConditions;

  
  /**
   * The final total on this invoice. The summation of invoice charges, discounts, credits, and tax.
   */
  
  @SerializedName("total")
  @Expose
  private BigDecimal total;

  
  /**
   * Transactions
   */
  
  @SerializedName("transactions")
  @Expose
  private List<Transaction> transactions;

  
  /**
   * Invoices are either charge, credit, or legacy invoices.
   */
  
  @SerializedName("type")
  @Expose
  private Constants.InvoiceType type;

  
  /**
   * Last updated at
   */
  
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  
  /**
   * Invoice UUID
   */
  
  @SerializedName("uuid")
  @Expose
  private String uuid;

  
  /**
   * VAT registration number for the customer on this invoice. This will come from the VAT Number field in the Billing Info or the Account Info depending on your tax settings and the invoice collection method.
   */
  
  @SerializedName("vat_number")
  @Expose
  private String vatNumber;

  
  /**
   * VAT Reverse Charge Notes only appear if you have EU VAT enabled or are using your own Avalara AvaTax account and the customer is in the EU, has a VAT number, and is in a different country than your own. This will default to the VAT Reverse Charge Notes text specified on the Tax Settings page in your Recurly admin, unless custom notes were created with the original subscription.
   */
  
  @SerializedName("vat_reverse_charge_notes")
  @Expose
  private String vatReverseChargeNotes;



  
  /**
   * Account mini details
   */
  
  public AccountMini getAccount() { return this.account; }

  
  /**
   * @param account Account mini details
   */
  
  public void setAccount(final AccountMini account) { this.account = account; }

  
  public InvoiceAddress getAddress() { return this.address; }

  
  /**
   * @param address 
   */
  
  public void setAddress(final InvoiceAddress address) { this.address = address; }

  
  /**
   * The outstanding balance remaining on this invoice.
   */
  
  public BigDecimal getBalance() { return this.balance; }

  
  /**
   * @param balance The outstanding balance remaining on this invoice.
   */
  
  public void setBalance(final BigDecimal balance) { this.balance = balance; }

  
  /**
   * The `billing_info_id` is the value that represents a specific billing info for an end customer. When `billing_info_id` is used to assign billing info to the subscription, all future billing events for the subscription will bill to the specified billing info. `billing_info_id` can ONLY be used for sites utilizing the Wallet feature.
   */
  
  public String getBillingInfoId() { return this.billingInfoId; }

  
  /**
   * @param billingInfoId The `billing_info_id` is the value that represents a specific billing info for an end customer. When `billing_info_id` is used to assign billing info to the subscription, all future billing events for the subscription will bill to the specified billing info. `billing_info_id` can ONLY be used for sites utilizing the Wallet feature.
   */
  
  public void setBillingInfoId(final String billingInfoId) { this.billingInfoId = billingInfoId; }

  
  /**
   * Date invoice was marked paid or failed.
   */
  
  public DateTime getClosedAt() { return this.closedAt; }

  
  /**
   * @param closedAt Date invoice was marked paid or failed.
   */
  
  public void setClosedAt(final DateTime closedAt) { this.closedAt = closedAt; }

  
  /**
   * An automatic invoice means a corresponding transaction is run using the account's billing information at the same time the invoice is created. Manual invoices are created without a corresponding transaction. The merchant must enter a manual payment transaction or have the customer pay the invoice with an automatic method, like credit card, PayPal, Amazon, or ACH bank payment.
   */
  
  public Constants.CollectionMethod getCollectionMethod() { return this.collectionMethod; }

  
  /**
   * @param collectionMethod An automatic invoice means a corresponding transaction is run using the account's billing information at the same time the invoice is created. Manual invoices are created without a corresponding transaction. The merchant must enter a manual payment transaction or have the customer pay the invoice with an automatic method, like credit card, PayPal, Amazon, or ACH bank payment.
   */
  
  public void setCollectionMethod(final Constants.CollectionMethod collectionMethod) { this.collectionMethod = collectionMethod; }

  
  /**
   * Created at
   */
  
  public DateTime getCreatedAt() { return this.createdAt; }

  
  /**
   * @param createdAt Created at
   */
  
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  
  /**
   * Credit payments
   */
  
  public List<CreditPayment> getCreditPayments() { return this.creditPayments; }

  
  /**
   * @param creditPayments Credit payments
   */
  
  public void setCreditPayments(final List<CreditPayment> creditPayments) { this.creditPayments = creditPayments; }

  
  /**
   * 3-letter ISO 4217 currency code.
   */
  
  public String getCurrency() { return this.currency; }

  
  /**
   * @param currency 3-letter ISO 4217 currency code.
   */
  
  public void setCurrency(final String currency) { this.currency = currency; }

  
  /**
   * This will default to the Customer Notes text specified on the Invoice Settings. Specify custom notes to add or override Customer Notes.
   */
  
  public String getCustomerNotes() { return this.customerNotes; }

  
  /**
   * @param customerNotes This will default to the Customer Notes text specified on the Invoice Settings. Specify custom notes to add or override Customer Notes.
   */
  
  public void setCustomerNotes(final String customerNotes) { this.customerNotes = customerNotes; }

  
  /**
   * Total discounts applied to this invoice.
   */
  
  public BigDecimal getDiscount() { return this.discount; }

  
  /**
   * @param discount Total discounts applied to this invoice.
   */
  
  public void setDiscount(final BigDecimal discount) { this.discount = discount; }

  
  /**
   * Date invoice is due. This is the date the net terms are reached.
   */
  
  public DateTime getDueAt() { return this.dueAt; }

  
  /**
   * @param dueAt Date invoice is due. This is the date the net terms are reached.
   */
  
  public void setDueAt(final DateTime dueAt) { this.dueAt = dueAt; }

  
  /**
   * Unique ID to identify the dunning campaign used when dunning the invoice. For sites without multiple dunning campaigns enabled, this will always be the default dunning campaign.
   */
  
  public String getDunningCampaignId() { return this.dunningCampaignId; }

  
  /**
   * @param dunningCampaignId Unique ID to identify the dunning campaign used when dunning the invoice. For sites without multiple dunning campaigns enabled, this will always be the default dunning campaign.
   */
  
  public void setDunningCampaignId(final String dunningCampaignId) { this.dunningCampaignId = dunningCampaignId; }

  
  /**
   * Number of times the event was sent.
   */
  
  public Integer getDunningEventsSent() { return this.dunningEventsSent; }

  
  /**
   * @param dunningEventsSent Number of times the event was sent.
   */
  
  public void setDunningEventsSent(final Integer dunningEventsSent) { this.dunningEventsSent = dunningEventsSent; }

  
  /**
   * Last communication attempt.
   */
  
  public Boolean getFinalDunningEvent() { return this.finalDunningEvent; }

  
  /**
   * @param finalDunningEvent Last communication attempt.
   */
  
  public void setFinalDunningEvent(final Boolean finalDunningEvent) { this.finalDunningEvent = finalDunningEvent; }

  
  /**
   * Identifies if the invoice has more line items than are returned in `line_items`. If `has_more_line_items` is `true`, then a request needs to be made to the `list_invoice_line_items` endpoint.
   */
  
  public Boolean getHasMoreLineItems() { return this.hasMoreLineItems; }

  
  /**
   * @param hasMoreLineItems Identifies if the invoice has more line items than are returned in `line_items`. If `has_more_line_items` is `true`, then a request needs to be made to the `list_invoice_line_items` endpoint.
   */
  
  public void setHasMoreLineItems(final Boolean hasMoreLineItems) { this.hasMoreLineItems = hasMoreLineItems; }

  
  /**
   * Invoice ID
   */
  
  public String getId() { return this.id; }

  
  /**
   * @param id Invoice ID
   */
  
  public void setId(final String id) { this.id = id; }

  
  /**
   * Line Items
   */
  
  public List<LineItem> getLineItems() { return this.lineItems; }

  
  /**
   * @param lineItems Line Items
   */
  
  public void setLineItems(final List<LineItem> lineItems) { this.lineItems = lineItems; }

  
  /**
   * Integer representing the number of days after an invoice's creation that the invoice will become past due. If an invoice's net terms are set to '0', it is due 'On Receipt' and will become past due 24 hours after it’s created. If an invoice is due net 30, it will become past due at 31 days exactly.
   */
  
  public Integer getNetTerms() { return this.netTerms; }

  
  /**
   * @param netTerms Integer representing the number of days after an invoice's creation that the invoice will become past due. If an invoice's net terms are set to '0', it is due 'On Receipt' and will become past due 24 hours after it’s created. If an invoice is due net 30, it will become past due at 31 days exactly.
   */
  
  public void setNetTerms(final Integer netTerms) { this.netTerms = netTerms; }

  
  /**
   * If VAT taxation and the Country Invoice Sequencing feature are enabled, invoices will have country-specific invoice numbers for invoices billed to EU countries (ex: FR1001). Non-EU invoices will continue to use the site-level invoice number sequence.
   */
  
  public String getNumber() { return this.number; }

  
  /**
   * @param number If VAT taxation and the Country Invoice Sequencing feature are enabled, invoices will have country-specific invoice numbers for invoices billed to EU countries (ex: FR1001). Non-EU invoices will continue to use the site-level invoice number sequence.
   */
  
  public void setNumber(final String number) { this.number = number; }

  
  /**
   * Object type
   */
  
  public String getObject() { return this.object; }

  
  /**
   * @param object Object type
   */
  
  public void setObject(final String object) { this.object = object; }

  
  /**
   * The event that created the invoice.
   */
  
  public Constants.Origin getOrigin() { return this.origin; }

  
  /**
   * @param origin The event that created the invoice.
   */
  
  public void setOrigin(final Constants.Origin origin) { this.origin = origin; }

  
  /**
   * The total amount of successful payments transaction on this invoice.
   */
  
  public BigDecimal getPaid() { return this.paid; }

  
  /**
   * @param paid The total amount of successful payments transaction on this invoice.
   */
  
  public void setPaid(final BigDecimal paid) { this.paid = paid; }

  
  /**
   * For manual invoicing, this identifies the PO number associated with the subscription.
   */
  
  public String getPoNumber() { return this.poNumber; }

  
  /**
   * @param poNumber For manual invoicing, this identifies the PO number associated with the subscription.
   */
  
  public void setPoNumber(final String poNumber) { this.poNumber = poNumber; }

  
  /**
   * On refund invoices, this value will exist and show the invoice ID of the purchase invoice the refund was created from. This field is only populated for sites without the [Only Bill What Changed](https://docs.recurly.com/docs/only-bill-what-changed) feature enabled. Sites with Only Bill What Changed enabled should use the [related_invoices endpoint](https://recurly.com/developers/api/v2021-02-25/index.html#operation/list_related_invoices) to see purchase invoices refunded by this invoice.
   */
  
  public String getPreviousInvoiceId() { return this.previousInvoiceId; }

  
  /**
   * @param previousInvoiceId On refund invoices, this value will exist and show the invoice ID of the purchase invoice the refund was created from. This field is only populated for sites without the [Only Bill What Changed](https://docs.recurly.com/docs/only-bill-what-changed) feature enabled. Sites with Only Bill What Changed enabled should use the [related_invoices endpoint](https://recurly.com/developers/api/v2021-02-25/index.html#operation/list_related_invoices) to see purchase invoices refunded by this invoice.
   */
  
  public void setPreviousInvoiceId(final String previousInvoiceId) { this.previousInvoiceId = previousInvoiceId; }

  
  /**
   * The refundable amount on a charge invoice. It will be null for all other invoices.
   */
  
  public BigDecimal getRefundableAmount() { return this.refundableAmount; }

  
  /**
   * @param refundableAmount The refundable amount on a charge invoice. It will be null for all other invoices.
   */
  
  public void setRefundableAmount(final BigDecimal refundableAmount) { this.refundableAmount = refundableAmount; }

  
  public ShippingAddress getShippingAddress() { return this.shippingAddress; }

  
  /**
   * @param shippingAddress 
   */
  
  public void setShippingAddress(final ShippingAddress shippingAddress) { this.shippingAddress = shippingAddress; }

  
  /**
   * Invoice state
   */
  
  public Constants.InvoiceState getState() { return this.state; }

  
  /**
   * @param state Invoice state
   */
  
  public void setState(final Constants.InvoiceState state) { this.state = state; }

  
  /**
   * If the invoice is charging or refunding for one or more subscriptions, these are their IDs.
   */
  
  public List<String> getSubscriptionIds() { return this.subscriptionIds; }

  
  /**
   * @param subscriptionIds If the invoice is charging or refunding for one or more subscriptions, these are their IDs.
   */
  
  public void setSubscriptionIds(final List<String> subscriptionIds) { this.subscriptionIds = subscriptionIds; }

  
  /**
   * The summation of charges and credits, before discounts and taxes.
   */
  
  public BigDecimal getSubtotal() { return this.subtotal; }

  
  /**
   * @param subtotal The summation of charges and credits, before discounts and taxes.
   */
  
  public void setSubtotal(final BigDecimal subtotal) { this.subtotal = subtotal; }

  
  /**
   * The total tax on this invoice.
   */
  
  public BigDecimal getTax() { return this.tax; }

  
  /**
   * @param tax The total tax on this invoice.
   */
  
  public void setTax(final BigDecimal tax) { this.tax = tax; }

  
  /**
   * Tax info
   */
  
  public TaxInfo getTaxInfo() { return this.taxInfo; }

  
  /**
   * @param taxInfo Tax info
   */
  
  public void setTaxInfo(final TaxInfo taxInfo) { this.taxInfo = taxInfo; }

  
  /**
   * This will default to the Terms and Conditions text specified on the Invoice Settings page in your Recurly admin. Specify custom notes to add or override Terms and Conditions.
   */
  
  public String getTermsAndConditions() { return this.termsAndConditions; }

  
  /**
   * @param termsAndConditions This will default to the Terms and Conditions text specified on the Invoice Settings page in your Recurly admin. Specify custom notes to add or override Terms and Conditions.
   */
  
  public void setTermsAndConditions(final String termsAndConditions) { this.termsAndConditions = termsAndConditions; }

  
  /**
   * The final total on this invoice. The summation of invoice charges, discounts, credits, and tax.
   */
  
  public BigDecimal getTotal() { return this.total; }

  
  /**
   * @param total The final total on this invoice. The summation of invoice charges, discounts, credits, and tax.
   */
  
  public void setTotal(final BigDecimal total) { this.total = total; }

  
  /**
   * Transactions
   */
  
  public List<Transaction> getTransactions() { return this.transactions; }

  
  /**
   * @param transactions Transactions
   */
  
  public void setTransactions(final List<Transaction> transactions) { this.transactions = transactions; }

  
  /**
   * Invoices are either charge, credit, or legacy invoices.
   */
  
  public Constants.InvoiceType getType() { return this.type; }

  
  /**
   * @param type Invoices are either charge, credit, or legacy invoices.
   */
  
  public void setType(final Constants.InvoiceType type) { this.type = type; }

  
  /**
   * Last updated at
   */
  
  public DateTime getUpdatedAt() { return this.updatedAt; }

  
  /**
   * @param updatedAt Last updated at
   */
  
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

  
  /**
   * Invoice UUID
   */
  
  public String getUuid() { return this.uuid; }

  
  /**
   * @param uuid Invoice UUID
   */
  
  public void setUuid(final String uuid) { this.uuid = uuid; }

  
  /**
   * VAT registration number for the customer on this invoice. This will come from the VAT Number field in the Billing Info or the Account Info depending on your tax settings and the invoice collection method.
   */
  
  public String getVatNumber() { return this.vatNumber; }

  
  /**
   * @param vatNumber VAT registration number for the customer on this invoice. This will come from the VAT Number field in the Billing Info or the Account Info depending on your tax settings and the invoice collection method.
   */
  
  public void setVatNumber(final String vatNumber) { this.vatNumber = vatNumber; }

  
  /**
   * VAT Reverse Charge Notes only appear if you have EU VAT enabled or are using your own Avalara AvaTax account and the customer is in the EU, has a VAT number, and is in a different country than your own. This will default to the VAT Reverse Charge Notes text specified on the Tax Settings page in your Recurly admin, unless custom notes were created with the original subscription.
   */
  
  public String getVatReverseChargeNotes() { return this.vatReverseChargeNotes; }

  
  /**
   * @param vatReverseChargeNotes VAT Reverse Charge Notes only appear if you have EU VAT enabled or are using your own Avalara AvaTax account and the customer is in the EU, has a VAT number, and is in a different country than your own. This will default to the VAT Reverse Charge Notes text specified on the Tax Settings page in your Recurly admin, unless custom notes were created with the original subscription.
   */
  
  public void setVatReverseChargeNotes(final String vatReverseChargeNotes) { this.vatReverseChargeNotes = vatReverseChargeNotes; }

}
