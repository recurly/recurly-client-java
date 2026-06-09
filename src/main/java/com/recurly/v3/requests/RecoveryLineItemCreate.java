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
import java.math.BigDecimal;
import java.util.List;

public class RecoveryLineItemCreate extends Request {

  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  @SerializedName("custom_fields")
  @Expose
  private List<CustomField> customFields;

  /** Description that appears on the invoice. */
  @SerializedName("description")
  @Expose
  private String description;

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

  /**
   * Optional field to track a product code or SKU for the line item. This can be used to later
   * reporting on product purchases.
   */
  @SerializedName("product_code")
  @Expose
  private String productCode;

  /**
   * This number will be multiplied by the unit amount to compute the subtotal before any discounts
   * or taxes.
   */
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /** The tax amount for the line item. */
  @SerializedName("tax")
  @Expose
  private BigDecimal tax;

  /** A positive or negative amount will result in a positive `unit_amount`. */
  @SerializedName("unit_amount")
  @Expose
  private BigDecimal unitAmount;

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

  /** Description that appears on the invoice. */
  public String getDescription() {
    return this.description;
  }

  /** @param description Description that appears on the invoice. */
  public void setDescription(final String description) {
    this.description = description;
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

  /**
   * Optional field to track a product code or SKU for the line item. This can be used to later
   * reporting on product purchases.
   */
  public String getProductCode() {
    return this.productCode;
  }

  /**
   * @param productCode Optional field to track a product code or SKU for the line item. This can be
   *     used to later reporting on product purchases.
   */
  public void setProductCode(final String productCode) {
    this.productCode = productCode;
  }

  /**
   * This number will be multiplied by the unit amount to compute the subtotal before any discounts
   * or taxes.
   */
  public Integer getQuantity() {
    return this.quantity;
  }

  /**
   * @param quantity This number will be multiplied by the unit amount to compute the subtotal
   *     before any discounts or taxes.
   */
  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  /** The tax amount for the line item. */
  public BigDecimal getTax() {
    return this.tax;
  }

  /** @param tax The tax amount for the line item. */
  public void setTax(final BigDecimal tax) {
    this.tax = tax;
  }

  /** A positive or negative amount will result in a positive `unit_amount`. */
  public BigDecimal getUnitAmount() {
    return this.unitAmount;
  }

  /** @param unitAmount A positive or negative amount will result in a positive `unit_amount`. */
  public void setUnitAmount(final BigDecimal unitAmount) {
    this.unitAmount = unitAmount;
  }
}
