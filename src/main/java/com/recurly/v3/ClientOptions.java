package com.recurly.v3;

import com.recurly.v3.http.HttpAdapter;
import java.util.HashMap;

public class ClientOptions {

  public enum Regions {
    US,
    EU
  };

  private static final HashMap<Regions, String> regionsMap = new HashMap<>();

  static {
    regionsMap.put(Regions.US, "https://v3.recurly.com");
    regionsMap.put(Regions.EU, "https://v3.eu.recurly.com");
  }

  private Regions region;
  private HttpAdapter httpAdapter;

  public ClientOptions() {
    this.region = Regions.US;
  }

  public void setRegion(final Regions r) {
    this.region = r;
  }

  /** BaseUrl is determined by the region */
  public String getBaseUrl() {
    return regionsMap.get(this.region);
  }

  public void setHttpAdapter(final HttpAdapter adapter) {
    this.httpAdapter = adapter;
  }

  public HttpAdapter getHttpAdapter() {
    return httpAdapter;
  }
}