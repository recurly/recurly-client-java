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

  public Pager<T>.PagerIterator iterator() {
    if (data.size() == 0 && this.hasMore()) this.getNextPage();
    return new PagerIterator(data.toArray(), this);
  }

  public Spliterator<T> spliterator() {
    return data.spliterator();
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

  protected void setMore(final boolean more) {
    this.more = more;
  }

  public String getNext() {
    return next;
  }

  protected void setNext(final String something) {
    this.next = something;
  }

  public List<T> getData() {
    return data;
  }

  public void setData(final List<T> data) {
    this.data = data;
  }

  public Pager<T> getNextPage() {
    if (this.next == null) {
      throw new NoSuchElementException();
    }
    Pager<T> pager =
        this.client.makeRequest("GET", this.next, this.queryParams, this.parameterizedType);
    this.clone(pager);
    return this;
  }

  private void clone(Pager<T> pager) {
    this.next = pager.getNext();
    this.more = pager.hasMore();
    this.data = pager.getData();
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
      if (position < this.data.length) {
        return true;
      }
      else {
        if (pager.hasMore()) {
          return true;
        } else {
          return false;
        }
      }
    }

    public Object next() {
      if (this.hasNext()) {
        if (position == this.data.length && pager.hasMore()) {
          pager.getNextPage();
          this.data = pager.getData().toArray();
          position = 0;
          return this.data.length > 0 ? this.data[0] : null;
        }
        return this.data[position++];
      }
      else {
        return null;
      }
    }

    @Override
    public void remove() {

    }
  }
}
