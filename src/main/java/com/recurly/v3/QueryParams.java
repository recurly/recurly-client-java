/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3;

import java.util.HashMap;
import java.util.List;
import org.joda.time.DateTime;

public class QueryParams {

  private HashMap<String, Object> params;

  public QueryParams() {
    this.params = new HashMap<String, Object>();
  }

  public HashMap<String, Object> getParams() {
    return this.params;
  }

  protected void add(final String key, final Object value) {
    this.params.put(key, value);
  }

  public void setIds(final List<String> ids) {
    this.add("ids", String.join(",", ids));
  }

  public void setLimit(final Integer limit) {
    this.add("limit", limit);
  }

  public void setOrder(final String order) {
    this.add("order", order);
  }

  public void setSort(final String sort) {
    this.add("sort", sort);
  }

  public void setState(final String state) {
    this.add("state", state);
  }

  public void setBeginTime(final DateTime beginTime) {
    this.add("begin_time", beginTime);
  }

  public void setEndTime(final DateTime endTime) {
    this.add("end_time", endTime);
  }

  public void setEmail(final String email) {
    this.add("email", email);
  }

  public void setSubscriber(final Boolean subscriber) {
    this.add("subscriber", subscriber);
  }

  public void setPastDue(final String pastDue) {
    this.add("past_due", pastDue);
  }

  public void setType(final String type) {
    this.add("type", type);
  }

  public void setOriginal(final String original) {
    this.add("original", original);
  }

  public void setSuccess(final String success) {
    this.add("success", success);
  }

  public void setRelatedType(final String relatedType) {
    this.add("related_type", relatedType);
  }

  public void setRefund(final String refund) {
    this.add("refund", refund);
  }

  public void setBillingStatus(final String billingStatus) {
    this.add("billing_status", billingStatus);
  }

  public void setDate(final String date) {
    this.add("date", date);
  }
}
