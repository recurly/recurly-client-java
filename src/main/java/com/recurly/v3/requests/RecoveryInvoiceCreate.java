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
import java.util.List;
import org.joda.time.DateTime;

public class RecoveryInvoiceCreate extends Request {

  @SerializedName("account")
  @Expose
  private RecoveryAccountCreate account;

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /** Date invoice was originally due. Must be in the past. */
  @SerializedName("due_at")
  @Expose
  private DateTime dueAt;

  /**
   * Must be set to `true` to acknowledge that the invoice is eligible for external recovery.
   * Requests with `false`, omitted, or non-boolean values will be rejected.
   */
  @SerializedName("external_recovery_eligible")
  @Expose
  private Boolean externalRecoveryEligible;

  /**
   * Line items to include on the invoice. Currency is specified at the root level and must not be
   * included in individual line items.
   */
  @SerializedName("line_items")
  @Expose
  private List<RecoveryLineItemCreate> lineItems;

  /** This identifies the PO number associated with the subscription. */
  @SerializedName("po_number")
  @Expose
  private String poNumber;

  public RecoveryAccountCreate getAccount() {
    return this.account;
  }

  /** @param account */
  public void setAccount(final RecoveryAccountCreate account) {
    this.account = account;
  }

  /** 3-letter ISO 4217 currency code. */
  public String getCurrency() {
    return this.currency;
  }

  /** @param currency 3-letter ISO 4217 currency code. */
  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  /** Date invoice was originally due. Must be in the past. */
  public DateTime getDueAt() {
    return this.dueAt;
  }

  /** @param dueAt Date invoice was originally due. Must be in the past. */
  public void setDueAt(final DateTime dueAt) {
    this.dueAt = dueAt;
  }

  /**
   * Must be set to `true` to acknowledge that the invoice is eligible for external recovery.
   * Requests with `false`, omitted, or non-boolean values will be rejected.
   */
  public Boolean getExternalRecoveryEligible() {
    return this.externalRecoveryEligible;
  }

  /**
   * @param externalRecoveryEligible Must be set to `true` to acknowledge that the invoice is
   *     eligible for external recovery. Requests with `false`, omitted, or non-boolean values will
   *     be rejected.
   */
  public void setExternalRecoveryEligible(final Boolean externalRecoveryEligible) {
    this.externalRecoveryEligible = externalRecoveryEligible;
  }

  /**
   * Line items to include on the invoice. Currency is specified at the root level and must not be
   * included in individual line items.
   */
  public List<RecoveryLineItemCreate> getLineItems() {
    return this.lineItems;
  }

  /**
   * @param lineItems Line items to include on the invoice. Currency is specified at the root level
   *     and must not be included in individual line items.
   */
  public void setLineItems(final List<RecoveryLineItemCreate> lineItems) {
    this.lineItems = lineItems;
  }

  /** This identifies the PO number associated with the subscription. */
  public String getPoNumber() {
    return this.poNumber;
  }

  /** @param poNumber This identifies the PO number associated with the subscription. */
  public void setPoNumber(final String poNumber) {
    this.poNumber = poNumber;
  }
}
