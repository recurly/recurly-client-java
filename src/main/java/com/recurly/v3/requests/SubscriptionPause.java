package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class SubscriptionPause extends Request {

  @SerializedName("remaining_pause_cycles")
  @Expose
  private Integer remainingPauseCycles;


  public Integer getRemainingPauseCycles() { return this.remainingPauseCycles; }
  public void setRemainingPauseCycles(final Integer remainingPauseCycles) { this.remainingPauseCycles = remainingPauseCycles; }

}
