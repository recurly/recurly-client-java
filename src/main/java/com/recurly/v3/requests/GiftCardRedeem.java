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

public class GiftCardRedeem extends Request {

  /** The account for the recipient of the gift card. */
  @SerializedName("recipient_account")
  @Expose
  private AccountReference recipientAccount;

  /** The account for the recipient of the gift card. */
  public AccountReference getRecipientAccount() {
    return this.recipientAccount;
  }

  /** @param recipientAccount The account for the recipient of the gift card. */
  public void setRecipientAccount(final AccountReference recipientAccount) {
    this.recipientAccount = recipientAccount;
  }
}
