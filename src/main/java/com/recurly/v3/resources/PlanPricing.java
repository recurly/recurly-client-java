package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class PlanPricing extends Resource {

  @SerializedName("currency")
  private String currency;

  @SerializedName("setup_fee")
  private Float setupFee;

  @SerializedName("unit_amount")
  private Float unitAmount;


  public String getCurrency() { return this.currency; }
  public void setCurrency(final String currency) { this.currency = currency; }

  public Float getSetupFee() { return this.setupFee; }
  public void setSetupFee(final Float setupFee) { this.setupFee = setupFee; }

  public Float getUnitAmount() { return this.unitAmount; }
  public void setUnitAmount(final Float unitAmount) { this.unitAmount = unitAmount; }

}
