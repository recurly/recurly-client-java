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

public class ExternalProductCreate extends Request {

  /** List of external product references of the external product. */
  @SerializedName("external_product_references")
  @Expose
  private List<ExternalProductReferenceBase> externalProductReferences;

  /** External product name. */
  @SerializedName("name")
  @Expose
  private String name;

  /** Recurly plan UUID. */
  @SerializedName("plan_id")
  @Expose
  private String planId;

  /** List of external product references of the external product. */
  public List<ExternalProductReferenceBase> getExternalProductReferences() {
    return this.externalProductReferences;
  }

  /**
   * @param externalProductReferences List of external product references of the external product.
   */
  public void setExternalProductReferences(
      final List<ExternalProductReferenceBase> externalProductReferences) {
    this.externalProductReferences = externalProductReferences;
  }

  /** External product name. */
  public String getName() {
    return this.name;
  }

  /** @param name External product name. */
  public void setName(final String name) {
    this.name = name;
  }

  /** Recurly plan UUID. */
  public String getPlanId() {
    return this.planId;
  }

  /** @param planId Recurly plan UUID. */
  public void setPlanId(final String planId) {
    this.planId = planId;
  }
}
