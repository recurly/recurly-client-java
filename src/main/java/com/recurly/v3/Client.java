package com.recurly.v3;

import com.google.gson.reflect.TypeToken;
import com.recurly.v3.requests.*;
import com.recurly.v3.resources.*;
import okhttp3.OkHttpClient;
import org.joda.time.DateTime;

import java.lang.reflect.Type;
import java.util.HashMap;

public class Client extends BaseClient {
  public static final String API_VERSION = "v2018-08-09";

  public Client(final String siteId, final String apiKey) {
    super(siteId, apiKey);
  }

  Client(final String siteId, final String apiKey, final OkHttpClient client) {
    super(siteId, apiKey, client);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_sites">list_sites api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *
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
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_site">get_site api documentation</a>
   */
  public Site getSite() {
    final String url = "/sites/{site_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Site.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_accounts">list_accounts api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *   - "subscriber"
   *   - "past_due"
   *
   */
  public Pager<Account> listAccounts(QueryParams queryParams) {
    final String url = "/sites/{site_id}/accounts";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Account.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_account">create_account api documentation</a>
   */
  public Account createAccount(AccountCreate body) {
    final String url = "/sites/{site_id}/accounts";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Account.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_account">get_account api documentation</a>
   */
  public Account getAccount(String accountId) {
    final String url = "/sites/{site_id}/accounts/{account_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Account.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_account">update_account api documentation</a>
   */
  public Account updateAccount(String accountId, AccountUpdate body) {
    final String url = "/sites/{site_id}/accounts/{account_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Account.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/deactivate_account">deactivate_account api documentation</a>
   */
  public Account deactivateAccount(String accountId) {
    final String url = "/sites/{site_id}/accounts/{account_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Account.class;
    return this.makeRequest("DELETE", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_account_acquisition">get_account_acquisition api documentation</a>
   */
  public AccountAcquisition getAccountAcquisition(String accountId) {
    final String url = "/sites/{site_id}/accounts/{account_id}/acquisition";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AccountAcquisition.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_account_acquisition">update_account_acquisition api documentation</a>
   */
  public AccountAcquisition updateAccountAcquisition(String accountId, AccountAcquisitionUpdatable body) {
    final String url = "/sites/{site_id}/accounts/{account_id}/acquisition";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AccountAcquisition.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_account_acquisition">remove_account_acquisition api documentation</a>
   */
  public void removeAccountAcquisition(String accountId) {
    final String url = "/sites/{site_id}/accounts/{account_id}/acquisition";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/reactivate_account">reactivate_account api documentation</a>
   */
  public Account reactivateAccount(String accountId) {
    final String url = "/sites/{site_id}/accounts/{account_id}/reactivate";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Account.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_account_balance">get_account_balance api documentation</a>
   */
  public AccountBalance getAccountBalance(String accountId) {
    final String url = "/sites/{site_id}/accounts/{account_id}/balance";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AccountBalance.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_billing_info">get_billing_info api documentation</a>
   */
  public BillingInfo getBillingInfo(String accountId) {
    final String url = "/sites/{site_id}/accounts/{account_id}/billing_info";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = BillingInfo.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_billing_info">update_billing_info api documentation</a>
   */
  public BillingInfo updateBillingInfo(String accountId, BillingInfoCreate body) {
    final String url = "/sites/{site_id}/accounts/{account_id}/billing_info";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = BillingInfo.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_billing_info">remove_billing_info api documentation</a>
   */
  public void removeBillingInfo(String accountId) {
    final String url = "/sites/{site_id}/accounts/{account_id}/billing_info";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_coupon_redemptions">list_account_coupon_redemptions api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *
   */
  public Pager<CouponRedemption> listAccountCouponRedemptions(String accountId, QueryParams queryParams) {
    final String url = "/sites/{site_id}/accounts/{account_id}/coupon_redemptions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, CouponRedemption.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_active_coupon_redemption">get_active_coupon_redemption api documentation</a>
   */
  public CouponRedemption getActiveCouponRedemption(String accountId) {
    final String url = "/sites/{site_id}/accounts/{account_id}/coupon_redemptions/active";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = CouponRedemption.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_coupon_redemption">create_coupon_redemption api documentation</a>
   */
  public CouponRedemption createCouponRedemption(String accountId, CouponRedemptionCreate body) {
    final String url = "/sites/{site_id}/accounts/{account_id}/coupon_redemptions/active";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = CouponRedemption.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_coupon_redemption">remove_coupon_redemption api documentation</a>
   */
  public CouponRedemption removeCouponRedemption(String accountId) {
    final String url = "/sites/{site_id}/accounts/{account_id}/coupon_redemptions/active";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = CouponRedemption.class;
    return this.makeRequest("DELETE", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_credit_payments">list_account_credit_payments api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *
   */
  public Pager<CreditPayment> listAccountCreditPayments(String accountId, QueryParams queryParams) {
    final String url = "/sites/{site_id}/accounts/{account_id}/credit_payments";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, CreditPayment.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_invoices">list_account_invoices api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *   - "type"
   *
   */
  public Pager<Invoice> listAccountInvoices(String accountId, QueryParams queryParams) {
    final String url = "/sites/{site_id}/accounts/{account_id}/invoices";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Invoice.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_invoice">create_invoice api documentation</a>
   */
  public InvoiceCollection createInvoice(String accountId, InvoiceCreate body) {
    final String url = "/sites/{site_id}/accounts/{account_id}/invoices";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = InvoiceCollection.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/preview_invoice">preview_invoice api documentation</a>
   */
  public InvoiceCollection previewInvoice(String accountId, InvoiceCreate body) {
    final String url = "/sites/{site_id}/accounts/{account_id}/invoices/preview";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = InvoiceCollection.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_line_items">list_account_line_items api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *   - "original"
   *   - "state"
   *   - "type"
   *
   */
  public Pager<LineItem> listAccountLineItems(String accountId, QueryParams queryParams) {
    final String url = "/sites/{site_id}/accounts/{account_id}/line_items";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, LineItem.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_line_item">create_line_item api documentation</a>
   */
  public LineItem createLineItem(String accountId, LineItemCreate body) {
    final String url = "/sites/{site_id}/accounts/{account_id}/line_items";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = LineItem.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_notes">list_account_notes api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *
   */
  public Pager<AccountNote> listAccountNotes(String accountId, QueryParams queryParams) {
    final String url = "/sites/{site_id}/accounts/{account_id}/notes";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, AccountNote.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_account_note">get_account_note api documentation</a>
   */
  public AccountNote getAccountNote(String accountId, String accountNoteId) {
    final String url = "/sites/{site_id}/accounts/{account_id}/notes/{account_note_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    urlParams.put("account_note_id", accountNoteId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AccountNote.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_shipping_addresses">list_shipping_addresses api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *
   */
  public Pager<ShippingAddress> listShippingAddresses(String accountId, QueryParams queryParams) {
    final String url = "/sites/{site_id}/accounts/{account_id}/shipping_addresses";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, ShippingAddress.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_shipping_address">create_shipping_address api documentation</a>
   */
  public ShippingAddress createShippingAddress(String accountId, ShippingAddressCreate body) {
    final String url = "/sites/{site_id}/accounts/{account_id}/shipping_addresses";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = ShippingAddress.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_shipping_address">get_shipping_address api documentation</a>
   */
  public ShippingAddress getShippingAddress(String accountId, String shippingAddressId) {
    final String url = "/sites/{site_id}/accounts/{account_id}/shipping_addresses/{shipping_address_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    urlParams.put("shipping_address_id", shippingAddressId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = ShippingAddress.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_shipping_address">update_shipping_address api documentation</a>
   */
  public ShippingAddress updateShippingAddress(String accountId, String shippingAddressId, ShippingAddressUpdate body) {
    final String url = "/sites/{site_id}/accounts/{account_id}/shipping_addresses/{shipping_address_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    urlParams.put("shipping_address_id", shippingAddressId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = ShippingAddress.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_shipping_address">remove_shipping_address api documentation</a>
   */
  public void removeShippingAddress(String accountId, String shippingAddressId) {
    final String url = "/sites/{site_id}/accounts/{account_id}/shipping_addresses/{shipping_address_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    urlParams.put("shipping_address_id", shippingAddressId);
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_subscriptions">list_account_subscriptions api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *   - "state"
   *
   */
  public Pager<Subscription> listAccountSubscriptions(String accountId, QueryParams queryParams) {
    final String url = "/sites/{site_id}/accounts/{account_id}/subscriptions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Subscription.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_transactions">list_account_transactions api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *   - "type"
   *   - "success"
   *
   */
  public Pager<Transaction> listAccountTransactions(String accountId, QueryParams queryParams) {
    final String url = "/sites/{site_id}/accounts/{account_id}/transactions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Transaction.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_child_accounts">list_child_accounts api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *   - "subscriber"
   *   - "past_due"
   *
   */
  public Pager<Account> listChildAccounts(String accountId, QueryParams queryParams) {
    final String url = "/sites/{site_id}/accounts/{account_id}/accounts";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Account.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_acquisition">list_account_acquisition api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *
   */
  public Pager<AccountAcquisition> listAccountAcquisition(QueryParams queryParams) {
    final String url = "/sites/{site_id}/acquisitions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, AccountAcquisition.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_coupons">list_coupons api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *
   */
  public Pager<Coupon> listCoupons(QueryParams queryParams) {
    final String url = "/sites/{site_id}/coupons";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Coupon.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_coupon">create_coupon api documentation</a>
   */
  public Coupon createCoupon(CouponCreate body) {
    final String url = "/sites/{site_id}/coupons";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Coupon.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_coupon">get_coupon api documentation</a>
   */
  public Coupon getCoupon(String couponId) {
    final String url = "/sites/{site_id}/coupons/{coupon_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("coupon_id", couponId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Coupon.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_coupon">update_coupon api documentation</a>
   */
  public Coupon updateCoupon(String couponId, CouponUpdate body) {
    final String url = "/sites/{site_id}/coupons/{coupon_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("coupon_id", couponId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Coupon.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_unique_coupon_codes">list_unique_coupon_codes api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *
   */
  public Pager<UniqueCouponCode> listUniqueCouponCodes(String couponId, QueryParams queryParams) {
    final String url = "/sites/{site_id}/coupons/{coupon_id}/unique_coupon_codes";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("coupon_id", couponId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, UniqueCouponCode.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_credit_payments">list_credit_payments api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *
   */
  public Pager<CreditPayment> listCreditPayments(QueryParams queryParams) {
    final String url = "/sites/{site_id}/credit_payments";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, CreditPayment.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_credit_payment">get_credit_payment api documentation</a>
   */
  public CreditPayment getCreditPayment(String creditPaymentId) {
    final String url = "/sites/{site_id}/credit_payments/{credit_payment_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("credit_payment_id", creditPaymentId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = CreditPayment.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_custom_field_definitions">list_custom_field_definitions api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *
   */
  public Pager<CustomFieldDefinition> listCustomFieldDefinitions(QueryParams queryParams) {
    final String url = "/sites/{site_id}/custom_field_definitions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, CustomFieldDefinition.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_custom_field_definition">get_custom_field_definition api documentation</a>
   */
  public CustomFieldDefinition getCustomFieldDefinition(String customFieldDefinitionId) {
    final String url = "/sites/{site_id}/custom_field_definitions/{custom_field_definition_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("custom_field_definition_id", customFieldDefinitionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = CustomFieldDefinition.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_invoices">list_invoices api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *   - "type"
   *
   */
  public Pager<Invoice> listInvoices(QueryParams queryParams) {
    final String url = "/sites/{site_id}/invoices";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Invoice.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_invoice">get_invoice api documentation</a>
   */
  public Invoice getInvoice(String invoiceId) {
    final String url = "/sites/{site_id}/invoices/{invoice_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/put_invoice">put_invoice api documentation</a>
   */
  public Invoice putInvoice(String invoiceId, InvoiceUpdatable body) {
    final String url = "/sites/{site_id}/invoices/{invoice_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/collect_invoice">collect_invoice api documentation</a>
   */
  public Invoice collectInvoice(String invoiceId) {
    final String url = "/sites/{site_id}/invoices/{invoice_id}/collect";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/fail_invoice">fail_invoice api documentation</a>
   */
  public Invoice failInvoice(String invoiceId) {
    final String url = "/sites/{site_id}/invoices/{invoice_id}/mark_failed";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/mark_invoice_successful">mark_invoice_successful api documentation</a>
   */
  public Invoice markInvoiceSuccessful(String invoiceId) {
    final String url = "/sites/{site_id}/invoices/{invoice_id}/mark_successful";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/reopen_invoice">reopen_invoice api documentation</a>
   */
  public Invoice reopenInvoice(String invoiceId) {
    final String url = "/sites/{site_id}/invoices/{invoice_id}/reopen";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_invoice_line_items">list_invoice_line_items api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *   - "original"
   *   - "state"
   *   - "type"
   *
   */
  public Pager<LineItem> listInvoiceLineItems(String invoiceId, QueryParams queryParams) {
    final String url = "/sites/{site_id}/invoices/{invoice_id}/line_items";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, LineItem.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_invoice_coupon_redemptions">list_invoice_coupon_redemptions api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *
   */
  public Pager<CouponRedemption> listInvoiceCouponRedemptions(String invoiceId, QueryParams queryParams) {
    final String url = "/sites/{site_id}/invoices/{invoice_id}/coupon_redemptions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, CouponRedemption.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_related_invoices">list_related_invoices api documentation</a>
   */
  public Pager<Invoice> listRelatedInvoices(String invoiceId) {
    final String url = "/sites/{site_id}/invoices/{invoice_id}/related_invoices";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Invoice.class).getType();
    return new Pager<>(path, null, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/refund_invoice">refund_invoice api documentation</a>
   */
  public Invoice refundInvoice(String invoiceId, InvoiceRefund body) {
    final String url = "/sites/{site_id}/invoices/{invoice_id}/refund";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_line_items">list_line_items api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *   - "original"
   *   - "state"
   *   - "type"
   *
   */
  public Pager<LineItem> listLineItems(QueryParams queryParams) {
    final String url = "/sites/{site_id}/line_items";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, LineItem.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_line_item">get_line_item api documentation</a>
   */
  public LineItem getLineItem(String lineItemId) {
    final String url = "/sites/{site_id}/line_items/{line_item_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("line_item_id", lineItemId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = LineItem.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_line_item">remove_line_item api documentation</a>
   */
  public void removeLineItem(String lineItemId) {
    final String url = "/sites/{site_id}/line_items/{line_item_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("line_item_id", lineItemId);
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_plans">list_plans api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *   - "state"
   *
   */
  public Pager<Plan> listPlans(QueryParams queryParams) {
    final String url = "/sites/{site_id}/plans";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Plan.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_plan">create_plan api documentation</a>
   */
  public Plan createPlan(PlanCreate body) {
    final String url = "/sites/{site_id}/plans";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Plan.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_plan">get_plan api documentation</a>
   */
  public Plan getPlan(String planId) {
    final String url = "/sites/{site_id}/plans/{plan_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Plan.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_plan">update_plan api documentation</a>
   */
  public Plan updatePlan(String planId, PlanUpdate body) {
    final String url = "/sites/{site_id}/plans/{plan_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Plan.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_plan">remove_plan api documentation</a>
   */
  public Plan removePlan(String planId) {
    final String url = "/sites/{site_id}/plans/{plan_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Plan.class;
    return this.makeRequest("DELETE", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_plan_add_ons">list_plan_add_ons api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *   - "state"
   *
   */
  public Pager<AddOn> listPlanAddOns(String planId, QueryParams queryParams) {
    final String url = "/sites/{site_id}/plans/{plan_id}/add_ons";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, AddOn.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_plan_add_on">create_plan_add_on api documentation</a>
   */
  public AddOn createPlanAddOn(String planId, AddOnCreate body) {
    final String url = "/sites/{site_id}/plans/{plan_id}/add_ons";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AddOn.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_plan_add_on">get_plan_add_on api documentation</a>
   */
  public AddOn getPlanAddOn(String planId, String addOnId) {
    final String url = "/sites/{site_id}/plans/{plan_id}/add_ons/{add_on_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    urlParams.put("add_on_id", addOnId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AddOn.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_plan_add_on">update_plan_add_on api documentation</a>
   */
  public AddOn updatePlanAddOn(String planId, String addOnId, AddOnUpdate body) {
    final String url = "/sites/{site_id}/plans/{plan_id}/add_ons/{add_on_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    urlParams.put("add_on_id", addOnId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AddOn.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_plan_add_on">remove_plan_add_on api documentation</a>
   */
  public AddOn removePlanAddOn(String planId, String addOnId) {
    final String url = "/sites/{site_id}/plans/{plan_id}/add_ons/{add_on_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    urlParams.put("add_on_id", addOnId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AddOn.class;
    return this.makeRequest("DELETE", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_add_ons">list_add_ons api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *   - "state"
   *
   */
  public Pager<AddOn> listAddOns(QueryParams queryParams) {
    final String url = "/sites/{site_id}/add_ons";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, AddOn.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_add_on">get_add_on api documentation</a>
   */
  public AddOn getAddOn(String addOnId) {
    final String url = "/sites/{site_id}/add_ons/{add_on_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("add_on_id", addOnId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AddOn.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_subscriptions">list_subscriptions api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *   - "state"
   *
   */
  public Pager<Subscription> listSubscriptions(QueryParams queryParams) {
    final String url = "/sites/{site_id}/subscriptions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Subscription.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_subscription">create_subscription api documentation</a>
   */
  public Subscription createSubscription(SubscriptionCreate body) {
    final String url = "/sites/{site_id}/subscriptions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_subscription">get_subscription api documentation</a>
   */
  public Subscription getSubscription(String subscriptionId) {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/modify_subscription">modify_subscription api documentation</a>
   */
  public Subscription modifySubscription(String subscriptionId, SubscriptionUpdate body) {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/terminate_subscription">terminate_subscription api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "refund"
   *
   */
  public Subscription terminateSubscription(String subscriptionId, QueryParams queryParams) {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("DELETE", path, paramsMap, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/cancel_subscription">cancel_subscription api documentation</a>
   */
  public Subscription cancelSubscription(String subscriptionId) {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/cancel";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/reactivate_subscription">reactivate_subscription api documentation</a>
   */
  public Subscription reactivateSubscription(String subscriptionId) {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/reactivate";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/pause_subscription">pause_subscription api documentation</a>
   */
  public Subscription pauseSubscription(String subscriptionId, SubscriptionPause body) {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/pause";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/resume_subscription">resume_subscription api documentation</a>
   */
  public Subscription resumeSubscription(String subscriptionId) {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/resume";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_subscription_change">get_subscription_change api documentation</a>
   */
  public SubscriptionChange getSubscriptionChange(String subscriptionId) {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/change";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = SubscriptionChange.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_subscription_change">create_subscription_change api documentation</a>
   */
  public SubscriptionChange createSubscriptionChange(String subscriptionId, SubscriptionChangeCreate body) {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/change";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = SubscriptionChange.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_subscription_change">remove_subscription_change api documentation</a>
   */
  public void removeSubscriptionChange(String subscriptionId) {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/change";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_subscription_invoices">list_subscription_invoices api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *   - "type"
   *
   */
  public Pager<Invoice> listSubscriptionInvoices(String subscriptionId, QueryParams queryParams) {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/invoices";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Invoice.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_subscription_line_items">list_subscription_line_items api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *   - "original"
   *   - "state"
   *   - "type"
   *
   */
  public Pager<LineItem> listSubscriptionLineItems(String subscriptionId, QueryParams queryParams) {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/line_items";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, LineItem.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_subscription_coupon_redemptions">list_subscription_coupon_redemptions api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *
   */
  public Pager<CouponRedemption> listSubscriptionCouponRedemptions(String subscriptionId, QueryParams queryParams) {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/coupon_redemptions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, CouponRedemption.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_transactions">list_transactions api documentation</a>
   *
   * The QueryParam options available for this method are:
   *   - "ids"
   *   - "limit"
   *   - "order"
   *   - "sort"
   *   - "begin_time"
   *   - "end_time"
   *   - "type"
   *   - "success"
   *
   */
  public Pager<Transaction> listTransactions(QueryParams queryParams) {
    final String url = "/sites/{site_id}/transactions";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Transaction.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_transaction">get_transaction api documentation</a>
   */
  public Transaction getTransaction(String transactionId) {
    final String url = "/sites/{site_id}/transactions/{transaction_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("transaction_id", transactionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Transaction.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_unique_coupon_code">get_unique_coupon_code api documentation</a>
   */
  public UniqueCouponCode getUniqueCouponCode(String uniqueCouponCodeId) {
    final String url = "/sites/{site_id}/unique_coupon_codes/{unique_coupon_code_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("unique_coupon_code_id", uniqueCouponCodeId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = UniqueCouponCode.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/deactivate_unique_coupon_code">deactivate_unique_coupon_code api documentation</a>
   */
  public UniqueCouponCode deactivateUniqueCouponCode(String uniqueCouponCodeId) {
    final String url = "/sites/{site_id}/unique_coupon_codes/{unique_coupon_code_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("unique_coupon_code_id", uniqueCouponCodeId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = UniqueCouponCode.class;
    return this.makeRequest("DELETE", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/reactivate_unique_coupon_code">reactivate_unique_coupon_code api documentation</a>
   */
  public UniqueCouponCode reactivateUniqueCouponCode(String uniqueCouponCodeId) {
    final String url = "/sites/{site_id}/unique_coupon_codes/{unique_coupon_code_id}/restore";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("unique_coupon_code_id", uniqueCouponCodeId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = UniqueCouponCode.class;
    return this.makeRequest("PUT", path, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_purchase">create_purchase api documentation</a>
   */
  public InvoiceCollection createPurchase(PurchaseCreate body) {
    final String url = "/sites/{site_id}/purchases";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = InvoiceCollection.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/preview_purchase">preview_purchase api documentation</a>
   */
  public InvoiceCollection previewPurchase(PurchaseCreate body) {
    final String url = "/sites/{site_id}/purchases/preview";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = InvoiceCollection.class;
    return this.makeRequest("POST", path, body, returnType);
  }
}
