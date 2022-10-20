/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import com.recurly.v3.Constants;
import com.recurly.v3.resources.*;
import org.joda.time.DateTime;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class LineItemRefund extends Request {

  
  /**
   * Line item ID
   */
  
  @SerializedName("id")
  @Expose
  private String id;

  
  /**
   * Set to `true` if the line item should be prorated; set to `false` if not.
This can only be used on line items that have a start and end date.

   */
  
  @SerializedName("prorate")
  @Expose
  private Boolean prorate;

  
  /**
   * Line item quantity to be refunded.
   */
  
  @SerializedName("quantity")
  @Expose
  private Integer quantity;


  
  /**
   * Line item ID
   */
  
  public String getId() { return this.id; }

  
  /**
   * @param id Line item ID
   */
  
  public void setId(final String id) { this.id = id; }

  
  /**
   * Set to `true` if the line item should be prorated; set to `false` if not.
This can only be used on line items that have a start and end date.

   */
  
  public Boolean getProrate() { return this.prorate; }

  
  /**
   * @param prorate Set to `true` if the line item should be prorated; set to `false` if not.
This can only be used on line items that have a start and end date.

   */
  
  public void setProrate(final Boolean prorate) { this.prorate = prorate; }

  
  /**
   * Line item quantity to be refunded.
   */
  
  public Integer getQuantity() { return this.quantity; }

  
  /**
   * @param quantity Line item quantity to be refunded.
   */
  
  public void setQuantity(final Integer quantity) { this.quantity = quantity; }

}
