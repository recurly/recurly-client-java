package com.recurly.v3;

import java.util.HashMap;

import com.recurly.v3.BaseClient;
import com.recurly.v3.requests.*;
import com.recurly.v3.resources.*;

import java.io.IOException;

public class Client extends BaseClient {
  public static final String API_VERSION = "v2018-08-09";

  // No access modifier because this must be accessible by ClientBuilder
  public Client(String siteId, String apiKey) {
    super(siteId, apiKey);
  }

  public Account getAccount(String accountId) throws IOException {
    String url = "sites/{site_id}/accounts/{account_id}";
    HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    return this.makeRequest("GET", this.interpolatePath(url, urlParams), Account.class);
  }

}
