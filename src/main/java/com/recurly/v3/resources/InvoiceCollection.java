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
