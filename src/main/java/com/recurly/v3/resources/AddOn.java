package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class AddOn extends Resource {

  @SerializedName("accounting_code")
  @Expose
  private String accountingCode;

  @SerializedName("code")
  @Expose
  private String code;

  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  @SerializedName("currencies")
  @Expose
  private List<AddOnPricing> currencies;

  @SerializedName("default_quantity")
  @Expose
  private Integer defaultQuantity;

  @SerializedName("deleted_at")
  @Expose
  private DateTime deletedAt;

  @SerializedName("display_quantity")
  @Expose
  private Boolean displayQuantity;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("name")
  @Expose
  private String name;

  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("plan_id")
  @Expose
  private String planId;

  @SerializedName("state")
  @Expose
  private String state;

  @SerializedName("tax_code")
  @Expose
  private String taxCode;

  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;


  public String getAccountingCode() { return this.accountingCode; }
  public void setAccountingCode(final String accountingCode) { this.accountingCode = accountingCode; }

  public String getCode() { return this.code; }
  public void setCode(final String code) { this.code = code; }

  public DateTime getCreatedAt() { return this.createdAt; }
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  public List<AddOnPricing> getCurrencies() { return this.currencies; }
  public void setCurrencies(final List<AddOnPricing> currencies) { this.currencies = currencies; }

  public Integer getDefaultQuantity() { return this.defaultQuantity; }
  public void setDefaultQuantity(final Integer defaultQuantity) { this.defaultQuantity = defaultQuantity; }

  public DateTime getDeletedAt() { return this.deletedAt; }
  public void setDeletedAt(final DateTime deletedAt) { this.deletedAt = deletedAt; }

  public Boolean getDisplayQuantity() { return this.displayQuantity; }
  public void setDisplayQuantity(final Boolean displayQuantity) { this.displayQuantity = displayQuantity; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getName() { return this.name; }
  public void setName(final String name) { this.name = name; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public String getPlanId() { return this.planId; }
  public void setPlanId(final String planId) { this.planId = planId; }

  public String getState() { return this.state; }
  public void setState(final String state) { this.state = state; }

  public String getTaxCode() { return this.taxCode; }
  public void setTaxCode(final String taxCode) { this.taxCode = taxCode; }

  public DateTime getUpdatedAt() { return this.updatedAt; }
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

}
