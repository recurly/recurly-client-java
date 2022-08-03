/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Constants;
import com.recurly.v3.Resource;

public class PaymentMethod extends Resource {

  /** The bank account type. Only present for ACH payment methods. */
  @SerializedName("account_type")
  @Expose
  private Constants.AccountType accountType;

  /** Billing Agreement identifier. Only present for Amazon or Paypal payment methods. */
  @SerializedName("billing_agreement_id")
  @Expose
  private String billingAgreementId;

  /** Visa, MasterCard, American Express, Discover, JCB, etc. */
  @SerializedName("card_type")
  @Expose
  private Constants.CardType cardType;

  /**
   * The 2-letter ISO 3166-1 alpha-2 country code associated with the credit card BIN, if known by
   * Recurly. Available on the BillingInfo object only. Available when the BIN country lookup
   * feature is enabled.
   */
  @SerializedName("cc_bin_country")
  @Expose
  private String ccBinCountry;

  /** Expiration month. */
  @SerializedName("exp_month")
  @Expose
  private Integer expMonth;

  /** Expiration year. */
  @SerializedName("exp_year")
  @Expose
  private Integer expYear;

  /** Credit card number's first six digits. */
  @SerializedName("first_six")
  @Expose
  private String firstSix;

  /** An identifier for a specific payment gateway. */
  @SerializedName("gateway_code")
  @Expose
  private String gatewayCode;

  /** A token used in place of a credit card in order to perform transactions. */
  @SerializedName("gateway_token")
  @Expose
  private String gatewayToken;

  /** Credit card number's last four digits. Will refer to bank account if payment method is ACH. */
  @SerializedName("last_four")
  @Expose
  private String lastFour;

  /** The IBAN bank account's last two digits. */
  @SerializedName("last_two")
  @Expose
  private String lastTwo;

  /** The name associated with the bank account. */
  @SerializedName("name_on_account")
  @Expose
  private String nameOnAccount;

  @SerializedName("object")
  @Expose
  private Constants.PaymentMethod object;

  /** The bank account's routing number. Only present for ACH payment methods. */
  @SerializedName("routing_number")
  @Expose
  private String routingNumber;

  /** The bank name of this routing number. */
  @SerializedName("routing_number_bank")
  @Expose
  private String routingNumberBank;

  /** Username of the associated payment method. Currently only associated with Venmo. */
  @SerializedName("username")
  @Expose
  private String username;

  /** The bank account type. Only present for ACH payment methods. */
  public Constants.AccountType getAccountType() {
    return this.accountType;
  }

  /** @param accountType The bank account type. Only present for ACH payment methods. */
  public void setAccountType(final Constants.AccountType accountType) {
    this.accountType = accountType;
  }

  /** Billing Agreement identifier. Only present for Amazon or Paypal payment methods. */
  public String getBillingAgreementId() {
    return this.billingAgreementId;
  }

  /**
   * @param billingAgreementId Billing Agreement identifier. Only present for Amazon or Paypal
   *     payment methods.
   */
  public void setBillingAgreementId(final String billingAgreementId) {
    this.billingAgreementId = billingAgreementId;
  }

  /** Visa, MasterCard, American Express, Discover, JCB, etc. */
  public Constants.CardType getCardType() {
    return this.cardType;
  }

  /** @param cardType Visa, MasterCard, American Express, Discover, JCB, etc. */
  public void setCardType(final Constants.CardType cardType) {
    this.cardType = cardType;
  }

  /**
   * The 2-letter ISO 3166-1 alpha-2 country code associated with the credit card BIN, if known by
   * Recurly. Available on the BillingInfo object only. Available when the BIN country lookup
   * feature is enabled.
   */
  public String getCcBinCountry() {
    return this.ccBinCountry;
  }

  /**
   * @param ccBinCountry The 2-letter ISO 3166-1 alpha-2 country code associated with the credit
   *     card BIN, if known by Recurly. Available on the BillingInfo object only. Available when the
   *     BIN country lookup feature is enabled.
   */
  public void setCcBinCountry(final String ccBinCountry) {
    this.ccBinCountry = ccBinCountry;
  }

  /** Expiration month. */
  public Integer getExpMonth() {
    return this.expMonth;
  }

  /** @param expMonth Expiration month. */
  public void setExpMonth(final Integer expMonth) {
    this.expMonth = expMonth;
  }

  /** Expiration year. */
  public Integer getExpYear() {
    return this.expYear;
  }

  /** @param expYear Expiration year. */
  public void setExpYear(final Integer expYear) {
    this.expYear = expYear;
  }

  /** Credit card number's first six digits. */
  public String getFirstSix() {
    return this.firstSix;
  }

  /** @param firstSix Credit card number's first six digits. */
  public void setFirstSix(final String firstSix) {
    this.firstSix = firstSix;
  }

  /** An identifier for a specific payment gateway. */
  public String getGatewayCode() {
    return this.gatewayCode;
  }

  /** @param gatewayCode An identifier for a specific payment gateway. */
  public void setGatewayCode(final String gatewayCode) {
    this.gatewayCode = gatewayCode;
  }

  /** A token used in place of a credit card in order to perform transactions. */
  public String getGatewayToken() {
    return this.gatewayToken;
  }

  /**
   * @param gatewayToken A token used in place of a credit card in order to perform transactions.
   */
  public void setGatewayToken(final String gatewayToken) {
    this.gatewayToken = gatewayToken;
  }

  /** Credit card number's last four digits. Will refer to bank account if payment method is ACH. */
  public String getLastFour() {
    return this.lastFour;
  }

  /**
   * @param lastFour Credit card number's last four digits. Will refer to bank account if payment
   *     method is ACH.
   */
  public void setLastFour(final String lastFour) {
    this.lastFour = lastFour;
  }

  /** The IBAN bank account's last two digits. */
  public String getLastTwo() {
    return this.lastTwo;
  }

  /** @param lastTwo The IBAN bank account's last two digits. */
  public void setLastTwo(final String lastTwo) {
    this.lastTwo = lastTwo;
  }

  /** The name associated with the bank account. */
  public String getNameOnAccount() {
    return this.nameOnAccount;
  }

  /** @param nameOnAccount The name associated with the bank account. */
  public void setNameOnAccount(final String nameOnAccount) {
    this.nameOnAccount = nameOnAccount;
  }

  public Constants.PaymentMethod getObject() {
    return this.object;
  }

  /** @param object */
  public void setObject(final Constants.PaymentMethod object) {
    this.object = object;
  }

  /** The bank account's routing number. Only present for ACH payment methods. */
  public String getRoutingNumber() {
    return this.routingNumber;
  }

  /**
   * @param routingNumber The bank account's routing number. Only present for ACH payment methods.
   */
  public void setRoutingNumber(final String routingNumber) {
    this.routingNumber = routingNumber;
  }

  /** The bank name of this routing number. */
  public String getRoutingNumberBank() {
    return this.routingNumberBank;
  }

  /** @param routingNumberBank The bank name of this routing number. */
  public void setRoutingNumberBank(final String routingNumberBank) {
    this.routingNumberBank = routingNumberBank;
  }

  /** Username of the associated payment method. Currently only associated with Venmo. */
  public String getUsername() {
    return this.username;
  }

  /**
   * @param username Username of the associated payment method. Currently only associated with
   *     Venmo.
   */
  public void setUsername(final String username) {
    this.username = username;
  }
}
