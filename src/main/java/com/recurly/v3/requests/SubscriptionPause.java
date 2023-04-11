/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import com.recurly.v3.Constants;
import com.recurly.v3.resources.*;
import org.joda.time.DateTime;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class SubscriptionPause extends Request {

  
  /**
   * Number of billing cycles to pause the subscriptions. A value of 0 will cancel any pending pauses on the subscription.
   */
  
  @SerializedName("remaining_pause_cycles")
  @Expose
  private Integer remainingPauseCycles;


  
  /**
   * Number of billing cycles to pause the subscriptions. A value of 0 will cancel any pending pauses on the subscription.
   */
  
  public Integer getRemainingPauseCycles() { return this.remainingPauseCycles; }

  
  /**
   * @param remainingPauseCycles Number of billing cycles to pause the subscriptions. A value of 0 will cancel any pending pauses on the subscription.
   */
  
  public void setRemainingPauseCycles(final Integer remainingPauseCycles) { this.remainingPauseCycles = remainingPauseCycles; }

}
