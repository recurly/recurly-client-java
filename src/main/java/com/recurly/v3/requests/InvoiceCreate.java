package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class InvoiceCreate extends Request {

  @SerializedName("charge_customer_notes")
  private String chargeCustomerNotes;

  @SerializedName("collection_method")
  private String collectionMethod;

  @SerializedName("credit_customer_notes")
  private String creditCustomerNotes;

  @SerializedName("currency")
  private String currency;

  @SerializedName("net_terms")
  private Integer netTerms;

  @SerializedName("po_number")
  private String poNumber;

  @SerializedName("terms_and_conditions")
  private String termsAndConditions;

  @SerializedName("type")
  private String type;

  @SerializedName("vat_reverse_charge_notes")
  private String vatReverseChargeNotes;


  public String getChargeCustomerNotes() { return this.chargeCustomerNotes; }
  public void setChargeCustomerNotes(final String chargeCustomerNotes) { this.chargeCustomerNotes = chargeCustomerNotes; }

  public String getCollectionMethod() { return this.collectionMethod; }
  public void setCollectionMethod(final String collectionMethod) { this.collectionMethod = collectionMethod; }

  public String getCreditCustomerNotes() { return this.creditCustomerNotes; }
  public void setCreditCustomerNotes(final String creditCustomerNotes) { this.creditCustomerNotes = creditCustomerNotes; }

  public String getCurrency() { return this.currency; }
  public void setCurrency(final String currency) { this.currency = currency; }

  public Integer getNetTerms() { return this.netTerms; }
  public void setNetTerms(final Integer netTerms) { this.netTerms = netTerms; }

  public String getPoNumber() { return this.poNumber; }
  public void setPoNumber(final String poNumber) { this.poNumber = poNumber; }

  public String getTermsAndConditions() { return this.termsAndConditions; }
  public void setTermsAndConditions(final String termsAndConditions) { this.termsAndConditions = termsAndConditions; }

  public String getType() { return this.type; }
  public void setType(final String type) { this.type = type; }

  public String getVatReverseChargeNotes() { return this.vatReverseChargeNotes; }
  public void setVatReverseChargeNotes(final String vatReverseChargeNotes) { this.vatReverseChargeNotes = vatReverseChargeNotes; }

}
