/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Constants;
import com.recurly.v3.Resource;

public class ItemMini extends Resource {

  /** Unique code to identify the item. */
  @SerializedName("code")
  @Expose
  private String code;

  /** Optional, description. */
  @SerializedName("description")
  @Expose
  private String description;

  /** Item ID */
  @SerializedName("id")
  @Expose
  private String id;

  /**
   * This name describes your item and will appear on the invoice when it's purchased on a one time
   * basis.
   */
  @SerializedName("name")
  @Expose
  private String name;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** The current state of the item. */
  @SerializedName("state")
  @Expose
  private Constants.ActiveState state;

  /** Unique code to identify the item. */
  public String getCode() {
    return this.code;
  }

  /** @param code Unique code to identify the item. */
  public void setCode(final String code) {
    this.code = code;
  }

  /** Optional, description. */
  public String getDescription() {
    return this.description;
  }

  /** @param description Optional, description. */
  public void setDescription(final String description) {
    this.description = description;
  }

  /** Item ID */
  public String getId() {
    return this.id;
  }

  /** @param id Item ID */
  public void setId(final String id) {
    this.id = id;
  }

  /**
   * This name describes your item and will appear on the invoice when it's purchased on a one time
   * basis.
   */
  public String getName() {
    return this.name;
  }

  /**
   * @param name This name describes your item and will appear on the invoice when it's purchased on
   *     a one time basis.
   */
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

  /** The current state of the item. */
  public Constants.ActiveState getState() {
    return this.state;
  }

  /** @param state The current state of the item. */
  public void setState(final Constants.ActiveState state) {
    this.state = state;
  }
}
