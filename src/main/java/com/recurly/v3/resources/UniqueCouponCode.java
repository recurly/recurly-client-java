package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class UniqueCouponCode extends Resource {

  @SerializedName("code")
  @Expose
  private String code;

  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  @SerializedName("expired_at")
  @Expose
  private DateTime expiredAt;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("redeemed_at")
  @Expose
  private DateTime redeemedAt;

  @SerializedName("state")
  @Expose
  private String state;

  @SerializedName("updated_at")
  @Expose
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
