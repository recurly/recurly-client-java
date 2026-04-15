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

public class UniqueCouponCodeGenerationResponse extends Resource {

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** An array containing the newly generated unique coupon codes. */
  @SerializedName("unique_coupon_codes")
  @Expose
  private List<UniqueCouponCode> uniqueCouponCodes;

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  /** An array containing the newly generated unique coupon codes. */
  public List<UniqueCouponCode> getUniqueCouponCodes() {
    return this.uniqueCouponCodes;
  }

  /** @param uniqueCouponCodes An array containing the newly generated unique coupon codes. */
  public void setUniqueCouponCodes(final List<UniqueCouponCode> uniqueCouponCodes) {
    this.uniqueCouponCodes = uniqueCouponCodes;
  }
}
