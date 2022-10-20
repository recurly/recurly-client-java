/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import com.recurly.v3.Constants;
import com.recurly.v3.resources.*;
import org.joda.time.DateTime;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class InvoiceUpdate extends Request {

  
  @SerializedName("address")
  @Expose
  private InvoiceAddress address;

  
  /**
   * Customer notes are an optional note field.
   */
  
  @SerializedName("customer_notes")
  @Expose
  private String customerNotes;

  
  /**
   * Integer representing the number of days after an invoice's creation that the invoice will become past due. Changing Net terms changes due_on, and the invoice could move between past due and pending.
   */
  
  @SerializedName("net_terms")
  @Expose
  private Integer netTerms;

  
  /**
   * This identifies the PO number associated with the invoice. Not editable for credit invoices.
   */
  
  @SerializedName("po_number")
  @Expose
  private String poNumber;

  
  /**
   * Terms and conditions are an optional note field. Not editable for credit invoices.
   */
  
  @SerializedName("terms_and_conditions")
  @Expose
  private String termsAndConditions;

  
  /**
   * VAT Reverse Charge Notes are editable only if there was a VAT reverse charge applied to the invoice.
   */
  
  @SerializedName("vat_reverse_charge_notes")
  @Expose
  private String vatReverseChargeNotes;


  
  public InvoiceAddress getAddress() { return this.address; }

  
  /**
   * @param address 
   */
  
  public void setAddress(final InvoiceAddress address) { this.address = address; }

  
  /**
   * Customer notes are an optional note field.
   */
  
  public String getCustomerNotes() { return this.customerNotes; }

  
  /**
   * @param customerNotes Customer notes are an optional note field.
   */
  
  public void setCustomerNotes(final String customerNotes) { this.customerNotes = customerNotes; }

  
  /**
   * Integer representing the number of days after an invoice's creation that the invoice will become past due. Changing Net terms changes due_on, and the invoice could move between past due and pending.
   */
  
  public Integer getNetTerms() { return this.netTerms; }

  
  /**
   * @param netTerms Integer representing the number of days after an invoice's creation that the invoice will become past due. Changing Net terms changes due_on, and the invoice could move between past due and pending.
   */
  
  public void setNetTerms(final Integer netTerms) { this.netTerms = netTerms; }

  
  /**
   * This identifies the PO number associated with the invoice. Not editable for credit invoices.
   */
  
  public String getPoNumber() { return this.poNumber; }

  
  /**
   * @param poNumber This identifies the PO number associated with the invoice. Not editable for credit invoices.
   */
  
  public void setPoNumber(final String poNumber) { this.poNumber = poNumber; }

  
  /**
   * Terms and conditions are an optional note field. Not editable for credit invoices.
   */
  
  public String getTermsAndConditions() { return this.termsAndConditions; }

  
  /**
   * @param termsAndConditions Terms and conditions are an optional note field. Not editable for credit invoices.
   */
  
  public void setTermsAndConditions(final String termsAndConditions) { this.termsAndConditions = termsAndConditions; }

  
  /**
   * VAT Reverse Charge Notes are editable only if there was a VAT reverse charge applied to the invoice.
   */
  
  public String getVatReverseChargeNotes() { return this.vatReverseChargeNotes; }

  
  /**
   * @param vatReverseChargeNotes VAT Reverse Charge Notes are editable only if there was a VAT reverse charge applied to the invoice.
   */
  
  public void setVatReverseChargeNotes(final String vatReverseChargeNotes) { this.vatReverseChargeNotes = vatReverseChargeNotes; }

}
