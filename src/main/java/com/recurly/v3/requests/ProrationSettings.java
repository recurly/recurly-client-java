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

public class ProrationSettings extends Request {

  /** Determines how the amount charged is determined for this change */
  @SerializedName("charge")
  @Expose
  private String charge;

  /** Determines how the amount credited is determined for this change */
  @SerializedName("credit")
  @Expose
  private String credit;

  /** Determines how the amount charged is determined for this change */
  public String getCharge() {
    return this.charge;
  }

  /** @param charge Determines how the amount charged is determined for this change */
  public void setCharge(final String charge) {
    this.charge = charge;
  }

  /** Determines how the amount credited is determined for this change */
  public String getCredit() {
    return this.credit;
  }

  /** @param credit Determines how the amount credited is determined for this change */
  public void setCredit(final String credit) {
    this.credit = credit;
  }
}
