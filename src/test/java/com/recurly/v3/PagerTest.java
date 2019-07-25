package com.recurly.v3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import com.recurly.v3.fixtures.MockClient;
import com.recurly.v3.fixtures.MyResource;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.*;
import okhttp3.Request;
import org.junit.jupiter.api.Test;

public class PagerTest {
  @Test
  public void testForEach() {
    OkHttpClient mockOkHttpClient =
        getMockOkHttpClient(getResourceFirstPageJson(), getResourceSecondPageJson());

    final MockClient client = new MockClient("siteId", "apiKey", mockOkHttpClient);
    Pager<MyResource> pager = client.listResources(null);
    AtomicInteger count = new AtomicInteger(0);
    pager.forEach(
        resource -> {
          if (count.get() < 3) {
            assertEquals("Resource Page 1", resource.getMyString());
          } else {
            assertEquals("Resource Page 2", resource.getMyString());
          }
          count.incrementAndGet();
        });
  }

  @Test
  public void testEachItem() {
    OkHttpClient mockOkHttpClient = getMockOkHttpClientSingleRequest(getResourceSecondPageJson());

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
    pager.forEach(
        myResource ->
            myResource.getMyString()); // This should not throw NullPointerException either
  }

  @Test
  public void testForLoop() {
    OkHttpClient mockOkHttpClient =
        getMockOkHttpClient(getResourceFirstPageJson(), getResourceSecondPageJson());

    final MockClient client = new MockClient("siteId", "apiKey", mockOkHttpClient);
    Pager<MyResource> pager = client.listResources(null);
    int count = 0;
    for (MyResource res : pager) {
      if (count < 3) {
        assertEquals("Resource Page 1", res.getMyString());
      } else {
        assertEquals("Resource Page 2", res.getMyString());
      }
      count++;
    }
    assertEquals(5, count);
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
    final Response mResponse = getResponse(mRequest, responseJson);

    when(mockOkHttpClient.newCall(any())).thenReturn(mCall);
    try {
      when(mCall.execute()).thenReturn(mResponse);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return mockOkHttpClient;
  }

  private OkHttpClient getMockOkHttpClient(String responseJson1, String responseJson2) {
    final OkHttpClient mockOkHttpClient = mock(OkHttpClient.class);
    final Call mCall = mock(Call.class);
    final Request mRequest = new Request.Builder().url("https://api.recurly.com").build();
    final Response mResponse1 = getResponse(mRequest, responseJson1);
    final Response mResponse2 = getResponse(mRequest, responseJson2);

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
        .body(ResponseBody.create(MediaType.get("application/json; charset=utf-8"), json))
        .build();
  }

  private String getResourceFirstPageJson() {
    return ""
        + "{"
        + "\"object\":\"list\","
        + "\"has_more\":true,"
        + "\"next\":\"/next\","
        + "\"data\": ["
        + "{"
        + "\"my_string\":\"Resource Page 1\""
        + "},"
        + "{"
        + "\"my_string\":\"Resource Page 1\""
        + "},"
        + "{"
        + "\"my_string\":\"Resource Page 1\""
        + "}"
        + "]"
        + "}";
  }

  private String getResourceSecondPageJson() {
    return ""
        + "{"
        + "\"object\":\"list\","
        + "\"has_more\":false,"
        + "\"next\":null,"
        + "\"data\": ["
        + "{"
        + "\"my_string\":\"Resource Page 2\""
        + "},"
        + "{"
        + "\"my_string\":\"Resource Page 2\""
        + "}"
        + "]"
        + "}";
  }

  private String getEmptyListJson() {
    return "{\"object\":\"list\",\"has_more\":false,\"next\":null,\"data\":[]}";
  }
}
