package com.recurly.v3.exception;

import com.recurly.v3.resources.Error;
import com.recurly.v3.ApiException;

public class MissingFeatureException extends ApiException {

  public MissingFeatureException(String message, Error e) {
    super(message, e);
  }

}
