/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class InvoiceAddress extends Resource {

  /** City */
  @SerializedName("city")
  @Expose
  private String city;

  /** Company */
  @SerializedName("company")
  @Expose
  private String company;

  /** Country, 2-letter ISO 3166-1 alpha-2 code. */
  @SerializedName("country")
  @Expose
  private String country;

  /** First name */
  @SerializedName("first_name")
  @Expose
  private String firstName;

  /** Last name */
  @SerializedName("last_name")
  @Expose
  private String lastName;

  /** Name on account */
  @SerializedName("name_on_account")
  @Expose
  private String nameOnAccount;

  /** Phone number */
  @SerializedName("phone")
  @Expose
  private String phone;

  /** Zip or postal code. */
  @SerializedName("postal_code")
  @Expose
  private String postalCode;

  /** State or province. */
  @SerializedName("region")
  @Expose
  private String region;

  /** Street 1 */
  @SerializedName("street1")
  @Expose
  private String street1;

  /** Street 2 */
  @SerializedName("street2")
  @Expose
  private String street2;

  /** City */
  public String getCity() {
    return this.city;
  }

  /** @param city City */
  public void setCity(final String city) {
    this.city = city;
  }

  /** Company */
  public String getCompany() {
    return this.company;
  }

  /** @param company Company */
  public void setCompany(final String company) {
    this.company = company;
  }

  /** Country, 2-letter ISO 3166-1 alpha-2 code. */
  public String getCountry() {
    return this.country;
  }

  /** @param country Country, 2-letter ISO 3166-1 alpha-2 code. */
  public void setCountry(final String country) {
    this.country = country;
  }

  /** First name */
  public String getFirstName() {
    return this.firstName;
  }

  /** @param firstName First name */
  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  /** Last name */
  public String getLastName() {
    return this.lastName;
  }

  /** @param lastName Last name */
  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  /** Name on account */
  public String getNameOnAccount() {
    return this.nameOnAccount;
  }

  /** @param nameOnAccount Name on account */
  public void setNameOnAccount(final String nameOnAccount) {
    this.nameOnAccount = nameOnAccount;
  }

  /** Phone number */
  public String getPhone() {
    return this.phone;
  }

  /** @param phone Phone number */
  public void setPhone(final String phone) {
    this.phone = phone;
  }

  /** Zip or postal code. */
  public String getPostalCode() {
    return this.postalCode;
  }

  /** @param postalCode Zip or postal code. */
  public void setPostalCode(final String postalCode) {
    this.postalCode = postalCode;
  }

  /** State or province. */
  public String getRegion() {
    return this.region;
  }

  /** @param region State or province. */
  public void setRegion(final String region) {
    this.region = region;
  }

  /** Street 1 */
  public String getStreet1() {
    return this.street1;
  }

  /** @param street1 Street 1 */
  public void setStreet1(final String street1) {
    this.street1 = street1;
  }

  /** Street 2 */
  public String getStreet2() {
    return this.street2;
  }

  /** @param street2 Street 2 */
  public void setStreet2(final String street2) {
    this.street2 = street2;
  }
}
