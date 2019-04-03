package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class TransactionPaymentGateway extends Resource {

  @SerializedName("id")
  private String id;

  @SerializedName("name")
  private String name;

  @SerializedName("object")
  private String object;

  @SerializedName("type")
  private String type;


  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getName() { return this.name; }
  public void setName(final String name) { this.name = name; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public String getType() { return this.type; }
  public void setType(final String type) { this.type = type; }

}
