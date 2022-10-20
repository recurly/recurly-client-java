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

public class TaxInfo extends Resource {

  
  /**
   * Rate
   */
  
  @SerializedName("rate")
  @Expose
  private BigDecimal rate;

  
  /**
   * Provides the tax region applied on an invoice. For U.S. Sales Tax, this will be the 2 letter state code. For EU VAT this will be the 2 letter country code. For all country level tax types, this will display the regional tax, like VAT, GST, or PST.
   */
  
  @SerializedName("region")
  @Expose
  private String region;

  
  /**
   * Provides additional tax details for Canadian Sales Tax when there is tax applied at both the country and province levels. This will only be populated for the Invoice response when fetching a single invoice and not for the InvoiceList or LineItem.
   */
  
  @SerializedName("tax_details")
  @Expose
  private List<TaxDetail> taxDetails;

  
  /**
   * Provides the tax type as "vat" for EU VAT, "usst" for U.S. Sales Tax, or the 2 letter country code for country level tax types like Canada, Australia, New Zealand, Israel, and all non-EU European countries.
   */
  
  @SerializedName("type")
  @Expose
  private String type;



  
  /**
   * Rate
   */
  
  public BigDecimal getRate() { return this.rate; }

  
  /**
   * @param rate Rate
   */
  
  public void setRate(final BigDecimal rate) { this.rate = rate; }

  
  /**
   * Provides the tax region applied on an invoice. For U.S. Sales Tax, this will be the 2 letter state code. For EU VAT this will be the 2 letter country code. For all country level tax types, this will display the regional tax, like VAT, GST, or PST.
   */
  
  public String getRegion() { return this.region; }

  
  /**
   * @param region Provides the tax region applied on an invoice. For U.S. Sales Tax, this will be the 2 letter state code. For EU VAT this will be the 2 letter country code. For all country level tax types, this will display the regional tax, like VAT, GST, or PST.
   */
  
  public void setRegion(final String region) { this.region = region; }

  
  /**
   * Provides additional tax details for Canadian Sales Tax when there is tax applied at both the country and province levels. This will only be populated for the Invoice response when fetching a single invoice and not for the InvoiceList or LineItem.
   */
  
  public List<TaxDetail> getTaxDetails() { return this.taxDetails; }

  
  /**
   * @param taxDetails Provides additional tax details for Canadian Sales Tax when there is tax applied at both the country and province levels. This will only be populated for the Invoice response when fetching a single invoice and not for the InvoiceList or LineItem.
   */
  
  public void setTaxDetails(final List<TaxDetail> taxDetails) { this.taxDetails = taxDetails; }

  
  /**
   * Provides the tax type as "vat" for EU VAT, "usst" for U.S. Sales Tax, or the 2 letter country code for country level tax types like Canada, Australia, New Zealand, Israel, and all non-EU European countries.
   */
  
  public String getType() { return this.type; }

  
  /**
   * @param type Provides the tax type as "vat" for EU VAT, "usst" for U.S. Sales Tax, or the 2 letter country code for country level tax types like Canada, Australia, New Zealand, Israel, and all non-EU European countries.
   */
  
  public void setType(final String type) { this.type = type; }

}
