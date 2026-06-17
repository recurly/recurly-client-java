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

public class ExternalInvoiceCreate extends Request {

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /**
   * An identifier which associates the external invoice to a corresponding object in an external
   * platform.
   */
  @SerializedName("external_id")
  @Expose
  private String externalId;

  @SerializedName("external_payment_phase")
  @Expose
  private ExternalPaymentPhaseBase externalPaymentPhase;

  /** External payment phase ID, e.g. `a34ypb2ef9w1`. */
  @SerializedName("external_payment_phase_id")
  @Expose
  private String externalPaymentPhaseId;

  @SerializedName("line_items")
  @Expose
  private List<ExternalChargeCreate> lineItems;

  /** When the invoice was created in the external platform. */
  @SerializedName("purchased_at")
  @Expose
  private DateTime purchasedAt;

  @SerializedName("state")
  @Expose
  private Constants.ExternalInvoiceState state;

  @SerializedName("total")
  @Expose
  private String total;

  /** 3-letter ISO 4217 currency code. */
  public String getCurrency() {
    return this.currency;
  }

  /** @param currency 3-letter ISO 4217 currency code. */
  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  /**
   * An identifier which associates the external invoice to a corresponding object in an external
   * platform.
   */
  public String getExternalId() {
    return this.externalId;
  }

  /**
   * @param externalId An identifier which associates the external invoice to a corresponding object
   *     in an external platform.
   */
  public void setExternalId(final String externalId) {
    this.externalId = externalId;
  }

  public ExternalPaymentPhaseBase getExternalPaymentPhase() {
    return this.externalPaymentPhase;
  }

  /** @param externalPaymentPhase */
  public void setExternalPaymentPhase(final ExternalPaymentPhaseBase externalPaymentPhase) {
    this.externalPaymentPhase = externalPaymentPhase;
  }

  /** External payment phase ID, e.g. `a34ypb2ef9w1`. */
  public String getExternalPaymentPhaseId() {
    return this.externalPaymentPhaseId;
  }

  /** @param externalPaymentPhaseId External payment phase ID, e.g. `a34ypb2ef9w1`. */
  public void setExternalPaymentPhaseId(final String externalPaymentPhaseId) {
    this.externalPaymentPhaseId = externalPaymentPhaseId;
  }

  public List<ExternalChargeCreate> getLineItems() {
    return this.lineItems;
  }

  /** @param lineItems */
  public void setLineItems(final List<ExternalChargeCreate> lineItems) {
    this.lineItems = lineItems;
  }

  /** When the invoice was created in the external platform. */
  public DateTime getPurchasedAt() {
    return this.purchasedAt;
  }

  /** @param purchasedAt When the invoice was created in the external platform. */
  public void setPurchasedAt(final DateTime purchasedAt) {
    this.purchasedAt = purchasedAt;
  }

  public Constants.ExternalInvoiceState getState() {
    return this.state;
  }

  /** @param state */
  public void setState(final Constants.ExternalInvoiceState state) {
    this.state = state;
  }

  public String getTotal() {
    return this.total;
  }

  /** @param total */
  public void setTotal(final String total) {
    this.total = total;
  }
}
