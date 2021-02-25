/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.math.BigDecimal;

public class SubscriptionShipping extends Resource {

  @SerializedName("address")
  @Expose
  private ShippingAddress address;

  /** Subscription's shipping cost */
  @SerializedName("amount")
  @Expose
  private BigDecimal amount;

  @SerializedName("method")
  @Expose
  private ShippingMethodMini method;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  public ShippingAddress getAddress() {
    return this.address;
  }

  /** @param address */
  public void setAddress(final ShippingAddress address) {
    this.address = address;
  }

  /** Subscription's shipping cost */
  public BigDecimal getAmount() {
    return this.amount;
  }

  /** @param amount Subscription's shipping cost */
  public void setAmount(final BigDecimal amount) {
    this.amount = amount;
  }

  public ShippingMethodMini getMethod() {
    return this.method;
  }

  /** @param method */
  public void setMethod(final ShippingMethodMini method) {
    this.method = method;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }
}
