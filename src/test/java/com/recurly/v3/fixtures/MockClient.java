package com.recurly.v3.fixtures;

import com.google.gson.reflect.TypeToken;
import com.recurly.v3.BaseClient;
import com.recurly.v3.Pager;
import com.recurly.v3.QueryParams;

import org.mockito.stubbing.Answer;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import java.lang.reflect.Type;
import java.util.HashMap;

import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

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

  public static final Response buildResponse(Integer code, String message, String response) {
    Headers headers = new Headers.Builder().build();
    return buildResponse(code, message, response, headers);
  }

  public static final Response buildResponse(Integer code, String message, String response, Headers headers) {
    final Request mRequest = new Request.Builder().url("https://v3.recurly.com").build();

    final Response mResponse =
        new Response.Builder()
            .request(mRequest)
            .protocol(okhttp3.Protocol.HTTP_1_1)
            .code(code) // status code
            .message(message)
            .body(ResponseBody.create(MediaType.get("application/json; charset=utf-8"), response))
            .headers(headers)
            .build();
    return mResponse;
  }

  public static OkHttpClient getMockOkHttpClient(Answer answer) {
    final OkHttpClient mockOkHttpClient = mock(OkHttpClient.class);
    doAnswer(answer).when(mockOkHttpClient).newCall(any());
    return mockOkHttpClient;
  }
}
