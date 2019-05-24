package com.recurly.v3.exception;

import com.recurly.v3.resources.Error;
import com.recurly.v3.ApiException;

public class InvalidTokenException extends ApiException {

  public InvalidTokenException(String message, Error e) {
    super(message, e);
  }

}
