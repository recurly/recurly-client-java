package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class ErrorMayHaveTransaction extends Resource {

  @SerializedName("message")
  private String message;

  @SerializedName("params")
  private List<Hash> params;

  @SerializedName("transaction_error")
  private Map<String, String> transactionError;

  @SerializedName("type")
  private String type;


  public String getMessage() { return this.message; }
  public void setMessage(final String message) { this.message = message; }

  public List<Hash> getParams() { return this.params; }
  public void setParams(final List<Hash> params) { this.params = params; }

  public Map<String, String> getTransactionError() { return this.transactionError; }
  public void setTransactionError(final Map<String, String> transactionError) { this.transactionError = transactionError; }

  public String getType() { return this.type; }
  public void setType(final String type) { this.type = type; }

}
