/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import com.recurly.v3.resources.*;

public class MeasuredUnitUpdate extends Request {

  /** Optional internal description. */
  @SerializedName("description")
  @Expose
  private String description;

  /** Display name for the measured unit. */
  @SerializedName("display_name")
  @Expose
  private String displayName;

  /** Unique internal name of the measured unit on your site. */
  @SerializedName("name")
  @Expose
  private String name;

  /** Optional internal description. */
  public String getDescription() {
    return this.description;
  }

  /** @param description Optional internal description. */
  public void setDescription(final String description) {
    this.description = description;
  }

  /** Display name for the measured unit. */
  public String getDisplayName() {
    return this.displayName;
  }

  /** @param displayName Display name for the measured unit. */
  public void setDisplayName(final String displayName) {
    this.displayName = displayName;
  }

  /** Unique internal name of the measured unit on your site. */
  public String getName() {
    return this.name;
  }

  /** @param name Unique internal name of the measured unit on your site. */
  public void setName(final String name) {
    this.name = name;
  }
}
