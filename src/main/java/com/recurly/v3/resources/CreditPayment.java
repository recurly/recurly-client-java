package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class CreditPayment extends Resource {

  @SerializedName("account")
  private Account account;

  @SerializedName("action")
  private String action;

  @SerializedName("amount")
  private Float amount;

  @SerializedName("applied_to_invoice")
  private Invoice appliedToInvoice;

  @SerializedName("created_at")
  private DateTime createdAt;

  @SerializedName("currency")
  private String currency;

  @SerializedName("id")
  private String id;

  @SerializedName("object")
  private String object;

  @SerializedName("original_credit_payment_id")
  private String originalCreditPaymentId;

  @SerializedName("original_invoice")
  private Invoice originalInvoice;

  @SerializedName("refund_transaction")
  private Transaction refundTransaction;

  @SerializedName("updated_at")
  private DateTime updatedAt;

  @SerializedName("uuid")
  private String uuid;

  @SerializedName("voided_at")
  private DateTime voidedAt;


  public Account getAccount() { return this.account; }
  public void setAccount(final Account account) { this.account = account; }

  public String getAction() { return this.action; }
  public void setAction(final String action) { this.action = action; }

  public Float getAmount() { return this.amount; }
  public void setAmount(final Float amount) { this.amount = amount; }

  public Invoice getAppliedToInvoice() { return this.appliedToInvoice; }
  public void setAppliedToInvoice(final Invoice appliedToInvoice) { this.appliedToInvoice = appliedToInvoice; }

  public DateTime getCreatedAt() { return this.createdAt; }
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  public String getCurrency() { return this.currency; }
  public void setCurrency(final String currency) { this.currency = currency; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public String getOriginalCreditPaymentId() { return this.originalCreditPaymentId; }
  public void setOriginalCreditPaymentId(final String originalCreditPaymentId) { this.originalCreditPaymentId = originalCreditPaymentId; }

  public Invoice getOriginalInvoice() { return this.originalInvoice; }
  public void setOriginalInvoice(final Invoice originalInvoice) { this.originalInvoice = originalInvoice; }

  public Transaction getRefundTransaction() { return this.refundTransaction; }
  public void setRefundTransaction(final Transaction refundTransaction) { this.refundTransaction = refundTransaction; }

  public DateTime getUpdatedAt() { return this.updatedAt; }
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

  public String getUuid() { return this.uuid; }
  public void setUuid(final String uuid) { this.uuid = uuid; }

  public DateTime getVoidedAt() { return this.voidedAt; }
  public void setVoidedAt(final DateTime voidedAt) { this.voidedAt = voidedAt; }

}
