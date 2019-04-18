package com.recurly.v3;

import java.util.HashMap;
import java.util.Map;

import com.recurly.v3.BaseClient;
import com.recurly.v3.requests.*;
import com.recurly.v3.resources.*;

import java.io.IOException;

public class Client extends BaseClient {
  public static final String API_VERSION = "v2018-08-09";

  public Client(final String siteId, final String apiKey) {
    super(siteId, apiKey);
  }

  public Account getAccount(final String accountId) throws IOException {
    final String url = "sites/{site_id}/accounts/{account_id}";
    final Map<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    return this.makeRequest("GET", this.interpolatePath(url, urlParams), Account.class);
  }

  public Account createAccount(final AccountCreate accountReq) throws IOException {
    final String url = "sites/{site_id}/accounts";

    return this.makeRequest("POST", this.interpolatePath(url), accountReq, Account.class);
  }

  public Account deactivateAccount(final String accountId) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}";
    final Map<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    return this.makeRequest("DELETE", this.interpolatePath(url, urlParams), Account.class);
  }

}
