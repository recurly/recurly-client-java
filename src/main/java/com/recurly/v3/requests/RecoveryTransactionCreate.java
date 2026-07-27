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
import java.time.ZonedDateTime;

public class RecoveryTransactionCreate extends Request {

  /** The date the original payment collection was attempted. */
  @SerializedName("attempted_collection_date")
  @Expose
  private ZonedDateTime attemptedCollectionDate;

  /** The error code returned by the payment gateway for the original payment collection attempt. */
  @SerializedName("gateway_error_code")
  @Expose
  private String gatewayErrorCode;

  /**
   * The advice code returned by the payment gateway for the original payment collection attempt.
   * This field is only applicable for certain gateways.
   */
  @SerializedName("merchant_advice_code")
  @Expose
  private String merchantAdviceCode;

  /** The date the original payment collection was attempted. */
  public ZonedDateTime getAttemptedCollectionDate() {
    return this.attemptedCollectionDate;
  }

  /**
   * @param attemptedCollectionDate The date the original payment collection was attempted.
   */
  public void setAttemptedCollectionDate(final ZonedDateTime attemptedCollectionDate) {
    this.attemptedCollectionDate = attemptedCollectionDate;
  }

  /** The error code returned by the payment gateway for the original payment collection attempt. */
  public String getGatewayErrorCode() {
    return this.gatewayErrorCode;
  }

  /**
   * @param gatewayErrorCode The error code returned by the payment gateway for the original payment
   *     collection attempt.
   */
  public void setGatewayErrorCode(final String gatewayErrorCode) {
    this.gatewayErrorCode = gatewayErrorCode;
  }

  /**
   * The advice code returned by the payment gateway for the original payment collection attempt.
   * This field is only applicable for certain gateways.
   */
  public String getMerchantAdviceCode() {
    return this.merchantAdviceCode;
  }

  /**
   * @param merchantAdviceCode The advice code returned by the payment gateway for the original
   *     payment collection attempt. This field is only applicable for certain gateways.
   */
  public void setMerchantAdviceCode(final String merchantAdviceCode) {
    this.merchantAdviceCode = merchantAdviceCode;
  }
}
