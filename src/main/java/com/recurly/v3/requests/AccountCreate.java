/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Constants;
import com.recurly.v3.Request;
import com.recurly.v3.resources.*;
import java.util.List;

public class AccountCreate extends Request {

  @SerializedName("acquisition")
  @Expose
  private AccountAcquisitionUpdate acquisition;

  @SerializedName("address")
  @Expose
  private Address address;

  /**
   * An enumerable describing the billing behavior of the account, specifically whether the account
   * is self-paying or will rely on the parent account to pay.
   */
  @SerializedName("bill_to")
  @Expose
  private Constants.BillTo billTo;

  @SerializedName("billing_info")
  @Expose
  private BillingInfoCreate billingInfo;

  /**
   * Additional email address that should receive account correspondence. These should be separated
   * only by commas. These CC emails will receive all emails that the `email` field also receives.
   */
  @SerializedName("cc_emails")
  @Expose
  private String ccEmails;

  /** The unique identifier of the account. This cannot be changed once the account is created. */
  @SerializedName("code")
  @Expose
  private String code;

  @SerializedName("company")
  @Expose
  private String company;

  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  @SerializedName("custom_fields")
  @Expose
  private List<CustomField> customFields;

  /**
   * The email address used for communicating with this customer. The customer will also use this
   * email address to log into your hosted account management pages. This value does not need to be
   * unique.
   */
  @SerializedName("email")
  @Expose
  private String email;

  /**
   * The tax exemption certificate number for the account. If the merchant has an integration for
   * the Vertex tax provider, this optional value will be sent in any tax calculation requests for
   * the account.
   */
  @SerializedName("exemption_certificate")
  @Expose
  private String exemptionCertificate;

  @SerializedName("first_name")
  @Expose
  private String firstName;

  @SerializedName("last_name")
  @Expose
  private String lastName;

  /**
   * The account code of the parent account to be associated with this account. Passing an empty
   * value removes any existing parent association from this account. If both `parent_account_code`
   * and `parent_account_id` are passed, the non-blank value in `parent_account_id` will be used.
   * Only one level of parent child relationship is allowed. You cannot assign a parent account that
   * itself has a parent account.
   */
  @SerializedName("parent_account_code")
  @Expose
  private String parentAccountCode;

  /**
   * The UUID of the parent account to be associated with this account. Passing an empty value
   * removes any existing parent association from this account. If both `parent_account_code` and
   * `parent_account_id` are passed, the non-blank value in `parent_account_id` will be used. Only
   * one level of parent child relationship is allowed. You cannot assign a parent account that
   * itself has a parent account.
   */
  @SerializedName("parent_account_id")
  @Expose
  private String parentAccountId;

  /**
   * Used to determine the language and locale of emails sent on behalf of the merchant to the
   * customer. The list of locales is restricted to those the merchant has enabled on the site.
   */
  @SerializedName("preferred_locale")
  @Expose
  private Constants.PreferredLocale preferredLocale;

  @SerializedName("shipping_addresses")
  @Expose
  private List<ShippingAddressCreate> shippingAddresses;

  /**
   * The tax status of the account. `true` exempts tax on the account, `false` applies tax on the
   * account.
   */
  @SerializedName("tax_exempt")
  @Expose
  private Boolean taxExempt;

  /**
   * An optional type designation for the payment gateway transaction created by this request.
   * Supports 'moto' value, which is the acronym for mail order and telephone transactions.
   */
  @SerializedName("transaction_type")
  @Expose
  private Constants.GatewayTransactionType transactionType;

  /** A secondary value for the account. */
  @SerializedName("username")
  @Expose
  private String username;

  /**
   * The VAT number of the account (to avoid having the VAT applied). This is only used for manually
   * collected invoices.
   */
  @SerializedName("vat_number")
  @Expose
  private String vatNumber;

  public AccountAcquisitionUpdate getAcquisition() {
    return this.acquisition;
  }

  /** @param acquisition */
  public void setAcquisition(final AccountAcquisitionUpdate acquisition) {
    this.acquisition = acquisition;
  }

  public Address getAddress() {
    return this.address;
  }

  /** @param address */
  public void setAddress(final Address address) {
    this.address = address;
  }

  /**
   * An enumerable describing the billing behavior of the account, specifically whether the account
   * is self-paying or will rely on the parent account to pay.
   */
  public Constants.BillTo getBillTo() {
    return this.billTo;
  }

  /**
   * @param billTo An enumerable describing the billing behavior of the account, specifically
   *     whether the account is self-paying or will rely on the parent account to pay.
   */
  public void setBillTo(final Constants.BillTo billTo) {
    this.billTo = billTo;
  }

  public BillingInfoCreate getBillingInfo() {
    return this.billingInfo;
  }

  /** @param billingInfo */
  public void setBillingInfo(final BillingInfoCreate billingInfo) {
    this.billingInfo = billingInfo;
  }

  /**
   * Additional email address that should receive account correspondence. These should be separated
   * only by commas. These CC emails will receive all emails that the `email` field also receives.
   */
  public String getCcEmails() {
    return this.ccEmails;
  }

  /**
   * @param ccEmails Additional email address that should receive account correspondence. These
   *     should be separated only by commas. These CC emails will receive all emails that the
   *     `email` field also receives.
   */
  public void setCcEmails(final String ccEmails) {
    this.ccEmails = ccEmails;
  }

  /** The unique identifier of the account. This cannot be changed once the account is created. */
  public String getCode() {
    return this.code;
  }

  /**
   * @param code The unique identifier of the account. This cannot be changed once the account is
   *     created.
   */
  public void setCode(final String code) {
    this.code = code;
  }

  public String getCompany() {
    return this.company;
  }

  /** @param company */
  public void setCompany(final String company) {
    this.company = company;
  }

  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  public List<CustomField> getCustomFields() {
    return this.customFields;
  }

  /**
   * @param customFields The custom fields will only be altered when they are included in a request.
   *     Sending an empty array will not remove any existing values. To remove a field send the name
   *     with a null or empty value.
   */
  public void setCustomFields(final List<CustomField> customFields) {
    this.customFields = customFields;
  }

  /**
   * The email address used for communicating with this customer. The customer will also use this
   * email address to log into your hosted account management pages. This value does not need to be
   * unique.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @param email The email address used for communicating with this customer. The customer will
   *     also use this email address to log into your hosted account management pages. This value
   *     does not need to be unique.
   */
  public void setEmail(final String email) {
    this.email = email;
  }

  /**
   * The tax exemption certificate number for the account. If the merchant has an integration for
   * the Vertex tax provider, this optional value will be sent in any tax calculation requests for
   * the account.
   */
  public String getExemptionCertificate() {
    return this.exemptionCertificate;
  }

  /**
   * @param exemptionCertificate The tax exemption certificate number for the account. If the
   *     merchant has an integration for the Vertex tax provider, this optional value will be sent
   *     in any tax calculation requests for the account.
   */
  public void setExemptionCertificate(final String exemptionCertificate) {
    this.exemptionCertificate = exemptionCertificate;
  }

  public String getFirstName() {
    return this.firstName;
  }

  /** @param firstName */
  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  /** @param lastName */
  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  /**
   * The account code of the parent account to be associated with this account. Passing an empty
   * value removes any existing parent association from this account. If both `parent_account_code`
   * and `parent_account_id` are passed, the non-blank value in `parent_account_id` will be used.
   * Only one level of parent child relationship is allowed. You cannot assign a parent account that
   * itself has a parent account.
   */
  public String getParentAccountCode() {
    return this.parentAccountCode;
  }

  /**
   * @param parentAccountCode The account code of the parent account to be associated with this
   *     account. Passing an empty value removes any existing parent association from this account.
   *     If both `parent_account_code` and `parent_account_id` are passed, the non-blank value in
   *     `parent_account_id` will be used. Only one level of parent child relationship is allowed.
   *     You cannot assign a parent account that itself has a parent account.
   */
  public void setParentAccountCode(final String parentAccountCode) {
    this.parentAccountCode = parentAccountCode;
  }

  /**
   * The UUID of the parent account to be associated with this account. Passing an empty value
   * removes any existing parent association from this account. If both `parent_account_code` and
   * `parent_account_id` are passed, the non-blank value in `parent_account_id` will be used. Only
   * one level of parent child relationship is allowed. You cannot assign a parent account that
   * itself has a parent account.
   */
  public String getParentAccountId() {
    return this.parentAccountId;
  }

  /**
   * @param parentAccountId The UUID of the parent account to be associated with this account.
   *     Passing an empty value removes any existing parent association from this account. If both
   *     `parent_account_code` and `parent_account_id` are passed, the non-blank value in
   *     `parent_account_id` will be used. Only one level of parent child relationship is allowed.
   *     You cannot assign a parent account that itself has a parent account.
   */
  public void setParentAccountId(final String parentAccountId) {
    this.parentAccountId = parentAccountId;
  }

  /**
   * Used to determine the language and locale of emails sent on behalf of the merchant to the
   * customer. The list of locales is restricted to those the merchant has enabled on the site.
   */
  public Constants.PreferredLocale getPreferredLocale() {
    return this.preferredLocale;
  }

  /**
   * @param preferredLocale Used to determine the language and locale of emails sent on behalf of
   *     the merchant to the customer. The list of locales is restricted to those the merchant has
   *     enabled on the site.
   */
  public void setPreferredLocale(final Constants.PreferredLocale preferredLocale) {
    this.preferredLocale = preferredLocale;
  }

  public List<ShippingAddressCreate> getShippingAddresses() {
    return this.shippingAddresses;
  }

  /** @param shippingAddresses */
  public void setShippingAddresses(final List<ShippingAddressCreate> shippingAddresses) {
    this.shippingAddresses = shippingAddresses;
  }

  /**
   * The tax status of the account. `true` exempts tax on the account, `false` applies tax on the
   * account.
   */
  public Boolean getTaxExempt() {
    return this.taxExempt;
  }

  /**
   * @param taxExempt The tax status of the account. `true` exempts tax on the account, `false`
   *     applies tax on the account.
   */
  public void setTaxExempt(final Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  /**
   * An optional type designation for the payment gateway transaction created by this request.
   * Supports 'moto' value, which is the acronym for mail order and telephone transactions.
   */
  public Constants.GatewayTransactionType getTransactionType() {
    return this.transactionType;
  }

  /**
   * @param transactionType An optional type designation for the payment gateway transaction created
   *     by this request. Supports 'moto' value, which is the acronym for mail order and telephone
   *     transactions.
   */
  public void setTransactionType(final Constants.GatewayTransactionType transactionType) {
    this.transactionType = transactionType;
  }

  /** A secondary value for the account. */
  public String getUsername() {
    return this.username;
  }

  /** @param username A secondary value for the account. */
  public void setUsername(final String username) {
    this.username = username;
  }

  /**
   * The VAT number of the account (to avoid having the VAT applied). This is only used for manually
   * collected invoices.
   */
  public String getVatNumber() {
    return this.vatNumber;
  }

  /**
   * @param vatNumber The VAT number of the account (to avoid having the VAT applied). This is only
   *     used for manually collected invoices.
   */
  public void setVatNumber(final String vatNumber) {
    this.vatNumber = vatNumber;
  }
}
