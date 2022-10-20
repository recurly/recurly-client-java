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

public class SubscriptionChangeShippingCreate extends Request {

  
  @SerializedName("address")
  @Expose
  private ShippingAddressCreate address;

  
  /**
   * Assign a shipping address from the account's existing shipping addresses. If this and address are both present, address will take precedence.
   */
  
  @SerializedName("address_id")
  @Expose
  private String addressId;

  
  /**
   * Assigns the subscription's shipping cost. If this is greater than zero then a `method_id` or `method_code` is required.
   */
  
  @SerializedName("amount")
  @Expose
  private BigDecimal amount;

  
  /**
   * The code of the shipping method used to deliver the subscription. To remove shipping set this to `null` and the `amount=0`. If `method_id` and `method_code` are both present, `method_id` will be used.
   */
  
  @SerializedName("method_code")
  @Expose
  private String methodCode;

  
  /**
   * The id of the shipping method used to deliver the subscription. To remove shipping set this to `null` and the `amount=0`. If `method_id` and `method_code` are both present, `method_id` will be used.
   */
  
  @SerializedName("method_id")
  @Expose
  private String methodId;


  
  public ShippingAddressCreate getAddress() { return this.address; }

  
  /**
   * @param address 
   */
  
  public void setAddress(final ShippingAddressCreate address) { this.address = address; }

  
  /**
   * Assign a shipping address from the account's existing shipping addresses. If this and address are both present, address will take precedence.
   */
  
  public String getAddressId() { return this.addressId; }

  
  /**
   * @param addressId Assign a shipping address from the account's existing shipping addresses. If this and address are both present, address will take precedence.
   */
  
  public void setAddressId(final String addressId) { this.addressId = addressId; }

  
  /**
   * Assigns the subscription's shipping cost. If this is greater than zero then a `method_id` or `method_code` is required.
   */
  
  public BigDecimal getAmount() { return this.amount; }

  
  /**
   * @param amount Assigns the subscription's shipping cost. If this is greater than zero then a `method_id` or `method_code` is required.
   */
  
  public void setAmount(final BigDecimal amount) { this.amount = amount; }

  
  /**
   * The code of the shipping method used to deliver the subscription. To remove shipping set this to `null` and the `amount=0`. If `method_id` and `method_code` are both present, `method_id` will be used.
   */
  
  public String getMethodCode() { return this.methodCode; }

  
  /**
   * @param methodCode The code of the shipping method used to deliver the subscription. To remove shipping set this to `null` and the `amount=0`. If `method_id` and `method_code` are both present, `method_id` will be used.
   */
  
  public void setMethodCode(final String methodCode) { this.methodCode = methodCode; }

  
  /**
   * The id of the shipping method used to deliver the subscription. To remove shipping set this to `null` and the `amount=0`. If `method_id` and `method_code` are both present, `method_id` will be used.
   */
  
  public String getMethodId() { return this.methodId; }

  
  /**
   * @param methodId The id of the shipping method used to deliver the subscription. To remove shipping set this to `null` and the `amount=0`. If `method_id` and `method_code` are both present, `method_id` will be used.
   */
  
  public void setMethodId(final String methodId) { this.methodId = methodId; }

}
