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
import org.joda.time.DateTime;

public class CouponRedemptionRemainingDuration extends Resource {

  /**
   * Present when `type` is `temporal`. The datetime after which this redemption will no longer
   * apply.
   */
  @SerializedName("expires_at")
  @Expose
  private DateTime expiresAt;

  /**
   * The coupon's duration type. `temporal` includes an `expires_at` timestamp. `forever` and
   * `single_use` have no additional fields.
   */
  @SerializedName("type")
  @Expose
  private Constants.CouponDuration type;

  /**
   * Present when `type` is `temporal`. The datetime after which this redemption will no longer
   * apply.
   */
  public DateTime getExpiresAt() {
    return this.expiresAt;
  }

  /**
   * @param expiresAt Present when `type` is `temporal`. The datetime after which this redemption
   *     will no longer apply.
   */
  public void setExpiresAt(final DateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The coupon's duration type. `temporal` includes an `expires_at` timestamp. `forever` and
   * `single_use` have no additional fields.
   */
  public Constants.CouponDuration getType() {
    return this.type;
  }

  /**
   * @param type The coupon's duration type. `temporal` includes an `expires_at` timestamp.
   *     `forever` and `single_use` have no additional fields.
   */
  public void setType(final Constants.CouponDuration type) {
    this.type = type;
  }
}
