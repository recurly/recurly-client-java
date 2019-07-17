/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class CouponUpdate extends Request {

  @SerializedName("hosted_description")
  @Expose
  private String hostedDescription;

  @SerializedName("invoice_description")
  @Expose
  private String invoiceDescription;

  @SerializedName("max_redemptions")
  @Expose
  private Integer maxRedemptions;

  @SerializedName("max_redemptions_per_account")
  @Expose
  private Integer maxRedemptionsPerAccount;

  @SerializedName("name")
  @Expose
  private String name;

  @SerializedName("redeem_by_date")
  @Expose
  private String redeemByDate;


  public String getHostedDescription() { return this.hostedDescription; }
  public void setHostedDescription(final String hostedDescription) { this.hostedDescription = hostedDescription; }

  public String getInvoiceDescription() { return this.invoiceDescription; }
  public void setInvoiceDescription(final String invoiceDescription) { this.invoiceDescription = invoiceDescription; }

  public Integer getMaxRedemptions() { return this.maxRedemptions; }
  public void setMaxRedemptions(final Integer maxRedemptions) { this.maxRedemptions = maxRedemptions; }

  public Integer getMaxRedemptionsPerAccount() { return this.maxRedemptionsPerAccount; }
  public void setMaxRedemptionsPerAccount(final Integer maxRedemptionsPerAccount) { this.maxRedemptionsPerAccount = maxRedemptionsPerAccount; }

  public String getName() { return this.name; }
  public void setName(final String name) { this.name = name; }

  public String getRedeemByDate() { return this.redeemByDate; }
  public void setRedeemByDate(final String redeemByDate) { this.redeemByDate = redeemByDate; }

}
