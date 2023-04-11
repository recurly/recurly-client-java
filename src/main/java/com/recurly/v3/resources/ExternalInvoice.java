/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import com.recurly.v3.Constants;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

public class ExternalInvoice extends Resource {

  
  /**
   * Account mini details
   */
  
  @SerializedName("account")
  @Expose
  private AccountMini account;

  
  /**
   * When the external invoice was created in Recurly.
   */
  
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  
  /**
   * 3-letter ISO 4217 currency code.
   */
  
  @SerializedName("currency")
  @Expose
  private String currency;

  
  /**
   * An identifier which associates the external invoice to a corresponding object in an external platform.
   */
  
  @SerializedName("external_id")
  @Expose
  private String externalId;

  
  /**
   * Subscription from an external resource such as Apple App Store or Google Play Store.
   */
  
  @SerializedName("external_subscription")
  @Expose
  private ExternalSubscription externalSubscription;

  
  /**
   * System-generated unique identifier for an external invoice ID, e.g. `e28zov4fw0v2`.
   */
  
  @SerializedName("id")
  @Expose
  private String id;

  
  @SerializedName("line_items")
  @Expose
  private List<ExternalCharge> lineItems;

  
  /**
   * Object type
   */
  
  @SerializedName("object")
  @Expose
  private String object;

  
  /**
   * When the invoice was created in the external platform.
   */
  
  @SerializedName("purchased_at")
  @Expose
  private DateTime purchasedAt;

  
  @SerializedName("state")
  @Expose
  private Constants.ExternalInvoiceState state;

  
  /**
   * Total
   */
  
  @SerializedName("total")
  @Expose
  private String total;

  
  /**
   * When the external invoice was updated in Recurly.
   */
  
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;



  
  /**
   * Account mini details
   */
  
  public AccountMini getAccount() { return this.account; }

  
  /**
   * @param account Account mini details
   */
  
  public void setAccount(final AccountMini account) { this.account = account; }

  
  /**
   * When the external invoice was created in Recurly.
   */
  
  public DateTime getCreatedAt() { return this.createdAt; }

  
  /**
   * @param createdAt When the external invoice was created in Recurly.
   */
  
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  
  /**
   * 3-letter ISO 4217 currency code.
   */
  
  public String getCurrency() { return this.currency; }

  
  /**
   * @param currency 3-letter ISO 4217 currency code.
   */
  
  public void setCurrency(final String currency) { this.currency = currency; }

  
  /**
   * An identifier which associates the external invoice to a corresponding object in an external platform.
   */
  
  public String getExternalId() { return this.externalId; }

  
  /**
   * @param externalId An identifier which associates the external invoice to a corresponding object in an external platform.
   */
  
  public void setExternalId(final String externalId) { this.externalId = externalId; }

  
  /**
   * Subscription from an external resource such as Apple App Store or Google Play Store.
   */
  
  public ExternalSubscription getExternalSubscription() { return this.externalSubscription; }

  
  /**
   * @param externalSubscription Subscription from an external resource such as Apple App Store or Google Play Store.
   */
  
  public void setExternalSubscription(final ExternalSubscription externalSubscription) { this.externalSubscription = externalSubscription; }

  
  /**
   * System-generated unique identifier for an external invoice ID, e.g. `e28zov4fw0v2`.
   */
  
  public String getId() { return this.id; }

  
  /**
   * @param id System-generated unique identifier for an external invoice ID, e.g. `e28zov4fw0v2`.
   */
  
  public void setId(final String id) { this.id = id; }

  
  public List<ExternalCharge> getLineItems() { return this.lineItems; }

  
  /**
   * @param lineItems 
   */
  
  public void setLineItems(final List<ExternalCharge> lineItems) { this.lineItems = lineItems; }

  
  /**
   * Object type
   */
  
  public String getObject() { return this.object; }

  
  /**
   * @param object Object type
   */
  
  public void setObject(final String object) { this.object = object; }

  
  /**
   * When the invoice was created in the external platform.
   */
  
  public DateTime getPurchasedAt() { return this.purchasedAt; }

  
  /**
   * @param purchasedAt When the invoice was created in the external platform.
   */
  
  public void setPurchasedAt(final DateTime purchasedAt) { this.purchasedAt = purchasedAt; }

  
  public Constants.ExternalInvoiceState getState() { return this.state; }

  
  /**
   * @param state 
   */
  
  public void setState(final Constants.ExternalInvoiceState state) { this.state = state; }

  
  /**
   * Total
   */
  
  public String getTotal() { return this.total; }

  
  /**
   * @param total Total
   */
  
  public void setTotal(final String total) { this.total = total; }

  
  /**
   * When the external invoice was updated in Recurly.
   */
  
  public DateTime getUpdatedAt() { return this.updatedAt; }

  
  /**
   * @param updatedAt When the external invoice was updated in Recurly.
   */
  
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

}
