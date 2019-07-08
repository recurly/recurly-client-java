package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class Transaction extends Resource {

  @SerializedName("account")
  private AccountMini account;

  @SerializedName("amount")
  private Float amount;

  @SerializedName("avs_check")
  private String avsCheck;

  @SerializedName("billing_address")
  private Address billingAddress;

  @SerializedName("collected_at")
  private DateTime collectedAt;

  @SerializedName("collection_method")
  private String collectionMethod;

  @SerializedName("created_at")
  private DateTime createdAt;

  @SerializedName("currency")
  private String currency;

  @SerializedName("customer_message")
  private String customerMessage;

  @SerializedName("customer_message_locale")
  private String customerMessageLocale;

  @SerializedName("cvv_check")
  private String cvvCheck;

  @SerializedName("gateway_approval_code")
  private String gatewayApprovalCode;

  @SerializedName("gateway_message")
  private String gatewayMessage;

  @SerializedName("gateway_reference")
  private String gatewayReference;

  @SerializedName("gateway_response_code")
  private String gatewayResponseCode;

  @SerializedName("gateway_response_time")
  private Float gatewayResponseTime;

  @SerializedName("gateway_response_values")
  private Map<String, String> gatewayResponseValues;

  @SerializedName("id")
  private String id;

  @SerializedName("invoice")
  private InvoiceMini invoice;

  @SerializedName("ip_address_country")
  private String ipAddressCountry;

  @SerializedName("ip_address_v4")
  private String ipAddressV4;

  @SerializedName("object")
  private String object;

  @SerializedName("origin")
  private String origin;

  @SerializedName("original_transaction_id")
  private String originalTransactionId;

  @SerializedName("payment_gateway")
  private TransactionPaymentGateway paymentGateway;

  @SerializedName("payment_method")
  private TransactionPaymentMethod paymentMethod;

  @SerializedName("refunded")
  private Boolean refunded;

  @SerializedName("status")
  private String status;

  @SerializedName("status_code")
  private String statusCode;

  @SerializedName("status_message")
  private String statusMessage;

  @SerializedName("subscription_ids")
  private List<String> subscriptionIds;

  @SerializedName("success")
  private Boolean success;

  @SerializedName("type")
  private String type;

  @SerializedName("uuid")
  private String uuid;

  @SerializedName("voided_at")
  private DateTime voidedAt;

  @SerializedName("voided_by_invoice")
  private InvoiceMini voidedByInvoice;


  public AccountMini getAccount() { return this.account; }
  public void setAccount(final AccountMini account) { this.account = account; }

  public Float getAmount() { return this.amount; }
  public void setAmount(final Float amount) { this.amount = amount; }

  public String getAvsCheck() { return this.avsCheck; }
  public void setAvsCheck(final String avsCheck) { this.avsCheck = avsCheck; }

  public Address getBillingAddress() { return this.billingAddress; }
  public void setBillingAddress(final Address billingAddress) { this.billingAddress = billingAddress; }

  public DateTime getCollectedAt() { return this.collectedAt; }
  public void setCollectedAt(final DateTime collectedAt) { this.collectedAt = collectedAt; }

  public String getCollectionMethod() { return this.collectionMethod; }
  public void setCollectionMethod(final String collectionMethod) { this.collectionMethod = collectionMethod; }

  public DateTime getCreatedAt() { return this.createdAt; }
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  public String getCurrency() { return this.currency; }
  public void setCurrency(final String currency) { this.currency = currency; }

  public String getCustomerMessage() { return this.customerMessage; }
  public void setCustomerMessage(final String customerMessage) { this.customerMessage = customerMessage; }

  public String getCustomerMessageLocale() { return this.customerMessageLocale; }
  public void setCustomerMessageLocale(final String customerMessageLocale) { this.customerMessageLocale = customerMessageLocale; }

  public String getCvvCheck() { return this.cvvCheck; }
  public void setCvvCheck(final String cvvCheck) { this.cvvCheck = cvvCheck; }

  public String getGatewayApprovalCode() { return this.gatewayApprovalCode; }
  public void setGatewayApprovalCode(final String gatewayApprovalCode) { this.gatewayApprovalCode = gatewayApprovalCode; }

  public String getGatewayMessage() { return this.gatewayMessage; }
  public void setGatewayMessage(final String gatewayMessage) { this.gatewayMessage = gatewayMessage; }

  public String getGatewayReference() { return this.gatewayReference; }
  public void setGatewayReference(final String gatewayReference) { this.gatewayReference = gatewayReference; }

  public String getGatewayResponseCode() { return this.gatewayResponseCode; }
  public void setGatewayResponseCode(final String gatewayResponseCode) { this.gatewayResponseCode = gatewayResponseCode; }

  public Float getGatewayResponseTime() { return this.gatewayResponseTime; }
  public void setGatewayResponseTime(final Float gatewayResponseTime) { this.gatewayResponseTime = gatewayResponseTime; }

  public Map<String, String> getGatewayResponseValues() { return this.gatewayResponseValues; }
  public void setGatewayResponseValues(final Map<String, String> gatewayResponseValues) { this.gatewayResponseValues = gatewayResponseValues; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public InvoiceMini getInvoice() { return this.invoice; }
  public void setInvoice(final InvoiceMini invoice) { this.invoice = invoice; }

  public String getIpAddressCountry() { return this.ipAddressCountry; }
  public void setIpAddressCountry(final String ipAddressCountry) { this.ipAddressCountry = ipAddressCountry; }

  public String getIpAddressV4() { return this.ipAddressV4; }
  public void setIpAddressV4(final String ipAddressV4) { this.ipAddressV4 = ipAddressV4; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public String getOrigin() { return this.origin; }
  public void setOrigin(final String origin) { this.origin = origin; }

  public String getOriginalTransactionId() { return this.originalTransactionId; }
  public void setOriginalTransactionId(final String originalTransactionId) { this.originalTransactionId = originalTransactionId; }

  public TransactionPaymentGateway getPaymentGateway() { return this.paymentGateway; }
  public void setPaymentGateway(final TransactionPaymentGateway paymentGateway) { this.paymentGateway = paymentGateway; }

  public TransactionPaymentMethod getPaymentMethod() { return this.paymentMethod; }
  public void setPaymentMethod(final TransactionPaymentMethod paymentMethod) { this.paymentMethod = paymentMethod; }

  public Boolean getRefunded() { return this.refunded; }
  public void setRefunded(final Boolean refunded) { this.refunded = refunded; }

  public String getStatus() { return this.status; }
  public void setStatus(final String status) { this.status = status; }

  public String getStatusCode() { return this.statusCode; }
  public void setStatusCode(final String statusCode) { this.statusCode = statusCode; }

  public String getStatusMessage() { return this.statusMessage; }
  public void setStatusMessage(final String statusMessage) { this.statusMessage = statusMessage; }

  public List<String> getSubscriptionIds() { return this.subscriptionIds; }
  public void setSubscriptionIds(final List<String> subscriptionIds) { this.subscriptionIds = subscriptionIds; }

  public Boolean getSuccess() { return this.success; }
  public void setSuccess(final Boolean success) { this.success = success; }

  public String getType() { return this.type; }
  public void setType(final String type) { this.type = type; }

  public String getUuid() { return this.uuid; }
  public void setUuid(final String uuid) { this.uuid = uuid; }

  public DateTime getVoidedAt() { return this.voidedAt; }
  public void setVoidedAt(final DateTime voidedAt) { this.voidedAt = voidedAt; }

  public InvoiceMini getVoidedByInvoice() { return this.voidedByInvoice; }
  public void setVoidedByInvoice(final InvoiceMini voidedByInvoice) { this.voidedByInvoice = voidedByInvoice; }

}
