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

  /** Category */
  @SerializedName("category")
  @Expose
  private String category;

  /** Code */
  @SerializedName("code")
  @Expose
  private String code;

  /** Merchant message */
  @SerializedName("merchant_advice")
  @Expose
  private String merchantAdvice;

  /** Customer message */
  @SerializedName("message")
  @Expose
  private String message;

  /** Transaction ID */
  @SerializedName("transaction_id")
  @Expose
  private String transactionId;

  /** Category */
  public String getCategory() {
    return this.category;
  }

  /** @param category Category */
  public void setCategory(final String category) {
    this.category = category;
  }

  /** Code */
  public String getCode() {
    return this.code;
  }

  /** @param code Code */
  public void setCode(final String code) {
    this.code = code;
  }

  /** Merchant message */
  public String getMerchantAdvice() {
    return this.merchantAdvice;
  }

  /** @param merchantAdvice Merchant message */
  public void setMerchantAdvice(final String merchantAdvice) {
    this.merchantAdvice = merchantAdvice;
  }

  /** Customer message */
  public String getMessage() {
    return this.message;
  }

  /** @param message Customer message */
  public void setMessage(final String message) {
    this.message = message;
  }

  /** Transaction ID */
  public String getTransactionId() {
    return this.transactionId;
  }

  /** @param transactionId Transaction ID */
  public void setTransactionId(final String transactionId) {
    this.transactionId = transactionId;
  }
}
