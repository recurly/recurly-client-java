/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.queryparams;

import com.recurly.v3.AbstractQueryParams;
import com.recurly.v3.Constants;
import org.joda.time.DateTime;

public class ListCreditPaymentsParams extends AbstractQueryParams {

  public void setLimit(final Integer limit) {
    this.add("limit", limit);
  }

  public void setOrder(final Constants.AlphanumericSort order) {
    this.add("order", order);
  }

  public void setSort(final Constants.TimestampSort sort) {
    this.add("sort", sort);
  }

  public void setBeginTime(final DateTime beginTime) {
    this.add("begin_time", beginTime);
  }

  public void setEndTime(final DateTime endTime) {
    this.add("end_time", endTime);
  }
}
