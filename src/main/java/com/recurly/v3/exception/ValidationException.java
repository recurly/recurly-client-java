package com.recurly.v3.exception;

import com.recurly.v3.resources.Error;
import com.recurly.v3.ApiException;

public class ValidationException extends ApiException {

  public ValidationException(String message, Error e) {
    super(message, e);
  }

}
