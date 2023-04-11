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

public class ShippingMethodMini extends Resource {

  
  /**
   * The internal name used identify the shipping method.
   */
  
  @SerializedName("code")
  @Expose
  private String code;

  
  /**
   * Shipping Method ID
   */
  
  @SerializedName("id")
  @Expose
  private String id;

  
  /**
   * The name of the shipping method displayed to customers.
   */
  
  @SerializedName("name")
  @Expose
  private String name;

  
  /**
   * Object type
   */
  
  @SerializedName("object")
  @Expose
  private String object;



  
  /**
   * The internal name used identify the shipping method.
   */
  
  public String getCode() { return this.code; }

  
  /**
   * @param code The internal name used identify the shipping method.
   */
  
  public void setCode(final String code) { this.code = code; }

  
  /**
   * Shipping Method ID
   */
  
  public String getId() { return this.id; }

  
  /**
   * @param id Shipping Method ID
   */
  
  public void setId(final String id) { this.id = id; }

  
  /**
   * The name of the shipping method displayed to customers.
   */
  
  public String getName() { return this.name; }

  
  /**
   * @param name The name of the shipping method displayed to customers.
   */
  
  public void setName(final String name) { this.name = name; }

  
  /**
   * Object type
   */
  
  public String getObject() { return this.object; }

  
  /**
   * @param object Object type
   */
  
  public void setObject(final String object) { this.object = object; }

}
