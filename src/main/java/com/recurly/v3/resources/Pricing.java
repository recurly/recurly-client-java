/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import com.recurly.v3.Constants;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

public class Pricing extends Resource {

  
  /**
   * 3-letter ISO 4217 currency code.
   */
  
  @SerializedName("currency")
  @Expose
  private String currency;

  
  /**
   * This field is deprecated. Please do not use it.
   */
  
  @SerializedName("tax_inclusive")
  @Expose
  private Boolean taxInclusive;

  
  /**
   * Unit price
   */
  
  @SerializedName("unit_amount")
  @Expose
  private BigDecimal unitAmount;



  
  /**
   * 3-letter ISO 4217 currency code.
   */
  
  public String getCurrency() { return this.currency; }

  
  /**
   * @param currency 3-letter ISO 4217 currency code.
   */
  
  public void setCurrency(final String currency) { this.currency = currency; }

  
  /**
   * This field is deprecated. Please do not use it.
   */
  
  public Boolean getTaxInclusive() { return this.taxInclusive; }

  
  /**
   * @param taxInclusive This field is deprecated. Please do not use it.
   */
  
  public void setTaxInclusive(final Boolean taxInclusive) { this.taxInclusive = taxInclusive; }

  
  /**
   * Unit price
   */
  
  public BigDecimal getUnitAmount() { return this.unitAmount; }

  
  /**
   * @param unitAmount Unit price
   */
  
  public void setUnitAmount(final BigDecimal unitAmount) { this.unitAmount = unitAmount; }

}
