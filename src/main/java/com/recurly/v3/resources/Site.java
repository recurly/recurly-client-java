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
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

public class Site extends Resource {

  
  @SerializedName("address")
  @Expose
  private Address address;

  
  /**
   * Created at
   */
  
  @SerializedName("created_at")
  @Expose
  private DateTime createdAt;

  
  /**
   * Deleted at
   */
  
  @SerializedName("deleted_at")
  @Expose
  private DateTime deletedAt;

  
  /**
   * A list of features enabled for the site.
   */
  
  @SerializedName("features")
  @Expose
  private List<String> features;

  
  /**
   * Site ID
   */
  
  @SerializedName("id")
  @Expose
  private String id;

  
  /**
   * Mode
   */
  
  @SerializedName("mode")
  @Expose
  private String mode;

  
  /**
   * Object type
   */
  
  @SerializedName("object")
  @Expose
  private String object;

  
  /**
   * This value is used to configure RecurlyJS to submit tokenized billing information.
   */
  
  @SerializedName("public_api_key")
  @Expose
  private String publicApiKey;

  
  @SerializedName("settings")
  @Expose
  private Settings settings;

  
  @SerializedName("subdomain")
  @Expose
  private String subdomain;

  
  /**
   * Updated at
   */
  
  @SerializedName("updated_at")
  @Expose
  private DateTime updatedAt;



  
  public Address getAddress() { return this.address; }

  
  /**
   * @param address 
   */
  
  public void setAddress(final Address address) { this.address = address; }

  
  /**
   * Created at
   */
  
  public DateTime getCreatedAt() { return this.createdAt; }

  
  /**
   * @param createdAt Created at
   */
  
  public void setCreatedAt(final DateTime createdAt) { this.createdAt = createdAt; }

  
  /**
   * Deleted at
   */
  
  public DateTime getDeletedAt() { return this.deletedAt; }

  
  /**
   * @param deletedAt Deleted at
   */
  
  public void setDeletedAt(final DateTime deletedAt) { this.deletedAt = deletedAt; }

  
  /**
   * A list of features enabled for the site.
   */
  
  public List<String> getFeatures() { return this.features; }

  
  /**
   * @param features A list of features enabled for the site.
   */
  
  public void setFeatures(final List<String> features) { this.features = features; }

  
  /**
   * Site ID
   */
  
  public String getId() { return this.id; }

  
  /**
   * @param id Site ID
   */
  
  public void setId(final String id) { this.id = id; }

  
  /**
   * Mode
   */
  
  public String getMode() { return this.mode; }

  
  /**
   * @param mode Mode
   */
  
  public void setMode(final String mode) { this.mode = mode; }

  
  /**
   * Object type
   */
  
  public String getObject() { return this.object; }

  
  /**
   * @param object Object type
   */
  
  public void setObject(final String object) { this.object = object; }

  
  /**
   * This value is used to configure RecurlyJS to submit tokenized billing information.
   */
  
  public String getPublicApiKey() { return this.publicApiKey; }

  
  /**
   * @param publicApiKey This value is used to configure RecurlyJS to submit tokenized billing information.
   */
  
  public void setPublicApiKey(final String publicApiKey) { this.publicApiKey = publicApiKey; }

  
  public Settings getSettings() { return this.settings; }

  
  /**
   * @param settings 
   */
  
  public void setSettings(final Settings settings) { this.settings = settings; }

  
  public String getSubdomain() { return this.subdomain; }

  
  /**
   * @param subdomain 
   */
  
  public void setSubdomain(final String subdomain) { this.subdomain = subdomain; }

  
  /**
   * Updated at
   */
  
  public DateTime getUpdatedAt() { return this.updatedAt; }

  
  /**
   * @param updatedAt Updated at
   */
  
  public void setUpdatedAt(final DateTime updatedAt) { this.updatedAt = updatedAt; }

}
