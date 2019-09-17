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

public class SubscriptionShippingUpdate extends Request {

  @SerializedName("address")
  @Expose
  private ShippingAddressCreate address;

  /** Assign a shipping address from the account's existing shipping addresses. */
  @SerializedName("address_id")
  @Expose
  private String addressId;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  public ShippingAddressCreate getAddress() {
    return this.address;
  }

  /** @param address */
  public void setAddress(final ShippingAddressCreate address) {
    this.address = address;
  }

  /** Assign a shipping address from the account's existing shipping addresses. */
  public String getAddressId() {
    return this.addressId;
  }

  /** @param addressId Assign a shipping address from the account's existing shipping addresses. */
  public void setAddressId(final String addressId) {
    this.addressId = addressId;
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
