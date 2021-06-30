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

public class BillingInfo extends Resource {

  @SerializedName("account_id")
  @Expose
  private String accountId;

  @SerializedName("address")
  @Expose
  private Address address;

  /**
   * The `backup_payment_method` field is used to indicate a billing info as a backup on the account
   * that will be tried if the initial billing info used for an invoice is declined.
   */
  @SerializedName("backup_payment_method")
  @Expose
  private Boolean backupPaymentMethod;

  @SerializedName("company")
  @Expose
  private String company;

  /** When the billing information was created. */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  @SerializedName("first_name")
  @Expose
  private String firstName;

  /** Most recent fraud result. */
  @SerializedName("fraud")
  @Expose
  private FraudInfo fraud;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("last_name")
  @Expose
  private String lastName;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("payment_method")
  @Expose
  private PaymentMethod paymentMethod;

  /**
   * The `primary_payment_method` field is used to indicate the primary billing info on the account.
   * The first billing info created on an account will always become primary. This payment method
   * will be used
   */
  @SerializedName("primary_payment_method")
  @Expose
  private Boolean primaryPaymentMethod;

  /** When the billing information was last changed. */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  @SerializedName("updated_by")
  @Expose
  private BillingInfoUpdatedBy updatedBy;

  @SerializedName("valid")
  @Expose
  private Boolean valid;

  /**
   * Customer's VAT number (to avoid having the VAT applied). This is only used for automatically
   * collected invoices.
   */
  @SerializedName("vat_number")
  @Expose
  private String vatNumber;

  public String getAccountId() {
    return this.accountId;
  }

  /** @param accountId */
  public void setAccountId(final String accountId) {
    this.accountId = accountId;
  }

  public Address getAddress() {
    return this.address;
  }

  /** @param address */
  public void setAddress(final Address address) {
    this.address = address;
  }

  /**
   * The `backup_payment_method` field is used to indicate a billing info as a backup on the account
   * that will be tried if the initial billing info used for an invoice is declined.
   */
  public Boolean getBackupPaymentMethod() {
    return this.backupPaymentMethod;
  }

  /**
   * @param backupPaymentMethod The `backup_payment_method` field is used to indicate a billing info
   *     as a backup on the account that will be tried if the initial billing info used for an
   *     invoice is declined.
   */
  public void setBackupPaymentMethod(final Boolean backupPaymentMethod) {
    this.backupPaymentMethod = backupPaymentMethod;
  }

  public String getCompany() {
    return this.company;
  }

  /** @param company */
  public void setCompany(final String company) {
    this.company = company;
  }

  /** When the billing information was created. */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt When the billing information was created. */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public String getFirstName() {
    return this.firstName;
  }

  /** @param firstName */
  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  /** Most recent fraud result. */
  public FraudInfo getFraud() {
    return this.fraud;
  }

  /** @param fraud Most recent fraud result. */
  public void setFraud(final FraudInfo fraud) {
    this.fraud = fraud;
  }

  public String getId() {
    return this.id;
  }

  /** @param id */
  public void setId(final String id) {
    this.id = id;
  }

  public String getLastName() {
    return this.lastName;
  }

  /** @param lastName */
  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  public PaymentMethod getPaymentMethod() {
    return this.paymentMethod;
  }

  /** @param paymentMethod */
  public void setPaymentMethod(final PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  /**
   * The `primary_payment_method` field is used to indicate the primary billing info on the account.
   * The first billing info created on an account will always become primary. This payment method
   * will be used
   */
  public Boolean getPrimaryPaymentMethod() {
    return this.primaryPaymentMethod;
  }

  /**
   * @param primaryPaymentMethod The `primary_payment_method` field is used to indicate the primary
   *     billing info on the account. The first billing info created on an account will always
   *     become primary. This payment method will be used
   */
  public void setPrimaryPaymentMethod(final Boolean primaryPaymentMethod) {
    this.primaryPaymentMethod = primaryPaymentMethod;
  }

  /** When the billing information was last changed. */
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt When the billing information was last changed. */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public BillingInfoUpdatedBy getUpdatedBy() {
    return this.updatedBy;
  }

  /** @param updatedBy */
  public void setUpdatedBy(final BillingInfoUpdatedBy updatedBy) {
    this.updatedBy = updatedBy;
  }

  public Boolean getValid() {
    return this.valid;
  }

  /** @param valid */
  public void setValid(final Boolean valid) {
    this.valid = valid;
  }

  /**
   * Customer's VAT number (to avoid having the VAT applied). This is only used for automatically
   * collected invoices.
   */
  public String getVatNumber() {
    return this.vatNumber;
  }

  /**
   * @param vatNumber Customer's VAT number (to avoid having the VAT applied). This is only used for
   *     automatically collected invoices.
   */
  public void setVatNumber(final String vatNumber) {
    this.vatNumber = vatNumber;
  }
}
