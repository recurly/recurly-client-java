package com.recurly.v3.fixtures;

import com.recurly.v3.QueryParams;
import java.util.ArrayList;
import org.joda.time.DateTime;

public class MockQueryParams extends QueryParams {
  public void setMyString(String myString) {
    this.add("my_string", myString);
  }

  public void setMyDateTime(DateTime myDateTime) {
    this.add("my_date_time", myDateTime);
  }

  public void setMyInteger(Integer myInteger) {
    this.add("my_integer", myInteger);
  }

  public void setMyFloat(Float myFloat) {
    this.add("my_float", myFloat);
  }

  public void setMyDouble(Double myDouble) {
    this.add("my_double", myDouble);
  }

  public void setMyLong(Long myLong) {
    this.add("my_long", myLong);
  }

  public void setMyEnum(FixtureConstants.ConstantType myEnum) {
    this.add("my_enum", myEnum);
  }

  public void setMyRandom(String myString) {
    this.add("my_random", myString);
  }

  public void setUnsupported(ArrayList a) {
    this.add("unsupported", a);
  }
}
