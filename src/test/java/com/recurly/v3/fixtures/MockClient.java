package com.recurly.v3.fixtures;

import com.google.gson.reflect.TypeToken;
import com.recurly.v3.BaseClient;
import java.lang.reflect.Type;
import java.util.HashMap;

import com.recurly.v3.Pager;
import com.recurly.v3.QueryParams;
import okhttp3.OkHttpClient;

public class MockClient extends BaseClient {
  public MockClient(final String siteId, final String apiKey) {
    super(siteId, apiKey);
  }

  public MockClient(final String siteId, final String apiKey, final OkHttpClient client) {
    super(siteId, apiKey, client);
  }

  public String apiUrl;

  public MyResource getResource(String resourceId) {
    final String url = "/sites/{site_id}/resources/{resource_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("resource_id", resourceId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = MyResource.class;
    return this.makeRequest("GET", path, returnType);
  }

  public Pager<MyResource> listResources(QueryParams queryParams) {
    final String url = "/sites/{site_id}/resources";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, MyResource.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  public MyResource createResource(MyRequest body) {
    final String url = "/sites/{site_id}/resources";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = MyResource.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  public void removeResource(String resourceId) {
    final String url = "/sites/{site_id}/resources/{resource_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("resource_id", resourceId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }

  public void badRequestMethod() {
    this.makeRequest("BOGUS", "/sites/{site_id}");
  }
}
