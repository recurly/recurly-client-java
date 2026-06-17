/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;

public class ExternalProductReferenceMini extends Resource {

  /** When the external product was created in Recurly. */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** Source connection platform. */
  @SerializedName("external_connection_type")
  @Expose
  private String externalConnectionType;

  /** System-generated unique identifier for an external product ID, e.g. `e28zov4fw0v2`. */
  @SerializedName("id")
  @Expose
  private String id;

  /** object */
  @SerializedName("object")
  @Expose
  private String object;

  /**
   * A code which associates the external product to a corresponding object or resource in an
   * external platform like the Apple App Store or Google Play Store.
   */
  @SerializedName("reference_code")
  @Expose
  private String referenceCode;

  /** When the external product was updated in Recurly. */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /** When the external product was created in Recurly. */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt When the external product was created in Recurly. */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** Source connection platform. */
  public String getExternalConnectionType() {
    return this.externalConnectionType;
  }

  /** @param externalConnectionType Source connection platform. */
  public void setExternalConnectionType(final String externalConnectionType) {
    this.externalConnectionType = externalConnectionType;
  }

  /** System-generated unique identifier for an external product ID, e.g. `e28zov4fw0v2`. */
  public String getId() {
    return this.id;
  }

  /**
   * @param id System-generated unique identifier for an external product ID, e.g. `e28zov4fw0v2`.
   */
  public void setId(final String id) {
    this.id = id;
  }

  /** object */
  public String getObject() {
    return this.object;
  }

  /** @param object object */
  public void setObject(final String object) {
    this.object = object;
  }

  /**
   * A code which associates the external product to a corresponding object or resource in an
   * external platform like the Apple App Store or Google Play Store.
   */
  public String getReferenceCode() {
    return this.referenceCode;
  }

  /**
   * @param referenceCode A code which associates the external product to a corresponding object or
   *     resource in an external platform like the Apple App Store or Google Play Store.
   */
  public void setReferenceCode(final String referenceCode) {
    this.referenceCode = referenceCode;
  }

  /** When the external product was updated in Recurly. */
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt When the external product was updated in Recurly. */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
}
