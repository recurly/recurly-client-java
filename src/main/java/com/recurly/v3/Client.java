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
  public static final String API_VERSION = "v2021-02-25";

  public Client(final String apiKey) {
    super(apiKey);
  }

  public Client(final String apiKey, final ClientOptions clientOptions) {
    super(apiKey, clientOptions);
  }


  /**
   * List sites
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_sites">list_sites api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_site">get_site api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_accounts">list_accounts api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/create_account">create_account api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_account">get_account api documentation</a>
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
   * Update an account
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/update_account">update_account api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/deactivate_account">deactivate_account api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_account_acquisition">get_account_acquisition api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/update_account_acquisition">update_account_acquisition api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param body The body of the request.
     * @return An account's updated acquisition data.
   */
  public AccountAcquisition updateAccountAcquisition(String accountId, AccountAcquisitionUpdate body) {
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/remove_account_acquisition">remove_account_acquisition api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/reactivate_account">reactivate_account api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_account_balance">get_account_balance api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_billing_info">get_billing_info api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/update_billing_info">update_billing_info api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/remove_billing_info">remove_billing_info api documentation</a>
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
   * Verify an account's credit card billing information
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/verify_billing_info">verify_billing_info api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
     * @return Transaction information from verify.
   */
  public Transaction verifyBillingInfo(String accountId) {
    final String url = "/accounts/{account_id}/billing_info/verify";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Transaction.class;
    return this.makeRequest("POST", path, returnType);
  }

  /**
   * Verify an account's credit card billing information
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/verify_billing_info">verify_billing_info api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param body The body of the request.
     * @return Transaction information from verify.
   */
  public Transaction verifyBillingInfo(String accountId, BillingInfoVerify body) {
    final String url = "/accounts/{account_id}/billing_info/verify";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Transaction.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * Get the list of billing information associated with an account
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_billing_infos">list_billing_infos api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the the billing information for an account's
   */
  public Pager<BillingInfo> listBillingInfos(String accountId, QueryParams queryParams) {
    final String url = "/accounts/{account_id}/billing_infos";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, BillingInfo.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Add new billing information on an account
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/create_billing_info">create_billing_info api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param body The body of the request.
     * @return Updated billing information.
   */
  public BillingInfo createBillingInfo(String accountId, BillingInfoCreate body) {
    final String url = "/accounts/{account_id}/billing_infos";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = BillingInfo.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * Fetch a billing info
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_a_billing_info">get_a_billing_info api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param billingInfoId Billing Info ID. Can ONLY be used for sites utilizing the Wallet feature.
     * @return A billing info.
   */
  public BillingInfo getABillingInfo(String accountId, String billingInfoId) {
    final String url = "/accounts/{account_id}/billing_infos/{billing_info_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    urlParams.put("billing_info_id", billingInfoId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = BillingInfo.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Update an account's billing information
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/update_a_billing_info">update_a_billing_info api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param billingInfoId Billing Info ID. Can ONLY be used for sites utilizing the Wallet feature.
   * @param body The body of the request.
     * @return Updated billing information.
   */
  public BillingInfo updateABillingInfo(String accountId, String billingInfoId, BillingInfoCreate body) {
    final String url = "/accounts/{account_id}/billing_infos/{billing_info_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    urlParams.put("billing_info_id", billingInfoId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = BillingInfo.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * Remove an account's billing information
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/remove_a_billing_info">remove_a_billing_info api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param billingInfoId Billing Info ID. Can ONLY be used for sites utilizing the Wallet feature.
   */
  public void removeABillingInfo(String accountId, String billingInfoId) {
    final String url = "/accounts/{account_id}/billing_infos/{billing_info_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    urlParams.put("billing_info_id", billingInfoId);
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }

  /**
   * Show the coupon redemptions for an account
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_account_coupon_redemptions">list_account_coupon_redemptions api documentation</a>
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
   * Show the coupon redemptions that are active on an account
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_active_coupon_redemptions">list_active_coupon_redemptions api documentation</a>
   * @param accountId Account ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
     * @return Active coupon redemptions on an account.
   */
  public Pager<CouponRedemption> listActiveCouponRedemptions(String accountId) {
    final String url = "/accounts/{account_id}/coupon_redemptions/active";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("account_id", accountId);
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, CouponRedemption.class).getType();
    return new Pager<>(path, null, this, parameterizedType);
  }

  /**
   * Generate an active coupon redemption on an account or subscription
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/create_coupon_redemption">create_coupon_redemption api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/remove_coupon_redemption">remove_coupon_redemption api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_account_credit_payments">list_account_credit_payments api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_account_invoices">list_account_invoices api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/create_invoice">create_invoice api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/preview_invoice">preview_invoice api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_account_line_items">list_account_line_items api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/create_line_item">create_line_item api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_account_notes">list_account_notes api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_account_note">get_account_note api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_shipping_addresses">list_shipping_addresses api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/create_shipping_address">create_shipping_address api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_shipping_address">get_shipping_address api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/update_shipping_address">update_shipping_address api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/remove_shipping_address">remove_shipping_address api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_account_subscriptions">list_account_subscriptions api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_account_transactions">list_account_transactions api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_child_accounts">list_child_accounts api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_account_acquisition">list_account_acquisition api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_coupons">list_coupons api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/create_coupon">create_coupon api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_coupon">get_coupon api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/update_coupon">update_coupon api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/deactivate_coupon">deactivate_coupon api documentation</a>
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
   * Generate unique coupon codes
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/generate_unique_coupon_codes">generate_unique_coupon_codes api documentation</a>
   * @param couponId Coupon ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-10off`.
   * @param body The body of the request.
     * @return A set of parameters that can be passed to the `list_unique_coupon_codes`
endpoint to obtain only the newly generated `UniqueCouponCodes`.

   */
  public UniqueCouponCodeParams generateUniqueCouponCodes(String couponId, CouponBulkCreate body) {
    final String url = "/coupons/{coupon_id}/generate";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("coupon_id", couponId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = UniqueCouponCodeParams.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * Restore an inactive coupon
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/restore_coupon">restore_coupon api documentation</a>
   * @param couponId Coupon ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-10off`.
   * @param body The body of the request.
     * @return The restored coupon.
   */
  public Coupon restoreCoupon(String couponId, CouponUpdate body) {
    final String url = "/coupons/{coupon_id}/restore";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("coupon_id", couponId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Coupon.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * List unique coupon codes associated with a bulk coupon
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_unique_coupon_codes">list_unique_coupon_codes api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_credit_payments">list_credit_payments api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_credit_payment">get_credit_payment api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_custom_field_definitions">list_custom_field_definitions api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_custom_field_definition">get_custom_field_definition api documentation</a>
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
   * List an invoice template's associated accounts
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_invoice_template_accounts">list_invoice_template_accounts api documentation</a>
   * @param invoiceTemplateId Invoice template ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of an invoice template's associated accounts.
   */
  public Pager<Account> listInvoiceTemplateAccounts(String invoiceTemplateId, QueryParams queryParams) {
    final String url = "/invoice_templates/{invoice_template_id}/accounts";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_template_id", invoiceTemplateId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Account.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * List a site's items
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_items">list_items api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/create_item">create_item api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_item">get_item api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/update_item">update_item api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/deactivate_item">deactivate_item api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/reactivate_item">reactivate_item api documentation</a>
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
   * List a site's measured units
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_measured_unit">list_measured_unit api documentation</a>
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the site's measured units.
   */
  public Pager<MeasuredUnit> listMeasuredUnit(QueryParams queryParams) {
    final String url = "/measured_units";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, MeasuredUnit.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Create a new measured unit
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/create_measured_unit">create_measured_unit api documentation</a>
   * @param body The body of the request.
     * @return A new measured unit.
   */
  public MeasuredUnit createMeasuredUnit(MeasuredUnitCreate body) {
    final String url = "/measured_units";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = MeasuredUnit.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * Fetch a measured unit
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_measured_unit">get_measured_unit api documentation</a>
   * @param measuredUnitId Measured unit ID or name. For ID no prefix is used e.g. `e28zov4fw0v2`. For name use prefix `name-`, e.g. `name-Storage`.
     * @return An item.
   */
  public MeasuredUnit getMeasuredUnit(String measuredUnitId) {
    final String url = "/measured_units/{measured_unit_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("measured_unit_id", measuredUnitId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = MeasuredUnit.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Update a measured unit
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/update_measured_unit">update_measured_unit api documentation</a>
   * @param measuredUnitId Measured unit ID or name. For ID no prefix is used e.g. `e28zov4fw0v2`. For name use prefix `name-`, e.g. `name-Storage`.
   * @param body The body of the request.
     * @return The updated measured_unit.
   */
  public MeasuredUnit updateMeasuredUnit(String measuredUnitId, MeasuredUnitUpdate body) {
    final String url = "/measured_units/{measured_unit_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("measured_unit_id", measuredUnitId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = MeasuredUnit.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * Remove a measured unit
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/remove_measured_unit">remove_measured_unit api documentation</a>
   * @param measuredUnitId Measured unit ID or name. For ID no prefix is used e.g. `e28zov4fw0v2`. For name use prefix `name-`, e.g. `name-Storage`.
     * @return A measured unit.
   */
  public MeasuredUnit removeMeasuredUnit(String measuredUnitId) {
    final String url = "/measured_units/{measured_unit_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("measured_unit_id", measuredUnitId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = MeasuredUnit.class;
    return this.makeRequest("DELETE", path, returnType);
  }

  /**
   * List a site's invoices
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_invoices">list_invoices api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_invoice">get_invoice api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/update_invoice">update_invoice api documentation</a>
   * @param invoiceId Invoice ID or number. For ID no prefix is used e.g. `e28zov4fw0v2`. For number use prefix `number-`, e.g. `number-1000`.
   * @param body The body of the request.
     * @return An invoice.
   */
  public Invoice updateInvoice(String invoiceId, InvoiceUpdate body) {
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_invoice_pdf">get_invoice_pdf api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/collect_invoice">collect_invoice api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/collect_invoice">collect_invoice api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/mark_invoice_failed">mark_invoice_failed api documentation</a>
   * @param invoiceId Invoice ID or number. For ID no prefix is used e.g. `e28zov4fw0v2`. For number use prefix `number-`, e.g. `number-1000`.
     * @return The updated invoice.
   */
  public Invoice markInvoiceFailed(String invoiceId) {
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/mark_invoice_successful">mark_invoice_successful api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/reopen_invoice">reopen_invoice api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/void_invoice">void_invoice api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/record_external_transaction">record_external_transaction api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_invoice_line_items">list_invoice_line_items api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_invoice_coupon_redemptions">list_invoice_coupon_redemptions api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_related_invoices">list_related_invoices api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/refund_invoice">refund_invoice api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_line_items">list_line_items api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_line_item">get_line_item api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/remove_line_item">remove_line_item api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_plans">list_plans api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/create_plan">create_plan api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_plan">get_plan api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/update_plan">update_plan api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/remove_plan">remove_plan api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_plan_add_ons">list_plan_add_ons api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/create_plan_add_on">create_plan_add_on api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_plan_add_on">get_plan_add_on api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/update_plan_add_on">update_plan_add_on api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/remove_plan_add_on">remove_plan_add_on api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_add_ons">list_add_ons api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_add_on">get_add_on api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_shipping_methods">list_shipping_methods api documentation</a>
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
   * Create a new shipping method
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/create_shipping_method">create_shipping_method api documentation</a>
   * @param body The body of the request.
     * @return A new shipping method.
   */
  public ShippingMethod createShippingMethod(ShippingMethodCreate body) {
    final String url = "/shipping_methods";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = ShippingMethod.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * Fetch a shipping method
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_shipping_method">get_shipping_method api documentation</a>
   * @param shippingMethodId Shipping Method ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-usps_2-day`.
     * @return A shipping method.
   */
  public ShippingMethod getShippingMethod(String shippingMethodId) {
    final String url = "/shipping_methods/{shipping_method_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("shipping_method_id", shippingMethodId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = ShippingMethod.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Update an active Shipping Method
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/update_shipping_method">update_shipping_method api documentation</a>
   * @param shippingMethodId Shipping Method ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-usps_2-day`.
   * @param body The body of the request.
     * @return The updated shipping method.
   */
  public ShippingMethod updateShippingMethod(String shippingMethodId, ShippingMethodUpdate body) {
    final String url = "/shipping_methods/{shipping_method_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("shipping_method_id", shippingMethodId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = ShippingMethod.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * Deactivate a shipping method
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/deactivate_shipping_method">deactivate_shipping_method api documentation</a>
   * @param shippingMethodId Shipping Method ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-usps_2-day`.
     * @return A shipping method.
   */
  public ShippingMethod deactivateShippingMethod(String shippingMethodId) {
    final String url = "/shipping_methods/{shipping_method_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("shipping_method_id", shippingMethodId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = ShippingMethod.class;
    return this.makeRequest("DELETE", path, returnType);
  }

  /**
   * List a site's subscriptions
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_subscriptions">list_subscriptions api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/create_subscription">create_subscription api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_subscription">get_subscription api documentation</a>
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
   * Update a subscription
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/update_subscription">update_subscription api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
   * @param body The body of the request.
     * @return A subscription.
   */
  public Subscription updateSubscription(String subscriptionId, SubscriptionUpdate body) {
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/terminate_subscription">terminate_subscription api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/cancel_subscription">cancel_subscription api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/cancel_subscription">cancel_subscription api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/reactivate_subscription">reactivate_subscription api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/pause_subscription">pause_subscription api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/resume_subscription">resume_subscription api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/convert_trial">convert_trial api documentation</a>
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
   * Fetch a preview of a subscription's renewal invoice(s)
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_preview_renewal">get_preview_renewal api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
     * @return A preview of the subscription's renewal invoice(s).
   */
  public InvoiceCollection getPreviewRenewal(String subscriptionId) {
    final String url = "/subscriptions/{subscription_id}/preview_renewal";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = InvoiceCollection.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Fetch a subscription's pending change
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_subscription_change">get_subscription_change api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/create_subscription_change">create_subscription_change api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/remove_subscription_change">remove_subscription_change api documentation</a>
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
   * Preview a new subscription change
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/preview_subscription_change">preview_subscription_change api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
   * @param body The body of the request.
     * @return A subscription change.
   */
  public SubscriptionChange previewSubscriptionChange(String subscriptionId, SubscriptionChangeCreate body) {
    final String url = "/subscriptions/{subscription_id}/change/preview";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = SubscriptionChange.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * List a subscription's invoices
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_subscription_invoices">list_subscription_invoices api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_subscription_line_items">list_subscription_line_items api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_subscription_coupon_redemptions">list_subscription_coupon_redemptions api documentation</a>
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
   * List a subscription add-on's usage records
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_usage">list_usage api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
   * @param addOnId Add-on ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-gold`.
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the subscription add-on's usage records.
   */
  public Pager<Usage> listUsage(String subscriptionId, String addOnId, QueryParams queryParams) {
    final String url = "/subscriptions/{subscription_id}/add_ons/{add_on_id}/usage";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    urlParams.put("add_on_id", addOnId);
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, Usage.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Log a usage record on this subscription add-on
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/create_usage">create_usage api documentation</a>
   * @param subscriptionId Subscription ID or UUID. For ID no prefix is used e.g. `e28zov4fw0v2`. For UUID use prefix `uuid-`, e.g. `uuid-123457890`.
   * @param addOnId Add-on ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-gold`.
   * @param body The body of the request.
     * @return The created usage record.
   */
  public Usage createUsage(String subscriptionId, String addOnId, UsageCreate body) {
    final String url = "/subscriptions/{subscription_id}/add_ons/{add_on_id}/usage";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("subscription_id", subscriptionId);
    urlParams.put("add_on_id", addOnId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Usage.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * Get a usage record
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_usage">get_usage api documentation</a>
   * @param usageId Usage Record ID.
     * @return The usage record.
   */
  public Usage getUsage(String usageId) {
    final String url = "/usage/{usage_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("usage_id", usageId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Usage.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Update a usage record
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/update_usage">update_usage api documentation</a>
   * @param usageId Usage Record ID.
   * @param body The body of the request.
     * @return The updated usage record.
   */
  public Usage updateUsage(String usageId, UsageCreate body) {
    final String url = "/usage/{usage_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("usage_id", usageId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = Usage.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * Delete a usage record.
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/remove_usage">remove_usage api documentation</a>
   * @param usageId Usage Record ID.
   */
  public void removeUsage(String usageId) {
    final String url = "/usage/{usage_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("usage_id", usageId);
    final String path = this.interpolatePath(url, urlParams);
    this.makeRequest("DELETE", path);
  }

  /**
   * List a site's transactions
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_transactions">list_transactions api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_transaction">get_transaction api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_unique_coupon_code">get_unique_coupon_code api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/deactivate_unique_coupon_code">deactivate_unique_coupon_code api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/reactivate_unique_coupon_code">reactivate_unique_coupon_code api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/create_purchase">create_purchase api documentation</a>
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
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/preview_purchase">preview_purchase api documentation</a>
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

  /**
   * Create a pending purchase
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/create_pending_purchase">create_pending_purchase api documentation</a>
   * @param body The body of the request.
     * @return Returns the pending invoice
   */
  public InvoiceCollection createPendingPurchase(PurchaseCreate body) {
    final String url = "/purchases/pending";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = InvoiceCollection.class;
    return this.makeRequest("POST", path, body, returnType);
  }

  /**
   * List the dates that have an available export to download.
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_export_dates">get_export_dates api documentation</a>
     * @return Returns a list of dates.
   */
  public ExportDates getExportDates() {
    final String url = "/export_dates";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = ExportDates.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * List of the export files that are available to download.
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_export_files">get_export_files api documentation</a>
   * @param exportDate Date for which to get a list of available automated export files. Date must be in YYYY-MM-DD format.
     * @return Returns a list of export files to download.
   */
  public ExportFiles getExportFiles(String exportDate) {
    final String url = "/export_dates/{export_date}/export_files";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("export_date", exportDate);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = ExportFiles.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Show the dunning campaigns for a site
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_dunning_campaigns">list_dunning_campaigns api documentation</a>
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the the dunning_campaigns on an account.
   */
  public Pager<DunningCampaign> listDunningCampaigns(QueryParams queryParams) {
    final String url = "/dunning_campaigns";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, DunningCampaign.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Show the settings for a dunning campaign
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_dunning_campaign">get_dunning_campaign api documentation</a>
   * @param dunningCampaignId Dunning Campaign ID, e.g. `e28zov4fw0v2`.
     * @return Settings for a dunning campaign.
   */
  public DunningCampaign getDunningCampaign(String dunningCampaignId) {
    final String url = "/dunning_campaigns/{dunning_campaign_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("dunning_campaign_id", dunningCampaignId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = DunningCampaign.class;
    return this.makeRequest("GET", path, returnType);
  }

  /**
   * Assign a dunning campaign to multiple plans
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/put_dunning_campaign_bulk_update">put_dunning_campaign_bulk_update api documentation</a>
   * @param dunningCampaignId Dunning Campaign ID, e.g. `e28zov4fw0v2`.
   * @param body The body of the request.
     * @return A list of updated plans.
   */
  public DunningCampaignsBulkUpdateResponse putDunningCampaignBulkUpdate(String dunningCampaignId, DunningCampaignsBulkUpdate body) {
    final String url = "/dunning_campaigns/{dunning_campaign_id}/bulk_update";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("dunning_campaign_id", dunningCampaignId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = DunningCampaignsBulkUpdateResponse.class;
    return this.makeRequest("PUT", path, body, returnType);
  }

  /**
   * Show the invoice templates for a site
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/list_invoice_templates">list_invoice_templates api documentation</a>
   * @param queryParams The {@link QueryParams} for this endpoint.
     * @return A list of the the invoice templates on a site.
   */
  public Pager<InvoiceTemplate> listInvoiceTemplates(QueryParams queryParams) {
    final String url = "/invoice_templates";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    if (queryParams == null) queryParams = new QueryParams();
    final HashMap<String, Object> paramsMap = queryParams.getParams();
    final String path = this.interpolatePath(url, urlParams);
    Type parameterizedType = TypeToken.getParameterized(Pager.class, InvoiceTemplate.class).getType();
    return new Pager<>(path, paramsMap, this, parameterizedType);
  }

  /**
   * Show the settings for an invoice template
   *
   * @see <a href="https://developers.recurly.com/api/v2021-02-25#operation/get_invoice_template">get_invoice_template api documentation</a>
   * @param invoiceTemplateId Invoice template ID or code. For ID no prefix is used e.g. `e28zov4fw0v2`. For code use prefix `code-`, e.g. `code-bob`.
     * @return Settings for an invoice template.
   */
  public InvoiceTemplate getInvoiceTemplate(String invoiceTemplateId) {
    final String url = "/invoice_templates/{invoice_template_id}";
    final HashMap<String, String> urlParams = new HashMap<String, String>();
    urlParams.put("invoice_template_id", invoiceTemplateId);
    final String path = this.interpolatePath(url, urlParams);
    Type returnType = InvoiceTemplate.class;
    return this.makeRequest("GET", path, returnType);
  }
}
