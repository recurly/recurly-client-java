package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class AccountAcquisitionUpdatable extends Request {

  @SerializedName("campaign")
  private String campaign;

  @SerializedName("channel")
  private String channel;

  @SerializedName("cost")
  private AccountAcquisitionCost cost;

  @SerializedName("subchannel")
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
