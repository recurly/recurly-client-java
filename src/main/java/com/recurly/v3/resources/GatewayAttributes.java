/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class GatewayAttributes extends Resource {

  /**
   * Used by Adyen and Braintree gateways. For Adyen the Shopper Reference value used when the
   * external token was created. For Braintree the PayPal PayerID is populated in the response.
   */
  @SerializedName("account_reference")
  @Expose
  private String accountReference;

  /**
   * Used by Adyen and Braintree gateways. For Adyen the Shopper Reference value used when the
   * external token was created. For Braintree the PayPal PayerID is populated in the response.
   */
  public String getAccountReference() {
    return this.accountReference;
  }

  /**
   * @param accountReference Used by Adyen and Braintree gateways. For Adyen the Shopper Reference
   *     value used when the external token was created. For Braintree the PayPal PayerID is
   *     populated in the response.
   */
  public void setAccountReference(final String accountReference) {
    this.accountReference = accountReference;
  }
}
