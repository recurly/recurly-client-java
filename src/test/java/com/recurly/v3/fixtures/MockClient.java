package com.recurly.v3.fixtures;

import com.google.gson.reflect.TypeToken;
import com.recurly.v3.BaseClient;
import com.recurly.v3.ClientOptions;
import com.recurly.v3.Pager;
import com.recurly.v3.fixtures.MockQueryParams;

import java.lang.reflect.Type;
import java.util.HashMap;

public class MockClient extends BaseClient {
  public MockClient(final String apiKey) {
    super(apiKey);
  }

  public MockClient(final String apiKey, final ClientOptions clientOptions) {
    super(apiKey, clientOptions);
  }

  public MyResource getResource(String resourceId) {
    final String url = "/resources/{resource_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("resource_id", resourceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = MyResource.class;
    return this.makeRequest("GET", path, returnType);
  }

  public Pager<MyResource> listResources(MockQueryParams queryParams) {
    final String url = "/resources";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new MockQueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, MyResource.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  public MyResource createResource(MyRequest body) {
    final String url = "/resources";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = MyResource.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  public MyResource updateResource(String resourceId, MyRequest body) {
    final String url = "/resources/{resource_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("resource_id", resourceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = MyResource.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  public void removeResource(String resourceId) {
    final String url = "/resources/{resource_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("resource_id", resourceId);
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }

  public void badRequestMethod() {
    this.makeRequest("BOGUS", "/accounts");
  }
}
