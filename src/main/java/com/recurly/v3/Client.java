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


  @GET("/sites")
  Call<Pager<Site>> listSites();

  @GET("/sites/{site_id}")
  Call<Site> getSite(@Path("site_id") String siteId);

  @GET("/sites/{site_id}/accounts")
  Call<Pager<Account>> listAccounts(@Path("site_id") String siteId);

  @POST("/sites/{site_id}/accounts")
  Call<Account> createAccount(@Path("site_id") String siteId, @Body AccountCreate body);

  @GET("/sites/{site_id}/accounts/{account_id}")
  Call<Account> getAccount(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @PUT("/sites/{site_id}/accounts/{account_id}")
  Call<Account> updateAccount(@Path("site_id") String siteId, @Path("account_id") String accountId, @Body AccountUpdate body);

  @DELETE("/sites/{site_id}/accounts/{account_id}")
  Call<Account> deactivateAccount(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @GET("/sites/{site_id}/accounts/{account_id}/acquisition")
  Call<AccountAcquisition> getAccountAcquisition(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @PUT("/sites/{site_id}/accounts/{account_id}/acquisition")
  Call<AccountAcquisition> updateAccountAcquisition(@Path("site_id") String siteId, @Path("account_id") String accountId, @Body AccountAcquisitionUpdatable body);

  @DELETE("/sites/{site_id}/accounts/{account_id}/acquisition")
  Call removeAccountAcquisition(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @PUT("/sites/{site_id}/accounts/{account_id}/reactivate")
  Call<Account> reactivateAccount(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @GET("/sites/{site_id}/accounts/{account_id}/balance")
  Call<AccountBalance> getAccountBalance(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @GET("/sites/{site_id}/accounts/{account_id}/billing_info")
  Call<BillingInfo> getBillingInfo(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @PUT("/sites/{site_id}/accounts/{account_id}/billing_info")
  Call<BillingInfo> updateBillingInfo(@Path("site_id") String siteId, @Path("account_id") String accountId, @Body BillingInfoCreate body);

  @DELETE("/sites/{site_id}/accounts/{account_id}/billing_info")
  Call removeBillingInfo(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @GET("/sites/{site_id}/accounts/{account_id}/coupon_redemptions")
  Call<Pager<CouponRedemption>> listAccountCouponRedemptions(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @GET("/sites/{site_id}/accounts/{account_id}/coupon_redemptions/active")
  Call<CouponRedemption> getActiveCouponRedemption(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @DELETE("/sites/{site_id}/accounts/{account_id}/coupon_redemptions/active")
  Call<CouponRedemption> removeCouponRedemption(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @GET("/sites/{site_id}/accounts/{account_id}/credit_payments")
  Call<Pager<CreditPayment>> listAccountCreditPayments(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @GET("/sites/{site_id}/accounts/{account_id}/invoices")
  Call<Pager<Invoice>> listAccountInvoices(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @POST("/sites/{site_id}/accounts/{account_id}/invoices")
  Call<InvoiceCollection> createInvoice(@Path("site_id") String siteId, @Path("account_id") String accountId, @Body InvoiceCreate body);

  @POST("/sites/{site_id}/accounts/{account_id}/invoices/preview")
  Call<InvoiceCollection> previewInvoice(@Path("site_id") String siteId, @Path("account_id") String accountId, @Body InvoiceCreate body);

  @GET("/sites/{site_id}/accounts/{account_id}/line_items")
  Call<Pager<LineItem>> listAccountLineItems(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @POST("/sites/{site_id}/accounts/{account_id}/line_items")
  Call<LineItem> createLineItem(@Path("site_id") String siteId, @Path("account_id") String accountId, @Body LineItemCreate body);

  @GET("/sites/{site_id}/accounts/{account_id}/notes")
  Call<Pager<AccountNote>> listAccountNotes(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @GET("/sites/{site_id}/accounts/{account_id}/notes/{account_note_id}")
  Call<AccountNote> getAccountNote(@Path("site_id") String siteId, @Path("account_id") String accountId, @Path("account_note_id") String accountNoteId);

  @GET("/sites/{site_id}/accounts/{account_id}/shipping_addresses")
  Call<Pager<ShippingAddress>> listShippingAddresses(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @POST("/sites/{site_id}/accounts/{account_id}/shipping_addresses")
  Call<ShippingAddress> createShippingAddress(@Path("site_id") String siteId, @Path("account_id") String accountId, @Body ShippingAddressCreate body);

  @GET("/sites/{site_id}/accounts/{account_id}/shipping_addresses/{shipping_address_id}")
  Call<ShippingAddress> getShippingAddress(@Path("site_id") String siteId, @Path("account_id") String accountId, @Path("shipping_address_id") String shippingAddressId);

  @PUT("/sites/{site_id}/accounts/{account_id}/shipping_addresses/{shipping_address_id}")
  Call<ShippingAddress> updateShippingAddress(@Path("site_id") String siteId, @Path("account_id") String accountId, @Path("shipping_address_id") String shippingAddressId, @Body ShippingAddressUpdate body);

  @DELETE("/sites/{site_id}/accounts/{account_id}/shipping_addresses/{shipping_address_id}")
  Call removeShippingAddress(@Path("site_id") String siteId, @Path("account_id") String accountId, @Path("shipping_address_id") String shippingAddressId);

  @GET("/sites/{site_id}/accounts/{account_id}/subscriptions")
  Call<Pager<Subscription>> listAccountSubscriptions(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @GET("/sites/{site_id}/accounts/{account_id}/transactions")
  Call<Pager<Transaction>> listAccountTransactions(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @GET("/sites/{site_id}/accounts/{account_id}/accounts")
  Call<Pager<Account>> listChildAccounts(@Path("site_id") String siteId, @Path("account_id") String accountId);

  @GET("/sites/{site_id}/acquisitions")
  Call<AccountAcquisition> listAccountAcquisition(@Path("site_id") String siteId);

  @GET("/sites/{site_id}/coupons")
  Call<Pager<Coupon>> listCoupons(@Path("site_id") String siteId);

  @POST("/sites/{site_id}/coupons")
  Call<Coupon> createCoupon(@Path("site_id") String siteId, @Body CouponCreate body);

  @GET("/sites/{site_id}/coupons/{coupon_id}")
  Call<Coupon> getCoupon(@Path("site_id") String siteId, @Path("coupon_id") String couponId);

  @PUT("/sites/{site_id}/coupons/{coupon_id}")
  Call<Coupon> updateCoupon(@Path("site_id") String siteId, @Path("coupon_id") String couponId, @Body CouponUpdate body);

  @GET("/sites/{site_id}/coupons/{coupon_id}/unique_coupon_codes")
  Call<Pager<UniqueCouponCode>> listUniqueCouponCodes(@Path("site_id") String siteId, @Path("coupon_id") String couponId);

  @GET("/sites/{site_id}/credit_payments")
  Call<Pager<CreditPayment>> listCreditPayments(@Path("site_id") String siteId);

  @GET("/sites/{site_id}/credit_payments/{credit_payment_id}")
  Call<CreditPayment> getCreditPayment(@Path("site_id") String siteId, @Path("credit_payment_id") String creditPaymentId);

  @GET("/sites/{site_id}/custom_field_definitions")
  Call<Pager<CustomFieldDefinition>> listCustomFieldDefinitions(@Path("site_id") String siteId);

  @GET("/sites/{site_id}/custom_field_definitions/{custom_field_definition_id}")
  Call<CustomFieldDefinition> getCustomFieldDefinition(@Path("site_id") String siteId, @Path("custom_field_definition_id") String customFieldDefinitionId);

  @GET("/sites/{site_id}/invoices")
  Call<Pager<Invoice>> listInvoices(@Path("site_id") String siteId);

  @GET("/sites/{site_id}/invoices/{invoice_id}")
  Call<Invoice> getInvoice(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId);

  @PUT("/sites/{site_id}/invoices/{invoice_id}")
  Call<Invoice> putInvoice(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId, @Body InvoiceUpdatable body);

  @PUT("/sites/{site_id}/invoices/{invoice_id}/collect")
  Call<Invoice> collectInvoice(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId);

  @PUT("/sites/{site_id}/invoices/{invoice_id}/mark_failed")
  Call<Invoice> failInvoice(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId);

  @PUT("/sites/{site_id}/invoices/{invoice_id}/mark_successful")
  Call<Invoice> markInvoiceSuccessful(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId);

  @PUT("/sites/{site_id}/invoices/{invoice_id}/reopen")
  Call<Invoice> reopenInvoice(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId);

  @GET("/sites/{site_id}/invoices/{invoice_id}/line_items")
  Call<Pager<LineItem>> listInvoiceLineItems(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId);

  @GET("/sites/{site_id}/invoices/{invoice_id}/coupon_redemptions")
  Call<Pager<CouponRedemption>> listInvoiceCouponRedemptions(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId);

  @GET("/sites/{site_id}/invoices/{invoice_id}/related_invoices")
  Call<Pager<Invoice>> listRelatedInvoices(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId);

  @POST("/sites/{site_id}/invoices/{invoice_id}/refund")
  Call<Invoice> refundInvoice(@Path("site_id") String siteId, @Path("invoice_id") String invoiceId, @Body InvoiceRefund body);

  @GET("/sites/{site_id}/line_items")
  Call<Pager<LineItem>> listLineItems(@Path("site_id") String siteId);

  @GET("/sites/{site_id}/line_items/{line_item_id}")
  Call<LineItem> getLineItem(@Path("site_id") String siteId, @Path("line_item_id") String lineItemId);

  @DELETE("/sites/{site_id}/line_items/{line_item_id}")
  Call removeLineItem(@Path("site_id") String siteId, @Path("line_item_id") String lineItemId);

  @GET("/sites/{site_id}/plans")
  Call<Pager<Plan>> listPlans(@Path("site_id") String siteId);

  @POST("/sites/{site_id}/plans")
  Call<Plan> createPlan(@Path("site_id") String siteId, @Body PlanCreate body);

  @GET("/sites/{site_id}/plans/{plan_id}")
  Call<Plan> getPlan(@Path("site_id") String siteId, @Path("plan_id") String planId);

  @PUT("/sites/{site_id}/plans/{plan_id}")
  Call<Plan> updatePlan(@Path("site_id") String siteId, @Path("plan_id") String planId, @Body PlanUpdate body);

  @DELETE("/sites/{site_id}/plans/{plan_id}")
  Call<Plan> removePlan(@Path("site_id") String siteId, @Path("plan_id") String planId);

  @GET("/sites/{site_id}/plans/{plan_id}/add_ons")
  Call<Pager<AddOn>> listPlanAddOns(@Path("site_id") String siteId, @Path("plan_id") String planId);

  @POST("/sites/{site_id}/plans/{plan_id}/add_ons")
  Call<AddOn> createPlanAddOn(@Path("site_id") String siteId, @Path("plan_id") String planId, @Body AddOnCreate body);

  @GET("/sites/{site_id}/plans/{plan_id}/add_ons/{add_on_id}")
  Call<AddOn> getPlanAddOn(@Path("site_id") String siteId, @Path("add_on_id") String addOnId, @Path("plan_id") String planId);

  @PUT("/sites/{site_id}/plans/{plan_id}/add_ons/{add_on_id}")
  Call<AddOn> updatePlanAddOn(@Path("site_id") String siteId, @Path("add_on_id") String addOnId, @Path("plan_id") String planId, @Body AddOnUpdate body);

  @DELETE("/sites/{site_id}/plans/{plan_id}/add_ons/{add_on_id}")
  Call<AddOn> removePlanAddOn(@Path("site_id") String siteId, @Path("add_on_id") String addOnId, @Path("plan_id") String planId);

  @GET("/sites/{site_id}/add_ons")
  Call<Pager<AddOn>> listAddOns(@Path("site_id") String siteId);

  @GET("/sites/{site_id}/add_ons/{add_on_id}")
  Call<AddOn> getAddOn(@Path("site_id") String siteId, @Path("add_on_id") String addOnId);

  @GET("/sites/{site_id}/subscriptions")
  Call<Pager<Subscription>> listSubscriptions(@Path("site_id") String siteId);

  @POST("/sites/{site_id}/subscriptions")
  Call<Subscription> createSubscription(@Path("site_id") String siteId, @Body SubscriptionCreate body);

  @GET("/sites/{site_id}/subscriptions/{subscription_id}")
  Call<Subscription> getSubscription(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  @PUT("/sites/{site_id}/subscriptions/{subscription_id}")
  Call<Subscription> modifySubscription(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId, @Body SubscriptionUpdate body);

  @DELETE("/sites/{site_id}/subscriptions/{subscription_id}")
  Call<Subscription> terminateSubscription(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  @PUT("/sites/{site_id}/subscriptions/{subscription_id}/cancel")
  Call<Subscription> cancelSubscription(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  @PUT("/sites/{site_id}/subscriptions/{subscription_id}/reactivate")
  Call<Subscription> reactivateSubscription(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  @PUT("/sites/{site_id}/subscriptions/{subscription_id}/resume")
  Call<Subscription> resumeSubscription(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  @GET("/sites/{site_id}/subscriptions/{subscription_id}/change")
  Call<SubscriptionChange> getSubscriptionChange(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  @POST("/sites/{site_id}/subscriptions/{subscription_id}/change")
  Call<SubscriptionChange> createSubscriptionChange(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId, @Body SubscriptionChangeCreate body);

  @DELETE("/sites/{site_id}/subscriptions/{subscription_id}/change")
  Call removeSubscriptionChange(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  @GET("/sites/{site_id}/subscriptions/{subscription_id}/invoices")
  Call<Pager<Invoice>> listSubscriptionInvoices(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  @GET("/sites/{site_id}/subscriptions/{subscription_id}/line_items")
  Call<Pager<LineItem>> listSubscriptionLineItems(@Path("site_id") String siteId, @Path("subscription_id") String subscriptionId);

  @GET("/sites/{site_id}/transactions")
  Call<Pager<Transaction>> listTransactions(@Path("site_id") String siteId);

  @GET("/sites/{site_id}/transactions/{transaction_id}")
  Call<Transaction> getTransaction(@Path("site_id") String siteId, @Path("transaction_id") String transactionId);

  @GET("/sites/{site_id}/unique_coupon_codes/{unique_coupon_code_id}")
  Call<UniqueCouponCode> getUniqueCouponCode(@Path("site_id") String siteId, @Path("unique_coupon_code_id") String uniqueCouponCodeId);

  @DELETE("/sites/{site_id}/unique_coupon_codes/{unique_coupon_code_id}")
  Call<UniqueCouponCode> deactivateUniqueCouponCode(@Path("site_id") String siteId, @Path("unique_coupon_code_id") String uniqueCouponCodeId);

  @PUT("/sites/{site_id}/unique_coupon_codes/{unique_coupon_code_id}/restore")
  Call<UniqueCouponCode> reactivateUniqueCouponCode(@Path("site_id") String siteId, @Path("unique_coupon_code_id") String uniqueCouponCodeId);
}
