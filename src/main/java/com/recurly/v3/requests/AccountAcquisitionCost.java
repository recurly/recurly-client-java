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

public class AccountAcquisitionCost extends Request {

  /** The amount of the corresponding currency used to acquire the account. */
  @SerializedName("amount")
  @Expose
  private Float amount;

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /** The amount of the corresponding currency used to acquire the account. */
  public Float getAmount() {
    return this.amount;
  }

  /** @param amount The amount of the corresponding currency used to acquire the account. */
  public void setAmount(final Float amount) {
    this.amount = amount;
  }

  /** 3-letter ISO 4217 currency code. */
  public String getCurrency() {
    return this.currency;
  }

  /** @param currency 3-letter ISO 4217 currency code. */
  public void setCurrency(final String currency) {
    this.currency = currency;
  }
}
