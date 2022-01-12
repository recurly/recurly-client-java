/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class AccountInvoiceTemplate extends Resource {

  /** Unique ID to identify the invoice template. */
  @SerializedName("id")
  @Expose
  private String id;

  /** Template name */
  @SerializedName("name")
  @Expose
  private String name;

  /** Unique ID to identify the invoice template. */
  public String getId() {
    return this.id;
  }

  /** @param id Unique ID to identify the invoice template. */
  public void setId(final String id) {
    this.id = id;
  }

  /** Template name */
  public String getName() {
    return this.name;
  }

  /** @param name Template name */
  public void setName(final String name) {
    this.name = name;
  }
}
