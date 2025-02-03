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

public class PaymentGatewayReferences extends Resource {

  /** The type of reference token. Required if token is passed in for Stripe Gateway. */
  @SerializedName("reference_type")
  @Expose
  private Constants.PaymentGatewayReferences referenceType;

  /**
   * Reference value used when the external token was created. If Stripe gateway is used, this value
   * will need to be accompanied by its reference_type.
   */
  @SerializedName("token")
  @Expose
  private String token;

  /** The type of reference token. Required if token is passed in for Stripe Gateway. */
  public Constants.PaymentGatewayReferences getReferenceType() {
    return this.referenceType;
  }

  /**
   * @param referenceType The type of reference token. Required if token is passed in for Stripe
   *     Gateway.
   */
  public void setReferenceType(final Constants.PaymentGatewayReferences referenceType) {
    this.referenceType = referenceType;
  }

  /**
   * Reference value used when the external token was created. If Stripe gateway is used, this value
   * will need to be accompanied by its reference_type.
   */
  public String getToken() {
    return this.token;
  }

  /**
   * @param token Reference value used when the external token was created. If Stripe gateway is
   *     used, this value will need to be accompanied by its reference_type.
   */
  public void setToken(final String token) {
    this.token = token;
  }
}
