/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.util.List;

public class DunningCampaignsBulkUpdateResponse extends Resource {

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** An array containing all of the `Plan` resources that have been updated. */
  @SerializedName("plans")
  @Expose
  private List<Plan> plans;

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  /** An array containing all of the `Plan` resources that have been updated. */
  public List<Plan> getPlans() {
    return this.plans;
  }

  /** @param plans An array containing all of the `Plan` resources that have been updated. */
  public void setPlans(final List<Plan> plans) {
    this.plans = plans;
  }
}
