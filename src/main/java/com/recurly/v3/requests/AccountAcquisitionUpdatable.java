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

public class AccountAcquisitionUpdatable extends Request {

  @SerializedName("campaign")
  @Expose
  private String campaign;

  @SerializedName("channel")
  @Expose
  private String channel;

  @SerializedName("cost")
  @Expose
  private AccountAcquisitionCost cost;

  @SerializedName("subchannel")
  @Expose
  private String subchannel;


  public String getCampaign() { return this.campaign; }
  public void setCampaign(final String campaign) { this.campaign = campaign; }

  public String getChannel() { return this.channel; }
  public void setChannel(final String channel) { this.channel = channel; }

  public AccountAcquisitionCost getCost() { return this.cost; }
  public void setCost(final AccountAcquisitionCost cost) { this.cost = cost; }

  public String getSubchannel() { return this.subchannel; }
  public void setSubchannel(final String subchannel) { this.subchannel = subchannel; }

}
