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

public class InvoiceTemplate extends Resource {

  /** Invoice template code. */
  @SerializedName("code")
  @Expose
  private String code;

  /** When the invoice template was created in Recurly. */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** Invoice template description. */
  @SerializedName("description")
  @Expose
  private String description;

  @SerializedName("id")
  @Expose
  private String id;

  /** Invoice template name. */
  @SerializedName("name")
  @Expose
  private String name;

  /** When the invoice template was updated in Recurly. */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /** Invoice template code. */
  public String getCode() {
    return this.code;
  }

  /** @param code Invoice template code. */
  public void setCode(final String code) {
    this.code = code;
  }

  /** When the invoice template was created in Recurly. */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt When the invoice template was created in Recurly. */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** Invoice template description. */
  public String getDescription() {
    return this.description;
  }

  /** @param description Invoice template description. */
  public void setDescription(final String description) {
    this.description = description;
  }

  public String getId() {
    return this.id;
  }

  /** @param id */
  public void setId(final String id) {
    this.id = id;
  }

  /** Invoice template name. */
  public String getName() {
    return this.name;
  }

  /** @param name Invoice template name. */
  public void setName(final String name) {
    this.name = name;
  }

  /** When the invoice template was updated in Recurly. */
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt When the invoice template was updated in Recurly. */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
}
