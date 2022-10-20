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

public class CustomFieldDefinition extends Resource {

  
  /**
   * Created at
   */
  
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  
  /**
   * Definitions are initially soft deleted, and once all the values are removed from the accouts or subscriptions, will be hard deleted an no longer visible.
   */
  
  @SerializedName("deleted_at")
  @Expose
  private DateTime deletedAt;

  
  /**
   * Used to label the field when viewing and editing the field in Recurly's admin UI.
   */
  
  @SerializedName("display_name")
  @Expose
  private String displayName;

  
  /**
   * Custom field definition ID
   */
  
  @SerializedName("id")
  @Expose
  private String id;

  
  /**
   * Used by the API to identify the field or reading and writing. The name can only be used once per Recurly object type.
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
   * Related Recurly object type
   */
  
  @SerializedName("related_type")
  @Expose
  private Constants.RelatedType relatedType;

  
  /**
   * Displayed as a tooltip when editing the field in the Recurly admin UI.
   */
  
  @SerializedName("tooltip")
  @Expose
  private String tooltip;

  
  /**
   * Last updated at
   */
  
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  
  /**
   * The access control applied inside Recurly's admin UI:
- `api_only` - No one will be able to view or edit this field's data via the admin UI.
- `read_only` - Users with the Customers role will be able to view this field's data via the admin UI, but
  editing will only be available via the API.
- `write` - Users with the Customers role will be able to view and edit this field's data via the admin UI.

   */
  
  @SerializedName("user_access")
  @Expose
  private Constants.UserAccess userAccess;



  
  /**
   * Created at
   */
  
  public DateTime getCreatedAt() { return this.createdAt; }

  
  /**
   * @param createdAt Created at
   */
  
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  
  /**
   * Definitions are initially soft deleted, and once all the values are removed from the accouts or subscriptions, will be hard deleted an no longer visible.
   */
  
  public DateTime getDeletedAt() { return this.deletedAt; }

  
  /**
   * @param deletedAt Definitions are initially soft deleted, and once all the values are removed from the accouts or subscriptions, will be hard deleted an no longer visible.
   */
  
  public void setDeletedAt(final DateTime deletedAt) { this.deletedAt = deletedAt; }

  
  /**
   * Used to label the field when viewing and editing the field in Recurly's admin UI.
   */
  
  public String getDisplayName() { return this.displayName; }

  
  /**
   * @param displayName Used to label the field when viewing and editing the field in Recurly's admin UI.
   */
  
  public void setDisplayName(final String displayName) { this.displayName = displayName; }

  
  /**
   * Custom field definition ID
   */
  
  public String getId() { return this.id; }

  
  /**
   * @param id Custom field definition ID
   */
  
  public void setId(final String id) { this.id = id; }

  
  /**
   * Used by the API to identify the field or reading and writing. The name can only be used once per Recurly object type.
   */
  
  public String getName() { return this.name; }

  
  /**
   * @param name Used by the API to identify the field or reading and writing. The name can only be used once per Recurly object type.
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

  
  /**
   * Related Recurly object type
   */
  
  public Constants.RelatedType getRelatedType() { return this.relatedType; }

  
  /**
   * @param relatedType Related Recurly object type
   */
  
  public void setRelatedType(final Constants.RelatedType relatedType) { this.relatedType = relatedType; }

  
  /**
   * Displayed as a tooltip when editing the field in the Recurly admin UI.
   */
  
  public String getTooltip() { return this.tooltip; }

  
  /**
   * @param tooltip Displayed as a tooltip when editing the field in the Recurly admin UI.
   */
  
  public void setTooltip(final String tooltip) { this.tooltip = tooltip; }

  
  /**
   * Last updated at
   */
  
  public DateTime getUpdatedAt() { return this.updatedAt; }

  
  /**
   * @param updatedAt Last updated at
   */
  
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

  
  /**
   * The access control applied inside Recurly's admin UI:
- `api_only` - No one will be able to view or edit this field's data via the admin UI.
- `read_only` - Users with the Customers role will be able to view this field's data via the admin UI, but
  editing will only be available via the API.
- `write` - Users with the Customers role will be able to view and edit this field's data via the admin UI.

   */
  
  public Constants.UserAccess getUserAccess() { return this.userAccess; }

  
  /**
   * @param userAccess The access control applied inside Recurly's admin UI:
- `api_only` - No one will be able to view or edit this field's data via the admin UI.
- `read_only` - Users with the Customers role will be able to view this field's data via the admin UI, but
  editing will only be available via the API.
- `write` - Users with the Customers role will be able to view and edit this field's data via the admin UI.

   */
  
  public void setUserAccess(final Constants.UserAccess userAccess) { this.userAccess = userAccess; }

}
