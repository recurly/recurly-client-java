/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.math.BigDecimal;

public class ReferenceOnlyCurrencyConversion extends Resource {

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /** The date of the conversion rate. */
  @SerializedName("date")
  @Expose
  private String date;

  /** The conversion rate to the currency. */
  @SerializedName("rate")
  @Expose
  private String rate;

  /** The source of the conversion rate. */
  @SerializedName("source")
  @Expose
  private String source;

  /** The subtotal converted to the currency. */
  @SerializedName("subtotal_in_cents")
  @Expose
  private BigDecimal subtotalInCents;

  /** The tax converted to the currency. */
  @SerializedName("tax_in_cents")
  @Expose
  private BigDecimal taxInCents;

  /** 3-letter ISO 4217 currency code. */
  public String getCurrency() {
    return this.currency;
  }

  /** @param currency 3-letter ISO 4217 currency code. */
  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  /** The date of the conversion rate. */
  public String getDate() {
    return this.date;
  }

  /** @param date The date of the conversion rate. */
  public void setDate(final String date) {
    this.date = date;
  }

  /** The conversion rate to the currency. */
  public String getRate() {
    return this.rate;
  }

  /** @param rate The conversion rate to the currency. */
  public void setRate(final String rate) {
    this.rate = rate;
  }

  /** The source of the conversion rate. */
  public String getSource() {
    return this.source;
  }

  /** @param source The source of the conversion rate. */
  public void setSource(final String source) {
    this.source = source;
  }

  /** The subtotal converted to the currency. */
  public BigDecimal getSubtotalInCents() {
    return this.subtotalInCents;
  }

  /** @param subtotalInCents The subtotal converted to the currency. */
  public void setSubtotalInCents(final BigDecimal subtotalInCents) {
    this.subtotalInCents = subtotalInCents;
  }

  /** The tax converted to the currency. */
  public BigDecimal getTaxInCents() {
    return this.taxInCents;
  }

  /** @param taxInCents The tax converted to the currency. */
  public void setTaxInCents(final BigDecimal taxInCents) {
    this.taxInCents = taxInCents;
  }
}
