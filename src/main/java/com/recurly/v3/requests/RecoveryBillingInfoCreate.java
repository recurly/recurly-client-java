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
import java.util.List;

public class RecoveryBillingInfoCreate extends Request {

  @SerializedName("address")
  @Expose
  private RecoveryAddress address;

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

  /** First name */
  @SerializedName("first_name")
  @Expose
  private String firstName;

  /** An identifier for a specific payment gateway. */
  @SerializedName("gateway_code")
  @Expose
  private String gatewayCode;

  /** *STRONGLY RECOMMENDED* Customer's IP address when updating their billing information. */
  @SerializedName("ip_address")
  @Expose
  private String ipAddress;

  /** Last name */
  @SerializedName("last_name")
  @Expose
  private String lastName;

  /**
   * Network transaction ID from the previous customer-in-session subscription signup or billing
   * info storage.
   *
   * <p>- 10-15 alphanumeric characters for Mastercard - 14-15 alphanumeric for Visa - 15 digits for
   * all other brands - 16 alphanumeric characters for Cartes Bancaires, which are processed as Visa
   * or Mastercard
   */
  @SerializedName("network_transaction_id")
  @Expose
  private String networkTransactionId;

  /**
   * Array of Payment Gateway References, each a reference to a third-party gateway object of
   * varying types.
   */
  @SerializedName("payment_gateway_references")
  @Expose
  private List<PaymentGatewayReferences> paymentGatewayReferences;

  /**
   * The `primary_payment_method` field is used to designate the primary billing info on the
   * account. An account can have a maximum of 1 primary. If a user sets a different payment method
   * as a primary, then the existing primary will no longer be marked as such.
   */
  @SerializedName("primary_payment_method")
  @Expose
  private Boolean primaryPaymentMethod;

  /** Transactions from previous collection attempts for this payment method. */
  @SerializedName("transactions")
  @Expose
  private List<RecoveryTransactionCreate> transactions;

  public RecoveryAddress getAddress() {
    return this.address;
  }

  /**
   * @param address
   */
  public void setAddress(final RecoveryAddress address) {
    this.address = address;
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

  /**
   * @param company Company name
   */
  public void setCompany(final String company) {
    this.company = company;
  }

  /** First name */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * @param firstName First name
   */
  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  /** An identifier for a specific payment gateway. */
  public String getGatewayCode() {
    return this.gatewayCode;
  }

  /**
   * @param gatewayCode An identifier for a specific payment gateway.
   */
  public void setGatewayCode(final String gatewayCode) {
    this.gatewayCode = gatewayCode;
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

  /**
   * @param lastName Last name
   */
  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  /**
   * Network transaction ID from the previous customer-in-session subscription signup or billing
   * info storage.
   *
   * <p>- 10-15 alphanumeric characters for Mastercard - 14-15 alphanumeric for Visa - 15 digits for
   * all other brands - 16 alphanumeric characters for Cartes Bancaires, which are processed as Visa
   * or Mastercard
   */
  public String getNetworkTransactionId() {
    return this.networkTransactionId;
  }

  /**
   * @param networkTransactionId Network transaction ID from the previous customer-in-session
   *     subscription signup or billing info storage.
   *     <p>- 10-15 alphanumeric characters for Mastercard - 14-15 alphanumeric for Visa - 15 digits
   *     for all other brands - 16 alphanumeric characters for Cartes Bancaires, which are processed
   *     as Visa or Mastercard
   */
  public void setNetworkTransactionId(final String networkTransactionId) {
    this.networkTransactionId = networkTransactionId;
  }

  /**
   * Array of Payment Gateway References, each a reference to a third-party gateway object of
   * varying types.
   */
  public List<PaymentGatewayReferences> getPaymentGatewayReferences() {
    return this.paymentGatewayReferences;
  }

  /**
   * @param paymentGatewayReferences Array of Payment Gateway References, each a reference to a
   *     third-party gateway object of varying types.
   */
  public void setPaymentGatewayReferences(
      final List<PaymentGatewayReferences> paymentGatewayReferences) {
    this.paymentGatewayReferences = paymentGatewayReferences;
  }

  /**
   * The `primary_payment_method` field is used to designate the primary billing info on the
   * account. An account can have a maximum of 1 primary. If a user sets a different payment method
   * as a primary, then the existing primary will no longer be marked as such.
   */
  public Boolean getPrimaryPaymentMethod() {
    return this.primaryPaymentMethod;
  }

  /**
   * @param primaryPaymentMethod The `primary_payment_method` field is used to designate the primary
   *     billing info on the account. An account can have a maximum of 1 primary. If a user sets a
   *     different payment method as a primary, then the existing primary will no longer be marked
   *     as such.
   */
  public void setPrimaryPaymentMethod(final Boolean primaryPaymentMethod) {
    this.primaryPaymentMethod = primaryPaymentMethod;
  }

  /** Transactions from previous collection attempts for this payment method. */
  public List<RecoveryTransactionCreate> getTransactions() {
    return this.transactions;
  }

  /**
   * @param transactions Transactions from previous collection attempts for this payment method.
   */
  public void setTransactions(final List<RecoveryTransactionCreate> transactions) {
    this.transactions = transactions;
  }
}
