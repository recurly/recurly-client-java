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
import java.math.BigDecimal;

public class SubscriptionAddOnPercentageTier extends Request {

  /** Ending amount */
  @SerializedName("ending_amount")
  @Expose
  private BigDecimal endingAmount;

  /**
   * The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal
   * places represented as a string. A value between 0.0 and 100.0.
   */
  @SerializedName("usage_percentage")
  @Expose
  private String usagePercentage;

  /** Ending amount */
  public BigDecimal getEndingAmount() {
    return this.endingAmount;
  }

  /** @param endingAmount Ending amount */
  public void setEndingAmount(final BigDecimal endingAmount) {
    this.endingAmount = endingAmount;
  }

  /**
   * The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal
   * places represented as a string. A value between 0.0 and 100.0.
   */
  public String getUsagePercentage() {
    return this.usagePercentage;
  }

  /**
   * @param usagePercentage The percentage taken of the monetary amount of usage tracked. This can
   *     be up to 4 decimal places represented as a string. A value between 0.0 and 100.0.
   */
  public void setUsagePercentage(final String usagePercentage) {
    this.usagePercentage = usagePercentage;
  }
}
