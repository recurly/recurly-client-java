package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class BooleanResponse extends Resource {

  @SerializedName("success")
  private Boolean success;


  public Boolean getSuccess() { return this.success; }
  public void setSuccess(final Boolean success) { this.success = success; }

}
