/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class ExportFile extends Resource {

  /** A presigned link to download the export file. */
  @SerializedName("href")
  @Expose
  private String href;

  /** MD5 hash of the export file. */
  @SerializedName("md5sum")
  @Expose
  private String md5sum;

  /** Name of the export file. */
  @SerializedName("name")
  @Expose
  private String name;

  /** A presigned link to download the export file. */
  public String getHref() {
    return this.href;
  }

  /** @param href A presigned link to download the export file. */
  public void setHref(final String href) {
    this.href = href;
  }

  /** MD5 hash of the export file. */
  public String getMd5sum() {
    return this.md5sum;
  }

  /** @param md5sum MD5 hash of the export file. */
  public void setMd5sum(final String md5sum) {
    this.md5sum = md5sum;
  }

  /** Name of the export file. */
  public String getName() {
    return this.name;
  }

  /** @param name Name of the export file. */
  public void setName(final String name) {
    this.name = name;
  }
}
