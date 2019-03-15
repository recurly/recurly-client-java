package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class InvoiceUpdatable extends Request {

  @SerializedName("address")
  private InvoiceAddress address;

  @SerializedName("customer_notes")
  private String customerNotes;

  @SerializedName("net_terms")
  private Integer netTerms;

  @SerializedName("po_number")
  private String poNumber;

  @SerializedName("terms_and_conditions")
  private String termsAndConditions;

  @SerializedName("vat_reverse_charge_notes")
  private String vatReverseChargeNotes;


  public InvoiceAddress getAddress() { return this.address; }
  public void setAddress(final InvoiceAddress address) { this.address = address; }

  public String getCustomerNotes() { return this.customerNotes; }
  public void setCustomerNotes(final String customerNotes) { this.customerNotes = customerNotes; }

  public Integer getNetTerms() { return this.netTerms; }
  public void setNetTerms(final Integer netTerms) { this.netTerms = netTerms; }

  public String getPoNumber() { return this.poNumber; }
  public void setPoNumber(final String poNumber) { this.poNumber = poNumber; }

  public String getTermsAndConditions() { return this.termsAndConditions; }
  public void setTermsAndConditions(final String termsAndConditions) { this.termsAndConditions = termsAndConditions; }

  public String getVatReverseChargeNotes() { return this.vatReverseChargeNotes; }
  public void setVatReverseChargeNotes(final String vatReverseChargeNotes) { this.vatReverseChargeNotes = vatReverseChargeNotes; }

}
