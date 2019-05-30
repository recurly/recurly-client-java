package com.recurly.v3.exception;

import com.recurly.v3.resources.Error;
import com.recurly.v3.ApiException;

public class InternalServerException extends ApiException {

  public InternalServerException(String message, Error e) {
    super(message, e);
  }

}
