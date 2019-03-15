package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class CouponMini extends Resource {

  @SerializedName("code")
  private String code;

  @SerializedName("coupon_type")
  private String couponType;

  @SerializedName("discount")
  private CouponDiscount discount;

  @SerializedName("expired_at")
  private DateTime expiredAt;

  @SerializedName("id")
  private String id;

  @SerializedName("name")
  private String name;

  @SerializedName("object")
  private String object;

  @SerializedName("state")
  private String state;


  public String getCode() { return this.code; }
  public void setCode(final String code) { this.code = code; }

  public String getCouponType() { return this.couponType; }
  public void setCouponType(final String couponType) { this.couponType = couponType; }

  public CouponDiscount getDiscount() { return this.discount; }
  public void setDiscount(final CouponDiscount discount) { this.discount = discount; }

  public DateTime getExpiredAt() { return this.expiredAt; }
  public void setExpiredAt(final DateTime expiredAt) { this.expiredAt = expiredAt; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getName() { return this.name; }
  public void setName(final String name) { this.name = name; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public String getState() { return this.state; }
  public void setState(final String state) { this.state = state; }

}
