/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.exception;

import com.recurly.v3.ApiException;
import com.recurly.v3.RecurlyException;
import com.recurly.v3.resources.ErrorMayHaveTransaction;

public class ExceptionFactory {

  @SuppressWarnings("unchecked")
  public static <T extends RecurlyException> T getExceptionClass(ApiException apiException) {
    ErrorMayHaveTransaction e = apiException.getError();
    switch (e.getType()) {
      case "bad_request":
        return (T) new BadRequestException(e.getMessage(), e);

      case "internal_server_error":
        return (T) new InternalServerException(e.getMessage(), e);

      case "immutable_subscription":
        return (T) new ImmutableSubscriptionException(e.getMessage(), e);

      case "invalid_api_key":
        return (T) new InvalidApiKeyException(e.getMessage(), e);

      case "invalid_api_version":
        return (T) new InvalidApiVersionException(e.getMessage(), e);

      case "invalid_content_type":
        return (T) new InvalidContentTypeException(e.getMessage(), e);

      case "invalid_permissions":
        return (T) new InvalidPermissionsException(e.getMessage(), e);

      case "invalid_token":
        return (T) new InvalidTokenException(e.getMessage(), e);

      case "not_found":
        return (T) new NotFoundException(e.getMessage(), e);

      case "simultaneous_request":
        return (T) new SimultaneousRequestException(e.getMessage(), e);

      case "transaction":
        return (T) new TransactionException(e.getMessage(), e);

      case "unauthorized":
        return (T) new UnauthorizedException(e.getMessage(), e);

      case "unavailable_in_api_version":
        return (T) new UnavailableInApiVersionException(e.getMessage(), e);

      case "unknown_api_version":
        return (T) new UnknownApiVersionException(e.getMessage(), e);

      case "validation":
        return (T) new ValidationException(e.getMessage(), e);

      case "missing_feature":
        return (T) new MissingFeatureException(e.getMessage(), e);

      case "rate_limited":
        return (T) new RateLimitedException(e.getMessage(), e);
    }
    return (T) apiException;
  }
}
