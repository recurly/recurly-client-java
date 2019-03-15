package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class AddOnCreate extends Request {

  @SerializedName("accounting_code")
  private String accountingCode;

  @SerializedName("code")
  private String code;

  @SerializedName("currencies")
  private List<AddOnPricing> currencies;

  @SerializedName("default_quantity")
  private Integer defaultQuantity;

  @SerializedName("display_quantity")
  private Boolean displayQuantity;

  @SerializedName("name")
  private String name;

  @SerializedName("plan_id")
  private String planId;

  @SerializedName("tax_code")
  private String taxCode;


  public String getAccountingCode() { return this.accountingCode; }
  public void setAccountingCode(final String accountingCode) { this.accountingCode = accountingCode; }

  public String getCode() { return this.code; }
  public void setCode(final String code) { this.code = code; }

  public List<AddOnPricing> getCurrencies() { return this.currencies; }
  public void setCurrencies(final List<AddOnPricing> currencies) { this.currencies = currencies; }

  public Integer getDefaultQuantity() { return this.defaultQuantity; }
  public void setDefaultQuantity(final Integer defaultQuantity) { this.defaultQuantity = defaultQuantity; }

  public Boolean getDisplayQuantity() { return this.displayQuantity; }
  public void setDisplayQuantity(final Boolean displayQuantity) { this.displayQuantity = displayQuantity; }

  public String getName() { return this.name; }
  public void setName(final String name) { this.name = name; }

  public String getPlanId() { return this.planId; }
  public void setPlanId(final String planId) { this.planId = planId; }

  public String getTaxCode() { return this.taxCode; }
  public void setTaxCode(final String taxCode) { this.taxCode = taxCode; }

}
