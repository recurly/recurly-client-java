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

public class LineItemList extends Resource {

  @SerializedName("data")
  @Expose
  private List<LineItem> data;

  @SerializedName("has_more")
  @Expose
  private Boolean hasMore;

  @SerializedName("next")
  @Expose
  private String next;

  @SerializedName("object")
  @Expose
  private String object;

  public List<LineItem> getData() {
    return this.data;
  }

  public void setData(final List<LineItem> data) {
    this.data = data;
  }

  public Boolean getHasMore() {
    return this.hasMore;
  }

  public void setHasMore(final Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public String getNext() {
    return this.next;
  }

  public void setNext(final String next) {
    this.next = next;
  }

  public String getObject() {
    return this.object;
  }

  public void setObject(final String object) {
    this.object = object;
  }
}
