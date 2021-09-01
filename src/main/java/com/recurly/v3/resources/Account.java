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

  /**
   * An enumerable describing the billing behavior of the account, specifically whether the account
   * is self-paying or will rely on the parent account to pay.
   */
  @SerializedName("bill_to")
  @Expose
  private String billTo;

  @SerializedName("billing_info")
  @Expose
  private BillingInfo billingInfo;

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

  /** When the account was created. */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  @SerializedName("custom_fields")
  @Expose
  private List<CustomField> customFields;

  /** If present, when the account was last marked inactive. */
  @SerializedName("deleted_at")
  @Expose
  private DateTime deletedAt;

  /**
   * Unique ID to identify a dunning campaign. Available when the Dunning Campaigns feature is
   * enabled. Used to specify if a non-default dunning campaign should be assigned to this account.
   * For sites without multiple dunning campaigns enabled, the default dunning campaign will always
   * be used.
   */
  @SerializedName("dunning_campaign_id")
  @Expose
  private String dunningCampaignId;

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

  /** Indicates if the account has an active subscription. */
  @SerializedName("has_active_subscription")
  @Expose
  private Boolean hasActiveSubscription;

  /** Indicates if the account has a canceled subscription. */
  @SerializedName("has_canceled_subscription")
  @Expose
  private Boolean hasCanceledSubscription;

  /** Indicates if the account has a future subscription. */
  @SerializedName("has_future_subscription")
  @Expose
  private Boolean hasFutureSubscription;

  /**
   * Indicates if the account has a subscription that is either active, canceled, future, or paused.
   */
  @SerializedName("has_live_subscription")
  @Expose
  private Boolean hasLiveSubscription;

  /** Indicates if the account has a past due invoice. */
  @SerializedName("has_past_due_invoice")
  @Expose
  private Boolean hasPastDueInvoice;

  /** Indicates if the account has a paused subscription. */
  @SerializedName("has_paused_subscription")
  @Expose
  private Boolean hasPausedSubscription;

  /**
   * The unique token for automatically logging the account in to the hosted management pages. You
   * may automatically log the user into their hosted management pages by directing the user to:
   * `https://{subdomain}.recurly.com/account/{hosted_login_token}`.
   */
  @SerializedName("hosted_login_token")
  @Expose
  private String hostedLoginToken;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("last_name")
  @Expose
  private String lastName;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** The UUID of the parent account associated with this account. */
  @SerializedName("parent_account_id")
  @Expose
  private String parentAccountId;

  /**
   * Used to determine the language and locale of emails sent on behalf of the merchant to the
   * customer.
   */
  @SerializedName("preferred_locale")
  @Expose
  private String preferredLocale;

  /** The shipping addresses on the account. */
  @SerializedName("shipping_addresses")
  @Expose
  private List<ShippingAddress> shippingAddresses;

  /** Accounts can be either active or inactive. */
  @SerializedName("state")
  @Expose
  private String state;

  /**
   * The tax status of the account. `true` exempts tax on the account, `false` applies tax on the
   * account.
   */
  @SerializedName("tax_exempt")
  @Expose
  private Boolean taxExempt;

  /** When the account was last changed. */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

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

  /**
   * An enumerable describing the billing behavior of the account, specifically whether the account
   * is self-paying or will rely on the parent account to pay.
   */
  public String getBillTo() {
    return this.billTo;
  }

  /**
   * @param billTo An enumerable describing the billing behavior of the account, specifically
   *     whether the account is self-paying or will rely on the parent account to pay.
   */
  public void setBillTo(final String billTo) {
    this.billTo = billTo;
  }

  public BillingInfo getBillingInfo() {
    return this.billingInfo;
  }

  /** @param billingInfo */
  public void setBillingInfo(final BillingInfo billingInfo) {
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

  /** When the account was created. */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt When the account was created. */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
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

  /** If present, when the account was last marked inactive. */
  public DateTime getDeletedAt() {
    return this.deletedAt;
  }

  /** @param deletedAt If present, when the account was last marked inactive. */
  public void setDeletedAt(final DateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  /**
   * Unique ID to identify a dunning campaign. Available when the Dunning Campaigns feature is
   * enabled. Used to specify if a non-default dunning campaign should be assigned to this account.
   * For sites without multiple dunning campaigns enabled, the default dunning campaign will always
   * be used.
   */
  public String getDunningCampaignId() {
    return this.dunningCampaignId;
  }

  /**
   * @param dunningCampaignId Unique ID to identify a dunning campaign. Available when the Dunning
   *     Campaigns feature is enabled. Used to specify if a non-default dunning campaign should be
   *     assigned to this account. For sites without multiple dunning campaigns enabled, the default
   *     dunning campaign will always be used.
   */
  public void setDunningCampaignId(final String dunningCampaignId) {
    this.dunningCampaignId = dunningCampaignId;
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

  /** Indicates if the account has an active subscription. */
  public Boolean getHasActiveSubscription() {
    return this.hasActiveSubscription;
  }

  /** @param hasActiveSubscription Indicates if the account has an active subscription. */
  public void setHasActiveSubscription(final Boolean hasActiveSubscription) {
    this.hasActiveSubscription = hasActiveSubscription;
  }

  /** Indicates if the account has a canceled subscription. */
  public Boolean getHasCanceledSubscription() {
    return this.hasCanceledSubscription;
  }

  /** @param hasCanceledSubscription Indicates if the account has a canceled subscription. */
  public void setHasCanceledSubscription(final Boolean hasCanceledSubscription) {
    this.hasCanceledSubscription = hasCanceledSubscription;
  }

  /** Indicates if the account has a future subscription. */
  public Boolean getHasFutureSubscription() {
    return this.hasFutureSubscription;
  }

  /** @param hasFutureSubscription Indicates if the account has a future subscription. */
  public void setHasFutureSubscription(final Boolean hasFutureSubscription) {
    this.hasFutureSubscription = hasFutureSubscription;
  }

  /**
   * Indicates if the account has a subscription that is either active, canceled, future, or paused.
   */
  public Boolean getHasLiveSubscription() {
    return this.hasLiveSubscription;
  }

  /**
   * @param hasLiveSubscription Indicates if the account has a subscription that is either active,
   *     canceled, future, or paused.
   */
  public void setHasLiveSubscription(final Boolean hasLiveSubscription) {
    this.hasLiveSubscription = hasLiveSubscription;
  }

  /** Indicates if the account has a past due invoice. */
  public Boolean getHasPastDueInvoice() {
    return this.hasPastDueInvoice;
  }

  /** @param hasPastDueInvoice Indicates if the account has a past due invoice. */
  public void setHasPastDueInvoice(final Boolean hasPastDueInvoice) {
    this.hasPastDueInvoice = hasPastDueInvoice;
  }

  /** Indicates if the account has a paused subscription. */
  public Boolean getHasPausedSubscription() {
    return this.hasPausedSubscription;
  }

  /** @param hasPausedSubscription Indicates if the account has a paused subscription. */
  public void setHasPausedSubscription(final Boolean hasPausedSubscription) {
    this.hasPausedSubscription = hasPausedSubscription;
  }

  /**
   * The unique token for automatically logging the account in to the hosted management pages. You
   * may automatically log the user into their hosted management pages by directing the user to:
   * `https://{subdomain}.recurly.com/account/{hosted_login_token}`.
   */
  public String getHostedLoginToken() {
    return this.hostedLoginToken;
  }

  /**
   * @param hostedLoginToken The unique token for automatically logging the account in to the hosted
   *     management pages. You may automatically log the user into their hosted management pages by
   *     directing the user to: `https://{subdomain}.recurly.com/account/{hosted_login_token}`.
   */
  public void setHostedLoginToken(final String hostedLoginToken) {
    this.hostedLoginToken = hostedLoginToken;
  }

  public String getId() {
    return this.id;
  }

  /** @param id */
  public void setId(final String id) {
    this.id = id;
  }

  public String getLastName() {
    return this.lastName;
  }

  /** @param lastName */
  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  /** The UUID of the parent account associated with this account. */
  public String getParentAccountId() {
    return this.parentAccountId;
  }

  /** @param parentAccountId The UUID of the parent account associated with this account. */
  public void setParentAccountId(final String parentAccountId) {
    this.parentAccountId = parentAccountId;
  }

  /**
   * Used to determine the language and locale of emails sent on behalf of the merchant to the
   * customer.
   */
  public String getPreferredLocale() {
    return this.preferredLocale;
  }

  /**
   * @param preferredLocale Used to determine the language and locale of emails sent on behalf of
   *     the merchant to the customer.
   */
  public void setPreferredLocale(final String preferredLocale) {
    this.preferredLocale = preferredLocale;
  }

  /** The shipping addresses on the account. */
  public List<ShippingAddress> getShippingAddresses() {
    return this.shippingAddresses;
  }

  /** @param shippingAddresses The shipping addresses on the account. */
  public void setShippingAddresses(final List<ShippingAddress> shippingAddresses) {
    this.shippingAddresses = shippingAddresses;
  }

  /** Accounts can be either active or inactive. */
  public String getState() {
    return this.state;
  }

  /** @param state Accounts can be either active or inactive. */
  public void setState(final String state) {
    this.state = state;
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

  /** When the account was last changed. */
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt When the account was last changed. */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
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
