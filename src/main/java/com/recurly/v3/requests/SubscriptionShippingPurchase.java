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

public class SubscriptionShippingPurchase extends Request {

  @SerializedName("amount")
  @Expose
  private Float amount;

  @SerializedName("method_code")
  @Expose
  private String methodCode;

  @SerializedName("method_id")
  @Expose
  private String methodId;


  public Float getAmount() { return this.amount; }
  public void setAmount(final Float amount) { this.amount = amount; }

  public String getMethodCode() { return this.methodCode; }
  public void setMethodCode(final String methodCode) { this.methodCode = methodCode; }

  public String getMethodId() { return this.methodId; }
  public void setMethodId(final String methodId) { this.methodId = methodId; }

}
