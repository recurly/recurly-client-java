package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class CouponDiscountTrial extends Resource {

  @SerializedName("length")
  private Integer length;

  @SerializedName("unit")
  private String unit;


  public Integer getLength() { return this.length; }
  public void setLength(final Integer length) { this.length = length; }

  public String getUnit() { return this.unit; }
  public void setUnit(final String unit) { this.unit = unit; }

}
