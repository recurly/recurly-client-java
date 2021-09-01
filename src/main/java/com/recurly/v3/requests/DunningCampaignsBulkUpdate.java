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
import java.util.List;

public class DunningCampaignsBulkUpdate extends Request {

  /**
   * List of `plan_codes` associated with the Plans for which the dunning campaign should be
   * updated. Required unless `plan_ids` is present.
   */
  @SerializedName("plan_codes")
  @Expose
  private List<String> planCodes;

  /**
   * List of `plan_ids` associated with the Plans for which the dunning campaign should be updated.
   * Required unless `plan_codes` is present.
   */
  @SerializedName("plan_ids")
  @Expose
  private List<String> planIds;

  /**
   * List of `plan_codes` associated with the Plans for which the dunning campaign should be
   * updated. Required unless `plan_ids` is present.
   */
  public List<String> getPlanCodes() {
    return this.planCodes;
  }

  /**
   * @param planCodes List of `plan_codes` associated with the Plans for which the dunning campaign
   *     should be updated. Required unless `plan_ids` is present.
   */
  public void setPlanCodes(final List<String> planCodes) {
    this.planCodes = planCodes;
  }

  /**
   * List of `plan_ids` associated with the Plans for which the dunning campaign should be updated.
   * Required unless `plan_codes` is present.
   */
  public List<String> getPlanIds() {
    return this.planIds;
  }

  /**
   * @param planIds List of `plan_ids` associated with the Plans for which the dunning campaign
   *     should be updated. Required unless `plan_codes` is present.
   */
  public void setPlanIds(final List<String> planIds) {
    this.planIds = planIds;
  }
}
