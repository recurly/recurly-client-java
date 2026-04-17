/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class TransactionNextAction extends Resource {

  /** The type of next action required. */
  @SerializedName("type")
  @Expose
  private String type;

  /** The value associated with the next action type. */
  @SerializedName("value")
  @Expose
  private String value;

  /** The type of next action required. */
  public String getType() {
    return this.type;
  }

  /** @param type The type of next action required. */
  public void setType(final String type) {
    this.type = type;
  }

  /** The value associated with the next action type. */
  public String getValue() {
    return this.value;
  }

  /** @param value The value associated with the next action type. */
  public void setValue(final String value) {
    this.value = value;
  }
}
