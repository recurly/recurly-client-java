/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Constants;
import com.recurly.v3.Request;
import com.recurly.v3.resources.*;
import java.util.List;
import org.joda.time.DateTime;

public class SubscriptionUpdate extends Request {

  /** Whether the subscription renews at the end of its term. */
  @SerializedName("auto_renew")
  @Expose
  private Boolean autoRenew;

  /**
   * The `billing_info_id` is the value that represents a specific billing info for an end customer.
   * When `billing_info_id` is used to assign billing info to the subscription, all future billing
   * events for the subscription will bill to the specified billing info.
   */
  @SerializedName("billing_info_id")
  @Expose
  private String billingInfoId;

  /** Change collection method */
  @SerializedName("collection_method")
  @Expose
  private Constants.CollectionMethod collectionMethod;

  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  @SerializedName("custom_fields")
  @Expose
  private List<CustomField> customFields;

  /**
   * Specify custom notes to add or override Customer Notes. Custom notes will stay with a
   * subscription on all renewals.
   */
  @SerializedName("customer_notes")
  @Expose
  private String customerNotes;

  /** If present, this subscription's transactions will use the payment gateway with this code. */
  @SerializedName("gateway_code")
  @Expose
  private String gatewayCode;

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
   * If present, this sets the date the subscription's next billing period will start
   * (`current_period_ends_at`). This can be used to align the subscription’s billing to a specific
   * day of the month. For a subscription in a trial period, this will change when the trial
   * expires. This parameter is useful for postponement of a subscription to change its billing date
   * without proration.
   */
  @SerializedName("next_bill_date")
  @Expose
  private DateTime nextBillDate;

  /** For manual invoicing, this identifies the PO number associated with the subscription. */
  @SerializedName("po_number")
  @Expose
  private String poNumber;

  /** The remaining billing cycles in the current term. */
  @SerializedName("remaining_billing_cycles")
  @Expose
  private Integer remainingBillingCycles;

  /**
   * If `auto_renew=true`, when a term completes, `total_billing_cycles` takes this value as the
   * length of subsequent terms. Defaults to the plan's `total_billing_cycles`.
   */
  @SerializedName("renewal_billing_cycles")
  @Expose
  private Integer renewalBillingCycles;

  /** Revenue schedule type */
  @SerializedName("revenue_schedule_type")
  @Expose
  private Constants.RevenueScheduleType revenueScheduleType;

  /** Subscription shipping details */
  @SerializedName("shipping")
  @Expose
  private SubscriptionShippingUpdate shipping;

  /**
   * Specify custom notes to add or override Terms and Conditions. Custom notes will stay with a
   * subscription on all renewals.
   */
  @SerializedName("terms_and_conditions")
  @Expose
  private String termsAndConditions;

  /** Whether the subscription renews at the end of its term. */
  public Boolean getAutoRenew() {
    return this.autoRenew;
  }

  /** @param autoRenew Whether the subscription renews at the end of its term. */
  public void setAutoRenew(final Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  /**
   * The `billing_info_id` is the value that represents a specific billing info for an end customer.
   * When `billing_info_id` is used to assign billing info to the subscription, all future billing
   * events for the subscription will bill to the specified billing info.
   */
  public String getBillingInfoId() {
    return this.billingInfoId;
  }

  /**
   * @param billingInfoId The `billing_info_id` is the value that represents a specific billing info
   *     for an end customer. When `billing_info_id` is used to assign billing info to the
   *     subscription, all future billing events for the subscription will bill to the specified
   *     billing info.
   */
  public void setBillingInfoId(final String billingInfoId) {
    this.billingInfoId = billingInfoId;
  }

  /** Change collection method */
  public Constants.CollectionMethod getCollectionMethod() {
    return this.collectionMethod;
  }

  /** @param collectionMethod Change collection method */
  public void setCollectionMethod(final Constants.CollectionMethod collectionMethod) {
    this.collectionMethod = collectionMethod;
  }

  /**
   * The custom fields will only be altered when they are included in a request. Sending an empty
   * array will not remove any existing values. To remove a field send the name with a null or empty
   * value.
   */
  public List<CustomField> getCustomFields() {
    return this.customFields;
  }

  /**
   * @param customFields The custom fields will only be altered when they are included in a request.
   *     Sending an empty array will not remove any existing values. To remove a field send the name
   *     with a null or empty value.
   */
  public void setCustomFields(final List<CustomField> customFields) {
    this.customFields = customFields;
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

  /** If present, this subscription's transactions will use the payment gateway with this code. */
  public String getGatewayCode() {
    return this.gatewayCode;
  }

  /**
   * @param gatewayCode If present, this subscription's transactions will use the payment gateway
   *     with this code.
   */
  public void setGatewayCode(final String gatewayCode) {
    this.gatewayCode = gatewayCode;
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
   * If present, this sets the date the subscription's next billing period will start
   * (`current_period_ends_at`). This can be used to align the subscription’s billing to a specific
   * day of the month. For a subscription in a trial period, this will change when the trial
   * expires. This parameter is useful for postponement of a subscription to change its billing date
   * without proration.
   */
  public DateTime getNextBillDate() {
    return this.nextBillDate;
  }

  /**
   * @param nextBillDate If present, this sets the date the subscription's next billing period will
   *     start (`current_period_ends_at`). This can be used to align the subscription’s billing to a
   *     specific day of the month. For a subscription in a trial period, this will change when the
   *     trial expires. This parameter is useful for postponement of a subscription to change its
   *     billing date without proration.
   */
  public void setNextBillDate(final DateTime nextBillDate) {
    this.nextBillDate = nextBillDate;
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

  /** The remaining billing cycles in the current term. */
  public Integer getRemainingBillingCycles() {
    return this.remainingBillingCycles;
  }

  /** @param remainingBillingCycles The remaining billing cycles in the current term. */
  public void setRemainingBillingCycles(final Integer remainingBillingCycles) {
    this.remainingBillingCycles = remainingBillingCycles;
  }

  /**
   * If `auto_renew=true`, when a term completes, `total_billing_cycles` takes this value as the
   * length of subsequent terms. Defaults to the plan's `total_billing_cycles`.
   */
  public Integer getRenewalBillingCycles() {
    return this.renewalBillingCycles;
  }

  /**
   * @param renewalBillingCycles If `auto_renew=true`, when a term completes, `total_billing_cycles`
   *     takes this value as the length of subsequent terms. Defaults to the plan's
   *     `total_billing_cycles`.
   */
  public void setRenewalBillingCycles(final Integer renewalBillingCycles) {
    this.renewalBillingCycles = renewalBillingCycles;
  }

  /** Revenue schedule type */
  public Constants.RevenueScheduleType getRevenueScheduleType() {
    return this.revenueScheduleType;
  }

  /** @param revenueScheduleType Revenue schedule type */
  public void setRevenueScheduleType(final Constants.RevenueScheduleType revenueScheduleType) {
    this.revenueScheduleType = revenueScheduleType;
  }

  /** Subscription shipping details */
  public SubscriptionShippingUpdate getShipping() {
    return this.shipping;
  }

  /** @param shipping Subscription shipping details */
  public void setShipping(final SubscriptionShippingUpdate shipping) {
    this.shipping = shipping;
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
