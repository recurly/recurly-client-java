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
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class CouponDiscountTrial extends Resource {

  @SerializedName("length")
  @Expose
  private Integer length;

  @SerializedName("unit")
  @Expose
  private String unit;


  public Integer getLength() { return this.length; }
  public void setLength(final Integer length) { this.length = length; }

  public String getUnit() { return this.unit; }
  public void setUnit(final String unit) { this.unit = unit; }

}
