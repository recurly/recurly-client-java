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
import java.util.List;

public class InvoiceRefund extends Request {

  /**
   * The amount to be refunded. The amount will be split between the line items. If no amount is
   * specified, it will default to refunding the total refundable amount on the invoice.
   */
  @SerializedName("amount")
  @Expose
  private Integer amount;

  /**
   * Used as the Customer Notes on the credit invoice.
   *
   * <p>This field can only be include when the Credit Invoices feature is enabled.
   */
  @SerializedName("credit_customer_notes")
  @Expose
  private String creditCustomerNotes;

  /**
   * Indicates that the refund was settled outside of Recurly, and a manual transaction should be
   * created to track it in Recurly.
   *
   * <p>Required when: - refunding a manually collected charge invoice, and `refund_method` is not
   * `all_credit` - refunding a credit invoice that refunded manually collecting invoices
   *
   * <p>This field can only be included when the Credit Invoices feature is enabled.
   */
  @SerializedName("external_refund")
  @Expose
  private ExternalRefund externalRefund;

  /** The line items to be refunded. This is required when `type=line_items`. */
  @SerializedName("line_items")
  @Expose
  private List<LineItemRefund> lineItems;

  /**
   * Indicates how the invoice should be refunded when both a credit and transaction are present on
   * the invoice: - `transaction_first` – Refunds the transaction first, then any amount is issued
   * as credit back to the account. Default value when Credit Invoices feature is enabled. -
   * `credit_first` – Issues credit back to the account first, then refunds any remaining amount
   * back to the transaction. Default value when Credit Invoices feature is not enabled. -
   * `all_credit` – Issues credit to the account for the entire amount of the refund. Only available
   * when the Credit Invoices feature is enabled. - `all_transaction` – Refunds the entire amount
   * back to transactions, using transactions from previous invoices if necessary. Only available
   * when the Credit Invoices feature is enabled.
   */
  @SerializedName("refund_method")
  @Expose
  private String refundMethod;

  /** The type of refund. Amount and line items cannot both be specified in the request. */
  @SerializedName("type")
  @Expose
  private String type;

  /**
   * The amount to be refunded. The amount will be split between the line items. If no amount is
   * specified, it will default to refunding the total refundable amount on the invoice.
   */
  public Integer getAmount() {
    return this.amount;
  }

  /**
   * @param amount The amount to be refunded. The amount will be split between the line items. If no
   *     amount is specified, it will default to refunding the total refundable amount on the
   *     invoice.
   */
  public void setAmount(final Integer amount) {
    this.amount = amount;
  }

  /**
   * Used as the Customer Notes on the credit invoice.
   *
   * <p>This field can only be include when the Credit Invoices feature is enabled.
   */
  public String getCreditCustomerNotes() {
    return this.creditCustomerNotes;
  }

  /**
   * @param creditCustomerNotes Used as the Customer Notes on the credit invoice.
   *     <p>This field can only be include when the Credit Invoices feature is enabled.
   */
  public void setCreditCustomerNotes(final String creditCustomerNotes) {
    this.creditCustomerNotes = creditCustomerNotes;
  }

  /**
   * Indicates that the refund was settled outside of Recurly, and a manual transaction should be
   * created to track it in Recurly.
   *
   * <p>Required when: - refunding a manually collected charge invoice, and `refund_method` is not
   * `all_credit` - refunding a credit invoice that refunded manually collecting invoices
   *
   * <p>This field can only be included when the Credit Invoices feature is enabled.
   */
  public ExternalRefund getExternalRefund() {
    return this.externalRefund;
  }

  /**
   * @param externalRefund Indicates that the refund was settled outside of Recurly, and a manual
   *     transaction should be created to track it in Recurly.
   *     <p>Required when: - refunding a manually collected charge invoice, and `refund_method` is
   *     not `all_credit` - refunding a credit invoice that refunded manually collecting invoices
   *     <p>This field can only be included when the Credit Invoices feature is enabled.
   */
  public void setExternalRefund(final ExternalRefund externalRefund) {
    this.externalRefund = externalRefund;
  }

  /** The line items to be refunded. This is required when `type=line_items`. */
  public List<LineItemRefund> getLineItems() {
    return this.lineItems;
  }

  /** @param lineItems The line items to be refunded. This is required when `type=line_items`. */
  public void setLineItems(final List<LineItemRefund> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * Indicates how the invoice should be refunded when both a credit and transaction are present on
   * the invoice: - `transaction_first` – Refunds the transaction first, then any amount is issued
   * as credit back to the account. Default value when Credit Invoices feature is enabled. -
   * `credit_first` – Issues credit back to the account first, then refunds any remaining amount
   * back to the transaction. Default value when Credit Invoices feature is not enabled. -
   * `all_credit` – Issues credit to the account for the entire amount of the refund. Only available
   * when the Credit Invoices feature is enabled. - `all_transaction` – Refunds the entire amount
   * back to transactions, using transactions from previous invoices if necessary. Only available
   * when the Credit Invoices feature is enabled.
   */
  public String getRefundMethod() {
    return this.refundMethod;
  }

  /**
   * @param refundMethod Indicates how the invoice should be refunded when both a credit and
   *     transaction are present on the invoice: - `transaction_first` – Refunds the transaction
   *     first, then any amount is issued as credit back to the account. Default value when Credit
   *     Invoices feature is enabled. - `credit_first` – Issues credit back to the account first,
   *     then refunds any remaining amount back to the transaction. Default value when Credit
   *     Invoices feature is not enabled. - `all_credit` – Issues credit to the account for the
   *     entire amount of the refund. Only available when the Credit Invoices feature is enabled. -
   *     `all_transaction` – Refunds the entire amount back to transactions, using transactions from
   *     previous invoices if necessary. Only available when the Credit Invoices feature is enabled.
   */
  public void setRefundMethod(final String refundMethod) {
    this.refundMethod = refundMethod;
  }

  /** The type of refund. Amount and line items cannot both be specified in the request. */
  public String getType() {
    return this.type;
  }

  /**
   * @param type The type of refund. Amount and line items cannot both be specified in the request.
   */
  public void setType(final String type) {
    this.type = type;
  }
}
