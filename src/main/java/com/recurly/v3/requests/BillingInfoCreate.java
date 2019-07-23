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

public class BillingInfoCreate extends Request {

  @SerializedName("address")
  @Expose
  private Address address;

  @SerializedName("amazon_billing_agreement_id")
  @Expose
  private String amazonBillingAgreementId;

  @SerializedName("company")
  @Expose
  private String company;

  @SerializedName("cvv")
  @Expose
  private String cvv;

  @SerializedName("first_name")
  @Expose
  private String firstName;

  @SerializedName("ip_address")
  @Expose
  private String ipAddress;

  @SerializedName("last_name")
  @Expose
  private String lastName;

  @SerializedName("month")
  @Expose
  private String month;

  @SerializedName("number")
  @Expose
  private String number;

  @SerializedName("paypal_billing_agreement_id")
  @Expose
  private String paypalBillingAgreementId;

  @SerializedName("token_id")
  @Expose
  private String tokenId;

  @SerializedName("vat_number")
  @Expose
  private String vatNumber;

  @SerializedName("year")
  @Expose
  private String year;

  public Address getAddress() {
    return this.address;
  }

  public void setAddress(final Address address) {
    this.address = address;
  }

  public String getAmazonBillingAgreementId() {
    return this.amazonBillingAgreementId;
  }

  public void setAmazonBillingAgreementId(final String amazonBillingAgreementId) {
    this.amazonBillingAgreementId = amazonBillingAgreementId;
  }

  public String getCompany() {
    return this.company;
  }

  public void setCompany(final String company) {
    this.company = company;
  }

  public String getCvv() {
    return this.cvv;
  }

  public void setCvv(final String cvv) {
    this.cvv = cvv;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public String getIpAddress() {
    return this.ipAddress;
  }

  public void setIpAddress(final String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  public String getMonth() {
    return this.month;
  }

  public void setMonth(final String month) {
    this.month = month;
  }

  public String getNumber() {
    return this.number;
  }

  public void setNumber(final String number) {
    this.number = number;
  }

  public String getPaypalBillingAgreementId() {
    return this.paypalBillingAgreementId;
  }

  public void setPaypalBillingAgreementId(final String paypalBillingAgreementId) {
    this.paypalBillingAgreementId = paypalBillingAgreementId;
  }

  public String getTokenId() {
    return this.tokenId;
  }

  public void setTokenId(final String tokenId) {
    this.tokenId = tokenId;
  }

  public String getVatNumber() {
    return this.vatNumber;
  }

  public void setVatNumber(final String vatNumber) {
    this.vatNumber = vatNumber;
  }

  public String getYear() {
    return this.year;
  }

  public void setYear(final String year) {
    this.year = year;
  }
}
