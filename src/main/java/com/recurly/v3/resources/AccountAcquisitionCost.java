package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class AccountAcquisitionCost extends Resource {

  @SerializedName("amount")
  private Float amount;

  @SerializedName("currency")
  private String currency;


  public Float getAmount() { return this.amount; }
  public void setAmount(final Float amount) { this.amount = amount; }

  public String getCurrency() { return this.currency; }
  public void setCurrency(final String currency) { this.currency = currency; }

}
