package com.recurly.v3.fixtures;

import com.google.gson.annotations.SerializedName;
import org.joda.time.DateTime;

public class DateTimeTestClass {
    @SerializedName("date1")
    private DateTime date1;

    @SerializedName("date2")
    private DateTime date2;

    @SerializedName("date3")
    private DateTime date3;

    @SerializedName("date4")
    private DateTime date4;

    @SerializedName("date5")
    private DateTime date5;

    @SerializedName("date6")
    private DateTime date6;

    public DateTime getDate1() { return this.date1; }
    public void setDate1(final DateTime date1) { this.date1 = date1; }

    public DateTime getDate2() { return this.date2; }
    public void setDate2(final DateTime date) { this.date2 = date2; }

    public DateTime getDate3() { return this.date3; }
    public void setDate3(final DateTime date3) { this.date3 = date3; }

    public DateTime getDate4() { return this.date4; }
    public void setDate4(final DateTime date4) { this.date4 = date4; }

    public DateTime getDate5() { return this.date5; }
    public void setDate5(final DateTime date5) { this.date5 = date5; }

    public DateTime getDate6() { return this.date6; }
    public void setDate6(final DateTime date6) { this.date6 = date6; }

}
