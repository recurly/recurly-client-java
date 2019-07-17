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

public class SubscriptionAddOnCreate extends Request {

  @SerializedName("code")
  @Expose
  private String code;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;


  public String getCode() { return this.code; }
  public void setCode(final String code) { this.code = code; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public Integer getQuantity() { return this.quantity; }
  public void setQuantity(final Integer quantity) { this.quantity = quantity; }

  public Float getUnitAmount() { return this.unitAmount; }
  public void setUnitAmount(final Float unitAmount) { this.unitAmount = unitAmount; }

}
