package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class CouponPricing extends Request {

  @SerializedName("currency")
  @Expose
  private String currency;

  @SerializedName("discount")
  @Expose
  private Float discount;


  public String getCurrency() { return this.currency; }
  public void setCurrency(final String currency) { this.currency = currency; }

  public Float getDiscount() { return this.discount; }
  public void setDiscount(final Float discount) { this.discount = discount; }

}
