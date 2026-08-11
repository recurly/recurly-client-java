package com.recurly.v3;

import static com.recurly.v3.fixtures.HttpTestFixtures.jsonResponse;
import static com.recurly.v3.fixtures.HttpTestFixtures.mockClientWith;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.recurly.v3.fixtures.MockClient;
import com.recurly.v3.fixtures.MyResource;
import com.recurly.v3.http.HttpAdapter;
import com.recurly.v3.http.HttpResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;

public class PagerTest {

  @Test
  public void testForEach() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any()))
        .thenReturn(jsonResponse(200, getResourceFirstPageJson("/next")))
        .thenReturn(jsonResponse(200, getResourceSecondPageJson()));

    final MockClient client = mockClientWith(mockAdapter);
    final Pager<MyResource> pager = client.listResources(null);
    final AtomicInteger count = new AtomicInteger(0);

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
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any()))
        .thenReturn(jsonResponse(200, getResourceSecondPageJson()));

    final MockClient client = mockClientWith(mockAdapter);
    final Pager<MyResource> pager = client.listResources(null);
    pager.eachItem(resource -> assertNotNull(resource.getMyString()));
  }

  @Test
  public void testEmptyList() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any()))
        .thenReturn(jsonResponse(200, getEmptyListJson()));

    final MockClient client = mockClientWith(mockAdapter);
    final Pager<MyResource> pager = client.listResources(null);
    assertEquals(0, pager.getData().size());

    for (MyResource myResource : pager) {
      myResource.getMyString();
    }
    pager.forEach(myResource -> myResource.getMyString());
  }

  @Test
  public void testForLoop() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any()))
        .thenReturn(jsonResponse(200, getResourceFirstPageJson("/next")))
        .thenReturn(jsonResponse(200, getResourceSecondPageJson()));

    final MockClient client = mockClientWith(mockAdapter);
    final Pager<MyResource> pager = client.listResources(null);
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
    final Pager<MyResource> pager = new Pager<>(null, null, null, null);
    assertThrows(NoSuchElementException.class, () -> pager.getNextPage());
  }

  @Test
  public void testCount() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    final Map<String, String> headers = new HashMap<>();
    headers.put("recurly-total-records", "1337");
    when(mockAdapter.execute(eq("HEAD"), any(), any(), any()))
        .thenReturn(new HttpResponse(200, headers, new byte[0]));

    final MockClient client = mockClientWith(mockAdapter);
    final Pager<MyResource> pager = client.listResources(null);
    assertEquals(1337, pager.getCount());
  }

  @Test
  public void testFirst() throws IOException {
    final HttpAdapter mockAdapter = mock(HttpAdapter.class);
    when(mockAdapter.execute(any(), any(), any(), any()))
        .thenReturn(jsonResponse(200, getResourceFirstItemJson()));

    final MockClient client = mockClientWith(mockAdapter);
    final Pager<MyResource> pager = client.listResources(null);
    final MyResource resource = pager.getFirst();

    verify(mockAdapter).execute(eq("GET"), contains("limit=1"), any(), any());
    assertEquals("Resource First Item", resource.getMyString());
  }

  private String getResourceFirstPageJson(final String next) {
    return ""
        + "{"
        + "\"object\":\"list\","
        + "\"has_more\":true,"
        + "\"next\":\""
        + next
        + "\","
        + "\"data\": ["
        + "{\"my_string\":\"Resource Page 1\"},"
        + "{\"my_string\":\"Resource Page 1\"},"
        + "{\"my_string\":\"Resource Page 1\"}"
        + "]}";
  }

  private String getResourceSecondPageJson() {
    return ""
        + "{"
        + "\"object\":\"list\","
        + "\"has_more\":false,"
        + "\"next\":null,"
        + "\"data\": ["
        + "{\"my_string\":\"Resource Page 2\"},"
        + "{\"my_string\":\"Resource Page 2\"}"
        + "]}";
  }

  private String getEmptyListJson() {
    return "{\"object\":\"list\",\"has_more\":false,\"next\":null,\"data\":[]}";
  }

  private String getResourceFirstItemJson() {
    return "{"
        + "\"object\": \"list\","
        + "\"has_more\": false,"
        + "\"next\": null,"
        + "\"data\": [{\"my_string\":\"Resource First Item\"}]}";
  }
}
