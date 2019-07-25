/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class TransactionError extends Resource {

  @SerializedName("category")
  @Expose
  private String category;

  @SerializedName("code")
  @Expose
  private String code;

  @SerializedName("merchant_advice")
  @Expose
  private String merchantAdvice;

  @SerializedName("message")
  @Expose
  private String message;

  @SerializedName("transaction_id")
  @Expose
  private String transactionId;

  public String getCategory() {
    return this.category;
  }

  public void setCategory(final String category) {
    this.category = category;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(final String code) {
    this.code = code;
  }

  public String getMerchantAdvice() {
    return this.merchantAdvice;
  }

  public void setMerchantAdvice(final String merchantAdvice) {
    this.merchantAdvice = merchantAdvice;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(final String message) {
    this.message = message;
  }

  public String getTransactionId() {
    return this.transactionId;
  }

  public void setTransactionId(final String transactionId) {
    this.transactionId = transactionId;
  }
}
