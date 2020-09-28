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

public class Tier extends Request {

  /** Tier pricing */
  @SerializedName("currencies")
  @Expose
  private List<Pricing> currencies;

  /** Ending quantity */
  @SerializedName("ending_quantity")
  @Expose
  private Integer endingQuantity;

  /** Tier pricing */
  public List<Pricing> getCurrencies() {
    return this.currencies;
  }

  /** @param currencies Tier pricing */
  public void setCurrencies(final List<Pricing> currencies) {
    this.currencies = currencies;
  }

  /** Ending quantity */
  public Integer getEndingQuantity() {
    return this.endingQuantity;
  }

  /** @param endingQuantity Ending quantity */
  public void setEndingQuantity(final Integer endingQuantity) {
    this.endingQuantity = endingQuantity;
  }
}
