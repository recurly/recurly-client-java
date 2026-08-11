package com.recurly.v3;

import com.recurly.v3.http.DefaultHttpAdapter;
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

  /**
   * @deprecated use {@link #builder()} instead. This constructor and the mutable setters will be
   *     removed in the next major version.
   */
  @Deprecated
  public ClientOptions() {
    this.region = Regions.US;
    this.httpAdapter = new DefaultHttpAdapter();
  }

  private ClientOptions(final Builder builder) {
    this.region = builder.region != null ? builder.region : Regions.US;
    this.httpAdapter = builder.httpAdapter != null ? builder.httpAdapter : new DefaultHttpAdapter();
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * @deprecated use {@link #builder()} instead. This setter will be removed in the next major
   *     version.
   */
  @Deprecated
  public void setRegion(final Regions r) {
    this.region = r;
  }

  /** BaseUrl is determined by the region */
  public String getBaseUrl() {
    return regionsMap.get(this.region);
  }

  /**
   * @deprecated use {@link #builder()} instead. This setter will be removed in the next major
   *     version.
   */
  @Deprecated
  public void setHttpAdapter(final HttpAdapter adapter) {
    this.httpAdapter = adapter;
  }

  public HttpAdapter getHttpAdapter() {
    return httpAdapter;
  }

  public static class Builder {
    private Regions region;
    private HttpAdapter httpAdapter;

    private Builder() {}

    public Builder region(final Regions region) {
      this.region = region;
      return this;
    }

    public Builder httpAdapter(final HttpAdapter httpAdapter) {
      this.httpAdapter = httpAdapter;
      return this;
    }

    public ClientOptions build() {
      return new ClientOptions(this);
    }
  }
}