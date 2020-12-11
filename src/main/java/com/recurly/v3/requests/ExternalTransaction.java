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
import org.joda.time.DateTime;

public class ExternalTransaction extends Request {

  /** The total amount of the transcaction. Cannot excceed the invoice total. */
  @SerializedName("amount")
  @Expose
  private Float amount;

  /** Datetime that the external payment was collected. Defaults to current datetime. */
  @SerializedName("collected_at")
  @Expose
  private DateTime collectedAt;

  /** Used as the transaction's description. */
  @SerializedName("description")
  @Expose
  private String description;

  /** Payment method used for external transaction. */
  @SerializedName("payment_method")
  @Expose
  private Constants.ExternalPaymentMethod paymentMethod;

  /** The total amount of the transcaction. Cannot excceed the invoice total. */
  public Float getAmount() {
    return this.amount;
  }

  /** @param amount The total amount of the transcaction. Cannot excceed the invoice total. */
  public void setAmount(final Float amount) {
    this.amount = amount;
  }

  /** Datetime that the external payment was collected. Defaults to current datetime. */
  public DateTime getCollectedAt() {
    return this.collectedAt;
  }

  /**
   * @param collectedAt Datetime that the external payment was collected. Defaults to current
   *     datetime.
   */
  public void setCollectedAt(final DateTime collectedAt) {
    this.collectedAt = collectedAt;
  }

  /** Used as the transaction's description. */
  public String getDescription() {
    return this.description;
  }

  /** @param description Used as the transaction's description. */
  public void setDescription(final String description) {
    this.description = description;
  }

  /** Payment method used for external transaction. */
  public Constants.ExternalPaymentMethod getPaymentMethod() {
    return this.paymentMethod;
  }

  /** @param paymentMethod Payment method used for external transaction. */
  public void setPaymentMethod(final Constants.ExternalPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }
}
