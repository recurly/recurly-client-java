package com.recurly.v3;

import com.recurly.v3.fixtures.MockClient;
import com.recurly.v3.fixtures.MyResource;
import okhttp3.*;
import okhttp3.Request;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class PagerTest {
  @Test
  public void testForEach() {
    OkHttpClient mockOkHttpClient = getMockOkHttpClient(getResourceListJson());

    final MockClient client = new MockClient("siteId", "apiKey", mockOkHttpClient);
    Pager<MyResource> pager = client.listResources(null);
    pager.forEach(resource -> assertNotNull(resource.getMyString()));
  }

  @Test
  public void testEmptyList() {
    OkHttpClient mockOkHttpClient = getMockOkHttpClient(getEmptyListJson());

    final MockClient client = new MockClient("siteId", "apiKey", mockOkHttpClient);
    Pager<MyResource> pager = client.listResources(null);
    assertEquals(0, pager.getData().size());

    for (MyResource myResource : pager) {
      System.out.println("This should not throw exception" + myResource.getMyString());
    }
    pager.forEach(myResource -> System.out.println("This should not throw exception either" + myResource.getMyString()));
  }

  private OkHttpClient getMockOkHttpClient(String responseJson) {
    final OkHttpClient mockOkHttpClient = mock(OkHttpClient.class);
    final Call mCall = mock(Call.class);
    final Request mRequest = new Request.Builder().url("https://api.recurly.com").build();

    final Response mResponse =
        new Response.Builder()
            .request(mRequest)
            .protocol(okhttp3.Protocol.HTTP_1_1)
            .code(200) // status code
            .message("Ok")
            .body(
                ResponseBody.create(MediaType.get("application/json; charset=utf-8"), responseJson))
            .build();
    when(mockOkHttpClient.newCall(any())).thenReturn(mCall);
    try {
      when(mCall.execute()).thenReturn(mResponse);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return mockOkHttpClient;
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

  private String getEmptyListJson() {
    return "{\"object\":\"list\",\"has_more\":false,\"next\":null,\"data\":[]}";
  }
}
