/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.queryparams;

import com.recurly.v3.AbstractQueryParams;
import com.recurly.v3.Constants;
import java.util.List;
import org.joda.time.DateTime;

public class ListInvoiceTemplateAccountsParams extends AbstractQueryParams {

  public void setIds(final List<String> ids) {
    this.add("ids", String.join(",", ids));
  }

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

  public void setEmail(final String email) {
    this.add("email", email);
  }

  public void setSubscriber(final Boolean subscriber) {
    this.add("subscriber", subscriber);
  }

  public void setPastDue(final Constants.True pastDue) {
    this.add("past_due", pastDue);
  }
}
