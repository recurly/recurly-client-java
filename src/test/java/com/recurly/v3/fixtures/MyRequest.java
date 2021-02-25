package com.recurly.v3.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import java.math.BigDecimal;
import java.util.List;
import org.joda.time.DateTime;

public class MyRequest extends Request {
  @SerializedName("my_string")
  @Expose
  private String myString;

  @SerializedName("my_big_decimal")
  @Expose
  private BigDecimal myBigDecimal;

  @SerializedName("my_int")
  @Expose
  private Integer myInt;

  @SerializedName("my_boolean")
  @Expose
  private Boolean myBoolean;

  @SerializedName("my_datetime")
  @Expose
  private DateTime myDateTime;

  @SerializedName("my_nested_request")
  @Expose
  private NestedRequest myNestedRequest;

  @SerializedName("my_string_list")
  @Expose
  private List<String> myStringList;

  @SerializedName("my_nested_request_list")
  @Expose
  private List<NestedRequest> myNestedRequestList;

  @SerializedName("my_constant")
  @Expose
  private FixtureConstants.ConstantType myConstant;

  public String getMyString() {
    return this.myString;
  }

  public void setMyString(final String myString) {
    this.myString = myString;
  }

  public BigDecimal getMyBigDecimal() {
    return this.myBigDecimal;
  }

  public void setMyBigDecimal(final BigDecimal myBigDecimal) {
    this.myBigDecimal = myBigDecimal;
  }

  public Integer getMyInt() {
    return this.myInt;
  }

  public void setMyInt(final Integer myInt) {
    this.myInt = myInt;
  }

  public Boolean getMyBoolean() {
    return this.myBoolean;
  }

  public void setMyBoolean(final Boolean myBoolean) {
    this.myBoolean = myBoolean;
  }

  public DateTime getMyDateTime() {
    return this.myDateTime;
  }

  public void setMyDateTime(final DateTime myDateTime) {
    this.myDateTime = myDateTime;
  }

  public NestedRequest getMyNestedRequest() {
    return this.myNestedRequest;
  }

  public void setMyNestedResource(final NestedRequest myNestedRequest) {
    this.myNestedRequest = myNestedRequest;
  }

  public List<String> getMyStringList() {
    return this.myStringList;
  }

  public void setMyStringList(final List<String> myStringList) {
    this.myStringList = myStringList;
  }

  public List<NestedRequest> getMyNestedRequestList() {
    return this.myNestedRequestList;
  }

  public void setMyNestedRequestList(final List<NestedRequest> myNestedRequestList) {
    this.myNestedRequestList = myNestedRequestList;
  }

  public FixtureConstants.ConstantType getMyConstant() {
    return this.myConstant;
  }

  public void setMyConstant(FixtureConstants.ConstantType myConstant) {
    this.myConstant = myConstant;
  }
}
