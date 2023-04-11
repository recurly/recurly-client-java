/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import com.recurly.v3.Constants;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

public class ExternalProduct extends Resource {

  
  /**
   * When the external product was created in Recurly.
   */
  
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  
  /**
   * List of external product references of the external product.
   */
  
  @SerializedName("external_product_references")
  @Expose
  private List<ExternalProductReferenceMini> externalProductReferences;

  
  /**
   * System-generated unique identifier for an external product ID, e.g. `e28zov4fw0v2`.
   */
  
  @SerializedName("id")
  @Expose
  private String id;

  
  /**
   * Name to identify the external product in Recurly.
   */
  
  @SerializedName("name")
  @Expose
  private String name;

  
  /**
   * Object type
   */
  
  @SerializedName("object")
  @Expose
  private String object;

  
  /**
   * Just the important parts.
   */
  
  @SerializedName("plan")
  @Expose
  private PlanMini plan;

  
  /**
   * When the external product was updated in Recurly.
   */
  
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;



  
  /**
   * When the external product was created in Recurly.
   */
  
  public DateTime getCreatedAt() { return this.createdAt; }

  
  /**
   * @param createdAt When the external product was created in Recurly.
   */
  
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  
  /**
   * List of external product references of the external product.
   */
  
  public List<ExternalProductReferenceMini> getExternalProductReferences() { return this.externalProductReferences; }

  
  /**
   * @param externalProductReferences List of external product references of the external product.
   */
  
  public void setExternalProductReferences(final List<ExternalProductReferenceMini> externalProductReferences) { this.externalProductReferences = externalProductReferences; }

  
  /**
   * System-generated unique identifier for an external product ID, e.g. `e28zov4fw0v2`.
   */
  
  public String getId() { return this.id; }

  
  /**
   * @param id System-generated unique identifier for an external product ID, e.g. `e28zov4fw0v2`.
   */
  
  public void setId(final String id) { this.id = id; }

  
  /**
   * Name to identify the external product in Recurly.
   */
  
  public String getName() { return this.name; }

  
  /**
   * @param name Name to identify the external product in Recurly.
   */
  
  public void setName(final String name) { this.name = name; }

  
  /**
   * Object type
   */
  
  public String getObject() { return this.object; }

  
  /**
   * @param object Object type
   */
  
  public void setObject(final String object) { this.object = object; }

  
  /**
   * Just the important parts.
   */
  
  public PlanMini getPlan() { return this.plan; }

  
  /**
   * @param plan Just the important parts.
   */
  
  public void setPlan(final PlanMini plan) { this.plan = plan; }

  
  /**
   * When the external product was updated in Recurly.
   */
  
  public DateTime getUpdatedAt() { return this.updatedAt; }

  
  /**
   * @param updatedAt When the external product was updated in Recurly.
   */
  
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

}
