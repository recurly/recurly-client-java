/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class PriceSegment extends Resource {

  /** The price segment code, e.g. `my-price-segment`. */
  @SerializedName("code")
  @Expose
  private String code;

  /** The price segment ID, e.g. `e28zov4fw0v2`. */
  @SerializedName("id")
  @Expose
  private String id;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** The price segment code, e.g. `my-price-segment`. */
  public String getCode() {
    return this.code;
  }

  /**
   * @param code The price segment code, e.g. `my-price-segment`.
   */
  public void setCode(final String code) {
    this.code = code;
  }

  /** The price segment ID, e.g. `e28zov4fw0v2`. */
  public String getId() {
    return this.id;
  }

  /**
   * @param id The price segment ID, e.g. `e28zov4fw0v2`.
   */
  public void setId(final String id) {
    this.id = id;
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
