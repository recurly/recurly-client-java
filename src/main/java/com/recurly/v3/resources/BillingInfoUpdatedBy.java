package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class BillingInfoUpdatedBy extends Resource {

  @SerializedName("country")
  @Expose
  private String country;

  @SerializedName("ip")
  @Expose
  private String ip;


  public String getCountry() { return this.country; }
  public void setCountry(final String country) { this.country = country; }

  public String getIp() { return this.ip; }
  public void setIp(final String ip) { this.ip = ip; }

}
