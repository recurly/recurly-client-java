package com.recurly.v3.exception;

import com.recurly.v3.resources.Error;
import com.recurly.v3.ApiException;

public class NotFoundException extends ApiException {

  public NotFoundException(String message, Error e) {
    super(message, e);
  }

}
