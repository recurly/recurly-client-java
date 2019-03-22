package com.recurly.v3;

import com.recurly.v3.requests.*;
import com.recurly.v3.resources.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.DELETE;
import retrofit2.http.Path;
import retrofit2.http.Body;

public interface Client {
  public static final String API_VERSION = "v2018-08-09";


  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_sites">list_sites api documentation</a>
   */
  @GET("/sites")
  Call<Pager<Site>> listSites();

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_site">get_site api documentation</a>
   */
  @GET("/sites/{site_id}")
  Call<Site> getSite(@Path("site_id") String siteId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_accounts">list_accounts api documentation</a>
   */
  @GET("/sites/{site_id}/accounts")
  Call<Pager<Account>> listAccounts(@Path("site_id") String siteId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_account">create_account api documentation</a>
   */
  @POST("/sites/{site_id}/accounts")
  Call<Account> createAccount(@Path("site_id") String siteId, @Body AccountCreate body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_account">get_account api documentation</a>
   */
  @GET("/sites/{site_id}/accounts/{account_id}")
  Call<Account> getAccount(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_account">update_account api documentation</a>
   */
  @PUT("/sites/{site_id}/accounts/{account_id}")
  Call<Account> updateAccount(@Path("site_id") String siteId, @Path("account_id") String accountId, @Body AccountUpdate body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/deactivate_account">deactivate_account api documentation</a>
   */
  @DELETE("/sites/{site_id}/accounts/{account_id}")
  Call<Account> deactivateAccount(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_account_acquisition">get_account_acquisition api documentation</a>
   */
  @GET("/sites/{site_id}/accounts/{account_id}/acquisition")
  Call<AccountAcquisition> getAccountAcquisition(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_account_acquisition">update_account_acquisition api documentation</a>
   */
  @PUT("/sites/{site_id}/accounts/{account_id}/acquisition")
  Call<AccountAcquisition> updateAccountAcquisition(@Path("site_id") String siteId, @Path("account_id") String accountId, @Body AccountAcquisitionUpdatable body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_account_acquisition">remove_account_acquisition api documentation</a>
   */
  @DELETE("/sites/{site_id}/accounts/{account_id}/acquisition")
  Call removeAccountAcquisition(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/reactivate_account">reactivate_account api documentation</a>
   */
  @PUT("/sites/{site_id}/accounts/{account_id}/reactivate")
  Call<Account> reactivateAccount(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_account_balance">get_account_balance api documentation</a>
   */
  @GET("/sites/{site_id}/accounts/{account_id}/balance")
  Call<AccountBalance> getAccountBalance(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_billing_info">get_billing_info api documentation</a>
   */
  @GET("/sites/{site_id}/accounts/{account_id}/billing_info")
  Call<BillingInfo> getBillingInfo(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_billing_info">update_billing_info api documentation</a>
   */
  @PUT("/sites/{site_id}/accounts/{account_id}/billing_info")
  Call<BillingInfo> updateBillingInfo(@Path("site_id") String siteId, @Path("account_id") String accountId, @Body BillingInfoCreate body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_billing_info">remove_billing_info api documentation</a>
   */
  @DELETE("/sites/{site_id}/accounts/{account_id}/billing_info")
  Call removeBillingInfo(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_coupon_redemptions">list_account_coupon_redemptions api documentation</a>
   */
  @GET("/sites/{site_id}/accounts/{account_id}/coupon_redemptions")
  Call<Pager<CouponRedemption>> listAccountCouponRedemptions(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_active_coupon_redemption">get_active_coupon_redemption api documentation</a>
   */
  @GET("/sites/{site_id}/accounts/{account_id}/coupon_redemptions/active")
  Call<CouponRedemption> getActiveCouponRedemption(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_coupon_redemption">remove_coupon_redemption api documentation</a>
   */
  @DELETE("/sites/{site_id}/accounts/{account_id}/coupon_redemptions/active")
  Call<CouponRedemption> removeCouponRedemption(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_credit_payments">list_account_credit_payments api documentation</a>
   */
  @GET("/sites/{site_id}/accounts/{account_id}/credit_payments")
  Call<Pager<CreditPayment>> listAccountCreditPayments(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_invoices">list_account_invoices api documentation</a>
   */
  @GET("/sites/{site_id}/accounts/{account_id}/invoices")
  Call<Pager<Invoice>> listAccountInvoices(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_invoice">create_invoice api documentation</a>
   */
  @POST("/sites/{site_id}/accounts/{account_id}/invoices")
  Call<InvoiceCollection> createInvoice(@Path("site_id") String siteId, @Path("account_id") String accountId, @Body InvoiceCreate body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/preview_invoice">preview_invoice api documentation</a>
   */
  @POST("/sites/{site_id}/accounts/{account_id}/invoices/preview")
  Call<InvoiceCollection> previewInvoice(@Path("site_id") String siteId, @Path("account_id") String accountId, @Body InvoiceCreate body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_line_items">list_account_line_items api documentation</a>
   */
  @GET("/sites/{site_id}/accounts/{account_id}/line_items")
  Call<Pager<LineItem>> listAccountLineItems(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_line_item">create_line_item api documentation</a>
   */
  @POST("/sites/{site_id}/accounts/{account_id}/line_items")
  Call<LineItem> createLineItem(@Path("site_id") String siteId, @Path("account_id") String accountId, @Body LineItemCreate body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_notes">list_account_notes api documentation</a>
   */
  @GET("/sites/{site_id}/accounts/{account_id}/notes")
  Call<Pager<AccountNote>> listAccountNotes(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_account_note">get_account_note api documentation</a>
   */
  @GET("/sites/{site_id}/accounts/{account_id}/notes/{account_note_id}")
  Call<AccountNote> getAccountNote(@Path("site_id") String siteId, @Path("account_id") String accountId, @Path("account_note_id") String accountNoteId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_shipping_addresses">list_shipping_addresses api documentation</a>
   */
  @GET("/sites/{site_id}/accounts/{account_id}/shipping_addresses")
  Call<Pager<ShippingAddress>> listShippingAddresses(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_shipping_address">create_shipping_address api documentation</a>
   */
  @POST("/sites/{site_id}/accounts/{account_id}/shipping_addresses")
  Call<ShippingAddress> createShippingAddress(@Path("site_id") String siteId, @Path("account_id") String accountId, @Body ShippingAddressCreate body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_shipping_address">get_shipping_address api documentation</a>
   */
  @GET("/sites/{site_id}/accounts/{account_id}/shipping_addresses/{shipping_address_id}")
  Call<ShippingAddress> getShippingAddress(@Path("site_id") String siteId, @Path("account_id") String accountId, @Path("shipping_address_id") String shippingAddressId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_shipping_address">update_shipping_address api documentation</a>
   */
  @PUT("/sites/{site_id}/accounts/{account_id}/shipping_addresses/{shipping_address_id}")
  Call<ShippingAddress> updateShippingAddress(@Path("site_id") String siteId, @Path("account_id") String accountId, @Path("shipping_address_id") String shippingAddressId, @Body ShippingAddressUpdate body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_shipping_address">remove_shipping_address api documentation</a>
   */
  @DELETE("/sites/{site_id}/accounts/{account_id}/shipping_addresses/{shipping_address_id}")
  Call removeShippingAddress(@Path("site_id") String siteId, @Path("account_id") String accountId, @Path("shipping_address_id") String shippingAddressId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_subscriptions">list_account_subscriptions api documentation</a>
   */
  @GET("/sites/{site_id}/accounts/{account_id}/subscriptions")
  Call<Pager<Subscription>> listAccountSubscriptions(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_transactions">list_account_transactions api documentation</a>
   */
  @GET("/sites/{site_id}/accounts/{account_id}/transactions")
  Call<Pager<Transaction>> listAccountTransactions(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_child_accounts">list_child_accounts api documentation</a>
   */
  @GET("/sites/{site_id}/accounts/{account_id}/accounts")
  Call<Pager<Account>> listChildAccounts(@Path("site_id") String siteId, @Path("account_id") String accountId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_account_acquisition">list_account_acquisition api documentation</a>
   */
  @GET("/sites/{site_id}/acquisitions")
  Call<AccountAcquisition> listAccountAcquisition(@Path("site_id") String siteId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_coupons">list_coupons api documentation</a>
   */
  @GET("/sites/{site_id}/coupons")
  Call<Pager<Coupon>> listCoupons(@Path("site_id") String siteId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_coupon">create_coupon api documentation</a>
   */
  @POST("/sites/{site_id}/coupons")
  Call<Coupon> createCoupon(@Path("site_id") String siteId, @Body CouponCreate body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_coupon">get_coupon api documentation</a>
   */
  @GET("/sites/{site_id}/coupons/{coupon_id}")
  Call<Coupon> getCoupon(@Path("site_id") String siteId, @Path("coupon_id") String couponId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_coupon">update_coupon api documentation</a>
   */
  @PUT("/sites/{site_id}/coupons/{coupon_id}")
  Call<Coupon> updateCoupon(@Path("site_id") String siteId, @Path("coupon_id") String couponId, @Body CouponUpdate body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_unique_coupon_codes">list_unique_coupon_codes api documentation</a>
   */
  @GET("/sites/{site_id}/coupons/{coupon_id}/unique_coupon_codes")
  Call<Pager<UniqueCouponCode>> listUniqueCouponCodes(@Path("site_id") String siteId, @Path("coupon_id") String couponId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_credit_payments">list_credit_payments api documentation</a>
   */
  @GET("/sites/{site_id}/credit_payments")
  Call<Pager<CreditPayment>> listCreditPayments(@Path("site_id") String siteId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_credit_payment">get_credit_payment api documentation</a>
   */
  @GET("/sites/{site_id}/credit_payments/{credit_payment_id}")
  Call<CreditPayment> getCreditPayment(@Path("site_id") String siteId, @Path("credit_payment_id") String creditPaymentId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_custom_field_definitions">list_custom_field_definitions api documentation</a>
   */
  @GET("/sites/{site_id}/custom_field_definitions")
  Call<Pager<CustomFieldDefinition>> listCustomFieldDefinitions(@Path("site_id") String siteId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_custom_field_definition">get_custom_field_definition api documentation</a>
   */
  @GET("/sites/{site_id}/custom_field_definitions/{custom_field_definition_id}")
  Call<CustomFieldDefinition> getCustomFieldDefinition(@Path("site_id") String siteId, @Path("custom_field_definition_id") String customFieldDefinitionId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_invoices">list_invoices api documentation</a>
   */
  @GET("/sites/{site_id}/invoices")
  Call<Pager<Invoice>> listInvoices(@Path("site_id") String siteId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_invoice">get_invoice api documentation</a>
   */
  @GET("/sites/{site_id}/invoices/{invoice_id}")
  Call<Invoice> getInvoice(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/put_invoice">put_invoice api documentation</a>
   */
  @PUT("/sites/{site_id}/invoices/{invoice_id}")
  Call<Invoice> putInvoice(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId, @Body InvoiceUpdatable body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/collect_invoice">collect_invoice api documentation</a>
   */
  @PUT("/sites/{site_id}/invoices/{invoice_id}/collect")
  Call<Invoice> collectInvoice(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/fail_invoice">fail_invoice api documentation</a>
   */
  @PUT("/sites/{site_id}/invoices/{invoice_id}/mark_failed")
  Call<Invoice> failInvoice(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/mark_invoice_successful">mark_invoice_successful api documentation</a>
   */
  @PUT("/sites/{site_id}/invoices/{invoice_id}/mark_successful")
  Call<Invoice> markInvoiceSuccessful(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/reopen_invoice">reopen_invoice api documentation</a>
   */
  @PUT("/sites/{site_id}/invoices/{invoice_id}/reopen")
  Call<Invoice> reopenInvoice(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_invoice_line_items">list_invoice_line_items api documentation</a>
   */
  @GET("/sites/{site_id}/invoices/{invoice_id}/line_items")
  Call<Pager<LineItem>> listInvoiceLineItems(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_invoice_coupon_redemptions">list_invoice_coupon_redemptions api documentation</a>
   */
  @GET("/sites/{site_id}/invoices/{invoice_id}/coupon_redemptions")
  Call<Pager<CouponRedemption>> listInvoiceCouponRedemptions(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_related_invoices">list_related_invoices api documentation</a>
   */
  @GET("/sites/{site_id}/invoices/{invoice_id}/related_invoices")
  Call<Pager<Invoice>> listRelatedInvoices(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/refund_invoice">refund_invoice api documentation</a>
   */
  @POST("/sites/{site_id}/invoices/{invoice_id}/refund")
  Call<Invoice> refundInvoice(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId, @Body InvoiceRefund body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_line_items">list_line_items api documentation</a>
   */
  @GET("/sites/{site_id}/line_items")
  Call<Pager<LineItem>> listLineItems(@Path("site_id") String siteId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_line_item">get_line_item api documentation</a>
   */
  @GET("/sites/{site_id}/line_items/{line_item_id}")
  Call<LineItem> getLineItem(@Path("site_id") String siteId, @Path("line_item_id") String lineItemId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_line_item">remove_line_item api documentation</a>
   */
  @DELETE("/sites/{site_id}/line_items/{line_item_id}")
  Call removeLineItem(@Path("site_id") String siteId, @Path("line_item_id") String lineItemId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_plans">list_plans api documentation</a>
   */
  @GET("/sites/{site_id}/plans")
  Call<Pager<Plan>> listPlans(@Path("site_id") String siteId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_plan">create_plan api documentation</a>
   */
  @POST("/sites/{site_id}/plans")
  Call<Plan> createPlan(@Path("site_id") String siteId, @Body PlanCreate body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_plan">get_plan api documentation</a>
   */
  @GET("/sites/{site_id}/plans/{plan_id}")
  Call<Plan> getPlan(@Path("site_id") String siteId, @Path("plan_id") String planId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_plan">update_plan api documentation</a>
   */
  @PUT("/sites/{site_id}/plans/{plan_id}")
  Call<Plan> updatePlan(@Path("site_id") String siteId, @Path("plan_id") String planId, @Body PlanUpdate body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_plan">remove_plan api documentation</a>
   */
  @DELETE("/sites/{site_id}/plans/{plan_id}")
  Call<Plan> removePlan(@Path("site_id") String siteId, @Path("plan_id") String planId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_plan_add_ons">list_plan_add_ons api documentation</a>
   */
  @GET("/sites/{site_id}/plans/{plan_id}/add_ons")
  Call<Pager<AddOn>> listPlanAddOns(@Path("site_id") String siteId, @Path("plan_id") String planId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_plan_add_on">create_plan_add_on api documentation</a>
   */
  @POST("/sites/{site_id}/plans/{plan_id}/add_ons")
  Call<AddOn> createPlanAddOn(@Path("site_id") String siteId, @Path("plan_id") String planId, @Body AddOnCreate body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_plan_add_on">get_plan_add_on api documentation</a>
   */
  @GET("/sites/{site_id}/plans/{plan_id}/add_ons/{add_on_id}")
  Call<AddOn> getPlanAddOn(@Path("site_id") String siteId, @Path("plan_id") String planId, @Path("add_on_id") String addOnId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/update_plan_add_on">update_plan_add_on api documentation</a>
   */
  @PUT("/sites/{site_id}/plans/{plan_id}/add_ons/{add_on_id}")
  Call<AddOn> updatePlanAddOn(@Path("site_id") String siteId, @Path("plan_id") String planId, @Path("add_on_id") String addOnId, @Body AddOnUpdate body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_plan_add_on">remove_plan_add_on api documentation</a>
   */
  @DELETE("/sites/{site_id}/plans/{plan_id}/add_ons/{add_on_id}")
  Call<AddOn> removePlanAddOn(@Path("site_id") String siteId, @Path("plan_id") String planId, @Path("add_on_id") String addOnId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_add_ons">list_add_ons api documentation</a>
   */
  @GET("/sites/{site_id}/add_ons")
  Call<Pager<AddOn>> listAddOns(@Path("site_id") String siteId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_add_on">get_add_on api documentation</a>
   */
  @GET("/sites/{site_id}/add_ons/{add_on_id}")
  Call<AddOn> getAddOn(@Path("site_id") String siteId, @Path("add_on_id") String addOnId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_subscriptions">list_subscriptions api documentation</a>
   */
  @GET("/sites/{site_id}/subscriptions")
  Call<Pager<Subscription>> listSubscriptions(@Path("site_id") String siteId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_subscription">create_subscription api documentation</a>
   */
  @POST("/sites/{site_id}/subscriptions")
  Call<Subscription> createSubscription(@Path("site_id") String siteId, @Body SubscriptionCreate body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_subscription">get_subscription api documentation</a>
   */
  @GET("/sites/{site_id}/subscriptions/{subscription_id}")
  Call<Subscription> getSubscription(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/modify_subscription">modify_subscription api documentation</a>
   */
  @PUT("/sites/{site_id}/subscriptions/{subscription_id}")
  Call<Subscription> modifySubscription(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId, @Body SubscriptionUpdate body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/terminate_subscription">terminate_subscription api documentation</a>
   */
  @DELETE("/sites/{site_id}/subscriptions/{subscription_id}")
  Call<Subscription> terminateSubscription(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/cancel_subscription">cancel_subscription api documentation</a>
   */
  @PUT("/sites/{site_id}/subscriptions/{subscription_id}/cancel")
  Call<Subscription> cancelSubscription(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/reactivate_subscription">reactivate_subscription api documentation</a>
   */
  @PUT("/sites/{site_id}/subscriptions/{subscription_id}/reactivate")
  Call<Subscription> reactivateSubscription(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/resume_subscription">resume_subscription api documentation</a>
   */
  @PUT("/sites/{site_id}/subscriptions/{subscription_id}/resume")
  Call<Subscription> resumeSubscription(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_subscription_change">get_subscription_change api documentation</a>
   */
  @GET("/sites/{site_id}/subscriptions/{subscription_id}/change")
  Call<SubscriptionChange> getSubscriptionChange(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/create_subscription_change">create_subscription_change api documentation</a>
   */
  @POST("/sites/{site_id}/subscriptions/{subscription_id}/change")
  Call<SubscriptionChange> createSubscriptionChange(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId, @Body SubscriptionChangeCreate body);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/remove_subscription_change">remove_subscription_change api documentation</a>
   */
  @DELETE("/sites/{site_id}/subscriptions/{subscription_id}/change")
  Call removeSubscriptionChange(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_subscription_invoices">list_subscription_invoices api documentation</a>
   */
  @GET("/sites/{site_id}/subscriptions/{subscription_id}/invoices")
  Call<Pager<Invoice>> listSubscriptionInvoices(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_subscription_line_items">list_subscription_line_items api documentation</a>
   */
  @GET("/sites/{site_id}/subscriptions/{subscription_id}/line_items")
  Call<Pager<LineItem>> listSubscriptionLineItems(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_subscription_coupon_redemptions">list_subscription_coupon_redemptions api documentation</a>
   */
  @GET("/sites/{site_id}/subscriptions/{subscription_id}/coupon_redemptions")
  Call<Pager<CouponRedemption>> listSubscriptionCouponRedemptions(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/list_transactions">list_transactions api documentation</a>
   */
  @GET("/sites/{site_id}/transactions")
  Call<Pager<Transaction>> listTransactions(@Path("site_id") String siteId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_transaction">get_transaction api documentation</a>
   */
  @GET("/sites/{site_id}/transactions/{transaction_id}")
  Call<Transaction> getTransaction(@Path("site_id") String siteId, @Path("transaction_id") String transactionId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/get_unique_coupon_code">get_unique_coupon_code api documentation</a>
   */
  @GET("/sites/{site_id}/unique_coupon_codes/{unique_coupon_code_id}")
  Call<UniqueCouponCode> getUniqueCouponCode(@Path("site_id") String siteId, @Path("unique_coupon_code_id") String uniqueCouponCodeId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/deactivate_unique_coupon_code">deactivate_unique_coupon_code api documentation</a>
   */
  @DELETE("/sites/{site_id}/unique_coupon_codes/{unique_coupon_code_id}")
  Call<UniqueCouponCode> deactivateUniqueCouponCode(@Path("site_id") String siteId, @Path("unique_coupon_code_id") String uniqueCouponCodeId);

  /**
   * @see <a href="https://partner-docs.recurly.com/v2018-08-09#operation/reactivate_unique_coupon_code">reactivate_unique_coupon_code api documentation</a>
   */
  @PUT("/sites/{site_id}/unique_coupon_codes/{unique_coupon_code_id}/restore")
  Call<UniqueCouponCode> reactivateUniqueCouponCode(@Path("site_id") String siteId, @Path("unique_coupon_code_id") String uniqueCouponCodeId);
}
