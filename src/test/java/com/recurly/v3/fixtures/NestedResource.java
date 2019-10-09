package com.recurly.v3.fixtures;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class NestedResource extends Resource {
  @SerializedName("my_nested_string")
  private String myNestedString;
}
