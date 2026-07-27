/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Constants;
import com.recurly.v3.Resource;
import java.time.ZonedDateTime;
import java.util.List;

public class BusinessEntity extends Resource {

  /** The entity code of the business entity. */
  @SerializedName("code")
  @Expose
  private String code;

  /** Created at */
  @SerializedName("created_at")
  @Expose
  private ZonedDateTime createdAt;

  /**
   * The ID of a general ledger account. General ledger accounts are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  @SerializedName("default_liability_gl_account_id")
  @Expose
  private String defaultLiabilityGlAccountId;

  /** Registration number for the customer used on the invoice. */
  @SerializedName("default_registration_number")
  @Expose
  private String defaultRegistrationNumber;

  /**
   * The ID of a general ledger account. General ledger accounts are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  @SerializedName("default_revenue_gl_account_id")
  @Expose
  private String defaultRevenueGlAccountId;

  /** VAT number for the customer used on the invoice. */
  @SerializedName("default_vat_number")
  @Expose
  private String defaultVatNumber;

  /**
   * The source of the address that will be used as the destinaion in determining taxes. Available
   * only when the site is on an Elite plan. A value of "destination" refers to the "Customer tax
   * address". A value of "origin" refers to the "Business entity tax address".
   */
  @SerializedName("destination_tax_address_source")
  @Expose
  private Constants.DestinationTaxAddressSource destinationTaxAddressSource;

  /** Business entity ID */
  @SerializedName("id")
  @Expose
  private String id;

  /** Address information for the business entity that will appear on the invoice. */
  @SerializedName("invoice_display_address")
  @Expose
  private Address invoiceDisplayAddress;

  /** This name describes your business entity and will appear on the invoice. */
  @SerializedName("name")
  @Expose
  private String name;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /**
   * The source of the address that will be used as the origin in determining taxes. Available only
   * when the site is on an Elite plan. A value of "origin" refers to the "Business entity tax
   * address". A value of "destination" refers to the "Customer tax address".
   */
  @SerializedName("origin_tax_address_source")
  @Expose
  private Constants.OriginTaxAddressSource originTaxAddressSource;

  /** List of countries for which the business entity will be used. */
  @SerializedName("subscriber_location_countries")
  @Expose
  private List<String> subscriberLocationCountries;

  /** Address information for the business entity that will be used for calculating taxes. */
  @SerializedName("tax_address")
  @Expose
  private Address taxAddress;

  /** Last updated at */
  @SerializedName("updated_at")
  @Expose
  private ZonedDateTime updatedAt;

  /** The entity code of the business entity. */
  public String getCode() {
    return this.code;
  }

  /**
   * @param code The entity code of the business entity.
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

  /**
   * The ID of a general ledger account. General ledger accounts are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  public String getDefaultLiabilityGlAccountId() {
    return this.defaultLiabilityGlAccountId;
  }

  /**
   * @param defaultLiabilityGlAccountId The ID of a general ledger account. General ledger accounts
   *     are only accessible as a part of the Recurly RevRec Standard and Recurly RevRec Advanced
   *     features.
   */
  public void setDefaultLiabilityGlAccountId(final String defaultLiabilityGlAccountId) {
    this.defaultLiabilityGlAccountId = defaultLiabilityGlAccountId;
  }

  /** Registration number for the customer used on the invoice. */
  public String getDefaultRegistrationNumber() {
    return this.defaultRegistrationNumber;
  }

  /**
   * @param defaultRegistrationNumber Registration number for the customer used on the invoice.
   */
  public void setDefaultRegistrationNumber(final String defaultRegistrationNumber) {
    this.defaultRegistrationNumber = defaultRegistrationNumber;
  }

  /**
   * The ID of a general ledger account. General ledger accounts are only accessible as a part of
   * the Recurly RevRec Standard and Recurly RevRec Advanced features.
   */
  public String getDefaultRevenueGlAccountId() {
    return this.defaultRevenueGlAccountId;
  }

  /**
   * @param defaultRevenueGlAccountId The ID of a general ledger account. General ledger accounts
   *     are only accessible as a part of the Recurly RevRec Standard and Recurly RevRec Advanced
   *     features.
   */
  public void setDefaultRevenueGlAccountId(final String defaultRevenueGlAccountId) {
    this.defaultRevenueGlAccountId = defaultRevenueGlAccountId;
  }

  /** VAT number for the customer used on the invoice. */
  public String getDefaultVatNumber() {
    return this.defaultVatNumber;
  }

  /**
   * @param defaultVatNumber VAT number for the customer used on the invoice.
   */
  public void setDefaultVatNumber(final String defaultVatNumber) {
    this.defaultVatNumber = defaultVatNumber;
  }

  /**
   * The source of the address that will be used as the destinaion in determining taxes. Available
   * only when the site is on an Elite plan. A value of "destination" refers to the "Customer tax
   * address". A value of "origin" refers to the "Business entity tax address".
   */
  public Constants.DestinationTaxAddressSource getDestinationTaxAddressSource() {
    return this.destinationTaxAddressSource;
  }

  /**
   * @param destinationTaxAddressSource The source of the address that will be used as the
   *     destinaion in determining taxes. Available only when the site is on an Elite plan. A value
   *     of "destination" refers to the "Customer tax address". A value of "origin" refers to the
   *     "Business entity tax address".
   */
  public void setDestinationTaxAddressSource(
      final Constants.DestinationTaxAddressSource destinationTaxAddressSource) {
    this.destinationTaxAddressSource = destinationTaxAddressSource;
  }

  /** Business entity ID */
  public String getId() {
    return this.id;
  }

  /**
   * @param id Business entity ID
   */
  public void setId(final String id) {
    this.id = id;
  }

  /** Address information for the business entity that will appear on the invoice. */
  public Address getInvoiceDisplayAddress() {
    return this.invoiceDisplayAddress;
  }

  /**
   * @param invoiceDisplayAddress Address information for the business entity that will appear on
   *     the invoice.
   */
  public void setInvoiceDisplayAddress(final Address invoiceDisplayAddress) {
    this.invoiceDisplayAddress = invoiceDisplayAddress;
  }

  /** This name describes your business entity and will appear on the invoice. */
  public String getName() {
    return this.name;
  }

  /**
   * @param name This name describes your business entity and will appear on the invoice.
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
   * The source of the address that will be used as the origin in determining taxes. Available only
   * when the site is on an Elite plan. A value of "origin" refers to the "Business entity tax
   * address". A value of "destination" refers to the "Customer tax address".
   */
  public Constants.OriginTaxAddressSource getOriginTaxAddressSource() {
    return this.originTaxAddressSource;
  }

  /**
   * @param originTaxAddressSource The source of the address that will be used as the origin in
   *     determining taxes. Available only when the site is on an Elite plan. A value of "origin"
   *     refers to the "Business entity tax address". A value of "destination" refers to the
   *     "Customer tax address".
   */
  public void setOriginTaxAddressSource(
      final Constants.OriginTaxAddressSource originTaxAddressSource) {
    this.originTaxAddressSource = originTaxAddressSource;
  }

  /** List of countries for which the business entity will be used. */
  public List<String> getSubscriberLocationCountries() {
    return this.subscriberLocationCountries;
  }

  /**
   * @param subscriberLocationCountries List of countries for which the business entity will be
   *     used.
   */
  public void setSubscriberLocationCountries(final List<String> subscriberLocationCountries) {
    this.subscriberLocationCountries = subscriberLocationCountries;
  }

  /** Address information for the business entity that will be used for calculating taxes. */
  public Address getTaxAddress() {
    return this.taxAddress;
  }

  /**
   * @param taxAddress Address information for the business entity that will be used for calculating
   *     taxes.
   */
  public void setTaxAddress(final Address taxAddress) {
    this.taxAddress = taxAddress;
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
