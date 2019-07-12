package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class AccountMini extends Resource {

  @SerializedName("bill_to")
  @Expose
  private String billTo;

  @SerializedName("code")
  @Expose
  private String code;

  @SerializedName("company")
  @Expose
  private String company;

  @SerializedName("email")
  @Expose
  private String email;

  @SerializedName("first_name")
  @Expose
  private String firstName;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("last_name")
  @Expose
  private String lastName;

  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("parent_account_id")
  @Expose
  private String parentAccountId;


  public String getBillTo() { return this.billTo; }
  public void setBillTo(final String billTo) { this.billTo = billTo; }

  public String getCode() { return this.code; }
  public void setCode(final String code) { this.code = code; }

  public String getCompany() { return this.company; }
  public void setCompany(final String company) { this.company = company; }

  public String getEmail() { return this.email; }
  public void setEmail(final String email) { this.email = email; }

  public String getFirstName() { return this.firstName; }
  public void setFirstName(final String firstName) { this.firstName = firstName; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getLastName() { return this.lastName; }
  public void setLastName(final String lastName) { this.lastName = lastName; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public String getParentAccountId() { return this.parentAccountId; }
  public void setParentAccountId(final String parentAccountId) { this.parentAccountId = parentAccountId; }

}
