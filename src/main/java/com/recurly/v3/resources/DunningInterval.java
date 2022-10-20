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

public class DunningInterval extends Resource {

  
  /**
   * Number of days before sending the next email.
   */
  
  @SerializedName("days")
  @Expose
  private Integer days;

  
  /**
   * Email template being used.
   */
  
  @SerializedName("email_template")
  @Expose
  private String emailTemplate;



  
  /**
   * Number of days before sending the next email.
   */
  
  public Integer getDays() { return this.days; }

  
  /**
   * @param days Number of days before sending the next email.
   */
  
  public void setDays(final Integer days) { this.days = days; }

  
  /**
   * Email template being used.
   */
  
  public String getEmailTemplate() { return this.emailTemplate; }

  
  /**
   * @param emailTemplate Email template being used.
   */
  
  public void setEmailTemplate(final String emailTemplate) { this.emailTemplate = emailTemplate; }

}
