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

  @SerializedName("amount")
  @Expose
  private Integer amount;

  @SerializedName("credit_customer_notes")
  @Expose
  private String creditCustomerNotes;

  @SerializedName("external_refund")
  @Expose
  private ExternalRefund externalRefund;

  @SerializedName("line_items")
  @Expose
  private List<LineItemRefund> lineItems;

  @SerializedName("refund_method")
  @Expose
  private String refundMethod;

  @SerializedName("type")
  @Expose
  private String type;

  public Integer getAmount() {
    return this.amount;
  }

  public void setAmount(final Integer amount) {
    this.amount = amount;
  }

  public String getCreditCustomerNotes() {
    return this.creditCustomerNotes;
  }

  public void setCreditCustomerNotes(final String creditCustomerNotes) {
    this.creditCustomerNotes = creditCustomerNotes;
  }

  public ExternalRefund getExternalRefund() {
    return this.externalRefund;
  }

  public void setExternalRefund(final ExternalRefund externalRefund) {
    this.externalRefund = externalRefund;
  }

  public List<LineItemRefund> getLineItems() {
    return this.lineItems;
  }

  public void setLineItems(final List<LineItemRefund> lineItems) {
    this.lineItems = lineItems;
  }

  public String getRefundMethod() {
    return this.refundMethod;
  }

  public void setRefundMethod(final String refundMethod) {
    this.refundMethod = refundMethod;
  }

  public String getType() {
    return this.type;
  }

  public void setType(final String type) {
    this.type = type;
  }
}
