/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

public class AddOn extends Resource {

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
  private String addOnType;

  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service
   * type describe how the add-on is taxed. Refer to [the
   * documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   * for more available t/s types.
   */
  @SerializedName("avalara_service_type")
  @Expose
  private Integer avalaraServiceType;

  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service
   * type describe how the add-on is taxed. Refer to [the
   * documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   * for more available t/s types.
   */
  @SerializedName("avalara_transaction_type")
  @Expose
  private Integer avalaraTransactionType;

  /** The unique identifier for the add-on within its plan. */
  @SerializedName("code")
  @Expose
  private String code;

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private ZonedDateTime createdAt;

  /** Add-on pricing */
  @SerializedName("currencies")
  @Expose
  private List<AddOnPricing> currencies;

  /** Default quantity for the hosted pages. */
  @SerializedName("default_quantity")
  @Expose
  private Integer defaultQuantity;

  /** Deleted at */
  @SerializedName("deleted_at")
  @Expose
  private ZonedDateTime deletedAt;

  /** Determines if the quantity field is displayed on the hosted pages for the add-on. */
  @SerializedName("display_quantity")
  @Expose
  private Boolean displayQuantity;

  /** Optional, stock keeping unit to link the item to other inventory systems. */
  @SerializedName("external_sku")
  @Expose
  private String externalSku;

  /**
   * The Harmonized System (HS) code is an internationally standardized system of names and numbers
   * to classify traded products. The HS code, sometimes called Commodity Code, is used by customs
   * authorities around the world to identify products when assessing duties and taxes. The HS code
   * may also be referred to as the tariff code or customs code. Values should contain only digits
   * and decimals.
   */
  @SerializedName("harmonized_system_code")
  @Expose
  private String harmonizedSystemCode;

  /** Add-on ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** Just the important parts. */
  @SerializedName("item")
  @Expose
  private ItemMini item;

  /**
   * The ID of a general ledger account. General ledger accounts are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  @SerializedName("liability_gl_account_id")
  @Expose
  private String liabilityGlAccountId;

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
   * Whether the add-on is optional for the customer to include in their purchase on the hosted
   * payment page. If false, the add-on will be included when a subscription is created through the
   * Recurly UI. However, the add-on will not be included when a subscription is created through the
   * API.
   */
  @SerializedName("optional")
  @Expose
  private Boolean optional;

  /**
   * This feature is currently in development and requires approval and enablement, please contact
   * support.
   */
  @SerializedName("percentage_tiers")
  @Expose
  private List<PercentageTiersByCurrency> percentageTiers;

  /**
   * The ID of a performance obligation. Performance obligations are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  @SerializedName("performance_obligation_id")
  @Expose
  private String performanceObligationId;

  /** Plan ID */
  @SerializedName("plan_id")
  @Expose
  private String planId;

  /**
   * The ID of a general ledger account. General ledger accounts are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  @SerializedName("revenue_gl_account_id")
  @Expose
  private String revenueGlAccountId;

  /**
   * When this add-on is invoiced, the line item will use this revenue schedule. If
   * `item_code`/`item_id` is part of the request then `revenue_schedule_type` must be absent in the
   * request as the value will be set from the item.
   */
  @SerializedName("revenue_schedule_type")
  @Expose
  private String revenueScheduleType;

  /** Add-ons can be either active or inactive. */
  @SerializedName("state")
  @Expose
  private String state;

  /**
   * Optional field used by Avalara, Vertex, and Recurly's In-the-Box tax solution to determine
   * taxation rules. You can pass in specific tax codes using any of these tax integrations. For
   * Recurly's In-the-Box tax offering you can also choose to instead use simple values of
   * `unknown`, `physical`, or `digital` tax codes. If `item_code`/`item_id` is part of the request
   * then `tax_code` must be absent.
   */
  @SerializedName("tax_code")
  @Expose
  private String taxCode;

  /**
   * The pricing model for the add-on. For more information, [click
   * here](https://docs.recurly.com/docs/billing-models#section-quantity-based). See our
   * [Guide](https://recurly.com/developers/guides/item-addon-guide.html) for an overview of how to
   * configure quantity-based pricing models.
   */
  @SerializedName("tier_type")
  @Expose
  private String tierType;

  /** Tiers */
  @SerializedName("tiers")
  @Expose
  private List<Tier> tiers;

  /** Last updated at */
  @SerializedName("updated_at")
  @Expose
  private ZonedDateTime updatedAt;

  /**
   * The type of calculation to be employed for an add-on. Cumulative billing will sum all usage
   * records created in the current billing cycle. Last-in-period billing will apply only the most
   * recent usage record in the billing period. If no value is specified, cumulative billing will be
   * used.
   */
  @SerializedName("usage_calculation_type")
  @Expose
  private String usageCalculationType;

  /**
   * The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal
   * places. A value between 0.0 and 100.0.
   */
  @SerializedName("usage_percentage")
  @Expose
  private BigDecimal usagePercentage;

  /** The time at which usage totals are reset for billing purposes. */
  @SerializedName("usage_timeframe")
  @Expose
  private String usageTimeframe;

  /** Type of usage, returns usage type if `add_on_type` is `usage`. */
  @SerializedName("usage_type")
  @Expose
  private String usageType;

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
  public String getAddOnType() {
    return this.addOnType;
  }

  /** @param addOnType Whether the add-on type is fixed, or usage-based. */
  public void setAddOnType(final String addOnType) {
    this.addOnType = addOnType;
  }

  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service
   * type describe how the add-on is taxed. Refer to [the
   * documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   * for more available t/s types.
   */
  public Integer getAvalaraServiceType() {
    return this.avalaraServiceType;
  }

  /**
   * @param avalaraServiceType Used by Avalara for Communications taxes. The transaction type in
   *     combination with the service type describe how the add-on is taxed. Refer to [the
   *     documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   *     for more available t/s types.
   */
  public void setAvalaraServiceType(final Integer avalaraServiceType) {
    this.avalaraServiceType = avalaraServiceType;
  }

  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service
   * type describe how the add-on is taxed. Refer to [the
   * documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   * for more available t/s types.
   */
  public Integer getAvalaraTransactionType() {
    return this.avalaraTransactionType;
  }

  /**
   * @param avalaraTransactionType Used by Avalara for Communications taxes. The transaction type in
   *     combination with the service type describe how the add-on is taxed. Refer to [the
   *     documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   *     for more available t/s types.
   */
  public void setAvalaraTransactionType(final Integer avalaraTransactionType) {
    this.avalaraTransactionType = avalaraTransactionType;
  }

  /** The unique identifier for the add-on within its plan. */
  public String getCode() {
    return this.code;
  }

  /** @param code The unique identifier for the add-on within its plan. */
  public void setCode(final String code) {
    this.code = code;
  }

  /** Created at */
  public ZonedDateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt Created at */
  public void setCreatedAt(final ZonedDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** Add-on pricing */
  public List<AddOnPricing> getCurrencies() {
    return this.currencies;
  }

  /** @param currencies Add-on pricing */
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

  /** Deleted at */
  public ZonedDateTime getDeletedAt() {
    return this.deletedAt;
  }

  /** @param deletedAt Deleted at */
  public void setDeletedAt(final ZonedDateTime deletedAt) {
    this.deletedAt = deletedAt;
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

  /**
   * The Harmonized System (HS) code is an internationally standardized system of names and numbers
   * to classify traded products. The HS code, sometimes called Commodity Code, is used by customs
   * authorities around the world to identify products when assessing duties and taxes. The HS code
   * may also be referred to as the tariff code or customs code. Values should contain only digits
   * and decimals.
   */
  public String getHarmonizedSystemCode() {
    return this.harmonizedSystemCode;
  }

  /**
   * @param harmonizedSystemCode The Harmonized System (HS) code is an internationally standardized
   *     system of names and numbers to classify traded products. The HS code, sometimes called
   *     Commodity Code, is used by customs authorities around the world to identify products when
   *     assessing duties and taxes. The HS code may also be referred to as the tariff code or
   *     customs code. Values should contain only digits and decimals.
   */
  public void setHarmonizedSystemCode(final String harmonizedSystemCode) {
    this.harmonizedSystemCode = harmonizedSystemCode;
  }

  /** Add-on ID */
  public String getId() {
    return this.id;
  }

  /** @param id Add-on ID */
  public void setId(final String id) {
    this.id = id;
  }

  /** Just the important parts. */
  public ItemMini getItem() {
    return this.item;
  }

  /** @param item Just the important parts. */
  public void setItem(final ItemMini item) {
    this.item = item;
  }

  /**
   * The ID of a general ledger account. General ledger accounts are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  public String getLiabilityGlAccountId() {
    return this.liabilityGlAccountId;
  }

  /**
   * @param liabilityGlAccountId The ID of a general ledger account. General ledger accounts are
   *     only accessible as a part of the Recurly RevRec Standard and Recurly RevRec Advanced
   *     features.
   */
  public void setLiabilityGlAccountId(final String liabilityGlAccountId) {
    this.liabilityGlAccountId = liabilityGlAccountId;
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
   * This feature is currently in development and requires approval and enablement, please contact
   * support.
   */
  public List<PercentageTiersByCurrency> getPercentageTiers() {
    return this.percentageTiers;
  }

  /**
   * @param percentageTiers This feature is currently in development and requires approval and
   *     enablement, please contact support.
   */
  public void setPercentageTiers(final List<PercentageTiersByCurrency> percentageTiers) {
    this.percentageTiers = percentageTiers;
  }

  /**
   * The ID of a performance obligation. Performance obligations are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  public String getPerformanceObligationId() {
    return this.performanceObligationId;
  }

  /**
   * @param performanceObligationId The ID of a performance obligation. Performance obligations are
   *     only accessible as a part of the Recurly RevRec Standard and Recurly RevRec Advanced
   *     features.
   */
  public void setPerformanceObligationId(final String performanceObligationId) {
    this.performanceObligationId = performanceObligationId;
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
   * The ID of a general ledger account. General ledger accounts are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  public String getRevenueGlAccountId() {
    return this.revenueGlAccountId;
  }

  /**
   * @param revenueGlAccountId The ID of a general ledger account. General ledger accounts are only
   *     accessible as a part of the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  public void setRevenueGlAccountId(final String revenueGlAccountId) {
    this.revenueGlAccountId = revenueGlAccountId;
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

  /** Add-ons can be either active or inactive. */
  public String getState() {
    return this.state;
  }

  /** @param state Add-ons can be either active or inactive. */
  public void setState(final String state) {
    this.state = state;
  }

  /**
   * Optional field used by Avalara, Vertex, and Recurly's In-the-Box tax solution to determine
   * taxation rules. You can pass in specific tax codes using any of these tax integrations. For
   * Recurly's In-the-Box tax offering you can also choose to instead use simple values of
   * `unknown`, `physical`, or `digital` tax codes. If `item_code`/`item_id` is part of the request
   * then `tax_code` must be absent.
   */
  public String getTaxCode() {
    return this.taxCode;
  }

  /**
   * @param taxCode Optional field used by Avalara, Vertex, and Recurly's In-the-Box tax solution to
   *     determine taxation rules. You can pass in specific tax codes using any of these tax
   *     integrations. For Recurly's In-the-Box tax offering you can also choose to instead use
   *     simple values of `unknown`, `physical`, or `digital` tax codes. If `item_code`/`item_id` is
   *     part of the request then `tax_code` must be absent.
   */
  public void setTaxCode(final String taxCode) {
    this.taxCode = taxCode;
  }

  /**
   * The pricing model for the add-on. For more information, [click
   * here](https://docs.recurly.com/docs/billing-models#section-quantity-based). See our
   * [Guide](https://recurly.com/developers/guides/item-addon-guide.html) for an overview of how to
   * configure quantity-based pricing models.
   */
  public String getTierType() {
    return this.tierType;
  }

  /**
   * @param tierType The pricing model for the add-on. For more information, [click
   *     here](https://docs.recurly.com/docs/billing-models#section-quantity-based). See our
   *     [Guide](https://recurly.com/developers/guides/item-addon-guide.html) for an overview of how
   *     to configure quantity-based pricing models.
   */
  public void setTierType(final String tierType) {
    this.tierType = tierType;
  }

  /** Tiers */
  public List<Tier> getTiers() {
    return this.tiers;
  }

  /** @param tiers Tiers */
  public void setTiers(final List<Tier> tiers) {
    this.tiers = tiers;
  }

  /** Last updated at */
  public ZonedDateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt Last updated at */
  public void setUpdatedAt(final ZonedDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The type of calculation to be employed for an add-on. Cumulative billing will sum all usage
   * records created in the current billing cycle. Last-in-period billing will apply only the most
   * recent usage record in the billing period. If no value is specified, cumulative billing will be
   * used.
   */
  public String getUsageCalculationType() {
    return this.usageCalculationType;
  }

  /**
   * @param usageCalculationType The type of calculation to be employed for an add-on. Cumulative
   *     billing will sum all usage records created in the current billing cycle. Last-in-period
   *     billing will apply only the most recent usage record in the billing period. If no value is
   *     specified, cumulative billing will be used.
   */
  public void setUsageCalculationType(final String usageCalculationType) {
    this.usageCalculationType = usageCalculationType;
  }

  /**
   * The percentage taken of the monetary amount of usage tracked. This can be up to 4 decimal
   * places. A value between 0.0 and 100.0.
   */
  public BigDecimal getUsagePercentage() {
    return this.usagePercentage;
  }

  /**
   * @param usagePercentage The percentage taken of the monetary amount of usage tracked. This can
   *     be up to 4 decimal places. A value between 0.0 and 100.0.
   */
  public void setUsagePercentage(final BigDecimal usagePercentage) {
    this.usagePercentage = usagePercentage;
  }

  /** The time at which usage totals are reset for billing purposes. */
  public String getUsageTimeframe() {
    return this.usageTimeframe;
  }

  /** @param usageTimeframe The time at which usage totals are reset for billing purposes. */
  public void setUsageTimeframe(final String usageTimeframe) {
    this.usageTimeframe = usageTimeframe;
  }

  /** Type of usage, returns usage type if `add_on_type` is `usage`. */
  public String getUsageType() {
    return this.usageType;
  }

  /** @param usageType Type of usage, returns usage type if `add_on_type` is `usage`. */
  public void setUsageType(final String usageType) {
    this.usageType = usageType;
  }
}
