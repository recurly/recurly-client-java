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

public class AccountAcquisitionUpdate extends Request {

  
  /**
   * An arbitrary identifier for the marketing campaign that led to the acquisition of this account.
   */
  
  @SerializedName("campaign")
  @Expose
  private String campaign;

  
  /**
   * The channel through which the account was acquired.
   */
  
  @SerializedName("channel")
  @Expose
  private Constants.Channel channel;

  
  /**
   * Account balance
   */
  
  @SerializedName("cost")
  @Expose
  private AccountAcquisitionCost cost;

  
  /**
   * An arbitrary subchannel string representing a distinction/subcategory within a broader channel.
   */
  
  @SerializedName("subchannel")
  @Expose
  private String subchannel;


  
  /**
   * An arbitrary identifier for the marketing campaign that led to the acquisition of this account.
   */
  
  public String getCampaign() { return this.campaign; }

  
  /**
   * @param campaign An arbitrary identifier for the marketing campaign that led to the acquisition of this account.
   */
  
  public void setCampaign(final String campaign) { this.campaign = campaign; }

  
  /**
   * The channel through which the account was acquired.
   */
  
  public Constants.Channel getChannel() { return this.channel; }

  
  /**
   * @param channel The channel through which the account was acquired.
   */
  
  public void setChannel(final Constants.Channel channel) { this.channel = channel; }

  
  /**
   * Account balance
   */
  
  public AccountAcquisitionCost getCost() { return this.cost; }

  
  /**
   * @param cost Account balance
   */
  
  public void setCost(final AccountAcquisitionCost cost) { this.cost = cost; }

  
  /**
   * An arbitrary subchannel string representing a distinction/subcategory within a broader channel.
   */
  
  public String getSubchannel() { return this.subchannel; }

  
  /**
   * @param subchannel An arbitrary subchannel string representing a distinction/subcategory within a broader channel.
   */
  
  public void setSubchannel(final String subchannel) { this.subchannel = subchannel; }

}
