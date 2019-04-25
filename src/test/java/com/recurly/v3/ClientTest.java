package com.recurly.v3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.matchesPattern;


public class ClientTest {
    private static final String siteId = "subdomain-mysubdomain";
    private static final String apiKey = "myapikey";

    @Test
    public void testCantInitializeWithoutSiteIdAndApiKey() {
        assertThrows(IllegalArgumentException.class, () -> {new Client("SITEID", null);});
        assertThrows(IllegalArgumentException.class, () -> {new Client("SITEID", "");});
        assertThrows(IllegalArgumentException.class, () -> {new Client(null, "APIKEY");});
        assertThrows(IllegalArgumentException.class, () -> {new Client("", "APIKEY");});
    }

    @Test
    public void testRespondsWithValidApiVersion() {
        assertThat(Client.API_VERSION, matchesPattern("v\\d{4}-\\d{2}-\\d{2}"));
    }
}
