package com.recurly.v3;

import com.google.gson.annotations.Expose;
import com.recurly.v3.resources.ErrorMayHaveTransaction;

public class ApiException extends RecurlyException {

  @Expose public ErrorMayHaveTransaction error;
  private String message;

  public ApiException(final String message, final ErrorMayHaveTransaction e) {
    super(message);
    this.message = message;
    this.error = e;
  }

  public ErrorMayHaveTransaction getError() {
    return this.error;
  }

  public void setError(final ErrorMayHaveTransaction error) {
    this.error = error;
  }

  @Override
  public String getMessage() {
    final StringBuilder sb = new StringBuilder();
    sb.append(this.message);
    if (this.error != null && this.error.getParams() != null && this.error.getParams().size() > 0) {
      sb.append(" ");
      sb.append(this.error.getParams().toString());
    }
    return sb.toString();
  }
}
