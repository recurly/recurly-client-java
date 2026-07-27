/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import com.recurly.v3.resources.*;
import java.util.List;

public class RecoveryAccountCreate extends Request {

  @SerializedName("address")
  @Expose
  private RecoveryAddress address;

  /**
   * If the premium Wallet feature is enabled, more than one payment method can be associated with
   * an account, and one can be designated as a primary and one as a backup. Without the Wallet
   * feature, only one payment method will be accepted.
   */
  @SerializedName("billing_infos")
  @Expose
  private List<RecoveryBillingInfoCreate> billingInfos;

  /** The unique identifier of the account. This cannot be changed once the account is created. */
  @SerializedName("code")
  @Expose
  private String code;

  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  @SerializedName("custom_fields")
  @Expose
  private List<CustomField> customFields;

  /**
   * Unique ID to identify a dunning campaign. Used to specify if a non-default dunning campaign
   * should be assigned to this account. For sites without multiple dunning campaigns enabled, the
   * default dunning campaign will always be used.
   */
  @SerializedName("dunning_campaign_id")
  @Expose
  private String dunningCampaignId;

  /** The email address used for communicating with this customer. */
  @SerializedName("email")
  @Expose
  private String email;

  public RecoveryAddress getAddress() {
    return this.address;
  }

  /**
   * @param address
   */
  public void setAddress(final RecoveryAddress address) {
    this.address = address;
  }

  /**
   * If the premium Wallet feature is enabled, more than one payment method can be associated with
   * an account, and one can be designated as a primary and one as a backup. Without the Wallet
   * feature, only one payment method will be accepted.
   */
  public List<RecoveryBillingInfoCreate> getBillingInfos() {
    return this.billingInfos;
  }

  /**
   * @param billingInfos If the premium Wallet feature is enabled, more than one payment method can
   *     be associated with an account, and one can be designated as a primary and one as a backup.
   *     Without the Wallet feature, only one payment method will be accepted.
   */
  public void setBillingInfos(final List<RecoveryBillingInfoCreate> billingInfos) {
    this.billingInfos = billingInfos;
  }

  /** The unique identifier of the account. This cannot be changed once the account is created. */
  public String getCode() {
    return this.code;
  }

  /**
   * @param code The unique identifier of the account. This cannot be changed once the account is
   *     created.
   */
  public void setCode(final String code) {
    this.code = code;
  }

  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  public List<CustomField> getCustomFields() {
    return this.customFields;
  }

  /**
   * @param customFields The custom fields will only be altered when they are included in a request.
   *     Sending an empty array will not remove any existing values. To remove a field send the name
   *     with a null or empty value.
   */
  public void setCustomFields(final List<CustomField> customFields) {
    this.customFields = customFields;
  }

  /**
   * Unique ID to identify a dunning campaign. Used to specify if a non-default dunning campaign
   * should be assigned to this account. For sites without multiple dunning campaigns enabled, the
   * default dunning campaign will always be used.
   */
  public String getDunningCampaignId() {
    return this.dunningCampaignId;
  }

  /**
   * @param dunningCampaignId Unique ID to identify a dunning campaign. Used to specify if a
   *     non-default dunning campaign should be assigned to this account. For sites without multiple
   *     dunning campaigns enabled, the default dunning campaign will always be used.
   */
  public void setDunningCampaignId(final String dunningCampaignId) {
    this.dunningCampaignId = dunningCampaignId;
  }

  /** The email address used for communicating with this customer. */
  public String getEmail() {
    return this.email;
  }

  /**
   * @param email The email address used for communicating with this customer.
   */
  public void setEmail(final String email) {
    this.email = email;
  }
}
