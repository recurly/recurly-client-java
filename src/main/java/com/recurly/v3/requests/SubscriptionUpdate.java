package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class SubscriptionUpdate extends Request {

  @SerializedName("auto_renew")
  private Boolean autoRenew;

  @SerializedName("collection_method")
  private String collectionMethod;

  @SerializedName("custom_fields")
  private List<CustomField> customFields;

  @SerializedName("customer_notes")
  private String customerNotes;

  @SerializedName("net_terms")
  private Integer netTerms;

  @SerializedName("next_bill_date")
  private DateTime nextBillDate;

  @SerializedName("po_number")
  private String poNumber;

  @SerializedName("remaining_billing_cycles")
  private Integer remainingBillingCycles;

  @SerializedName("renewal_billing_cycles")
  private Integer renewalBillingCycles;

  @SerializedName("shipping_address")
  private ShippingAddressCreate shippingAddress;

  @SerializedName("shipping_address_id")
  private String shippingAddressId;

  @SerializedName("terms_and_conditions")
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
