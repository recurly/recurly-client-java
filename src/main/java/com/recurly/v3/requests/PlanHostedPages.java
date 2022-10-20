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

public class PlanHostedPages extends Request {

  
  /**
   * If `true`, the customer will be sent directly to your `success_url` after a successful signup, bypassing Recurly's hosted confirmation page.
   */
  
  @SerializedName("bypass_confirmation")
  @Expose
  private Boolean bypassConfirmation;

  
  /**
   * URL to redirect to on canceled signup on the hosted payment pages.
   */
  
  @SerializedName("cancel_url")
  @Expose
  private String cancelUrl;

  
  /**
   * Determines if the quantity field is displayed on the hosted pages for the plan.
   */
  
  @SerializedName("display_quantity")
  @Expose
  private Boolean displayQuantity;

  
  /**
   * URL to redirect to after signup on the hosted payment pages.
   */
  
  @SerializedName("success_url")
  @Expose
  private String successUrl;


  
  /**
   * If `true`, the customer will be sent directly to your `success_url` after a successful signup, bypassing Recurly's hosted confirmation page.
   */
  
  public Boolean getBypassConfirmation() { return this.bypassConfirmation; }

  
  /**
   * @param bypassConfirmation If `true`, the customer will be sent directly to your `success_url` after a successful signup, bypassing Recurly's hosted confirmation page.
   */
  
  public void setBypassConfirmation(final Boolean bypassConfirmation) { this.bypassConfirmation = bypassConfirmation; }

  
  /**
   * URL to redirect to on canceled signup on the hosted payment pages.
   */
  
  public String getCancelUrl() { return this.cancelUrl; }

  
  /**
   * @param cancelUrl URL to redirect to on canceled signup on the hosted payment pages.
   */
  
  public void setCancelUrl(final String cancelUrl) { this.cancelUrl = cancelUrl; }

  
  /**
   * Determines if the quantity field is displayed on the hosted pages for the plan.
   */
  
  public Boolean getDisplayQuantity() { return this.displayQuantity; }

  
  /**
   * @param displayQuantity Determines if the quantity field is displayed on the hosted pages for the plan.
   */
  
  public void setDisplayQuantity(final Boolean displayQuantity) { this.displayQuantity = displayQuantity; }

  
  /**
   * URL to redirect to after signup on the hosted payment pages.
   */
  
  public String getSuccessUrl() { return this.successUrl; }

  
  /**
   * @param successUrl URL to redirect to after signup on the hosted payment pages.
   */
  
  public void setSuccessUrl(final String successUrl) { this.successUrl = successUrl; }

}
