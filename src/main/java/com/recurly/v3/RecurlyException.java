package com.recurly.v3;

public class RecurlyException extends RuntimeException {

  public RecurlyException(String message) {
    super(message);
  }

  public RecurlyException(Throwable cause) {
    super(cause);
  }
}
