package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class AccountBalance extends Resource {

  @SerializedName("account")
  @Expose
  private AccountMini account;

  @SerializedName("balances")
  @Expose
  private List<AccountBalanceAmount> balances;

  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("past_due")
  @Expose
  private Boolean pastDue;


  public AccountMini getAccount() { return this.account; }
  public void setAccount(final AccountMini account) { this.account = account; }

  public List<AccountBalanceAmount> getBalances() { return this.balances; }
  public void setBalances(final List<AccountBalanceAmount> balances) { this.balances = balances; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public Boolean getPastDue() { return this.pastDue; }
  public void setPastDue(final Boolean pastDue) { this.pastDue = pastDue; }

}
