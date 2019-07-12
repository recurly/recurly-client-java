package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class AccountNote extends Resource {

  @SerializedName("account_id")
  @Expose
  private String accountId;

  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("message")
  @Expose
  private String message;

  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("user")
  @Expose
  private User user;


  public String getAccountId() { return this.accountId; }
  public void setAccountId(final String accountId) { this.accountId = accountId; }

  public DateTime getCreatedAt() { return this.createdAt; }
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getMessage() { return this.message; }
  public void setMessage(final String message) { this.message = message; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public User getUser() { return this.user; }
  public void setUser(final User user) { this.user = user; }

}
