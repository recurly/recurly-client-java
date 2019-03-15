package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class InvoiceMini extends Resource {

  @SerializedName("id")
  private String id;

  @SerializedName("number")
  private String number;

  @SerializedName("object")
  private String object;

  @SerializedName("state")
  private String state;

  @SerializedName("type")
  private String type;


  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getNumber() { return this.number; }
  public void setNumber(final String number) { this.number = number; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public String getState() { return this.state; }
  public void setState(final String state) { this.state = state; }

  public String getType() { return this.type; }
  public void setType(final String type) { this.type = type; }

}
