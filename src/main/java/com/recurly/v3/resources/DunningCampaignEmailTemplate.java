/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class DunningCampaignEmailTemplate extends Resource {

  /** The id to assign under `intervals[].email_template_id`. */
  @SerializedName("id")
  @Expose
  private String id;

  /** Template name. */
  @SerializedName("name")
  @Expose
  private String name;

  /**
   * The root template this custom template replaces, e.g. `payment_declined`, `invoice_past_due`,
   * `post_trial_payment_declined`, `subscription_canceled_nonpayment`.
   */
  @SerializedName("type")
  @Expose
  private String type;

  /** The id to assign under `intervals[].email_template_id`. */
  public String getId() {
    return this.id;
  }

  /**
   * @param id The id to assign under `intervals[].email_template_id`.
   */
  public void setId(final String id) {
    this.id = id;
  }

  /** Template name. */
  public String getName() {
    return this.name;
  }

  /**
   * @param name Template name.
   */
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * The root template this custom template replaces, e.g. `payment_declined`, `invoice_past_due`,
   * `post_trial_payment_declined`, `subscription_canceled_nonpayment`.
   */
  public String getType() {
    return this.type;
  }

  /**
   * @param type The root template this custom template replaces, e.g. `payment_declined`,
   *     `invoice_past_due`, `post_trial_payment_declined`, `subscription_canceled_nonpayment`.
   */
  public void setType(final String type) {
    this.type = type;
  }
}
