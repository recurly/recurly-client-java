package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class TaxInfo extends Resource {

  @SerializedName("rate")
  private Float rate;

  @SerializedName("region")
  private String region;

  @SerializedName("type")
  private String type;


  public Float getRate() { return this.rate; }
  public void setRate(final Float rate) { this.rate = rate; }

  public String getRegion() { return this.region; }
  public void setRegion(final String region) { this.region = region; }

  public String getType() { return this.type; }
  public void setType(final String type) { this.type = type; }

}
