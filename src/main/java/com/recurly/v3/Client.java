package com.recurly.v3;

import com.recurly.v3.BaseClient;
import com.recurly.v3.requests.*;
import com.recurly.v3.resources.*;

import com.google.gson.reflect.TypeToken;
import okhttp3.OkHttpClient;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.io.IOException;

import org.joda.time.DateTime;

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
   */
  public Pager<Site> listSites(String ids, Integer limit, String order, String sort) throws IOException {
    final String url = "/sites"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, Site.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_site">get_site api documentation</a>
   */
  public Site getSite() throws IOException {
    final String url = "/sites/{site_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Site.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_accounts">list_accounts api documentation</a>
   */
  public Pager<Account> listAccounts(String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime, String subscriber, String pastDue) throws IOException {
    final String url = "/sites/{site_id}/accounts"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    queryParams.put("subscriber", subscriber);
    queryParams.put("past_due", pastDue);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, Account.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_account">create_account api documentation</a>
   */
  public Account createAccount(AccountCreate body) throws IOException {
    final String url = "/sites/{site_id}/accounts"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Account.class;
    return this.makeRequest("POST", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_account">get_account api documentation</a>
   */
  public Account getAccount(String accountId) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Account.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_account">update_account api documentation</a>
   */
  public Account updateAccount(String accountId, AccountUpdate body) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Account.class;
    return this.makeRequest("PUT", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/deactivate_account">deactivate_account api documentation</a>
   */
  public Account deactivateAccount(String accountId) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Account.class;
    return this.makeRequest("DELETE", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_account_acquisition">get_account_acquisition api documentation</a>
   */
  public AccountAcquisition getAccountAcquisition(String accountId) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/acquisition"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AccountAcquisition.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_account_acquisition">update_account_acquisition api documentation</a>
   */
  public AccountAcquisition updateAccountAcquisition(String accountId, AccountAcquisitionUpdatable body) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/acquisition"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AccountAcquisition.class;
    return this.makeRequest("PUT", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_account_acquisition">remove_account_acquisition api documentation</a>
   */
  public void removeAccountAcquisition(String accountId) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/acquisition"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/reactivate_account">reactivate_account api documentation</a>
   */
  public Account reactivateAccount(String accountId) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/reactivate"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Account.class;
    return this.makeRequest("PUT", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_account_balance">get_account_balance api documentation</a>
   */
  public AccountBalance getAccountBalance(String accountId) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/balance"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AccountBalance.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_billing_info">get_billing_info api documentation</a>
   */
  public BillingInfo getBillingInfo(String accountId) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/billing_info"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = BillingInfo.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_billing_info">update_billing_info api documentation</a>
   */
  public BillingInfo updateBillingInfo(String accountId, BillingInfoCreate body) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/billing_info"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = BillingInfo.class;
    return this.makeRequest("PUT", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_billing_info">remove_billing_info api documentation</a>
   */
  public void removeBillingInfo(String accountId) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/billing_info"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_coupon_redemptions">list_account_coupon_redemptions api documentation</a>
   */
  public Pager<CouponRedemption> listAccountCouponRedemptions(String accountId, String ids, String sort, DateTime beginTime, DateTime endTime) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/coupon_redemptions"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, CouponRedemption.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_active_coupon_redemption">get_active_coupon_redemption api documentation</a>
   */
  public CouponRedemption getActiveCouponRedemption(String accountId) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/coupon_redemptions/active"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = CouponRedemption.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_coupon_redemption">create_coupon_redemption api documentation</a>
   */
  public CouponRedemption createCouponRedemption(String accountId, CouponRedemptionCreate body) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/coupon_redemptions/active"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = CouponRedemption.class;
    return this.makeRequest("POST", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_coupon_redemption">remove_coupon_redemption api documentation</a>
   */
  public CouponRedemption removeCouponRedemption(String accountId) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/coupon_redemptions/active"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = CouponRedemption.class;
    return this.makeRequest("DELETE", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_credit_payments">list_account_credit_payments api documentation</a>
   */
  public Pager<CreditPayment> listAccountCreditPayments(String accountId, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/credit_payments"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, CreditPayment.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_invoices">list_account_invoices api documentation</a>
   */
  public Pager<Invoice> listAccountInvoices(String accountId, String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime, String type) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/invoices"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    queryParams.put("type", type);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, Invoice.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_invoice">create_invoice api documentation</a>
   */
  public InvoiceCollection createInvoice(String accountId, InvoiceCreate body) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/invoices"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = InvoiceCollection.class;
    return this.makeRequest("POST", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/preview_invoice">preview_invoice api documentation</a>
   */
  public InvoiceCollection previewInvoice(String accountId, InvoiceCreate body) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/invoices/preview"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = InvoiceCollection.class;
    return this.makeRequest("POST", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_line_items">list_account_line_items api documentation</a>
   */
  public Pager<LineItem> listAccountLineItems(String accountId, String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime, String original, String state, String type) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/line_items"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    queryParams.put("original", original);
    queryParams.put("state", state);
    queryParams.put("type", type);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, LineItem.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_line_item">create_line_item api documentation</a>
   */
  public LineItem createLineItem(String accountId, LineItemCreate body) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/line_items"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = LineItem.class;
    return this.makeRequest("POST", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_notes">list_account_notes api documentation</a>
   */
  public Pager<AccountNote> listAccountNotes(String accountId, String ids) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/notes"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, AccountNote.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_account_note">get_account_note api documentation</a>
   */
  public AccountNote getAccountNote(String accountId, String accountNoteId) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/notes/{account_note_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    urlParams.put("account_note_id", accountNoteId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AccountNote.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_shipping_addresses">list_shipping_addresses api documentation</a>
   */
  public Pager<ShippingAddress> listShippingAddresses(String accountId, String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/shipping_addresses"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, ShippingAddress.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_shipping_address">create_shipping_address api documentation</a>
   */
  public ShippingAddress createShippingAddress(String accountId, ShippingAddressCreate body) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/shipping_addresses"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = ShippingAddress.class;
    return this.makeRequest("POST", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_shipping_address">get_shipping_address api documentation</a>
   */
  public ShippingAddress getShippingAddress(String accountId, String shippingAddressId) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/shipping_addresses/{shipping_address_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    urlParams.put("shipping_address_id", shippingAddressId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = ShippingAddress.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_shipping_address">update_shipping_address api documentation</a>
   */
  public ShippingAddress updateShippingAddress(String accountId, String shippingAddressId, ShippingAddressUpdate body) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/shipping_addresses/{shipping_address_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    urlParams.put("shipping_address_id", shippingAddressId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = ShippingAddress.class;
    return this.makeRequest("PUT", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_shipping_address">remove_shipping_address api documentation</a>
   */
  public void removeShippingAddress(String accountId, String shippingAddressId) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/shipping_addresses/{shipping_address_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    urlParams.put("shipping_address_id", shippingAddressId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_subscriptions">list_account_subscriptions api documentation</a>
   */
  public Pager<Subscription> listAccountSubscriptions(String accountId, String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime, String state) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/subscriptions"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    queryParams.put("state", state);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, Subscription.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_transactions">list_account_transactions api documentation</a>
   */
  public Pager<Transaction> listAccountTransactions(String accountId, String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime, String type, String success) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/transactions"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    queryParams.put("type", type);
    queryParams.put("success", success);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, Transaction.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_child_accounts">list_child_accounts api documentation</a>
   */
  public Pager<Account> listChildAccounts(String accountId, String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime, String subscriber, String pastDue) throws IOException {
    final String url = "/sites/{site_id}/accounts/{account_id}/accounts"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    queryParams.put("subscriber", subscriber);
    queryParams.put("past_due", pastDue);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, Account.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_acquisition">list_account_acquisition api documentation</a>
   */
  public Pager<AccountAcquisition> listAccountAcquisition(String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime) throws IOException {
    final String url = "/sites/{site_id}/acquisitions"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, AccountAcquisition.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_coupons">list_coupons api documentation</a>
   */
  public Pager<Coupon> listCoupons(String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime) throws IOException {
    final String url = "/sites/{site_id}/coupons"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, Coupon.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_coupon">create_coupon api documentation</a>
   */
  public Coupon createCoupon(CouponCreate body) throws IOException {
    final String url = "/sites/{site_id}/coupons"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Coupon.class;
    return this.makeRequest("POST", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_coupon">get_coupon api documentation</a>
   */
  public Coupon getCoupon(String couponId) throws IOException {
    final String url = "/sites/{site_id}/coupons/{coupon_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("coupon_id", couponId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Coupon.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_coupon">update_coupon api documentation</a>
   */
  public Coupon updateCoupon(String couponId, CouponUpdate body) throws IOException {
    final String url = "/sites/{site_id}/coupons/{coupon_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("coupon_id", couponId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Coupon.class;
    return this.makeRequest("PUT", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_unique_coupon_codes">list_unique_coupon_codes api documentation</a>
   */
  public Pager<UniqueCouponCode> listUniqueCouponCodes(String couponId, String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime) throws IOException {
    final String url = "/sites/{site_id}/coupons/{coupon_id}/unique_coupon_codes"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("coupon_id", couponId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, UniqueCouponCode.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_credit_payments">list_credit_payments api documentation</a>
   */
  public Pager<CreditPayment> listCreditPayments(Integer limit, String order, String sort, DateTime beginTime, DateTime endTime) throws IOException {
    final String url = "/sites/{site_id}/credit_payments"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, CreditPayment.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_credit_payment">get_credit_payment api documentation</a>
   */
  public CreditPayment getCreditPayment(String creditPaymentId) throws IOException {
    final String url = "/sites/{site_id}/credit_payments/{credit_payment_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("credit_payment_id", creditPaymentId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = CreditPayment.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_custom_field_definitions">list_custom_field_definitions api documentation</a>
   */
  public Pager<CustomFieldDefinition> listCustomFieldDefinitions(String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime) throws IOException {
    final String url = "/sites/{site_id}/custom_field_definitions"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, CustomFieldDefinition.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_custom_field_definition">get_custom_field_definition api documentation</a>
   */
  public CustomFieldDefinition getCustomFieldDefinition(String customFieldDefinitionId) throws IOException {
    final String url = "/sites/{site_id}/custom_field_definitions/{custom_field_definition_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("custom_field_definition_id", customFieldDefinitionId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = CustomFieldDefinition.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_invoices">list_invoices api documentation</a>
   */
  public Pager<Invoice> listInvoices(String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime, String type) throws IOException {
    final String url = "/sites/{site_id}/invoices"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    queryParams.put("type", type);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, Invoice.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_invoice">get_invoice api documentation</a>
   */
  public Invoice getInvoice(String invoiceId) throws IOException {
    final String url = "/sites/{site_id}/invoices/{invoice_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/put_invoice">put_invoice api documentation</a>
   */
  public Invoice putInvoice(String invoiceId, InvoiceUpdatable body) throws IOException {
    final String url = "/sites/{site_id}/invoices/{invoice_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("PUT", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/collect_invoice">collect_invoice api documentation</a>
   */
  public Invoice collectInvoice(String invoiceId) throws IOException {
    final String url = "/sites/{site_id}/invoices/{invoice_id}/collect"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("PUT", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/fail_invoice">fail_invoice api documentation</a>
   */
  public Invoice failInvoice(String invoiceId) throws IOException {
    final String url = "/sites/{site_id}/invoices/{invoice_id}/mark_failed"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("PUT", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/mark_invoice_successful">mark_invoice_successful api documentation</a>
   */
  public Invoice markInvoiceSuccessful(String invoiceId) throws IOException {
    final String url = "/sites/{site_id}/invoices/{invoice_id}/mark_successful"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("PUT", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/reopen_invoice">reopen_invoice api documentation</a>
   */
  public Invoice reopenInvoice(String invoiceId) throws IOException {
    final String url = "/sites/{site_id}/invoices/{invoice_id}/reopen"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("PUT", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_invoice_line_items">list_invoice_line_items api documentation</a>
   */
  public Pager<LineItem> listInvoiceLineItems(String invoiceId, String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime, String original, String state, String type) throws IOException {
    final String url = "/sites/{site_id}/invoices/{invoice_id}/line_items"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    queryParams.put("original", original);
    queryParams.put("state", state);
    queryParams.put("type", type);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, LineItem.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_invoice_coupon_redemptions">list_invoice_coupon_redemptions api documentation</a>
   */
  public Pager<CouponRedemption> listInvoiceCouponRedemptions(String invoiceId, String ids, String sort, DateTime beginTime, DateTime endTime) throws IOException {
    final String url = "/sites/{site_id}/invoices/{invoice_id}/coupon_redemptions"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, CouponRedemption.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_related_invoices">list_related_invoices api documentation</a>
   */
  public Pager<Invoice> listRelatedInvoices(String invoiceId) throws IOException {
    final String url = "/sites/{site_id}/invoices/{invoice_id}/related_invoices"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, Invoice.class).getType();
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/refund_invoice">refund_invoice api documentation</a>
   */
  public Invoice refundInvoice(String invoiceId, InvoiceRefund body) throws IOException {
    final String url = "/sites/{site_id}/invoices/{invoice_id}/refund"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_id", invoiceId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Invoice.class;
    return this.makeRequest("POST", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_line_items">list_line_items api documentation</a>
   */
  public Pager<LineItem> listLineItems(String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime, String original, String state, String type) throws IOException {
    final String url = "/sites/{site_id}/line_items"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    queryParams.put("original", original);
    queryParams.put("state", state);
    queryParams.put("type", type);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, LineItem.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_line_item">get_line_item api documentation</a>
   */
  public LineItem getLineItem(String lineItemId) throws IOException {
    final String url = "/sites/{site_id}/line_items/{line_item_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("line_item_id", lineItemId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = LineItem.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_line_item">remove_line_item api documentation</a>
   */
  public void removeLineItem(String lineItemId) throws IOException {
    final String url = "/sites/{site_id}/line_items/{line_item_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("line_item_id", lineItemId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_plans">list_plans api documentation</a>
   */
  public Pager<Plan> listPlans(String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime, String state) throws IOException {
    final String url = "/sites/{site_id}/plans"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    queryParams.put("state", state);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, Plan.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_plan">create_plan api documentation</a>
   */
  public Plan createPlan(PlanCreate body) throws IOException {
    final String url = "/sites/{site_id}/plans"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Plan.class;
    return this.makeRequest("POST", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_plan">get_plan api documentation</a>
   */
  public Plan getPlan(String planId) throws IOException {
    final String url = "/sites/{site_id}/plans/{plan_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Plan.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_plan">update_plan api documentation</a>
   */
  public Plan updatePlan(String planId, PlanUpdate body) throws IOException {
    final String url = "/sites/{site_id}/plans/{plan_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Plan.class;
    return this.makeRequest("PUT", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_plan">remove_plan api documentation</a>
   */
  public Plan removePlan(String planId) throws IOException {
    final String url = "/sites/{site_id}/plans/{plan_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Plan.class;
    return this.makeRequest("DELETE", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_plan_add_ons">list_plan_add_ons api documentation</a>
   */
  public Pager<AddOn> listPlanAddOns(String planId, String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime, String state) throws IOException {
    final String url = "/sites/{site_id}/plans/{plan_id}/add_ons"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    queryParams.put("state", state);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, AddOn.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_plan_add_on">create_plan_add_on api documentation</a>
   */
  public AddOn createPlanAddOn(String planId, AddOnCreate body) throws IOException {
    final String url = "/sites/{site_id}/plans/{plan_id}/add_ons"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AddOn.class;
    return this.makeRequest("POST", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_plan_add_on">get_plan_add_on api documentation</a>
   */
  public AddOn getPlanAddOn(String planId, String addOnId) throws IOException {
    final String url = "/sites/{site_id}/plans/{plan_id}/add_ons/{add_on_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    urlParams.put("add_on_id", addOnId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AddOn.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_plan_add_on">update_plan_add_on api documentation</a>
   */
  public AddOn updatePlanAddOn(String planId, String addOnId, AddOnUpdate body) throws IOException {
    final String url = "/sites/{site_id}/plans/{plan_id}/add_ons/{add_on_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    urlParams.put("add_on_id", addOnId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AddOn.class;
    return this.makeRequest("PUT", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_plan_add_on">remove_plan_add_on api documentation</a>
   */
  public AddOn removePlanAddOn(String planId, String addOnId) throws IOException {
    final String url = "/sites/{site_id}/plans/{plan_id}/add_ons/{add_on_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("plan_id", planId);
    urlParams.put("add_on_id", addOnId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AddOn.class;
    return this.makeRequest("DELETE", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_add_ons">list_add_ons api documentation</a>
   */
  public Pager<AddOn> listAddOns(String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime, String state) throws IOException {
    final String url = "/sites/{site_id}/add_ons"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    queryParams.put("state", state);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, AddOn.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_add_on">get_add_on api documentation</a>
   */
  public AddOn getAddOn(String addOnId) throws IOException {
    final String url = "/sites/{site_id}/add_ons/{add_on_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("add_on_id", addOnId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = AddOn.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_subscriptions">list_subscriptions api documentation</a>
   */
  public Pager<Subscription> listSubscriptions(String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime, String state) throws IOException {
    final String url = "/sites/{site_id}/subscriptions"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    queryParams.put("state", state);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, Subscription.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_subscription">create_subscription api documentation</a>
   */
  public Subscription createSubscription(SubscriptionCreate body) throws IOException {
    final String url = "/sites/{site_id}/subscriptions"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("POST", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_subscription">get_subscription api documentation</a>
   */
  public Subscription getSubscription(String subscriptionId) throws IOException {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/modify_subscription">modify_subscription api documentation</a>
   */
  public Subscription modifySubscription(String subscriptionId, SubscriptionUpdate body) throws IOException {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("PUT", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/terminate_subscription">terminate_subscription api documentation</a>
   */
  public Subscription terminateSubscription(String subscriptionId, String refund) throws IOException {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("refund", refund);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("DELETE", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/cancel_subscription">cancel_subscription api documentation</a>
   */
  public Subscription cancelSubscription(String subscriptionId) throws IOException {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/cancel"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("PUT", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/reactivate_subscription">reactivate_subscription api documentation</a>
   */
  public Subscription reactivateSubscription(String subscriptionId) throws IOException {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/reactivate"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("PUT", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/pause_subscription">pause_subscription api documentation</a>
   */
  public Subscription pauseSubscription(String subscriptionId, SubscriptionPause body) throws IOException {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/pause"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("PUT", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/resume_subscription">resume_subscription api documentation</a>
   */
  public Subscription resumeSubscription(String subscriptionId) throws IOException {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/resume"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Subscription.class;
    return this.makeRequest("PUT", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_subscription_change">get_subscription_change api documentation</a>
   */
  public SubscriptionChange getSubscriptionChange(String subscriptionId) throws IOException {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/change"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = SubscriptionChange.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_subscription_change">create_subscription_change api documentation</a>
   */
  public SubscriptionChange createSubscriptionChange(String subscriptionId, SubscriptionChangeCreate body) throws IOException {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/change"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = SubscriptionChange.class;
    return this.makeRequest("POST", path, body, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_subscription_change">remove_subscription_change api documentation</a>
   */
  public void removeSubscriptionChange(String subscriptionId) throws IOException {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/change"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_subscription_invoices">list_subscription_invoices api documentation</a>
   */
  public Pager<Invoice> listSubscriptionInvoices(String subscriptionId, String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime, String type) throws IOException {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/invoices"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    queryParams.put("type", type);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, Invoice.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_subscription_line_items">list_subscription_line_items api documentation</a>
   */
  public Pager<LineItem> listSubscriptionLineItems(String subscriptionId, String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime, String original, String state, String type) throws IOException {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/line_items"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    queryParams.put("original", original);
    queryParams.put("state", state);
    queryParams.put("type", type);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, LineItem.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_subscription_coupon_redemptions">list_subscription_coupon_redemptions api documentation</a>
   */
  public Pager<CouponRedemption> listSubscriptionCouponRedemptions(String subscriptionId, String ids, String sort, DateTime beginTime, DateTime endTime) throws IOException {
    final String url = "/sites/{site_id}/subscriptions/{subscription_id}/coupon_redemptions"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, CouponRedemption.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_transactions">list_transactions api documentation</a>
   */
  public Pager<Transaction> listTransactions(String ids, Integer limit, String order, String sort, DateTime beginTime, DateTime endTime, String type, String success) throws IOException {
    final String url = "/sites/{site_id}/transactions"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("ids", ids);
    queryParams.put("limit", limit);
    queryParams.put("order", order);
    queryParams.put("sort", sort);
    queryParams.put("begin_time", beginTime);
    queryParams.put("end_time", endTime);
    queryParams.put("type", type);
    queryParams.put("success", success);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = TypeToken.getParameterized(Pager.class, Transaction.class).getType();
    return this.makeRequest("GET", path, queryParams, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_transaction">get_transaction api documentation</a>
   */
  public Transaction getTransaction(String transactionId) throws IOException {
    final String url = "/sites/{site_id}/transactions/{transaction_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("transaction_id", transactionId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Transaction.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_unique_coupon_code">get_unique_coupon_code api documentation</a>
   */
  public UniqueCouponCode getUniqueCouponCode(String uniqueCouponCodeId) throws IOException {
    final String url = "/sites/{site_id}/unique_coupon_codes/{unique_coupon_code_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("unique_coupon_code_id", uniqueCouponCodeId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = UniqueCouponCode.class;
    return this.makeRequest("GET", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/deactivate_unique_coupon_code">deactivate_unique_coupon_code api documentation</a>
   */
  public UniqueCouponCode deactivateUniqueCouponCode(String uniqueCouponCodeId) throws IOException {
    final String url = "/sites/{site_id}/unique_coupon_codes/{unique_coupon_code_id}"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("unique_coupon_code_id", uniqueCouponCodeId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = UniqueCouponCode.class;
    return this.makeRequest("DELETE", path, returnType);
  }
  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/reactivate_unique_coupon_code">reactivate_unique_coupon_code api documentation</a>
   */
  public UniqueCouponCode reactivateUniqueCouponCode(String uniqueCouponCodeId) throws IOException {
    final String url = "/sites/{site_id}/unique_coupon_codes/{unique_coupon_code_id}/restore"; 
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("unique_coupon_code_id", uniqueCouponCodeId);
    final HashMap<String, Object> queryParams = new HashMap<String, Object>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = UniqueCouponCode.class;
    return this.makeRequest("PUT", path, returnType);
  }
}
