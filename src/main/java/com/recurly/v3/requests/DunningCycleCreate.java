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
import java.util.List;

public class DunningCycleCreate extends Request {

  /**
   * Only meaningful on the `trial` cycle, where sending `false` removes it. Other cycle types
   * cannot be deactivated.
   */
  @SerializedName("active")
  @Expose
  private Boolean active;

  /**
   * Whether the dunning settings will be applied to manual trials. Only applies to trial cycles.
   */
  @SerializedName("applies_to_manual_trial")
  @Expose
  private Boolean appliesToManualTrial;

  /** Whether the subscription(s) should be cancelled at the end of the dunning cycle. */
  @SerializedName("expire_subscription")
  @Expose
  private Boolean expireSubscription;

  /**
   * Number of days to extend external payment recovery. Only available when the site has external
   * payment retries enabled.
   */
  @SerializedName("external_payment_recovery_extension_days")
  @Expose
  private Integer externalPaymentRecoveryExtensionDays;

  /** Whether the invoice should be failed at the end of the dunning cycle. */
  @SerializedName("fail_invoice")
  @Expose
  private Boolean failInvoice;

  /** Dunning intervals. Required unless `active` is `false`. */
  @SerializedName("intervals")
  @Expose
  private List<DunningIntervalCreate> intervals;

  /**
   * Whether or not to send an extra email immediately to customers whose initial payment attempt
   * fails with either a hard decline or invalid billing info.
   */
  @SerializedName("send_immediately_on_hard_decline")
  @Expose
  private Boolean sendImmediatelyOnHardDecline;

  /** The type of invoice this cycle applies to. */
  @SerializedName("type")
  @Expose
  private Constants.DunningCycleType type;

  /**
   * Only meaningful on the `trial` cycle, where sending `false` removes it. Other cycle types
   * cannot be deactivated.
   */
  public Boolean getActive() {
    return this.active;
  }

  /**
   * @param active Only meaningful on the `trial` cycle, where sending `false` removes it. Other
   *     cycle types cannot be deactivated.
   */
  public void setActive(final Boolean active) {
    this.active = active;
  }

  /**
   * Whether the dunning settings will be applied to manual trials. Only applies to trial cycles.
   */
  public Boolean getAppliesToManualTrial() {
    return this.appliesToManualTrial;
  }

  /**
   * @param appliesToManualTrial Whether the dunning settings will be applied to manual trials. Only
   *     applies to trial cycles.
   */
  public void setAppliesToManualTrial(final Boolean appliesToManualTrial) {
    this.appliesToManualTrial = appliesToManualTrial;
  }

  /** Whether the subscription(s) should be cancelled at the end of the dunning cycle. */
  public Boolean getExpireSubscription() {
    return this.expireSubscription;
  }

  /**
   * @param expireSubscription Whether the subscription(s) should be cancelled at the end of the
   *     dunning cycle.
   */
  public void setExpireSubscription(final Boolean expireSubscription) {
    this.expireSubscription = expireSubscription;
  }

  /**
   * Number of days to extend external payment recovery. Only available when the site has external
   * payment retries enabled.
   */
  public Integer getExternalPaymentRecoveryExtensionDays() {
    return this.externalPaymentRecoveryExtensionDays;
  }

  /**
   * @param externalPaymentRecoveryExtensionDays Number of days to extend external payment recovery.
   *     Only available when the site has external payment retries enabled.
   */
  public void setExternalPaymentRecoveryExtensionDays(
      final Integer externalPaymentRecoveryExtensionDays) {
    this.externalPaymentRecoveryExtensionDays = externalPaymentRecoveryExtensionDays;
  }

  /** Whether the invoice should be failed at the end of the dunning cycle. */
  public Boolean getFailInvoice() {
    return this.failInvoice;
  }

  /**
   * @param failInvoice Whether the invoice should be failed at the end of the dunning cycle.
   */
  public void setFailInvoice(final Boolean failInvoice) {
    this.failInvoice = failInvoice;
  }

  /** Dunning intervals. Required unless `active` is `false`. */
  public List<DunningIntervalCreate> getIntervals() {
    return this.intervals;
  }

  /**
   * @param intervals Dunning intervals. Required unless `active` is `false`.
   */
  public void setIntervals(final List<DunningIntervalCreate> intervals) {
    this.intervals = intervals;
  }

  /**
   * Whether or not to send an extra email immediately to customers whose initial payment attempt
   * fails with either a hard decline or invalid billing info.
   */
  public Boolean getSendImmediatelyOnHardDecline() {
    return this.sendImmediatelyOnHardDecline;
  }

  /**
   * @param sendImmediatelyOnHardDecline Whether or not to send an extra email immediately to
   *     customers whose initial payment attempt fails with either a hard decline or invalid billing
   *     info.
   */
  public void setSendImmediatelyOnHardDecline(final Boolean sendImmediatelyOnHardDecline) {
    this.sendImmediatelyOnHardDecline = sendImmediatelyOnHardDecline;
  }

  /** The type of invoice this cycle applies to. */
  public Constants.DunningCycleType getType() {
    return this.type;
  }

  /**
   * @param type The type of invoice this cycle applies to.
   */
  public void setType(final Constants.DunningCycleType type) {
    this.type = type;
  }
}
