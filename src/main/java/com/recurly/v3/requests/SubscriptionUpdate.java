/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class SubscriptionUpdate extends Request {

  @SerializedName("auto_renew")
  @Expose
  private Boolean autoRenew;

  @SerializedName("collection_method")
  @Expose
  private String collectionMethod;

  @SerializedName("custom_fields")
  @Expose
  private List<CustomField> customFields;

  @SerializedName("customer_notes")
  @Expose
  private String customerNotes;

  @SerializedName("net_terms")
  @Expose
  private Integer netTerms;

  @SerializedName("next_bill_date")
  @Expose
  private DateTime nextBillDate;

  @SerializedName("po_number")
  @Expose
  private String poNumber;

  @SerializedName("remaining_billing_cycles")
  @Expose
  private Integer remainingBillingCycles;

  @SerializedName("renewal_billing_cycles")
  @Expose
  private Integer renewalBillingCycles;

  @SerializedName("shipping_address")
  @Expose
  private ShippingAddressCreate shippingAddress;

  @SerializedName("shipping_address_id")
  @Expose
  private String shippingAddressId;

  @SerializedName("terms_and_conditions")
  @Expose
  private String termsAndConditions;


  public Boolean getAutoRenew() { return this.autoRenew; }
  public void setAutoRenew(final Boolean autoRenew) { this.autoRenew = autoRenew; }

  public String getCollectionMethod() { return this.collectionMethod; }
  public void setCollectionMethod(final String collectionMethod) { this.collectionMethod = collectionMethod; }

  public List<CustomField> getCustomFields() { return this.customFields; }
  public void setCustomFields(final List<CustomField> customFields) { this.customFields = customFields; }

  public String getCustomerNotes() { return this.customerNotes; }
  public void setCustomerNotes(final String customerNotes) { this.customerNotes = customerNotes; }

  public Integer getNetTerms() { return this.netTerms; }
  public void setNetTerms(final Integer netTerms) { this.netTerms = netTerms; }

  public DateTime getNextBillDate() { return this.nextBillDate; }
  public void setNextBillDate(final DateTime nextBillDate) { this.nextBillDate = nextBillDate; }

  public String getPoNumber() { return this.poNumber; }
  public void setPoNumber(final String poNumber) { this.poNumber = poNumber; }

  public Integer getRemainingBillingCycles() { return this.remainingBillingCycles; }
  public void setRemainingBillingCycles(final Integer remainingBillingCycles) { this.remainingBillingCycles = remainingBillingCycles; }

  public Integer getRenewalBillingCycles() { return this.renewalBillingCycles; }
  public void setRenewalBillingCycles(final Integer renewalBillingCycles) { this.renewalBillingCycles = renewalBillingCycles; }

  public ShippingAddressCreate getShippingAddress() { return this.shippingAddress; }
  public void setShippingAddress(final ShippingAddressCreate shippingAddress) { this.shippingAddress = shippingAddress; }

  public String getShippingAddressId() { return this.shippingAddressId; }
  public void setShippingAddressId(final String shippingAddressId) { this.shippingAddressId = shippingAddressId; }

  public String getTermsAndConditions() { return this.termsAndConditions; }
  public void setTermsAndConditions(final String termsAndConditions) { this.termsAndConditions = termsAndConditions; }

}
