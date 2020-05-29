/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3;

import com.google.gson.reflect.TypeToken;
import com.recurly.v3.requests.*;
import com.recurly.v3.resources.*;
import okhttp3.OkHttpClient;
import org.joda.time.DateTime;

import java.lang.reflect.Type;
import java.util.HashMap;

public class Client extends BaseClient {
  public static final String API_VERSION = "v2019-10-10";

  public Client(final String apiKey) {
    super(apiKey);
  }


  /**
   * List sites
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_sites">list_sites api documentation</a>
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of sites.
   */
  public Pager<Site> listSites(QueryParams queryParams) {
    final String url = "/sites";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Site.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Fetch a site
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_site">get_site api documentation</a>
   * @param siteId Site ID or subdomain. For ID no prefix is used e.g. `e28zov4fw0v2`. For subdomain use prefix `subdomain-`, e.g. `subdomain-recurly`.
     * @return A site.
   */
  public Site getSite(String siteId) {
    final String url = "/sites/{site_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("site_id", siteId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Site.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * List a site's accounts
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_accounts">list_accounts api documentation</a>
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the site's accounts.
   */
  public Pager<Account> listAccounts(QueryParams queryParams) {
    final String url = "/accounts";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Account.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Create an account
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/create_account">create_account api documentation</a>
   * @param body The body of the request.
     * @return An account.
   */
  public Account createAccount(AccountCreate body) {
    final String url = "/accounts";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Account.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * Fetch an account
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_account">get_account api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
     * @return An account.
   */
  public Account getAccount(String accountId) {
    final String url = "/accounts/{account_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Account.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Modify an account
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/update_account">update_account api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param body The body of the request.
     * @return An account.
   */
  public Account updateAccount(String accountId, AccountUpdate body) {
    final String url = "/accounts/{account_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Account.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * Deactivate an account
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/deactivate_account">deactivate_account api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
     * @return An account.
   */
  public Account deactivateAccount(String accountId) {
    final String url = "/accounts/{account_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Account.class;
    return this.makeRequest("DELETE", path, returnType);
  }

  /**
   * Fetch an account's acquisition data
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_account_acquisition">get_account_acquisition api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
     * @return An account's acquisition data.
   */
  public AccountAcquisition getAccountAcquisition(String accountId) {
    final String url = "/accounts/{account_id}/acquisition";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AccountAcquisition.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Update an account's acquisition data
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/update_account_acquisition">update_account_acquisition api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param body The body of the request.
     * @return An account's updated acquisition data.
   */
  public AccountAcquisition updateAccountAcquisition(String accountId, AccountAcquisitionUpdatable body) {
    final String url = "/accounts/{account_id}/acquisition";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AccountAcquisition.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * Remove an account's acquisition data
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/remove_account_acquisition">remove_account_acquisition api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   */
  public void removeAccountAcquisition(String accountId) {
    final String url = "/accounts/{account_id}/acquisition";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }

  /**
   * Reactivate an inactive account
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/reactivate_account">reactivate_account api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
     * @return An account.
   */
  public Account reactivateAccount(String accountId) {
    final String url = "/accounts/{account_id}/reactivate";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Account.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * Fetch an account's balance and past due status
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_account_balance">get_account_balance api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
     * @return An account's balance.
   */
  public AccountBalance getAccountBalance(String accountId) {
    final String url = "/accounts/{account_id}/balance";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AccountBalance.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Fetch an account's billing information
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_billing_info">get_billing_info api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
     * @return An account's billing information.
   */
  public BillingInfo getBillingInfo(String accountId) {
    final String url = "/accounts/{account_id}/billing_info";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = BillingInfo.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Set an account's billing information
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/update_billing_info">update_billing_info api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param body The body of the request.
     * @return Updated billing information.
   */
  public BillingInfo updateBillingInfo(String accountId, BillingInfoCreate body) {
    final String url = "/accounts/{account_id}/billing_info";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = BillingInfo.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * Remove an account's billing information
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/remove_billing_info">remove_billing_info api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   */
  public void removeBillingInfo(String accountId) {
    final String url = "/accounts/{account_id}/billing_info";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }

  /**
   * Show the coupon redemptions for an account
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_account_coupon_redemptions">list_account_coupon_redemptions api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the the coupon redemptions on an account.
   */
  public Pager<CouponRedemption> listAccountCouponRedemptions(String accountId, QueryParams queryParams) {
    final String url = "/accounts/{account_id}/coupon_redemptions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, CouponRedemption.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Show the coupon redemption that is active on an account
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_active_coupon_redemption">get_active_coupon_redemption api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
     * @return An active coupon redemption on an account.
   */
  public CouponRedemption getActiveCouponRedemption(String accountId) {
    final String url = "/accounts/{account_id}/coupon_redemptions/active";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = CouponRedemption.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Generate an active coupon redemption on an account
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/create_coupon_redemption">create_coupon_redemption api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param body The body of the request.
     * @return Returns the new coupon redemption.
   */
  public CouponRedemption createCouponRedemption(String accountId, CouponRedemptionCreate body) {
    final String url = "/accounts/{account_id}/coupon_redemptions/active";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = CouponRedemption.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * Delete the active coupon redemption from an account
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/remove_coupon_redemption">remove_coupon_redemption api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
     * @return Coupon redemption deleted.
   */
  public CouponRedemption removeCouponRedemption(String accountId) {
    final String url = "/accounts/{account_id}/coupon_redemptions/active";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = CouponRedemption.class;
    return this.makeRequest("DELETE", path, returnType);
  }

  /**
   * List an account's credit payments
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_account_credit_payments">list_account_credit_payments api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the account's credit payments.
   */
  public Pager<CreditPayment> listAccountCreditPayments(String accountId, QueryParams queryParams) {
    final String url = "/accounts/{account_id}/credit_payments";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, CreditPayment.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * List an account's invoices
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_account_invoices">list_account_invoices api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the account's invoices.
   */
  public Pager<Invoice> listAccountInvoices(String accountId, QueryParams queryParams) {
    final String url = "/accounts/{account_id}/invoices";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Invoice.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Create an invoice for pending line items
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/create_invoice">create_invoice api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param body The body of the request.
     * @return Returns the new invoices.
   */
  public InvoiceCollection createInvoice(String accountId, InvoiceCreate body) {
    final String url = "/accounts/{account_id}/invoices";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = InvoiceCollection.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * Preview new invoice for pending line items
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/preview_invoice">preview_invoice api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param body The body of the request.
     * @return Returns the invoice previews.
   */
  public InvoiceCollection previewInvoice(String accountId, InvoiceCreate body) {
    final String url = "/accounts/{account_id}/invoices/preview";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = InvoiceCollection.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * List an account's line items
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_account_line_items">list_account_line_items api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the account's line items.
   */
  public Pager<LineItem> listAccountLineItems(String accountId, QueryParams queryParams) {
    final String url = "/accounts/{account_id}/line_items";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, LineItem.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Create a new line item for the account
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/create_line_item">create_line_item api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param body The body of the request.
     * @return Returns the new line item.
   */
  public LineItem createLineItem(String accountId, LineItemCreate body) {
    final String url = "/accounts/{account_id}/line_items";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = LineItem.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * Fetch a list of an account's notes
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_account_notes">list_account_notes api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of an account's notes.
   */
  public Pager<AccountNote> listAccountNotes(String accountId, QueryParams queryParams) {
    final String url = "/accounts/{account_id}/notes";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, AccountNote.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Fetch an account note
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_account_note">get_account_note api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param accountNoteId Account Note ID.
     * @return An account note.
   */
  public AccountNote getAccountNote(String accountId, String accountNoteId) {
    final String url = "/accounts/{account_id}/notes/{account_note_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    urlParams.put("account_note_id", accountNoteId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AccountNote.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Fetch a list of an account's shipping addresses
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_shipping_addresses">list_shipping_addresses api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of an account's shipping addresses.
   */
  public Pager<ShippingAddress> listShippingAddresses(String accountId, QueryParams queryParams) {
    final String url = "/accounts/{account_id}/shipping_addresses";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, ShippingAddress.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Create a new shipping address for the account
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/create_shipping_address">create_shipping_address api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param body The body of the request.
     * @return Returns the new shipping address.
   */
  public ShippingAddress createShippingAddress(String accountId, ShippingAddressCreate body) {
    final String url = "/accounts/{account_id}/shipping_addresses";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = ShippingAddress.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * Fetch an account's shipping address
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_shipping_address">get_shipping_address api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param shippingAddressId Shipping Address ID.
     * @return A shipping address.
   */
  public ShippingAddress getShippingAddress(String accountId, String shippingAddressId) {
    final String url = "/accounts/{account_id}/shipping_addresses/{shipping_address_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    urlParams.put("shipping_address_id", shippingAddressId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = ShippingAddress.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Update an account's shipping address
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/update_shipping_address">update_shipping_address api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param shippingAddressId Shipping Address ID.
   * @param body The body of the request.
     * @return The updated shipping address.
   */
  public ShippingAddress updateShippingAddress(String accountId, String shippingAddressId, ShippingAddressUpdate body) {
    final String url = "/accounts/{account_id}/shipping_addresses/{shipping_address_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    urlParams.put("shipping_address_id", shippingAddressId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = ShippingAddress.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * Remove an account's shipping address
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/remove_shipping_address">remove_shipping_address api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param shippingAddressId Shipping Address ID.
   */
  public void removeShippingAddress(String accountId, String shippingAddressId) {
    final String url = "/accounts/{account_id}/shipping_addresses/{shipping_address_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    urlParams.put("shipping_address_id", shippingAddressId);
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }

  /**
   * List an account's subscriptions
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_account_subscriptions">list_account_subscriptions api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the account's subscriptions.
   */
  public Pager<Subscription> listAccountSubscriptions(String accountId, QueryParams queryParams) {
    final String url = "/accounts/{account_id}/subscriptions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Subscription.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * List an account's transactions
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_account_transactions">list_account_transactions api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the account's transactions.
   */
  public Pager<Transaction> listAccountTransactions(String accountId, QueryParams queryParams) {
    final String url = "/accounts/{account_id}/transactions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Transaction.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * List an account's child accounts
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_child_accounts">list_child_accounts api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of an account's child accounts.
   */
  public Pager<Account> listChildAccounts(String accountId, QueryParams queryParams) {
    final String url = "/accounts/{account_id}/accounts";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Account.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * List a site's account acquisition data
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_account_acquisition">list_account_acquisition api documentation</a>
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the site's account acquisition data.
   */
  public Pager<AccountAcquisition> listAccountAcquisition(QueryParams queryParams) {
    final String url = "/acquisitions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, AccountAcquisition.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * List a site's coupons
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_coupons">list_coupons api documentation</a>
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the site's coupons.
   */
  public Pager<Coupon> listCoupons(QueryParams queryParams) {
    final String url = "/coupons";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Coupon.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Create a new coupon
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/create_coupon">create_coupon api documentation</a>
   * @param body The body of the request.
     * @return A new coupon.
   */
  public Coupon createCoupon(CouponCreate body) {
    final String url = "/coupons";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Coupon.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * Fetch a coupon
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_coupon">get_coupon api documentation</a>
   * @param couponId Coupon ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-10off`.
     * @return A coupon.
   */
  public Coupon getCoupon(String couponId) {
    final String url = "/coupons/{coupon_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("coupon_id", couponId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Coupon.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Update an active coupon
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/update_coupon">update_coupon api documentation</a>
   * @param couponId Coupon ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-10off`.
   * @param body The body of the request.
     * @return The updated coupon.
   */
  public Coupon updateCoupon(String couponId, CouponUpdate body) {
    final String url = "/coupons/{coupon_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("coupon_id", couponId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Coupon.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * Expire a coupon
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/deactivate_coupon">deactivate_coupon api documentation</a>
   * @param couponId Coupon ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-10off`.
     * @return The expired Coupon
   */
  public Coupon deactivateCoupon(String couponId) {
    final String url = "/coupons/{coupon_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("coupon_id", couponId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Coupon.class;
    return this.makeRequest("DELETE", path, returnType);
  }

  /**
   * List unique coupon codes associated with a bulk coupon
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_unique_coupon_codes">list_unique_coupon_codes api documentation</a>
   * @param couponId Coupon ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-10off`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of unique coupon codes that were generated
   */
  public Pager<UniqueCouponCode> listUniqueCouponCodes(String couponId, QueryParams queryParams) {
    final String url = "/coupons/{coupon_id}/unique_coupon_codes";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("coupon_id", couponId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, UniqueCouponCode.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * List a site's credit payments
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_credit_payments">list_credit_payments api documentation</a>
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the site's credit payments.
   */
  public Pager<CreditPayment> listCreditPayments(QueryParams queryParams) {
    final String url = "/credit_payments";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, CreditPayment.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Fetch a credit payment
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_credit_payment">get_credit_payment api documentation</a>
   * @param creditPaymentId Credit Payment ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
     * @return A credit payment.
   */
  public CreditPayment getCreditPayment(String creditPaymentId) {
    final String url = "/credit_payments/{credit_payment_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("credit_payment_id", creditPaymentId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = CreditPayment.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * List a site's custom field definitions
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_custom_field_definitions">list_custom_field_definitions api documentation</a>
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the site's custom field definitions.
   */
  public Pager<CustomFieldDefinition> listCustomFieldDefinitions(QueryParams queryParams) {
    final String url = "/custom_field_definitions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, CustomFieldDefinition.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Fetch an custom field definition
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_custom_field_definition">get_custom_field_definition api documentation</a>
   * @param customFieldDefinitionId Custom Field Definition ID
     * @return An custom field definition.
   */
  public CustomFieldDefinition getCustomFieldDefinition(String customFieldDefinitionId) {
    final String url = "/custom_field_definitions/{custom_field_definition_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("custom_field_definition_id", customFieldDefinitionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = CustomFieldDefinition.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * List a site's items
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_items">list_items api documentation</a>
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the site's items.
   */
  public Pager<Item> listItems(QueryParams queryParams) {
    final String url = "/items";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Item.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Create a new item
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/create_item">create_item api documentation</a>
   * @param body The body of the request.
     * @return A new item.
   */
  public Item createItem(ItemCreate body) {
    final String url = "/items";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Item.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * Fetch an item
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_item">get_item api documentation</a>
   * @param itemId Item ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-red`.
     * @return An item.
   */
  public Item getItem(String itemId) {
    final String url = "/items/{item_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("item_id", itemId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Item.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Update an active item
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/update_item">update_item api documentation</a>
   * @param itemId Item ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-red`.
   * @param body The body of the request.
     * @return The updated item.
   */
  public Item updateItem(String itemId, ItemUpdate body) {
    final String url = "/items/{item_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("item_id", itemId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Item.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * Deactivate an item
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/deactivate_item">deactivate_item api documentation</a>
   * @param itemId Item ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-red`.
     * @return An item.
   */
  public Item deactivateItem(String itemId) {
    final String url = "/items/{item_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("item_id", itemId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Item.class;
    return this.makeRequest("DELETE", path, returnType);
  }

  /**
   * Reactivate an inactive item
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/reactivate_item">reactivate_item api documentation</a>
   * @param itemId Item ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-red`.
     * @return An item.
   */
  public Item reactivateItem(String itemId) {
    final String url = "/items/{item_id}/reactivate";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("item_id", itemId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Item.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * List a site's invoices
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_invoices">list_invoices api documentation</a>
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the site's invoices.
   */
  public Pager<Invoice> listInvoices(QueryParams queryParams) {
    final String url = "/invoices";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Invoice.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Fetch an invoice
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_invoice">get_invoice api documentation</a>
   * @param invoiceId Invoice ID or number. For ID no prefix is used e.g. `e28zov4fw0v2`. For number use prefix `number-`, e.g. `number-1000`.
     * @return An invoice.
   */
  public Invoice getInvoice(String invoiceId) {
    final String url = "/invoices/{invoice_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Update an invoice
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/put_invoice">put_invoice api documentation</a>
   * @param invoiceId Invoice ID or number. For ID no prefix is used e.g. `e28zov4fw0v2`. For number use prefix `number-`, e.g. `number-1000`.
   * @param body The body of the request.
     * @return An invoice.
   */
  public Invoice putInvoice(String invoiceId, InvoiceUpdatable body) {
    final String url = "/invoices/{invoice_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * Fetch an invoice as a PDF
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_invoice_pdf">get_invoice_pdf api documentation</a>
   * @param invoiceId Invoice ID or number. For ID no prefix is used e.g. `e28zov4fw0v2`. For number use prefix `number-`, e.g. `number-1000`.
     * @return An invoice as a PDF.
   */
  public BinaryFile getInvoicePdf(String invoiceId) {
    final String url = "/invoices/{invoice_id}.pdf";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = BinaryFile.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Collect a pending or past due, automatic invoice
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/collect_invoice">collect_invoice api documentation</a>
   * @param invoiceId Invoice ID or number. For ID no prefix is used e.g. `e28zov4fw0v2`. For number use prefix `number-`, e.g. `number-1000`.
     * @return The updated invoice.
   */
  public Invoice collectInvoice(String invoiceId) {
    final String url = "/invoices/{invoice_id}/collect";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * Collect a pending or past due, automatic invoice
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/collect_invoice">collect_invoice api documentation</a>
   * @param invoiceId Invoice ID or number. For ID no prefix is used e.g. `e28zov4fw0v2`. For number use prefix `number-`, e.g. `number-1000`.
   * @param body The body of the request.
     * @return The updated invoice.
   */
  public Invoice collectInvoice(String invoiceId, InvoiceCollect body) {
    final String url = "/invoices/{invoice_id}/collect";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * Mark an open invoice as failed
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/fail_invoice">fail_invoice api documentation</a>
   * @param invoiceId Invoice ID or number. For ID no prefix is used e.g. `e28zov4fw0v2`. For number use prefix `number-`, e.g. `number-1000`.
     * @return The updated invoice.
   */
  public Invoice failInvoice(String invoiceId) {
    final String url = "/invoices/{invoice_id}/mark_failed";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * Mark an open invoice as successful
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/mark_invoice_successful">mark_invoice_successful api documentation</a>
   * @param invoiceId Invoice ID or number. For ID no prefix is used e.g. `e28zov4fw0v2`. For number use prefix `number-`, e.g. `number-1000`.
     * @return The updated invoice.
   */
  public Invoice markInvoiceSuccessful(String invoiceId) {
    final String url = "/invoices/{invoice_id}/mark_successful";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * Reopen a closed, manual invoice
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/reopen_invoice">reopen_invoice api documentation</a>
   * @param invoiceId Invoice ID or number. For ID no prefix is used e.g. `e28zov4fw0v2`. For number use prefix `number-`, e.g. `number-1000`.
     * @return The updated invoice.
   */
  public Invoice reopenInvoice(String invoiceId) {
    final String url = "/invoices/{invoice_id}/reopen";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * Void a credit invoice.
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/void_invoice">void_invoice api documentation</a>
   * @param invoiceId Invoice ID or number. For ID no prefix is used e.g. `e28zov4fw0v2`. For number use prefix `number-`, e.g. `number-1000`.
     * @return The updated invoice.
   */
  public Invoice voidInvoice(String invoiceId) {
    final String url = "/invoices/{invoice_id}/void";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * Record an external payment for a manual invoices.
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/record_external_transaction">record_external_transaction api documentation</a>
   * @param invoiceId Invoice ID or number. For ID no prefix is used e.g. `e28zov4fw0v2`. For number use prefix `number-`, e.g. `number-1000`.
   * @param body The body of the request.
     * @return The recorded transaction.
   */
  public Transaction recordExternalTransaction(String invoiceId, ExternalTransaction body) {
    final String url = "/invoices/{invoice_id}/transactions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Transaction.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * List an invoice's line items
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_invoice_line_items">list_invoice_line_items api documentation</a>
   * @param invoiceId Invoice ID or number. For ID no prefix is used e.g. `e28zov4fw0v2`. For number use prefix `number-`, e.g. `number-1000`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the invoice's line items.
   */
  public Pager<LineItem> listInvoiceLineItems(String invoiceId, QueryParams queryParams) {
    final String url = "/invoices/{invoice_id}/line_items";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, LineItem.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Show the coupon redemptions applied to an invoice
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_invoice_coupon_redemptions">list_invoice_coupon_redemptions api documentation</a>
   * @param invoiceId Invoice ID or number. For ID no prefix is used e.g. `e28zov4fw0v2`. For number use prefix `number-`, e.g. `number-1000`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the the coupon redemptions associated with the invoice.
   */
  public Pager<CouponRedemption> listInvoiceCouponRedemptions(String invoiceId, QueryParams queryParams) {
    final String url = "/invoices/{invoice_id}/coupon_redemptions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, CouponRedemption.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * List an invoice's related credit or charge invoices
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_related_invoices">list_related_invoices api documentation</a>
   * @param invoiceId Invoice ID or number. For ID no prefix is used e.g. `e28zov4fw0v2`. For number use prefix `number-`, e.g. `number-1000`.
     * @return A list of the credit or charge invoices associated with the invoice.
   */
  public Pager<Invoice> listRelatedInvoices(String invoiceId) {
    final String url = "/invoices/{invoice_id}/related_invoices";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Invoice.class).getType();
    return new Pager<>(path, null, this, parameterizedType);
  }

  /**
   * Refund an invoice
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/refund_invoice">refund_invoice api documentation</a>
   * @param invoiceId Invoice ID or number. For ID no prefix is used e.g. `e28zov4fw0v2`. For number use prefix `number-`, e.g. `number-1000`.
   * @param body The body of the request.
     * @return Returns the new credit invoice.
   */
  public Invoice refundInvoice(String invoiceId, InvoiceRefund body) {
    final String url = "/invoices/{invoice_id}/refund";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * List a site's line items
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_line_items">list_line_items api documentation</a>
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the site's line items.
   */
  public Pager<LineItem> listLineItems(QueryParams queryParams) {
    final String url = "/line_items";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, LineItem.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Fetch a line item
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_line_item">get_line_item api documentation</a>
   * @param lineItemId Line Item ID.
     * @return A line item.
   */
  public LineItem getLineItem(String lineItemId) {
    final String url = "/line_items/{line_item_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("line_item_id", lineItemId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = LineItem.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Delete an uninvoiced line item
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/remove_line_item">remove_line_item api documentation</a>
   * @param lineItemId Line Item ID.
   */
  public void removeLineItem(String lineItemId) {
    final String url = "/line_items/{line_item_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("line_item_id", lineItemId);
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }

  /**
   * List a site's plans
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_plans">list_plans api documentation</a>
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of plans.
   */
  public Pager<Plan> listPlans(QueryParams queryParams) {
    final String url = "/plans";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Plan.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Create a plan
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/create_plan">create_plan api documentation</a>
   * @param body The body of the request.
     * @return A plan.
   */
  public Plan createPlan(PlanCreate body) {
    final String url = "/plans";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Plan.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * Fetch a plan
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_plan">get_plan api documentation</a>
   * @param planId Plan ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-gold`.
     * @return A plan.
   */
  public Plan getPlan(String planId) {
    final String url = "/plans/{plan_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Plan.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Update a plan
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/update_plan">update_plan api documentation</a>
   * @param planId Plan ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-gold`.
   * @param body The body of the request.
     * @return A plan.
   */
  public Plan updatePlan(String planId, PlanUpdate body) {
    final String url = "/plans/{plan_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Plan.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * Remove a plan
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/remove_plan">remove_plan api documentation</a>
   * @param planId Plan ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-gold`.
     * @return Plan deleted
   */
  public Plan removePlan(String planId) {
    final String url = "/plans/{plan_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Plan.class;
    return this.makeRequest("DELETE", path, returnType);
  }

  /**
   * List a plan's add-ons
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_plan_add_ons">list_plan_add_ons api documentation</a>
   * @param planId Plan ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-gold`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of add-ons.
   */
  public Pager<AddOn> listPlanAddOns(String planId, QueryParams queryParams) {
    final String url = "/plans/{plan_id}/add_ons";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, AddOn.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Create an add-on
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/create_plan_add_on">create_plan_add_on api documentation</a>
   * @param planId Plan ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-gold`.
   * @param body The body of the request.
     * @return An add-on.
   */
  public AddOn createPlanAddOn(String planId, AddOnCreate body) {
    final String url = "/plans/{plan_id}/add_ons";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AddOn.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * Fetch a plan's add-on
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_plan_add_on">get_plan_add_on api documentation</a>
   * @param planId Plan ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-gold`.
   * @param addOnId Add-on ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-gold`.
     * @return An add-on.
   */
  public AddOn getPlanAddOn(String planId, String addOnId) {
    final String url = "/plans/{plan_id}/add_ons/{add_on_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    urlParams.put("add_on_id", addOnId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AddOn.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Update an add-on
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/update_plan_add_on">update_plan_add_on api documentation</a>
   * @param planId Plan ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-gold`.
   * @param addOnId Add-on ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-gold`.
   * @param body The body of the request.
     * @return An add-on.
   */
  public AddOn updatePlanAddOn(String planId, String addOnId, AddOnUpdate body) {
    final String url = "/plans/{plan_id}/add_ons/{add_on_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    urlParams.put("add_on_id", addOnId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AddOn.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * Remove an add-on
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/remove_plan_add_on">remove_plan_add_on api documentation</a>
   * @param planId Plan ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-gold`.
   * @param addOnId Add-on ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-gold`.
     * @return Add-on deleted
   */
  public AddOn removePlanAddOn(String planId, String addOnId) {
    final String url = "/plans/{plan_id}/add_ons/{add_on_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    urlParams.put("add_on_id", addOnId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AddOn.class;
    return this.makeRequest("DELETE", path, returnType);
  }

  /**
   * List a site's add-ons
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_add_ons">list_add_ons api documentation</a>
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of add-ons.
   */
  public Pager<AddOn> listAddOns(QueryParams queryParams) {
    final String url = "/add_ons";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, AddOn.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Fetch an add-on
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_add_on">get_add_on api documentation</a>
   * @param addOnId Add-on ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-gold`.
     * @return An add-on.
   */
  public AddOn getAddOn(String addOnId) {
    final String url = "/add_ons/{add_on_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("add_on_id", addOnId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AddOn.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * List a site's shipping methods
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_shipping_methods">list_shipping_methods api documentation</a>
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the site's shipping methods.
   */
  public Pager<ShippingMethod> listShippingMethods(QueryParams queryParams) {
    final String url = "/shipping_methods";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, ShippingMethod.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Fetch a shipping method
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_shipping_method">get_shipping_method api documentation</a>
   * @param id Shipping Method ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-usps_2-day`.
     * @return A shipping_method.
   */
  public ShippingMethod getShippingMethod(String id) {
    final String url = "/shipping_methods/{id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("id", id);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = ShippingMethod.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * List a site's subscriptions
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_subscriptions">list_subscriptions api documentation</a>
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the site's subscriptions.
   */
  public Pager<Subscription> listSubscriptions(QueryParams queryParams) {
    final String url = "/subscriptions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Subscription.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Create a new subscription
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/create_subscription">create_subscription api documentation</a>
   * @param body The body of the request.
     * @return A subscription.
   */
  public Subscription createSubscription(SubscriptionCreate body) {
    final String url = "/subscriptions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * Fetch a subscription
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_subscription">get_subscription api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
     * @return A subscription.
   */
  public Subscription getSubscription(String subscriptionId) {
    final String url = "/subscriptions/{subscription_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Modify a subscription
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/modify_subscription">modify_subscription api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
   * @param body The body of the request.
     * @return A subscription.
   */
  public Subscription modifySubscription(String subscriptionId, SubscriptionUpdate body) {
    final String url = "/subscriptions/{subscription_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * Terminate a subscription
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/terminate_subscription">terminate_subscription api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return An expired subscription.
   */
  public Subscription terminateSubscription(String subscriptionId, QueryParams queryParams) {
    final String url = "/subscriptions/{subscription_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("DELETE", path, paramsMap, returnType);
  }

  /**
   * Cancel a subscription
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/cancel_subscription">cancel_subscription api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
     * @return A canceled or failed subscription.
   */
  public Subscription cancelSubscription(String subscriptionId) {
    final String url = "/subscriptions/{subscription_id}/cancel";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * Cancel a subscription
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/cancel_subscription">cancel_subscription api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
   * @param body The body of the request.
     * @return A canceled or failed subscription.
   */
  public Subscription cancelSubscription(String subscriptionId, SubscriptionCancel body) {
    final String url = "/subscriptions/{subscription_id}/cancel";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * Reactivate a canceled subscription
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/reactivate_subscription">reactivate_subscription api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
     * @return An active subscription.
   */
  public Subscription reactivateSubscription(String subscriptionId) {
    final String url = "/subscriptions/{subscription_id}/reactivate";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * Pause subscription
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/pause_subscription">pause_subscription api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
   * @param body The body of the request.
     * @return A subscription.
   */
  public Subscription pauseSubscription(String subscriptionId, SubscriptionPause body) {
    final String url = "/subscriptions/{subscription_id}/pause";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * Resume subscription
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/resume_subscription">resume_subscription api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
     * @return A subscription.
   */
  public Subscription resumeSubscription(String subscriptionId) {
    final String url = "/subscriptions/{subscription_id}/resume";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * Convert trial subscription
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/convert_trial">convert_trial api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
     * @return A subscription.
   */
  public Subscription convertTrial(String subscriptionId) {
    final String url = "/subscriptions/{subscription_id}/convert_trial";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * Fetch a subscription's pending change
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_subscription_change">get_subscription_change api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
     * @return A subscription's pending change.
   */
  public SubscriptionChange getSubscriptionChange(String subscriptionId) {
    final String url = "/subscriptions/{subscription_id}/change";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = SubscriptionChange.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Create a new subscription change
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/create_subscription_change">create_subscription_change api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
   * @param body The body of the request.
     * @return A subscription change.
   */
  public SubscriptionChange createSubscriptionChange(String subscriptionId, SubscriptionChangeCreate body) {
    final String url = "/subscriptions/{subscription_id}/change";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = SubscriptionChange.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * Delete the pending subscription change
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/remove_subscription_change">remove_subscription_change api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
   */
  public void removeSubscriptionChange(String subscriptionId) {
    final String url = "/subscriptions/{subscription_id}/change";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }

  /**
   * List a subscription's invoices
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_subscription_invoices">list_subscription_invoices api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the subscription's invoices.
   */
  public Pager<Invoice> listSubscriptionInvoices(String subscriptionId, QueryParams queryParams) {
    final String url = "/subscriptions/{subscription_id}/invoices";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Invoice.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * List a subscription's line items
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_subscription_line_items">list_subscription_line_items api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the subscription's line items.
   */
  public Pager<LineItem> listSubscriptionLineItems(String subscriptionId, QueryParams queryParams) {
    final String url = "/subscriptions/{subscription_id}/line_items";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, LineItem.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Show the coupon redemptions for a subscription
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_subscription_coupon_redemptions">list_subscription_coupon_redemptions api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the the coupon redemptions on a subscription.
   */
  public Pager<CouponRedemption> listSubscriptionCouponRedemptions(String subscriptionId, QueryParams queryParams) {
    final String url = "/subscriptions/{subscription_id}/coupon_redemptions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, CouponRedemption.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * List a site's transactions
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/list_transactions">list_transactions api documentation</a>
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the site's transactions.
   */
  public Pager<Transaction> listTransactions(QueryParams queryParams) {
    final String url = "/transactions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Transaction.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Fetch a transaction
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_transaction">get_transaction api documentation</a>
   * @param transactionId Transaction ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
     * @return A transaction.
   */
  public Transaction getTransaction(String transactionId) {
    final String url = "/transactions/{transaction_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("transaction_id", transactionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Transaction.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Fetch a unique coupon code
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/get_unique_coupon_code">get_unique_coupon_code api documentation</a>
   * @param uniqueCouponCodeId Unique Coupon Code ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-abc-8dh2-def`.
     * @return A unique coupon code.
   */
  public UniqueCouponCode getUniqueCouponCode(String uniqueCouponCodeId) {
    final String url = "/unique_coupon_codes/{unique_coupon_code_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("unique_coupon_code_id", uniqueCouponCodeId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = UniqueCouponCode.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Deactivate a unique coupon code
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/deactivate_unique_coupon_code">deactivate_unique_coupon_code api documentation</a>
   * @param uniqueCouponCodeId Unique Coupon Code ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-abc-8dh2-def`.
     * @return A unique coupon code.
   */
  public UniqueCouponCode deactivateUniqueCouponCode(String uniqueCouponCodeId) {
    final String url = "/unique_coupon_codes/{unique_coupon_code_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("unique_coupon_code_id", uniqueCouponCodeId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = UniqueCouponCode.class;
    return this.makeRequest("DELETE", path, returnType);
  }

  /**
   * Restore a unique coupon code
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/reactivate_unique_coupon_code">reactivate_unique_coupon_code api documentation</a>
   * @param uniqueCouponCodeId Unique Coupon Code ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-abc-8dh2-def`.
     * @return A unique coupon code.
   */
  public UniqueCouponCode reactivateUniqueCouponCode(String uniqueCouponCodeId) {
    final String url = "/unique_coupon_codes/{unique_coupon_code_id}/restore";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("unique_coupon_code_id", uniqueCouponCodeId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = UniqueCouponCode.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * Create a new purchase
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/create_purchase">create_purchase api documentation</a>
   * @param body The body of the request.
     * @return Returns the new invoices
   */
  public InvoiceCollection createPurchase(PurchaseCreate body) {
    final String url = "/purchases";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = InvoiceCollection.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * Preview a new purchase
   *
   * @see <a href="https://developers.recurly.com/api/v2019-10-10#operation/preview_purchase">preview_purchase api documentation</a>
   * @param body The body of the request.
     * @return Returns preview of the new invoices
   */
  public InvoiceCollection previewPurchase(PurchaseCreate body) {
    final String url = "/purchases/preview";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = InvoiceCollection.class;
    return this.makeRequest("POST", path, body, returnType);
  }
}
