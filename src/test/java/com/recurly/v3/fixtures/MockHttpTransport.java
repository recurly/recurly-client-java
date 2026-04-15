package com.recurly.v3.fixtures;

import com.recurly.v3.http.HttpTransport;
import com.recurly.v3.http.SimpleHttpRequest;
import com.recurly.v3.http.SimpleHttpResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MockHttpTransport implements HttpTransport {
  private final List<SimpleHttpResponse> responses = new ArrayList<>();
  private final List<SimpleHttpRequest> capturedRequests = new ArrayList<>();
  private IOException errorToThrow;
  private int index = 0;

  public void enqueue(SimpleHttpResponse response) {
    responses.add(response);
  }

  public void willThrow(IOException error) {
    this.errorToThrow = error;
  }

  @Override
  public SimpleHttpResponse execute(SimpleHttpRequest request) throws IOException {
    capturedRequests.add(request);
    if (errorToThrow != null) {
      throw errorToThrow;
    }
    return responses.get(index++);
  }

  public SimpleHttpRequest getLastRequest() {
    return capturedRequests.get(capturedRequests.size() - 1);
  }

  public List<SimpleHttpRequest> getRequests() {
    return capturedRequests;
  }
}
