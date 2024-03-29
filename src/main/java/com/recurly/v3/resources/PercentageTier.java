/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.math.BigDecimal;

public class PercentageTier extends Resource {

  /**
   * Ending amount for the tier. Allows up to 2 decimal places. Must be left empty if it is the
   * final tier.
   */
  @SerializedName("ending_amount")
  @Expose
  private BigDecimal endingAmount;

  /**
   * The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal
   * places represented as a string.
   */
  @SerializedName("usage_percentage")
  @Expose
  private String usagePercentage;

  /**
   * Ending amount for the tier. Allows up to 2 decimal places. Must be left empty if it is the
   * final tier.
   */
  public BigDecimal getEndingAmount() {
    return this.endingAmount;
  }

  /**
   * @param endingAmount Ending amount for the tier. Allows up to 2 decimal places. Must be left
   *     empty if it is the final tier.
   */
  public void setEndingAmount(final BigDecimal endingAmount) {
    this.endingAmount = endingAmount;
  }

  /**
   * The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal
   * places represented as a string.
   */
  public String getUsagePercentage() {
    return this.usagePercentage;
  }

  /**
   * @param usagePercentage The percentage taken of the monetary amount of usage tracked. This can
   *     be up to 4 decimal places represented as a string.
   */
  public void setUsagePercentage(final String usagePercentage) {
    this.usagePercentage = usagePercentage;
  }
}
