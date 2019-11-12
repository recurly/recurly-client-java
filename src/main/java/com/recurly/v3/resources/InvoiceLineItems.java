/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.util.List;

public class InvoiceLineItems extends Resource {

  /**
   * Previous credits applied to this invoice. See their `original_line_item_id` to determine where
   * the credit first originated.
   */
  @SerializedName("applied_credits")
  @Expose
  private List<LineItem> appliedCredits;

  /**
   * These charges can be ignored. They exist to consume any remaining credit balance. A new credit
   * with the same amount will be created and placed back on the account.
   */
  @SerializedName("carryforwards")
  @Expose
  private List<LineItem> carryforwards;

  /** New charges being billed for on this invoice. */
  @SerializedName("charges")
  @Expose
  private List<LineItem> charges;

  /** Refund or proration credits. This portion of the invoice can be considered a credit memo. */
  @SerializedName("credits")
  @Expose
  private List<LineItem> credits;

  /**
   * Previous credits applied to this invoice. See their `original_line_item_id` to determine where
   * the credit first originated.
   */
  public List<LineItem> getAppliedCredits() {
    return this.appliedCredits;
  }

  /**
   * @param appliedCredits Previous credits applied to this invoice. See their
   *     `original_line_item_id` to determine where the credit first originated.
   */
  public void setAppliedCredits(final List<LineItem> appliedCredits) {
    this.appliedCredits = appliedCredits;
  }

  /**
   * These charges can be ignored. They exist to consume any remaining credit balance. A new credit
   * with the same amount will be created and placed back on the account.
   */
  public List<LineItem> getCarryforwards() {
    return this.carryforwards;
  }

  /**
   * @param carryforwards These charges can be ignored. They exist to consume any remaining credit
   *     balance. A new credit with the same amount will be created and placed back on the account.
   */
  public void setCarryforwards(final List<LineItem> carryforwards) {
    this.carryforwards = carryforwards;
  }

  /** New charges being billed for on this invoice. */
  public List<LineItem> getCharges() {
    return this.charges;
  }

  /** @param charges New charges being billed for on this invoice. */
  public void setCharges(final List<LineItem> charges) {
    this.charges = charges;
  }

  /** Refund or proration credits. This portion of the invoice can be considered a credit memo. */
  public List<LineItem> getCredits() {
    return this.credits;
  }

  /**
   * @param credits Refund or proration credits. This portion of the invoice can be considered a
   *     credit memo.
   */
  public void setCredits(final List<LineItem> credits) {
    this.credits = credits;
  }
}
