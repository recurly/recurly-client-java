package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class Site extends Resource {

  @SerializedName("address")
  private Address address;

  @SerializedName("created_at")
  private DateTime createdAt;

  @SerializedName("deleted_at")
  private DateTime deletedAt;

  @SerializedName("features")
  private List<String> features;

  @SerializedName("id")
  private String id;

  @SerializedName("mode")
  private String mode;

  @SerializedName("object")
  private String object;

  @SerializedName("public_api_key")
  private String publicApiKey;

  @SerializedName("settings")
  private Settings settings;

  @SerializedName("subdomain")
  private String subdomain;

  @SerializedName("updated_at")
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
