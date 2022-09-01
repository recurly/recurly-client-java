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

public class BillingInfoVerifyCVV extends Request {

  /** Unique security code for a credit card. */
  @SerializedName("verification_value")
  @Expose
  private String verificationValue;

  /** Unique security code for a credit card. */
  public String getVerificationValue() {
    return this.verificationValue;
  }

  /** @param verificationValue Unique security code for a credit card. */
  public void setVerificationValue(final String verificationValue) {
    this.verificationValue = verificationValue;
  }
}
