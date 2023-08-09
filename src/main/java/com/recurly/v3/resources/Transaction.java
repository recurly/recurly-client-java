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
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

public class Transaction extends Resource {

  /** Account mini details */
  @SerializedName("account")
  @Expose
  private AccountMini account;

  /**
   * Action result params to be used in Recurly-JS to complete a payment when using asynchronous
   * payment methods, e.g., Boleto, iDEAL and Sofort.
   */
  @SerializedName("action_result")
  @Expose
  private Map actionResult;

  /** Total transaction amount sent to the payment gateway. */
  @SerializedName("amount")
  @Expose
  private BigDecimal amount;

  /** When processed, result from checking the overall AVS on the transaction. */
  @SerializedName("avs_check")
  @Expose
  private Constants.AvsCheck avsCheck;

  /** Indicates if the transaction was completed using a backup payment */
  @SerializedName("backup_payment_method_used")
  @Expose
  private Boolean backupPaymentMethodUsed;

  @SerializedName("billing_address")
  @Expose
  private AddressWithName billingAddress;

  /** Collected at, or if not collected yet, the time the transaction was created. */
  @SerializedName("collected_at")
  @Expose
  private DateTime collectedAt;

  /** The method by which the payment was collected. */
  @SerializedName("collection_method")
  @Expose
  private Constants.CollectionMethod collectionMethod;

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /** For declined (`success=false`) transactions, the message displayed to the customer. */
  @SerializedName("customer_message")
  @Expose
  private String customerMessage;

  /** Language code for the message */
  @SerializedName("customer_message_locale")
  @Expose
  private String customerMessageLocale;

  /** When processed, result from checking the CVV/CVC value on the transaction. */
  @SerializedName("cvv_check")
  @Expose
  private Constants.CvvCheck cvvCheck;

  /** Transaction approval code from the payment gateway. */
  @SerializedName("gateway_approval_code")
  @Expose
  private String gatewayApprovalCode;

  /** Transaction message from the payment gateway. */
  @SerializedName("gateway_message")
  @Expose
  private String gatewayMessage;

  /** Transaction reference number from the payment gateway. */
  @SerializedName("gateway_reference")
  @Expose
  private String gatewayReference;

  /** For declined transactions (`success=false`), this field lists the gateway error code. */
  @SerializedName("gateway_response_code")
  @Expose
  private String gatewayResponseCode;

  /** Time, in seconds, for gateway to process the transaction. */
  @SerializedName("gateway_response_time")
  @Expose
  private BigDecimal gatewayResponseTime;

  /** The values in this field will vary from gateway to gateway. */
  @SerializedName("gateway_response_values")
  @Expose
  private Map gatewayResponseValues;

  /** Transaction ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** Invoice mini details */
  @SerializedName("invoice")
  @Expose
  private InvoiceMini invoice;

  /** Origin IP address country, 2-letter ISO 3166-1 alpha-2 code, if known by Recurly. */
  @SerializedName("ip_address_country")
  @Expose
  private String ipAddressCountry;

  /**
   * IP address provided when the billing information was collected:
   *
   * <p>- When the customer enters billing information into the Recurly.js or Hosted Payment Pages,
   * Recurly records the IP address. - When the merchant enters billing information using the API,
   * the merchant may provide an IP address. - When the merchant enters billing information using
   * the UI, no IP address is recorded.
   */
  @SerializedName("ip_address_v4")
  @Expose
  private String ipAddressV4;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** Describes how the transaction was triggered. */
  @SerializedName("origin")
  @Expose
  private Constants.TransactionOrigin origin;

  /**
   * If this transaction is a refund (`type=refund`), this will be the ID of the original
   * transaction on the invoice being refunded.
   */
  @SerializedName("original_transaction_id")
  @Expose
  private String originalTransactionId;

  @SerializedName("payment_gateway")
  @Expose
  private TransactionPaymentGateway paymentGateway;

  @SerializedName("payment_method")
  @Expose
  private PaymentMethod paymentMethod;

  /** Indicates if part or all of this transaction was refunded. */
  @SerializedName("refunded")
  @Expose
  private Boolean refunded;

  /**
   * The current transaction status. Note that the status may change, e.g. a `pending` transaction
   * may become `declined` or `success` may later become `void`.
   */
  @SerializedName("status")
  @Expose
  private Constants.TransactionStatus status;

  /** Status code */
  @SerializedName("status_code")
  @Expose
  private String statusCode;

  /** For declined (`success=false`) transactions, the message displayed to the merchant. */
  @SerializedName("status_message")
  @Expose
  private String statusMessage;

  /**
   * If the transaction is charging or refunding for one or more subscriptions, these are their IDs.
   */
  @SerializedName("subscription_ids")
  @Expose
  private List<String> subscriptionIds;

  /** Did this transaction complete successfully? */
  @SerializedName("success")
  @Expose
  private Boolean success;

  /**
   * - `authorization` – verifies billing information and places a hold on money in the customer's
   * account. - `capture` – captures funds held by an authorization and completes a purchase. -
   * `purchase` – combines the authorization and capture in one transaction. - `refund` – returns
   * all or a portion of the money collected in a previous transaction to the customer. - `verify` –
   * a $0 or $1 transaction used to verify billing information which is immediately voided.
   */
  @SerializedName("type")
  @Expose
  private Constants.TransactionType type;

  /** Updated at */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /**
   * The UUID is useful for matching data with the CSV exports and building URLs into Recurly's UI.
   */
  @SerializedName("uuid")
  @Expose
  private String uuid;

  /** Voided at */
  @SerializedName("voided_at")
  @Expose
  private DateTime voidedAt;

  /** Invoice mini details */
  @SerializedName("voided_by_invoice")
  @Expose
  private InvoiceMini voidedByInvoice;

  /** Account mini details */
  public AccountMini getAccount() {
    return this.account;
  }

  /** @param account Account mini details */
  public void setAccount(final AccountMini account) {
    this.account = account;
  }

  /**
   * Action result params to be used in Recurly-JS to complete a payment when using asynchronous
   * payment methods, e.g., Boleto, iDEAL and Sofort.
   */
  public Map getActionResult() {
    return this.actionResult;
  }

  /**
   * @param actionResult Action result params to be used in Recurly-JS to complete a payment when
   *     using asynchronous payment methods, e.g., Boleto, iDEAL and Sofort.
   */
  public void setActionResult(final Map actionResult) {
    this.actionResult = actionResult;
  }

  /** Total transaction amount sent to the payment gateway. */
  public BigDecimal getAmount() {
    return this.amount;
  }

  /** @param amount Total transaction amount sent to the payment gateway. */
  public void setAmount(final BigDecimal amount) {
    this.amount = amount;
  }

  /** When processed, result from checking the overall AVS on the transaction. */
  public Constants.AvsCheck getAvsCheck() {
    return this.avsCheck;
  }

  /** @param avsCheck When processed, result from checking the overall AVS on the transaction. */
  public void setAvsCheck(final Constants.AvsCheck avsCheck) {
    this.avsCheck = avsCheck;
  }

  /** Indicates if the transaction was completed using a backup payment */
  public Boolean getBackupPaymentMethodUsed() {
    return this.backupPaymentMethodUsed;
  }

  /**
   * @param backupPaymentMethodUsed Indicates if the transaction was completed using a backup
   *     payment
   */
  public void setBackupPaymentMethodUsed(final Boolean backupPaymentMethodUsed) {
    this.backupPaymentMethodUsed = backupPaymentMethodUsed;
  }

  public AddressWithName getBillingAddress() {
    return this.billingAddress;
  }

  /** @param billingAddress */
  public void setBillingAddress(final AddressWithName billingAddress) {
    this.billingAddress = billingAddress;
  }

  /** Collected at, or if not collected yet, the time the transaction was created. */
  public DateTime getCollectedAt() {
    return this.collectedAt;
  }

  /**
   * @param collectedAt Collected at, or if not collected yet, the time the transaction was created.
   */
  public void setCollectedAt(final DateTime collectedAt) {
    this.collectedAt = collectedAt;
  }

  /** The method by which the payment was collected. */
  public Constants.CollectionMethod getCollectionMethod() {
    return this.collectionMethod;
  }

  /** @param collectionMethod The method by which the payment was collected. */
  public void setCollectionMethod(final Constants.CollectionMethod collectionMethod) {
    this.collectionMethod = collectionMethod;
  }

  /** Created at */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt Created at */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** 3-letter ISO 4217 currency code. */
  public String getCurrency() {
    return this.currency;
  }

  /** @param currency 3-letter ISO 4217 currency code. */
  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  /** For declined (`success=false`) transactions, the message displayed to the customer. */
  public String getCustomerMessage() {
    return this.customerMessage;
  }

  /**
   * @param customerMessage For declined (`success=false`) transactions, the message displayed to
   *     the customer.
   */
  public void setCustomerMessage(final String customerMessage) {
    this.customerMessage = customerMessage;
  }

  /** Language code for the message */
  public String getCustomerMessageLocale() {
    return this.customerMessageLocale;
  }

  /** @param customerMessageLocale Language code for the message */
  public void setCustomerMessageLocale(final String customerMessageLocale) {
    this.customerMessageLocale = customerMessageLocale;
  }

  /** When processed, result from checking the CVV/CVC value on the transaction. */
  public Constants.CvvCheck getCvvCheck() {
    return this.cvvCheck;
  }

  /** @param cvvCheck When processed, result from checking the CVV/CVC value on the transaction. */
  public void setCvvCheck(final Constants.CvvCheck cvvCheck) {
    this.cvvCheck = cvvCheck;
  }

  /** Transaction approval code from the payment gateway. */
  public String getGatewayApprovalCode() {
    return this.gatewayApprovalCode;
  }

  /** @param gatewayApprovalCode Transaction approval code from the payment gateway. */
  public void setGatewayApprovalCode(final String gatewayApprovalCode) {
    this.gatewayApprovalCode = gatewayApprovalCode;
  }

  /** Transaction message from the payment gateway. */
  public String getGatewayMessage() {
    return this.gatewayMessage;
  }

  /** @param gatewayMessage Transaction message from the payment gateway. */
  public void setGatewayMessage(final String gatewayMessage) {
    this.gatewayMessage = gatewayMessage;
  }

  /** Transaction reference number from the payment gateway. */
  public String getGatewayReference() {
    return this.gatewayReference;
  }

  /** @param gatewayReference Transaction reference number from the payment gateway. */
  public void setGatewayReference(final String gatewayReference) {
    this.gatewayReference = gatewayReference;
  }

  /** For declined transactions (`success=false`), this field lists the gateway error code. */
  public String getGatewayResponseCode() {
    return this.gatewayResponseCode;
  }

  /**
   * @param gatewayResponseCode For declined transactions (`success=false`), this field lists the
   *     gateway error code.
   */
  public void setGatewayResponseCode(final String gatewayResponseCode) {
    this.gatewayResponseCode = gatewayResponseCode;
  }

  /** Time, in seconds, for gateway to process the transaction. */
  public BigDecimal getGatewayResponseTime() {
    return this.gatewayResponseTime;
  }

  /** @param gatewayResponseTime Time, in seconds, for gateway to process the transaction. */
  public void setGatewayResponseTime(final BigDecimal gatewayResponseTime) {
    this.gatewayResponseTime = gatewayResponseTime;
  }

  /** The values in this field will vary from gateway to gateway. */
  public Map getGatewayResponseValues() {
    return this.gatewayResponseValues;
  }

  /** @param gatewayResponseValues The values in this field will vary from gateway to gateway. */
  public void setGatewayResponseValues(final Map gatewayResponseValues) {
    this.gatewayResponseValues = gatewayResponseValues;
  }

  /** Transaction ID */
  public String getId() {
    return this.id;
  }

  /** @param id Transaction ID */
  public void setId(final String id) {
    this.id = id;
  }

  /** Invoice mini details */
  public InvoiceMini getInvoice() {
    return this.invoice;
  }

  /** @param invoice Invoice mini details */
  public void setInvoice(final InvoiceMini invoice) {
    this.invoice = invoice;
  }

  /** Origin IP address country, 2-letter ISO 3166-1 alpha-2 code, if known by Recurly. */
  public String getIpAddressCountry() {
    return this.ipAddressCountry;
  }

  /**
   * @param ipAddressCountry Origin IP address country, 2-letter ISO 3166-1 alpha-2 code, if known
   *     by Recurly.
   */
  public void setIpAddressCountry(final String ipAddressCountry) {
    this.ipAddressCountry = ipAddressCountry;
  }

  /**
   * IP address provided when the billing information was collected:
   *
   * <p>- When the customer enters billing information into the Recurly.js or Hosted Payment Pages,
   * Recurly records the IP address. - When the merchant enters billing information using the API,
   * the merchant may provide an IP address. - When the merchant enters billing information using
   * the UI, no IP address is recorded.
   */
  public String getIpAddressV4() {
    return this.ipAddressV4;
  }

  /**
   * @param ipAddressV4 IP address provided when the billing information was collected:
   *     <p>- When the customer enters billing information into the Recurly.js or Hosted Payment
   *     Pages, Recurly records the IP address. - When the merchant enters billing information using
   *     the API, the merchant may provide an IP address. - When the merchant enters billing
   *     information using the UI, no IP address is recorded.
   */
  public void setIpAddressV4(final String ipAddressV4) {
    this.ipAddressV4 = ipAddressV4;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  /** Describes how the transaction was triggered. */
  public Constants.TransactionOrigin getOrigin() {
    return this.origin;
  }

  /** @param origin Describes how the transaction was triggered. */
  public void setOrigin(final Constants.TransactionOrigin origin) {
    this.origin = origin;
  }

  /**
   * If this transaction is a refund (`type=refund`), this will be the ID of the original
   * transaction on the invoice being refunded.
   */
  public String getOriginalTransactionId() {
    return this.originalTransactionId;
  }

  /**
   * @param originalTransactionId If this transaction is a refund (`type=refund`), this will be the
   *     ID of the original transaction on the invoice being refunded.
   */
  public void setOriginalTransactionId(final String originalTransactionId) {
    this.originalTransactionId = originalTransactionId;
  }

  public TransactionPaymentGateway getPaymentGateway() {
    return this.paymentGateway;
  }

  /** @param paymentGateway */
  public void setPaymentGateway(final TransactionPaymentGateway paymentGateway) {
    this.paymentGateway = paymentGateway;
  }

  public PaymentMethod getPaymentMethod() {
    return this.paymentMethod;
  }

  /** @param paymentMethod */
  public void setPaymentMethod(final PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  /** Indicates if part or all of this transaction was refunded. */
  public Boolean getRefunded() {
    return this.refunded;
  }

  /** @param refunded Indicates if part or all of this transaction was refunded. */
  public void setRefunded(final Boolean refunded) {
    this.refunded = refunded;
  }

  /**
   * The current transaction status. Note that the status may change, e.g. a `pending` transaction
   * may become `declined` or `success` may later become `void`.
   */
  public Constants.TransactionStatus getStatus() {
    return this.status;
  }

  /**
   * @param status The current transaction status. Note that the status may change, e.g. a `pending`
   *     transaction may become `declined` or `success` may later become `void`.
   */
  public void setStatus(final Constants.TransactionStatus status) {
    this.status = status;
  }

  /** Status code */
  public String getStatusCode() {
    return this.statusCode;
  }

  /** @param statusCode Status code */
  public void setStatusCode(final String statusCode) {
    this.statusCode = statusCode;
  }

  /** For declined (`success=false`) transactions, the message displayed to the merchant. */
  public String getStatusMessage() {
    return this.statusMessage;
  }

  /**
   * @param statusMessage For declined (`success=false`) transactions, the message displayed to the
   *     merchant.
   */
  public void setStatusMessage(final String statusMessage) {
    this.statusMessage = statusMessage;
  }

  /**
   * If the transaction is charging or refunding for one or more subscriptions, these are their IDs.
   */
  public List<String> getSubscriptionIds() {
    return this.subscriptionIds;
  }

  /**
   * @param subscriptionIds If the transaction is charging or refunding for one or more
   *     subscriptions, these are their IDs.
   */
  public void setSubscriptionIds(final List<String> subscriptionIds) {
    this.subscriptionIds = subscriptionIds;
  }

  /** Did this transaction complete successfully? */
  public Boolean getSuccess() {
    return this.success;
  }

  /** @param success Did this transaction complete successfully? */
  public void setSuccess(final Boolean success) {
    this.success = success;
  }

  /**
   * - `authorization` – verifies billing information and places a hold on money in the customer's
   * account. - `capture` – captures funds held by an authorization and completes a purchase. -
   * `purchase` – combines the authorization and capture in one transaction. - `refund` – returns
   * all or a portion of the money collected in a previous transaction to the customer. - `verify` –
   * a $0 or $1 transaction used to verify billing information which is immediately voided.
   */
  public Constants.TransactionType getType() {
    return this.type;
  }

  /**
   * @param type - `authorization` – verifies billing information and places a hold on money in the
   *     customer's account. - `capture` – captures funds held by an authorization and completes a
   *     purchase. - `purchase` – combines the authorization and capture in one transaction. -
   *     `refund` – returns all or a portion of the money collected in a previous transaction to the
   *     customer. - `verify` – a $0 or $1 transaction used to verify billing information which is
   *     immediately voided.
   */
  public void setType(final Constants.TransactionType type) {
    this.type = type;
  }

  /** Updated at */
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt Updated at */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The UUID is useful for matching data with the CSV exports and building URLs into Recurly's UI.
   */
  public String getUuid() {
    return this.uuid;
  }

  /**
   * @param uuid The UUID is useful for matching data with the CSV exports and building URLs into
   *     Recurly's UI.
   */
  public void setUuid(final String uuid) {
    this.uuid = uuid;
  }

  /** Voided at */
  public DateTime getVoidedAt() {
    return this.voidedAt;
  }

  /** @param voidedAt Voided at */
  public void setVoidedAt(final DateTime voidedAt) {
    this.voidedAt = voidedAt;
  }

  /** Invoice mini details */
  public InvoiceMini getVoidedByInvoice() {
    return this.voidedByInvoice;
  }

  /** @param voidedByInvoice Invoice mini details */
  public void setVoidedByInvoice(final InvoiceMini voidedByInvoice) {
    this.voidedByInvoice = voidedByInvoice;
  }
}
