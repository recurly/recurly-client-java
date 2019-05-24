package com.recurly.v3.exception;

import com.recurly.v3.resources.Error;
import com.recurly.v3.ApiException;

public class BadRequestException extends ApiException {

  public BadRequestException(String message, Error e) {
    super(message, e);
  }

}
