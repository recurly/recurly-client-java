package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class CustomField extends Resource {

  @SerializedName("name")
  private String name;

  @SerializedName("value")
  private String value;


  public String getName() { return this.name; }
  public void setName(final String name) { this.name = name; }

  public String getValue() { return this.value; }
  public void setValue(final String value) { this.value = value; }

}
