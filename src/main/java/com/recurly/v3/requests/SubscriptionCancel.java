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

public class SubscriptionCancel extends Request {

  /**
   * The timeframe parameter controls when the expiration takes place. The `bill_date` timeframe
   * causes the subscription to expire when the subscription is scheduled to bill next. The
   * `term_end` timeframe causes the subscription to continue to bill until the end of the
   * subscription term, then expire.
   */
  @SerializedName("timeframe")
  @Expose
  private Constants.Timeframe timeframe;

  /**
   * The timeframe parameter controls when the expiration takes place. The `bill_date` timeframe
   * causes the subscription to expire when the subscription is scheduled to bill next. The
   * `term_end` timeframe causes the subscription to continue to bill until the end of the
   * subscription term, then expire.
   */
  public Constants.Timeframe getTimeframe() {
    return this.timeframe;
  }

  /**
   * @param timeframe The timeframe parameter controls when the expiration takes place. The
   *     `bill_date` timeframe causes the subscription to expire when the subscription is scheduled
   *     to bill next. The `term_end` timeframe causes the subscription to continue to bill until
   *     the end of the subscription term, then expire.
   */
  public void setTimeframe(final Constants.Timeframe timeframe) {
    this.timeframe = timeframe;
  }
}
