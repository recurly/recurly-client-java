package com.recurly.v3;

import com.recurly.v3.http.HeaderInterceptor;
import com.recurly.v3.resources.*;
import com.recurly.v3.requests.*;
import com.recurly.v3.Request;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.lang.reflect.Field;

import okhttp3.OkHttpClient;
import okhttp3.Response;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class BaseClientTest {

    @Test
    public void testMakeRequest() {
        return; // TODO: Fix the below and actually test the makeRequest methods
        // final OkHttpClient mockOkHttpClient = mock(OkHttpClient.class);
        // final Request request = new AccountRequest();
        // when(mockOkHttpClient.newCall(request).execute()).thenReturn(new Response());

        // final MockClient client = new MockClient(siteId, apiKey, mockOkHttpClient);

        // client.getAccount("code-aaron");
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

    private class MockClient extends BaseClient {
        public MockClient(final String siteId, final String apiKey) {
            super(siteId, apiKey);
        }

        public MockClient(final String siteId, final String apiKey, final OkHttpClient client) {
            super(siteId, apiKey, client);
        }

        public String apiUrl;
    }

    protected static void setEnv(Map<String, String> newenv) throws Exception {
        try {
            Class<?> processEnvironmentClass = Class.forName("java.lang.ProcessEnvironment");
            Field theEnvironmentField = processEnvironmentClass.getDeclaredField("theEnvironment");
            theEnvironmentField.setAccessible(true);
            Map<String, String> env = (Map<String, String>) theEnvironmentField.get(null);
            env.putAll(newenv);
            Field theCaseInsensitiveEnvironmentField = processEnvironmentClass.getDeclaredField("theCaseInsensitiveEnvironment");
            theCaseInsensitiveEnvironmentField.setAccessible(true);
            Map<String, String> cienv = (Map<String, String>) theCaseInsensitiveEnvironmentField.get(null);
            cienv.putAll(newenv);
        } catch (NoSuchFieldException e) {
            Class[] classes = Collections.class.getDeclaredClasses();
            Map<String, String> env = System.getenv();
            for(Class cl : classes) {
                if("java.util.Collections$UnmodifiableMap".equals(cl.getName())) {
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
}
