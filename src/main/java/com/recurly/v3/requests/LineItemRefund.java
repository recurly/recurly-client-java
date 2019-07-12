package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class LineItemRefund extends Request {

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("prorate")
  @Expose
  private Boolean prorate;

  @SerializedName("quantity")
  @Expose
  private Integer quantity;


  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public Boolean getProrate() { return this.prorate; }
  public void setProrate(final Boolean prorate) { this.prorate = prorate; }

  public Integer getQuantity() { return this.quantity; }
  public void setQuantity(final Integer quantity) { this.quantity = quantity; }

}
