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
import org.joda.time.DateTime;

public class UsageCreate extends Request {

  /**
   * The amount of usage. Can be positive, negative, or 0. No decimals allowed, we will strip them.
   * If the usage-based add-on is billed with a percentage, your usage will be a monetary amount you
   * will want to format in cents. (e.g., $5.00 is "500").
   */
  @SerializedName("amount")
  @Expose
  private Float amount;

  /**
   * Custom field for recording the id in your own system associated with the usage, so you can
   * provide auditable usage displays to your customers using a GET on this endpoint.
   */
  @SerializedName("merchant_tag")
  @Expose
  private String merchantTag;

  /** When the usage was recorded in your system. */
  @SerializedName("recording_timestamp")
  @Expose
  private DateTime recordingTimestamp;

  /**
   * When the usage actually happened. This will define the line item dates this usage is billed
   * under and is important for revenue recognition.
   */
  @SerializedName("usage_timestamp")
  @Expose
  private DateTime usageTimestamp;

  /**
   * The amount of usage. Can be positive, negative, or 0. No decimals allowed, we will strip them.
   * If the usage-based add-on is billed with a percentage, your usage will be a monetary amount you
   * will want to format in cents. (e.g., $5.00 is "500").
   */
  public Float getAmount() {
    return this.amount;
  }

  /**
   * @param amount The amount of usage. Can be positive, negative, or 0. No decimals allowed, we
   *     will strip them. If the usage-based add-on is billed with a percentage, your usage will be
   *     a monetary amount you will want to format in cents. (e.g., $5.00 is "500").
   */
  public void setAmount(final Float amount) {
    this.amount = amount;
  }

  /**
   * Custom field for recording the id in your own system associated with the usage, so you can
   * provide auditable usage displays to your customers using a GET on this endpoint.
   */
  public String getMerchantTag() {
    return this.merchantTag;
  }

  /**
   * @param merchantTag Custom field for recording the id in your own system associated with the
   *     usage, so you can provide auditable usage displays to your customers using a GET on this
   *     endpoint.
   */
  public void setMerchantTag(final String merchantTag) {
    this.merchantTag = merchantTag;
  }

  /** When the usage was recorded in your system. */
  public DateTime getRecordingTimestamp() {
    return this.recordingTimestamp;
  }

  /** @param recordingTimestamp When the usage was recorded in your system. */
  public void setRecordingTimestamp(final DateTime recordingTimestamp) {
    this.recordingTimestamp = recordingTimestamp;
  }

  /**
   * When the usage actually happened. This will define the line item dates this usage is billed
   * under and is important for revenue recognition.
   */
  public DateTime getUsageTimestamp() {
    return this.usageTimestamp;
  }

  /**
   * @param usageTimestamp When the usage actually happened. This will define the line item dates
   *     this usage is billed under and is important for revenue recognition.
   */
  public void setUsageTimestamp(final DateTime usageTimestamp) {
    this.usageTimestamp = usageTimestamp;
  }
}
