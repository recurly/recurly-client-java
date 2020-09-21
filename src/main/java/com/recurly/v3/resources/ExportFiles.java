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

public class ExportFiles extends Resource {

  @SerializedName("files")
  @Expose
  private List<ExportFile> files;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  public List<ExportFile> getFiles() {
    return this.files;
  }

  /** @param files */
  public void setFiles(final List<ExportFile> files) {
    this.files = files;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }
}
