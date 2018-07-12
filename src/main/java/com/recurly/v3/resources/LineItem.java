package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class LineItem extends Resource {

  @SerializedName("account")
  private Account account;

  @SerializedName("accounting_code")
  private String accountingCode;

  @SerializedName("add_on_code")
  private String addOnCode;

  @SerializedName("add_on_id")
  private String addOnId;

  @SerializedName("amount")
  private Float amount;

  @SerializedName("created_at")
  private DateTime createdAt;

  @SerializedName("credit_applied")
  private Float creditApplied;

  @SerializedName("credit_reason_code")
  private String creditReasonCode;

  @SerializedName("currency")
  private String currency;

  @SerializedName("description")
  private String description;

  @SerializedName("discount")
  private Float discount;

  @SerializedName("end_date")
  private DateTime endDate;

  @SerializedName("id")
  private String id;

  @SerializedName("invoice_id")
  private String invoiceId;

  @SerializedName("invoice_number")
  private String invoiceNumber;

  @SerializedName("legacy_category")
  private String legacyCategory;

  @SerializedName("object")
  private String object;

  @SerializedName("origin")
  private String origin;

  @SerializedName("original_line_item_invoice_id")
  private String originalLineItemInvoiceId;

  @SerializedName("plan_code")
  private String planCode;

  @SerializedName("plan_id")
  private String planId;

  @SerializedName("previous_line_item_id")
  private String previousLineItemId;

  @SerializedName("product_code")
  private String productCode;

  @SerializedName("proration_rate")
  private Float prorationRate;

  @SerializedName("quantity")
  private Integer quantity;

  @SerializedName("refund")
  private Boolean refund;

  @SerializedName("refunded_quantity")
  private Integer refundedQuantity;

  @SerializedName("start_date")
  private DateTime startDate;

  @SerializedName("state")
  private String state;

  @SerializedName("subscription_id")
  private String subscriptionId;

  @SerializedName("subtotal")
  private Float subtotal;

  @SerializedName("tax")
  private Float tax;

  @SerializedName("tax_code")
  private String taxCode;

  @SerializedName("tax_exempt")
  private Boolean taxExempt;

  @SerializedName("tax_info")
  private TaxInfo taxInfo;

  @SerializedName("taxable")
  private Boolean taxable;

  @SerializedName("type")
  private String type;

  @SerializedName("unit_amount")
  private Float unitAmount;

  @SerializedName("updated_at")
  private DateTime updatedAt;

  @SerializedName("uuid")
  private String uuid;


  public Account getAccount() { return this.account; }
  public void setAccount(final Account account) { this.account = account; }

  public String getAccountingCode() { return this.accountingCode; }
  public void setAccountingCode(final String accountingCode) { this.accountingCode = accountingCode; }

  public String getAddOnCode() { return this.addOnCode; }
  public void setAddOnCode(final String addOnCode) { this.addOnCode = addOnCode; }

  public String getAddOnId() { return this.addOnId; }
  public void setAddOnId(final String addOnId) { this.addOnId = addOnId; }

  public Float getAmount() { return this.amount; }
  public void setAmount(final Float amount) { this.amount = amount; }

  public DateTime getCreatedAt() { return this.createdAt; }
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  public Float getCreditApplied() { return this.creditApplied; }
  public void setCreditApplied(final Float creditApplied) { this.creditApplied = creditApplied; }

  public String getCreditReasonCode() { return this.creditReasonCode; }
  public void setCreditReasonCode(final String creditReasonCode) { this.creditReasonCode = creditReasonCode; }

  public String getCurrency() { return this.currency; }
  public void setCurrency(final String currency) { this.currency = currency; }

  public String getDescription() { return this.description; }
  public void setDescription(final String description) { this.description = description; }

  public Float getDiscount() { return this.discount; }
  public void setDiscount(final Float discount) { this.discount = discount; }

  public DateTime getEndDate() { return this.endDate; }
  public void setEndDate(final DateTime endDate) { this.endDate = endDate; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getInvoiceId() { return this.invoiceId; }
  public void setInvoiceId(final String invoiceId) { this.invoiceId = invoiceId; }

  public String getInvoiceNumber() { return this.invoiceNumber; }
  public void setInvoiceNumber(final String invoiceNumber) { this.invoiceNumber = invoiceNumber; }

  public String getLegacyCategory() { return this.legacyCategory; }
  public void setLegacyCategory(final String legacyCategory) { this.legacyCategory = legacyCategory; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public String getOrigin() { return this.origin; }
  public void setOrigin(final String origin) { this.origin = origin; }

  public String getOriginalLineItemInvoiceId() { return this.originalLineItemInvoiceId; }
  public void setOriginalLineItemInvoiceId(final String originalLineItemInvoiceId) { this.originalLineItemInvoiceId = originalLineItemInvoiceId; }

  public String getPlanCode() { return this.planCode; }
  public void setPlanCode(final String planCode) { this.planCode = planCode; }

  public String getPlanId() { return this.planId; }
  public void setPlanId(final String planId) { this.planId = planId; }

  public String getPreviousLineItemId() { return this.previousLineItemId; }
  public void setPreviousLineItemId(final String previousLineItemId) { this.previousLineItemId = previousLineItemId; }

  public String getProductCode() { return this.productCode; }
  public void setProductCode(final String productCode) { this.productCode = productCode; }

  public Float getProrationRate() { return this.prorationRate; }
  public void setProrationRate(final Float prorationRate) { this.prorationRate = prorationRate; }

  public Integer getQuantity() { return this.quantity; }
  public void setQuantity(final Integer quantity) { this.quantity = quantity; }

  public Boolean getRefund() { return this.refund; }
  public void setRefund(final Boolean refund) { this.refund = refund; }

  public Integer getRefundedQuantity() { return this.refundedQuantity; }
  public void setRefundedQuantity(final Integer refundedQuantity) { this.refundedQuantity = refundedQuantity; }

  public DateTime getStartDate() { return this.startDate; }
  public void setStartDate(final DateTime startDate) { this.startDate = startDate; }

  public String getState() { return this.state; }
  public void setState(final String state) { this.state = state; }

  public String getSubscriptionId() { return this.subscriptionId; }
  public void setSubscriptionId(final String subscriptionId) { this.subscriptionId = subscriptionId; }

  public Float getSubtotal() { return this.subtotal; }
  public void setSubtotal(final Float subtotal) { this.subtotal = subtotal; }

  public Float getTax() { return this.tax; }
  public void setTax(final Float tax) { this.tax = tax; }

  public String getTaxCode() { return this.taxCode; }
  public void setTaxCode(final String taxCode) { this.taxCode = taxCode; }

  public Boolean getTaxExempt() { return this.taxExempt; }
  public void setTaxExempt(final Boolean taxExempt) { this.taxExempt = taxExempt; }

  public TaxInfo getTaxInfo() { return this.taxInfo; }
  public void setTaxInfo(final TaxInfo taxInfo) { this.taxInfo = taxInfo; }

  public Boolean getTaxable() { return this.taxable; }
  public void setTaxable(final Boolean taxable) { this.taxable = taxable; }

  public String getType() { return this.type; }
  public void setType(final String type) { this.type = type; }

  public Float getUnitAmount() { return this.unitAmount; }
  public void setUnitAmount(final Float unitAmount) { this.unitAmount = unitAmount; }

  public DateTime getUpdatedAt() { return this.updatedAt; }
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

  public String getUuid() { return this.uuid; }
  public void setUuid(final String uuid) { this.uuid = uuid; }

}
