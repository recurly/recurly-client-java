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

public class ExternalProductUpdate extends Request {

  /** Recurly plan UUID. */
  @SerializedName("plan_id")
  @Expose
  private String planId;

  /** Recurly plan UUID. */
  public String getPlanId() {
    return this.planId;
  }

  /** @param planId Recurly plan UUID. */
  public void setPlanId(final String planId) {
    this.planId = planId;
  }
}
