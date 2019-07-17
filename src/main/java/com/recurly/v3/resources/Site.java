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
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class Site extends Resource {

  @SerializedName("address")
  @Expose
  private Address address;

  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  @SerializedName("deleted_at")
  @Expose
  private DateTime deletedAt;

  @SerializedName("features")
  @Expose
  private List<String> features;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("mode")
  @Expose
  private String mode;

  @SerializedName("object")
  @Expose
  private String object;

  @SerializedName("public_api_key")
  @Expose
  private String publicApiKey;

  @SerializedName("settings")
  @Expose
  private Settings settings;

  @SerializedName("subdomain")
  @Expose
  private String subdomain;

  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;


  public Address getAddress() { return this.address; }
  public void setAddress(final Address address) { this.address = address; }

  public DateTime getCreatedAt() { return this.createdAt; }
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  public DateTime getDeletedAt() { return this.deletedAt; }
  public void setDeletedAt(final DateTime deletedAt) { this.deletedAt = deletedAt; }

  public List<String> getFeatures() { return this.features; }
  public void setFeatures(final List<String> features) { this.features = features; }

  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public String getMode() { return this.mode; }
  public void setMode(final String mode) { this.mode = mode; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

  public String getPublicApiKey() { return this.publicApiKey; }
  public void setPublicApiKey(final String publicApiKey) { this.publicApiKey = publicApiKey; }

  public Settings getSettings() { return this.settings; }
  public void setSettings(final Settings settings) { this.settings = settings; }

  public String getSubdomain() { return this.subdomain; }
  public void setSubdomain(final String subdomain) { this.subdomain = subdomain; }

  public DateTime getUpdatedAt() { return this.updatedAt; }
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

}
