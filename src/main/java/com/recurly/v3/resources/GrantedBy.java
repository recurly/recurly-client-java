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

public class GrantedBy extends Resource {

  
  /**
   * The ID of the subscription or external subscription that grants the permission to the account.
   */
  
  @SerializedName("id")
  @Expose
  private String id;

  
  /**
   * Object Type
   */
  
  @SerializedName("object")
  @Expose
  private String object;



  
  /**
   * The ID of the subscription or external subscription that grants the permission to the account.
   */
  
  public String getId() { return this.id; }

  
  /**
   * @param id The ID of the subscription or external subscription that grants the permission to the account.
   */
  
  public void setId(final String id) { this.id = id; }

  
  /**
   * Object Type
   */
  
  public String getObject() { return this.object; }

  
  /**
   * @param object Object Type
   */
  
  public void setObject(final String object) { this.object = object; }

}
