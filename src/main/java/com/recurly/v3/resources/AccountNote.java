/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;

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

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("user")
  @Expose
  private User user;

  public String getAccountId() {
    return this.accountId;
  }

  /** @param accountId */
  public void setAccountId(final String accountId) {
    this.accountId = accountId;
  }

  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public String getId() {
    return this.id;
  }

  /** @param id */
  public void setId(final String id) {
    this.id = id;
  }

  public String getMessage() {
    return this.message;
  }

  /** @param message */
  public void setMessage(final String message) {
    this.message = message;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  public User getUser() {
    return this.user;
  }

  /** @param user */
  public void setUser(final User user) {
    this.user = user;
  }
}
