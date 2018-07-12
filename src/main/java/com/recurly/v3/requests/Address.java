package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class Address extends Request {

  @SerializedName("city")
  private String city;

  @SerializedName("country")
  private String country;

  @SerializedName("first_name")
  private String firstName;

  @SerializedName("last_name")
  private String lastName;

  @SerializedName("phone")
  private String phone;

  @SerializedName("postal_code")
  private String postalCode;

  @SerializedName("region")
  private String region;

  @SerializedName("street1")
  private String street1;

  @SerializedName("street2")
  private String street2;


  public String getCity() { return this.city; }
  public void setCity(final String city) { this.city = city; }

  public String getCountry() { return this.country; }
  public void setCountry(final String country) { this.country = country; }

  public String getFirstName() { return this.firstName; }
  public void setFirstName(final String firstName) { this.firstName = firstName; }

  public String getLastName() { return this.lastName; }
  public void setLastName(final String lastName) { this.lastName = lastName; }

  public String getPhone() { return this.phone; }
  public void setPhone(final String phone) { this.phone = phone; }

  public String getPostalCode() { return this.postalCode; }
  public void setPostalCode(final String postalCode) { this.postalCode = postalCode; }

  public String getRegion() { return this.region; }
  public void setRegion(final String region) { this.region = region; }

  public String getStreet1() { return this.street1; }
  public void setStreet1(final String street1) { this.street1 = street1; }

  public String getStreet2() { return this.street2; }
  public void setStreet2(final String street2) { this.street2 = street2; }

}
