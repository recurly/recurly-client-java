/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.time.ZonedDateTime;

public class GeneralLedgerAccount extends Resource {

  @SerializedName("account_type")
  @Expose
  private String accountType;

  /**
   * Unique code to identify the ledger account. Each code must start with a letter or number. The
   * following special characters are allowed: `-_.,:`
   */
  @SerializedName("code")
  @Expose
  private String code;

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private ZonedDateTime createdAt;

  /** Optional description. */
  @SerializedName("description")
  @Expose
  private String description;

  /**
   * The ID of a general ledger account. General ledger accounts are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  @SerializedName("id")
  @Expose
  private String id;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** Last updated at */
  @SerializedName("updated_at")
  @Expose
  private ZonedDateTime updatedAt;

  public String getAccountType() {
    return this.accountType;
  }

  /** @param accountType */
  public void setAccountType(final String accountType) {
    this.accountType = accountType;
  }

  /**
   * Unique code to identify the ledger account. Each code must start with a letter or number. The
   * following special characters are allowed: `-_.,:`
   */
  public String getCode() {
    return this.code;
  }

  /**
   * @param code Unique code to identify the ledger account. Each code must start with a letter or
   *     number. The following special characters are allowed: `-_.,:`
   */
  public void setCode(final String code) {
    this.code = code;
  }

  /** Created at */
  public ZonedDateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt Created at */
  public void setCreatedAt(final ZonedDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** Optional description. */
  public String getDescription() {
    return this.description;
  }

  /** @param description Optional description. */
  public void setDescription(final String description) {
    this.description = description;
  }

  /**
   * The ID of a general ledger account. General ledger accounts are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  public String getId() {
    return this.id;
  }

  /**
   * @param id The ID of a general ledger account. General ledger accounts are only accessible as a
   *     part of the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  public void setId(final String id) {
    this.id = id;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  /** Last updated at */
  public ZonedDateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt Last updated at */
  public void setUpdatedAt(final ZonedDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
}
