package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class Settings extends Resource {

  @SerializedName("accepted_currencies")
  @Expose
  private List<String> acceptedCurrencies;

  @SerializedName("billing_address_requirement")
  @Expose
  private String billingAddressRequirement;

  @SerializedName("default_currency")
  @Expose
  private String defaultCurrency;


  public List<String> getAcceptedCurrencies() { return this.acceptedCurrencies; }
  public void setAcceptedCurrencies(final List<String> acceptedCurrencies) { this.acceptedCurrencies = acceptedCurrencies; }

  public String getBillingAddressRequirement() { return this.billingAddressRequirement; }
  public void setBillingAddressRequirement(final String billingAddressRequirement) { this.billingAddressRequirement = billingAddressRequirement; }

  public String getDefaultCurrency() { return this.defaultCurrency; }
  public void setDefaultCurrency(final String defaultCurrency) { this.defaultCurrency = defaultCurrency; }

}
