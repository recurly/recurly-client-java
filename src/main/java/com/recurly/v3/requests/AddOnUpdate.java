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
import java.math.BigDecimal;
import java.util.List;

public class AddOnUpdate extends Request {

  /**
   * Accounting code for invoice line items for this add-on. If no value is provided, it defaults to
   * add-on's code. If an `Item` is associated to the `AddOn` then `accounting code` must be absent.
   */
  @SerializedName("accounting_code")
  @Expose
  private String accountingCode;

  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service
   * type describe how the add-on is taxed. Refer to [the
   * documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   * for more available t/s types. If an `Item` is associated to the `AddOn`, then the
   * `avalara_service_type` must be absent.
   */
  @SerializedName("avalara_service_type")
  @Expose
  private Integer avalaraServiceType;

  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service
   * type describe how the add-on is taxed. Refer to [the
   * documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   * for more available t/s types. If an `Item` is associated to the `AddOn`, then the
   * `avalara_transaction_type` must be absent.
   */
  @SerializedName("avalara_transaction_type")
  @Expose
  private Integer avalaraTransactionType;

  /**
   * The unique identifier for the add-on within its plan. If an `Item` is associated to the `AddOn`
   * then `code` must be absent.
   */
  @SerializedName("code")
  @Expose
  private String code;

  /**
   * If the add-on's `tier_type` is `tiered`, `volume`, or `stairstep`, then currencies must be
   * absent. Must also be absent if `add_on_type` is `usage` and `usage_type` is `percentage`.
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

  /** Add-on ID */
  @SerializedName("id")
  @Expose
  private String id;

  /**
   * System-generated unique identifier for a measured unit to be associated with the add-on. Either
   * `measured_unit_id` or `measured_unit_name` are required when `add_on_type` is `usage`. If
   * `measured_unit_id` and `measured_unit_name` are both present, `measured_unit_id` will be used.
   */
  @SerializedName("measured_unit_id")
  @Expose
  private String measuredUnitId;

  /**
   * Name of a measured unit to be associated with the add-on. Either `measured_unit_id` or
   * `measured_unit_name` are required when `add_on_type` is `usage`. If `measured_unit_id` and
   * `measured_unit_name` are both present, `measured_unit_id` will be used.
   */
  @SerializedName("measured_unit_name")
  @Expose
  private String measuredUnitName;

  /**
   * Describes your add-on and will appear in subscribers' invoices. If an `Item` is associated to
   * the `AddOn` then `name` must be absent.
   */
  @SerializedName("name")
  @Expose
  private String name;

  /**
   * Whether the add-on is optional for the customer to include in their purchase on the hosted
   * payment page. If false, the add-on will be included when a subscription is created through the
   * Recurly UI. However, the add-on will not be included when a subscription is created through the
   * API.
   */
  @SerializedName("optional")
  @Expose
  private Boolean optional;

  /**
   * When this add-on is invoiced, the line item will use this revenue schedule. If
   * `item_code`/`item_id` is part of the request then `revenue_schedule_type` must be absent in the
   * request as the value will be set from the item.
   */
  @SerializedName("revenue_schedule_type")
  @Expose
  private Constants.RevenueScheduleType revenueScheduleType;

  /**
   * Optional field used by Avalara, Vertex, and Recurly's EU VAT tax feature to determine taxation
   * rules. If you have your own AvaTax or Vertex account configured, use their tax codes to assign
   * specific tax rules. If you are using Recurly's EU VAT feature, you can use values of `unknown`,
   * `physical`, or `digital`. If an `Item` is associated to the `AddOn` then `tax code` must be
   * absent.
   */
  @SerializedName("tax_code")
  @Expose
  private String taxCode;

  /**
   * If the tier_type is `flat`, then `tiers` must be absent. The `tiers` object must include one to
   * many tiers with `ending_quantity` and `unit_amount` for the desired `currencies`, or
   * alternatively, `usage_percentage` for usage percentage type usage add ons. There must be one
   * tier with an `ending_quantity` of 999999999 which is the default if not provided.
   */
  @SerializedName("tiers")
  @Expose
  private List<Tier> tiers;

  /**
   * The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal
   * places. A value between 0.0 and 100.0. Required if `add_on_type` is usage, `tier_type` is
   * `flat` and `usage_type` is percentage. Must be omitted otherwise.
   */
  @SerializedName("usage_percentage")
  @Expose
  private BigDecimal usagePercentage;

  /**
   * Accounting code for invoice line items for this add-on. If no value is provided, it defaults to
   * add-on's code. If an `Item` is associated to the `AddOn` then `accounting code` must be absent.
   */
  public String getAccountingCode() {
    return this.accountingCode;
  }

  /**
   * @param accountingCode Accounting code for invoice line items for this add-on. If no value is
   *     provided, it defaults to add-on's code. If an `Item` is associated to the `AddOn` then
   *     `accounting code` must be absent.
   */
  public void setAccountingCode(final String accountingCode) {
    this.accountingCode = accountingCode;
  }

  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service
   * type describe how the add-on is taxed. Refer to [the
   * documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   * for more available t/s types. If an `Item` is associated to the `AddOn`, then the
   * `avalara_service_type` must be absent.
   */
  public Integer getAvalaraServiceType() {
    return this.avalaraServiceType;
  }

  /**
   * @param avalaraServiceType Used by Avalara for Communications taxes. The transaction type in
   *     combination with the service type describe how the add-on is taxed. Refer to [the
   *     documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   *     for more available t/s types. If an `Item` is associated to the `AddOn`, then the
   *     `avalara_service_type` must be absent.
   */
  public void setAvalaraServiceType(final Integer avalaraServiceType) {
    this.avalaraServiceType = avalaraServiceType;
  }

  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service
   * type describe how the add-on is taxed. Refer to [the
   * documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   * for more available t/s types. If an `Item` is associated to the `AddOn`, then the
   * `avalara_transaction_type` must be absent.
   */
  public Integer getAvalaraTransactionType() {
    return this.avalaraTransactionType;
  }

  /**
   * @param avalaraTransactionType Used by Avalara for Communications taxes. The transaction type in
   *     combination with the service type describe how the add-on is taxed. Refer to [the
   *     documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   *     for more available t/s types. If an `Item` is associated to the `AddOn`, then the
   *     `avalara_transaction_type` must be absent.
   */
  public void setAvalaraTransactionType(final Integer avalaraTransactionType) {
    this.avalaraTransactionType = avalaraTransactionType;
  }

  /**
   * The unique identifier for the add-on within its plan. If an `Item` is associated to the `AddOn`
   * then `code` must be absent.
   */
  public String getCode() {
    return this.code;
  }

  /**
   * @param code The unique identifier for the add-on within its plan. If an `Item` is associated to
   *     the `AddOn` then `code` must be absent.
   */
  public void setCode(final String code) {
    this.code = code;
  }

  /**
   * If the add-on's `tier_type` is `tiered`, `volume`, or `stairstep`, then currencies must be
   * absent. Must also be absent if `add_on_type` is `usage` and `usage_type` is `percentage`.
   */
  public List<AddOnPricing> getCurrencies() {
    return this.currencies;
  }

  /**
   * @param currencies If the add-on's `tier_type` is `tiered`, `volume`, or `stairstep`, then
   *     currencies must be absent. Must also be absent if `add_on_type` is `usage` and `usage_type`
   *     is `percentage`.
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

  /** Add-on ID */
  public String getId() {
    return this.id;
  }

  /** @param id Add-on ID */
  public void setId(final String id) {
    this.id = id;
  }

  /**
   * System-generated unique identifier for a measured unit to be associated with the add-on. Either
   * `measured_unit_id` or `measured_unit_name` are required when `add_on_type` is `usage`. If
   * `measured_unit_id` and `measured_unit_name` are both present, `measured_unit_id` will be used.
   */
  public String getMeasuredUnitId() {
    return this.measuredUnitId;
  }

  /**
   * @param measuredUnitId System-generated unique identifier for a measured unit to be associated
   *     with the add-on. Either `measured_unit_id` or `measured_unit_name` are required when
   *     `add_on_type` is `usage`. If `measured_unit_id` and `measured_unit_name` are both present,
   *     `measured_unit_id` will be used.
   */
  public void setMeasuredUnitId(final String measuredUnitId) {
    this.measuredUnitId = measuredUnitId;
  }

  /**
   * Name of a measured unit to be associated with the add-on. Either `measured_unit_id` or
   * `measured_unit_name` are required when `add_on_type` is `usage`. If `measured_unit_id` and
   * `measured_unit_name` are both present, `measured_unit_id` will be used.
   */
  public String getMeasuredUnitName() {
    return this.measuredUnitName;
  }

  /**
   * @param measuredUnitName Name of a measured unit to be associated with the add-on. Either
   *     `measured_unit_id` or `measured_unit_name` are required when `add_on_type` is `usage`. If
   *     `measured_unit_id` and `measured_unit_name` are both present, `measured_unit_id` will be
   *     used.
   */
  public void setMeasuredUnitName(final String measuredUnitName) {
    this.measuredUnitName = measuredUnitName;
  }

  /**
   * Describes your add-on and will appear in subscribers' invoices. If an `Item` is associated to
   * the `AddOn` then `name` must be absent.
   */
  public String getName() {
    return this.name;
  }

  /**
   * @param name Describes your add-on and will appear in subscribers' invoices. If an `Item` is
   *     associated to the `AddOn` then `name` must be absent.
   */
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * Whether the add-on is optional for the customer to include in their purchase on the hosted
   * payment page. If false, the add-on will be included when a subscription is created through the
   * Recurly UI. However, the add-on will not be included when a subscription is created through the
   * API.
   */
  public Boolean getOptional() {
    return this.optional;
  }

  /**
   * @param optional Whether the add-on is optional for the customer to include in their purchase on
   *     the hosted payment page. If false, the add-on will be included when a subscription is
   *     created through the Recurly UI. However, the add-on will not be included when a
   *     subscription is created through the API.
   */
  public void setOptional(final Boolean optional) {
    this.optional = optional;
  }

  /**
   * When this add-on is invoiced, the line item will use this revenue schedule. If
   * `item_code`/`item_id` is part of the request then `revenue_schedule_type` must be absent in the
   * request as the value will be set from the item.
   */
  public Constants.RevenueScheduleType getRevenueScheduleType() {
    return this.revenueScheduleType;
  }

  /**
   * @param revenueScheduleType When this add-on is invoiced, the line item will use this revenue
   *     schedule. If `item_code`/`item_id` is part of the request then `revenue_schedule_type` must
   *     be absent in the request as the value will be set from the item.
   */
  public void setRevenueScheduleType(final Constants.RevenueScheduleType revenueScheduleType) {
    this.revenueScheduleType = revenueScheduleType;
  }

  /**
   * Optional field used by Avalara, Vertex, and Recurly's EU VAT tax feature to determine taxation
   * rules. If you have your own AvaTax or Vertex account configured, use their tax codes to assign
   * specific tax rules. If you are using Recurly's EU VAT feature, you can use values of `unknown`,
   * `physical`, or `digital`. If an `Item` is associated to the `AddOn` then `tax code` must be
   * absent.
   */
  public String getTaxCode() {
    return this.taxCode;
  }

  /**
   * @param taxCode Optional field used by Avalara, Vertex, and Recurly's EU VAT tax feature to
   *     determine taxation rules. If you have your own AvaTax or Vertex account configured, use
   *     their tax codes to assign specific tax rules. If you are using Recurly's EU VAT feature,
   *     you can use values of `unknown`, `physical`, or `digital`. If an `Item` is associated to
   *     the `AddOn` then `tax code` must be absent.
   */
  public void setTaxCode(final String taxCode) {
    this.taxCode = taxCode;
  }

  /**
   * If the tier_type is `flat`, then `tiers` must be absent. The `tiers` object must include one to
   * many tiers with `ending_quantity` and `unit_amount` for the desired `currencies`, or
   * alternatively, `usage_percentage` for usage percentage type usage add ons. There must be one
   * tier with an `ending_quantity` of 999999999 which is the default if not provided.
   */
  public List<Tier> getTiers() {
    return this.tiers;
  }

  /**
   * @param tiers If the tier_type is `flat`, then `tiers` must be absent. The `tiers` object must
   *     include one to many tiers with `ending_quantity` and `unit_amount` for the desired
   *     `currencies`, or alternatively, `usage_percentage` for usage percentage type usage add ons.
   *     There must be one tier with an `ending_quantity` of 999999999 which is the default if not
   *     provided.
   */
  public void setTiers(final List<Tier> tiers) {
    this.tiers = tiers;
  }

  /**
   * The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal
   * places. A value between 0.0 and 100.0. Required if `add_on_type` is usage, `tier_type` is
   * `flat` and `usage_type` is percentage. Must be omitted otherwise.
   */
  public BigDecimal getUsagePercentage() {
    return this.usagePercentage;
  }

  /**
   * @param usagePercentage The percentage taken of the monetary amount of usage tracked. This can
   *     be up to 4 decimal places. A value between 0.0 and 100.0. Required if `add_on_type` is
   *     usage, `tier_type` is `flat` and `usage_type` is percentage. Must be omitted otherwise.
   */
  public void setUsagePercentage(final BigDecimal usagePercentage) {
    this.usagePercentage = usagePercentage;
  }
}
