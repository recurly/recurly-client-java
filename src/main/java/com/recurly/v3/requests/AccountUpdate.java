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

public class AccountUpdate extends Request {

  @SerializedName("address")
  @Expose
  private Address address;

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

  @SerializedName("company")
  @Expose
  private String company;

  /**
   * The email address used for communicating with this customer. The customer will also use this
   * email address to log into your hosted account management pages. This value does not need to be
   * unique.
   */
  @SerializedName("email")
  @Expose
  private String email;

  @SerializedName("first_name")
  @Expose
  private String firstName;

  @SerializedName("last_name")
  @Expose
  private String lastName;

  /**
   * Used to determine the language and locale of emails sent on behalf of the merchant to the
   * customer. The list of locales is restricted to those the merchant has enabled on the site.
   */
  @SerializedName("preferred_locale")
  @Expose
  private String preferredLocale;

  /**
   * The tax status of the account. `true` exempts tax on the account, `false` applies tax on the
   * account.
   */
  @SerializedName("tax_exempt")
  @Expose
  private Boolean taxExempt;

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

  public Address getAddress() {
    return this.address;
  }

  /** @param address */
  public void setAddress(final Address address) {
    this.address = address;
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

  public String getCompany() {
    return this.company;
  }

  /** @param company */
  public void setCompany(final String company) {
    this.company = company;
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
   * Used to determine the language and locale of emails sent on behalf of the merchant to the
   * customer. The list of locales is restricted to those the merchant has enabled on the site.
   */
  public String getPreferredLocale() {
    return this.preferredLocale;
  }

  /**
   * @param preferredLocale Used to determine the language and locale of emails sent on behalf of
   *     the merchant to the customer. The list of locales is restricted to those the merchant has
   *     enabled on the site.
   */
  public void setPreferredLocale(final String preferredLocale) {
    this.preferredLocale = preferredLocale;
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
