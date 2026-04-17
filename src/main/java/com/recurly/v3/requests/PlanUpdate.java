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

public class PlanUpdate extends Request {

  /**
   * Accounting code for invoice line items for the plan. If no value is provided, it defaults to
   * plan's code.
   */
  @SerializedName("accounting_code")
  @Expose
  private String accountingCode;

  /**
   * Used to determine whether items can be assigned as add-ons to individual subscriptions. If
   * `true`, items can be assigned as add-ons to individual subscription add-ons. If `false`, only
   * plan add-ons can be used.
   */
  @SerializedName("allow_any_item_on_subscriptions")
  @Expose
  private Boolean allowAnyItemOnSubscriptions;

  /**
   * Subscriptions will automatically inherit this value once they are active. If `auto_renew` is
   * `true`, then a subscription will automatically renew its term at renewal. If `auto_renew` is
   * `false`, then a subscription will expire at the end of its term. `auto_renew` can be overridden
   * on the subscription record itself.
   */
  @SerializedName("auto_renew")
  @Expose
  private Boolean autoRenew;

  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service
   * type describe how the plan is taxed. Refer to [the
   * documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   * for more available t/s types.
   */
  @SerializedName("avalara_service_type")
  @Expose
  private Integer avalaraServiceType;

  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service
   * type describe how the plan is taxed. Refer to [the
   * documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   * for more available t/s types.
   */
  @SerializedName("avalara_transaction_type")
  @Expose
  private Integer avalaraTransactionType;

  /**
   * Unique code to identify the plan. This is used in Hosted Payment Page URLs and in the invoice
   * exports.
   */
  @SerializedName("code")
  @Expose
  private String code;

  /** Required only when `pricing_model` is `'fixed'`. */
  @SerializedName("currencies")
  @Expose
  private List<PlanPricing> currencies;

  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  @SerializedName("custom_fields")
  @Expose
  private List<CustomField> customFields;

  /** Optional description, not displayed. */
  @SerializedName("description")
  @Expose
  private String description;

  /**
   * Unique ID to identify a dunning campaign. Used to specify if a non-default dunning campaign
   * should be assigned to this plan. For sites without multiple dunning campaigns enabled, the
   * default dunning campaign will always be used.
   */
  @SerializedName("dunning_campaign_id")
  @Expose
  private String dunningCampaignId;

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

  /** Hosted pages settings */
  @SerializedName("hosted_pages")
  @Expose
  private PlanHostedPages hostedPages;

  /** This field has no effect on the request/response. */
  @SerializedName("id")
  @Expose
  private String id;

  /**
   * The ID of a general ledger account. General ledger accounts are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  @SerializedName("liability_gl_account_id")
  @Expose
  private String liabilityGlAccountId;

  /**
   * This name describes your plan and will appear on the Hosted Payment Page and the subscriber's
   * invoice.
   */
  @SerializedName("name")
  @Expose
  private String name;

  /**
   * The ID of a performance obligation. Performance obligations are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  @SerializedName("performance_obligation_id")
  @Expose
  private String performanceObligationId;

  /** Ramp Intervals */
  @SerializedName("ramp_intervals")
  @Expose
  private List<PlanRampInterval> rampIntervals;

  /**
   * The ID of a general ledger account. General ledger accounts are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  @SerializedName("revenue_gl_account_id")
  @Expose
  private String revenueGlAccountId;

  /** Revenue schedule type */
  @SerializedName("revenue_schedule_type")
  @Expose
  private String revenueScheduleType;

  /**
   * Accounting code for invoice line items for the plan's setup fee. If no value is provided, it
   * defaults to plan's accounting code.
   */
  @SerializedName("setup_fee_accounting_code")
  @Expose
  private String setupFeeAccountingCode;

  /**
   * The ID of a general ledger account. General ledger accounts are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  @SerializedName("setup_fee_liability_gl_account_id")
  @Expose
  private String setupFeeLiabilityGlAccountId;

  /**
   * The ID of a performance obligation. Performance obligations are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  @SerializedName("setup_fee_performance_obligation_id")
  @Expose
  private String setupFeePerformanceObligationId;

  /**
   * The ID of a general ledger account. General ledger accounts are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  @SerializedName("setup_fee_revenue_gl_account_id")
  @Expose
  private String setupFeeRevenueGlAccountId;

  /** Setup fee revenue schedule type */
  @SerializedName("setup_fee_revenue_schedule_type")
  @Expose
  private String setupFeeRevenueScheduleType;

  /** Setup Fees */
  @SerializedName("setup_fees")
  @Expose
  private List<PlanSetupPricingCreate> setupFees;

  /**
   * Optional field used by Avalara, Vertex, and Recurly's In-the-Box tax solution to determine
   * taxation rules. You can pass in specific tax codes using any of these tax integrations. For
   * Recurly's In-the-Box tax offering you can also choose to instead use simple values of
   * `unknown`, `physical`, or `digital` tax codes.
   */
  @SerializedName("tax_code")
  @Expose
  private String taxCode;

  /** `true` exempts tax on the plan, `false` applies tax on the plan. */
  @SerializedName("tax_exempt")
  @Expose
  private Boolean taxExempt;

  /**
   * Automatically terminate subscriptions after a defined number of billing cycles. Number of
   * billing cycles before the plan automatically stops renewing, defaults to `null` for continuous,
   * automatic renewal.
   */
  @SerializedName("total_billing_cycles")
  @Expose
  private Integer totalBillingCycles;

  /** Length of plan's trial period in `trial_units`. `0` means `no trial`. */
  @SerializedName("trial_length")
  @Expose
  private Integer trialLength;

  /**
   * Allow free trial subscriptions to be created without billing info. Should not be used if
   * billing info is needed for initial invoice due to existing uninvoiced charges or setup fee.
   */
  @SerializedName("trial_requires_billing_info")
  @Expose
  private Boolean trialRequiresBillingInfo;

  /** Units for the plan's trial period. */
  @SerializedName("trial_unit")
  @Expose
  private String trialUnit;

  /** Used by Vertex for tax calculations. Possible values are `sale`, `rental`, `lease`. */
  @SerializedName("vertex_transaction_type")
  @Expose
  private String vertexTransactionType;

  /**
   * Accounting code for invoice line items for the plan. If no value is provided, it defaults to
   * plan's code.
   */
  public String getAccountingCode() {
    return this.accountingCode;
  }

  /**
   * @param accountingCode Accounting code for invoice line items for the plan. If no value is
   *     provided, it defaults to plan's code.
   */
  public void setAccountingCode(final String accountingCode) {
    this.accountingCode = accountingCode;
  }

  /**
   * Used to determine whether items can be assigned as add-ons to individual subscriptions. If
   * `true`, items can be assigned as add-ons to individual subscription add-ons. If `false`, only
   * plan add-ons can be used.
   */
  public Boolean getAllowAnyItemOnSubscriptions() {
    return this.allowAnyItemOnSubscriptions;
  }

  /**
   * @param allowAnyItemOnSubscriptions Used to determine whether items can be assigned as add-ons
   *     to individual subscriptions. If `true`, items can be assigned as add-ons to individual
   *     subscription add-ons. If `false`, only plan add-ons can be used.
   */
  public void setAllowAnyItemOnSubscriptions(final Boolean allowAnyItemOnSubscriptions) {
    this.allowAnyItemOnSubscriptions = allowAnyItemOnSubscriptions;
  }

  /**
   * Subscriptions will automatically inherit this value once they are active. If `auto_renew` is
   * `true`, then a subscription will automatically renew its term at renewal. If `auto_renew` is
   * `false`, then a subscription will expire at the end of its term. `auto_renew` can be overridden
   * on the subscription record itself.
   */
  public Boolean getAutoRenew() {
    return this.autoRenew;
  }

  /**
   * @param autoRenew Subscriptions will automatically inherit this value once they are active. If
   *     `auto_renew` is `true`, then a subscription will automatically renew its term at renewal.
   *     If `auto_renew` is `false`, then a subscription will expire at the end of its term.
   *     `auto_renew` can be overridden on the subscription record itself.
   */
  public void setAutoRenew(final Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service
   * type describe how the plan is taxed. Refer to [the
   * documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   * for more available t/s types.
   */
  public Integer getAvalaraServiceType() {
    return this.avalaraServiceType;
  }

  /**
   * @param avalaraServiceType Used by Avalara for Communications taxes. The transaction type in
   *     combination with the service type describe how the plan is taxed. Refer to [the
   *     documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   *     for more available t/s types.
   */
  public void setAvalaraServiceType(final Integer avalaraServiceType) {
    this.avalaraServiceType = avalaraServiceType;
  }

  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service
   * type describe how the plan is taxed. Refer to [the
   * documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   * for more available t/s types.
   */
  public Integer getAvalaraTransactionType() {
    return this.avalaraTransactionType;
  }

  /**
   * @param avalaraTransactionType Used by Avalara for Communications taxes. The transaction type in
   *     combination with the service type describe how the plan is taxed. Refer to [the
   *     documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types)
   *     for more available t/s types.
   */
  public void setAvalaraTransactionType(final Integer avalaraTransactionType) {
    this.avalaraTransactionType = avalaraTransactionType;
  }

  /**
   * Unique code to identify the plan. This is used in Hosted Payment Page URLs and in the invoice
   * exports.
   */
  public String getCode() {
    return this.code;
  }

  /**
   * @param code Unique code to identify the plan. This is used in Hosted Payment Page URLs and in
   *     the invoice exports.
   */
  public void setCode(final String code) {
    this.code = code;
  }

  /** Required only when `pricing_model` is `'fixed'`. */
  public List<PlanPricing> getCurrencies() {
    return this.currencies;
  }

  /** @param currencies Required only when `pricing_model` is `'fixed'`. */
  public void setCurrencies(final List<PlanPricing> currencies) {
    this.currencies = currencies;
  }

  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  public List<CustomField> getCustomFields() {
    return this.customFields;
  }

  /**
   * @param customFields The custom fields will only be altered when they are included in a request.
   *     Sending an empty array will not remove any existing values. To remove a field send the name
   *     with a null or empty value.
   */
  public void setCustomFields(final List<CustomField> customFields) {
    this.customFields = customFields;
  }

  /** Optional description, not displayed. */
  public String getDescription() {
    return this.description;
  }

  /** @param description Optional description, not displayed. */
  public void setDescription(final String description) {
    this.description = description;
  }

  /**
   * Unique ID to identify a dunning campaign. Used to specify if a non-default dunning campaign
   * should be assigned to this plan. For sites without multiple dunning campaigns enabled, the
   * default dunning campaign will always be used.
   */
  public String getDunningCampaignId() {
    return this.dunningCampaignId;
  }

  /**
   * @param dunningCampaignId Unique ID to identify a dunning campaign. Used to specify if a
   *     non-default dunning campaign should be assigned to this plan. For sites without multiple
   *     dunning campaigns enabled, the default dunning campaign will always be used.
   */
  public void setDunningCampaignId(final String dunningCampaignId) {
    this.dunningCampaignId = dunningCampaignId;
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

  /** Hosted pages settings */
  public PlanHostedPages getHostedPages() {
    return this.hostedPages;
  }

  /** @param hostedPages Hosted pages settings */
  public void setHostedPages(final PlanHostedPages hostedPages) {
    this.hostedPages = hostedPages;
  }

  /** This field has no effect on the request/response. */
  public String getId() {
    return this.id;
  }

  /** @param id This field has no effect on the request/response. */
  public void setId(final String id) {
    this.id = id;
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

  /**
   * This name describes your plan and will appear on the Hosted Payment Page and the subscriber's
   * invoice.
   */
  public String getName() {
    return this.name;
  }

  /**
   * @param name This name describes your plan and will appear on the Hosted Payment Page and the
   *     subscriber's invoice.
   */
  public void setName(final String name) {
    this.name = name;
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

  /** Ramp Intervals */
  public List<PlanRampInterval> getRampIntervals() {
    return this.rampIntervals;
  }

  /** @param rampIntervals Ramp Intervals */
  public void setRampIntervals(final List<PlanRampInterval> rampIntervals) {
    this.rampIntervals = rampIntervals;
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

  /** Revenue schedule type */
  public String getRevenueScheduleType() {
    return this.revenueScheduleType;
  }

  /** @param revenueScheduleType Revenue schedule type */
  public void setRevenueScheduleType(final String revenueScheduleType) {
    this.revenueScheduleType = revenueScheduleType;
  }

  /**
   * Accounting code for invoice line items for the plan's setup fee. If no value is provided, it
   * defaults to plan's accounting code.
   */
  public String getSetupFeeAccountingCode() {
    return this.setupFeeAccountingCode;
  }

  /**
   * @param setupFeeAccountingCode Accounting code for invoice line items for the plan's setup fee.
   *     If no value is provided, it defaults to plan's accounting code.
   */
  public void setSetupFeeAccountingCode(final String setupFeeAccountingCode) {
    this.setupFeeAccountingCode = setupFeeAccountingCode;
  }

  /**
   * The ID of a general ledger account. General ledger accounts are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  public String getSetupFeeLiabilityGlAccountId() {
    return this.setupFeeLiabilityGlAccountId;
  }

  /**
   * @param setupFeeLiabilityGlAccountId The ID of a general ledger account. General ledger accounts
   *     are only accessible as a part of the Recurly RevRec Standard and Recurly RevRec Advanced
   *     features.
   */
  public void setSetupFeeLiabilityGlAccountId(final String setupFeeLiabilityGlAccountId) {
    this.setupFeeLiabilityGlAccountId = setupFeeLiabilityGlAccountId;
  }

  /**
   * The ID of a performance obligation. Performance obligations are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  public String getSetupFeePerformanceObligationId() {
    return this.setupFeePerformanceObligationId;
  }

  /**
   * @param setupFeePerformanceObligationId The ID of a performance obligation. Performance
   *     obligations are only accessible as a part of the Recurly RevRec Standard and Recurly RevRec
   *     Advanced features.
   */
  public void setSetupFeePerformanceObligationId(final String setupFeePerformanceObligationId) {
    this.setupFeePerformanceObligationId = setupFeePerformanceObligationId;
  }

  /**
   * The ID of a general ledger account. General ledger accounts are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  public String getSetupFeeRevenueGlAccountId() {
    return this.setupFeeRevenueGlAccountId;
  }

  /**
   * @param setupFeeRevenueGlAccountId The ID of a general ledger account. General ledger accounts
   *     are only accessible as a part of the Recurly RevRec Standard and Recurly RevRec Advanced
   *     features.
   */
  public void setSetupFeeRevenueGlAccountId(final String setupFeeRevenueGlAccountId) {
    this.setupFeeRevenueGlAccountId = setupFeeRevenueGlAccountId;
  }

  /** Setup fee revenue schedule type */
  public String getSetupFeeRevenueScheduleType() {
    return this.setupFeeRevenueScheduleType;
  }

  /** @param setupFeeRevenueScheduleType Setup fee revenue schedule type */
  public void setSetupFeeRevenueScheduleType(final String setupFeeRevenueScheduleType) {
    this.setupFeeRevenueScheduleType = setupFeeRevenueScheduleType;
  }

  /** Setup Fees */
  public List<PlanSetupPricingCreate> getSetupFees() {
    return this.setupFees;
  }

  /** @param setupFees Setup Fees */
  public void setSetupFees(final List<PlanSetupPricingCreate> setupFees) {
    this.setupFees = setupFees;
  }

  /**
   * Optional field used by Avalara, Vertex, and Recurly's In-the-Box tax solution to determine
   * taxation rules. You can pass in specific tax codes using any of these tax integrations. For
   * Recurly's In-the-Box tax offering you can also choose to instead use simple values of
   * `unknown`, `physical`, or `digital` tax codes.
   */
  public String getTaxCode() {
    return this.taxCode;
  }

  /**
   * @param taxCode Optional field used by Avalara, Vertex, and Recurly's In-the-Box tax solution to
   *     determine taxation rules. You can pass in specific tax codes using any of these tax
   *     integrations. For Recurly's In-the-Box tax offering you can also choose to instead use
   *     simple values of `unknown`, `physical`, or `digital` tax codes.
   */
  public void setTaxCode(final String taxCode) {
    this.taxCode = taxCode;
  }

  /** `true` exempts tax on the plan, `false` applies tax on the plan. */
  public Boolean getTaxExempt() {
    return this.taxExempt;
  }

  /** @param taxExempt `true` exempts tax on the plan, `false` applies tax on the plan. */
  public void setTaxExempt(final Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  /**
   * Automatically terminate subscriptions after a defined number of billing cycles. Number of
   * billing cycles before the plan automatically stops renewing, defaults to `null` for continuous,
   * automatic renewal.
   */
  public Integer getTotalBillingCycles() {
    return this.totalBillingCycles;
  }

  /**
   * @param totalBillingCycles Automatically terminate subscriptions after a defined number of
   *     billing cycles. Number of billing cycles before the plan automatically stops renewing,
   *     defaults to `null` for continuous, automatic renewal.
   */
  public void setTotalBillingCycles(final Integer totalBillingCycles) {
    this.totalBillingCycles = totalBillingCycles;
  }

  /** Length of plan's trial period in `trial_units`. `0` means `no trial`. */
  public Integer getTrialLength() {
    return this.trialLength;
  }

  /** @param trialLength Length of plan's trial period in `trial_units`. `0` means `no trial`. */
  public void setTrialLength(final Integer trialLength) {
    this.trialLength = trialLength;
  }

  /**
   * Allow free trial subscriptions to be created without billing info. Should not be used if
   * billing info is needed for initial invoice due to existing uninvoiced charges or setup fee.
   */
  public Boolean getTrialRequiresBillingInfo() {
    return this.trialRequiresBillingInfo;
  }

  /**
   * @param trialRequiresBillingInfo Allow free trial subscriptions to be created without billing
   *     info. Should not be used if billing info is needed for initial invoice due to existing
   *     uninvoiced charges or setup fee.
   */
  public void setTrialRequiresBillingInfo(final Boolean trialRequiresBillingInfo) {
    this.trialRequiresBillingInfo = trialRequiresBillingInfo;
  }

  /** Units for the plan's trial period. */
  public String getTrialUnit() {
    return this.trialUnit;
  }

  /** @param trialUnit Units for the plan's trial period. */
  public void setTrialUnit(final String trialUnit) {
    this.trialUnit = trialUnit;
  }

  /** Used by Vertex for tax calculations. Possible values are `sale`, `rental`, `lease`. */
  public String getVertexTransactionType() {
    return this.vertexTransactionType;
  }

  /**
   * @param vertexTransactionType Used by Vertex for tax calculations. Possible values are `sale`,
   *     `rental`, `lease`.
   */
  public void setVertexTransactionType(final String vertexTransactionType) {
    this.vertexTransactionType = vertexTransactionType;
  }
}
