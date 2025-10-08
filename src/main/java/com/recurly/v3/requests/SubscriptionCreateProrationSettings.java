/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Constants;
import com.recurly.v3.Request;
import com.recurly.v3.resources.*;

public class SubscriptionCreateProrationSettings extends Request {

  /** Determines how the amount charged is determined for this change */
  @SerializedName("charge")
  @Expose
  private Constants.SubscriptionCreateProrationSettingsCharge charge;

  /** Determines how the amount charged is determined for this change */
  public Constants.SubscriptionCreateProrationSettingsCharge getCharge() {
    return this.charge;
  }

  /** @param charge Determines how the amount charged is determined for this change */
  public void setCharge(final Constants.SubscriptionCreateProrationSettingsCharge charge) {
    this.charge = charge;
  }
}
