package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class PurchaseCreate extends Request {

  @SerializedName("account")
  @Expose
  private AccountPurchase account;

  @SerializedName("collection_method")
  @Expose
  private String collectionMethod;

  @SerializedName("coupon_codes")
  @Expose
  private List<String> couponCodes;

  @SerializedName("credit_customer_notes")
  @Expose
  private String creditCustomerNotes;

  @SerializedName("currency")
  @Expose
  private String currency;

  @SerializedName("customer_notes")
  @Expose
  private String customerNotes;

  @SerializedName("gateway_code")
  @Expose
  private String gatewayCode;

  @SerializedName("gift_card_redemption_code")
  @Expose
  private String giftCardRedemptionCode;

  @SerializedName("line_items")
  @Expose
  private List<LineItemCreate> lineItems;

  @SerializedName("net_terms")
  @Expose
  private Integer netTerms;

  @SerializedName("po_number")
  @Expose
  private String poNumber;

  @SerializedName("shipping_address")
  @Expose
  private ShippingAddressCreate shippingAddress;

  @SerializedName("shipping_address_id")
  @Expose
  private String shippingAddressId;

  @SerializedName("subscriptions")
  @Expose
  private List<SubscriptionPurchase> subscriptions;

  @SerializedName("terms_and_conditions")
  @Expose
  private String termsAndConditions;

  @SerializedName("vat_reverse_charge_notes")
  @Expose
  private String vatReverseChargeNotes;


  public AccountPurchase getAccount() { return this.account; }
  public void setAccount(final AccountPurchase account) { this.account = account; }

  public String getCollectionMethod() { return this.collectionMethod; }
  public void setCollectionMethod(final String collectionMethod) { this.collectionMethod = collectionMethod; }

  public List<String> getCouponCodes() { return this.couponCodes; }
  public void setCouponCodes(final List<String> couponCodes) { this.couponCodes = couponCodes; }

  public String getCreditCustomerNotes() { return this.creditCustomerNotes; }
  public void setCreditCustomerNotes(final String creditCustomerNotes) { this.creditCustomerNotes = creditCustomerNotes; }

  public String getCurrency() { return this.currency; }
  public void setCurrency(final String currency) { this.currency = currency; }

  public String getCustomerNotes() { return this.customerNotes; }
  public void setCustomerNotes(final String customerNotes) { this.customerNotes = customerNotes; }

  public String getGatewayCode() { return this.gatewayCode; }
  public void setGatewayCode(final String gatewayCode) { this.gatewayCode = gatewayCode; }

  public String getGiftCardRedemptionCode() { return this.giftCardRedemptionCode; }
  public void setGiftCardRedemptionCode(final String giftCardRedemptionCode) { this.giftCardRedemptionCode = giftCardRedemptionCode; }

  public List<LineItemCreate> getLineItems() { return this.lineItems; }
  public void setLineItems(final List<LineItemCreate> lineItems) { this.lineItems = lineItems; }

  public Integer getNetTerms() { return this.netTerms; }
  public void setNetTerms(final Integer netTerms) { this.netTerms = netTerms; }

  public String getPoNumber() { return this.poNumber; }
  public void setPoNumber(final String poNumber) { this.poNumber = poNumber; }

  public ShippingAddressCreate getShippingAddress() { return this.shippingAddress; }
  public void setShippingAddress(final ShippingAddressCreate shippingAddress) { this.shippingAddress = shippingAddress; }

  public String getShippingAddressId() { return this.shippingAddressId; }
  public void setShippingAddressId(final String shippingAddressId) { this.shippingAddressId = shippingAddressId; }

  public List<SubscriptionPurchase> getSubscriptions() { return this.subscriptions; }
  public void setSubscriptions(final List<SubscriptionPurchase> subscriptions) { this.subscriptions = subscriptions; }

  public String getTermsAndConditions() { return this.termsAndConditions; }
  public void setTermsAndConditions(final String termsAndConditions) { this.termsAndConditions = termsAndConditions; }

  public String getVatReverseChargeNotes() { return this.vatReverseChargeNotes; }
  public void setVatReverseChargeNotes(final String vatReverseChargeNotes) { this.vatReverseChargeNotes = vatReverseChargeNotes; }

}
