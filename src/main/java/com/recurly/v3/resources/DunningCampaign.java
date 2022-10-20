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

public class DunningCampaign extends Resource {

  
  /**
   * Campaign code.
   */
  
  @SerializedName("code")
  @Expose
  private String code;

  
  /**
   * When the current campaign was created in Recurly.
   */
  
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  
  /**
   * Whether or not this is the default campaign for accounts or plans without an assigned dunning campaign.
   */
  
  @SerializedName("default_campaign")
  @Expose
  private Boolean defaultCampaign;

  
  /**
   * When the current campaign was deleted in Recurly.
   */
  
  @SerializedName("deleted_at")
  @Expose
  private DateTime deletedAt;

  
  /**
   * Campaign description.
   */
  
  @SerializedName("description")
  @Expose
  private String description;

  
  /**
   * Dunning Cycle settings.
   */
  
  @SerializedName("dunning_cycles")
  @Expose
  private List<DunningCycle> dunningCycles;

  
  @SerializedName("id")
  @Expose
  private String id;

  
  /**
   * Campaign name.
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
   * When the current campaign was updated in Recurly.
   */
  
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;



  
  /**
   * Campaign code.
   */
  
  public String getCode() { return this.code; }

  
  /**
   * @param code Campaign code.
   */
  
  public void setCode(final String code) { this.code = code; }

  
  /**
   * When the current campaign was created in Recurly.
   */
  
  public DateTime getCreatedAt() { return this.createdAt; }

  
  /**
   * @param createdAt When the current campaign was created in Recurly.
   */
  
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  
  /**
   * Whether or not this is the default campaign for accounts or plans without an assigned dunning campaign.
   */
  
  public Boolean getDefaultCampaign() { return this.defaultCampaign; }

  
  /**
   * @param defaultCampaign Whether or not this is the default campaign for accounts or plans without an assigned dunning campaign.
   */
  
  public void setDefaultCampaign(final Boolean defaultCampaign) { this.defaultCampaign = defaultCampaign; }

  
  /**
   * When the current campaign was deleted in Recurly.
   */
  
  public DateTime getDeletedAt() { return this.deletedAt; }

  
  /**
   * @param deletedAt When the current campaign was deleted in Recurly.
   */
  
  public void setDeletedAt(final DateTime deletedAt) { this.deletedAt = deletedAt; }

  
  /**
   * Campaign description.
   */
  
  public String getDescription() { return this.description; }

  
  /**
   * @param description Campaign description.
   */
  
  public void setDescription(final String description) { this.description = description; }

  
  /**
   * Dunning Cycle settings.
   */
  
  public List<DunningCycle> getDunningCycles() { return this.dunningCycles; }

  
  /**
   * @param dunningCycles Dunning Cycle settings.
   */
  
  public void setDunningCycles(final List<DunningCycle> dunningCycles) { this.dunningCycles = dunningCycles; }

  
  public String getId() { return this.id; }

  
  /**
   * @param id 
   */
  
  public void setId(final String id) { this.id = id; }

  
  /**
   * Campaign name.
   */
  
  public String getName() { return this.name; }

  
  /**
   * @param name Campaign name.
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
   * When the current campaign was updated in Recurly.
   */
  
  public DateTime getUpdatedAt() { return this.updatedAt; }

  
  /**
   * @param updatedAt When the current campaign was updated in Recurly.
   */
  
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

}
