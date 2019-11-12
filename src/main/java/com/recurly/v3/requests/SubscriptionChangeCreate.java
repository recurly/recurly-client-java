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

public class SubscriptionChangeCreate extends Request {

  /**
   * If you set this value you include all the add-ons and their quantities and amounts. The values
   * you include will replace the previous values entirely.
   */
  @SerializedName("add_ons")
  @Expose
  private List<SubscriptionAddOnCreate> addOns;

  /** Collection method */
  @SerializedName("collection_method")
  @Expose
  private String collectionMethod;

  /**
   * A list of coupon_codes to be redeemed on the subscription during the change. Only allowed if
   * timeframe is now and you change something about the subscription that creates an invoice.
   */
  @SerializedName("coupon_codes")
  @Expose
  private List<String> couponCodes;

  /**
   * Integer representing the number of days after an invoice's creation that the invoice will
   * become past due. If an invoice's net terms are set to '0', it is due 'On Receipt' and will
   * become past due 24 hours after it’s created. If an invoice is due net 30, it will become past
   * due at 31 days exactly.
   */
  @SerializedName("net_terms")
  @Expose
  private Integer netTerms;

  /** The plan code. */
  @SerializedName("plan_code")
  @Expose
  private String planCode;

  /** For manual invoicing, this identifies the PO number associated with the subscription. */
  @SerializedName("po_number")
  @Expose
  private String poNumber;

  /** Optionally override the default quantity of 1. */
  @SerializedName("quantity")
  @Expose
  private Integer quantity;

  /**
   * The timeframe parameter controls when the upgrade or downgrade takes place. The subscription
   * change can occur now or when the subscription renews. Generally, if you're performing an
   * upgrade, you will want the change to occur immediately (now). If you're performing a downgrade,
   * you should set the timeframe to "renewal" so the change takes affect at the end of the current
   * billing cycle.
   */
  @SerializedName("timeframe")
  @Expose
  private String timeframe;

  /**
   * Optionally, sets custom pricing for the subscription, overriding the plan's default unit
   * amount. The subscription's current currency will be used.
   */
  @SerializedName("unit_amount")
  @Expose
  private Float unitAmount;

  /**
   * If you set this value you include all the add-ons and their quantities and amounts. The values
   * you include will replace the previous values entirely.
   */
  public List<SubscriptionAddOnCreate> getAddOns() {
    return this.addOns;
  }

  /**
   * @param addOns If you set this value you include all the add-ons and their quantities and
   *     amounts. The values you include will replace the previous values entirely.
   */
  public void setAddOns(final List<SubscriptionAddOnCreate> addOns) {
    this.addOns = addOns;
  }

  /** Collection method */
  public String getCollectionMethod() {
    return this.collectionMethod;
  }

  /** @param collectionMethod Collection method */
  public void setCollectionMethod(final String collectionMethod) {
    this.collectionMethod = collectionMethod;
  }

  /**
   * A list of coupon_codes to be redeemed on the subscription during the change. Only allowed if
   * timeframe is now and you change something about the subscription that creates an invoice.
   */
  public List<String> getCouponCodes() {
    return this.couponCodes;
  }

  /**
   * @param couponCodes A list of coupon_codes to be redeemed on the subscription during the change.
   *     Only allowed if timeframe is now and you change something about the subscription that
   *     creates an invoice.
   */
  public void setCouponCodes(final List<String> couponCodes) {
    this.couponCodes = couponCodes;
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

  /** The plan code. */
  public String getPlanCode() {
    return this.planCode;
  }

  /** @param planCode The plan code. */
  public void setPlanCode(final String planCode) {
    this.planCode = planCode;
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

  /** Optionally override the default quantity of 1. */
  public Integer getQuantity() {
    return this.quantity;
  }

  /** @param quantity Optionally override the default quantity of 1. */
  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * The timeframe parameter controls when the upgrade or downgrade takes place. The subscription
   * change can occur now or when the subscription renews. Generally, if you're performing an
   * upgrade, you will want the change to occur immediately (now). If you're performing a downgrade,
   * you should set the timeframe to "renewal" so the change takes affect at the end of the current
   * billing cycle.
   */
  public String getTimeframe() {
    return this.timeframe;
  }

  /**
   * @param timeframe The timeframe parameter controls when the upgrade or downgrade takes place.
   *     The subscription change can occur now or when the subscription renews. Generally, if you're
   *     performing an upgrade, you will want the change to occur immediately (now). If you're
   *     performing a downgrade, you should set the timeframe to "renewal" so the change takes
   *     affect at the end of the current billing cycle.
   */
  public void setTimeframe(final String timeframe) {
    this.timeframe = timeframe;
  }

  /**
   * Optionally, sets custom pricing for the subscription, overriding the plan's default unit
   * amount. The subscription's current currency will be used.
   */
  public Float getUnitAmount() {
    return this.unitAmount;
  }

  /**
   * @param unitAmount Optionally, sets custom pricing for the subscription, overriding the plan's
   *     default unit amount. The subscription's current currency will be used.
   */
  public void setUnitAmount(final Float unitAmount) {
    this.unitAmount = unitAmount;
  }
}
