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

public class SubscriptionShippingPurchase extends Request {

  /**
   * Assigns the subscription's shipping cost. If this is greater than zero then a `method_id` or
   * `method_code` is required.
   */
  @SerializedName("amount")
  @Expose
  private Float amount;

  /**
   * The code of the shipping method used to deliver the subscription. If `method_id` and
   * `method_code` are both present, `method_id` will be used.
   */
  @SerializedName("method_code")
  @Expose
  private String methodCode;

  /**
   * The id of the shipping method used to deliver the subscription. If `method_id` and
   * `method_code` are both present, `method_id` will be used.
   */
  @SerializedName("method_id")
  @Expose
  private String methodId;

  /**
   * Assigns the subscription's shipping cost. If this is greater than zero then a `method_id` or
   * `method_code` is required.
   */
  public Float getAmount() {
    return this.amount;
  }

  /**
   * @param amount Assigns the subscription's shipping cost. If this is greater than zero then a
   *     `method_id` or `method_code` is required.
   */
  public void setAmount(final Float amount) {
    this.amount = amount;
  }

  /**
   * The code of the shipping method used to deliver the subscription. If `method_id` and
   * `method_code` are both present, `method_id` will be used.
   */
  public String getMethodCode() {
    return this.methodCode;
  }

  /**
   * @param methodCode The code of the shipping method used to deliver the subscription. If
   *     `method_id` and `method_code` are both present, `method_id` will be used.
   */
  public void setMethodCode(final String methodCode) {
    this.methodCode = methodCode;
  }

  /**
   * The id of the shipping method used to deliver the subscription. If `method_id` and
   * `method_code` are both present, `method_id` will be used.
   */
  public String getMethodId() {
    return this.methodId;
  }

  /**
   * @param methodId The id of the shipping method used to deliver the subscription. If `method_id`
   *     and `method_code` are both present, `method_id` will be used.
   */
  public void setMethodId(final String methodId) {
    this.methodId = methodId;
  }
}
