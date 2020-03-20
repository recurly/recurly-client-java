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

public class AddOnCreate extends Request {

  /**
   * Accounting code for invoice line items for this add-on. If no value is provided, it defaults to
   * add-on's code. If `item_code`/`item_id` is part of the request then `accounting_code` must be
   * absent.
   */
  @SerializedName("accounting_code")
  @Expose
  private String accountingCode;

  /**
   * The unique identifier for the add-on within its plan. If `item_code`/`item_id` is part of the
   * request then `code` must be absent. If `item_code`/`item_id` is not present `code` is required.
   */
  @SerializedName("code")
  @Expose
  private String code;

  /**
   * If `item_code`/`item_id` is part of the request and the item has a default currency then
   * `currencies` is optional. If the item does not have a default currency, then `currencies` is
   * required. If `item_code`/`item_id` is not present `currencies` is required.
   */
  @SerializedName("currencies")
  @Expose
  private List<AddOnPricing> currencies;

  /** Default quantity for the hosted pages. */
  @SerializedName("default_quantity")
  @Expose
  private Integer defaultQuantity;

  /** Determines if the quantity field is displayed on the hosted pages for the add-on. */
  @SerializedName("display_quantity")
  @Expose
  private Boolean displayQuantity;

  /**
   * Unique code to identify an item. Avaliable when the `Catalog: Item Add-Ons` feature is enabled.
   * If `item_id` and `item_code` are both present, `item_id` will be used.
   */
  @SerializedName("item_code")
  @Expose
  private String itemCode;

  /**
   * System-generated unique identifier for an item. Available when the `Catalog: Item Add-Ons`
   * feature is enabled. If `item_id` and `item_code` are both present, `item_id` will be used.
   */
  @SerializedName("item_id")
  @Expose
  private String itemId;

  /**
   * Describes your add-on and will appear in subscribers' invoices. If `item_code`/`item_id` is
   * part of the request then `name` must be absent. If `item_code`/`item_id` is not present `name`
   * is required.
   */
  @SerializedName("name")
  @Expose
  private String name;

  /** Plan ID */
  @SerializedName("plan_id")
  @Expose
  private String planId;

  /**
   * When this add-on is invoiced, the line item will use this revenue schedule. If
   * `item_code`/`item_id` is part of the request then `revenue_schedule_type` must be absent in the
   * request as the value will be set from the item.
   */
  @SerializedName("revenue_schedule_type")
  @Expose
  private String revenueScheduleType;

  /**
   * Optional field used by Avalara, Vertex, and Recurly's EU VAT tax feature to determine taxation
   * rules. If you have your own AvaTax or Vertex account configured, use their tax codes to assign
   * specific tax rules. If you are using Recurly's EU VAT feature, you can use values of `unknown`,
   * `physical`, or `digital`. If `item_code`/`item_id` is part of the request then `tax_code` must
   * be absent.
   */
  @SerializedName("tax_code")
  @Expose
  private String taxCode;

  /**
   * Accounting code for invoice line items for this add-on. If no value is provided, it defaults to
   * add-on's code. If `item_code`/`item_id` is part of the request then `accounting_code` must be
   * absent.
   */
  public String getAccountingCode() {
    return this.accountingCode;
  }

  /**
   * @param accountingCode Accounting code for invoice line items for this add-on. If no value is
   *     provided, it defaults to add-on's code. If `item_code`/`item_id` is part of the request
   *     then `accounting_code` must be absent.
   */
  public void setAccountingCode(final String accountingCode) {
    this.accountingCode = accountingCode;
  }

  /**
   * The unique identifier for the add-on within its plan. If `item_code`/`item_id` is part of the
   * request then `code` must be absent. If `item_code`/`item_id` is not present `code` is required.
   */
  public String getCode() {
    return this.code;
  }

  /**
   * @param code The unique identifier for the add-on within its plan. If `item_code`/`item_id` is
   *     part of the request then `code` must be absent. If `item_code`/`item_id` is not present
   *     `code` is required.
   */
  public void setCode(final String code) {
    this.code = code;
  }

  /**
   * If `item_code`/`item_id` is part of the request and the item has a default currency then
   * `currencies` is optional. If the item does not have a default currency, then `currencies` is
   * required. If `item_code`/`item_id` is not present `currencies` is required.
   */
  public List<AddOnPricing> getCurrencies() {
    return this.currencies;
  }

  /**
   * @param currencies If `item_code`/`item_id` is part of the request and the item has a default
   *     currency then `currencies` is optional. If the item does not have a default currency, then
   *     `currencies` is required. If `item_code`/`item_id` is not present `currencies` is required.
   */
  public void setCurrencies(final List<AddOnPricing> currencies) {
    this.currencies = currencies;
  }

  /** Default quantity for the hosted pages. */
  public Integer getDefaultQuantity() {
    return this.defaultQuantity;
  }

  /** @param defaultQuantity Default quantity for the hosted pages. */
  public void setDefaultQuantity(final Integer defaultQuantity) {
    this.defaultQuantity = defaultQuantity;
  }

  /** Determines if the quantity field is displayed on the hosted pages for the add-on. */
  public Boolean getDisplayQuantity() {
    return this.displayQuantity;
  }

  /**
   * @param displayQuantity Determines if the quantity field is displayed on the hosted pages for
   *     the add-on.
   */
  public void setDisplayQuantity(final Boolean displayQuantity) {
    this.displayQuantity = displayQuantity;
  }

  /**
   * Unique code to identify an item. Avaliable when the `Catalog: Item Add-Ons` feature is enabled.
   * If `item_id` and `item_code` are both present, `item_id` will be used.
   */
  public String getItemCode() {
    return this.itemCode;
  }

  /**
   * @param itemCode Unique code to identify an item. Avaliable when the `Catalog: Item Add-Ons`
   *     feature is enabled. If `item_id` and `item_code` are both present, `item_id` will be used.
   */
  public void setItemCode(final String itemCode) {
    this.itemCode = itemCode;
  }

  /**
   * System-generated unique identifier for an item. Available when the `Catalog: Item Add-Ons`
   * feature is enabled. If `item_id` and `item_code` are both present, `item_id` will be used.
   */
  public String getItemId() {
    return this.itemId;
  }

  /**
   * @param itemId System-generated unique identifier for an item. Available when the `Catalog: Item
   *     Add-Ons` feature is enabled. If `item_id` and `item_code` are both present, `item_id` will
   *     be used.
   */
  public void setItemId(final String itemId) {
    this.itemId = itemId;
  }

  /**
   * Describes your add-on and will appear in subscribers' invoices. If `item_code`/`item_id` is
   * part of the request then `name` must be absent. If `item_code`/`item_id` is not present `name`
   * is required.
   */
  public String getName() {
    return this.name;
  }

  /**
   * @param name Describes your add-on and will appear in subscribers' invoices. If
   *     `item_code`/`item_id` is part of the request then `name` must be absent. If
   *     `item_code`/`item_id` is not present `name` is required.
   */
  public void setName(final String name) {
    this.name = name;
  }

  /** Plan ID */
  public String getPlanId() {
    return this.planId;
  }

  /** @param planId Plan ID */
  public void setPlanId(final String planId) {
    this.planId = planId;
  }

  /**
   * When this add-on is invoiced, the line item will use this revenue schedule. If
   * `item_code`/`item_id` is part of the request then `revenue_schedule_type` must be absent in the
   * request as the value will be set from the item.
   */
  public String getRevenueScheduleType() {
    return this.revenueScheduleType;
  }

  /**
   * @param revenueScheduleType When this add-on is invoiced, the line item will use this revenue
   *     schedule. If `item_code`/`item_id` is part of the request then `revenue_schedule_type` must
   *     be absent in the request as the value will be set from the item.
   */
  public void setRevenueScheduleType(final String revenueScheduleType) {
    this.revenueScheduleType = revenueScheduleType;
  }

  /**
   * Optional field used by Avalara, Vertex, and Recurly's EU VAT tax feature to determine taxation
   * rules. If you have your own AvaTax or Vertex account configured, use their tax codes to assign
   * specific tax rules. If you are using Recurly's EU VAT feature, you can use values of `unknown`,
   * `physical`, or `digital`. If `item_code`/`item_id` is part of the request then `tax_code` must
   * be absent.
   */
  public String getTaxCode() {
    return this.taxCode;
  }

  /**
   * @param taxCode Optional field used by Avalara, Vertex, and Recurly's EU VAT tax feature to
   *     determine taxation rules. If you have your own AvaTax or Vertex account configured, use
   *     their tax codes to assign specific tax rules. If you are using Recurly's EU VAT feature,
   *     you can use values of `unknown`, `physical`, or `digital`. If `item_code`/`item_id` is part
   *     of the request then `tax_code` must be absent.
   */
  public void setTaxCode(final String taxCode) {
    this.taxCode = taxCode;
  }
}
