package com.recurly.v3;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;
import java.util.*;
import java.util.function.Consumer;

public class Pager<T extends Resource> implements Iterable<T> {
    Pager(String path, HashMap<String, Object> queryParams, Client client, Type parameterizedType) {
        this.next = path;
        this.queryParams = queryParams;
        this.client = client;
        this.data = new ArrayList<>();
        this.parameterizedType = parameterizedType;
        if (this.next != null) {
            this.getNextPage();
        }
    }

    @SerializedName("has_more")
    private boolean more;

    @SerializedName("next")
    private String next;

    @SerializedName("data")
    private List<T> data;

    private Client client;

    private Type parameterizedType;

    private HashMap<String, Object> queryParams;

    public Iterator<T> iterator() {
        return data.iterator();
    }

    public Spliterator<T> spliterator() {
        return data.spliterator();
    }

    public void forEach(Consumer<? super T> action) {
        do {
            for (T t : this)
                action.accept(t);
            this.getNextPage();
        }
        while (this.next != null);
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

    protected void setNext(final String next) {
        this.next = next;
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
        Pager<T> pager = this.client.makeRequest("GET", this.next, this.queryParams, this.parameterizedType);
        this.clone(pager);
        return this;
    }

    private void clone(Pager<T> pager) {
        this.next = pager.getNext();
        this.more = pager.hasMore();
        this.data = pager.getData();
    }
}
