/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import com.recurly.v3.resources.*;

public class GeneralLedgerAccountCreate extends Request {

  @SerializedName("account_type")
  @Expose
  private String accountType;

  /**
   * Unique code to identify the ledger account. Each code must start with a letter or number. The
   * following special characters are allowed: `-_.,:`
   */
  @SerializedName("code")
  @Expose
  private String code;

  /** Optional description. */
  @SerializedName("description")
  @Expose
  private String description;

  public String getAccountType() {
    return this.accountType;
  }

  /** @param accountType */
  public void setAccountType(final String accountType) {
    this.accountType = accountType;
  }

  /**
   * Unique code to identify the ledger account. Each code must start with a letter or number. The
   * following special characters are allowed: `-_.,:`
   */
  public String getCode() {
    return this.code;
  }

  /**
   * @param code Unique code to identify the ledger account. Each code must start with a letter or
   *     number. The following special characters are allowed: `-_.,:`
   */
  public void setCode(final String code) {
    this.code = code;
  }

  /** Optional description. */
  public String getDescription() {
    return this.description;
  }

  /** @param description Optional description. */
  public void setDescription(final String description) {
    this.description = description;
  }
}
