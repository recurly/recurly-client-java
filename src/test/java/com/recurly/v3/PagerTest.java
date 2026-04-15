package com.recurly.v3;

import static org.junit.jupiter.api.Assertions.*;

import com.recurly.v3.fixtures.MockClient;
import com.recurly.v3.fixtures.MockHttpTransport;
import com.recurly.v3.fixtures.MyResource;
import com.recurly.v3.http.SimpleHttpRequest;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;

public class PagerTest {
  @Test
  public void testForEach() throws IOException {
    final MockHttpTransport transport = new MockHttpTransport();
    transport.enqueue(MockClient.buildResponse(200, getResourceFirstPageJson("/next")));
    transport.enqueue(MockClient.buildResponse(200, getResourceSecondPageJson()));

    final MockClient client = new MockClient("apiKey", transport);
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

    // Second request should be to the "next" path
    assertEquals("/next", getPath(transport.getRequests().get(1).getUrl()));
  }

  @Test
  public void testEachItem() throws IOException {
    final MockHttpTransport transport = new MockHttpTransport();
    transport.enqueue(MockClient.buildResponse(200, getResourceSecondPageJson()));

    final MockClient client = new MockClient("apiKey", transport);
    Pager<MyResource> pager = client.listResources(null);
    pager.eachItem(resource -> assertNotNull(resource.getMyString()));
  }

  @Test
  public void testEmptyList() throws IOException {
    final MockHttpTransport transport = new MockHttpTransport();
    transport.enqueue(MockClient.buildResponse(200, getEmptyListJson()));

    final MockClient client = new MockClient("apiKey", transport);
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
    final MockHttpTransport transport = new MockHttpTransport();
    transport.enqueue(MockClient.buildResponse(200, getResourceFirstPageJson("/next")));
    transport.enqueue(MockClient.buildResponse(200, getResourceSecondPageJson()));

    final MockClient client = new MockClient("apiKey", transport);
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

    // Second request should be to the "next" path
    assertEquals("/next", getPath(transport.getRequests().get(1).getUrl()));
  }

  @Test
  public void testNullNextPage() {
    Pager<MyResource> pager = new Pager<>(null, null, null, null);

    assertThrows(NoSuchElementException.class, () -> pager.getNextPage());
  }

  @Test
  public void testCount() throws IOException {
    final MockHttpTransport transport = new MockHttpTransport();
    final Map<String, List<String>> headers = new HashMap<>();
    headers.put("Recurly-Total-Records", Arrays.asList("1337"));
    transport.enqueue(MockClient.buildResponse(200, getResourceFirstItemJson(), headers));

    final MockClient client = new MockClient("apiKey", transport);
    Pager<MyResource> pager = client.listResources(null);
    int count = pager.getCount();
    assertEquals(1337, count);

    assertEquals("HEAD", transport.getLastRequest().getMethod());
  }

  @Test
  public void testFirst() throws IOException {
    final MockHttpTransport transport = new MockHttpTransport();
    transport.enqueue(MockClient.buildResponse(200, getResourceFirstItemJson()));

    final MockClient client = new MockClient("apiKey", transport);
    Pager<MyResource> pager = client.listResources(null);
    MyResource resource = pager.getFirst();
    assertEquals("Resource First Item", resource.getMyString());

    assertEquals("1", getQueryParam(transport.getLastRequest().getUrl(), "limit"));
  }

  // --- Helpers ---

  private static String getPath(String url) {
    int schemeEnd = url.indexOf("://");
    if (schemeEnd < 0) return url;
    int pathStart = url.indexOf('/', schemeEnd + 3);
    if (pathStart < 0) return "/";
    int queryStart = url.indexOf('?', pathStart);
    return queryStart < 0 ? url.substring(pathStart) : url.substring(pathStart, queryStart);
  }

  private static String getQueryParam(String url, String name) {
    try {
      int qIdx = url.indexOf('?');
      if (qIdx < 0) return null;
      final String query = url.substring(qIdx + 1);
      for (String param : query.split("&")) {
        final int eqIdx = param.indexOf('=');
        final String key = URLDecoder.decode(
            eqIdx >= 0 ? param.substring(0, eqIdx) : param, "UTF-8");
        if (key.equals(name)) {
          return eqIdx >= 0 ? URLDecoder.decode(param.substring(eqIdx + 1), "UTF-8") : "";
        }
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    return null;
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
