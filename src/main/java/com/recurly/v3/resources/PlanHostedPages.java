/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class PlanHostedPages extends Resource {

  @SerializedName("bypass_confirmation")
  @Expose
  private Boolean bypassConfirmation;

  @SerializedName("cancel_url")
  @Expose
  private String cancelUrl;

  @SerializedName("display_quantity")
  @Expose
  private Boolean displayQuantity;

  @SerializedName("success_url")
  @Expose
  private String successUrl;

  public Boolean getBypassConfirmation() {
    return this.bypassConfirmation;
  }

  public void setBypassConfirmation(final Boolean bypassConfirmation) {
    this.bypassConfirmation = bypassConfirmation;
  }

  public String getCancelUrl() {
    return this.cancelUrl;
  }

  public void setCancelUrl(final String cancelUrl) {
    this.cancelUrl = cancelUrl;
  }

  public Boolean getDisplayQuantity() {
    return this.displayQuantity;
  }

  public void setDisplayQuantity(final Boolean displayQuantity) {
    this.displayQuantity = displayQuantity;
  }

  public String getSuccessUrl() {
    return this.successUrl;
  }

  public void setSuccessUrl(final String successUrl) {
    this.successUrl = successUrl;
  }
}
