package com.recurly.v3.http;

/**
 * Verifies that {@link DefaultHttpAdapter} satisfies the {@link HttpAdapterContract}.
 * Serves as a live example of how to wire up the contract test for a custom implementation.
 */
class DefaultHttpAdapterContractTest extends HttpAdapterContract {

  @Override
  protected HttpAdapter createAdapter() {
    return new DefaultHttpAdapter();
  }
}
