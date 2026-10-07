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

public class DunningCampaignCreate extends Request {

  /** Campaign code. */
  @SerializedName("code")
  @Expose
  private String code;

  /** Campaign description. */
  @SerializedName("description")
  @Expose
  private String description;

  /**
   * Dunning Cycle settings. One entry per collection method (`automatic`, `manual`, `trial`); each
   * type may appear at most once.
   */
  @SerializedName("dunning_cycles")
  @Expose
  private List<DunningCycleCreate> dunningCycles;

  /** Campaign name. */
  @SerializedName("name")
  @Expose
  private String name;

  /** Campaign code. */
  public String getCode() {
    return this.code;
  }

  /**
   * @param code Campaign code.
   */
  public void setCode(final String code) {
    this.code = code;
  }

  /** Campaign description. */
  public String getDescription() {
    return this.description;
  }

  /**
   * @param description Campaign description.
   */
  public void setDescription(final String description) {
    this.description = description;
  }

  /**
   * Dunning Cycle settings. One entry per collection method (`automatic`, `manual`, `trial`); each
   * type may appear at most once.
   */
  public List<DunningCycleCreate> getDunningCycles() {
    return this.dunningCycles;
  }

  /**
   * @param dunningCycles Dunning Cycle settings. One entry per collection method (`automatic`,
   *     `manual`, `trial`); each type may appear at most once.
   */
  public void setDunningCycles(final List<DunningCycleCreate> dunningCycles) {
    this.dunningCycles = dunningCycles;
  }

  /** Campaign name. */
  public String getName() {
    return this.name;
  }

  /**
   * @param name Campaign name.
   */
  public void setName(final String name) {
    this.name = name;
  }
}
