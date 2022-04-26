/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Constants;
import com.recurly.v3.Resource;

public class AddOnMini extends Resource {

  /**
   * Accounting code for invoice line items for this add-on. If no value is provided, it defaults to
   * add-on's code.
   */
  @SerializedName("accounting_code")
  @Expose
  private String accountingCode;

  /** Whether the add-on type is fixed, or usage-based. */
  @SerializedName("add_on_type")
  @Expose
  private Constants.AddOnType addOnType;

  /** The unique identifier for the add-on within its plan. */
  @SerializedName("code")
  @Expose
  private String code;

  /** Optional, stock keeping unit to link the item to other inventory systems. */
  @SerializedName("external_sku")
  @Expose
  private String externalSku;

  /** Add-on ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** Item ID */
  @SerializedName("item_id")
  @Expose
  private String itemId;

  /** System-generated unique identifier for an measured unit associated with the add-on. */
  @SerializedName("measured_unit_id")
  @Expose
  private String measuredUnitId;

  /** Describes your add-on and will appear in subscribers' invoices. */
  @SerializedName("name")
  @Expose
  private String name;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /**
   * The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal
   * places. A value between 0.0 and 100.0, represented as a string.
   */
  @SerializedName("usage_percentage")
  @Expose
  private String usagePercentage;

  /** Type of usage, returns usage type if `add_on_type` is `usage`. */
  @SerializedName("usage_type")
  @Expose
  private Constants.UsageType usageType;

  /**
   * Accounting code for invoice line items for this add-on. If no value is provided, it defaults to
   * add-on's code.
   */
  public String getAccountingCode() {
    return this.accountingCode;
  }

  /**
   * @param accountingCode Accounting code for invoice line items for this add-on. If no value is
   *     provided, it defaults to add-on's code.
   */
  public void setAccountingCode(final String accountingCode) {
    this.accountingCode = accountingCode;
  }

  /** Whether the add-on type is fixed, or usage-based. */
  public Constants.AddOnType getAddOnType() {
    return this.addOnType;
  }

  /** @param addOnType Whether the add-on type is fixed, or usage-based. */
  public void setAddOnType(final Constants.AddOnType addOnType) {
    this.addOnType = addOnType;
  }

  /** The unique identifier for the add-on within its plan. */
  public String getCode() {
    return this.code;
  }

  /** @param code The unique identifier for the add-on within its plan. */
  public void setCode(final String code) {
    this.code = code;
  }

  /** Optional, stock keeping unit to link the item to other inventory systems. */
  public String getExternalSku() {
    return this.externalSku;
  }

  /**
   * @param externalSku Optional, stock keeping unit to link the item to other inventory systems.
   */
  public void setExternalSku(final String externalSku) {
    this.externalSku = externalSku;
  }

  /** Add-on ID */
  public String getId() {
    return this.id;
  }

  /** @param id Add-on ID */
  public void setId(final String id) {
    this.id = id;
  }

  /** Item ID */
  public String getItemId() {
    return this.itemId;
  }

  /** @param itemId Item ID */
  public void setItemId(final String itemId) {
    this.itemId = itemId;
  }

  /** System-generated unique identifier for an measured unit associated with the add-on. */
  public String getMeasuredUnitId() {
    return this.measuredUnitId;
  }

  /**
   * @param measuredUnitId System-generated unique identifier for an measured unit associated with
   *     the add-on.
   */
  public void setMeasuredUnitId(final String measuredUnitId) {
    this.measuredUnitId = measuredUnitId;
  }

  /** Describes your add-on and will appear in subscribers' invoices. */
  public String getName() {
    return this.name;
  }

  /** @param name Describes your add-on and will appear in subscribers' invoices. */
  public void setName(final String name) {
    this.name = name;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  /**
   * The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal
   * places. A value between 0.0 and 100.0, represented as a string.
   */
  public String getUsagePercentage() {
    return this.usagePercentage;
  }

  /**
   * @param usagePercentage The percentage taken of the monetary amount of usage tracked. This can
   *     be up to 4 decimal places. A value between 0.0 and 100.0, represented as a string.
   */
  public void setUsagePercentage(final String usagePercentage) {
    this.usagePercentage = usagePercentage;
  }

  /** Type of usage, returns usage type if `add_on_type` is `usage`. */
  public Constants.UsageType getUsageType() {
    return this.usageType;
  }

  /** @param usageType Type of usage, returns usage type if `add_on_type` is `usage`. */
  public void setUsageType(final Constants.UsageType usageType) {
    this.usageType = usageType;
  }
}
