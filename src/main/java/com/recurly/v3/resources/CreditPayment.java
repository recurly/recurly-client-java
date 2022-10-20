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

public class CreditPayment extends Resource {

  
  /**
   * Account mini details
   */
  
  @SerializedName("account")
  @Expose
  private AccountMini account;

  
  /**
   * The action for which the credit was created.
   */
  
  @SerializedName("action")
  @Expose
  private Constants.CreditPaymentAction action;

  
  /**
   * Total credit payment amount applied to the charge invoice.
   */
  
  @SerializedName("amount")
  @Expose
  private BigDecimal amount;

  
  /**
   * Invoice mini details
   */
  
  @SerializedName("applied_to_invoice")
  @Expose
  private InvoiceMini appliedToInvoice;

  
  /**
   * Created at
   */
  
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  
  /**
   * 3-letter ISO 4217 currency code.
   */
  
  @SerializedName("currency")
  @Expose
  private String currency;

  
  /**
   * Credit Payment ID
   */
  
  @SerializedName("id")
  @Expose
  private String id;

  
  /**
   * Object type
   */
  
  @SerializedName("object")
  @Expose
  private String object;

  
  /**
   * For credit payments with action `refund`, this is the credit payment that was refunded.
   */
  
  @SerializedName("original_credit_payment_id")
  @Expose
  private String originalCreditPaymentId;

  
  /**
   * Invoice mini details
   */
  
  @SerializedName("original_invoice")
  @Expose
  private InvoiceMini originalInvoice;

  
  @SerializedName("refund_transaction")
  @Expose
  private Transaction refundTransaction;

  
  /**
   * Last updated at
   */
  
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  
  /**
   * The UUID is useful for matching data with the CSV exports and building URLs into Recurly's UI.
   */
  
  @SerializedName("uuid")
  @Expose
  private String uuid;

  
  /**
   * Voided at
   */
  
  @SerializedName("voided_at")
  @Expose
  private DateTime voidedAt;



  
  /**
   * Account mini details
   */
  
  public AccountMini getAccount() { return this.account; }

  
  /**
   * @param account Account mini details
   */
  
  public void setAccount(final AccountMini account) { this.account = account; }

  
  /**
   * The action for which the credit was created.
   */
  
  public Constants.CreditPaymentAction getAction() { return this.action; }

  
  /**
   * @param action The action for which the credit was created.
   */
  
  public void setAction(final Constants.CreditPaymentAction action) { this.action = action; }

  
  /**
   * Total credit payment amount applied to the charge invoice.
   */
  
  public BigDecimal getAmount() { return this.amount; }

  
  /**
   * @param amount Total credit payment amount applied to the charge invoice.
   */
  
  public void setAmount(final BigDecimal amount) { this.amount = amount; }

  
  /**
   * Invoice mini details
   */
  
  public InvoiceMini getAppliedToInvoice() { return this.appliedToInvoice; }

  
  /**
   * @param appliedToInvoice Invoice mini details
   */
  
  public void setAppliedToInvoice(final InvoiceMini appliedToInvoice) { this.appliedToInvoice = appliedToInvoice; }

  
  /**
   * Created at
   */
  
  public DateTime getCreatedAt() { return this.createdAt; }

  
  /**
   * @param createdAt Created at
   */
  
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  
  /**
   * 3-letter ISO 4217 currency code.
   */
  
  public String getCurrency() { return this.currency; }

  
  /**
   * @param currency 3-letter ISO 4217 currency code.
   */
  
  public void setCurrency(final String currency) { this.currency = currency; }

  
  /**
   * Credit Payment ID
   */
  
  public String getId() { return this.id; }

  
  /**
   * @param id Credit Payment ID
   */
  
  public void setId(final String id) { this.id = id; }

  
  /**
   * Object type
   */
  
  public String getObject() { return this.object; }

  
  /**
   * @param object Object type
   */
  
  public void setObject(final String object) { this.object = object; }

  
  /**
   * For credit payments with action `refund`, this is the credit payment that was refunded.
   */
  
  public String getOriginalCreditPaymentId() { return this.originalCreditPaymentId; }

  
  /**
   * @param originalCreditPaymentId For credit payments with action `refund`, this is the credit payment that was refunded.
   */
  
  public void setOriginalCreditPaymentId(final String originalCreditPaymentId) { this.originalCreditPaymentId = originalCreditPaymentId; }

  
  /**
   * Invoice mini details
   */
  
  public InvoiceMini getOriginalInvoice() { return this.originalInvoice; }

  
  /**
   * @param originalInvoice Invoice mini details
   */
  
  public void setOriginalInvoice(final InvoiceMini originalInvoice) { this.originalInvoice = originalInvoice; }

  
  public Transaction getRefundTransaction() { return this.refundTransaction; }

  
  /**
   * @param refundTransaction 
   */
  
  public void setRefundTransaction(final Transaction refundTransaction) { this.refundTransaction = refundTransaction; }

  
  /**
   * Last updated at
   */
  
  public DateTime getUpdatedAt() { return this.updatedAt; }

  
  /**
   * @param updatedAt Last updated at
   */
  
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

  
  /**
   * The UUID is useful for matching data with the CSV exports and building URLs into Recurly's UI.
   */
  
  public String getUuid() { return this.uuid; }

  
  /**
   * @param uuid The UUID is useful for matching data with the CSV exports and building URLs into Recurly's UI.
   */
  
  public void setUuid(final String uuid) { this.uuid = uuid; }

  
  /**
   * Voided at
   */
  
  public DateTime getVoidedAt() { return this.voidedAt; }

  
  /**
   * @param voidedAt Voided at
   */
  
  public void setVoidedAt(final DateTime voidedAt) { this.voidedAt = voidedAt; }

}
