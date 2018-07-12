package com.recurly.v3;

import com.google.gson.annotations.SerializedName;

import java.util.Iterator;
import java.util.List;

public class Pager<T extends Resource> implements Iterable<T> {

    @SerializedName("has_more")
    private boolean more;

    @SerializedName("next")
    private String next;

    @SerializedName("data")
    private List<T> data;

    public Iterator<T> iterator() {
        return data.iterator();
    }

    public boolean isMore() {
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
}
