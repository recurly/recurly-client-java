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

public class CustomerPermission extends Resource {

  
  /**
   * Customer permission code.
   */
  
  @SerializedName("code")
  @Expose
  private String code;

  
  /**
   * Description of customer permission.
   */
  
  @SerializedName("description")
  @Expose
  private String description;

  
  /**
   * Customer permission ID.
   */
  
  @SerializedName("id")
  @Expose
  private String id;

  
  /**
   * Customer permission name.
   */
  
  @SerializedName("name")
  @Expose
  private String name;

  
  /**
   * It will always be "customer_permission".
   */
  
  @SerializedName("object")
  @Expose
  private String object;



  
  /**
   * Customer permission code.
   */
  
  public String getCode() { return this.code; }

  
  /**
   * @param code Customer permission code.
   */
  
  public void setCode(final String code) { this.code = code; }

  
  /**
   * Description of customer permission.
   */
  
  public String getDescription() { return this.description; }

  
  /**
   * @param description Description of customer permission.
   */
  
  public void setDescription(final String description) { this.description = description; }

  
  /**
   * Customer permission ID.
   */
  
  public String getId() { return this.id; }

  
  /**
   * @param id Customer permission ID.
   */
  
  public void setId(final String id) { this.id = id; }

  
  /**
   * Customer permission name.
   */
  
  public String getName() { return this.name; }

  
  /**
   * @param name Customer permission name.
   */
  
  public void setName(final String name) { this.name = name; }

  
  /**
   * It will always be "customer_permission".
   */
  
  public String getObject() { return this.object; }

  
  /**
   * @param object It will always be "customer_permission".
   */
  
  public void setObject(final String object) { this.object = object; }

}
