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

public class PerformanceObligation extends Resource {

  /** Created At */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /**
   * The ID of a performance obligation. Performance obligations are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  @SerializedName("id")
  @Expose
  private String id;

  /** Performance Obligation Name */
  @SerializedName("name")
  @Expose
  private String name;

  /** Last updated at */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /** Created At */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt Created At */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The ID of a performance obligation. Performance obligations are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  public String getId() {
    return this.id;
  }

  /**
   * @param id The ID of a performance obligation. Performance obligations are only accessible as a
   *     part of the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  public void setId(final String id) {
    this.id = id;
  }

  /** Performance Obligation Name */
  public String getName() {
    return this.name;
  }

  /** @param name Performance Obligation Name */
  public void setName(final String name) {
    this.name = name;
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
