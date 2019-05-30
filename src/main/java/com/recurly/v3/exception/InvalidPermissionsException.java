package com.recurly.v3.exception;

import com.recurly.v3.resources.Error;
import com.recurly.v3.ApiException;

public class InvalidPermissionsException extends ApiException {

  public InvalidPermissionsException(String message, Error e) {
    super(message, e);
  }

}
