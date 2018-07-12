package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class BillingInfoCreate extends Request {

  @SerializedName("address")
  private Address address;

  @SerializedName("amazon_billing_agreement_id")
  private String amazonBillingAgreementId;

  @SerializedName("company")
  private String company;

  @SerializedName("cvv")
  private String cvv;

  @SerializedName("first_name")
  private String firstName;

  @SerializedName("ip_address")
  private String ipAddress;

  @SerializedName("last_name")
  private String lastName;

  @SerializedName("month")
  private String month;

  @SerializedName("number")
  private String number;

  @SerializedName("paypal_billing_agreement_id")
  private String paypalBillingAgreementId;

  @SerializedName("token_id")
  private String tokenId;

  @SerializedName("vat_number")
  private String vatNumber;

  @SerializedName("year")
  private String year;


  public Address getAddress() { return this.address; }
  public void setAddress(final Address address) { this.address = address; }

  public String getAmazonBillingAgreementId() { return this.amazonBillingAgreementId; }
  public void setAmazonBillingAgreementId(final String amazonBillingAgreementId) { this.amazonBillingAgreementId = amazonBillingAgreementId; }

  public String getCompany() { return this.company; }
  public void setCompany(final String company) { this.company = company; }

  public String getCvv() { return this.cvv; }
  public void setCvv(final String cvv) { this.cvv = cvv; }

  public String getFirstName() { return this.firstName; }
  public void setFirstName(final String firstName) { this.firstName = firstName; }

  public String getIpAddress() { return this.ipAddress; }
  public void setIpAddress(final String ipAddress) { this.ipAddress = ipAddress; }

  public String getLastName() { return this.lastName; }
  public void setLastName(final String lastName) { this.lastName = lastName; }

  public String getMonth() { return this.month; }
  public void setMonth(final String month) { this.month = month; }

  public String getNumber() { return this.number; }
  public void setNumber(final String number) { this.number = number; }

  public String getPaypalBillingAgreementId() { return this.paypalBillingAgreementId; }
  public void setPaypalBillingAgreementId(final String paypalBillingAgreementId) { this.paypalBillingAgreementId = paypalBillingAgreementId; }

  public String getTokenId() { return this.tokenId; }
  public void setTokenId(final String tokenId) { this.tokenId = tokenId; }

  public String getVatNumber() { return this.vatNumber; }
  public void setVatNumber(final String vatNumber) { this.vatNumber = vatNumber; }

  public String getYear() { return this.year; }
  public void setYear(final String year) { this.year = year; }

}
