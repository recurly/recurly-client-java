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

public class RecoveryPaymentMethodCreate extends Request {

  /**
   * The card brand (e.g. `Visa`, `MasterCard`). Present for `credit_card`, `apple_pay`, and
   * `google_pay`/`google_pay_device_pan`; omitted for `paypal_billing_agreement`.
   */
  @SerializedName("card_type")
  @Expose
  private Constants.CardType cardType;

  /** Expiration month. */
  @SerializedName("exp_month")
  @Expose
  private Integer expMonth;

  /** Expiration year. */
  @SerializedName("exp_year")
  @Expose
  private Integer expYear;

  /**
   * For a plain card, the card's own first six digits (BIN).
   *
   * <p>For a tokenized wallet payment (`apple_pay`, `google_pay`, or `google_pay_device_pan`), this
   * is the DPAN's (the wallet/device token's own number) first six digits — **not** the underlying
   * card's (FPAN). The FPAN is never accepted or represented; no separate wallet-specific field is
   * provided.
   */
  @SerializedName("first_six")
  @Expose
  private String firstSix;

  /**
   * The card's (or, for a tokenized wallet payment, the DPAN's) last four digits. See `first_six`
   * for the DPAN-vs-FPAN distinction on wallets.
   */
  @SerializedName("last_four")
  @Expose
  private String lastFour;

  /** The payment method type. */
  @SerializedName("object")
  @Expose
  private Constants.RecoveryPaymentMethod object;

  /**
   * The card brand (e.g. `Visa`, `MasterCard`). Present for `credit_card`, `apple_pay`, and
   * `google_pay`/`google_pay_device_pan`; omitted for `paypal_billing_agreement`.
   */
  public Constants.CardType getCardType() {
    return this.cardType;
  }

  /**
   * @param cardType The card brand (e.g. `Visa`, `MasterCard`). Present for `credit_card`,
   *     `apple_pay`, and `google_pay`/`google_pay_device_pan`; omitted for
   *     `paypal_billing_agreement`.
   */
  public void setCardType(final Constants.CardType cardType) {
    this.cardType = cardType;
  }

  /** Expiration month. */
  public Integer getExpMonth() {
    return this.expMonth;
  }

  /**
   * @param expMonth Expiration month.
   */
  public void setExpMonth(final Integer expMonth) {
    this.expMonth = expMonth;
  }

  /** Expiration year. */
  public Integer getExpYear() {
    return this.expYear;
  }

  /**
   * @param expYear Expiration year.
   */
  public void setExpYear(final Integer expYear) {
    this.expYear = expYear;
  }

  /**
   * For a plain card, the card's own first six digits (BIN).
   *
   * <p>For a tokenized wallet payment (`apple_pay`, `google_pay`, or `google_pay_device_pan`), this
   * is the DPAN's (the wallet/device token's own number) first six digits — **not** the underlying
   * card's (FPAN). The FPAN is never accepted or represented; no separate wallet-specific field is
   * provided.
   */
  public String getFirstSix() {
    return this.firstSix;
  }

  /**
   * @param firstSix For a plain card, the card's own first six digits (BIN).
   *     <p>For a tokenized wallet payment (`apple_pay`, `google_pay`, or `google_pay_device_pan`),
   *     this is the DPAN's (the wallet/device token's own number) first six digits — **not** the
   *     underlying card's (FPAN). The FPAN is never accepted or represented; no separate
   *     wallet-specific field is provided.
   */
  public void setFirstSix(final String firstSix) {
    this.firstSix = firstSix;
  }

  /**
   * The card's (or, for a tokenized wallet payment, the DPAN's) last four digits. See `first_six`
   * for the DPAN-vs-FPAN distinction on wallets.
   */
  public String getLastFour() {
    return this.lastFour;
  }

  /**
   * @param lastFour The card's (or, for a tokenized wallet payment, the DPAN's) last four digits.
   *     See `first_six` for the DPAN-vs-FPAN distinction on wallets.
   */
  public void setLastFour(final String lastFour) {
    this.lastFour = lastFour;
  }

  /** The payment method type. */
  public Constants.RecoveryPaymentMethod getObject() {
    return this.object;
  }

  /**
   * @param object The payment method type.
   */
  public void setObject(final Constants.RecoveryPaymentMethod object) {
    this.object = object;
  }
}
