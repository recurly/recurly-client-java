package com.recurly.v3.fixtures;

import com.google.gson.reflect.TypeToken;
import com.recurly.v3.BaseClient;
import com.recurly.v3.Pager;
import com.recurly.v3.QueryParams;
import java.lang.reflect.Type;
import java.util.HashMap;
import okhttp3.OkHttpClient;

public class MockClient extends BaseClient {
  public MockClient(final String apiKey) {
    super(apiKey);
  }

  public MockClient(final String apiKey, final OkHttpClient client) {
    super(apiKey, client);
  }

  public String apiUrl;

  public MyResource getResource(String resourceId) {
    final String url = "/resources/{resource_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("resource_id", resourceId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = MyResource.class;
    return this.makeRequest("GET", path, returnType);
  }

  public Pager<MyResource> listResources(QueryParams queryParams) {
    final String url = "/resources";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, MyResource.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  public MyResource createResource(MyRequest body) {
    final String url = "/resources";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
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
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }

  public void badRequestMethod() {
    this.makeRequest("BOGUS", "/accounts");
  }
}
