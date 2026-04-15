package com.recurly.v3.http;

import java.io.IOException;

public interface HttpTransport {
  SimpleHttpResponse execute(SimpleHttpRequest request) throws IOException;
}
