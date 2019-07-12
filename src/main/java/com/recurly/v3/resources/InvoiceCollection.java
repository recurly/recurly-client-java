package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class InvoiceCollection extends Resource {

  @SerializedName("charge_invoice")
  @Expose
  private Invoice chargeInvoice;

  @SerializedName("credit_invoices")
  @Expose
  private List<Invoice> creditInvoices;

  @SerializedName("object")
  @Expose
  private String object;


  public Invoice getChargeInvoice() { return this.chargeInvoice; }
  public void setChargeInvoice(final Invoice chargeInvoice) { this.chargeInvoice = chargeInvoice; }

  public List<Invoice> getCreditInvoices() { return this.creditInvoices; }
  public void setCreditInvoices(final List<Invoice> creditInvoices) { this.creditInvoices = creditInvoices; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

}
