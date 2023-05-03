/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class TaxDetail extends Resource {

  /**
   * Whether or not the line item is taxable. Only populated for a single LineItem fetch when
   * Avalara for Communications is enabled.
   */
  @SerializedName("billable")
  @Expose
  private Boolean billable;

  /**
   * Provides the jurisdiction level for the Communications tax applied. Example values include
   * city, state and federal. Present only when Avalara for Communications is enabled.
   */
  @SerializedName("level")
  @Expose
  private String level;

  /**
   * Provides the name of the Communications tax applied. Present only when Avalara for
   * Communications is enabled.
   */
  @SerializedName("name")
  @Expose
  private String name;

  /** Provides the tax rate for the region. */
  @SerializedName("rate")
  @Expose
  private Float rate;

  /**
   * Provides the tax region applied on an invoice. For Canadian Sales Tax, this will be either the
   * 2 letter province code or country code. Not present when Avalara for Communications is enabled.
   */
  @SerializedName("region")
  @Expose
  private String region;

  /** The total tax applied for this tax type. */
  @SerializedName("tax")
  @Expose
  private Float tax;

  /**
   * Provides the tax type for the region or type of Comminications tax when Avalara for
   * Communications is enabled. For Canadian Sales Tax, this will be GST, HST, QST or PST.
   */
  @SerializedName("type")
  @Expose
  private String type;

  /**
   * Whether or not the line item is taxable. Only populated for a single LineItem fetch when
   * Avalara for Communications is enabled.
   */
  public Boolean getBillable() {
    return this.billable;
  }

  /**
   * @param billable Whether or not the line item is taxable. Only populated for a single LineItem
   *     fetch when Avalara for Communications is enabled.
   */
  public void setBillable(final Boolean billable) {
    this.billable = billable;
  }

  /**
   * Provides the jurisdiction level for the Communications tax applied. Example values include
   * city, state and federal. Present only when Avalara for Communications is enabled.
   */
  public String getLevel() {
    return this.level;
  }

  /**
   * @param level Provides the jurisdiction level for the Communications tax applied. Example values
   *     include city, state and federal. Present only when Avalara for Communications is enabled.
   */
  public void setLevel(final String level) {
    this.level = level;
  }

  /**
   * Provides the name of the Communications tax applied. Present only when Avalara for
   * Communications is enabled.
   */
  public String getName() {
    return this.name;
  }

  /**
   * @param name Provides the name of the Communications tax applied. Present only when Avalara for
   *     Communications is enabled.
   */
  public void setName(final String name) {
    this.name = name;
  }

  /** Provides the tax rate for the region. */
  public Float getRate() {
    return this.rate;
  }

  /** @param rate Provides the tax rate for the region. */
  public void setRate(final Float rate) {
    this.rate = rate;
  }

  /**
   * Provides the tax region applied on an invoice. For Canadian Sales Tax, this will be either the
   * 2 letter province code or country code. Not present when Avalara for Communications is enabled.
   */
  public String getRegion() {
    return this.region;
  }

  /**
   * @param region Provides the tax region applied on an invoice. For Canadian Sales Tax, this will
   *     be either the 2 letter province code or country code. Not present when Avalara for
   *     Communications is enabled.
   */
  public void setRegion(final String region) {
    this.region = region;
  }

  /** The total tax applied for this tax type. */
  public Float getTax() {
    return this.tax;
  }

  /** @param tax The total tax applied for this tax type. */
  public void setTax(final Float tax) {
    this.tax = tax;
  }

  /**
   * Provides the tax type for the region or type of Comminications tax when Avalara for
   * Communications is enabled. For Canadian Sales Tax, this will be GST, HST, QST or PST.
   */
  public String getType() {
    return this.type;
  }

  /**
   * @param type Provides the tax type for the region or type of Comminications tax when Avalara for
   *     Communications is enabled. For Canadian Sales Tax, this will be GST, HST, QST or PST.
   */
  public void setType(final String type) {
    this.type = type;
  }
}
