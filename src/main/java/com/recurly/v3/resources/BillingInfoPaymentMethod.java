/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class BillingInfoPaymentMethod extends Resource {

  @SerializedName("card_type")
  @Expose
  private String cardType;

  @SerializedName("exp_month")
  @Expose
  private Integer expMonth;

  @SerializedName("exp_year")
  @Expose
  private Integer expYear;

  @SerializedName("first_six")
  @Expose
  private String firstSix;

  @SerializedName("last_four")
  @Expose
  private String lastFour;

  @SerializedName("object")
  @Expose
  private String object;

  public String getCardType() {
    return this.cardType;
  }

  public void setCardType(final String cardType) {
    this.cardType = cardType;
  }

  public Integer getExpMonth() {
    return this.expMonth;
  }

  public void setExpMonth(final Integer expMonth) {
    this.expMonth = expMonth;
  }

  public Integer getExpYear() {
    return this.expYear;
  }

  public void setExpYear(final Integer expYear) {
    this.expYear = expYear;
  }

  public String getFirstSix() {
    return this.firstSix;
  }

  public void setFirstSix(final String firstSix) {
    this.firstSix = firstSix;
  }

  public String getLastFour() {
    return this.lastFour;
  }

  public void setLastFour(final String lastFour) {
    this.lastFour = lastFour;
  }

  public String getObject() {
    return this.object;
  }

  public void setObject(final String object) {
    this.object = object;
  }
}
