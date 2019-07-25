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
import org.joda.time.DateTime;

public class LineItemCreate extends Request {

  @SerializedName("credit_reason_code")
  @Expose
  private String creditReasonCode;

  @SerializedName("currency")
  @Expose
  private String currency;

  @SerializedName("description")
  @Expose
  private String description;

  @SerializedName("end_date")
  @Expose
  private DateTime endDate;

  @SerializedName("product_code")
  @Expose
  private String productCode;

  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  @SerializedName("start_date")
  @Expose
  private DateTime startDate;

  @SerializedName("tax_code")
  @Expose
  private String taxCode;

  @SerializedName("tax_exempt")
  @Expose
  private Boolean taxExempt;

  @SerializedName("type")
  @Expose
  private String type;

  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;

  public String getCreditReasonCode() {
    return this.creditReasonCode;
  }

  public void setCreditReasonCode(final String creditReasonCode) {
    this.creditReasonCode = creditReasonCode;
  }

  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(final String description) {
    this.description = description;
  }

  public DateTime getEndDate() {
    return this.endDate;
  }

  public void setEndDate(final DateTime endDate) {
    this.endDate = endDate;
  }

  public String getProductCode() {
    return this.productCode;
  }

  public void setProductCode(final String productCode) {
    this.productCode = productCode;
  }

  public Integer getQuantity() {
    return this.quantity;
  }

  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  public DateTime getStartDate() {
    return this.startDate;
  }

  public void setStartDate(final DateTime startDate) {
    this.startDate = startDate;
  }

  public String getTaxCode() {
    return this.taxCode;
  }

  public void setTaxCode(final String taxCode) {
    this.taxCode = taxCode;
  }

  public Boolean getTaxExempt() {
    return this.taxExempt;
  }

  public void setTaxExempt(final Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  public String getType() {
    return this.type;
  }

  public void setType(final String type) {
    this.type = type;
  }

  public Float getUnitAmount() {
    return this.unitAmount;
  }

  public void setUnitAmount(final Float unitAmount) {
    this.unitAmount = unitAmount;
  }
}
