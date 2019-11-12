/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class AccountMini extends Resource {

  /** The unique identifier of the account. */
  @SerializedName("code")
  @Expose
  private String code;

  /** The email address used for communicating with this customer. */
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

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** The unique identifier of the account. */
  public String getCode() {
    return this.code;
  }

  /** @param code The unique identifier of the account. */
  public void setCode(final String code) {
    this.code = code;
  }

  /** The email address used for communicating with this customer. */
  public String getEmail() {
    return this.email;
  }

  /** @param email The email address used for communicating with this customer. */
  public void setEmail(final String email) {
    this.email = email;
  }

  public String getFirstName() {
    return this.firstName;
  }

  /** @param firstName */
  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public String getId() {
    return this.id;
  }

  /** @param id */
  public void setId(final String id) {
    this.id = id;
  }

  public String getLastName() {
    return this.lastName;
  }

  /** @param lastName */
  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }
}
