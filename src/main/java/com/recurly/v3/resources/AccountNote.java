package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class AccountNote extends Resource {

  @SerializedName("account_id")
  private String accountId;

  @SerializedName("created_at")
  private DateTime createdAt;

  @SerializedName("id")
  private String id;

  @SerializedName("message")
  private String message;

  @SerializedName("object")
  private String object;

  @SerializedName("user")
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
