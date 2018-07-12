package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class Account extends Resource {

  @SerializedName("address")
  private Address address;

  @SerializedName("billing_info")
  private BillingInfo billingInfo;

  @SerializedName("cc_emails")
  private String ccEmails;

  @SerializedName("code")
  private String code;

  @SerializedName("company")
  private String company;

  @SerializedName("created_at")
  private DateTime createdAt;

  @SerializedName("custom_fields")
  private List<CustomField> customFields;

  @SerializedName("deleted_at")
  private DateTime deletedAt;

  @SerializedName("email")
  private String email;

  @SerializedName("first_name")
  private String firstName;

  @SerializedName("hosted_login_token")
  private String hostedLoginToken;

  @SerializedName("id")
  private String id;

  @SerializedName("last_name")
  private String lastName;

  @SerializedName("object")
  private String object;

  @SerializedName("preferred_locale")
  private String preferredLocale;

  @SerializedName("shipping_addresses")
  private List<ShippingAddress> shippingAddresses;

  @SerializedName("state")
  private String state;

  @SerializedName("tax_exempt")
  private Boolean taxExempt;

  @SerializedName("updated_at")
  private DateTime updatedAt;

  @SerializedName("username")
  private String username;

  @SerializedName("vat_number")
  private String vatNumber;


  public Address getAddress() { return this.address; }
  public void setAddress(final Address address) { this.address = address; }

  public BillingInfo getBillingInfo() { return this.billingInfo; }
  public void setBillingInfo(final BillingInfo billingInfo) { this.billingInfo = billingInfo; }

  public String getCcEmails() { return this.ccEmails; }
  public void setCcEmails(final String ccEmails) { this.ccEmails = ccEmails; }

  public String getCode() { return this.code; }
  public void setCode(final String code) { this.code = code; }

  public String getCompany() { return this.company; }
  public void setCompany(final String company) { this.company = company; }

  public DateTime getCreatedAt() { return this.createdAt; }
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  public List<CustomField> getCustomFields() { return this.customFields; }
  public void setCustomFields(final List<CustomField> customFields) { this.customFields = customFields; }

  public DateTime getDeletedAt() { return this.deletedAt; }
  public void setDeletedAt(final DateTime deletedAt) { this.deletedAt = deletedAt; }

  public String getEmail() { return this.email; }
  public void setEmail(final String email) { this.email = email; }

  public String getFirstName() { return this.firstName; }
  public void setFirstName(final String firstName) { this.firstName = firstName; }

  public String getHostedLoginToken() { return this.hostedLoginToken; }
  public void setHostedLoginToken(final String hostedLoginToken) { this.hostedLoginToken = hostedLoginToken; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getLastName() { return this.lastName; }
  public void setLastName(final String lastName) { this.lastName = lastName; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public String getPreferredLocale() { return this.preferredLocale; }
  public void setPreferredLocale(final String preferredLocale) { this.preferredLocale = preferredLocale; }

  public List<ShippingAddress> getShippingAddresses() { return this.shippingAddresses; }
  public void setShippingAddresses(final List<ShippingAddress> shippingAddresses) { this.shippingAddresses = shippingAddresses; }

  public String getState() { return this.state; }
  public void setState(final String state) { this.state = state; }

  public Boolean getTaxExempt() { return this.taxExempt; }
  public void setTaxExempt(final Boolean taxExempt) { this.taxExempt = taxExempt; }

  public DateTime getUpdatedAt() { return this.updatedAt; }
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

  public String getUsername() { return this.username; }
  public void setUsername(final String username) { this.username = username; }

  public String getVatNumber() { return this.vatNumber; }
  public void setVatNumber(final String vatNumber) { this.vatNumber = vatNumber; }

}
