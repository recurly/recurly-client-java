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

public class InvoiceMini extends Resource {

  /** Invoice ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** Invoice number */
  @SerializedName("number")
  @Expose
  private String number;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** Invoice state */
  @SerializedName("state")
  @Expose
  private Constants.InvoiceState state;

  /** Invoice type */
  @SerializedName("type")
  @Expose
  private Constants.InvoiceType type;

  /** Invoice ID */
  public String getId() {
    return this.id;
  }

  /** @param id Invoice ID */
  public void setId(final String id) {
    this.id = id;
  }

  /** Invoice number */
  public String getNumber() {
    return this.number;
  }

  /** @param number Invoice number */
  public void setNumber(final String number) {
    this.number = number;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  /** Invoice state */
  public Constants.InvoiceState getState() {
    return this.state;
  }

  /** @param state Invoice state */
  public void setState(final Constants.InvoiceState state) {
    this.state = state;
  }

  /** Invoice type */
  public Constants.InvoiceType getType() {
    return this.type;
  }

  /** @param type Invoice type */
  public void setType(final Constants.InvoiceType type) {
    this.type = type;
  }
}
