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

public class PurchaseCreate extends Request {

  @SerializedName("account")
  @Expose
  private AccountPurchase account;

  /**
   * The `billing_info_id` is the value that represents a specific billing info for an end customer.
   * When `billing_info_id` is used to assign billing info to the subscription, all future billing
   * events for the subscription will bill to the specified billing info. `billing_info_id` can ONLY
   * be used for sites utilizing the Wallet feature.
   */
  @SerializedName("billing_info_id")
  @Expose
  private String billingInfoId;

  /**
   * Must be set to manual in order to preview a purchase for an Account that does not have payment
   * information associated with the Billing Info.
   */
  @SerializedName("collection_method")
  @Expose
  private Constants.CollectionMethod collectionMethod;

  /** A list of coupon_codes to be redeemed on the subscription or account during the purchase. */
  @SerializedName("coupon_codes")
  @Expose
  private List<String> couponCodes;

  /** Notes to be put on the credit invoice resulting from credits in the purchase, if any. */
  @SerializedName("credit_customer_notes")
  @Expose
  private String creditCustomerNotes;

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /** Customer notes */
  @SerializedName("customer_notes")
  @Expose
  private String customerNotes;

  /**
   * The default payment gateway identifier to be used for the purchase transaction. This will also
   * be applied as the default for any subscriptions included in the purchase request.
   */
  @SerializedName("gateway_code")
  @Expose
  private String gatewayCode;

  /** A gift card redemption code to be redeemed on the purchase invoice. */
  @SerializedName("gift_card_redemption_code")
  @Expose
  private String giftCardRedemptionCode;

  /** A list of one time charges or credits to be created with the purchase. */
  @SerializedName("line_items")
  @Expose
  private List<LineItemCreate> lineItems;

  /**
   * Integer paired with `Net Terms Type` and representing the number of days past the current date
   * (for `net` Net Terms Type) or days after the last day of the current month (for `eom` Net Terms
   * Type) that the invoice will become past due. For `manual` collection method, an additional 24
   * hours is added to ensure the customer has the entire last day to make payment before becoming
   * past due. For example:
   *
   * <p>If an invoice is due `net 0`, it is due 'On Receipt' and will become past due 24 hours after
   * it's created. If an invoice is due `net 30`, it will become past due at 31 days exactly. If an
   * invoice is due `eom 30`, it will become past due 31 days from the last day of the current
   * month.
   *
   * <p>For `automatic` collection method, the additional 24 hours is not added. For example,
   * On-Receipt is due immediately, and `net 30` will become due exactly 30 days from invoice
   * generation, at which point Recurly will attempt collection. When `eom` Net Terms Type is
   * passed, the value for `Net Terms` is restricted to `0, 15, 30, 45, 60, or 90`.
   *
   * <p>For more information on how net terms work with `manual` collection visit our docs page
   * (https://docs.recurly.com/docs/manual-payments#section-collection-terms) or visit
   * (https://docs.recurly.com/docs/automatic-invoicing-terms#section-collection-terms) for
   * information about net terms using `automatic` collection.
   */
  @SerializedName("net_terms")
  @Expose
  private Integer netTerms;

  /**
   * Optionally supplied string that may be either `net` or `eom` (end-of-month). When `net`, an
   * invoice becomes past due the specified number of `Net Terms` days from the current date. When
   * `eom` an invoice becomes past due the specified number of `Net Terms` days from the last day of
   * the current month.
   *
   * <p>This field is only available when the EOM Net Terms feature is enabled.
   */
  @SerializedName("net_terms_type")
  @Expose
  private Constants.NetTermsType netTermsType;

  /** For manual invoicing, this identifies the PO number associated with the subscription. */
  @SerializedName("po_number")
  @Expose
  private String poNumber;

  @SerializedName("shipping")
  @Expose
  private ShippingPurchase shipping;

  /** A list of subscriptions to be created with the purchase. */
  @SerializedName("subscriptions")
  @Expose
  private List<SubscriptionPurchase> subscriptions;

  /** Terms and conditions to be put on the purchase invoice. */
  @SerializedName("terms_and_conditions")
  @Expose
  private String termsAndConditions;

  /**
   * An optional type designation for the payment gateway transaction created by this request.
   * Supports 'moto' value, which is the acronym for mail order and telephone transactions.
   */
  @SerializedName("transaction_type")
  @Expose
  private Constants.GatewayTransactionType transactionType;

  /** VAT reverse charge notes for cross border European tax settlement. */
  @SerializedName("vat_reverse_charge_notes")
  @Expose
  private String vatReverseChargeNotes;

  public AccountPurchase getAccount() {
    return this.account;
  }

  /** @param account */
  public void setAccount(final AccountPurchase account) {
    this.account = account;
  }

  /**
   * The `billing_info_id` is the value that represents a specific billing info for an end customer.
   * When `billing_info_id` is used to assign billing info to the subscription, all future billing
   * events for the subscription will bill to the specified billing info. `billing_info_id` can ONLY
   * be used for sites utilizing the Wallet feature.
   */
  public String getBillingInfoId() {
    return this.billingInfoId;
  }

  /**
   * @param billingInfoId The `billing_info_id` is the value that represents a specific billing info
   *     for an end customer. When `billing_info_id` is used to assign billing info to the
   *     subscription, all future billing events for the subscription will bill to the specified
   *     billing info. `billing_info_id` can ONLY be used for sites utilizing the Wallet feature.
   */
  public void setBillingInfoId(final String billingInfoId) {
    this.billingInfoId = billingInfoId;
  }

  /**
   * Must be set to manual in order to preview a purchase for an Account that does not have payment
   * information associated with the Billing Info.
   */
  public Constants.CollectionMethod getCollectionMethod() {
    return this.collectionMethod;
  }

  /**
   * @param collectionMethod Must be set to manual in order to preview a purchase for an Account
   *     that does not have payment information associated with the Billing Info.
   */
  public void setCollectionMethod(final Constants.CollectionMethod collectionMethod) {
    this.collectionMethod = collectionMethod;
  }

  /** A list of coupon_codes to be redeemed on the subscription or account during the purchase. */
  public List<String> getCouponCodes() {
    return this.couponCodes;
  }

  /**
   * @param couponCodes A list of coupon_codes to be redeemed on the subscription or account during
   *     the purchase.
   */
  public void setCouponCodes(final List<String> couponCodes) {
    this.couponCodes = couponCodes;
  }

  /** Notes to be put on the credit invoice resulting from credits in the purchase, if any. */
  public String getCreditCustomerNotes() {
    return this.creditCustomerNotes;
  }

  /**
   * @param creditCustomerNotes Notes to be put on the credit invoice resulting from credits in the
   *     purchase, if any.
   */
  public void setCreditCustomerNotes(final String creditCustomerNotes) {
    this.creditCustomerNotes = creditCustomerNotes;
  }

  /** 3-letter ISO 4217 currency code. */
  public String getCurrency() {
    return this.currency;
  }

  /** @param currency 3-letter ISO 4217 currency code. */
  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  /** Customer notes */
  public String getCustomerNotes() {
    return this.customerNotes;
  }

  /** @param customerNotes Customer notes */
  public void setCustomerNotes(final String customerNotes) {
    this.customerNotes = customerNotes;
  }

  /**
   * The default payment gateway identifier to be used for the purchase transaction. This will also
   * be applied as the default for any subscriptions included in the purchase request.
   */
  public String getGatewayCode() {
    return this.gatewayCode;
  }

  /**
   * @param gatewayCode The default payment gateway identifier to be used for the purchase
   *     transaction. This will also be applied as the default for any subscriptions included in the
   *     purchase request.
   */
  public void setGatewayCode(final String gatewayCode) {
    this.gatewayCode = gatewayCode;
  }

  /** A gift card redemption code to be redeemed on the purchase invoice. */
  public String getGiftCardRedemptionCode() {
    return this.giftCardRedemptionCode;
  }

  /**
   * @param giftCardRedemptionCode A gift card redemption code to be redeemed on the purchase
   *     invoice.
   */
  public void setGiftCardRedemptionCode(final String giftCardRedemptionCode) {
    this.giftCardRedemptionCode = giftCardRedemptionCode;
  }

  /** A list of one time charges or credits to be created with the purchase. */
  public List<LineItemCreate> getLineItems() {
    return this.lineItems;
  }

  /** @param lineItems A list of one time charges or credits to be created with the purchase. */
  public void setLineItems(final List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * Integer paired with `Net Terms Type` and representing the number of days past the current date
   * (for `net` Net Terms Type) or days after the last day of the current month (for `eom` Net Terms
   * Type) that the invoice will become past due. For `manual` collection method, an additional 24
   * hours is added to ensure the customer has the entire last day to make payment before becoming
   * past due. For example:
   *
   * <p>If an invoice is due `net 0`, it is due 'On Receipt' and will become past due 24 hours after
   * it's created. If an invoice is due `net 30`, it will become past due at 31 days exactly. If an
   * invoice is due `eom 30`, it will become past due 31 days from the last day of the current
   * month.
   *
   * <p>For `automatic` collection method, the additional 24 hours is not added. For example,
   * On-Receipt is due immediately, and `net 30` will become due exactly 30 days from invoice
   * generation, at which point Recurly will attempt collection. When `eom` Net Terms Type is
   * passed, the value for `Net Terms` is restricted to `0, 15, 30, 45, 60, or 90`.
   *
   * <p>For more information on how net terms work with `manual` collection visit our docs page
   * (https://docs.recurly.com/docs/manual-payments#section-collection-terms) or visit
   * (https://docs.recurly.com/docs/automatic-invoicing-terms#section-collection-terms) for
   * information about net terms using `automatic` collection.
   */
  public Integer getNetTerms() {
    return this.netTerms;
  }

  /**
   * @param netTerms Integer paired with `Net Terms Type` and representing the number of days past
   *     the current date (for `net` Net Terms Type) or days after the last day of the current month
   *     (for `eom` Net Terms Type) that the invoice will become past due. For `manual` collection
   *     method, an additional 24 hours is added to ensure the customer has the entire last day to
   *     make payment before becoming past due. For example:
   *     <p>If an invoice is due `net 0`, it is due 'On Receipt' and will become past due 24 hours
   *     after it's created. If an invoice is due `net 30`, it will become past due at 31 days
   *     exactly. If an invoice is due `eom 30`, it will become past due 31 days from the last day
   *     of the current month.
   *     <p>For `automatic` collection method, the additional 24 hours is not added. For example,
   *     On-Receipt is due immediately, and `net 30` will become due exactly 30 days from invoice
   *     generation, at which point Recurly will attempt collection. When `eom` Net Terms Type is
   *     passed, the value for `Net Terms` is restricted to `0, 15, 30, 45, 60, or 90`.
   *     <p>For more information on how net terms work with `manual` collection visit our docs page
   *     (https://docs.recurly.com/docs/manual-payments#section-collection-terms) or visit
   *     (https://docs.recurly.com/docs/automatic-invoicing-terms#section-collection-terms) for
   *     information about net terms using `automatic` collection.
   */
  public void setNetTerms(final Integer netTerms) {
    this.netTerms = netTerms;
  }

  /**
   * Optionally supplied string that may be either `net` or `eom` (end-of-month). When `net`, an
   * invoice becomes past due the specified number of `Net Terms` days from the current date. When
   * `eom` an invoice becomes past due the specified number of `Net Terms` days from the last day of
   * the current month.
   *
   * <p>This field is only available when the EOM Net Terms feature is enabled.
   */
  public Constants.NetTermsType getNetTermsType() {
    return this.netTermsType;
  }

  /**
   * @param netTermsType Optionally supplied string that may be either `net` or `eom`
   *     (end-of-month). When `net`, an invoice becomes past due the specified number of `Net Terms`
   *     days from the current date. When `eom` an invoice becomes past due the specified number of
   *     `Net Terms` days from the last day of the current month.
   *     <p>This field is only available when the EOM Net Terms feature is enabled.
   */
  public void setNetTermsType(final Constants.NetTermsType netTermsType) {
    this.netTermsType = netTermsType;
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

  public ShippingPurchase getShipping() {
    return this.shipping;
  }

  /** @param shipping */
  public void setShipping(final ShippingPurchase shipping) {
    this.shipping = shipping;
  }

  /** A list of subscriptions to be created with the purchase. */
  public List<SubscriptionPurchase> getSubscriptions() {
    return this.subscriptions;
  }

  /** @param subscriptions A list of subscriptions to be created with the purchase. */
  public void setSubscriptions(final List<SubscriptionPurchase> subscriptions) {
    this.subscriptions = subscriptions;
  }

  /** Terms and conditions to be put on the purchase invoice. */
  public String getTermsAndConditions() {
    return this.termsAndConditions;
  }

  /** @param termsAndConditions Terms and conditions to be put on the purchase invoice. */
  public void setTermsAndConditions(final String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  /**
   * An optional type designation for the payment gateway transaction created by this request.
   * Supports 'moto' value, which is the acronym for mail order and telephone transactions.
   */
  public Constants.GatewayTransactionType getTransactionType() {
    return this.transactionType;
  }

  /**
   * @param transactionType An optional type designation for the payment gateway transaction created
   *     by this request. Supports 'moto' value, which is the acronym for mail order and telephone
   *     transactions.
   */
  public void setTransactionType(final Constants.GatewayTransactionType transactionType) {
    this.transactionType = transactionType;
  }

  /** VAT reverse charge notes for cross border European tax settlement. */
  public String getVatReverseChargeNotes() {
    return this.vatReverseChargeNotes;
  }

  /**
   * @param vatReverseChargeNotes VAT reverse charge notes for cross border European tax settlement.
   */
  public void setVatReverseChargeNotes(final String vatReverseChargeNotes) {
    this.vatReverseChargeNotes = vatReverseChargeNotes;
  }
}
