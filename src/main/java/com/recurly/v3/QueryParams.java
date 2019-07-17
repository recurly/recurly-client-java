package com.recurly.v3;

import org.joda.time.DateTime;

import java.util.HashMap;

public class QueryParams {

  private HashMap<String, Object> params;

  public QueryParams() {
    this.params = new HashMap<String, Object>();
  }

  public HashMap<String, Object> getParams() {
    return this.params;
  }

  public void setParams(HashMap<String, Object> params) {
    this.params = params;
  }

  public void add(String key, Object value) {
    this.params.put(key, value);
  }

  public void setIds(String ids) {
    this.add("ids", ids);
  }

  public void setLimit(Integer limit) {
    this.add("limit", limit);
  }

  public void setOrder(String order) {
    this.add("order", order);
  }

  public void setSort(String sort) {
    this.add("sort", sort);
  }

  public void setBeginTime(DateTime begin_time) {
    this.add("begin_time", begin_time);
  }

  public void setEndTime(DateTime end_time) {
    this.add("end_time", end_time);
  }

  public void setSubscriber(String subscriber) {
    this.add("subscriber", subscriber);
  }

  public void setPastDue(String past_due) {
    this.add("past_due", past_due);
  }

  public void setType(String type) {
    this.add("type", type);
  }

  public void setOriginal(String original) {
    this.add("original", original);
  }

  public void setState(String state) {
    this.add("state", state);
  }

  public void setSuccess(String success) {
    this.add("success", success);
  }

  public void setRefund(String refund) {
    this.add("refund", refund);
  }
}
