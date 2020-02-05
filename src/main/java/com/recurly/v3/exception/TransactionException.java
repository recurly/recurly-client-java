/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.exception;

import com.recurly.v3.ApiException;
import com.recurly.v3.resources.ErrorMayHaveTransaction;

public class TransactionException extends ApiException {

  public TransactionException(String message, ErrorMayHaveTransaction e) {
    super(message, e);
  }
}
