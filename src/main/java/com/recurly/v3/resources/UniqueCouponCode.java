package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class UniqueCouponCode extends Resource {

  @SerializedName("code")
  private String code;

  @SerializedName("created_at")
  private DateTime createdAt;

  @SerializedName("expired_at")
  private DateTime expiredAt;

  @SerializedName("id")
  private String id;

  @SerializedName("object")
  private String object;

  @SerializedName("redeemed_at")
  private DateTime redeemedAt;

  @SerializedName("state")
  private String state;

  @SerializedName("updated_at")
  private DateTime updatedAt;


  public String getCode() { return this.code; }
  public void setCode(final String code) { this.code = code; }

  public DateTime getCreatedAt() { return this.createdAt; }
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  public DateTime getExpiredAt() { return this.expiredAt; }
  public void setExpiredAt(final DateTime expiredAt) { this.expiredAt = expiredAt; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public DateTime getRedeemedAt() { return this.redeemedAt; }
  public void setRedeemedAt(final DateTime redeemedAt) { this.redeemedAt = redeemedAt; }

  public String getState() { return this.state; }
  public void setState(final String state) { this.state = state; }

  public DateTime getUpdatedAt() { return this.updatedAt; }
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

}
