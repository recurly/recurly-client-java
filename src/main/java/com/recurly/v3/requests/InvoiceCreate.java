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

public class InvoiceCreate extends Request {

  /**
   * This will default to the Customer Notes text specified on the Invoice Settings for charge
   * invoices. Specify custom notes to add or override Customer Notes on charge invoices.
   */
  @SerializedName("charge_customer_notes")
  @Expose
  private String chargeCustomerNotes;

  /**
   * An automatic invoice means a corresponding transaction is run using the account's billing
   * information at the same time the invoice is created. Manual invoices are created without a
   * corresponding transaction. The merchant must enter a manual payment transaction or have the
   * customer pay the invoice with an automatic method, like credit card, PayPal, Amazon, or ACH
   * bank payment.
   */
  @SerializedName("collection_method")
  @Expose
  private Constants.CollectionMethod collectionMethod;

  /**
   * This will default to the Customer Notes text specified on the Invoice Settings for credit
   * invoices. Specify customer notes to add or override Customer Notes on credit invoices.
   */
  @SerializedName("credit_customer_notes")
  @Expose
  private String creditCustomerNotes;

  /** 3-letter ISO 4217 currency code. */
  @SerializedName("currency")
  @Expose
  private String currency;

  /**
   * Integer paired with `Net Terms Type` and representing the number of days past the current date
   * (for `net` Net Terms Type) or days after the last day of the current month (for `eom` Net Terms
   * Type) that the invoice will become past due. For any value, an additional 24 hours is added to
   * ensure the customer has the entire last day to make payment before becoming past due. For
   * example:
   *
   * <p>If an invoice is due `net 0`, it is due 'On Receipt' and will become past due 24 hours after
   * it's created. If an invoice is due `net 30`, it will become past due at 31 days exactly. If an
   * invoice is due `eom 30`, it will become past due 31 days from the last day of the current
   * month.
   *
   * <p>When `eom` Net Terms Type is passed, the value for `Net Terms` is restricted to `0, 15, 30,
   * 45, 60, or 90`. For more information please visit our docs page
   * (https://docs.recurly.com/docs/manual-payments#section-collection-terms)
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

  /**
   * This will default to the Terms and Conditions text specified on the Invoice Settings page in
   * your Recurly admin. Specify custom notes to add or override Terms and Conditions.
   */
  @SerializedName("terms_and_conditions")
  @Expose
  private String termsAndConditions;

  /**
   * VAT Reverse Charge Notes only appear if you have EU VAT enabled or are using your own Avalara
   * AvaTax account and the customer is in the EU, has a VAT number, and is in a different country
   * than your own. This will default to the VAT Reverse Charge Notes text specified on the Tax
   * Settings page in your Recurly admin, unless custom notes were created with the original
   * subscription.
   */
  @SerializedName("vat_reverse_charge_notes")
  @Expose
  private String vatReverseChargeNotes;

  /**
   * This will default to the Customer Notes text specified on the Invoice Settings for charge
   * invoices. Specify custom notes to add or override Customer Notes on charge invoices.
   */
  public String getChargeCustomerNotes() {
    return this.chargeCustomerNotes;
  }

  /**
   * @param chargeCustomerNotes This will default to the Customer Notes text specified on the
   *     Invoice Settings for charge invoices. Specify custom notes to add or override Customer
   *     Notes on charge invoices.
   */
  public void setChargeCustomerNotes(final String chargeCustomerNotes) {
    this.chargeCustomerNotes = chargeCustomerNotes;
  }

  /**
   * An automatic invoice means a corresponding transaction is run using the account's billing
   * information at the same time the invoice is created. Manual invoices are created without a
   * corresponding transaction. The merchant must enter a manual payment transaction or have the
   * customer pay the invoice with an automatic method, like credit card, PayPal, Amazon, or ACH
   * bank payment.
   */
  public Constants.CollectionMethod getCollectionMethod() {
    return this.collectionMethod;
  }

  /**
   * @param collectionMethod An automatic invoice means a corresponding transaction is run using the
   *     account's billing information at the same time the invoice is created. Manual invoices are
   *     created without a corresponding transaction. The merchant must enter a manual payment
   *     transaction or have the customer pay the invoice with an automatic method, like credit
   *     card, PayPal, Amazon, or ACH bank payment.
   */
  public void setCollectionMethod(final Constants.CollectionMethod collectionMethod) {
    this.collectionMethod = collectionMethod;
  }

  /**
   * This will default to the Customer Notes text specified on the Invoice Settings for credit
   * invoices. Specify customer notes to add or override Customer Notes on credit invoices.
   */
  public String getCreditCustomerNotes() {
    return this.creditCustomerNotes;
  }

  /**
   * @param creditCustomerNotes This will default to the Customer Notes text specified on the
   *     Invoice Settings for credit invoices. Specify customer notes to add or override Customer
   *     Notes on credit invoices.
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

  /**
   * Integer paired with `Net Terms Type` and representing the number of days past the current date
   * (for `net` Net Terms Type) or days after the last day of the current month (for `eom` Net Terms
   * Type) that the invoice will become past due. For any value, an additional 24 hours is added to
   * ensure the customer has the entire last day to make payment before becoming past due. For
   * example:
   *
   * <p>If an invoice is due `net 0`, it is due 'On Receipt' and will become past due 24 hours after
   * it's created. If an invoice is due `net 30`, it will become past due at 31 days exactly. If an
   * invoice is due `eom 30`, it will become past due 31 days from the last day of the current
   * month.
   *
   * <p>When `eom` Net Terms Type is passed, the value for `Net Terms` is restricted to `0, 15, 30,
   * 45, 60, or 90`. For more information please visit our docs page
   * (https://docs.recurly.com/docs/manual-payments#section-collection-terms)
   */
  public Integer getNetTerms() {
    return this.netTerms;
  }

  /**
   * @param netTerms Integer paired with `Net Terms Type` and representing the number of days past
   *     the current date (for `net` Net Terms Type) or days after the last day of the current month
   *     (for `eom` Net Terms Type) that the invoice will become past due. For any value, an
   *     additional 24 hours is added to ensure the customer has the entire last day to make payment
   *     before becoming past due. For example:
   *     <p>If an invoice is due `net 0`, it is due 'On Receipt' and will become past due 24 hours
   *     after it's created. If an invoice is due `net 30`, it will become past due at 31 days
   *     exactly. If an invoice is due `eom 30`, it will become past due 31 days from the last day
   *     of the current month.
   *     <p>When `eom` Net Terms Type is passed, the value for `Net Terms` is restricted to `0, 15,
   *     30, 45, 60, or 90`. For more information please visit our docs page
   *     (https://docs.recurly.com/docs/manual-payments#section-collection-terms)
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

  /**
   * This will default to the Terms and Conditions text specified on the Invoice Settings page in
   * your Recurly admin. Specify custom notes to add or override Terms and Conditions.
   */
  public String getTermsAndConditions() {
    return this.termsAndConditions;
  }

  /**
   * @param termsAndConditions This will default to the Terms and Conditions text specified on the
   *     Invoice Settings page in your Recurly admin. Specify custom notes to add or override Terms
   *     and Conditions.
   */
  public void setTermsAndConditions(final String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  /**
   * VAT Reverse Charge Notes only appear if you have EU VAT enabled or are using your own Avalara
   * AvaTax account and the customer is in the EU, has a VAT number, and is in a different country
   * than your own. This will default to the VAT Reverse Charge Notes text specified on the Tax
   * Settings page in your Recurly admin, unless custom notes were created with the original
   * subscription.
   */
  public String getVatReverseChargeNotes() {
    return this.vatReverseChargeNotes;
  }

  /**
   * @param vatReverseChargeNotes VAT Reverse Charge Notes only appear if you have EU VAT enabled or
   *     are using your own Avalara AvaTax account and the customer is in the EU, has a VAT number,
   *     and is in a different country than your own. This will default to the VAT Reverse Charge
   *     Notes text specified on the Tax Settings page in your Recurly admin, unless custom notes
   *     were created with the original subscription.
   */
  public void setVatReverseChargeNotes(final String vatReverseChargeNotes) {
    this.vatReverseChargeNotes = vatReverseChargeNotes;
  }
}
