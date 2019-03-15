package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class LineItemList extends Resource {

  @SerializedName("data")
  private List<LineItem> data;

  @SerializedName("has_more")
  private Boolean hasMore;

  @SerializedName("next")
  private String next;

  @SerializedName("object")
  private String object;


  public List<LineItem> getData() { return this.data; }
  public void setData(final List<LineItem> data) { this.data = data; }

  public Boolean getHasMore() { return this.hasMore; }
  public void setHasMore(final Boolean hasMore) { this.hasMore = hasMore; }

  public String getNext() { return this.next; }
  public void setNext(final String next) { this.next = next; }

  public String getObject() { return this.object; }
  public void setObject(final String object) { this.object = object; }

}
