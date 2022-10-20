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

public class AddOnPricing extends Request {

  
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
   * Allows up to 2 decimal places. Required unless `unit_amount_decimal` is provided.
   */
  
  @SerializedName("unit_amount")
  @Expose
  private BigDecimal unitAmount;

  
  /**
   * Allows up to 9 decimal places. Only supported when `add_on_type` = `usage`.
If `unit_amount_decimal` is provided, `unit_amount` cannot be provided.

   */
  
  @SerializedName("unit_amount_decimal")
  @Expose
  private String unitAmountDecimal;


  
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
   * Allows up to 2 decimal places. Required unless `unit_amount_decimal` is provided.
   */
  
  public BigDecimal getUnitAmount() { return this.unitAmount; }

  
  /**
   * @param unitAmount Allows up to 2 decimal places. Required unless `unit_amount_decimal` is provided.
   */
  
  public void setUnitAmount(final BigDecimal unitAmount) { this.unitAmount = unitAmount; }

  
  /**
   * Allows up to 9 decimal places. Only supported when `add_on_type` = `usage`.
If `unit_amount_decimal` is provided, `unit_amount` cannot be provided.

   */
  
  public String getUnitAmountDecimal() { return this.unitAmountDecimal; }

  
  /**
   * @param unitAmountDecimal Allows up to 9 decimal places. Only supported when `add_on_type` = `usage`.
If `unit_amount_decimal` is provided, `unit_amount` cannot be provided.

   */
  
  public void setUnitAmountDecimal(final String unitAmountDecimal) { this.unitAmountDecimal = unitAmountDecimal; }

}
