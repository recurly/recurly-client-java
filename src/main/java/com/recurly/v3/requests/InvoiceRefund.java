package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class InvoiceRefund extends Request {

  @SerializedName("amount")
  private Integer amount;

  @SerializedName("credit_customer_notes")
  private String creditCustomerNotes;

  @SerializedName("external_refund")
  private ExternalRefund externalRefund;

  @SerializedName("line_items")
  private List<LineItemRefund> lineItems;

  @SerializedName("refund_method")
  private String refundMethod;

  @SerializedName("type")
  private String type;


  public Integer getAmount() { return this.amount; }
  public void setAmount(final Integer amount) { this.amount = amount; }

  public String getCreditCustomerNotes() { return this.creditCustomerNotes; }
  public void setCreditCustomerNotes(final String creditCustomerNotes) { this.creditCustomerNotes = creditCustomerNotes; }

  public ExternalRefund getExternalRefund() { return this.externalRefund; }
  public void setExternalRefund(final ExternalRefund externalRefund) { this.externalRefund = externalRefund; }

  public List<LineItemRefund> getLineItems() { return this.lineItems; }
  public void setLineItems(final List<LineItemRefund> lineItems) { this.lineItems = lineItems; }

  public String getRefundMethod() { return this.refundMethod; }
  public void setRefundMethod(final String refundMethod) { this.refundMethod = refundMethod; }

  public String getType() { return this.type; }
  public void setType(final String type) { this.type = type; }

}
