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

  /** Indicates there are more results on subsequent pages. */
  @SerializedName("has_more")
  @Expose
  private Boolean hasMore;

  /** Path to subsequent page of results. */
  @SerializedName("next")
  @Expose
  private String next;

  /** Will always be List. */
  @SerializedName("object")
  @Expose
  private String object;

  public List<LineItem> getData() {
    return this.data;
  }

  /** @param data */
  public void setData(final List<LineItem> data) {
    this.data = data;
  }

  /** Indicates there are more results on subsequent pages. */
  public Boolean getHasMore() {
    return this.hasMore;
  }

  /** @param hasMore Indicates there are more results on subsequent pages. */
  public void setHasMore(final Boolean hasMore) {
    this.hasMore = hasMore;
  }

  /** Path to subsequent page of results. */
  public String getNext() {
    return this.next;
  }

  /** @param next Path to subsequent page of results. */
  public void setNext(final String next) {
    this.next = next;
  }

  /** Will always be List. */
  public String getObject() {
    return this.object;
  }

  /** @param object Will always be List. */
  public void setObject(final String object) {
    this.object = object;
  }
}
