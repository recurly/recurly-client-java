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

  /** Visa, MasterCard, American Express, Discover, JCB, etc. */
  @SerializedName("card_type")
  @Expose
  private String cardType;

  /** Expiration month. */
  @SerializedName("exp_month")
  @Expose
  private Integer expMonth;

  /** Expiration year. */
  @SerializedName("exp_year")
  @Expose
  private Integer expYear;

  /** Credit card number's first six digits. */
  @SerializedName("first_six")
  @Expose
  private String firstSix;

  /** Credit card number's last four digits. */
  @SerializedName("last_four")
  @Expose
  private String lastFour;

  @SerializedName("object")
  @Expose
  private String object;

  /** Visa, MasterCard, American Express, Discover, JCB, etc. */
  public String getCardType() {
    return this.cardType;
  }

  /** @param cardType Visa, MasterCard, American Express, Discover, JCB, etc. */
  public void setCardType(final String cardType) {
    this.cardType = cardType;
  }

  /** Expiration month. */
  public Integer getExpMonth() {
    return this.expMonth;
  }

  /** @param expMonth Expiration month. */
  public void setExpMonth(final Integer expMonth) {
    this.expMonth = expMonth;
  }

  /** Expiration year. */
  public Integer getExpYear() {
    return this.expYear;
  }

  /** @param expYear Expiration year. */
  public void setExpYear(final Integer expYear) {
    this.expYear = expYear;
  }

  /** Credit card number's first six digits. */
  public String getFirstSix() {
    return this.firstSix;
  }

  /** @param firstSix Credit card number's first six digits. */
  public void setFirstSix(final String firstSix) {
    this.firstSix = firstSix;
  }

  /** Credit card number's last four digits. */
  public String getLastFour() {
    return this.lastFour;
  }

  /** @param lastFour Credit card number's last four digits. */
  public void setLastFour(final String lastFour) {
    this.lastFour = lastFour;
  }

  public String getObject() {
    return this.object;
  }

  /** @param object */
  public void setObject(final String object) {
    this.object = object;
  }
}
