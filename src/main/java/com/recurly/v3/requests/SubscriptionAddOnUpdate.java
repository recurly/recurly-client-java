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

public class SubscriptionAddOnUpdate extends Request {

  /** Add-on code */
  @SerializedName("code")
  @Expose
  private String code;

  /** Set this to include or modify an existing subscription add-on. */
  @SerializedName("id")
  @Expose
  private String id;

  /** Quantity */
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /** Optionally, override the add-on's default unit amount. */
  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;

  /** Add-on code */
  public String getCode() {
    return this.code;
  }

  /** @param code Add-on code */
  public void setCode(final String code) {
    this.code = code;
  }

  /** Set this to include or modify an existing subscription add-on. */
  public String getId() {
    return this.id;
  }

  /** @param id Set this to include or modify an existing subscription add-on. */
  public void setId(final String id) {
    this.id = id;
  }

  /** Quantity */
  public Integer getQuantity() {
    return this.quantity;
  }

  /** @param quantity Quantity */
  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  /** Optionally, override the add-on's default unit amount. */
  public Float getUnitAmount() {
    return this.unitAmount;
  }

  /** @param unitAmount Optionally, override the add-on's default unit amount. */
  public void setUnitAmount(final Float unitAmount) {
    this.unitAmount = unitAmount;
  }
}
