/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import com.recurly.v3.Constants;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

public class Item extends Resource {

  
  /**
   * Accounting code for invoice line items.
   */
  
  @SerializedName("accounting_code")
  @Expose
  private String accountingCode;

  
  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service type describe how the item is taxed. Refer to [the documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types) for more available t/s types.
   */
  
  @SerializedName("avalara_service_type")
  @Expose
  private Integer avalaraServiceType;

  
  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service type describe how the item is taxed. Refer to [the documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types) for more available t/s types.
   */
  
  @SerializedName("avalara_transaction_type")
  @Expose
  private Integer avalaraTransactionType;

  
  /**
   * Unique code to identify the item.
   */
  
  @SerializedName("code")
  @Expose
  private String code;

  
  /**
   * Created at
   */
  
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  
  /**
   * Item Pricing
   */
  
  @SerializedName("currencies")
  @Expose
  private List<Pricing> currencies;

  
  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty array will not remove any existing values. To remove a field send the name with a null or empty value.
   */
  
  @SerializedName("custom_fields")
  @Expose
  private List<CustomField> customFields;

  
  /**
   * Deleted at
   */
  
  @SerializedName("deleted_at")
  @Expose
  private DateTime deletedAt;

  
  /**
   * Optional, description.
   */
  
  @SerializedName("description")
  @Expose
  private String description;

  
  /**
   * Optional, stock keeping unit to link the item to other inventory systems.
   */
  
  @SerializedName("external_sku")
  @Expose
  private String externalSku;

  
  /**
   * Item ID
   */
  
  @SerializedName("id")
  @Expose
  private String id;

  
  /**
   * This name describes your item and will appear on the invoice when it's purchased on a one time basis.
   */
  
  @SerializedName("name")
  @Expose
  private String name;

  
  /**
   * Object type
   */
  
  @SerializedName("object")
  @Expose
  private String object;

  
  /**
   * Revenue schedule type
   */
  
  @SerializedName("revenue_schedule_type")
  @Expose
  private Constants.RevenueScheduleType revenueScheduleType;

  
  /**
   * The current state of the item.
   */
  
  @SerializedName("state")
  @Expose
  private Constants.ActiveState state;

  
  /**
   * Used by Avalara, Vertex, and Recurly’s EU VAT tax feature. The tax code values are specific to each tax system. If you are using Recurly’s EU VAT feature you can use `unknown`, `physical`, or `digital`.
   */
  
  @SerializedName("tax_code")
  @Expose
  private String taxCode;

  
  /**
   * `true` exempts tax on the item, `false` applies tax on the item.
   */
  
  @SerializedName("tax_exempt")
  @Expose
  private Boolean taxExempt;

  
  /**
   * Last updated at
   */
  
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;



  
  /**
   * Accounting code for invoice line items.
   */
  
  public String getAccountingCode() { return this.accountingCode; }

  
  /**
   * @param accountingCode Accounting code for invoice line items.
   */
  
  public void setAccountingCode(final String accountingCode) { this.accountingCode = accountingCode; }

  
  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service type describe how the item is taxed. Refer to [the documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types) for more available t/s types.
   */
  
  public Integer getAvalaraServiceType() { return this.avalaraServiceType; }

  
  /**
   * @param avalaraServiceType Used by Avalara for Communications taxes. The transaction type in combination with the service type describe how the item is taxed. Refer to [the documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types) for more available t/s types.
   */
  
  public void setAvalaraServiceType(final Integer avalaraServiceType) { this.avalaraServiceType = avalaraServiceType; }

  
  /**
   * Used by Avalara for Communications taxes. The transaction type in combination with the service type describe how the item is taxed. Refer to [the documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types) for more available t/s types.
   */
  
  public Integer getAvalaraTransactionType() { return this.avalaraTransactionType; }

  
  /**
   * @param avalaraTransactionType Used by Avalara for Communications taxes. The transaction type in combination with the service type describe how the item is taxed. Refer to [the documentation](https://help.avalara.com/AvaTax_for_Communications/Tax_Calculation/AvaTax_for_Communications_Tax_Engine/Mapping_Resources/TM_00115_AFC_Modules_Corresponding_Transaction_Types) for more available t/s types.
   */
  
  public void setAvalaraTransactionType(final Integer avalaraTransactionType) { this.avalaraTransactionType = avalaraTransactionType; }

  
  /**
   * Unique code to identify the item.
   */
  
  public String getCode() { return this.code; }

  
  /**
   * @param code Unique code to identify the item.
   */
  
  public void setCode(final String code) { this.code = code; }

  
  /**
   * Created at
   */
  
  public DateTime getCreatedAt() { return this.createdAt; }

  
  /**
   * @param createdAt Created at
   */
  
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  
  /**
   * Item Pricing
   */
  
  public List<Pricing> getCurrencies() { return this.currencies; }

  
  /**
   * @param currencies Item Pricing
   */
  
  public void setCurrencies(final List<Pricing> currencies) { this.currencies = currencies; }

  
  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty array will not remove any existing values. To remove a field send the name with a null or empty value.
   */
  
  public List<CustomField> getCustomFields() { return this.customFields; }

  
  /**
   * @param customFields The custom fields will only be altered when they are included in a request. Sending an empty array will not remove any existing values. To remove a field send the name with a null or empty value.
   */
  
  public void setCustomFields(final List<CustomField> customFields) { this.customFields = customFields; }

  
  /**
   * Deleted at
   */
  
  public DateTime getDeletedAt() { return this.deletedAt; }

  
  /**
   * @param deletedAt Deleted at
   */
  
  public void setDeletedAt(final DateTime deletedAt) { this.deletedAt = deletedAt; }

  
  /**
   * Optional, description.
   */
  
  public String getDescription() { return this.description; }

  
  /**
   * @param description Optional, description.
   */
  
  public void setDescription(final String description) { this.description = description; }

  
  /**
   * Optional, stock keeping unit to link the item to other inventory systems.
   */
  
  public String getExternalSku() { return this.externalSku; }

  
  /**
   * @param externalSku Optional, stock keeping unit to link the item to other inventory systems.
   */
  
  public void setExternalSku(final String externalSku) { this.externalSku = externalSku; }

  
  /**
   * Item ID
   */
  
  public String getId() { return this.id; }

  
  /**
   * @param id Item ID
   */
  
  public void setId(final String id) { this.id = id; }

  
  /**
   * This name describes your item and will appear on the invoice when it's purchased on a one time basis.
   */
  
  public String getName() { return this.name; }

  
  /**
   * @param name This name describes your item and will appear on the invoice when it's purchased on a one time basis.
   */
  
  public void setName(final String name) { this.name = name; }

  
  /**
   * Object type
   */
  
  public String getObject() { return this.object; }

  
  /**
   * @param object Object type
   */
  
  public void setObject(final String object) { this.object = object; }

  
  /**
   * Revenue schedule type
   */
  
  public Constants.RevenueScheduleType getRevenueScheduleType() { return this.revenueScheduleType; }

  
  /**
   * @param revenueScheduleType Revenue schedule type
   */
  
  public void setRevenueScheduleType(final Constants.RevenueScheduleType revenueScheduleType) { this.revenueScheduleType = revenueScheduleType; }

  
  /**
   * The current state of the item.
   */
  
  public Constants.ActiveState getState() { return this.state; }

  
  /**
   * @param state The current state of the item.
   */
  
  public void setState(final Constants.ActiveState state) { this.state = state; }

  
  /**
   * Used by Avalara, Vertex, and Recurly’s EU VAT tax feature. The tax code values are specific to each tax system. If you are using Recurly’s EU VAT feature you can use `unknown`, `physical`, or `digital`.
   */
  
  public String getTaxCode() { return this.taxCode; }

  
  /**
   * @param taxCode Used by Avalara, Vertex, and Recurly’s EU VAT tax feature. The tax code values are specific to each tax system. If you are using Recurly’s EU VAT feature you can use `unknown`, `physical`, or `digital`.
   */
  
  public void setTaxCode(final String taxCode) { this.taxCode = taxCode; }

  
  /**
   * `true` exempts tax on the item, `false` applies tax on the item.
   */
  
  public Boolean getTaxExempt() { return this.taxExempt; }

  
  /**
   * @param taxExempt `true` exempts tax on the item, `false` applies tax on the item.
   */
  
  public void setTaxExempt(final Boolean taxExempt) { this.taxExempt = taxExempt; }

  
  /**
   * Last updated at
   */
  
  public DateTime getUpdatedAt() { return this.updatedAt; }

  
  /**
   * @param updatedAt Last updated at
   */
  
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

}
