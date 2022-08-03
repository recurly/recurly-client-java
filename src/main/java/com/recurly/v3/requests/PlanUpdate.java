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

  /** Optional when the pricing model is 'ramp'. */
  @SerializedName("currencies")
  @Expose
  private List<PlanPricing> currencies;

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

  /** Hosted pages settings */
  @SerializedName("hosted_pages")
  @Expose
  private PlanHostedPages hostedPages;

  /** Plan ID */
  @SerializedName("id")
  @Expose
  private String id;

  /**
   * This name describes your plan and will appear on the Hosted Payment Page and the subscriber's
   * invoice.
   */
  @SerializedName("name")
  @Expose
  private String name;

  /** Ramp Intervals */
  @SerializedName("ramp_intervals")
  @Expose
  private List<PlanRampInterval> rampIntervals;

  /** Revenue schedule type */
  @SerializedName("revenue_schedule_type")
  @Expose
  private Constants.RevenueScheduleType revenueScheduleType;

  /**
   * Accounting code for invoice line items for the plan's setup fee. If no value is provided, it
   * defaults to plan's accounting code.
   */
  @SerializedName("setup_fee_accounting_code")
  @Expose
  private String setupFeeAccountingCode;

  /** Setup fee revenue schedule type */
  @SerializedName("setup_fee_revenue_schedule_type")
  @Expose
  private Constants.RevenueScheduleType setupFeeRevenueScheduleType;

  /**
   * Optional field used by Avalara, Vertex, and Recurly's EU VAT tax feature to determine taxation
   * rules. If you have your own AvaTax or Vertex account configured, use their tax codes to assign
   * specific tax rules. If you are using Recurly's EU VAT feature, you can use values of `unknown`,
   * `physical`, or `digital`.
   */
  @SerializedName("tax_code")
  @Expose
  private String taxCode;

  /** `true` exempts tax on the plan, `false` applies tax on the plan. */
  @SerializedName("tax_exempt")
  @Expose
  private Boolean taxExempt;

  /** Automatically terminate plans after a defined number of billing cycles. */
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
  private Constants.IntervalUnit trialUnit;

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

  /** Optional when the pricing model is 'ramp'. */
  public List<PlanPricing> getCurrencies() {
    return this.currencies;
  }

  /** @param currencies Optional when the pricing model is 'ramp'. */
  public void setCurrencies(final List<PlanPricing> currencies) {
    this.currencies = currencies;
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

  /** Hosted pages settings */
  public PlanHostedPages getHostedPages() {
    return this.hostedPages;
  }

  /** @param hostedPages Hosted pages settings */
  public void setHostedPages(final PlanHostedPages hostedPages) {
    this.hostedPages = hostedPages;
  }

  /** Plan ID */
  public String getId() {
    return this.id;
  }

  /** @param id Plan ID */
  public void setId(final String id) {
    this.id = id;
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

  /** Ramp Intervals */
  public List<PlanRampInterval> getRampIntervals() {
    return this.rampIntervals;
  }

  /** @param rampIntervals Ramp Intervals */
  public void setRampIntervals(final List<PlanRampInterval> rampIntervals) {
    this.rampIntervals = rampIntervals;
  }

  /** Revenue schedule type */
  public Constants.RevenueScheduleType getRevenueScheduleType() {
    return this.revenueScheduleType;
  }

  /** @param revenueScheduleType Revenue schedule type */
  public void setRevenueScheduleType(final Constants.RevenueScheduleType revenueScheduleType) {
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

  /** Setup fee revenue schedule type */
  public Constants.RevenueScheduleType getSetupFeeRevenueScheduleType() {
    return this.setupFeeRevenueScheduleType;
  }

  /** @param setupFeeRevenueScheduleType Setup fee revenue schedule type */
  public void setSetupFeeRevenueScheduleType(
      final Constants.RevenueScheduleType setupFeeRevenueScheduleType) {
    this.setupFeeRevenueScheduleType = setupFeeRevenueScheduleType;
  }

  /**
   * Optional field used by Avalara, Vertex, and Recurly's EU VAT tax feature to determine taxation
   * rules. If you have your own AvaTax or Vertex account configured, use their tax codes to assign
   * specific tax rules. If you are using Recurly's EU VAT feature, you can use values of `unknown`,
   * `physical`, or `digital`.
   */
  public String getTaxCode() {
    return this.taxCode;
  }

  /**
   * @param taxCode Optional field used by Avalara, Vertex, and Recurly's EU VAT tax feature to
   *     determine taxation rules. If you have your own AvaTax or Vertex account configured, use
   *     their tax codes to assign specific tax rules. If you are using Recurly's EU VAT feature,
   *     you can use values of `unknown`, `physical`, or `digital`.
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

  /** Automatically terminate plans after a defined number of billing cycles. */
  public Integer getTotalBillingCycles() {
    return this.totalBillingCycles;
  }

  /**
   * @param totalBillingCycles Automatically terminate plans after a defined number of billing
   *     cycles.
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
  public Constants.IntervalUnit getTrialUnit() {
    return this.trialUnit;
  }

  /** @param trialUnit Units for the plan's trial period. */
  public void setTrialUnit(final Constants.IntervalUnit trialUnit) {
    this.trialUnit = trialUnit;
  }
}
