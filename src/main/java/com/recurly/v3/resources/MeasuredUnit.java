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

public class MeasuredUnit extends Resource {

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** Deleted at */
  @SerializedName("deleted_at")
  @Expose
  private DateTime deletedAt;

  /** Optional internal description. */
  @SerializedName("description")
  @Expose
  private String description;

  /**
   * Display name for the measured unit. Can only contain spaces, underscores and must be
   * alphanumeric.
   */
  @SerializedName("display_name")
  @Expose
  private String displayName;

  /** Item ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** Unique internal name of the measured unit on your site. */
  @SerializedName("name")
  @Expose
  private String name;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** The current state of the measured unit. */
  @SerializedName("state")
  @Expose
  private String state;

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

  /** Deleted at */
  public DateTime getDeletedAt() {
    return this.deletedAt;
  }

  /** @param deletedAt Deleted at */
  public void setDeletedAt(final DateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  /** Optional internal description. */
  public String getDescription() {
    return this.description;
  }

  /** @param description Optional internal description. */
  public void setDescription(final String description) {
    this.description = description;
  }

  /**
   * Display name for the measured unit. Can only contain spaces, underscores and must be
   * alphanumeric.
   */
  public String getDisplayName() {
    return this.displayName;
  }

  /**
   * @param displayName Display name for the measured unit. Can only contain spaces, underscores and
   *     must be alphanumeric.
   */
  public void setDisplayName(final String displayName) {
    this.displayName = displayName;
  }

  /** Item ID */
  public String getId() {
    return this.id;
  }

  /** @param id Item ID */
  public void setId(final String id) {
    this.id = id;
  }

  /** Unique internal name of the measured unit on your site. */
  public String getName() {
    return this.name;
  }

  /** @param name Unique internal name of the measured unit on your site. */
  public void setName(final String name) {
    this.name = name;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  /** The current state of the measured unit. */
  public String getState() {
    return this.state;
  }

  /** @param state The current state of the measured unit. */
  public void setState(final String state) {
    this.state = state;
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
