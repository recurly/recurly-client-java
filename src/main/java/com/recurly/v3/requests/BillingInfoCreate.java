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

public class BillingInfoCreate extends Request {

  /** The bank account number. (ACH, Bacs only) */
  @SerializedName("account_number")
  @Expose
  private String accountNumber;

  /** The bank account type. (ACH only) */
  @SerializedName("account_type")
  @Expose
  private String accountType;

  @SerializedName("address")
  @Expose
  private Address address;

  /** Amazon billing agreement ID */
  @SerializedName("amazon_billing_agreement_id")
  @Expose
  private String amazonBillingAgreementId;

  /**
   * The `backup_payment_method` field is used to designate a billing info as a backup on the
   * account that will be tried if the initial billing info used for an invoice is declined. All
   * payment methods, including the billing info marked `primary_payment_method` can be set as a
   * backup. An account can have a maximum of 1 backup, if a user sets a different payment method as
   * a backup, the existing backup will no longer be marked as such.
   */
  @SerializedName("backup_payment_method")
  @Expose
  private Boolean backupPaymentMethod;

  /** Company name */
  @SerializedName("company")
  @Expose
  private String company;

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /** *STRONGLY RECOMMENDED* */
  @SerializedName("cvv")
  @Expose
  private String cvv;

  /** First name */
  @SerializedName("first_name")
  @Expose
  private String firstName;

  /** Fraud Session ID */
  @SerializedName("fraud_session_id")
  @Expose
  private String fraudSessionId;

  /** Additional attributes to send to the gateway. */
  @SerializedName("gateway_attributes")
  @Expose
  private GatewayAttributes gatewayAttributes;

  /**
   * An identifier for a specific payment gateway. Must be used in conjunction with `gateway_token`.
   */
  @SerializedName("gateway_code")
  @Expose
  private String gatewayCode;

  /**
   * A token used in place of a credit card in order to perform transactions. Must be used in
   * conjunction with `gateway_code`.
   */
  @SerializedName("gateway_token")
  @Expose
  private String gatewayToken;

  /**
   * The International Bank Account Number, up to 34 alphanumeric characters comprising a country
   * code; two check digits; and a number that includes the domestic bank account number, branch
   * identifier, and potential routing information. (SEPA only)
   */
  @SerializedName("iban")
  @Expose
  private String iban;

  /** *STRONGLY RECOMMENDED* Customer's IP address when updating their billing information. */
  @SerializedName("ip_address")
  @Expose
  private String ipAddress;

  /** Last name */
  @SerializedName("last_name")
  @Expose
  private String lastName;

  /** Expiration month */
  @SerializedName("month")
  @Expose
  private String month;

  /** The name associated with the bank account (ACH, SEPA, Bacs only) */
  @SerializedName("name_on_account")
  @Expose
  private String nameOnAccount;

  /** Credit card number, spaces and dashes are accepted. */
  @SerializedName("number")
  @Expose
  private String number;

  /** PayPal billing agreement ID */
  @SerializedName("paypal_billing_agreement_id")
  @Expose
  private String paypalBillingAgreementId;

  /**
   * The `primary_payment_method` field is used to designate the primary billing info on the
   * account. The first billing info created on an account will always become primary. Adding
   * additional billing infos provides the flexibility to mark another billing info as primary, or
   * adding additional non-primary billing infos. This can be accomplished by passing the
   * `primary_payment_method` with a value of `true`. When adding billing infos via the billing_info
   * and /accounts endpoints, this value is not permitted, and will return an error if provided.
   */
  @SerializedName("primary_payment_method")
  @Expose
  private Boolean primaryPaymentMethod;

  /** The bank's rounting number. (ACH only) */
  @SerializedName("routing_number")
  @Expose
  private String routingNumber;

  /** Bank identifier code for UK based banks. Required for Bacs based billing infos. (Bacs only) */
  @SerializedName("sort_code")
  @Expose
  private String sortCode;

  /**
   * Tax identifier is required if adding a billing info that is a consumer card in Brazil. This
   * would be the customer's CPF, CPF is a Brazilian tax identifier for all tax paying residents.
   */
  @SerializedName("tax_identifier")
  @Expose
  private String taxIdentifier;

  /**
   * this field and a value of 'cpf' are required if adding a billing info that is an elo or
   * hipercard type in Brazil.
   */
  @SerializedName("tax_identifier_type")
  @Expose
  private String taxIdentifierType;

  /**
   * A token generated by Recurly.js after completing a 3-D Secure device fingerprinting or
   * authentication challenge.
   */
  @SerializedName("three_d_secure_action_result_token_id")
  @Expose
  private String threeDSecureActionResultTokenId;

  /**
   * A token [generated by
   * Recurly.js](https://recurly.com/developers/reference/recurly-js/#getting-a-token).
   */
  @SerializedName("token_id")
  @Expose
  private String tokenId;

  /**
   * An optional type designation for the payment gateway transaction created by this request.
   * Supports 'moto' value, which is the acronym for mail order and telephone transactions.
   */
  @SerializedName("transaction_type")
  @Expose
  private String transactionType;

  /**
   * The payment method type for a non-credit card based billing info. `bacs` and `becs` are the
   * only accepted values.
   */
  @SerializedName("type")
  @Expose
  private String type;

  /** VAT number */
  @SerializedName("vat_number")
  @Expose
  private String vatNumber;

  /** Expiration year */
  @SerializedName("year")
  @Expose
  private String year;

  /** The bank account number. (ACH, Bacs only) */
  public String getAccountNumber() {
    return this.accountNumber;
  }

  /** @param accountNumber The bank account number. (ACH, Bacs only) */
  public void setAccountNumber(final String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /** The bank account type. (ACH only) */
  public String getAccountType() {
    return this.accountType;
  }

  /** @param accountType The bank account type. (ACH only) */
  public void setAccountType(final String accountType) {
    this.accountType = accountType;
  }

  public Address getAddress() {
    return this.address;
  }

  /** @param address */
  public void setAddress(final Address address) {
    this.address = address;
  }

  /** Amazon billing agreement ID */
  public String getAmazonBillingAgreementId() {
    return this.amazonBillingAgreementId;
  }

  /** @param amazonBillingAgreementId Amazon billing agreement ID */
  public void setAmazonBillingAgreementId(final String amazonBillingAgreementId) {
    this.amazonBillingAgreementId = amazonBillingAgreementId;
  }

  /**
   * The `backup_payment_method` field is used to designate a billing info as a backup on the
   * account that will be tried if the initial billing info used for an invoice is declined. All
   * payment methods, including the billing info marked `primary_payment_method` can be set as a
   * backup. An account can have a maximum of 1 backup, if a user sets a different payment method as
   * a backup, the existing backup will no longer be marked as such.
   */
  public Boolean getBackupPaymentMethod() {
    return this.backupPaymentMethod;
  }

  /**
   * @param backupPaymentMethod The `backup_payment_method` field is used to designate a billing
   *     info as a backup on the account that will be tried if the initial billing info used for an
   *     invoice is declined. All payment methods, including the billing info marked
   *     `primary_payment_method` can be set as a backup. An account can have a maximum of 1 backup,
   *     if a user sets a different payment method as a backup, the existing backup will no longer
   *     be marked as such.
   */
  public void setBackupPaymentMethod(final Boolean backupPaymentMethod) {
    this.backupPaymentMethod = backupPaymentMethod;
  }

  /** Company name */
  public String getCompany() {
    return this.company;
  }

  /** @param company Company name */
  public void setCompany(final String company) {
    this.company = company;
  }

  /** 3-letter ISO 4217 currency code. */
  public String getCurrency() {
    return this.currency;
  }

  /** @param currency 3-letter ISO 4217 currency code. */
  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  /** *STRONGLY RECOMMENDED* */
  public String getCvv() {
    return this.cvv;
  }

  /** @param cvv *STRONGLY RECOMMENDED* */
  public void setCvv(final String cvv) {
    this.cvv = cvv;
  }

  /** First name */
  public String getFirstName() {
    return this.firstName;
  }

  /** @param firstName First name */
  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  /** Fraud Session ID */
  public String getFraudSessionId() {
    return this.fraudSessionId;
  }

  /** @param fraudSessionId Fraud Session ID */
  public void setFraudSessionId(final String fraudSessionId) {
    this.fraudSessionId = fraudSessionId;
  }

  /** Additional attributes to send to the gateway. */
  public GatewayAttributes getGatewayAttributes() {
    return this.gatewayAttributes;
  }

  /** @param gatewayAttributes Additional attributes to send to the gateway. */
  public void setGatewayAttributes(final GatewayAttributes gatewayAttributes) {
    this.gatewayAttributes = gatewayAttributes;
  }

  /**
   * An identifier for a specific payment gateway. Must be used in conjunction with `gateway_token`.
   */
  public String getGatewayCode() {
    return this.gatewayCode;
  }

  /**
   * @param gatewayCode An identifier for a specific payment gateway. Must be used in conjunction
   *     with `gateway_token`.
   */
  public void setGatewayCode(final String gatewayCode) {
    this.gatewayCode = gatewayCode;
  }

  /**
   * A token used in place of a credit card in order to perform transactions. Must be used in
   * conjunction with `gateway_code`.
   */
  public String getGatewayToken() {
    return this.gatewayToken;
  }

  /**
   * @param gatewayToken A token used in place of a credit card in order to perform transactions.
   *     Must be used in conjunction with `gateway_code`.
   */
  public void setGatewayToken(final String gatewayToken) {
    this.gatewayToken = gatewayToken;
  }

  /**
   * The International Bank Account Number, up to 34 alphanumeric characters comprising a country
   * code; two check digits; and a number that includes the domestic bank account number, branch
   * identifier, and potential routing information. (SEPA only)
   */
  public String getIban() {
    return this.iban;
  }

  /**
   * @param iban The International Bank Account Number, up to 34 alphanumeric characters comprising
   *     a country code; two check digits; and a number that includes the domestic bank account
   *     number, branch identifier, and potential routing information. (SEPA only)
   */
  public void setIban(final String iban) {
    this.iban = iban;
  }

  /** *STRONGLY RECOMMENDED* Customer's IP address when updating their billing information. */
  public String getIpAddress() {
    return this.ipAddress;
  }

  /**
   * @param ipAddress *STRONGLY RECOMMENDED* Customer's IP address when updating their billing
   *     information.
   */
  public void setIpAddress(final String ipAddress) {
    this.ipAddress = ipAddress;
  }

  /** Last name */
  public String getLastName() {
    return this.lastName;
  }

  /** @param lastName Last name */
  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  /** Expiration month */
  public String getMonth() {
    return this.month;
  }

  /** @param month Expiration month */
  public void setMonth(final String month) {
    this.month = month;
  }

  /** The name associated with the bank account (ACH, SEPA, Bacs only) */
  public String getNameOnAccount() {
    return this.nameOnAccount;
  }

  /** @param nameOnAccount The name associated with the bank account (ACH, SEPA, Bacs only) */
  public void setNameOnAccount(final String nameOnAccount) {
    this.nameOnAccount = nameOnAccount;
  }

  /** Credit card number, spaces and dashes are accepted. */
  public String getNumber() {
    return this.number;
  }

  /** @param number Credit card number, spaces and dashes are accepted. */
  public void setNumber(final String number) {
    this.number = number;
  }

  /** PayPal billing agreement ID */
  public String getPaypalBillingAgreementId() {
    return this.paypalBillingAgreementId;
  }

  /** @param paypalBillingAgreementId PayPal billing agreement ID */
  public void setPaypalBillingAgreementId(final String paypalBillingAgreementId) {
    this.paypalBillingAgreementId = paypalBillingAgreementId;
  }

  /**
   * The `primary_payment_method` field is used to designate the primary billing info on the
   * account. The first billing info created on an account will always become primary. Adding
   * additional billing infos provides the flexibility to mark another billing info as primary, or
   * adding additional non-primary billing infos. This can be accomplished by passing the
   * `primary_payment_method` with a value of `true`. When adding billing infos via the billing_info
   * and /accounts endpoints, this value is not permitted, and will return an error if provided.
   */
  public Boolean getPrimaryPaymentMethod() {
    return this.primaryPaymentMethod;
  }

  /**
   * @param primaryPaymentMethod The `primary_payment_method` field is used to designate the primary
   *     billing info on the account. The first billing info created on an account will always
   *     become primary. Adding additional billing infos provides the flexibility to mark another
   *     billing info as primary, or adding additional non-primary billing infos. This can be
   *     accomplished by passing the `primary_payment_method` with a value of `true`. When adding
   *     billing infos via the billing_info and /accounts endpoints, this value is not permitted,
   *     and will return an error if provided.
   */
  public void setPrimaryPaymentMethod(final Boolean primaryPaymentMethod) {
    this.primaryPaymentMethod = primaryPaymentMethod;
  }

  /** The bank's rounting number. (ACH only) */
  public String getRoutingNumber() {
    return this.routingNumber;
  }

  /** @param routingNumber The bank's rounting number. (ACH only) */
  public void setRoutingNumber(final String routingNumber) {
    this.routingNumber = routingNumber;
  }

  /** Bank identifier code for UK based banks. Required for Bacs based billing infos. (Bacs only) */
  public String getSortCode() {
    return this.sortCode;
  }

  /**
   * @param sortCode Bank identifier code for UK based banks. Required for Bacs based billing infos.
   *     (Bacs only)
   */
  public void setSortCode(final String sortCode) {
    this.sortCode = sortCode;
  }

  /**
   * Tax identifier is required if adding a billing info that is a consumer card in Brazil. This
   * would be the customer's CPF, CPF is a Brazilian tax identifier for all tax paying residents.
   */
  public String getTaxIdentifier() {
    return this.taxIdentifier;
  }

  /**
   * @param taxIdentifier Tax identifier is required if adding a billing info that is a consumer
   *     card in Brazil. This would be the customer's CPF, CPF is a Brazilian tax identifier for all
   *     tax paying residents.
   */
  public void setTaxIdentifier(final String taxIdentifier) {
    this.taxIdentifier = taxIdentifier;
  }

  /**
   * this field and a value of 'cpf' are required if adding a billing info that is an elo or
   * hipercard type in Brazil.
   */
  public String getTaxIdentifierType() {
    return this.taxIdentifierType;
  }

  /**
   * @param taxIdentifierType this field and a value of 'cpf' are required if adding a billing info
   *     that is an elo or hipercard type in Brazil.
   */
  public void setTaxIdentifierType(final String taxIdentifierType) {
    this.taxIdentifierType = taxIdentifierType;
  }

  /**
   * A token generated by Recurly.js after completing a 3-D Secure device fingerprinting or
   * authentication challenge.
   */
  public String getThreeDSecureActionResultTokenId() {
    return this.threeDSecureActionResultTokenId;
  }

  /**
   * @param threeDSecureActionResultTokenId A token generated by Recurly.js after completing a 3-D
   *     Secure device fingerprinting or authentication challenge.
   */
  public void setThreeDSecureActionResultTokenId(final String threeDSecureActionResultTokenId) {
    this.threeDSecureActionResultTokenId = threeDSecureActionResultTokenId;
  }

  /**
   * A token [generated by
   * Recurly.js](https://recurly.com/developers/reference/recurly-js/#getting-a-token).
   */
  public String getTokenId() {
    return this.tokenId;
  }

  /**
   * @param tokenId A token [generated by
   *     Recurly.js](https://recurly.com/developers/reference/recurly-js/#getting-a-token).
   */
  public void setTokenId(final String tokenId) {
    this.tokenId = tokenId;
  }

  /**
   * An optional type designation for the payment gateway transaction created by this request.
   * Supports 'moto' value, which is the acronym for mail order and telephone transactions.
   */
  public String getTransactionType() {
    return this.transactionType;
  }

  /**
   * @param transactionType An optional type designation for the payment gateway transaction created
   *     by this request. Supports 'moto' value, which is the acronym for mail order and telephone
   *     transactions.
   */
  public void setTransactionType(final String transactionType) {
    this.transactionType = transactionType;
  }

  /**
   * The payment method type for a non-credit card based billing info. `bacs` and `becs` are the
   * only accepted values.
   */
  public String getType() {
    return this.type;
  }

  /**
   * @param type The payment method type for a non-credit card based billing info. `bacs` and `becs`
   *     are the only accepted values.
   */
  public void setType(final String type) {
    this.type = type;
  }

  /** VAT number */
  public String getVatNumber() {
    return this.vatNumber;
  }

  /** @param vatNumber VAT number */
  public void setVatNumber(final String vatNumber) {
    this.vatNumber = vatNumber;
  }

  /** Expiration year */
  public String getYear() {
    return this.year;
  }

  /** @param year Expiration year */
  public void setYear(final String year) {
    this.year = year;
  }
}
