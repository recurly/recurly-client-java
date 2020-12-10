/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Constants;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;

public class AccountAcquisition extends Resource {

  /** Account mini details */
  @SerializedName("account")
  @Expose
  private AccountMini account;

  /**
   * An arbitrary identifier for the marketing campaign that led to the acquisition of this account.
   */
  @SerializedName("campaign")
  @Expose
  private String campaign;

  /** The channel through which the account was acquired. */
  @SerializedName("channel")
  @Expose
  private Constants.Channel channel;

  /** Account balance */
  @SerializedName("cost")
  @Expose
  private AccountAcquisitionCost cost;

  /** When the account acquisition data was created. */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  @SerializedName("id")
  @Expose
  private String id;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /**
   * An arbitrary subchannel string representing a distinction/subcategory within a broader channel.
   */
  @SerializedName("subchannel")
  @Expose
  private String subchannel;

  /** When the account acquisition data was last changed. */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /** Account mini details */
  public AccountMini getAccount() {
    return this.account;
  }

  /** @param account Account mini details */
  public void setAccount(final AccountMini account) {
    this.account = account;
  }

  /**
   * An arbitrary identifier for the marketing campaign that led to the acquisition of this account.
   */
  public String getCampaign() {
    return this.campaign;
  }

  /**
   * @param campaign An arbitrary identifier for the marketing campaign that led to the acquisition
   *     of this account.
   */
  public void setCampaign(final String campaign) {
    this.campaign = campaign;
  }

  /** The channel through which the account was acquired. */
  public Constants.Channel getChannel() {
    return this.channel;
  }

  /** @param channel The channel through which the account was acquired. */
  public void setChannel(final Constants.Channel channel) {
    this.channel = channel;
  }

  /** Account balance */
  public AccountAcquisitionCost getCost() {
    return this.cost;
  }

  /** @param cost Account balance */
  public void setCost(final AccountAcquisitionCost cost) {
    this.cost = cost;
  }

  /** When the account acquisition data was created. */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt When the account acquisition data was created. */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public String getId() {
    return this.id;
  }

  /** @param id */
  public void setId(final String id) {
    this.id = id;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  /**
   * An arbitrary subchannel string representing a distinction/subcategory within a broader channel.
   */
  public String getSubchannel() {
    return this.subchannel;
  }

  /**
   * @param subchannel An arbitrary subchannel string representing a distinction/subcategory within
   *     a broader channel.
   */
  public void setSubchannel(final String subchannel) {
    this.subchannel = subchannel;
  }

  /** When the account acquisition data was last changed. */
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt When the account acquisition data was last changed. */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
}
