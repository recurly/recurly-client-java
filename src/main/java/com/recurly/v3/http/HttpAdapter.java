package com.recurly.v3.http;

import java.io.IOException;
import java.util.Map;

public interface HttpAdapter {
  HttpResponse execute(String method, String url, Map<String, String> headers, String body)
      throws IOException;
}
