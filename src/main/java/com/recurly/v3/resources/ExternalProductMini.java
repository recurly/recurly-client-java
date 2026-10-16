/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class ExternalProductMini extends Resource {

  /** External product ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** The merchant-facing name of the external product. */
  @SerializedName("name")
  @Expose
  private String name;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** External product ID */
  public String getId() {
    return this.id;
  }

  /**
   * @param id External product ID
   */
  public void setId(final String id) {
    this.id = id;
  }

  /** The merchant-facing name of the external product. */
  public String getName() {
    return this.name;
  }

  /**
   * @param name The merchant-facing name of the external product.
   */
  public void setName(final String name) {
    this.name = name;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /**
   * @param object Object type
   */
  public void setObject(final String object) {
    this.object = object;
  }
}
