package com.recurly.v3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.recurly.v3.fixtures.MockClient;
import com.recurly.v3.fixtures.MyResource;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.*;
import okhttp3.Request;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

public class PagerTest {
  @Test
  public void testForEach() throws IOException {
    final Call mCall = mock(Call.class);
    AtomicBoolean firstCalled = new AtomicBoolean(false);
    Answer answer = (i) -> {
      Request request = i.getArgument(0);
      HttpUrl url = request.url();
      if (firstCalled.get()) {
        assertEquals("/next", url.url().getPath());
      }
      firstCalled.set(true);
      return mCall;
    };
    when(mCall.execute())
      .thenReturn(MockClient.buildResponse(200, "OK", getResourceFirstPageJson("/next")))
      .thenReturn(MockClient.buildResponse(200, "OK", getResourceSecondPageJson()));

    OkHttpClient mockOkHttpClient = MockClient.getMockOkHttpClient(answer);

    final MockClient client = new MockClient("apiKey", mockOkHttpClient);
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
  public void testEachItem() throws IOException {
    final Call mCall = mock(Call.class);
    Answer answer = (i) -> { return mCall; };
    when(mCall.execute()).thenReturn(MockClient.buildResponse(200, "OK", getResourceSecondPageJson()));

    OkHttpClient mockOkHttpClient = MockClient.getMockOkHttpClient(answer);

    final MockClient client = new MockClient("apiKey", mockOkHttpClient);
    Pager<MyResource> pager = client.listResources(null);
    pager.eachItem(resource -> assertNotNull(resource.getMyString()));
  }

  @Test
  public void testEmptyList() throws IOException {
    final Call mCall = mock(Call.class);
    Answer answer = (i) -> { return mCall; };
    when(mCall.execute()).thenReturn(MockClient.buildResponse(200, "OK", getEmptyListJson()));

    OkHttpClient mockOkHttpClient = MockClient.getMockOkHttpClient(answer);

    final MockClient client = new MockClient("apiKey", mockOkHttpClient);
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
  public void testForLoop() throws IOException {
    final Call mCall = mock(Call.class);
    AtomicBoolean firstCalled = new AtomicBoolean(false);
    Answer answer = (i) -> {
      Request request = i.getArgument(0);
      HttpUrl url = request.url();
      if (firstCalled.get()) {
        assertEquals("/next", url.url().getPath());
      }
      firstCalled.set(true);
      return mCall;
    };
    when(mCall.execute())
      .thenReturn(MockClient.buildResponse(200, "OK", getResourceFirstPageJson("/next")))
      .thenReturn(MockClient.buildResponse(200, "OK", getResourceSecondPageJson()));

    OkHttpClient mockOkHttpClient = MockClient.getMockOkHttpClient(answer);

    final MockClient client = new MockClient("apiKey", mockOkHttpClient);
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

  @Test
  public void testCount() throws IOException {
    final Call mCall = mock(Call.class);
    Headers headers = new Headers.Builder().set("Recurly-Total-Records", "1337").build();
    Answer answer = (i) -> {
      Request request = i.getArgument(0);
      assertEquals("HEAD", request.method());
      return mCall;
    };
    when(mCall.execute()).thenReturn(MockClient.buildResponse(200, "OK", getResourceFirstItemJson(), headers));

    OkHttpClient mockOkHttpClient = MockClient.getMockOkHttpClient(answer);

    final MockClient client = new MockClient("apiKey", mockOkHttpClient);
    Pager<MyResource> pager = client.listResources(null);
    int count = pager.getCount();
    assertEquals(1337, count);
  }

  @Test
  public void testFirst() throws IOException {
    final Call mCall = mock(Call.class);
    Answer answer = (i) -> {
      Request request = i.getArgument(0);
      HttpUrl url = request.url();
      assertEquals("1", url.queryParameter("limit"));
      return mCall;
    };
    when(mCall.execute()).thenReturn(MockClient.buildResponse(200, "OK", getResourceFirstItemJson()));

    OkHttpClient mockOkHttpClient = MockClient.getMockOkHttpClient(answer);

    final MockClient client = new MockClient("apiKey", mockOkHttpClient);
    Pager<MyResource> pager = client.listResources(null);
    MyResource resource = pager.getFirst();
    assertEquals("Resource First Item", resource.getMyString());
  }

  private String getResourceFirstPageJson(String next) {
    return ""
        + "{"
        + "\"object\":\"list\","
        + "\"has_more\":true,"
        + "\"next\":\"" + next + "\","
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

  private String getResourceFirstItemJson() {
    return "{" +
      "\"object\": \"list\"," +
      "\"has_more\": false," +
      "\"next\": null," +
      "\"data\": [" +
      "  {" +
      "    \"my_string\":\"Resource First Item\"" +
      "  }" +
      "]}";
  }
}
