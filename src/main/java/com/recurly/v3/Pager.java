package com.recurly.v3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Type;
import java.util.*;
import java.util.function.Consumer;

public class Pager<T extends Resource> implements Iterable<T> {
  public Pager(String path, HashMap<String, Object> queryParams, BaseClient client, Type parameterizedType) {
    this.next = path;
    this.queryParams = queryParams;
    this.client = client;
    this.data = new ArrayList<>();
    this.parameterizedType = parameterizedType;
    this.more = true;
  }

  @SerializedName("has_more")
  @Expose
  private boolean more;

  @SerializedName("next")
  @Expose
  private String next;

  @Expose
  private List<T> data;

  private BaseClient client;

  private Type parameterizedType;

  private HashMap<String, Object> queryParams;

  private boolean paramsConsumed;

  public Pager<T>.PagerIterator iterator() {
    if (data.size() == 0 && this.hasMore()) this.getNextPage();
    return new PagerIterator(data.toArray(), this);
  }

  public void forEach(Consumer<? super T> action) {
    while (this.next != null) {
      this.getNextPage();
      for (T t : this) action.accept(t);
    }
  }

  public void eachItem(Consumer<? super T> action) {
    this.forEach(action);
  }

  public boolean hasMore() {
    return more;
  }

  public String getNext() {
    return next;
  }

  public List<T> getData() {
    return data;
  }

  public void getNextPage() {
    if (this.next == null) {
      throw new NoSuchElementException();
    }
    Pager<T> pager =
        this.client.makeRequest("GET", this.next, this.consumeParams(), this.parameterizedType);
    this.clone(pager);
  }

  private void clone(Pager<T> pager) {
    this.next = pager.getNext();
    this.more = pager.hasMore();
    this.data = pager.getData();
  }

  private HashMap<String, Object> consumeParams() {
    if (this.paramsConsumed) return null;
    this.paramsConsumed = true;
    return this.queryParams;
  }

  private class PagerIterator implements Iterator {
    public PagerIterator(Object[] data, Pager<T> pager) {
      this.data = data;
      this.pager = pager;
    }

    private int position = 0;
    private Object[] data;
    private Pager<T> pager;

    public boolean hasNext() {
      return position < this.data.length || pager.hasMore();
    }

    public Object next() {
      if (position == this.data.length && pager.hasMore()) {
        pager.getNextPage();
        this.data = pager.getData().toArray();
        position = 0;
      }
      return this.data[position++];
    }
  }
}
