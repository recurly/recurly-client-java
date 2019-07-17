/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class ExternalRefund extends Request {

  @SerializedName("description")
  @Expose
  private String description;

  @SerializedName("payment_method")
  @Expose
  private String paymentMethod;

  @SerializedName("refunded_at")
  @Expose
  private DateTime refundedAt;


  public String getDescription() { return this.description; }
  public void setDescription(final String description) { this.description = description; }

  public String getPaymentMethod() { return this.paymentMethod; }
  public void setPaymentMethod(final String paymentMethod) { this.paymentMethod = paymentMethod; }

  public DateTime getRefundedAt() { return this.refundedAt; }
  public void setRefundedAt(final DateTime refundedAt) { this.refundedAt = refundedAt; }

}
