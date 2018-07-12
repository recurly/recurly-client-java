package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class SiteSettings extends Resource {

    @SerializedName("billing_address_requirement")
    private String billingAddressRequrirement;

    @SerializedName("default_currency")
    private String defaultCurrency;

    public String getBillingAddressRequrirement() {
        return billingAddressRequrirement;
    }

    public void setBillingAddressRequrirement(final String billingAddressRequrirement) {
        this.billingAddressRequrirement = billingAddressRequrirement;
    }

    public String getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(final String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }
}
