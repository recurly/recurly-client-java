package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class AddOnMini extends Resource {

  @SerializedName("accounting_code")
  private String accountingCode;

  @SerializedName("code")
  private String code;

  @SerializedName("id")
  private String id;

  @SerializedName("name")
  private String name;

  @SerializedName("object")
  private String object;


  public String getAccountingCode() { return this.accountingCode; }
  public void setAccountingCode(final String accountingCode) { this.accountingCode = accountingCode; }

  public String getCode() { return this.code; }
  public void setCode(final String code) { this.code = code; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getName() { return this.name; }
  public void setName(final String name) { this.name = name; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

}
