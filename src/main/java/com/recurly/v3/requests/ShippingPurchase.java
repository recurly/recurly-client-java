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
import java.util.List;

public class ShippingPurchase extends Request {

  @SerializedName("address")
  @Expose
  private ShippingAddressCreate address;

  /**
   * Assign a shipping address from the account's existing shipping addresses. If this and `address`
   * are both present, `address` will take precedence.
   */
  @SerializedName("address_id")
  @Expose
  private String addressId;

  /** A list of shipping fees to be created as charges with the purchase. */
  @SerializedName("fees")
  @Expose
  private List<ShippingFeeCreate> fees;

  public ShippingAddressCreate getAddress() {
    return this.address;
  }

  /** @param address */
  public void setAddress(final ShippingAddressCreate address) {
    this.address = address;
  }

  /**
   * Assign a shipping address from the account's existing shipping addresses. If this and `address`
   * are both present, `address` will take precedence.
   */
  public String getAddressId() {
    return this.addressId;
  }

  /**
   * @param addressId Assign a shipping address from the account's existing shipping addresses. If
   *     this and `address` are both present, `address` will take precedence.
   */
  public void setAddressId(final String addressId) {
    this.addressId = addressId;
  }

  /** A list of shipping fees to be created as charges with the purchase. */
  public List<ShippingFeeCreate> getFees() {
    return this.fees;
  }

  /** @param fees A list of shipping fees to be created as charges with the purchase. */
  public void setFees(final List<ShippingFeeCreate> fees) {
    this.fees = fees;
  }
}
