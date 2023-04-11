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

public class BillingInfoVerify extends Request {

  
  /**
   * An identifier for a specific payment gateway.
   */
  
  @SerializedName("gateway_code")
  @Expose
  private String gatewayCode;


  
  /**
   * An identifier for a specific payment gateway.
   */
  
  public String getGatewayCode() { return this.gatewayCode; }

  
  /**
   * @param gatewayCode An identifier for a specific payment gateway.
   */
  
  public void setGatewayCode(final String gatewayCode) { this.gatewayCode = gatewayCode; }

}
