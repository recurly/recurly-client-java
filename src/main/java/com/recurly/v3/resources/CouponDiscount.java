package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class CouponDiscount extends Resource {

  @SerializedName("currencies")
  private List<String> currencies;

  @SerializedName("percent")
  private Integer percent;

  @SerializedName("trial")
  private Map<String, String> trial;

  @SerializedName("type")
  private String type;


  public List<String> getCurrencies() { return this.currencies; }
  public void setCurrencies(final List<String> currencies) { this.currencies = currencies; }

  public Integer getPercent() { return this.percent; }
  public void setPercent(final Integer percent) { this.percent = percent; }

  public Map<String, String> getTrial() { return this.trial; }
  public void setTrial(final Map<String, String> trial) { this.trial = trial; }

  public String getType() { return this.type; }
  public void setType(final String type) { this.type = type; }

}
