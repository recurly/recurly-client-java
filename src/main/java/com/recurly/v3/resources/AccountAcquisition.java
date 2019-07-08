package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class AccountAcquisition extends Resource {

  @SerializedName("account")
  private AccountMini account;

  @SerializedName("campaign")
  private String campaign;

  @SerializedName("channel")
  private String channel;

  @SerializedName("cost")
  private AccountAcquisitionCost cost;

  @SerializedName("created_at")
  private DateTime createdAt;

  @SerializedName("id")
  private String id;

  @SerializedName("object")
  private String object;

  @SerializedName("subchannel")
  private String subchannel;

  @SerializedName("updated_at")
  private DateTime updatedAt;


  public AccountMini getAccount() { return this.account; }
  public void setAccount(final AccountMini account) { this.account = account; }

  public String getCampaign() { return this.campaign; }
  public void setCampaign(final String campaign) { this.campaign = campaign; }

  public String getChannel() { return this.channel; }
  public void setChannel(final String channel) { this.channel = channel; }

  public AccountAcquisitionCost getCost() { return this.cost; }
  public void setCost(final AccountAcquisitionCost cost) { this.cost = cost; }

  public DateTime getCreatedAt() { return this.createdAt; }
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public String getSubchannel() { return this.subchannel; }
  public void setSubchannel(final String subchannel) { this.subchannel = subchannel; }

  public DateTime getUpdatedAt() { return this.updatedAt; }
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

}
