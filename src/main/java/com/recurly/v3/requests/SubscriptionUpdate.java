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
import org.joda.time.DateTime;

public class SubscriptionUpdate extends Request {

  /** Change collection method */
  @SerializedName("collection_method")
  @Expose
  private String collectionMethod;

  /**
   * Specify custom notes to add or override Customer Notes. Custom notes will stay with a
   * subscription on all renewals.
   */
  @SerializedName("customer_notes")
  @Expose
  private String customerNotes;

  /**
   * Integer representing the number of days after an invoice's creation that the invoice will
   * become past due. If an invoice's net terms are set to '0', it is due 'On Receipt' and will
   * become past due 24 hours after it’s created. If an invoice is due net 30, it will become past
   * due at 31 days exactly.
   */
  @SerializedName("net_terms")
  @Expose
  private Integer netTerms;

  /**
   * For an active subscription, this will change the next renewal date. For a subscription in a
   * trial period, modifying the renewal date will change when the trial expires.
   */
  @SerializedName("next_renewal_at")
  @Expose
  private DateTime nextRenewalAt;

  /** For manual invoicing, this identifies the PO number associated with the subscription. */
  @SerializedName("po_number")
  @Expose
  private String poNumber;

  /** Renews the subscription for a specified number of cycles, then automatically cancels. */
  @SerializedName("remaining_billing_cycles")
  @Expose
  private Integer remainingBillingCycles;

  /**
   * Create a shipping address on the account and assign it to the subscription. If this and
   * `shipping_address_id` are both present, `shipping_address_id` will take precedence.
   */
  @SerializedName("shipping_address")
  @Expose
  private ShippingAddressCreate shippingAddress;

  /** Assign a shipping address from the account's existing shipping addresses. */
  @SerializedName("shipping_address_id")
  @Expose
  private String shippingAddressId;

  /**
   * Specify custom notes to add or override Terms and Conditions. Custom notes will stay with a
   * subscription on all renewals.
   */
  @SerializedName("terms_and_conditions")
  @Expose
  private String termsAndConditions;

  /** Change collection method */
  public String getCollectionMethod() {
    return this.collectionMethod;
  }

  /** @param collectionMethod Change collection method */
  public void setCollectionMethod(final String collectionMethod) {
    this.collectionMethod = collectionMethod;
  }

  /**
   * Specify custom notes to add or override Customer Notes. Custom notes will stay with a
   * subscription on all renewals.
   */
  public String getCustomerNotes() {
    return this.customerNotes;
  }

  /**
   * @param customerNotes Specify custom notes to add or override Customer Notes. Custom notes will
   *     stay with a subscription on all renewals.
   */
  public void setCustomerNotes(final String customerNotes) {
    this.customerNotes = customerNotes;
  }

  /**
   * Integer representing the number of days after an invoice's creation that the invoice will
   * become past due. If an invoice's net terms are set to '0', it is due 'On Receipt' and will
   * become past due 24 hours after it’s created. If an invoice is due net 30, it will become past
   * due at 31 days exactly.
   */
  public Integer getNetTerms() {
    return this.netTerms;
  }

  /**
   * @param netTerms Integer representing the number of days after an invoice's creation that the
   *     invoice will become past due. If an invoice's net terms are set to '0', it is due 'On
   *     Receipt' and will become past due 24 hours after it’s created. If an invoice is due net 30,
   *     it will become past due at 31 days exactly.
   */
  public void setNetTerms(final Integer netTerms) {
    this.netTerms = netTerms;
  }

  /**
   * For an active subscription, this will change the next renewal date. For a subscription in a
   * trial period, modifying the renewal date will change when the trial expires.
   */
  public DateTime getNextRenewalAt() {
    return this.nextRenewalAt;
  }

  /**
   * @param nextRenewalAt For an active subscription, this will change the next renewal date. For a
   *     subscription in a trial period, modifying the renewal date will change when the trial
   *     expires.
   */
  public void setNextRenewalAt(final DateTime nextRenewalAt) {
    this.nextRenewalAt = nextRenewalAt;
  }

  /** For manual invoicing, this identifies the PO number associated with the subscription. */
  public String getPoNumber() {
    return this.poNumber;
  }

  /**
   * @param poNumber For manual invoicing, this identifies the PO number associated with the
   *     subscription.
   */
  public void setPoNumber(final String poNumber) {
    this.poNumber = poNumber;
  }

  /** Renews the subscription for a specified number of cycles, then automatically cancels. */
  public Integer getRemainingBillingCycles() {
    return this.remainingBillingCycles;
  }

  /**
   * @param remainingBillingCycles Renews the subscription for a specified number of cycles, then
   *     automatically cancels.
   */
  public void setRemainingBillingCycles(final Integer remainingBillingCycles) {
    this.remainingBillingCycles = remainingBillingCycles;
  }

  /**
   * Create a shipping address on the account and assign it to the subscription. If this and
   * `shipping_address_id` are both present, `shipping_address_id` will take precedence.
   */
  public ShippingAddressCreate getShippingAddress() {
    return this.shippingAddress;
  }

  /**
   * @param shippingAddress Create a shipping address on the account and assign it to the
   *     subscription. If this and `shipping_address_id` are both present, `shipping_address_id`
   *     will take precedence.
   */
  public void setShippingAddress(final ShippingAddressCreate shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /** Assign a shipping address from the account's existing shipping addresses. */
  public String getShippingAddressId() {
    return this.shippingAddressId;
  }

  /**
   * @param shippingAddressId Assign a shipping address from the account's existing shipping
   *     addresses.
   */
  public void setShippingAddressId(final String shippingAddressId) {
    this.shippingAddressId = shippingAddressId;
  }

  /**
   * Specify custom notes to add or override Terms and Conditions. Custom notes will stay with a
   * subscription on all renewals.
   */
  public String getTermsAndConditions() {
    return this.termsAndConditions;
  }

  /**
   * @param termsAndConditions Specify custom notes to add or override Terms and Conditions. Custom
   *     notes will stay with a subscription on all renewals.
   */
  public void setTermsAndConditions(final String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }
}
