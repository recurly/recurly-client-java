package com.recurly.v3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import com.recurly.v3.exception.NotFoundException;
import com.recurly.v3.exception.ValidationException;
import com.recurly.v3.fixtures.MockClient;
import com.recurly.v3.fixtures.MyRequest;
import com.recurly.v3.fixtures.MyResource;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.*;
import okhttp3.Request;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unchecked")
public class BaseClientTest {

  @Test
  public void testMakeRequestWithResource() {
    OkHttpClient mockOkHttpClient = getMockOkHttpClient(true);

    final MockClient client = new MockClient("siteId", "apiKey", mockOkHttpClient);
    final MyResource resource = client.getResource("code-aaron");

    // TODO: Verify the request made was correct. MockWebServer?
    assertEquals(MyResource.class, resource.getClass());
  }

  @Test
  public void testMakeRequestWithBody() {
    OkHttpClient mockOkHttpClient = getMockOkHttpClient(true);

    final MockClient client = new MockClient("siteId", "apiKey", mockOkHttpClient);
    final MyRequest newResource = new MyRequest();
    newResource.setMyString("aaron");
    final MyResource resource = client.createResource(newResource);

    // TODO: Verify the request made was correct. MockWebServer?
    assertEquals(MyResource.class, resource.getClass());
    assertEquals("aaron", resource.getMyString());
  }

  @Test
  public void testMakeRequestWithoutResource() {
    OkHttpClient mockOkHttpClient = getMockOkHttpClient(false);

    final MockClient client = new MockClient("siteId", "apiKey", mockOkHttpClient);
    client.removeResource("resource-id");

    // TODO: Verify the request made was correct. MockWebServer?
  }

  @Test
  public void testNotFoundError() {
    OkHttpClient mockOkHttpClient = getApiErrorMockOkHttpClient("not_found");

    final MockClient client = new MockClient("siteId", "apiKey", mockOkHttpClient);

    assertThrows(
        NotFoundException.class,
        () -> {
          client.getResource("code-aaron");
        });
  }

  @Test
  public void testValidationError() {
    OkHttpClient mockOkHttpClient = getApiErrorMockOkHttpClient("validation");

    final MockClient client = new MockClient("siteId", "apiKey", mockOkHttpClient);

    assertThrows(
        ValidationException.class,
        () -> {
          client.removeResource("code-aaron");
        });
  }

  @Test
  public void testNetworkError() {
    OkHttpClient mockOkHttpClient = getNetworkErrorMockOkHttpClient();

    final MockClient client = new MockClient("siteId", "apiKey", mockOkHttpClient);
    assertThrows(
        NetworkException.class,
        () -> {
          client.getResource("code-aaron");
        });
  }

  @Test
  public void testNetworkErrorWithoutResource() {
    OkHttpClient mockOkHttpClient = getNetworkErrorMockOkHttpClient();

    final MockClient client = new MockClient("siteId", "apiKey", mockOkHttpClient);
    assertThrows(
        NetworkException.class,
        () -> {
          client.removeResource("code-aaron");
        });
  }

  @Test
  public void testBadMethodError() {
    OkHttpClient mockOkHttpClient = getNetworkErrorMockOkHttpClient();

    final MockClient client = new MockClient("siteId", "apiKey", mockOkHttpClient);

    assertThrows(
        IllegalArgumentException.class,
        () -> {
          client.badRequestMethod();
        });
  }

  @Test
  public void testSetApiUrl() {
    final MockClient client = new MockClient("siteId", "apiKey");
    final String newApiUrl = "https://my.base.url/";
    client._setApiUrl(newApiUrl);

    assertEquals(newApiUrl, client.getApiUrl());
  }

  @Test
  public void testCantSetApiUrlWithoutRecurlyInsecure() throws Exception {
    final HashMap<String, String> environmentVariables = new HashMap<String, String>();
    environmentVariables.put("RECURLY_INSECURE", "false");
    setEnv(environmentVariables);
    final MockClient client = new MockClient("siteId", "apiKey");
    final String originalUrl = client.getApiUrl();
    final String newApiUrl = "https://my.base.url/";
    client._setApiUrl(newApiUrl);

    assertEquals(originalUrl, client.getApiUrl());

    environmentVariables.clear();
    environmentVariables.put("RECURLY_INSECURE", "true");
    setEnv(environmentVariables);
  }

  @Test
  public void testInterpolatePathWithoutParams() {
    final MockClient client = new MockClient("siteId", "apiKey");
    final String path = "/sites/{site_id}/accounts";
    final String interpolatedPath = client.interpolatePath(path);

    assertEquals("/sites/siteId/accounts", interpolatedPath);
  }

  @Test
  public void testInterpolatePathWithParams() {
    final MockClient client = new MockClient("siteId", "apiKey");
    final String path = "/sites/{site_id}/accounts/{account_id}/notes/{account_note_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", "accountId");
    urlParams.put("account_note_id", "noteId");
    final String interpolatedPath = client.interpolatePath(path, urlParams);

    assertEquals("/sites/siteId/accounts/accountId/notes/noteId", interpolatedPath);
  }

  protected static void setEnv(Map<String, String> newenv) throws Exception {
    try {
      Class<?> processEnvironmentClass = Class.forName("java.lang.ProcessEnvironment");
      Field theEnvironmentField = processEnvironmentClass.getDeclaredField("theEnvironment");
      theEnvironmentField.setAccessible(true);
      Map<String, String> env = (Map<String, String>) theEnvironmentField.get(null);
      env.putAll(newenv);
      Field theCaseInsensitiveEnvironmentField =
          processEnvironmentClass.getDeclaredField("theCaseInsensitiveEnvironment");
      theCaseInsensitiveEnvironmentField.setAccessible(true);
      Map<String, String> cienv =
          (Map<String, String>) theCaseInsensitiveEnvironmentField.get(null);
      cienv.putAll(newenv);
    } catch (NoSuchFieldException e) {
      Class[] classes = Collections.class.getDeclaredClasses();
      Map<String, String> env = System.getenv();
      for (Class cl : classes) {
        if ("java.util.Collections$UnmodifiableMap".equals(cl.getName())) {
          Field field = cl.getDeclaredField("m");
          field.setAccessible(true);
          Object obj = field.get(env);
          Map<String, String> map = (Map<String, String>) obj;
          map.clear();
          map.putAll(newenv);
        }
      }
    }
  }

  private static OkHttpClient getMockOkHttpClient(Boolean hasResponseBody) {
    final OkHttpClient mockOkHttpClient = mock(OkHttpClient.class);
    final Call mCall = mock(Call.class);
    final Request mRequest = new Request.Builder().url("https://api.recurly.com").build();

    final String responseJson = hasResponseBody ? "{ \"my_string\": \"aaron\" }" : "";
    final Response mResponse =
        new Response.Builder()
            .request(mRequest)
            .protocol(okhttp3.Protocol.HTTP_1_1)
            .code(200) // status code
            .message("Created")
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

  private static OkHttpClient getApiErrorMockOkHttpClient(String exception) {
    final OkHttpClient mockOkHttpClient = mock(OkHttpClient.class);
    final Call mCall = mock(Call.class);
    final Request mRequest = new Request.Builder().url("https://api.recurly.com").build();

    final Response mResponse =
        new Response.Builder()
            .request(mRequest)
            .protocol(okhttp3.Protocol.HTTP_1_1)
            .code(404) // status code
            .message("Not Found")
            .body(
                ResponseBody.create(
                    MediaType.get("application/json; charset=utf-8"), getErrorJson(exception)))
            .build();
    when(mockOkHttpClient.newCall(any())).thenReturn(mCall);
    try {
      when(mCall.execute()).thenReturn(mResponse);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return mockOkHttpClient;
  }

  private static OkHttpClient getNetworkErrorMockOkHttpClient() {
    final OkHttpClient mockOkHttpClient = mock(OkHttpClient.class);
    final Call mCall = mock(Call.class);
    when(mockOkHttpClient.newCall(any())).thenReturn(mCall);
    try {
      when(mCall.execute()).thenThrow(new IOException());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return mockOkHttpClient;
  }

  private static String getErrorJson(String exception) {
    return "" +
      "{\n" +
      "    \"error\": {\n" +
      "       \"type\":" + exception + ",\n" +
      "       \"message\": \"Resource has an error\",\n" +
      "       \"params\": [\n" +
      "           {\"param\":\"some_param\"}\n" +
      "        ]\n" +
      "    }\n" +
      "}";
  }
}
