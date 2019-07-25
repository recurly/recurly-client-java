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

public class CreditPayment extends Resource {

  @SerializedName("account")
  @Expose
  private AccountMini account;

  @SerializedName("action")
  @Expose
  private String action;

  @SerializedName("amount")
  @Expose
  private Float amount;

  @SerializedName("applied_to_invoice")
  @Expose
  private InvoiceMini appliedToInvoice;

  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  @SerializedName("currency")
  @Expose
  private String currency;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("original_credit_payment_id")
  @Expose
  private String originalCreditPaymentId;

  @SerializedName("original_invoice")
  @Expose
  private InvoiceMini originalInvoice;

  @SerializedName("refund_transaction")
  @Expose
  private Transaction refundTransaction;

  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  @SerializedName("uuid")
  @Expose
  private String uuid;

  @SerializedName("voided_at")
  @Expose
  private DateTime voidedAt;

  public AccountMini getAccount() {
    return this.account;
  }

  public void setAccount(final AccountMini account) {
    this.account = account;
  }

  public String getAction() {
    return this.action;
  }

  public void setAction(final String action) {
    this.action = action;
  }

  public Float getAmount() {
    return this.amount;
  }

  public void setAmount(final Float amount) {
    this.amount = amount;
  }

  public InvoiceMini getAppliedToInvoice() {
    return this.appliedToInvoice;
  }

  public void setAppliedToInvoice(final InvoiceMini appliedToInvoice) {
    this.appliedToInvoice = appliedToInvoice;
  }

  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  public String getId() {
    return this.id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getObject() {
    return this.object;
  }

  public void setObject(final String object) {
    this.object = object;
  }

  public String getOriginalCreditPaymentId() {
    return this.originalCreditPaymentId;
  }

  public void setOriginalCreditPaymentId(final String originalCreditPaymentId) {
    this.originalCreditPaymentId = originalCreditPaymentId;
  }

  public InvoiceMini getOriginalInvoice() {
    return this.originalInvoice;
  }

  public void setOriginalInvoice(final InvoiceMini originalInvoice) {
    this.originalInvoice = originalInvoice;
  }

  public Transaction getRefundTransaction() {
    return this.refundTransaction;
  }

  public void setRefundTransaction(final Transaction refundTransaction) {
    this.refundTransaction = refundTransaction;
  }

  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(final String uuid) {
    this.uuid = uuid;
  }

  public DateTime getVoidedAt() {
    return this.voidedAt;
  }

  public void setVoidedAt(final DateTime voidedAt) {
    this.voidedAt = voidedAt;
  }
}
