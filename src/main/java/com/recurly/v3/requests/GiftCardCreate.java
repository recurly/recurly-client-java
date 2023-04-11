/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import com.recurly.v3.Constants;
import com.recurly.v3.resources.*;
import org.joda.time.DateTime;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class GiftCardCreate extends Request {

  
  /**
   * 3-letter ISO 4217 currency code.
   */
  
  @SerializedName("currency")
  @Expose
  private String currency;

  
  /**
   * The delivery details for the gift card.
   */
  
  @SerializedName("delivery")
  @Expose
  private GiftCardDeliveryCreate delivery;

  
  /**
   * Block of account details for the gifter. This references an existing account_code.
   */
  
  @SerializedName("gifter_account")
  @Expose
  private AccountPurchase gifterAccount;

  
  /**
   * The product code or SKU of the gift card product.
   */
  
  @SerializedName("product_code")
  @Expose
  private String productCode;

  
  /**
   * The amount of the gift card, which is the amount of the charge to the gifter account and the amount of credit that is applied to the recipient account upon successful redemption.
   */
  
  @SerializedName("unit_amount")
  @Expose
  private BigDecimal unitAmount;


  
  /**
   * 3-letter ISO 4217 currency code.
   */
  
  public String getCurrency() { return this.currency; }

  
  /**
   * @param currency 3-letter ISO 4217 currency code.
   */
  
  public void setCurrency(final String currency) { this.currency = currency; }

  
  /**
   * The delivery details for the gift card.
   */
  
  public GiftCardDeliveryCreate getDelivery() { return this.delivery; }

  
  /**
   * @param delivery The delivery details for the gift card.
   */
  
  public void setDelivery(final GiftCardDeliveryCreate delivery) { this.delivery = delivery; }

  
  /**
   * Block of account details for the gifter. This references an existing account_code.
   */
  
  public AccountPurchase getGifterAccount() { return this.gifterAccount; }

  
  /**
   * @param gifterAccount Block of account details for the gifter. This references an existing account_code.
   */
  
  public void setGifterAccount(final AccountPurchase gifterAccount) { this.gifterAccount = gifterAccount; }

  
  /**
   * The product code or SKU of the gift card product.
   */
  
  public String getProductCode() { return this.productCode; }

  
  /**
   * @param productCode The product code or SKU of the gift card product.
   */
  
  public void setProductCode(final String productCode) { this.productCode = productCode; }

  
  /**
   * The amount of the gift card, which is the amount of the charge to the gifter account and the amount of credit that is applied to the recipient account upon successful redemption.
   */
  
  public BigDecimal getUnitAmount() { return this.unitAmount; }

  
  /**
   * @param unitAmount The amount of the gift card, which is the amount of the charge to the gifter account and the amount of credit that is applied to the recipient account upon successful redemption.
   */
  
  public void setUnitAmount(final BigDecimal unitAmount) { this.unitAmount = unitAmount; }

}
