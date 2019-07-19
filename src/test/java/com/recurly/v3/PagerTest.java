package com.recurly.v3;

import com.recurly.v3.fixtures.MockClient;
import com.recurly.v3.fixtures.MyResource;
import okhttp3.*;
import okhttp3.Request;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class PagerTest {
  @Test
  public void testForEach() {
    OkHttpClient mockOkHttpClient = getMockOkHttpClientSingleRequest(getResourceListJson());

    final MockClient client = new MockClient("siteId", "apiKey", mockOkHttpClient);
    Pager<MyResource> pager = client.listResources(null);
    pager.forEach(resource -> assertNotNull(resource.getMyString()));
  }

  @Test
  public void testEachItem() {
    OkHttpClient mockOkHttpClient = getMockOkHttpClientSingleRequest(getResourceListJson());

    final MockClient client = new MockClient("siteId", "apiKey", mockOkHttpClient);
    Pager<MyResource> pager = client.listResources(null);
    pager.eachItem(resource -> assertNotNull(resource.getMyString()));
  }

  @Test
  public void testEmptyList() {
    OkHttpClient mockOkHttpClient = getMockOkHttpClientSingleRequest(getEmptyListJson());

    final MockClient client = new MockClient("siteId", "apiKey", mockOkHttpClient);
    Pager<MyResource> pager = client.listResources(null);
    assertEquals(0, pager.getData().size());

    for (MyResource myResource : pager) {
      myResource.getMyString(); // This should not throw NullPointerException
    }
    pager.forEach(myResource -> myResource.getMyString()); // This should not throw NullPointerException either
  }

  @Test
  public void testMultiplePages() {
    OkHttpClient mockOkHttpClient = getMockOkHttpClientMultipleRequest(getResourceFirstPageJson(), getResourceListJson());

    final MockClient client = new MockClient("siteId", "apiKey", mockOkHttpClient);
    Pager<MyResource> pager = client.listResources(null);
    int count = 0;
    for (MyResource res : pager) {
      assertNotNull(res.getMyString());
      count++;
    }
    assertEquals(4, count);
  }

  @Test
  public void testNullNextPage() {
    Pager<MyResource> pager = new Pager<>(null, null, null, null);

    assertThrows(NoSuchElementException.class, () -> pager.getNextPage());
  }

  private OkHttpClient getMockOkHttpClientSingleRequest(String responseJson) {
    final OkHttpClient mockOkHttpClient = mock(OkHttpClient.class);
    final Call mCall = mock(Call.class);
    final Request mRequest = new Request.Builder().url("https://api.recurly.com").build();
    final Response mResponse = getResponse(mRequest, getResourceListJson());


    when(mockOkHttpClient.newCall(any())).thenReturn(mCall);
    try {
      when(mCall.execute()).thenReturn(mResponse);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return mockOkHttpClient;
  }

  private OkHttpClient getMockOkHttpClientMultipleRequest(String responseJson1, String responseJson2) {
    final OkHttpClient mockOkHttpClient = mock(OkHttpClient.class);
    final Call mCall = mock(Call.class);
    final Request mRequest = new Request.Builder().url("https://api.recurly.com").build();
    final Response mResponse1 = getResponse(mRequest, getResourceFirstPageJson());
    final Response mResponse2 = getResponse(mRequest, getResourceListJson());

    when(mockOkHttpClient.newCall(any())).thenReturn(mCall);
    try {
      when(mCall.execute()).thenReturn(mResponse1).thenReturn(mResponse2);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return mockOkHttpClient;
  }

  private Response getResponse(Request mRequest, String json) {
    return new Response.Builder()
            .request(mRequest)
            .protocol(okhttp3.Protocol.HTTP_1_1)
            .code(200) // status code
            .message("Ok")
            .body(
                ResponseBody.create(MediaType.get("application/json; charset=utf-8"), json))
            .build();
  }

  private String getResourceListJson() {
    return "" +
        "{" +
          "\"object\":\"list\"," +
          "\"has_more\":false," +
          "\"next\":null," +
          "\"data\": [" +
            "{" +
              "\"my_string\":\"myString\"" +
            "}," +
            "{" +
              "\"my_string\":\"myOtherString\"" +
            "}" +
          "]" +
        "}";
  }

  private String getResourceFirstPageJson() {
    return "" +
        "{" +
          "\"object\":\"list\"," +
          "\"has_more\":true," +
          "\"next\":\"/next\"," +
          "\"data\": [" +
            "{" +
              "\"my_string\":\"myString\"" +
            "}," +
            "{" +
              "\"my_string\":\"myOtherString\"" +
            "}" +
          "]" +
        "}";
  }

  private String getEmptyListJson() {
    return "{\"object\":\"list\",\"has_more\":false,\"next\":null,\"data\":[]}";
  }
}
