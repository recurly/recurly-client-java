package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class CustomFieldDefinition extends Resource {

  @SerializedName("created_at")
  private DateTime createdAt;

  @SerializedName("deleted_at")
  private DateTime deletedAt;

  @SerializedName("display_name")
  private String displayName;

  @SerializedName("id")
  private String id;

  @SerializedName("name")
  private String name;

  @SerializedName("object")
  private String object;

  @SerializedName("related_type")
  private String relatedType;

  @SerializedName("tooltip")
  private String tooltip;

  @SerializedName("updated_at")
  private DateTime updatedAt;

  @SerializedName("user_access")
  private String userAccess;


  public DateTime getCreatedAt() { return this.createdAt; }
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  public DateTime getDeletedAt() { return this.deletedAt; }
  public void setDeletedAt(final DateTime deletedAt) { this.deletedAt = deletedAt; }

  public String getDisplayName() { return this.displayName; }
  public void setDisplayName(final String displayName) { this.displayName = displayName; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getName() { return this.name; }
  public void setName(final String name) { this.name = name; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public String getRelatedType() { return this.relatedType; }
  public void setRelatedType(final String relatedType) { this.relatedType = relatedType; }

  public String getTooltip() { return this.tooltip; }
  public void setTooltip(final String tooltip) { this.tooltip = tooltip; }

  public DateTime getUpdatedAt() { return this.updatedAt; }
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

  public String getUserAccess() { return this.userAccess; }
  public void setUserAccess(final String userAccess) { this.userAccess = userAccess; }

}
