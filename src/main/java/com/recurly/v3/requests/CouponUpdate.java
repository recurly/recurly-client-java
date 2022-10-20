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

public class CouponUpdate extends Request {

  
  /**
   * This description will show up when a customer redeems a coupon on your Hosted Payment Pages, or if you choose to show the description on your own checkout page.
   */
  
  @SerializedName("hosted_description")
  @Expose
  private String hostedDescription;

  
  /**
   * Description of the coupon on the invoice.
   */
  
  @SerializedName("invoice_description")
  @Expose
  private String invoiceDescription;

  
  /**
   * A maximum number of redemptions for the coupon. The coupon will expire when it hits its maximum redemptions.
   */
  
  @SerializedName("max_redemptions")
  @Expose
  private Integer maxRedemptions;

  
  /**
   * Redemptions per account is the number of times a specific account can redeem the coupon. Set redemptions per account to `1` if you want to keep customers from gaming the system and getting more than one discount from the coupon campaign.
   */
  
  @SerializedName("max_redemptions_per_account")
  @Expose
  private Integer maxRedemptionsPerAccount;

  
  /**
   * The internal name for the coupon.
   */
  
  @SerializedName("name")
  @Expose
  private String name;

  
  /**
   * The date and time the coupon will expire and can no longer be redeemed. Time is always 11:59:59, the end-of-day Pacific time.
   */
  
  @SerializedName("redeem_by_date")
  @Expose
  private String redeemByDate;


  
  /**
   * This description will show up when a customer redeems a coupon on your Hosted Payment Pages, or if you choose to show the description on your own checkout page.
   */
  
  public String getHostedDescription() { return this.hostedDescription; }

  
  /**
   * @param hostedDescription This description will show up when a customer redeems a coupon on your Hosted Payment Pages, or if you choose to show the description on your own checkout page.
   */
  
  public void setHostedDescription(final String hostedDescription) { this.hostedDescription = hostedDescription; }

  
  /**
   * Description of the coupon on the invoice.
   */
  
  public String getInvoiceDescription() { return this.invoiceDescription; }

  
  /**
   * @param invoiceDescription Description of the coupon on the invoice.
   */
  
  public void setInvoiceDescription(final String invoiceDescription) { this.invoiceDescription = invoiceDescription; }

  
  /**
   * A maximum number of redemptions for the coupon. The coupon will expire when it hits its maximum redemptions.
   */
  
  public Integer getMaxRedemptions() { return this.maxRedemptions; }

  
  /**
   * @param maxRedemptions A maximum number of redemptions for the coupon. The coupon will expire when it hits its maximum redemptions.
   */
  
  public void setMaxRedemptions(final Integer maxRedemptions) { this.maxRedemptions = maxRedemptions; }

  
  /**
   * Redemptions per account is the number of times a specific account can redeem the coupon. Set redemptions per account to `1` if you want to keep customers from gaming the system and getting more than one discount from the coupon campaign.
   */
  
  public Integer getMaxRedemptionsPerAccount() { return this.maxRedemptionsPerAccount; }

  
  /**
   * @param maxRedemptionsPerAccount Redemptions per account is the number of times a specific account can redeem the coupon. Set redemptions per account to `1` if you want to keep customers from gaming the system and getting more than one discount from the coupon campaign.
   */
  
  public void setMaxRedemptionsPerAccount(final Integer maxRedemptionsPerAccount) { this.maxRedemptionsPerAccount = maxRedemptionsPerAccount; }

  
  /**
   * The internal name for the coupon.
   */
  
  public String getName() { return this.name; }

  
  /**
   * @param name The internal name for the coupon.
   */
  
  public void setName(final String name) { this.name = name; }

  
  /**
   * The date and time the coupon will expire and can no longer be redeemed. Time is always 11:59:59, the end-of-day Pacific time.
   */
  
  public String getRedeemByDate() { return this.redeemByDate; }

  
  /**
   * @param redeemByDate The date and time the coupon will expire and can no longer be redeemed. Time is always 11:59:59, the end-of-day Pacific time.
   */
  
  public void setRedeemByDate(final String redeemByDate) { this.redeemByDate = redeemByDate; }

}
