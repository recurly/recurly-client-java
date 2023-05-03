/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.util.List;

public class TaxInfo extends Resource {

  /** The combined tax rate. Not present when Avalara for Communications is enabled. */
  @SerializedName("rate")
  @Expose
  private Float rate;

  /**
   * Provides the tax region applied on an invoice. For U.S. Sales Tax, this will be the 2 letter
   * state code. For EU VAT this will be the 2 letter country code. For all country level tax types,
   * this will display the regional tax, like VAT, GST, or PST. Not present when Avalara for
   * Communications is enabled.
   */
  @SerializedName("region")
  @Expose
  private String region;

  /**
   * Provides additional tax details for Communications taxes when Avalara for Communications is
   * enabled or Canadian Sales Tax when there is tax applied at both the country and province
   * levels. This will only be populated for the Invoice response when fetching a single invoice and
   * not for the InvoiceList or LineItemList. Only populated for a single LineItem fetch when
   * Avalara for Communications is enabled.
   */
  @SerializedName("tax_details")
  @Expose
  private List<TaxDetail> taxDetails;

  /**
   * Provides the tax type as "vat" for EU VAT, "usst" for U.S. Sales Tax, or the 2 letter country
   * code for country level tax types like Canada, Australia, New Zealand, Israel, and all non-EU
   * European countries. Not present when Avalara for Communications is enabled.
   */
  @SerializedName("type")
  @Expose
  private String type;

  /** The combined tax rate. Not present when Avalara for Communications is enabled. */
  public Float getRate() {
    return this.rate;
  }

  /** @param rate The combined tax rate. Not present when Avalara for Communications is enabled. */
  public void setRate(final Float rate) {
    this.rate = rate;
  }

  /**
   * Provides the tax region applied on an invoice. For U.S. Sales Tax, this will be the 2 letter
   * state code. For EU VAT this will be the 2 letter country code. For all country level tax types,
   * this will display the regional tax, like VAT, GST, or PST. Not present when Avalara for
   * Communications is enabled.
   */
  public String getRegion() {
    return this.region;
  }

  /**
   * @param region Provides the tax region applied on an invoice. For U.S. Sales Tax, this will be
   *     the 2 letter state code. For EU VAT this will be the 2 letter country code. For all country
   *     level tax types, this will display the regional tax, like VAT, GST, or PST. Not present
   *     when Avalara for Communications is enabled.
   */
  public void setRegion(final String region) {
    this.region = region;
  }

  /**
   * Provides additional tax details for Communications taxes when Avalara for Communications is
   * enabled or Canadian Sales Tax when there is tax applied at both the country and province
   * levels. This will only be populated for the Invoice response when fetching a single invoice and
   * not for the InvoiceList or LineItemList. Only populated for a single LineItem fetch when
   * Avalara for Communications is enabled.
   */
  public List<TaxDetail> getTaxDetails() {
    return this.taxDetails;
  }

  /**
   * @param taxDetails Provides additional tax details for Communications taxes when Avalara for
   *     Communications is enabled or Canadian Sales Tax when there is tax applied at both the
   *     country and province levels. This will only be populated for the Invoice response when
   *     fetching a single invoice and not for the InvoiceList or LineItemList. Only populated for a
   *     single LineItem fetch when Avalara for Communications is enabled.
   */
  public void setTaxDetails(final List<TaxDetail> taxDetails) {
    this.taxDetails = taxDetails;
  }

  /**
   * Provides the tax type as "vat" for EU VAT, "usst" for U.S. Sales Tax, or the 2 letter country
   * code for country level tax types like Canada, Australia, New Zealand, Israel, and all non-EU
   * European countries. Not present when Avalara for Communications is enabled.
   */
  public String getType() {
    return this.type;
  }

  /**
   * @param type Provides the tax type as "vat" for EU VAT, "usst" for U.S. Sales Tax, or the 2
   *     letter country code for country level tax types like Canada, Australia, New Zealand,
   *     Israel, and all non-EU European countries. Not present when Avalara for Communications is
   *     enabled.
   */
  public void setType(final String type) {
    this.type = type;
  }
}
