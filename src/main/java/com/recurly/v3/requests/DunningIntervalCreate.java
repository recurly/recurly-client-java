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

public class DunningIntervalCreate extends Request {

  /** Number of days before sending the next email. */
  @SerializedName("days")
  @Expose
  private Integer days;

  /**
   * The id of the custom email template to assign to this interval, from `GET
   * /dunning_campaigns/email_templates`. `null` uses the system default template for this interval.
   */
  @SerializedName("email_template_id")
  @Expose
  private String emailTemplateId;

  /** Number of days before sending the next email. */
  public Integer getDays() {
    return this.days;
  }

  /**
   * @param days Number of days before sending the next email.
   */
  public void setDays(final Integer days) {
    this.days = days;
  }

  /**
   * The id of the custom email template to assign to this interval, from `GET
   * /dunning_campaigns/email_templates`. `null` uses the system default template for this interval.
   */
  public String getEmailTemplateId() {
    return this.emailTemplateId;
  }

  /**
   * @param emailTemplateId The id of the custom email template to assign to this interval, from
   *     `GET /dunning_campaigns/email_templates`. `null` uses the system default template for this
   *     interval.
   */
  public void setEmailTemplateId(final String emailTemplateId) {
    this.emailTemplateId = emailTemplateId;
  }
}
