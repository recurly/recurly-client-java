package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class AccountBalance extends Resource {

  @SerializedName("account")
  private AccountMini account;

  @SerializedName("balances")
  private Map<String, String> balances;

  @SerializedName("object")
  private String object;

  @SerializedName("past_due")
  private Boolean pastDue;


  public AccountMini getAccount() { return this.account; }
  public void setAccount(final AccountMini account) { this.account = account; }

  public Map<String, String> getBalances() { return this.balances; }
  public void setBalances(final Map<String, String> balances) { this.balances = balances; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public Boolean getPastDue() { return this.pastDue; }
  public void setPastDue(final Boolean pastDue) { this.pastDue = pastDue; }

}
