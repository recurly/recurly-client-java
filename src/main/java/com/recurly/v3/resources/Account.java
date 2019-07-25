/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.util.List;
import org.joda.time.DateTime;

public class Account extends Resource {

  @SerializedName("address")
  @Expose
  private Address address;

  @SerializedName("bill_to")
  @Expose
  private String billTo;

  @SerializedName("billing_info")
  @Expose
  private BillingInfo billingInfo;

  @SerializedName("cc_emails")
  @Expose
  private String ccEmails;

  @SerializedName("code")
  @Expose
  private String code;

  @SerializedName("company")
  @Expose
  private String company;

  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  @SerializedName("custom_fields")
  @Expose
  private List<CustomField> customFields;

  @SerializedName("deleted_at")
  @Expose
  private DateTime deletedAt;

  @SerializedName("email")
  @Expose
  private String email;

  @SerializedName("exemption_certificate")
  @Expose
  private String exemptionCertificate;

  @SerializedName("first_name")
  @Expose
  private String firstName;

  @SerializedName("hosted_login_token")
  @Expose
  private String hostedLoginToken;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("last_name")
  @Expose
  private String lastName;

  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("parent_account_id")
  @Expose
  private String parentAccountId;

  @SerializedName("preferred_locale")
  @Expose
  private String preferredLocale;

  @SerializedName("shipping_addresses")
  @Expose
  private List<ShippingAddress> shippingAddresses;

  @SerializedName("state")
  @Expose
  private String state;

  @SerializedName("tax_exempt")
  @Expose
  private Boolean taxExempt;

  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  @SerializedName("username")
  @Expose
  private String username;

  @SerializedName("vat_number")
  @Expose
  private String vatNumber;

  public Address getAddress() {
    return this.address;
  }

  public void setAddress(final Address address) {
    this.address = address;
  }

  public String getBillTo() {
    return this.billTo;
  }

  public void setBillTo(final String billTo) {
    this.billTo = billTo;
  }

  public BillingInfo getBillingInfo() {
    return this.billingInfo;
  }

  public void setBillingInfo(final BillingInfo billingInfo) {
    this.billingInfo = billingInfo;
  }

  public String getCcEmails() {
    return this.ccEmails;
  }

  public void setCcEmails(final String ccEmails) {
    this.ccEmails = ccEmails;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(final String code) {
    this.code = code;
  }

  public String getCompany() {
    return this.company;
  }

  public void setCompany(final String company) {
    this.company = company;
  }

  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public List<CustomField> getCustomFields() {
    return this.customFields;
  }

  public void setCustomFields(final List<CustomField> customFields) {
    this.customFields = customFields;
  }

  public DateTime getDeletedAt() {
    return this.deletedAt;
  }

  public void setDeletedAt(final DateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(final String email) {
    this.email = email;
  }

  public String getExemptionCertificate() {
    return this.exemptionCertificate;
  }

  public void setExemptionCertificate(final String exemptionCertificate) {
    this.exemptionCertificate = exemptionCertificate;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public String getHostedLoginToken() {
    return this.hostedLoginToken;
  }

  public void setHostedLoginToken(final String hostedLoginToken) {
    this.hostedLoginToken = hostedLoginToken;
  }

  public String getId() {
    return this.id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  public String getObject() {
    return this.object;
  }

  public void setObject(final String object) {
    this.object = object;
  }

  public String getParentAccountId() {
    return this.parentAccountId;
  }

  public void setParentAccountId(final String parentAccountId) {
    this.parentAccountId = parentAccountId;
  }

  public String getPreferredLocale() {
    return this.preferredLocale;
  }

  public void setPreferredLocale(final String preferredLocale) {
    this.preferredLocale = preferredLocale;
  }

  public List<ShippingAddress> getShippingAddresses() {
    return this.shippingAddresses;
  }

  public void setShippingAddresses(final List<ShippingAddress> shippingAddresses) {
    this.shippingAddresses = shippingAddresses;
  }

  public String getState() {
    return this.state;
  }

  public void setState(final String state) {
    this.state = state;
  }

  public Boolean getTaxExempt() {
    return this.taxExempt;
  }

  public void setTaxExempt(final Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(final String username) {
    this.username = username;
  }

  public String getVatNumber() {
    return this.vatNumber;
  }

  public void setVatNumber(final String vatNumber) {
    this.vatNumber = vatNumber;
  }
}
