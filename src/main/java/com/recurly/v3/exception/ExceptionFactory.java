/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.exception;

import com.recurly.v3.ApiException;
import com.recurly.v3.RecurlyException;
import com.recurly.v3.resources.ErrorMayHaveTransaction;
import okhttp3.Response;

public class ExceptionFactory {

  @SuppressWarnings("unchecked")
  public static <T extends RecurlyException> T getExceptionClass(ApiException apiException) {
    ErrorMayHaveTransaction e = apiException.getError();
    switch (e.getType()) {
      case BAD_REQUEST:
        return (T) new BadRequestException(e.getMessage(), e);

      case IMMUTABLE_SUBSCRIPTION:
        return (T) new ImmutableSubscriptionException(e.getMessage(), e);

      case INTERNAL_SERVER_ERROR:
        return (T) new InternalServerException(e.getMessage(), e);

      case INVALID_API_KEY:
        return (T) new InvalidApiKeyException(e.getMessage(), e);

      case INVALID_API_VERSION:
        return (T) new InvalidApiVersionException(e.getMessage(), e);

      case INVALID_CONTENT_TYPE:
        return (T) new InvalidContentTypeException(e.getMessage(), e);

      case INVALID_PERMISSIONS:
        return (T) new InvalidPermissionsException(e.getMessage(), e);

      case INVALID_TOKEN:
        return (T) new InvalidTokenException(e.getMessage(), e);

      case MISSING_FEATURE:
        return (T) new MissingFeatureException(e.getMessage(), e);

      case NOT_FOUND:
        return (T) new NotFoundException(e.getMessage(), e);

      case RATE_LIMITED:
        return (T) new RateLimitedException(e.getMessage(), e);

      case SERVICE_NOT_AVAILABLE:
        return (T) new ServiceNotAvailableException(e.getMessage(), e);

      case SIMULTANEOUS_REQUEST:
        return (T) new SimultaneousRequestException(e.getMessage(), e);

      case TRANSACTION:
        return (T) new TransactionException(e.getMessage(), e);

      case UNAUTHORIZED:
        return (T) new UnauthorizedException(e.getMessage(), e);

      case UNAVAILABLE_IN_API_VERSION:
        return (T) new UnavailableInApiVersionException(e.getMessage(), e);

      case UNKNOWN_API_VERSION:
        return (T) new UnknownApiVersionException(e.getMessage(), e);

      case VALIDATION:
        return (T) new ValidationException(e.getMessage(), e);

      default:
        return (T) apiException;
    }
  }

  @SuppressWarnings("unchecked")
  public static <T extends RecurlyException> T getExceptionClass(Response response) {
    String requestId = response.header("X-Request-Id", "none");
    int code = response.code();
    String message = "Unexpected " + code + " Error. Recurly Request Id: " + requestId;
    switch (code) {
      case 500:
        return (T) new InternalServerException(message, null);
      case 502:
        return (T) new BadGatewayException(message, null);
      case 503:
        return (T) new ServiceUnavailableException(message, null);
      case 504:
        return (T) new TimeoutException(message, null);
      case 304:
        return (T) new NotModifiedException(message, null);
      case 400:
        return (T) new BadRequestException(message, null);
      case 401:
        return (T) new UnauthorizedException(message, null);
      case 402:
        return (T) new PaymentRequiredException(message, null);
      case 403:
        return (T) new ForbiddenException(message, null);
      case 404:
        return (T) new NotFoundException(message, null);
      case 406:
        return (T) new NotAcceptableException(message, null);
      case 412:
        return (T) new PreconditionFailedException(message, null);
      case 422:
        return (T) new UnprocessableEntityException(message, null);
      case 429:
        return (T) new TooManyRequestsException(message, null);
    }
    return (T) new ApiException(message, null);
  }
}
