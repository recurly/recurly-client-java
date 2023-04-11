/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import com.recurly.v3.Constants;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

public class AccountMini extends Resource {

  
  @SerializedName("bill_to")
  @Expose
  private String billTo;

  
  /**
   * The unique identifier of the account.
   */
  
  @SerializedName("code")
  @Expose
  private String code;

  
  @SerializedName("company")
  @Expose
  private String company;

  
  /**
   * Unique ID to identify a dunning campaign. Used to specify if a non-default dunning campaign should be assigned to this account. For sites without multiple dunning campaigns enabled, the default dunning campaign will always be used.
   */
  
  @SerializedName("dunning_campaign_id")
  @Expose
  private String dunningCampaignId;

  
  /**
   * The email address used for communicating with this customer.
   */
  
  @SerializedName("email")
  @Expose
  private String email;

  
  @SerializedName("first_name")
  @Expose
  private String firstName;

  
  @SerializedName("id")
  @Expose
  private String id;

  
  @SerializedName("last_name")
  @Expose
  private String lastName;

  
  /**
   * Object type
   */
  
  @SerializedName("object")
  @Expose
  private String object;

  
  @SerializedName("parent_account_id")
  @Expose
  private String parentAccountId;



  
  public String getBillTo() { return this.billTo; }

  
  /**
   * @param billTo 
   */
  
  public void setBillTo(final String billTo) { this.billTo = billTo; }

  
  /**
   * The unique identifier of the account.
   */
  
  public String getCode() { return this.code; }

  
  /**
   * @param code The unique identifier of the account.
   */
  
  public void setCode(final String code) { this.code = code; }

  
  public String getCompany() { return this.company; }

  
  /**
   * @param company 
   */
  
  public void setCompany(final String company) { this.company = company; }

  
  /**
   * Unique ID to identify a dunning campaign. Used to specify if a non-default dunning campaign should be assigned to this account. For sites without multiple dunning campaigns enabled, the default dunning campaign will always be used.
   */
  
  public String getDunningCampaignId() { return this.dunningCampaignId; }

  
  /**
   * @param dunningCampaignId Unique ID to identify a dunning campaign. Used to specify if a non-default dunning campaign should be assigned to this account. For sites without multiple dunning campaigns enabled, the default dunning campaign will always be used.
   */
  
  public void setDunningCampaignId(final String dunningCampaignId) { this.dunningCampaignId = dunningCampaignId; }

  
  /**
   * The email address used for communicating with this customer.
   */
  
  public String getEmail() { return this.email; }

  
  /**
   * @param email The email address used for communicating with this customer.
   */
  
  public void setEmail(final String email) { this.email = email; }

  
  public String getFirstName() { return this.firstName; }

  
  /**
   * @param firstName 
   */
  
  public void setFirstName(final String firstName) { this.firstName = firstName; }

  
  public String getId() { return this.id; }

  
  /**
   * @param id 
   */
  
  public void setId(final String id) { this.id = id; }

  
  public String getLastName() { return this.lastName; }

  
  /**
   * @param lastName 
   */
  
  public void setLastName(final String lastName) { this.lastName = lastName; }

  
  /**
   * Object type
   */
  
  public String getObject() { return this.object; }

  
  /**
   * @param object Object type
   */
  
  public void setObject(final String object) { this.object = object; }

  
  public String getParentAccountId() { return this.parentAccountId; }

  
  /**
   * @param parentAccountId 
   */
  
  public void setParentAccountId(final String parentAccountId) { this.parentAccountId = parentAccountId; }

}
