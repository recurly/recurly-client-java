package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class ExternalRefund extends Request {

  @SerializedName("description")
  private String description;

  @SerializedName("payment_method")
  private String paymentMethod;

  @SerializedName("refunded_at")
  private DateTime refundedAt;


  public String getDescription() { return this.description; }
  public void setDescription(final String description) { this.description = description; }

  public String getPaymentMethod() { return this.paymentMethod; }
  public void setPaymentMethod(final String paymentMethod) { this.paymentMethod = paymentMethod; }

  public DateTime getRefundedAt() { return this.refundedAt; }
  public void setRefundedAt(final DateTime refundedAt) { this.refundedAt = refundedAt; }

}
