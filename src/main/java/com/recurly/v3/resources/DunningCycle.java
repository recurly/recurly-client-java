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

public class DunningCycle extends Resource {

  
  /**
   * Whether the dunning settings will be applied to manual trials. Only applies to trial cycles.
   */
  
  @SerializedName("applies_to_manual_trial")
  @Expose
  private Boolean appliesToManualTrial;

  
  /**
   * When the current settings were created in Recurly.
   */
  
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  
  /**
   * Whether the subscription(s) should be cancelled at the end of the dunning cycle.
   */
  
  @SerializedName("expire_subscription")
  @Expose
  private Boolean expireSubscription;

  
  /**
   * Whether the invoice should be failed at the end of the dunning cycle.
   */
  
  @SerializedName("fail_invoice")
  @Expose
  private Boolean failInvoice;

  
  /**
   * The number of days after a transaction failure before the first dunning email is sent.
   */
  
  @SerializedName("first_communication_interval")
  @Expose
  private Integer firstCommunicationInterval;

  
  /**
   * Dunning intervals.
   */
  
  @SerializedName("intervals")
  @Expose
  private List<DunningInterval> intervals;

  
  /**
   * Whether or not to send an extra email immediately to customers whose initial payment attempt fails with either a hard decline or invalid billing info.
   */
  
  @SerializedName("send_immediately_on_hard_decline")
  @Expose
  private Boolean sendImmediatelyOnHardDecline;

  
  /**
   * The number of days between the first dunning email being sent and the end of the dunning cycle.
   */
  
  @SerializedName("total_dunning_days")
  @Expose
  private Integer totalDunningDays;

  
  /**
   * The number of days between a transaction failure and the end of the dunning cycle.
   */
  
  @SerializedName("total_recycling_days")
  @Expose
  private Integer totalRecyclingDays;

  
  /**
   * The type of invoice this cycle applies to.
   */
  
  @SerializedName("type")
  @Expose
  private Constants.DunningCycleType type;

  
  /**
   * When the current settings were updated in Recurly.
   */
  
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  
  /**
   * Current campaign version.
   */
  
  @SerializedName("version")
  @Expose
  private Integer version;



  
  /**
   * Whether the dunning settings will be applied to manual trials. Only applies to trial cycles.
   */
  
  public Boolean getAppliesToManualTrial() { return this.appliesToManualTrial; }

  
  /**
   * @param appliesToManualTrial Whether the dunning settings will be applied to manual trials. Only applies to trial cycles.
   */
  
  public void setAppliesToManualTrial(final Boolean appliesToManualTrial) { this.appliesToManualTrial = appliesToManualTrial; }

  
  /**
   * When the current settings were created in Recurly.
   */
  
  public DateTime getCreatedAt() { return this.createdAt; }

  
  /**
   * @param createdAt When the current settings were created in Recurly.
   */
  
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  
  /**
   * Whether the subscription(s) should be cancelled at the end of the dunning cycle.
   */
  
  public Boolean getExpireSubscription() { return this.expireSubscription; }

  
  /**
   * @param expireSubscription Whether the subscription(s) should be cancelled at the end of the dunning cycle.
   */
  
  public void setExpireSubscription(final Boolean expireSubscription) { this.expireSubscription = expireSubscription; }

  
  /**
   * Whether the invoice should be failed at the end of the dunning cycle.
   */
  
  public Boolean getFailInvoice() { return this.failInvoice; }

  
  /**
   * @param failInvoice Whether the invoice should be failed at the end of the dunning cycle.
   */
  
  public void setFailInvoice(final Boolean failInvoice) { this.failInvoice = failInvoice; }

  
  /**
   * The number of days after a transaction failure before the first dunning email is sent.
   */
  
  public Integer getFirstCommunicationInterval() { return this.firstCommunicationInterval; }

  
  /**
   * @param firstCommunicationInterval The number of days after a transaction failure before the first dunning email is sent.
   */
  
  public void setFirstCommunicationInterval(final Integer firstCommunicationInterval) { this.firstCommunicationInterval = firstCommunicationInterval; }

  
  /**
   * Dunning intervals.
   */
  
  public List<DunningInterval> getIntervals() { return this.intervals; }

  
  /**
   * @param intervals Dunning intervals.
   */
  
  public void setIntervals(final List<DunningInterval> intervals) { this.intervals = intervals; }

  
  /**
   * Whether or not to send an extra email immediately to customers whose initial payment attempt fails with either a hard decline or invalid billing info.
   */
  
  public Boolean getSendImmediatelyOnHardDecline() { return this.sendImmediatelyOnHardDecline; }

  
  /**
   * @param sendImmediatelyOnHardDecline Whether or not to send an extra email immediately to customers whose initial payment attempt fails with either a hard decline or invalid billing info.
   */
  
  public void setSendImmediatelyOnHardDecline(final Boolean sendImmediatelyOnHardDecline) { this.sendImmediatelyOnHardDecline = sendImmediatelyOnHardDecline; }

  
  /**
   * The number of days between the first dunning email being sent and the end of the dunning cycle.
   */
  
  public Integer getTotalDunningDays() { return this.totalDunningDays; }

  
  /**
   * @param totalDunningDays The number of days between the first dunning email being sent and the end of the dunning cycle.
   */
  
  public void setTotalDunningDays(final Integer totalDunningDays) { this.totalDunningDays = totalDunningDays; }

  
  /**
   * The number of days between a transaction failure and the end of the dunning cycle.
   */
  
  public Integer getTotalRecyclingDays() { return this.totalRecyclingDays; }

  
  /**
   * @param totalRecyclingDays The number of days between a transaction failure and the end of the dunning cycle.
   */
  
  public void setTotalRecyclingDays(final Integer totalRecyclingDays) { this.totalRecyclingDays = totalRecyclingDays; }

  
  /**
   * The type of invoice this cycle applies to.
   */
  
  public Constants.DunningCycleType getType() { return this.type; }

  
  /**
   * @param type The type of invoice this cycle applies to.
   */
  
  public void setType(final Constants.DunningCycleType type) { this.type = type; }

  
  /**
   * When the current settings were updated in Recurly.
   */
  
  public DateTime getUpdatedAt() { return this.updatedAt; }

  
  /**
   * @param updatedAt When the current settings were updated in Recurly.
   */
  
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

  
  /**
   * Current campaign version.
   */
  
  public Integer getVersion() { return this.version; }

  
  /**
   * @param version Current campaign version.
   */
  
  public void setVersion(final Integer version) { this.version = version; }

}
