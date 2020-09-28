/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;

public class BinaryFile extends Resource {

  @SerializedName("data")
  @Expose
  private byte[] data;

  public byte[] getData() {
    return this.data;
  }

  /** @param data */
  public void setData(final byte[] data) {
    this.data = data;
  }
}
