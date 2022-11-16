/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class AccountBalanceAmount extends Resource {

  /** Total amount the account is past due. */
  @SerializedName("amount")
  @Expose
  private Float amount;

  /** Total amount of the open balances on credit invoices for the account. */
  @SerializedName("available_credit_amount")
  @Expose
  private Float availableCreditAmount;

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /** Total amount for the prepayment credit invoices in a `processing` state on the account. */
  @SerializedName("processing_prepayment_amount")
  @Expose
  private Float processingPrepaymentAmount;

  /** Total amount the account is past due. */
  public Float getAmount() {
    return this.amount;
  }

  /** @param amount Total amount the account is past due. */
  public void setAmount(final Float amount) {
    this.amount = amount;
  }

  /** Total amount of the open balances on credit invoices for the account. */
  public Float getAvailableCreditAmount() {
    return this.availableCreditAmount;
  }

  /**
   * @param availableCreditAmount Total amount of the open balances on credit invoices for the
   *     account.
   */
  public void setAvailableCreditAmount(final Float availableCreditAmount) {
    this.availableCreditAmount = availableCreditAmount;
  }

  /** 3-letter ISO 4217 currency code. */
  public String getCurrency() {
    return this.currency;
  }

  /** @param currency 3-letter ISO 4217 currency code. */
  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  /** Total amount for the prepayment credit invoices in a `processing` state on the account. */
  public Float getProcessingPrepaymentAmount() {
    return this.processingPrepaymentAmount;
  }

  /**
   * @param processingPrepaymentAmount Total amount for the prepayment credit invoices in a
   *     `processing` state on the account.
   */
  public void setProcessingPrepaymentAmount(final Float processingPrepaymentAmount) {
    this.processingPrepaymentAmount = processingPrepaymentAmount;
  }
}
