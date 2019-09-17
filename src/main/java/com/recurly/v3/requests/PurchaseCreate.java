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

public class PurchaseCreate extends Request {

  @SerializedName("account")
  @Expose
  private AccountPurchase account;

  /** Collection method */
  @SerializedName("collection_method")
  @Expose
  private String collectionMethod;

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
   * Integer representing the number of days after an invoice's creation that the invoice will
   * become past due. If an invoice's net terms are set to '0', it is due 'On Receipt' and will
   * become past due 24 hours after it’s created. If an invoice is due net 30, it will become past
   * due at 31 days exactly.
   */
  @SerializedName("net_terms")
  @Expose
  private Integer netTerms;

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
  private String transactionType;

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

  /** Collection method */
  public String getCollectionMethod() {
    return this.collectionMethod;
  }

  /** @param collectionMethod Collection method */
  public void setCollectionMethod(final String collectionMethod) {
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
  public String getTransactionType() {
    return this.transactionType;
  }

  /**
   * @param transactionType An optional type designation for the payment gateway transaction created
   *     by this request. Supports 'moto' value, which is the acronym for mail order and telephone
   *     transactions.
   */
  public void setTransactionType(final String transactionType) {
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
