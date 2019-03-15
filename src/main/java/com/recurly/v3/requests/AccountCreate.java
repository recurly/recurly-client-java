package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class AccountCreate extends Request {

  @SerializedName("acquisition")
  private AccountAcquisitionUpdatable acquisition;

  @SerializedName("address")
  private Address address;

  @SerializedName("bill_to")
  private String billTo;

  @SerializedName("billing_info")
  private BillingInfoCreate billingInfo;

  @SerializedName("cc_emails")
  private String ccEmails;

  @SerializedName("code")
  private String code;

  @SerializedName("company")
  private String company;

  @SerializedName("custom_fields")
  private List<CustomField> customFields;

  @SerializedName("email")
  private String email;

  @SerializedName("exemption_certificate")
  private String exemptionCertificate;

  @SerializedName("first_name")
  private String firstName;

  @SerializedName("last_name")
  private String lastName;

  @SerializedName("parent_account_code")
  private String parentAccountCode;

  @SerializedName("parent_account_id")
  private String parentAccountId;

  @SerializedName("preferred_locale")
  private String preferredLocale;

  @SerializedName("shipping_addresses")
  private List<ShippingAddressCreate> shippingAddresses;

  @SerializedName("tax_exempt")
  private Boolean taxExempt;

  @SerializedName("username")
  private String username;

  @SerializedName("vat_number")
  private String vatNumber;


  public AccountAcquisitionUpdatable getAcquisition() { return this.acquisition; }
  public void setAcquisition(final AccountAcquisitionUpdatable acquisition) { this.acquisition = acquisition; }

  public Address getAddress() { return this.address; }
  public void setAddress(final Address address) { this.address = address; }

  public String getBillTo() { return this.billTo; }
  public void setBillTo(final String billTo) { this.billTo = billTo; }

  public BillingInfoCreate getBillingInfo() { return this.billingInfo; }
  public void setBillingInfo(final BillingInfoCreate billingInfo) { this.billingInfo = billingInfo; }

  public String getCcEmails() { return this.ccEmails; }
  public void setCcEmails(final String ccEmails) { this.ccEmails = ccEmails; }

  public String getCode() { return this.code; }
  public void setCode(final String code) { this.code = code; }

  public String getCompany() { return this.company; }
  public void setCompany(final String company) { this.company = company; }

  public List<CustomField> getCustomFields() { return this.customFields; }
  public void setCustomFields(final List<CustomField> customFields) { this.customFields = customFields; }

  public String getEmail() { return this.email; }
  public void setEmail(final String email) { this.email = email; }

  public String getExemptionCertificate() { return this.exemptionCertificate; }
  public void setExemptionCertificate(final String exemptionCertificate) { this.exemptionCertificate = exemptionCertificate; }

  public String getFirstName() { return this.firstName; }
  public void setFirstName(final String firstName) { this.firstName = firstName; }

  public String getLastName() { return this.lastName; }
  public void setLastName(final String lastName) { this.lastName = lastName; }

  public String getParentAccountCode() { return this.parentAccountCode; }
  public void setParentAccountCode(final String parentAccountCode) { this.parentAccountCode = parentAccountCode; }

  public String getParentAccountId() { return this.parentAccountId; }
  public void setParentAccountId(final String parentAccountId) { this.parentAccountId = parentAccountId; }

  public String getPreferredLocale() { return this.preferredLocale; }
  public void setPreferredLocale(final String preferredLocale) { this.preferredLocale = preferredLocale; }

  public List<ShippingAddressCreate> getShippingAddresses() { return this.shippingAddresses; }
  public void setShippingAddresses(final List<ShippingAddressCreate> shippingAddresses) { this.shippingAddresses = shippingAddresses; }

  public Boolean getTaxExempt() { return this.taxExempt; }
  public void setTaxExempt(final Boolean taxExempt) { this.taxExempt = taxExempt; }

  public String getUsername() { return this.username; }
  public void setUsername(final String username) { this.username = username; }

  public String getVatNumber() { return this.vatNumber; }
  public void setVatNumber(final String vatNumber) { this.vatNumber = vatNumber; }

}
