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

public class PlanMini extends Resource {

  
  /**
   * Unique code to identify the plan. This is used in Hosted Payment Page URLs and in the invoice exports.
   */
  
  @SerializedName("code")
  @Expose
  private String code;

  
  /**
   * Plan ID
   */
  
  @SerializedName("id")
  @Expose
  private String id;

  
  /**
   * This name describes your plan and will appear on the Hosted Payment Page and the subscriber's invoice.
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
   * Unique code to identify the plan. This is used in Hosted Payment Page URLs and in the invoice exports.
   */
  
  public String getCode() { return this.code; }

  
  /**
   * @param code Unique code to identify the plan. This is used in Hosted Payment Page URLs and in the invoice exports.
   */
  
  public void setCode(final String code) { this.code = code; }

  
  /**
   * Plan ID
   */
  
  public String getId() { return this.id; }

  
  /**
   * @param id Plan ID
   */
  
  public void setId(final String id) { this.id = id; }

  
  /**
   * This name describes your plan and will appear on the Hosted Payment Page and the subscriber's invoice.
   */
  
  public String getName() { return this.name; }

  
  /**
   * @param name This name describes your plan and will appear on the Hosted Payment Page and the subscriber's invoice.
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
