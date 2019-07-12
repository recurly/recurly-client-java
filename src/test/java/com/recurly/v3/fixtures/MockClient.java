package com.recurly.v3.fixtures;

import com.recurly.v3.BaseClient;
import java.lang.reflect.Type;
import java.util.HashMap;
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
