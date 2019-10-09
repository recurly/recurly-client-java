/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;

public class ShippingMethod extends Resource {

  /** The internal name used identify the shipping method. */
  @SerializedName("code")
  @Expose
  private String code;

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  /** Deleted at */
  @SerializedName("deleted_at")
  @Expose
  private DateTime deletedAt;

  /** Shipping Method ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** The name of the shipping method displayed to customers. */
  @SerializedName("name")
  @Expose
  private String name;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

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
  private DateTime updatedAt;

  /** The internal name used identify the shipping method. */
  public String getCode() {
    return this.code;
  }

  /** @param code The internal name used identify the shipping method. */
  public void setCode(final String code) {
    this.code = code;
  }

  /** Created at */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt Created at */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** Deleted at */
  public DateTime getDeletedAt() {
    return this.deletedAt;
  }

  /** @param deletedAt Deleted at */
  public void setDeletedAt(final DateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  /** Shipping Method ID */
  public String getId() {
    return this.id;
  }

  /** @param id Shipping Method ID */
  public void setId(final String id) {
    this.id = id;
  }

  /** The name of the shipping method displayed to customers. */
  public String getName() {
    return this.name;
  }

  /** @param name The name of the shipping method displayed to customers. */
  public void setName(final String name) {
    this.name = name;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
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
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt Last updated at */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
}
