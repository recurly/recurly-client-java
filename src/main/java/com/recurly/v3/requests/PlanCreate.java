package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class PlanCreate extends Request {

  @SerializedName("accounting_code")
  private String accountingCode;

  @SerializedName("add_ons")
  private List<AddOnCreate> addOns;

  @SerializedName("auto_renew")
  private Boolean autoRenew;

  @SerializedName("code")
  private String code;

  @SerializedName("currencies")
  private List<PlanPricing> currencies;

  @SerializedName("description")
  private String description;

  @SerializedName("hosted_pages")
  private PlanHostedPages hostedPages;

  @SerializedName("interval_length")
  private Integer intervalLength;

  @SerializedName("interval_unit")
  private String intervalUnit;

  @SerializedName("name")
  private String name;

  @SerializedName("setup_fee_accounting_code")
  private String setupFeeAccountingCode;

  @SerializedName("tax_code")
  private String taxCode;

  @SerializedName("tax_exempt")
  private Boolean taxExempt;

  @SerializedName("total_billing_cycles")
  private Integer totalBillingCycles;

  @SerializedName("trial_length")
  private Integer trialLength;

  @SerializedName("trial_unit")
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
