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

public class AccountExternalSubscription extends Request {

  /**
   * The account code of a new or existing account to be used when creating the external
   * subscription.
   */
  @SerializedName("account_code")
  @Expose
  private String accountCode;

  /**
   * The account code of a new or existing account to be used when creating the external
   * subscription.
   */
  public String getAccountCode() {
    return this.accountCode;
  }

  /**
   * @param accountCode The account code of a new or existing account to be used when creating the
   *     external subscription.
   */
  public void setAccountCode(final String accountCode) {
    this.accountCode = accountCode;
  }
}
