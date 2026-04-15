package com.recurly.v3.fixtures;

import com.google.gson.reflect.TypeToken;
import com.recurly.v3.BaseClient;
import com.recurly.v3.Pager;
import com.recurly.v3.ClientOptions;
import com.recurly.v3.http.HttpTransport;
import com.recurly.v3.http.SimpleHttpResponse;

import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockClient extends BaseClient {
  public MockClient(final String apiKey) {
    super(apiKey);
  }

  public MockClient(final String apiKey, final HttpTransport transport) {
    super(apiKey, transport, new ClientOptions());
  }

  public MockClient(final String apiKey, final ClientOptions clientOptions) {
    super(apiKey, clientOptions);
  }

  public MockClient(final String apiKey, final HttpTransport transport, final ClientOptions clientOptions) {
    super(apiKey, transport, clientOptions);
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

  public MyResource reactivateResource(String resourceId) {
    final String url = "/resources/{resource_id}/reactivate";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("resource_id", resourceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = MyResource.class;
    return this.makeRequest("PUT", path, returnType);
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

  /** Builds a mock response with application/json content type. */
  public static SimpleHttpResponse buildResponse(int code, String body) {
    return buildResponse(code, "application/json; charset=utf-8", body, Collections.<String, List<String>>emptyMap());
  }

  /** Builds a mock response with application/json content type and extra headers. */
  public static SimpleHttpResponse buildResponse(int code, String body, Map<String, List<String>> extraHeaders) {
    return buildResponse(code, "application/json; charset=utf-8", body, extraHeaders);
  }

  /** Builds a mock response with an explicit content type and extra headers. */
  public static SimpleHttpResponse buildResponse(int code, String contentType, String body, Map<String, List<String>> extraHeaders) {
    final Map<String, List<String>> headers = new HashMap<>(extraHeaders);
    headers.put("Content-Type", Arrays.asList(contentType));

    final byte[] bodyBytes = (body != null)
        ? body.getBytes(StandardCharsets.UTF_8)
        : new byte[0];

    return new SimpleHttpResponse(code, headers, bodyBytes);
  }
}
