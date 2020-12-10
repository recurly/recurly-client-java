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

public class ExternalRefund extends Request {

  /** Used as the refund transactions' description. */
  @SerializedName("description")
  @Expose
  private String description;

  /** Payment method used for external refund transaction. */
  @SerializedName("payment_method")
  @Expose
  private Constants.ExternalPaymentMethod paymentMethod;

  /** Date the external refund payment was made. Defaults to the current date-time. */
  @SerializedName("refunded_at")
  @Expose
  private DateTime refundedAt;

  /** Used as the refund transactions' description. */
  public String getDescription() {
    return this.description;
  }

  /** @param description Used as the refund transactions' description. */
  public void setDescription(final String description) {
    this.description = description;
  }

  /** Payment method used for external refund transaction. */
  public Constants.ExternalPaymentMethod getPaymentMethod() {
    return this.paymentMethod;
  }

  /** @param paymentMethod Payment method used for external refund transaction. */
  public void setPaymentMethod(final Constants.ExternalPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  /** Date the external refund payment was made. Defaults to the current date-time. */
  public DateTime getRefundedAt() {
    return this.refundedAt;
  }

  /**
   * @param refundedAt Date the external refund payment was made. Defaults to the current date-time.
   */
  public void setRefundedAt(final DateTime refundedAt) {
    this.refundedAt = refundedAt;
  }
}
