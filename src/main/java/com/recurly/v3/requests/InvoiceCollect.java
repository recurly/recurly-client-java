/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Constants;
import com.recurly.v3.Request;
import com.recurly.v3.resources.*;

public class InvoiceCollect extends Request {

  /**
   * The `billing_info_id` is the value that represents a specific billing info for an end customer.
   * When `billing_info_id` is used to assign billing info to the subscription, all future billing
   * events for the subscription will bill to the specified billing info. `billing_info_id` can ONLY
   * be used for sites utilizing the Wallet feature.
   */
  @SerializedName("billing_info_id")
  @Expose
  private String billingInfoId;

  /**
   * A token generated by Recurly.js after completing a 3-D Secure device fingerprinting or
   * authentication challenge.
   */
  @SerializedName("three_d_secure_action_result_token_id")
  @Expose
  private String threeDSecureActionResultTokenId;

  /**
   * An optional type designation for the payment gateway transaction created by this request.
   * Supports 'moto' value, which is the acronym for mail order and telephone transactions.
   */
  @SerializedName("transaction_type")
  @Expose
  private Constants.GatewayTransactionType transactionType;

  /**
   * The `billing_info_id` is the value that represents a specific billing info for an end customer.
   * When `billing_info_id` is used to assign billing info to the subscription, all future billing
   * events for the subscription will bill to the specified billing info. `billing_info_id` can ONLY
   * be used for sites utilizing the Wallet feature.
   */
  public String getBillingInfoId() {
    return this.billingInfoId;
  }

  /**
   * @param billingInfoId The `billing_info_id` is the value that represents a specific billing info
   *     for an end customer. When `billing_info_id` is used to assign billing info to the
   *     subscription, all future billing events for the subscription will bill to the specified
   *     billing info. `billing_info_id` can ONLY be used for sites utilizing the Wallet feature.
   */
  public void setBillingInfoId(final String billingInfoId) {
    this.billingInfoId = billingInfoId;
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
   * An optional type designation for the payment gateway transaction created by this request.
   * Supports 'moto' value, which is the acronym for mail order and telephone transactions.
   */
  public Constants.GatewayTransactionType getTransactionType() {
    return this.transactionType;
  }

  /**
   * @param transactionType An optional type designation for the payment gateway transaction created
   *     by this request. Supports 'moto' value, which is the acronym for mail order and telephone
   *     transactions.
   */
  public void setTransactionType(final Constants.GatewayTransactionType transactionType) {
    this.transactionType = transactionType;
  }
}
