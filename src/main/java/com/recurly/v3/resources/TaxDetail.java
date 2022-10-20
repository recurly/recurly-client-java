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

public class TaxDetail extends Resource {

  
  /**
   * Provides the tax rate for the region.
   */
  
  @SerializedName("rate")
  @Expose
  private BigDecimal rate;

  
  /**
   * Provides the tax region applied on an invoice. For Canadian Sales Tax, this will be either the 2 letter province code or country code.
   */
  
  @SerializedName("region")
  @Expose
  private String region;

  
  /**
   * The total tax applied for this tax type.
   */
  
  @SerializedName("tax")
  @Expose
  private BigDecimal tax;

  
  /**
   * Provides the tax type for the region. For Canadian Sales Tax, this will be GST, HST, QST or PST.
   */
  
  @SerializedName("type")
  @Expose
  private String type;



  
  /**
   * Provides the tax rate for the region.
   */
  
  public BigDecimal getRate() { return this.rate; }

  
  /**
   * @param rate Provides the tax rate for the region.
   */
  
  public void setRate(final BigDecimal rate) { this.rate = rate; }

  
  /**
   * Provides the tax region applied on an invoice. For Canadian Sales Tax, this will be either the 2 letter province code or country code.
   */
  
  public String getRegion() { return this.region; }

  
  /**
   * @param region Provides the tax region applied on an invoice. For Canadian Sales Tax, this will be either the 2 letter province code or country code.
   */
  
  public void setRegion(final String region) { this.region = region; }

  
  /**
   * The total tax applied for this tax type.
   */
  
  public BigDecimal getTax() { return this.tax; }

  
  /**
   * @param tax The total tax applied for this tax type.
   */
  
  public void setTax(final BigDecimal tax) { this.tax = tax; }

  
  /**
   * Provides the tax type for the region. For Canadian Sales Tax, this will be GST, HST, QST or PST.
   */
  
  public String getType() { return this.type; }

  
  /**
   * @param type Provides the tax type for the region. For Canadian Sales Tax, this will be GST, HST, QST or PST.
   */
  
  public void setType(final String type) { this.type = type; }

}
