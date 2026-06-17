package com.recurly.v3.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.time.ZonedDateTime;

public class DateTimeTestClass {
  @SerializedName("date1")
  @Expose
  private ZonedDateTime date1;

  @SerializedName("date2")
  @Expose
  private ZonedDateTime date2;

  @SerializedName("date3")
  @Expose
  private ZonedDateTime date3;

  @SerializedName("date4")
  @Expose
  private ZonedDateTime date4;

  @SerializedName("date5")
  @Expose
  private ZonedDateTime date5;

  @SerializedName("date6")
  @Expose
  private ZonedDateTime date6;

  public ZonedDateTime getDate1() {
    return this.date1;
  }

  public void setDate1(final ZonedDateTime date1) {
    this.date1 = date1;
  }

  public ZonedDateTime getDate2() {
    return this.date2;
  }

  public void setDate2(final ZonedDateTime date) {
    this.date2 = date2;
  }

  public ZonedDateTime getDate3() {
    return this.date3;
  }

  public void setDate3(final ZonedDateTime date3) {
    this.date3 = date3;
  }

  public ZonedDateTime getDate4() {
    return this.date4;
  }

  public void setDate4(final ZonedDateTime date4) {
    this.date4 = date4;
  }

  public ZonedDateTime getDate5() {
    return this.date5;
  }

  public void setDate5(final ZonedDateTime date5) {
    this.date5 = date5;
  }

  public ZonedDateTime getDate6() {
    return this.date6;
  }

  public void setDate6(final ZonedDateTime date6) {
    this.date6 = date6;
  }
}
