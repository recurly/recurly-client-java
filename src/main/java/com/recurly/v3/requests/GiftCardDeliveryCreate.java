/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Constants;
import com.recurly.v3.Request;
import com.recurly.v3.resources.*;
import org.joda.time.DateTime;

public class GiftCardDeliveryCreate extends Request {

  /**
   * When the gift card should be delivered to the recipient. If null, the gift card will be
   * delivered immediately. If a datetime is provided, the delivery will be in an hourly window,
   * rounding down. For example, 6:23 pm will be in the 6:00 pm hourly batch.
   */
  @SerializedName("deliver_at")
  @Expose
  private DateTime deliverAt;

  /** The email address of the recipient. Required if `method` is `email`. */
  @SerializedName("email_address")
  @Expose
  private String emailAddress;

  /** The first name of the recipient. */
  @SerializedName("first_name")
  @Expose
  private String firstName;

  /** The name of the gifter for the purpose of a message displayed to the recipient. */
  @SerializedName("gifter_name")
  @Expose
  private String gifterName;

  /** The last name of the recipient. */
  @SerializedName("last_name")
  @Expose
  private String lastName;

  /** Whether the delivery method is email or postal service. */
  @SerializedName("method")
  @Expose
  private Constants.DeliveryMethod method;

  /** The personal message from the gifter to the recipient. */
  @SerializedName("personal_message")
  @Expose
  private String personalMessage;

  /** Address information for the recipient. Required if `method` is `post`. */
  @SerializedName("recipient_address")
  @Expose
  private Address recipientAddress;

  /**
   * When the gift card should be delivered to the recipient. If null, the gift card will be
   * delivered immediately. If a datetime is provided, the delivery will be in an hourly window,
   * rounding down. For example, 6:23 pm will be in the 6:00 pm hourly batch.
   */
  public DateTime getDeliverAt() {
    return this.deliverAt;
  }

  /**
   * @param deliverAt When the gift card should be delivered to the recipient. If null, the gift
   *     card will be delivered immediately. If a datetime is provided, the delivery will be in an
   *     hourly window, rounding down. For example, 6:23 pm will be in the 6:00 pm hourly batch.
   */
  public void setDeliverAt(final DateTime deliverAt) {
    this.deliverAt = deliverAt;
  }

  /** The email address of the recipient. Required if `method` is `email`. */
  public String getEmailAddress() {
    return this.emailAddress;
  }

  /** @param emailAddress The email address of the recipient. Required if `method` is `email`. */
  public void setEmailAddress(final String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /** The first name of the recipient. */
  public String getFirstName() {
    return this.firstName;
  }

  /** @param firstName The first name of the recipient. */
  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  /** The name of the gifter for the purpose of a message displayed to the recipient. */
  public String getGifterName() {
    return this.gifterName;
  }

  /**
   * @param gifterName The name of the gifter for the purpose of a message displayed to the
   *     recipient.
   */
  public void setGifterName(final String gifterName) {
    this.gifterName = gifterName;
  }

  /** The last name of the recipient. */
  public String getLastName() {
    return this.lastName;
  }

  /** @param lastName The last name of the recipient. */
  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  /** Whether the delivery method is email or postal service. */
  public Constants.DeliveryMethod getMethod() {
    return this.method;
  }

  /** @param method Whether the delivery method is email or postal service. */
  public void setMethod(final Constants.DeliveryMethod method) {
    this.method = method;
  }

  /** The personal message from the gifter to the recipient. */
  public String getPersonalMessage() {
    return this.personalMessage;
  }

  /** @param personalMessage The personal message from the gifter to the recipient. */
  public void setPersonalMessage(final String personalMessage) {
    this.personalMessage = personalMessage;
  }

  /** Address information for the recipient. Required if `method` is `post`. */
  public Address getRecipientAddress() {
    return this.recipientAddress;
  }

  /**
   * @param recipientAddress Address information for the recipient. Required if `method` is `post`.
   */
  public void setRecipientAddress(final Address recipientAddress) {
    this.recipientAddress = recipientAddress;
  }
}
