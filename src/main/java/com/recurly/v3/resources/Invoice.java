package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class Invoice extends Resource {

  @SerializedName("account")
  private AccountMini account;

  @SerializedName("address")
  private InvoiceAddress address;

  @SerializedName("balance")
  private Float balance;

  @SerializedName("closed_at")
  private DateTime closedAt;

  @SerializedName("collection_method")
  private String collectionMethod;

  @SerializedName("created_at")
  private DateTime createdAt;

  @SerializedName("credit_payments")
  private List<CreditPayment> creditPayments;

  @SerializedName("currency")
  private String currency;

  @SerializedName("customer_notes")
  private String customerNotes;

  @SerializedName("discount")
  private Float discount;

  @SerializedName("due_at")
  private DateTime dueAt;

  @SerializedName("id")
  private String id;

  @SerializedName("line_items")
  private LineItemList lineItems;

  @SerializedName("net_terms")
  private Integer netTerms;

  @SerializedName("number")
  private String number;

  @SerializedName("object")
  private String object;

  @SerializedName("origin")
  private String origin;

  @SerializedName("paid")
  private Float paid;

  @SerializedName("po_number")
  private String poNumber;

  @SerializedName("previous_invoice_id")
  private String previousInvoiceId;

  @SerializedName("refundable_amount")
  private Float refundableAmount;

  @SerializedName("state")
  private String state;

  @SerializedName("subscription_ids")
  private List<String> subscriptionIds;

  @SerializedName("subtotal")
  private Float subtotal;

  @SerializedName("tax")
  private Float tax;

  @SerializedName("tax_info")
  private TaxInfo taxInfo;

  @SerializedName("terms_and_conditions")
  private String termsAndConditions;

  @SerializedName("total")
  private Float total;

  @SerializedName("transactions")
  private List<Transaction> transactions;

  @SerializedName("type")
  private String type;

  @SerializedName("updated_at")
  private DateTime updatedAt;

  @SerializedName("vat_number")
  private String vatNumber;

  @SerializedName("vat_reverse_charge_notes")
  private String vatReverseChargeNotes;


  public AccountMini getAccount() { return this.account; }
  public void setAccount(final AccountMini account) { this.account = account; }

  public InvoiceAddress getAddress() { return this.address; }
  public void setAddress(final InvoiceAddress address) { this.address = address; }

  public Float getBalance() { return this.balance; }
  public void setBalance(final Float balance) { this.balance = balance; }

  public DateTime getClosedAt() { return this.closedAt; }
  public void setClosedAt(final DateTime closedAt) { this.closedAt = closedAt; }

  public String getCollectionMethod() { return this.collectionMethod; }
  public void setCollectionMethod(final String collectionMethod) { this.collectionMethod = collectionMethod; }

  public DateTime getCreatedAt() { return this.createdAt; }
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  public List<CreditPayment> getCreditPayments() { return this.creditPayments; }
  public void setCreditPayments(final List<CreditPayment> creditPayments) { this.creditPayments = creditPayments; }

  public String getCurrency() { return this.currency; }
  public void setCurrency(final String currency) { this.currency = currency; }

  public String getCustomerNotes() { return this.customerNotes; }
  public void setCustomerNotes(final String customerNotes) { this.customerNotes = customerNotes; }

  public Float getDiscount() { return this.discount; }
  public void setDiscount(final Float discount) { this.discount = discount; }

  public DateTime getDueAt() { return this.dueAt; }
  public void setDueAt(final DateTime dueAt) { this.dueAt = dueAt; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public LineItemList getLineItems() { return this.lineItems; }
  public void setLineItems(final LineItemList lineItems) { this.lineItems = lineItems; }

  public Integer getNetTerms() { return this.netTerms; }
  public void setNetTerms(final Integer netTerms) { this.netTerms = netTerms; }

  public String getNumber() { return this.number; }
  public void setNumber(final String number) { this.number = number; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public String getOrigin() { return this.origin; }
  public void setOrigin(final String origin) { this.origin = origin; }

  public Float getPaid() { return this.paid; }
  public void setPaid(final Float paid) { this.paid = paid; }

  public String getPoNumber() { return this.poNumber; }
  public void setPoNumber(final String poNumber) { this.poNumber = poNumber; }

  public String getPreviousInvoiceId() { return this.previousInvoiceId; }
  public void setPreviousInvoiceId(final String previousInvoiceId) { this.previousInvoiceId = previousInvoiceId; }

  public Float getRefundableAmount() { return this.refundableAmount; }
  public void setRefundableAmount(final Float refundableAmount) { this.refundableAmount = refundableAmount; }

  public String getState() { return this.state; }
  public void setState(final String state) { this.state = state; }

  public List<String> getSubscriptionIds() { return this.subscriptionIds; }
  public void setSubscriptionIds(final List<String> subscriptionIds) { this.subscriptionIds = subscriptionIds; }

  public Float getSubtotal() { return this.subtotal; }
  public void setSubtotal(final Float subtotal) { this.subtotal = subtotal; }

  public Float getTax() { return this.tax; }
  public void setTax(final Float tax) { this.tax = tax; }

  public TaxInfo getTaxInfo() { return this.taxInfo; }
  public void setTaxInfo(final TaxInfo taxInfo) { this.taxInfo = taxInfo; }

  public String getTermsAndConditions() { return this.termsAndConditions; }
  public void setTermsAndConditions(final String termsAndConditions) { this.termsAndConditions = termsAndConditions; }

  public Float getTotal() { return this.total; }
  public void setTotal(final Float total) { this.total = total; }

  public List<Transaction> getTransactions() { return this.transactions; }
  public void setTransactions(final List<Transaction> transactions) { this.transactions = transactions; }

  public String getType() { return this.type; }
  public void setType(final String type) { this.type = type; }

  public DateTime getUpdatedAt() { return this.updatedAt; }
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

  public String getVatNumber() { return this.vatNumber; }
  public void setVatNumber(final String vatNumber) { this.vatNumber = vatNumber; }

  public String getVatReverseChargeNotes() { return this.vatReverseChargeNotes; }
  public void setVatReverseChargeNotes(final String vatReverseChargeNotes) { this.vatReverseChargeNotes = vatReverseChargeNotes; }

}
