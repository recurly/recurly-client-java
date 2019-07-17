/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class PlanCreate extends Request {

  @SerializedName("accounting_code")
  @Expose
  private String accountingCode;

  @SerializedName("add_ons")
  @Expose
  private List<AddOnCreate> addOns;

  @SerializedName("auto_renew")
  @Expose
  private Boolean autoRenew;

  @SerializedName("code")
  @Expose
  private String code;

  @SerializedName("currencies")
  @Expose
  private List<PlanPricing> currencies;

  @SerializedName("description")
  @Expose
  private String description;

  @SerializedName("hosted_pages")
  @Expose
  private PlanHostedPages hostedPages;

  @SerializedName("interval_length")
  @Expose
  private Integer intervalLength;

  @SerializedName("interval_unit")
  @Expose
  private String intervalUnit;

  @SerializedName("name")
  @Expose
  private String name;

  @SerializedName("setup_fee_accounting_code")
  @Expose
  private String setupFeeAccountingCode;

  @SerializedName("tax_code")
  @Expose
  private String taxCode;

  @SerializedName("tax_exempt")
  @Expose
  private Boolean taxExempt;

  @SerializedName("total_billing_cycles")
  @Expose
  private Integer totalBillingCycles;

  @SerializedName("trial_length")
  @Expose
  private Integer trialLength;

  @SerializedName("trial_unit")
  @Expose
  private String trialUnit;


  public String getAccountingCode() { return this.accountingCode; }
  public void setAccountingCode(final String accountingCode) { this.accountingCode = accountingCode; }

  public List<AddOnCreate> getAddOns() { return this.addOns; }
  public void setAddOns(final List<AddOnCreate> addOns) { this.addOns = addOns; }

  public Boolean getAutoRenew() { return this.autoRenew; }
  public void setAutoRenew(final Boolean autoRenew) { this.autoRenew = autoRenew; }

  public String getCode() { return this.code; }
  public void setCode(final String code) { this.code = code; }

  public List<PlanPricing> getCurrencies() { return this.currencies; }
  public void setCurrencies(final List<PlanPricing> currencies) { this.currencies = currencies; }

  public String getDescription() { return this.description; }
  public void setDescription(final String description) { this.description = description; }

  public PlanHostedPages getHostedPages() { return this.hostedPages; }
  public void setHostedPages(final PlanHostedPages hostedPages) { this.hostedPages = hostedPages; }

  public Integer getIntervalLength() { return this.intervalLength; }
  public void setIntervalLength(final Integer intervalLength) { this.intervalLength = intervalLength; }

  public String getIntervalUnit() { return this.intervalUnit; }
  public void setIntervalUnit(final String intervalUnit) { this.intervalUnit = intervalUnit; }

  public String getName() { return this.name; }
  public void setName(final String name) { this.name = name; }

  public String getSetupFeeAccountingCode() { return this.setupFeeAccountingCode; }
  public void setSetupFeeAccountingCode(final String setupFeeAccountingCode) { this.setupFeeAccountingCode = setupFeeAccountingCode; }

  public String getTaxCode() { return this.taxCode; }
  public void setTaxCode(final String taxCode) { this.taxCode = taxCode; }

  public Boolean getTaxExempt() { return this.taxExempt; }
  public void setTaxExempt(final Boolean taxExempt) { this.taxExempt = taxExempt; }

  public Integer getTotalBillingCycles() { return this.totalBillingCycles; }
  public void setTotalBillingCycles(final Integer totalBillingCycles) { this.totalBillingCycles = totalBillingCycles; }

  public Integer getTrialLength() { return this.trialLength; }
  public void setTrialLength(final Integer trialLength) { this.trialLength = trialLength; }

  public String getTrialUnit() { return this.trialUnit; }
  public void setTrialUnit(final String trialUnit) { this.trialUnit = trialUnit; }

}
