package com.recurly.v3;
import java.time.Duration;
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
  private Duration connectTimeout;
  private Duration readTimeout;
  private Duration writeTimeout;
  private Duration callTimeout;

  public ClientOptions() {
    this.region = Regions.US;
  }

  public void setRegion(Regions r) {
    this.region = r;
  }

  /** BaseUrl is determined by the region */
  public String getBaseUrl() {
    return regionsMap.get(this.region);
  }

  /** Connect timeout for the underlying HTTP client. Unset leaves the OkHttp default in place. */
  public void setConnectTimeout(Duration connectTimeout) {
    this.connectTimeout = connectTimeout;
  }

  public Duration getConnectTimeout() {
    return this.connectTimeout;
  }

  /**
   * Read timeout for the underlying HTTP client. Unset leaves the OkHttp default in place. Raising
   * this is how a caller tolerates a slow response instead of failing the request.
   */
  public void setReadTimeout(Duration readTimeout) {
    this.readTimeout = readTimeout;
  }

  public Duration getReadTimeout() {
    return this.readTimeout;
  }

  /** Write timeout for the underlying HTTP client. Unset leaves the OkHttp default in place. */
  public void setWriteTimeout(Duration writeTimeout) {
    this.writeTimeout = writeTimeout;
  }

  public Duration getWriteTimeout() {
    return this.writeTimeout;
  }

  /**
   * Timeout spanning the complete call, including redirects and retries. Unset leaves OkHttp's
   * behaviour of applying no overall limit.
   */
  public void setCallTimeout(Duration callTimeout) {
    this.callTimeout = callTimeout;
  }

  public Duration getCallTimeout() {
    return this.callTimeout;
  }
}