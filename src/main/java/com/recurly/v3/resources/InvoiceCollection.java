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

public class InvoiceCollection extends Resource {

  
  @SerializedName("charge_invoice")
  @Expose
  private Invoice chargeInvoice;

  
  /**
   * Credit invoices
   */
  
  @SerializedName("credit_invoices")
  @Expose
  private List<Invoice> creditInvoices;

  
  /**
   * Object type
   */
  
  @SerializedName("object")
  @Expose
  private String object;



  
  public Invoice getChargeInvoice() { return this.chargeInvoice; }

  
  /**
   * @param chargeInvoice 
   */
  
  public void setChargeInvoice(final Invoice chargeInvoice) { this.chargeInvoice = chargeInvoice; }

  
  /**
   * Credit invoices
   */
  
  public List<Invoice> getCreditInvoices() { return this.creditInvoices; }

  
  /**
   * @param creditInvoices Credit invoices
   */
  
  public void setCreditInvoices(final List<Invoice> creditInvoices) { this.creditInvoices = creditInvoices; }

  
  /**
   * Object type
   */
  
  public String getObject() { return this.object; }

  
  /**
   * @param object Object type
   */
  
  public void setObject(final String object) { this.object = object; }

}
