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

public class TransactionPaymentGateway extends Resource {

  
  @SerializedName("id")
  @Expose
  private String id;

  
  @SerializedName("name")
  @Expose
  private String name;

  
  /**
   * Object type
   */
  
  @SerializedName("object")
  @Expose
  private String object;

  
  @SerializedName("type")
  @Expose
  private String type;



  
  public String getId() { return this.id; }

  
  /**
   * @param id 
   */
  
  public void setId(final String id) { this.id = id; }

  
  public String getName() { return this.name; }

  
  /**
   * @param name 
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

  
  public String getType() { return this.type; }

  
  /**
   * @param type 
   */
  
  public void setType(final String type) { this.type = type; }

}
