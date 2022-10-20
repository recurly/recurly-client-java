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

public class CustomField extends Request {

  
  /**
   * Fields must be created in the UI before values can be assigned to them.
   */
  
  @SerializedName("name")
  @Expose
  private String name;

  
  /**
   * Any values that resemble a credit card number or security code (CVV/CVC) will be rejected.
   */
  
  @SerializedName("value")
  @Expose
  private String value;


  
  /**
   * Fields must be created in the UI before values can be assigned to them.
   */
  
  public String getName() { return this.name; }

  
  /**
   * @param name Fields must be created in the UI before values can be assigned to them.
   */
  
  public void setName(final String name) { this.name = name; }

  
  /**
   * Any values that resemble a credit card number or security code (CVV/CVC) will be rejected.
   */
  
  public String getValue() { return this.value; }

  
  /**
   * @param value Any values that resemble a credit card number or security code (CVV/CVC) will be rejected.
   */
  
  public void setValue(final String value) { this.value = value; }

}
