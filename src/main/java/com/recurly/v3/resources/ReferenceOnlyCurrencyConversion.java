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
