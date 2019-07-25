/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class BillingInfoUpdatedBy extends Resource {

  @SerializedName("country")
  @Expose
  private String country;

  @SerializedName("ip")
  @Expose
  private String ip;

  public String getCountry() {
    return this.country;
  }

  public void setCountry(final String country) {
    this.country = country;
  }

  public String getIp() {
    return this.ip;
  }

  public void setIp(final String ip) {
    this.ip = ip;
  }
}
