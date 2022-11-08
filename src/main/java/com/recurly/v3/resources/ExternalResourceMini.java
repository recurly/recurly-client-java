/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class ExternalResourceMini extends Resource {

  /**
   * Identifier or URL reference where the resource is canonically available in the external
   * platform.
   */
  @SerializedName("external_object_reference")
  @Expose
  private String externalObjectReference;

  /** System-generated unique identifier for an external resource ID, e.g. `e28zov4fw0v2`. */
  @SerializedName("id")
  @Expose
  private String id;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /**
   * Identifier or URL reference where the resource is canonically available in the external
   * platform.
   */
  public String getExternalObjectReference() {
    return this.externalObjectReference;
  }

  /**
   * @param externalObjectReference Identifier or URL reference where the resource is canonically
   *     available in the external platform.
   */
  public void setExternalObjectReference(final String externalObjectReference) {
    this.externalObjectReference = externalObjectReference;
  }

  /** System-generated unique identifier for an external resource ID, e.g. `e28zov4fw0v2`. */
  public String getId() {
    return this.id;
  }

  /**
   * @param id System-generated unique identifier for an external resource ID, e.g. `e28zov4fw0v2`.
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
}
