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

public class ShippingAddressUpdate extends Request {

  @SerializedName("city")
  @Expose
  private String city;

  @SerializedName("company")
  @Expose
  private String company;

  /** Country, 2-letter ISO 3166-1 alpha-2 code. */
  @SerializedName("country")
  @Expose
  private String country;

  @SerializedName("email")
  @Expose
  private String email;

  @SerializedName("first_name")
  @Expose
  private String firstName;

  /**
   * Code that represents a geographic entity (location or object). Only returned for Sling Vertex
   * Integration
   */
  @SerializedName("geo_code")
  @Expose
  private String geoCode;

  /** Shipping Address ID */
  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("last_name")
  @Expose
  private String lastName;

  @SerializedName("nickname")
  @Expose
  private String nickname;

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

  @SerializedName("street1")
  @Expose
  private String street1;

  @SerializedName("street2")
  @Expose
  private String street2;

  @SerializedName("vat_number")
  @Expose
  private String vatNumber;

  public String getCity() {
    return this.city;
  }

  /** @param city */
  public void setCity(final String city) {
    this.city = city;
  }

  public String getCompany() {
    return this.company;
  }

  /** @param company */
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

  public String getEmail() {
    return this.email;
  }

  /** @param email */
  public void setEmail(final String email) {
    this.email = email;
  }

  public String getFirstName() {
    return this.firstName;
  }

  /** @param firstName */
  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  /**
   * Code that represents a geographic entity (location or object). Only returned for Sling Vertex
   * Integration
   */
  public String getGeoCode() {
    return this.geoCode;
  }

  /**
   * @param geoCode Code that represents a geographic entity (location or object). Only returned for
   *     Sling Vertex Integration
   */
  public void setGeoCode(final String geoCode) {
    this.geoCode = geoCode;
  }

  /** Shipping Address ID */
  public String getId() {
    return this.id;
  }

  /** @param id Shipping Address ID */
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

  public String getNickname() {
    return this.nickname;
  }

  /** @param nickname */
  public void setNickname(final String nickname) {
    this.nickname = nickname;
  }

  public String getPhone() {
    return this.phone;
  }

  /** @param phone */
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

  public String getStreet1() {
    return this.street1;
  }

  /** @param street1 */
  public void setStreet1(final String street1) {
    this.street1 = street1;
  }

  public String getStreet2() {
    return this.street2;
  }

  /** @param street2 */
  public void setStreet2(final String street2) {
    this.street2 = street2;
  }

  public String getVatNumber() {
    return this.vatNumber;
  }

  /** @param vatNumber */
  public void setVatNumber(final String vatNumber) {
    this.vatNumber = vatNumber;
  }
}
