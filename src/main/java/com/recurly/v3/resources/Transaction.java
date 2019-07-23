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
import java.util.Map;
import org.joda.time.DateTime;

public class Transaction extends Resource {

  @SerializedName("account")
  @Expose
  private AccountMini account;

  @SerializedName("amount")
  @Expose
  private Float amount;

  @SerializedName("avs_check")
  @Expose
  private String avsCheck;

  @SerializedName("billing_address")
  @Expose
  private Address billingAddress;

  @SerializedName("collected_at")
  @Expose
  private DateTime collectedAt;

  @SerializedName("collection_method")
  @Expose
  private String collectionMethod;

  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  @SerializedName("currency")
  @Expose
  private String currency;

  @SerializedName("customer_message")
  @Expose
  private String customerMessage;

  @SerializedName("customer_message_locale")
  @Expose
  private String customerMessageLocale;

  @SerializedName("cvv_check")
  @Expose
  private String cvvCheck;

  @SerializedName("gateway_approval_code")
  @Expose
  private String gatewayApprovalCode;

  @SerializedName("gateway_message")
  @Expose
  private String gatewayMessage;

  @SerializedName("gateway_reference")
  @Expose
  private String gatewayReference;

  @SerializedName("gateway_response_code")
  @Expose
  private String gatewayResponseCode;

  @SerializedName("gateway_response_time")
  @Expose
  private Float gatewayResponseTime;

  @SerializedName("gateway_response_values")
  @Expose
  private Map<String, String> gatewayResponseValues;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("invoice")
  @Expose
  private InvoiceMini invoice;

  @SerializedName("ip_address_country")
  @Expose
  private String ipAddressCountry;

  @SerializedName("ip_address_v4")
  @Expose
  private String ipAddressV4;

  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("origin")
  @Expose
  private String origin;

  @SerializedName("original_transaction_id")
  @Expose
  private String originalTransactionId;

  @SerializedName("payment_gateway")
  @Expose
  private TransactionPaymentGateway paymentGateway;

  @SerializedName("payment_method")
  @Expose
  private TransactionPaymentMethod paymentMethod;

  @SerializedName("refunded")
  @Expose
  private Boolean refunded;

  @SerializedName("status")
  @Expose
  private String status;

  @SerializedName("status_code")
  @Expose
  private String statusCode;

  @SerializedName("status_message")
  @Expose
  private String statusMessage;

  @SerializedName("subscription_ids")
  @Expose
  private List<String> subscriptionIds;

  @SerializedName("success")
  @Expose
  private Boolean success;

  @SerializedName("type")
  @Expose
  private String type;

  @SerializedName("uuid")
  @Expose
  private String uuid;

  @SerializedName("voided_at")
  @Expose
  private DateTime voidedAt;

  @SerializedName("voided_by_invoice")
  @Expose
  private InvoiceMini voidedByInvoice;

  public AccountMini getAccount() {
    return this.account;
  }

  public void setAccount(final AccountMini account) {
    this.account = account;
  }

  public Float getAmount() {
    return this.amount;
  }

  public void setAmount(final Float amount) {
    this.amount = amount;
  }

  public String getAvsCheck() {
    return this.avsCheck;
  }

  public void setAvsCheck(final String avsCheck) {
    this.avsCheck = avsCheck;
  }

  public Address getBillingAddress() {
    return this.billingAddress;
  }

  public void setBillingAddress(final Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  public DateTime getCollectedAt() {
    return this.collectedAt;
  }

  public void setCollectedAt(final DateTime collectedAt) {
    this.collectedAt = collectedAt;
  }

  public String getCollectionMethod() {
    return this.collectionMethod;
  }

  public void setCollectionMethod(final String collectionMethod) {
    this.collectionMethod = collectionMethod;
  }

  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  public String getCustomerMessage() {
    return this.customerMessage;
  }

  public void setCustomerMessage(final String customerMessage) {
    this.customerMessage = customerMessage;
  }

  public String getCustomerMessageLocale() {
    return this.customerMessageLocale;
  }

  public void setCustomerMessageLocale(final String customerMessageLocale) {
    this.customerMessageLocale = customerMessageLocale;
  }

  public String getCvvCheck() {
    return this.cvvCheck;
  }

  public void setCvvCheck(final String cvvCheck) {
    this.cvvCheck = cvvCheck;
  }

  public String getGatewayApprovalCode() {
    return this.gatewayApprovalCode;
  }

  public void setGatewayApprovalCode(final String gatewayApprovalCode) {
    this.gatewayApprovalCode = gatewayApprovalCode;
  }

  public String getGatewayMessage() {
    return this.gatewayMessage;
  }

  public void setGatewayMessage(final String gatewayMessage) {
    this.gatewayMessage = gatewayMessage;
  }

  public String getGatewayReference() {
    return this.gatewayReference;
  }

  public void setGatewayReference(final String gatewayReference) {
    this.gatewayReference = gatewayReference;
  }

  public String getGatewayResponseCode() {
    return this.gatewayResponseCode;
  }

  public void setGatewayResponseCode(final String gatewayResponseCode) {
    this.gatewayResponseCode = gatewayResponseCode;
  }

  public Float getGatewayResponseTime() {
    return this.gatewayResponseTime;
  }

  public void setGatewayResponseTime(final Float gatewayResponseTime) {
    this.gatewayResponseTime = gatewayResponseTime;
  }

  public Map<String, String> getGatewayResponseValues() {
    return this.gatewayResponseValues;
  }

  public void setGatewayResponseValues(final Map<String, String> gatewayResponseValues) {
    this.gatewayResponseValues = gatewayResponseValues;
  }

  public String getId() {
    return this.id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public InvoiceMini getInvoice() {
    return this.invoice;
  }

  public void setInvoice(final InvoiceMini invoice) {
    this.invoice = invoice;
  }

  public String getIpAddressCountry() {
    return this.ipAddressCountry;
  }

  public void setIpAddressCountry(final String ipAddressCountry) {
    this.ipAddressCountry = ipAddressCountry;
  }

  public String getIpAddressV4() {
    return this.ipAddressV4;
  }

  public void setIpAddressV4(final String ipAddressV4) {
    this.ipAddressV4 = ipAddressV4;
  }

  public String getObject() {
    return this.object;
  }

  public void setObject(final String object) {
    this.object = object;
  }

  public String getOrigin() {
    return this.origin;
  }

  public void setOrigin(final String origin) {
    this.origin = origin;
  }

  public String getOriginalTransactionId() {
    return this.originalTransactionId;
  }

  public void setOriginalTransactionId(final String originalTransactionId) {
    this.originalTransactionId = originalTransactionId;
  }

  public TransactionPaymentGateway getPaymentGateway() {
    return this.paymentGateway;
  }

  public void setPaymentGateway(final TransactionPaymentGateway paymentGateway) {
    this.paymentGateway = paymentGateway;
  }

  public TransactionPaymentMethod getPaymentMethod() {
    return this.paymentMethod;
  }

  public void setPaymentMethod(final TransactionPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public Boolean getRefunded() {
    return this.refunded;
  }

  public void setRefunded(final Boolean refunded) {
    this.refunded = refunded;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(final String status) {
    this.status = status;
  }

  public String getStatusCode() {
    return this.statusCode;
  }

  public void setStatusCode(final String statusCode) {
    this.statusCode = statusCode;
  }

  public String getStatusMessage() {
    return this.statusMessage;
  }

  public void setStatusMessage(final String statusMessage) {
    this.statusMessage = statusMessage;
  }

  public List<String> getSubscriptionIds() {
    return this.subscriptionIds;
  }

  public void setSubscriptionIds(final List<String> subscriptionIds) {
    this.subscriptionIds = subscriptionIds;
  }

  public Boolean getSuccess() {
    return this.success;
  }

  public void setSuccess(final Boolean success) {
    this.success = success;
  }

  public String getType() {
    return this.type;
  }

  public void setType(final String type) {
    this.type = type;
  }

  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(final String uuid) {
    this.uuid = uuid;
  }

  public DateTime getVoidedAt() {
    return this.voidedAt;
  }

  public void setVoidedAt(final DateTime voidedAt) {
    this.voidedAt = voidedAt;
  }

  public InvoiceMini getVoidedByInvoice() {
    return this.voidedByInvoice;
  }

  public void setVoidedByInvoice(final InvoiceMini voidedByInvoice) {
    this.voidedByInvoice = voidedByInvoice;
  }
}
