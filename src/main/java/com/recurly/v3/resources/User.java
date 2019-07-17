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

public class User extends Resource {

  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  @SerializedName("deleted_at")
  @Expose
  private DateTime deletedAt;

  @SerializedName("email")
  @Expose
  private String email;

  @SerializedName("first_name")
  @Expose
  private String firstName;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("last_name")
  @Expose
  private String lastName;

  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("time_zone")
  @Expose
  private String timeZone;


  public DateTime getCreatedAt() { return this.createdAt; }
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  public DateTime getDeletedAt() { return this.deletedAt; }
  public void setDeletedAt(final DateTime deletedAt) { this.deletedAt = deletedAt; }

  public String getEmail() { return this.email; }
  public void setEmail(final String email) { this.email = email; }

  public String getFirstName() { return this.firstName; }
  public void setFirstName(final String firstName) { this.firstName = firstName; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getLastName() { return this.lastName; }
  public void setLastName(final String lastName) { this.lastName = lastName; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public String getTimeZone() { return this.timeZone; }
  public void setTimeZone(final String timeZone) { this.timeZone = timeZone; }

}
