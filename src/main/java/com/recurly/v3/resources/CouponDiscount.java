package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class CouponDiscount extends Resource {

  @SerializedName("currencies")
  @Expose
  private List<CouponDiscountPricing> currencies;

  @SerializedName("percent")
  @Expose
  private Integer percent;

  @SerializedName("trial")
  @Expose
  private CouponDiscountTrial trial;

  @SerializedName("type")
  @Expose
  private String type;


  public List<CouponDiscountPricing> getCurrencies() { return this.currencies; }
  public void setCurrencies(final List<CouponDiscountPricing> currencies) { this.currencies = currencies; }

  public Integer getPercent() { return this.percent; }
  public void setPercent(final Integer percent) { this.percent = percent; }

  public CouponDiscountTrial getTrial() { return this.trial; }
  public void setTrial(final CouponDiscountTrial trial) { this.trial = trial; }

  public String getType() { return this.type; }
  public void setType(final String type) { this.type = type; }

}
