package com.recurly.v3.exception;

import com.recurly.v3.resources.Error;
import com.recurly.v3.ApiException;

public class InvalidContentTypeException extends ApiException {

  public InvalidContentTypeException(String message, Error e) {
    super(message, e);
  }

}
