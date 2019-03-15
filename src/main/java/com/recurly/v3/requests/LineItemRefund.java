package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class LineItemRefund extends Request {

  @SerializedName("id")
  private String id;

  @SerializedName("prorate")
  private Boolean prorate;

  @SerializedName("quantity")
  private Integer quantity;


  public String getId() { return this.id; }
  public void setId(final String id) { this.id = id; }

  public Boolean getProrate() { return this.prorate; }
  public void setProrate(final Boolean prorate) { this.prorate = prorate; }

  public Integer getQuantity() { return this.quantity; }
  public void setQuantity(final Integer quantity) { this.quantity = quantity; }

}
