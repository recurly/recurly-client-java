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

public class CustomField extends Request {

  /** Fields must be created in the UI before values can be assigned to them. */
  @SerializedName("name")
  @Expose
  private String name;

  /**
   * The UUID of the record this custom field was automatically copied from. Only present when the
   * field was copied from another record.
   */
  @SerializedName("source_record_id")
  @Expose
  private String sourceRecordId;

  /**
   * The type of record this custom field was automatically copied from. Only present when the field
   * was copied from another record.
   */
  @SerializedName("source_record_type")
  @Expose
  private Constants.SourceRecordType sourceRecordType;

  /** Any values that resemble a credit card number or security code (CVV/CVC) will be rejected. */
  @SerializedName("value")
  @Expose
  private String value;

  /** Fields must be created in the UI before values can be assigned to them. */
  public String getName() {
    return this.name;
  }

  /**
   * @param name Fields must be created in the UI before values can be assigned to them.
   */
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * The UUID of the record this custom field was automatically copied from. Only present when the
   * field was copied from another record.
   */
  public String getSourceRecordId() {
    return this.sourceRecordId;
  }

  /**
   * @param sourceRecordId The UUID of the record this custom field was automatically copied from.
   *     Only present when the field was copied from another record.
   */
  public void setSourceRecordId(final String sourceRecordId) {
    this.sourceRecordId = sourceRecordId;
  }

  /**
   * The type of record this custom field was automatically copied from. Only present when the field
   * was copied from another record.
   */
  public Constants.SourceRecordType getSourceRecordType() {
    return this.sourceRecordType;
  }

  /**
   * @param sourceRecordType The type of record this custom field was automatically copied from.
   *     Only present when the field was copied from another record.
   */
  public void setSourceRecordType(final Constants.SourceRecordType sourceRecordType) {
    this.sourceRecordType = sourceRecordType;
  }

  /** Any values that resemble a credit card number or security code (CVV/CVC) will be rejected. */
  public String getValue() {
    return this.value;
  }

  /**
   * @param value Any values that resemble a credit card number or security code (CVV/CVC) will be
   *     rejected.
   */
  public void setValue(final String value) {
    this.value = value;
  }
}
