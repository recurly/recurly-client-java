package com.recurly.v3.fixtures;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;

public class NestedRequest extends Request {
  @SerializedName("my_nested_string")
  private String myNestedString;
}
