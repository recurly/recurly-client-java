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

public class Settings extends Resource {

  @SerializedName("accepted_currencies")
  @Expose
  private List<String> acceptedCurrencies;

  /**
   * - full: Full Address (Street, City, State, Postal Code and Country) - streetzip: Street and
   * Postal Code only - zip: Postal Code only - none: No Address
   */
  @SerializedName("billing_address_requirement")
  @Expose
  private String billingAddressRequirement;

  /** The default 3-letter ISO 4217 currency code. */
  @SerializedName("default_currency")
  @Expose
  private String defaultCurrency;

  public List<String> getAcceptedCurrencies() {
    return this.acceptedCurrencies;
  }

  /** @param acceptedCurrencies */
  public void setAcceptedCurrencies(final List<String> acceptedCurrencies) {
    this.acceptedCurrencies = acceptedCurrencies;
  }

  /**
   * - full: Full Address (Street, City, State, Postal Code and Country) - streetzip: Street and
   * Postal Code only - zip: Postal Code only - none: No Address
   */
  public String getBillingAddressRequirement() {
    return this.billingAddressRequirement;
  }

  /**
   * @param billingAddressRequirement - full: Full Address (Street, City, State, Postal Code and
   *     Country) - streetzip: Street and Postal Code only - zip: Postal Code only - none: No
   *     Address
   */
  public void setBillingAddressRequirement(final String billingAddressRequirement) {
    this.billingAddressRequirement = billingAddressRequirement;
  }

  /** The default 3-letter ISO 4217 currency code. */
  public String getDefaultCurrency() {
    return this.defaultCurrency;
  }

  /** @param defaultCurrency The default 3-letter ISO 4217 currency code. */
  public void setDefaultCurrency(final String defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }
}
