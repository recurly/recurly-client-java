/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.queryparams;

import com.recurly.v3.AbstractQueryParams;

public class TerminateSubscriptionParams extends AbstractQueryParams {

  public void setRefund(final String refund) {
    this.add("refund", refund);
  }

  public void setCharge(final Boolean charge) {
    this.add("charge", charge);
  }
}
