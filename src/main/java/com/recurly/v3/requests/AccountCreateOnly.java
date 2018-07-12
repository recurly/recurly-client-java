package com.recurly.v3.requests;

import com.recurly.v3.resources.*;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class AccountCreateOnly extends Request {

  @SerializedName("acquisition")
  private AccountAcquisitionUpdatable acquisition;

  @SerializedName("code")
  private String code;

  @SerializedName("shipping_addresses")
  private List<ShippingAddressCreate> shippingAddresses;


  public AccountAcquisitionUpdatable getAcquisition() { return this.acquisition; }
  public void setAcquisition(final AccountAcquisitionUpdatable acquisition) { this.acquisition = acquisition; }

  public String getCode() { return this.code; }
  public void setCode(final String code) { this.code = code; }

  public List<ShippingAddressCreate> getShippingAddresses() { return this.shippingAddresses; }
  public void setShippingAddresses(final List<ShippingAddressCreate> shippingAddresses) { this.shippingAddresses = shippingAddresses; }

}
