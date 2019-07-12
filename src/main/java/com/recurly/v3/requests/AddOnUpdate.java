package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class AddOnUpdate extends Request {

  @SerializedName("accounting_code")
  @Expose
  private String accountingCode;

  @SerializedName("code")
  @Expose
  private String code;

  @SerializedName("currencies")
  @Expose
  private List<AddOnPricing> currencies;

  @SerializedName("default_quantity")
  @Expose
  private Integer defaultQuantity;

  @SerializedName("display_quantity")
  @Expose
  private Boolean displayQuantity;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("name")
  @Expose
  private String name;

  @SerializedName("tax_code")
  @Expose
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

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getName() { return this.name; }
  public void setName(final String name) { this.name = name; }

  public String getTaxCode() { return this.taxCode; }
  public void setTaxCode(final String taxCode) { this.taxCode = taxCode; }

}
