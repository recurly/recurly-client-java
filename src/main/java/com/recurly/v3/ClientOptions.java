package com.recurly.v3;

public class ClientOptions {

  private String region;

  public ClientOptions() {
  }

  /** Region */
  public String getRegion() {
    return this.region;
  }

  /** @param region Region */
  public void setRegion(final String region) {
    this.region = region;
  }
}