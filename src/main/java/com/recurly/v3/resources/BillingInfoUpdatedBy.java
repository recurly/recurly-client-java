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

public class BillingInfoUpdatedBy extends Resource {

  
  /**
   * Country, 2-letter ISO 3166-1 alpha-2 code matching the origin IP address, if known by Recurly.
   */
  
  @SerializedName("country")
  @Expose
  private String country;

  
  /**
   * Customer's IP address when updating their billing information.
   */
  
  @SerializedName("ip")
  @Expose
  private String ip;



  
  /**
   * Country, 2-letter ISO 3166-1 alpha-2 code matching the origin IP address, if known by Recurly.
   */
  
  public String getCountry() { return this.country; }

  
  /**
   * @param country Country, 2-letter ISO 3166-1 alpha-2 code matching the origin IP address, if known by Recurly.
   */
  
  public void setCountry(final String country) { this.country = country; }

  
  /**
   * Customer's IP address when updating their billing information.
   */
  
  public String getIp() { return this.ip; }

  
  /**
   * @param ip Customer's IP address when updating their billing information.
   */
  
  public void setIp(final String ip) { this.ip = ip; }

}
