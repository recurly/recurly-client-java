package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class CouponRedemptionCreate extends Request {

  @SerializedName("coupon_id")
  private String couponId;

  @SerializedName("currency")
  private String currency;


  public String getCouponId() { return this.couponId; }
  public void setCouponId(final String couponId) { this.couponId = couponId; }

  public String getCurrency() { return this.currency; }
  public void setCurrency(final String currency) { this.currency = currency; }

}
