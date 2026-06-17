/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.util.List;
import org.joda.time.DateTime;

public class Entitlement extends Resource {

  /** Time object was created. */
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  @SerializedName("customer_permission")
  @Expose
  private CustomerPermission customerPermission;

  /** Subscription or item that granted the customer permission. */
  @SerializedName("granted_by")
  @Expose
  private List<GrantedBy> grantedBy;

  /** Entitlement */
  @SerializedName("object")
  @Expose
  private String object;

  /** Time the object was last updated */
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;

  /** Time object was created. */
  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  /** @param createdAt Time object was created. */
  public void setCreatedAt(final DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public CustomerPermission getCustomerPermission() {
    return this.customerPermission;
  }

  /** @param customerPermission */
  public void setCustomerPermission(final CustomerPermission customerPermission) {
    this.customerPermission = customerPermission;
  }

  /** Subscription or item that granted the customer permission. */
  public List<GrantedBy> getGrantedBy() {
    return this.grantedBy;
  }

  /** @param grantedBy Subscription or item that granted the customer permission. */
  public void setGrantedBy(final List<GrantedBy> grantedBy) {
    this.grantedBy = grantedBy;
  }

  /** Entitlement */
  public String getObject() {
    return this.object;
  }

  /** @param object Entitlement */
  public void setObject(final String object) {
    this.object = object;
  }

  /** Time the object was last updated */
  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** @param updatedAt Time the object was last updated */
  public void setUpdatedAt(final DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
}
