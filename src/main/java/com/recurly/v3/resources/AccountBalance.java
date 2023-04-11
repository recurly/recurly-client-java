/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import com.recurly.v3.Constants;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

public class AccountBalance extends Resource {

  
  /**
   * Account mini details
   */
  
  @SerializedName("account")
  @Expose
  private AccountMini account;

  
  @SerializedName("balances")
  @Expose
  private List<AccountBalanceAmount> balances;

  
  /**
   * Object type
   */
  
  @SerializedName("object")
  @Expose
  private String object;

  
  @SerializedName("past_due")
  @Expose
  private Boolean pastDue;



  
  /**
   * Account mini details
   */
  
  public AccountMini getAccount() { return this.account; }

  
  /**
   * @param account Account mini details
   */
  
  public void setAccount(final AccountMini account) { this.account = account; }

  
  public List<AccountBalanceAmount> getBalances() { return this.balances; }

  
  /**
   * @param balances 
   */
  
  public void setBalances(final List<AccountBalanceAmount> balances) { this.balances = balances; }

  
  /**
   * Object type
   */
  
  public String getObject() { return this.object; }

  
  /**
   * @param object Object type
   */
  
  public void setObject(final String object) { this.object = object; }

  
  public Boolean getPastDue() { return this.pastDue; }

  
  /**
   * @param pastDue 
   */
  
  public void setPastDue(final Boolean pastDue) { this.pastDue = pastDue; }

}
