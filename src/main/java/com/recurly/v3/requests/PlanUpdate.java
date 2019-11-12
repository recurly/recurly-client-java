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

  /** Add Ons */
  @SerializedName("add_ons")
  @Expose
  private List<AddOnCreate> addOns;

  /**
   * Unique code to identify the plan. This is used in Hosted Payment Page URLs and in the invoice
   * exports.
   */
  @SerializedName("code")
  @Expose
  private String code;

  /** Pricing */
  @SerializedName("currencies")
  @Expose
  private List<PlanPricing> currencies;

  /** Optional description, not displayed. */
  @SerializedName("description")
  @Expose
  private String description;

  /** Hosted pages settings */
  @SerializedName("hosted_pages")
  @Expose
  private PlanHostedPages hostedPages;

  /** Plan ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** Length of the plan's billing interval in `interval_unit`. */
  @SerializedName("interval_length")
  @Expose
  private Integer intervalLength;

  /** Unit for the plan's billing interval. */
  @SerializedName("interval_unit")
  @Expose
  private String intervalUnit;

  /**
   * This name describes your plan and will appear on the Hosted Payment Page and the subscriber's
   * invoice.
   */
  @SerializedName("name")
  @Expose
  private String name;

  /**
   * Accounting code for invoice line items for the plan's setup fee. If no value is provided, it
   * defaults to plan's accounting code.
   */
  @SerializedName("setup_fee_accounting_code")
  @Expose
  private String setupFeeAccountingCode;

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

  /** Units for the plan's trial period. */
  @SerializedName("trial_unit")
  @Expose
  private String trialUnit;

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

  /** Add Ons */
  public List<AddOnCreate> getAddOns() {
    return this.addOns;
  }

  /** @param addOns Add Ons */
  public void setAddOns(final List<AddOnCreate> addOns) {
    this.addOns = addOns;
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

  /** Pricing */
  public List<PlanPricing> getCurrencies() {
    return this.currencies;
  }

  /** @param currencies Pricing */
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

  /** Length of the plan's billing interval in `interval_unit`. */
  public Integer getIntervalLength() {
    return this.intervalLength;
  }

  /** @param intervalLength Length of the plan's billing interval in `interval_unit`. */
  public void setIntervalLength(final Integer intervalLength) {
    this.intervalLength = intervalLength;
  }

  /** Unit for the plan's billing interval. */
  public String getIntervalUnit() {
    return this.intervalUnit;
  }

  /** @param intervalUnit Unit for the plan's billing interval. */
  public void setIntervalUnit(final String intervalUnit) {
    this.intervalUnit = intervalUnit;
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

  /** Units for the plan's trial period. */
  public String getTrialUnit() {
    return this.trialUnit;
  }

  /** @param trialUnit Units for the plan's trial period. */
  public void setTrialUnit(final String trialUnit) {
    this.trialUnit = trialUnit;
  }
}
