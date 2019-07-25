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

public class InvoiceUpdatable extends Request {

  @SerializedName("address")
  @Expose
  private InvoiceAddress address;

  @SerializedName("customer_notes")
  @Expose
  private String customerNotes;

  @SerializedName("net_terms")
  @Expose
  private Integer netTerms;

  @SerializedName("po_number")
  @Expose
  private String poNumber;

  @SerializedName("terms_and_conditions")
  @Expose
  private String termsAndConditions;

  @SerializedName("vat_reverse_charge_notes")
  @Expose
  private String vatReverseChargeNotes;

  public InvoiceAddress getAddress() {
    return this.address;
  }

  public void setAddress(final InvoiceAddress address) {
    this.address = address;
  }

  public String getCustomerNotes() {
    return this.customerNotes;
  }

  public void setCustomerNotes(final String customerNotes) {
    this.customerNotes = customerNotes;
  }

  public Integer getNetTerms() {
    return this.netTerms;
  }

  public void setNetTerms(final Integer netTerms) {
    this.netTerms = netTerms;
  }

  public String getPoNumber() {
    return this.poNumber;
  }

  public void setPoNumber(final String poNumber) {
    this.poNumber = poNumber;
  }

  public String getTermsAndConditions() {
    return this.termsAndConditions;
  }

  public void setTermsAndConditions(final String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  public String getVatReverseChargeNotes() {
    return this.vatReverseChargeNotes;
  }

  public void setVatReverseChargeNotes(final String vatReverseChargeNotes) {
    this.vatReverseChargeNotes = vatReverseChargeNotes;
  }
}
