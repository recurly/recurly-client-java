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

  @SerializedName("company")
  @Expose
  private String company;

  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  @SerializedName("first_name")
  @Expose
  private String firstName;

  @SerializedName("fraud")
  @Expose
  private FraudInfo fraud;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("last_name")
  @Expose
  private String lastName;

  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("payment_method")
  @Expose
  private BillingInfoPaymentMethod paymentMethod;

  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  @SerializedName("updated_by")
  @Expose
  private BillingInfoUpdatedBy updatedBy;

  @SerializedName("valid")
  @Expose
  private Boolean valid;

  @SerializedName("vat_number")
  @Expose
  private String vatNumber;

  public String getAccountId() {
    return this.accountId;
  }

  public void setAccountId(final String accountId) {
    this.accountId = accountId;
  }

  public Address getAddress() {
    return this.address;
  }

  public void setAddress(final Address address) {
    this.address = address;
  }

  public String getCompany() {
    return this.company;
  }

  public void setCompany(final String company) {
    this.company = company;
  }

  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public FraudInfo getFraud() {
    return this.fraud;
  }

  public void setFraud(final FraudInfo fraud) {
    this.fraud = fraud;
  }

  public String getId() {
    return this.id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  public String getObject() {
    return this.object;
  }

  public void setObject(final String object) {
    this.object = object;
  }

  public BillingInfoPaymentMethod getPaymentMethod() {
    return this.paymentMethod;
  }

  public void setPaymentMethod(final BillingInfoPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public BillingInfoUpdatedBy getUpdatedBy() {
    return this.updatedBy;
  }

  public void setUpdatedBy(final BillingInfoUpdatedBy updatedBy) {
    this.updatedBy = updatedBy;
  }

  public Boolean getValid() {
    return this.valid;
  }

  public void setValid(final Boolean valid) {
    this.valid = valid;
  }

  public String getVatNumber() {
    return this.vatNumber;
  }

  public void setVatNumber(final String vatNumber) {
    this.vatNumber = vatNumber;
  }
}
