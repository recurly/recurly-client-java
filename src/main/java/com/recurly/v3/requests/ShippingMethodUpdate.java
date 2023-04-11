/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import com.recurly.v3.Constants;
import com.recurly.v3.resources.*;
import org.joda.time.DateTime;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class ShippingMethodUpdate extends Request {

  
  /**
   * Accounting code for shipping method.
   */
  
  @SerializedName("accounting_code")
  @Expose
  private String accountingCode;

  
  /**
   * The internal name used identify the shipping method.
   */
  
  @SerializedName("code")
  @Expose
  private String code;

  
  /**
   * The name of the shipping method displayed to customers.
   */
  
  @SerializedName("name")
  @Expose
  private String name;

  
  /**
   * Used by Avalara, Vertex, and Recurly’s built-in tax feature. The tax
code values are specific to each tax system. If you are using Recurly’s
built-in taxes the values are:

- `FR` – Common Carrier FOB Destination
- `FR022000` – Common Carrier FOB Origin
- `FR020400` – Non Common Carrier FOB Destination
- `FR020500` – Non Common Carrier FOB Origin
- `FR010100` – Delivery by Company Vehicle Before Passage of Title
- `FR010200` – Delivery by Company Vehicle After Passage of Title
- `NT` – Non-Taxable

   */
  
  @SerializedName("tax_code")
  @Expose
  private String taxCode;


  
  /**
   * Accounting code for shipping method.
   */
  
  public String getAccountingCode() { return this.accountingCode; }

  
  /**
   * @param accountingCode Accounting code for shipping method.
   */
  
  public void setAccountingCode(final String accountingCode) { this.accountingCode = accountingCode; }

  
  /**
   * The internal name used identify the shipping method.
   */
  
  public String getCode() { return this.code; }

  
  /**
   * @param code The internal name used identify the shipping method.
   */
  
  public void setCode(final String code) { this.code = code; }

  
  /**
   * The name of the shipping method displayed to customers.
   */
  
  public String getName() { return this.name; }

  
  /**
   * @param name The name of the shipping method displayed to customers.
   */
  
  public void setName(final String name) { this.name = name; }

  
  /**
   * Used by Avalara, Vertex, and Recurly’s built-in tax feature. The tax
code values are specific to each tax system. If you are using Recurly’s
built-in taxes the values are:

- `FR` – Common Carrier FOB Destination
- `FR022000` – Common Carrier FOB Origin
- `FR020400` – Non Common Carrier FOB Destination
- `FR020500` – Non Common Carrier FOB Origin
- `FR010100` – Delivery by Company Vehicle Before Passage of Title
- `FR010200` – Delivery by Company Vehicle After Passage of Title
- `NT` – Non-Taxable

   */
  
  public String getTaxCode() { return this.taxCode; }

  
  /**
   * @param taxCode Used by Avalara, Vertex, and Recurly’s built-in tax feature. The tax
code values are specific to each tax system. If you are using Recurly’s
built-in taxes the values are:

- `FR` – Common Carrier FOB Destination
- `FR022000` – Common Carrier FOB Origin
- `FR020400` – Non Common Carrier FOB Destination
- `FR020500` – Non Common Carrier FOB Origin
- `FR010100` – Delivery by Company Vehicle Before Passage of Title
- `FR010200` – Delivery by Company Vehicle After Passage of Title
- `NT` – Non-Taxable

   */
  
  public void setTaxCode(final String taxCode) { this.taxCode = taxCode; }

}
