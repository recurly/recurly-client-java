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

public class ExternalProductReferenceCreate extends Request {

  /** Represents the connection type. One of the connection types of your enabled App Connectors */
  @SerializedName("external_connection_type")
  @Expose
  private ExternalProductReferenceConnectionType externalConnectionType;

  /**
   * A code which associates the external product to a corresponding object or resource in an
   * external platform like the Apple App Store or Google Play Store.
   */
  @SerializedName("reference_code")
  @Expose
  private String referenceCode;

  /** Represents the connection type. One of the connection types of your enabled App Connectors */
  public ExternalProductReferenceConnectionType getExternalConnectionType() {
    return this.externalConnectionType;
  }

  /**
   * @param externalConnectionType Represents the connection type. One of the connection types of
   *     your enabled App Connectors
   */
  public void setExternalConnectionType(
      final ExternalProductReferenceConnectionType externalConnectionType) {
    this.externalConnectionType = externalConnectionType;
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
}
