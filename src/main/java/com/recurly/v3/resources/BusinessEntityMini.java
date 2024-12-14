/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class BusinessEntityMini extends Resource {

  /** The entity code of the business entity. */
  @SerializedName("code")
  @Expose
  private String code;

  /** Business entity ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** This name describes your business entity and will appear on the invoice. */
  @SerializedName("name")
  @Expose
  private String name;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** The entity code of the business entity. */
  public String getCode() {
    return this.code;
  }

  /** @param code The entity code of the business entity. */
  public void setCode(final String code) {
    this.code = code;
  }

  /** Business entity ID */
  public String getId() {
    return this.id;
  }

  /** @param id Business entity ID */
  public void setId(final String id) {
    this.id = id;
  }

  /** This name describes your business entity and will appear on the invoice. */
  public String getName() {
    return this.name;
  }

  /** @param name This name describes your business entity and will appear on the invoice. */
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
}
