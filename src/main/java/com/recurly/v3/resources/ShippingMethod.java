/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.time.ZonedDateTime;

public class ShippingMethod extends Resource {

  /** Accounting code for shipping method. */
  @SerializedName("accounting_code")
  @Expose
  private String accountingCode;

  /** The internal name used identify the shipping method. */
  @SerializedName("code")
  @Expose
  private String code;

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private ZonedDateTime createdAt;

  /** Deleted at */
  @SerializedName("deleted_at")
  @Expose
  private ZonedDateTime deletedAt;

  /** Shipping Method ID */
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

  /** The name of the shipping method displayed to customers. */
  @SerializedName("name")
  @Expose
  private String name;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /**
   * The ID of a performance obligation. Performance obligations are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  @SerializedName("performance_obligation_id")
  @Expose
  private String performanceObligationId;

  /**
   * The ID of a general ledger account. General ledger accounts are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  @SerializedName("revenue_gl_account_id")
  @Expose
  private String revenueGlAccountId;

  /**
   * Used by Avalara, Vertex, and Recurly’s built-in tax feature. The tax code values are specific
   * to each tax system. If you are using Recurly’s built-in taxes the values are:
   *
   * <p>- `FR` – Common Carrier FOB Destination - `FR022000` – Common Carrier FOB Origin -
   * `FR020400` – Non Common Carrier FOB Destination - `FR020500` – Non Common Carrier FOB Origin -
   * `FR010100` – Delivery by Company Vehicle Before Passage of Title - `FR010200` – Delivery by
   * Company Vehicle After Passage of Title - `NT` – Non-Taxable
   */
  @SerializedName("tax_code")
  @Expose
  private String taxCode;

  /** Last updated at */
  @SerializedName("updated_at")
  @Expose
  private ZonedDateTime updatedAt;

  /** Accounting code for shipping method. */
  public String getAccountingCode() {
    return this.accountingCode;
  }

  /**
   * @param accountingCode Accounting code for shipping method.
   */
  public void setAccountingCode(final String accountingCode) {
    this.accountingCode = accountingCode;
  }

  /** The internal name used identify the shipping method. */
  public String getCode() {
    return this.code;
  }

  /**
   * @param code The internal name used identify the shipping method.
   */
  public void setCode(final String code) {
    this.code = code;
  }

  /** Created at */
  public ZonedDateTime getCreatedAt() {
    return this.createdAt;
  }

  /**
   * @param createdAt Created at
   */
  public void setCreatedAt(final ZonedDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** Deleted at */
  public ZonedDateTime getDeletedAt() {
    return this.deletedAt;
  }

  /**
   * @param deletedAt Deleted at
   */
  public void setDeletedAt(final ZonedDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  /** Shipping Method ID */
  public String getId() {
    return this.id;
  }

  /**
   * @param id Shipping Method ID
   */
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

  /** The name of the shipping method displayed to customers. */
  public String getName() {
    return this.name;
  }

  /**
   * @param name The name of the shipping method displayed to customers.
   */
  public void setName(final String name) {
    this.name = name;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /**
   * @param object Object type
   */
  public void setObject(final String object) {
    this.object = object;
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

  /**
   * Used by Avalara, Vertex, and Recurly’s built-in tax feature. The tax code values are specific
   * to each tax system. If you are using Recurly’s built-in taxes the values are:
   *
   * <p>- `FR` – Common Carrier FOB Destination - `FR022000` – Common Carrier FOB Origin -
   * `FR020400` – Non Common Carrier FOB Destination - `FR020500` – Non Common Carrier FOB Origin -
   * `FR010100` – Delivery by Company Vehicle Before Passage of Title - `FR010200` – Delivery by
   * Company Vehicle After Passage of Title - `NT` – Non-Taxable
   */
  public String getTaxCode() {
    return this.taxCode;
  }

  /**
   * @param taxCode Used by Avalara, Vertex, and Recurly’s built-in tax feature. The tax code values
   *     are specific to each tax system. If you are using Recurly’s built-in taxes the values are:
   *     <p>- `FR` – Common Carrier FOB Destination - `FR022000` – Common Carrier FOB Origin -
   *     `FR020400` – Non Common Carrier FOB Destination - `FR020500` – Non Common Carrier FOB
   *     Origin - `FR010100` – Delivery by Company Vehicle Before Passage of Title - `FR010200` –
   *     Delivery by Company Vehicle After Passage of Title - `NT` – Non-Taxable
   */
  public void setTaxCode(final String taxCode) {
    this.taxCode = taxCode;
  }

  /** Last updated at */
  public ZonedDateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * @param updatedAt Last updated at
   */
  public void setUpdatedAt(final ZonedDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
}
