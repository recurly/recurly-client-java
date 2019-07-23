package com.recurly.v3;

import com.google.gson.annotations.Expose;
import com.recurly.v3.resources.Error;

public class ApiException extends RecurlyException {

  @Expose public Error error;

  public ApiException(String message, Error e) {
    super(message);
    this.error = e;
  }

  public Error getError() {
    return this.error;
  }

  public void setError(Error error) {
    this.error = error;
  }
}
