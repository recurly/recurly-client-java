package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class BillingInfoPaymentMethod extends Resource {

  @SerializedName("card_type")
  private String cardType;

  @SerializedName("exp_month")
  private Integer expMonth;

  @SerializedName("exp_year")
  private Integer expYear;

  @SerializedName("first_six")
  private String firstSix;

  @SerializedName("last_four")
  private String lastFour;

  @SerializedName("object")
  private String object;


  public String getCardType() { return this.cardType; }
  public void setCardType(final String cardType) { this.cardType = cardType; }

  public Integer getExpMonth() { return this.expMonth; }
  public void setExpMonth(final Integer expMonth) { this.expMonth = expMonth; }

  public Integer getExpYear() { return this.expYear; }
  public void setExpYear(final Integer expYear) { this.expYear = expYear; }

  public String getFirstSix() { return this.firstSix; }
  public void setFirstSix(final String firstSix) { this.firstSix = firstSix; }

  public String getLastFour() { return this.lastFour; }
  public void setLastFour(final String lastFour) { this.lastFour = lastFour; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

}
