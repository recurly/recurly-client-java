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

public class ExternalAccount extends Resource {

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** Represents the account code for the external account. */
  @SerializedName("external_account_code")
  @Expose
  private String externalAccountCode;

  /** Represents the connection type. `AppleAppStore` or `GooglePlayStore` */
  @SerializedName("external_connection_type")
  @Expose
  private String externalConnectionType;

  /** UUID of the external_account . */
  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("object")
  @Expose
  private String object;

  /** Last updated at */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /** Created at */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt Created at */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** Represents the account code for the external account. */
  public String getExternalAccountCode() {
    return this.externalAccountCode;
  }

  /** @param externalAccountCode Represents the account code for the external account. */
  public void setExternalAccountCode(final String externalAccountCode) {
    this.externalAccountCode = externalAccountCode;
  }

  /** Represents the connection type. `AppleAppStore` or `GooglePlayStore` */
  public String getExternalConnectionType() {
    return this.externalConnectionType;
  }

  /**
   * @param externalConnectionType Represents the connection type. `AppleAppStore` or
   *     `GooglePlayStore`
   */
  public void setExternalConnectionType(final String externalConnectionType) {
    this.externalConnectionType = externalConnectionType;
  }

  /** UUID of the external_account . */
  public String getId() {
    return this.id;
  }

  /** @param id UUID of the external_account . */
  public void setId(final String id) {
    this.id = id;
  }

  public String getObject() {
    return this.object;
  }

  /** @param object */
  public void setObject(final String object) {
    this.object = object;
  }

  /** Last updated at */
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt Last updated at */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
}
