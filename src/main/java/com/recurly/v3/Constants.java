/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3;

import com.google.gson.annotations.SerializedName;

public class Constants {
  
    public enum RelatedType {
      UNDEFINED,
    
      @SerializedName("account")
      ACCOUNT,
    
      @SerializedName("item")
      ITEM,
    
      @SerializedName("subscription")
      SUBSCRIPTION,
    
    };
  
    public enum RefundType {
      UNDEFINED,
    
      @SerializedName("full")
      FULL,
    
      @SerializedName("none")
      NONE,
    
      @SerializedName("partial")
      PARTIAL,
    
    };
  
    public enum AlphanumericSort {
      UNDEFINED,
    
      @SerializedName("asc")
      ASC,
    
      @SerializedName("desc")
      DESC,
    
    };
  
    public enum UsageSort {
      UNDEFINED,
    
      @SerializedName("recorded_timestamp")
      RECORDED_TIMESTAMP,
    
      @SerializedName("usage_timestamp")
      USAGE_TIMESTAMP,
    
    };
  
    public enum UsageType {
      UNDEFINED,
    
      @SerializedName("price")
      PRICE,
    
      @SerializedName("percentage")
      PERCENTAGE,
    
    };
  
    public enum BillingStatus {
      UNDEFINED,
    
      @SerializedName("unbilled")
      UNBILLED,
    
      @SerializedName("billed")
      BILLED,
    
      @SerializedName("all")
      ALL,
    
    };
  
    public enum TimestampSort {
      UNDEFINED,
    
      @SerializedName("created_at")
      CREATED_AT,
    
      @SerializedName("updated_at")
      UPDATED_AT,
    
    };
  
    public enum ActiveState {
      UNDEFINED,
    
      @SerializedName("active")
      ACTIVE,
    
      @SerializedName("inactive")
      INACTIVE,
    
    };
  
    public enum FilterSubscriptionState {
      UNDEFINED,
    
      @SerializedName("active")
      ACTIVE,
    
      @SerializedName("canceled")
      CANCELED,
    
      @SerializedName("expired")
      EXPIRED,
    
      @SerializedName("future")
      FUTURE,
    
      @SerializedName("in_trial")
      IN_TRIAL,
    
      @SerializedName("live")
      LIVE,
    
    };
  
    public enum True {
      UNDEFINED,
    
      @SerializedName("true")
      TRUE,
    
    };
  
    public enum LineItemState {
      UNDEFINED,
    
      @SerializedName("invoiced")
      INVOICED,
    
      @SerializedName("pending")
      PENDING,
    
    };
  
    public enum LineItemType {
      UNDEFINED,
    
      @SerializedName("charge")
      CHARGE,
    
      @SerializedName("credit")
      CREDIT,
    
    };
  
    public enum FilterTransactionType {
      UNDEFINED,
    
      @SerializedName("authorization")
      AUTHORIZATION,
    
      @SerializedName("capture")
      CAPTURE,
    
      @SerializedName("payment")
      PAYMENT,
    
      @SerializedName("purchase")
      PURCHASE,
    
      @SerializedName("refund")
      REFUND,
    
      @SerializedName("verify")
      VERIFY,
    
    };
  
    public enum FilterInvoiceType {
      UNDEFINED,
    
      @SerializedName("charge")
      CHARGE,
    
      @SerializedName("credit")
      CREDIT,
    
      @SerializedName("legacy")
      LEGACY,
    
      @SerializedName("non-legacy")
      NON_LEGACY,
    
    };
  
    public enum Channel {
      UNDEFINED,
    
      @SerializedName("advertising")
      ADVERTISING,
    
      @SerializedName("blog")
      BLOG,
    
      @SerializedName("direct_traffic")
      DIRECT_TRAFFIC,
    
      @SerializedName("email")
      EMAIL,
    
      @SerializedName("events")
      EVENTS,
    
      @SerializedName("marketing_content")
      MARKETING_CONTENT,
    
      @SerializedName("organic_search")
      ORGANIC_SEARCH,
    
      @SerializedName("other")
      OTHER,
    
      @SerializedName("outbound_sales")
      OUTBOUND_SALES,
    
      @SerializedName("paid_search")
      PAID_SEARCH,
    
      @SerializedName("public_relations")
      PUBLIC_RELATIONS,
    
      @SerializedName("referral")
      REFERRAL,
    
      @SerializedName("social_media")
      SOCIAL_MEDIA,
    
    };
  
    public enum PreferredLocale {
      UNDEFINED,
    
      @SerializedName("da-DK")
      DA_DK,
    
      @SerializedName("de-CH")
      DE_CH,
    
      @SerializedName("de-DE")
      DE_DE,
    
      @SerializedName("en-AU")
      EN_AU,
    
      @SerializedName("en-CA")
      EN_CA,
    
      @SerializedName("en-GB")
      EN_GB,
    
      @SerializedName("en-IE")
      EN_IE,
    
      @SerializedName("en-NZ")
      EN_NZ,
    
      @SerializedName("en-US")
      EN_US,
    
      @SerializedName("es-ES")
      ES_ES,
    
      @SerializedName("es-MX")
      ES_MX,
    
      @SerializedName("es-US")
      ES_US,
    
      @SerializedName("fi-FI")
      FI_FI,
    
      @SerializedName("fr-CA")
      FR_CA,
    
      @SerializedName("fr-FR")
      FR_FR,
    
      @SerializedName("hi-IN")
      HI_IN,
    
      @SerializedName("it-IT")
      IT_IT,
    
      @SerializedName("ja-JP")
      JA_JP,
    
      @SerializedName("ko-KR")
      KO_KR,
    
      @SerializedName("nl-BE")
      NL_BE,
    
      @SerializedName("nl-NL")
      NL_NL,
    
      @SerializedName("pl-PL")
      PL_PL,
    
      @SerializedName("pt-BR")
      PT_BR,
    
      @SerializedName("pt-PT")
      PT_PT,
    
      @SerializedName("ro-RO")
      RO_RO,
    
      @SerializedName("ru-RU")
      RU_RU,
    
      @SerializedName("sk-SK")
      SK_SK,
    
      @SerializedName("sv-SE")
      SV_SE,
    
      @SerializedName("tr-TR")
      TR_TR,
    
      @SerializedName("zh-CN")
      ZH_CN,
    
    };
  
    public enum BillTo {
      UNDEFINED,
    
      @SerializedName("parent")
      PARENT,
    
      @SerializedName("self")
      SELF,
    
    };
  
    public enum GatewayTransactionType {
      UNDEFINED,
    
      @SerializedName("moto")
      MOTO,
    
    };
  
    public enum KountDecision {
      UNDEFINED,
    
      @SerializedName("approve")
      APPROVE,
    
      @SerializedName("decline")
      DECLINE,
    
      @SerializedName("escalate")
      ESCALATE,
    
      @SerializedName("review")
      REVIEW,
    
    };
  
    public enum CouponState {
      UNDEFINED,
    
      @SerializedName("expired")
      EXPIRED,
    
      @SerializedName("maxed_out")
      MAXED_OUT,
    
      @SerializedName("redeemable")
      REDEEMABLE,
    
    };
  
    public enum CouponDuration {
      UNDEFINED,
    
      @SerializedName("forever")
      FOREVER,
    
      @SerializedName("single_use")
      SINGLE_USE,
    
      @SerializedName("temporal")
      TEMPORAL,
    
    };
  
    public enum TemporalUnit {
      UNDEFINED,
    
      @SerializedName("day")
      DAY,
    
      @SerializedName("month")
      MONTH,
    
      @SerializedName("week")
      WEEK,
    
      @SerializedName("year")
      YEAR,
    
    };
  
    public enum FreeTrialUnit {
      UNDEFINED,
    
      @SerializedName("day")
      DAY,
    
      @SerializedName("month")
      MONTH,
    
      @SerializedName("week")
      WEEK,
    
    };
  
    public enum RedemptionResource {
      UNDEFINED,
    
      @SerializedName("account")
      ACCOUNT,
    
      @SerializedName("subscription")
      SUBSCRIPTION,
    
    };
  
    public enum CouponType {
      UNDEFINED,
    
      @SerializedName("bulk")
      BULK,
    
      @SerializedName("single_code")
      SINGLE_CODE,
    
    };
  
    public enum DiscountType {
      UNDEFINED,
    
      @SerializedName("fixed")
      FIXED,
    
      @SerializedName("free_trial")
      FREE_TRIAL,
    
      @SerializedName("percent")
      PERCENT,
    
    };
  
    public enum AddOnSource {
      UNDEFINED,
    
      @SerializedName("plan_add_on")
      PLAN_ADD_ON,
    
      @SerializedName("item")
      ITEM,
    
    };
  
    public enum AddOnType {
      UNDEFINED,
    
      @SerializedName("fixed")
      FIXED,
    
      @SerializedName("usage")
      USAGE,
    
    };
  
    public enum AddOnTypeCreate {
      UNDEFINED,
    
      @SerializedName("fixed")
      FIXED,
    
      @SerializedName("usage")
      USAGE,
    
    };
  
    public enum UsageTypeCreate {
      UNDEFINED,
    
      @SerializedName("price")
      PRICE,
    
      @SerializedName("percentage")
      PERCENTAGE,
    
    };
  
    public enum TierType {
      UNDEFINED,
    
      @SerializedName("flat")
      FLAT,
    
      @SerializedName("tiered")
      TIERED,
    
      @SerializedName("stairstep")
      STAIRSTEP,
    
      @SerializedName("volume")
      VOLUME,
    
    };
  
    public enum UsageTimeframe {
      UNDEFINED,
    
      @SerializedName("billing_period")
      BILLING_PERIOD,
    
      @SerializedName("subscription_term")
      SUBSCRIPTION_TERM,
    
    };
  
    public enum UsageTimeframeCreate {
      UNDEFINED,
    
      @SerializedName("billing_period")
      BILLING_PERIOD,
    
      @SerializedName("subscription_term")
      SUBSCRIPTION_TERM,
    
    };
  
    public enum CreditPaymentAction {
      UNDEFINED,
    
      @SerializedName("payment")
      PAYMENT,
    
      @SerializedName("reduction")
      REDUCTION,
    
      @SerializedName("refund")
      REFUND,
    
      @SerializedName("write_off")
      WRITE_OFF,
    
    };
  
    public enum UserAccess {
      UNDEFINED,
    
      @SerializedName("api_only")
      API_ONLY,
    
      @SerializedName("read_only")
      READ_ONLY,
    
      @SerializedName("write")
      WRITE,
    
    };
  
    public enum PricingModelType {
      UNDEFINED,
    
      @SerializedName("fixed")
      FIXED,
    
      @SerializedName("ramp")
      RAMP,
    
    };
  
    public enum RevenueScheduleType {
      UNDEFINED,
    
      @SerializedName("at_range_end")
      AT_RANGE_END,
    
      @SerializedName("at_range_start")
      AT_RANGE_START,
    
      @SerializedName("evenly")
      EVENLY,
    
      @SerializedName("never")
      NEVER,
    
    };
  
    public enum InvoiceType {
      UNDEFINED,
    
      @SerializedName("charge")
      CHARGE,
    
      @SerializedName("credit")
      CREDIT,
    
      @SerializedName("legacy")
      LEGACY,
    
    };
  
    public enum Origin {
      UNDEFINED,
    
      @SerializedName("carryforward_credit")
      CARRYFORWARD_CREDIT,
    
      @SerializedName("carryforward_gift_credit")
      CARRYFORWARD_GIFT_CREDIT,
    
      @SerializedName("credit")
      CREDIT,
    
      @SerializedName("external_refund")
      EXTERNAL_REFUND,
    
      @SerializedName("gift_card")
      GIFT_CARD,
    
      @SerializedName("immediate_change")
      IMMEDIATE_CHANGE,
    
      @SerializedName("import")
      IMPORT,
    
      @SerializedName("line_item_refund")
      LINE_ITEM_REFUND,
    
      @SerializedName("open_amount_refund")
      OPEN_AMOUNT_REFUND,
    
      @SerializedName("prepayment")
      PREPAYMENT,
    
      @SerializedName("purchase")
      PURCHASE,
    
      @SerializedName("refund")
      REFUND,
    
      @SerializedName("renewal")
      RENEWAL,
    
      @SerializedName("termination")
      TERMINATION,
    
      @SerializedName("usage_correction")
      USAGE_CORRECTION,
    
      @SerializedName("write_off")
      WRITE_OFF,
    
    };
  
    public enum InvoiceState {
      UNDEFINED,
    
      @SerializedName("open")
      OPEN,
    
      @SerializedName("pending")
      PENDING,
    
      @SerializedName("processing")
      PROCESSING,
    
      @SerializedName("past_due")
      PAST_DUE,
    
      @SerializedName("paid")
      PAID,
    
      @SerializedName("closed")
      CLOSED,
    
      @SerializedName("failed")
      FAILED,
    
      @SerializedName("voided")
      VOIDED,
    
    };
  
    public enum CollectionMethod {
      UNDEFINED,
    
      @SerializedName("automatic")
      AUTOMATIC,
    
      @SerializedName("manual")
      MANUAL,
    
    };
  
    public enum InvoiceRefundType {
      UNDEFINED,
    
      @SerializedName("amount")
      AMOUNT,
    
      @SerializedName("line_items")
      LINE_ITEMS,
    
    };
  
    public enum RefuneMethod {
      UNDEFINED,
    
      @SerializedName("all_credit")
      ALL_CREDIT,
    
      @SerializedName("all_transaction")
      ALL_TRANSACTION,
    
      @SerializedName("credit_first")
      CREDIT_FIRST,
    
      @SerializedName("transaction_first")
      TRANSACTION_FIRST,
    
    };
  
    public enum ExternalPaymentMethod {
      UNDEFINED,
    
      @SerializedName("ach")
      ACH,
    
      @SerializedName("amazon")
      AMAZON,
    
      @SerializedName("apple_pay")
      APPLE_PAY,
    
      @SerializedName("check")
      CHECK,
    
      @SerializedName("credit_card")
      CREDIT_CARD,
    
      @SerializedName("eft")
      EFT,
    
      @SerializedName("money_order")
      MONEY_ORDER,
    
      @SerializedName("other")
      OTHER,
    
      @SerializedName("paypal")
      PAYPAL,
    
      @SerializedName("roku")
      ROKU,
    
      @SerializedName("sepadirectdebit")
      SEPADIRECTDEBIT,
    
      @SerializedName("wire_transfer")
      WIRE_TRANSFER,
    
    };
  
    public enum LineItemRevenueScheduleType {
      UNDEFINED,
    
      @SerializedName("at_invoice")
      AT_INVOICE,
    
      @SerializedName("at_range_end")
      AT_RANGE_END,
    
      @SerializedName("at_range_start")
      AT_RANGE_START,
    
      @SerializedName("evenly")
      EVENLY,
    
      @SerializedName("never")
      NEVER,
    
    };
  
    public enum LegacyCategory {
      UNDEFINED,
    
      @SerializedName("applied_credit")
      APPLIED_CREDIT,
    
      @SerializedName("carryforward")
      CARRYFORWARD,
    
      @SerializedName("charge")
      CHARGE,
    
      @SerializedName("credit")
      CREDIT,
    
    };
  
    public enum LineItemOrigin {
      UNDEFINED,
    
      @SerializedName("add_on")
      ADD_ON,
    
      @SerializedName("add_on_trial")
      ADD_ON_TRIAL,
    
      @SerializedName("carryforward")
      CARRYFORWARD,
    
      @SerializedName("coupon")
      COUPON,
    
      @SerializedName("credit")
      CREDIT,
    
      @SerializedName("debit")
      DEBIT,
    
      @SerializedName("one_time")
      ONE_TIME,
    
      @SerializedName("plan")
      PLAN,
    
      @SerializedName("plan_trial")
      PLAN_TRIAL,
    
      @SerializedName("setup_fee")
      SETUP_FEE,
    
      @SerializedName("prepayment")
      PREPAYMENT,
    
    };
  
    public enum FullCreditReasonCode {
      UNDEFINED,
    
      @SerializedName("general")
      GENERAL,
    
      @SerializedName("gift_card")
      GIFT_CARD,
    
      @SerializedName("promotional")
      PROMOTIONAL,
    
      @SerializedName("refund")
      REFUND,
    
      @SerializedName("service")
      SERVICE,
    
      @SerializedName("write_off")
      WRITE_OFF,
    
    };
  
    public enum PartialCreditReasonCode {
      UNDEFINED,
    
      @SerializedName("general")
      GENERAL,
    
      @SerializedName("promotional")
      PROMOTIONAL,
    
      @SerializedName("service")
      SERVICE,
    
    };
  
    public enum LineItemCreateOrigin {
      UNDEFINED,
    
      @SerializedName("external_gift_card")
      EXTERNAL_GIFT_CARD,
    
      @SerializedName("prepayment")
      PREPAYMENT,
    
    };
  
    public enum IntervalUnit {
      UNDEFINED,
    
      @SerializedName("days")
      DAYS,
    
      @SerializedName("months")
      MONTHS,
    
    };
  
    public enum AddressRequirement {
      UNDEFINED,
    
      @SerializedName("full")
      FULL,
    
      @SerializedName("none")
      NONE,
    
      @SerializedName("streetzip")
      STREETZIP,
    
      @SerializedName("zip")
      ZIP,
    
    };
  
    public enum SiteMode {
      UNDEFINED,
    
      @SerializedName("development")
      DEVELOPMENT,
    
      @SerializedName("production")
      PRODUCTION,
    
      @SerializedName("sandbox")
      SANDBOX,
    
    };
  
    public enum Features {
      UNDEFINED,
    
      @SerializedName("credit_memos")
      CREDIT_MEMOS,
    
      @SerializedName("manual_invoicing")
      MANUAL_INVOICING,
    
      @SerializedName("only_bill_what_changed")
      ONLY_BILL_WHAT_CHANGED,
    
      @SerializedName("subscription_terms")
      SUBSCRIPTION_TERMS,
    
    };
  
    public enum SubscriptionState {
      UNDEFINED,
    
      @SerializedName("active")
      ACTIVE,
    
      @SerializedName("canceled")
      CANCELED,
    
      @SerializedName("expired")
      EXPIRED,
    
      @SerializedName("failed")
      FAILED,
    
      @SerializedName("future")
      FUTURE,
    
      @SerializedName("paused")
      PAUSED,
    
    };
  
    public enum Timeframe {
      UNDEFINED,
    
      @SerializedName("bill_date")
      BILL_DATE,
    
      @SerializedName("term_end")
      TERM_END,
    
    };
  
    public enum ChangeTimeframe {
      UNDEFINED,
    
      @SerializedName("bill_date")
      BILL_DATE,
    
      @SerializedName("now")
      NOW,
    
      @SerializedName("renewal")
      RENEWAL,
    
      @SerializedName("term_end")
      TERM_END,
    
    };
  
    public enum TransactionType {
      UNDEFINED,
    
      @SerializedName("authorization")
      AUTHORIZATION,
    
      @SerializedName("capture")
      CAPTURE,
    
      @SerializedName("purchase")
      PURCHASE,
    
      @SerializedName("refund")
      REFUND,
    
      @SerializedName("verify")
      VERIFY,
    
    };
  
    public enum TransactionOrigin {
      UNDEFINED,
    
      @SerializedName("api")
      API,
    
      @SerializedName("chargeback")
      CHARGEBACK,
    
      @SerializedName("force_collect")
      FORCE_COLLECT,
    
      @SerializedName("hpp")
      HPP,
    
      @SerializedName("merchant")
      MERCHANT,
    
      @SerializedName("recurly_admin")
      RECURLY_ADMIN,
    
      @SerializedName("recurlyjs")
      RECURLYJS,
    
      @SerializedName("recurring")
      RECURRING,
    
      @SerializedName("refunded_externally")
      REFUNDED_EXTERNALLY,
    
      @SerializedName("transparent")
      TRANSPARENT,
    
    };
  
    public enum TransactionStatus {
      UNDEFINED,
    
      @SerializedName("chargeback")
      CHARGEBACK,
    
      @SerializedName("declined")
      DECLINED,
    
      @SerializedName("error")
      ERROR,
    
      @SerializedName("pending")
      PENDING,
    
      @SerializedName("processing")
      PROCESSING,
    
      @SerializedName("scheduled")
      SCHEDULED,
    
      @SerializedName("success")
      SUCCESS,
    
      @SerializedName("void")
      VOID,
    
    };
  
    public enum CvvCheck {
      UNDEFINED,
    
      @SerializedName("D")
      D,
    
      @SerializedName("I")
      I,
    
      @SerializedName("M")
      M,
    
      @SerializedName("N")
      N,
    
      @SerializedName("P")
      P,
    
      @SerializedName("S")
      S,
    
      @SerializedName("U")
      U,
    
      @SerializedName("X")
      X,
    
    };
  
    public enum AvsCheck {
      UNDEFINED,
    
      @SerializedName("A")
      A,
    
      @SerializedName("B")
      B,
    
      @SerializedName("C")
      C,
    
      @SerializedName("D")
      D,
    
      @SerializedName("E")
      E,
    
      @SerializedName("F")
      F,
    
      @SerializedName("G")
      G,
    
      @SerializedName("H")
      H,
    
      @SerializedName("I")
      I,
    
      @SerializedName("J")
      J,
    
      @SerializedName("K")
      K,
    
      @SerializedName("L")
      L,
    
      @SerializedName("M")
      M,
    
      @SerializedName("N")
      N,
    
      @SerializedName("O")
      O,
    
      @SerializedName("P")
      P,
    
      @SerializedName("Q")
      Q,
    
      @SerializedName("R")
      R,
    
      @SerializedName("S")
      S,
    
      @SerializedName("T")
      T,
    
      @SerializedName("U")
      U,
    
      @SerializedName("V")
      V,
    
      @SerializedName("W")
      W,
    
      @SerializedName("X")
      X,
    
      @SerializedName("Y")
      Y,
    
      @SerializedName("Z")
      Z,
    
    };
  
    public enum CouponCodeState {
      UNDEFINED,
    
      @SerializedName("expired")
      EXPIRED,
    
      @SerializedName("inactive")
      INACTIVE,
    
      @SerializedName("maxed_out")
      MAXED_OUT,
    
      @SerializedName("redeemable")
      REDEEMABLE,
    
    };
  
    public enum PaymentMethod {
      UNDEFINED,
    
      @SerializedName("amazon")
      AMAZON,
    
      @SerializedName("amazon_billing_agreement")
      AMAZON_BILLING_AGREEMENT,
    
      @SerializedName("apple_pay")
      APPLE_PAY,
    
      @SerializedName("bank_account_info")
      BANK_ACCOUNT_INFO,
    
      @SerializedName("check")
      CHECK,
    
      @SerializedName("credit_card")
      CREDIT_CARD,
    
      @SerializedName("eft")
      EFT,
    
      @SerializedName("gateway_token")
      GATEWAY_TOKEN,
    
      @SerializedName("iban_bank_account")
      IBAN_BANK_ACCOUNT,
    
      @SerializedName("money_order")
      MONEY_ORDER,
    
      @SerializedName("other")
      OTHER,
    
      @SerializedName("paypal")
      PAYPAL,
    
      @SerializedName("paypal_billing_agreement")
      PAYPAL_BILLING_AGREEMENT,
    
      @SerializedName("roku")
      ROKU,
    
      @SerializedName("sepadirectdebit")
      SEPADIRECTDEBIT,
    
      @SerializedName("venmo")
      VENMO,
    
      @SerializedName("wire_transfer")
      WIRE_TRANSFER,
    
      @SerializedName("braintree_v_zero")
      BRAINTREE_V_ZERO,
    
    };
  
    public enum CardType {
      UNDEFINED,
    
      @SerializedName("American Express")
      AMERICAN_EXPRESS,
    
      @SerializedName("Dankort")
      DANKORT,
    
      @SerializedName("Diners Club")
      DINERS_CLUB,
    
      @SerializedName("Discover")
      DISCOVER,
    
      @SerializedName("Forbrugsforeningen")
      FORBRUGSFORENINGEN,
    
      @SerializedName("JCB")
      JCB,
    
      @SerializedName("Laser")
      LASER,
    
      @SerializedName("Maestro")
      MAESTRO,
    
      @SerializedName("MasterCard")
      MASTERCARD,
    
      @SerializedName("Test Card")
      TEST_CARD,
    
      @SerializedName("Union Pay")
      UNION_PAY,
    
      @SerializedName("Unknown")
      UNKNOWN,
    
      @SerializedName("Visa")
      VISA,
    
      @SerializedName("Tarjeta Naranja")
      TARJETA_NARANJA,
    
    };
  
    public enum AccountType {
      UNDEFINED,
    
      @SerializedName("checking")
      CHECKING,
    
      @SerializedName("savings")
      SAVINGS,
    
    };
  
    public enum ErrorType {
      UNDEFINED,
    
      @SerializedName("bad_request")
      BAD_REQUEST,
    
      @SerializedName("immutable_subscription")
      IMMUTABLE_SUBSCRIPTION,
    
      @SerializedName("internal_server_error")
      INTERNAL_SERVER_ERROR,
    
      @SerializedName("invalid_api_key")
      INVALID_API_KEY,
    
      @SerializedName("invalid_api_version")
      INVALID_API_VERSION,
    
      @SerializedName("invalid_content_type")
      INVALID_CONTENT_TYPE,
    
      @SerializedName("invalid_permissions")
      INVALID_PERMISSIONS,
    
      @SerializedName("invalid_token")
      INVALID_TOKEN,
    
      @SerializedName("missing_feature")
      MISSING_FEATURE,
    
      @SerializedName("not_found")
      NOT_FOUND,
    
      @SerializedName("rate_limited")
      RATE_LIMITED,
    
      @SerializedName("service_not_available")
      SERVICE_NOT_AVAILABLE,
    
      @SerializedName("simultaneous_request")
      SIMULTANEOUS_REQUEST,
    
      @SerializedName("tax_service_error")
      TAX_SERVICE_ERROR,
    
      @SerializedName("transaction")
      TRANSACTION,
    
      @SerializedName("unauthorized")
      UNAUTHORIZED,
    
      @SerializedName("unavailable_in_api_version")
      UNAVAILABLE_IN_API_VERSION,
    
      @SerializedName("unknown_api_version")
      UNKNOWN_API_VERSION,
    
      @SerializedName("validation")
      VALIDATION,
    
    };
  
    public enum ErrorCategory {
      UNDEFINED,
    
      @SerializedName("three_d_secure_required")
      THREE_D_SECURE_REQUIRED,
    
      @SerializedName("three_d_secure_action_required")
      THREE_D_SECURE_ACTION_REQUIRED,
    
      @SerializedName("amazon")
      AMAZON,
    
      @SerializedName("api_error")
      API_ERROR,
    
      @SerializedName("approved")
      APPROVED,
    
      @SerializedName("communication")
      COMMUNICATION,
    
      @SerializedName("configuration")
      CONFIGURATION,
    
      @SerializedName("duplicate")
      DUPLICATE,
    
      @SerializedName("fraud")
      FRAUD,
    
      @SerializedName("hard")
      HARD,
    
      @SerializedName("invalid")
      INVALID,
    
      @SerializedName("not_enabled")
      NOT_ENABLED,
    
      @SerializedName("not_supported")
      NOT_SUPPORTED,
    
      @SerializedName("recurly")
      RECURLY,
    
      @SerializedName("referral")
      REFERRAL,
    
      @SerializedName("skles")
      SKLES,
    
      @SerializedName("soft")
      SOFT,
    
      @SerializedName("unknown")
      UNKNOWN,
    
    };
  
    public enum ErrorCode {
      UNDEFINED,
    
      @SerializedName("ach_cancel")
      ACH_CANCEL,
    
      @SerializedName("ach_chargeback")
      ACH_CHARGEBACK,
    
      @SerializedName("ach_credit_return")
      ACH_CREDIT_RETURN,
    
      @SerializedName("ach_exception")
      ACH_EXCEPTION,
    
      @SerializedName("ach_return")
      ACH_RETURN,
    
      @SerializedName("ach_transactions_not_supported")
      ACH_TRANSACTIONS_NOT_SUPPORTED,
    
      @SerializedName("ach_validation_exception")
      ACH_VALIDATION_EXCEPTION,
    
      @SerializedName("amazon_amount_exceeded")
      AMAZON_AMOUNT_EXCEEDED,
    
      @SerializedName("amazon_declined_review")
      AMAZON_DECLINED_REVIEW,
    
      @SerializedName("amazon_invalid_authorization_status")
      AMAZON_INVALID_AUTHORIZATION_STATUS,
    
      @SerializedName("amazon_invalid_close_attempt")
      AMAZON_INVALID_CLOSE_ATTEMPT,
    
      @SerializedName("amazon_invalid_create_order_reference")
      AMAZON_INVALID_CREATE_ORDER_REFERENCE,
    
      @SerializedName("amazon_invalid_order_status")
      AMAZON_INVALID_ORDER_STATUS,
    
      @SerializedName("amazon_not_authorized")
      AMAZON_NOT_AUTHORIZED,
    
      @SerializedName("amazon_order_not_modifiable")
      AMAZON_ORDER_NOT_MODIFIABLE,
    
      @SerializedName("amazon_transaction_count_exceeded")
      AMAZON_TRANSACTION_COUNT_EXCEEDED,
    
      @SerializedName("api_error")
      API_ERROR,
    
      @SerializedName("approved")
      APPROVED,
    
      @SerializedName("approved_fraud_review")
      APPROVED_FRAUD_REVIEW,
    
      @SerializedName("authorization_already_captured")
      AUTHORIZATION_ALREADY_CAPTURED,
    
      @SerializedName("authorization_amount_depleted")
      AUTHORIZATION_AMOUNT_DEPLETED,
    
      @SerializedName("authorization_expired")
      AUTHORIZATION_EXPIRED,
    
      @SerializedName("batch_processing_error")
      BATCH_PROCESSING_ERROR,
    
      @SerializedName("billing_agreement_already_accepted")
      BILLING_AGREEMENT_ALREADY_ACCEPTED,
    
      @SerializedName("billing_agreement_not_accepted")
      BILLING_AGREEMENT_NOT_ACCEPTED,
    
      @SerializedName("billing_agreement_not_found")
      BILLING_AGREEMENT_NOT_FOUND,
    
      @SerializedName("billing_agreement_replaced")
      BILLING_AGREEMENT_REPLACED,
    
      @SerializedName("call_issuer")
      CALL_ISSUER,
    
      @SerializedName("call_issuer_update_cardholder_data")
      CALL_ISSUER_UPDATE_CARDHOLDER_DATA,
    
      @SerializedName("cancelled")
      CANCELLED,
    
      @SerializedName("cannot_refund_unsettled_transactions")
      CANNOT_REFUND_UNSETTLED_TRANSACTIONS,
    
      @SerializedName("card_not_activated")
      CARD_NOT_ACTIVATED,
    
      @SerializedName("card_type_not_accepted")
      CARD_TYPE_NOT_ACCEPTED,
    
      @SerializedName("cardholder_requested_stop")
      CARDHOLDER_REQUESTED_STOP,
    
      @SerializedName("contact_gateway")
      CONTACT_GATEWAY,
    
      @SerializedName("contract_not_found")
      CONTRACT_NOT_FOUND,
    
      @SerializedName("currency_not_supported")
      CURRENCY_NOT_SUPPORTED,
    
      @SerializedName("customer_canceled_transaction")
      CUSTOMER_CANCELED_TRANSACTION,
    
      @SerializedName("cvv_required")
      CVV_REQUIRED,
    
      @SerializedName("declined")
      DECLINED,
    
      @SerializedName("declined_card_number")
      DECLINED_CARD_NUMBER,
    
      @SerializedName("declined_exception")
      DECLINED_EXCEPTION,
    
      @SerializedName("declined_expiration_date")
      DECLINED_EXPIRATION_DATE,
    
      @SerializedName("declined_missing_data")
      DECLINED_MISSING_DATA,
    
      @SerializedName("declined_saveable")
      DECLINED_SAVEABLE,
    
      @SerializedName("declined_security_code")
      DECLINED_SECURITY_CODE,
    
      @SerializedName("deposit_referenced_chargeback")
      DEPOSIT_REFERENCED_CHARGEBACK,
    
      @SerializedName("direct_debit_type_not_accepted")
      DIRECT_DEBIT_TYPE_NOT_ACCEPTED,
    
      @SerializedName("duplicate_transaction")
      DUPLICATE_TRANSACTION,
    
      @SerializedName("exceeds_daily_limit")
      EXCEEDS_DAILY_LIMIT,
    
      @SerializedName("exceeds_max_amount")
      EXCEEDS_MAX_AMOUNT,
    
      @SerializedName("expired_card")
      EXPIRED_CARD,
    
      @SerializedName("finbot_disconnect")
      FINBOT_DISCONNECT,
    
      @SerializedName("finbot_unavailable")
      FINBOT_UNAVAILABLE,
    
      @SerializedName("fraud_address")
      FRAUD_ADDRESS,
    
      @SerializedName("fraud_address_recurly")
      FRAUD_ADDRESS_RECURLY,
    
      @SerializedName("fraud_advanced_verification")
      FRAUD_ADVANCED_VERIFICATION,
    
      @SerializedName("fraud_gateway")
      FRAUD_GATEWAY,
    
      @SerializedName("fraud_generic")
      FRAUD_GENERIC,
    
      @SerializedName("fraud_ip_address")
      FRAUD_IP_ADDRESS,
    
      @SerializedName("fraud_manual_decision")
      FRAUD_MANUAL_DECISION,
    
      @SerializedName("fraud_risk_check")
      FRAUD_RISK_CHECK,
    
      @SerializedName("fraud_security_code")
      FRAUD_SECURITY_CODE,
    
      @SerializedName("fraud_stolen_card")
      FRAUD_STOLEN_CARD,
    
      @SerializedName("fraud_too_many_attempts")
      FRAUD_TOO_MANY_ATTEMPTS,
    
      @SerializedName("fraud_velocity")
      FRAUD_VELOCITY,
    
      @SerializedName("gateway_account_setup_incomplete")
      GATEWAY_ACCOUNT_SETUP_INCOMPLETE,
    
      @SerializedName("gateway_error")
      GATEWAY_ERROR,
    
      @SerializedName("gateway_rate_limited")
      GATEWAY_RATE_LIMITED,
    
      @SerializedName("gateway_timeout")
      GATEWAY_TIMEOUT,
    
      @SerializedName("gateway_token_not_found")
      GATEWAY_TOKEN_NOT_FOUND,
    
      @SerializedName("gateway_unavailable")
      GATEWAY_UNAVAILABLE,
    
      @SerializedName("gateway_validation_exception")
      GATEWAY_VALIDATION_EXCEPTION,
    
      @SerializedName("insufficient_funds")
      INSUFFICIENT_FUNDS,
    
      @SerializedName("invalid_account_number")
      INVALID_ACCOUNT_NUMBER,
    
      @SerializedName("invalid_amount")
      INVALID_AMOUNT,
    
      @SerializedName("invalid_billing_agreement_status")
      INVALID_BILLING_AGREEMENT_STATUS,
    
      @SerializedName("invalid_card_number")
      INVALID_CARD_NUMBER,
    
      @SerializedName("invalid_data")
      INVALID_DATA,
    
      @SerializedName("invalid_email")
      INVALID_EMAIL,
    
      @SerializedName("invalid_gateway_access_token")
      INVALID_GATEWAY_ACCESS_TOKEN,
    
      @SerializedName("invalid_gateway_configuration")
      INVALID_GATEWAY_CONFIGURATION,
    
      @SerializedName("invalid_issuer")
      INVALID_ISSUER,
    
      @SerializedName("invalid_login")
      INVALID_LOGIN,
    
      @SerializedName("invalid_merchant_type")
      INVALID_MERCHANT_TYPE,
    
      @SerializedName("invalid_name")
      INVALID_NAME,
    
      @SerializedName("invalid_payment_method")
      INVALID_PAYMENT_METHOD,
    
      @SerializedName("invalid_payment_method_hard")
      INVALID_PAYMENT_METHOD_HARD,
    
      @SerializedName("invalid_transaction")
      INVALID_TRANSACTION,
    
      @SerializedName("issuer_unavailable")
      ISSUER_UNAVAILABLE,
    
      @SerializedName("merch_max_transaction_limit_exceeded")
      MERCH_MAX_TRANSACTION_LIMIT_EXCEEDED,
    
      @SerializedName("moneybot_disconnect")
      MONEYBOT_DISCONNECT,
    
      @SerializedName("moneybot_unavailable")
      MONEYBOT_UNAVAILABLE,
    
      @SerializedName("no_billing_information")
      NO_BILLING_INFORMATION,
    
      @SerializedName("no_gateway")
      NO_GATEWAY,
    
      @SerializedName("no_gateway_found_for_transaction_amount")
      NO_GATEWAY_FOUND_FOR_TRANSACTION_AMOUNT,
    
      @SerializedName("partial_approval")
      PARTIAL_APPROVAL,
    
      @SerializedName("partial_credits_not_supported")
      PARTIAL_CREDITS_NOT_SUPPORTED,
    
      @SerializedName("payer_authentication_rejected")
      PAYER_AUTHENTICATION_REJECTED,
    
      @SerializedName("payment_cannot_void_authorization")
      PAYMENT_CANNOT_VOID_AUTHORIZATION,
    
      @SerializedName("payment_not_accepted")
      PAYMENT_NOT_ACCEPTED,
    
      @SerializedName("paypal_account_issue")
      PAYPAL_ACCOUNT_ISSUE,
    
      @SerializedName("paypal_cannot_pay_self")
      PAYPAL_CANNOT_PAY_SELF,
    
      @SerializedName("paypal_declined_use_alternate")
      PAYPAL_DECLINED_USE_ALTERNATE,
    
      @SerializedName("paypal_expired_reference_id")
      PAYPAL_EXPIRED_REFERENCE_ID,
    
      @SerializedName("paypal_hard_decline")
      PAYPAL_HARD_DECLINE,
    
      @SerializedName("paypal_invalid_billing_agreement")
      PAYPAL_INVALID_BILLING_AGREEMENT,
    
      @SerializedName("paypal_primary_declined")
      PAYPAL_PRIMARY_DECLINED,
    
      @SerializedName("processor_not_available")
      PROCESSOR_NOT_AVAILABLE,
    
      @SerializedName("processor_unavailable")
      PROCESSOR_UNAVAILABLE,
    
      @SerializedName("recurly_credentials_not_found")
      RECURLY_CREDENTIALS_NOT_FOUND,
    
      @SerializedName("recurly_error")
      RECURLY_ERROR,
    
      @SerializedName("recurly_failed_to_get_token")
      RECURLY_FAILED_TO_GET_TOKEN,
    
      @SerializedName("recurly_token_mismatch")
      RECURLY_TOKEN_MISMATCH,
    
      @SerializedName("recurly_token_not_found")
      RECURLY_TOKEN_NOT_FOUND,
    
      @SerializedName("reference_transactions_not_enabled")
      REFERENCE_TRANSACTIONS_NOT_ENABLED,
    
      @SerializedName("restricted_card")
      RESTRICTED_CARD,
    
      @SerializedName("restricted_card_chargeback")
      RESTRICTED_CARD_CHARGEBACK,
    
      @SerializedName("rjs_token_expired")
      RJS_TOKEN_EXPIRED,
    
      @SerializedName("roku_invalid_card_number")
      ROKU_INVALID_CARD_NUMBER,
    
      @SerializedName("roku_invalid_cib")
      ROKU_INVALID_CIB,
    
      @SerializedName("roku_invalid_payment_method")
      ROKU_INVALID_PAYMENT_METHOD,
    
      @SerializedName("roku_zip_code_mismatch")
      ROKU_ZIP_CODE_MISMATCH,
    
      @SerializedName("simultaneous")
      SIMULTANEOUS,
    
      @SerializedName("ssl_error")
      SSL_ERROR,
    
      @SerializedName("temporary_hold")
      TEMPORARY_HOLD,
    
      @SerializedName("three_d_secure_action_required")
      THREE_D_SECURE_ACTION_REQUIRED,
    
      @SerializedName("three_d_secure_action_result_token_mismatch")
      THREE_D_SECURE_ACTION_RESULT_TOKEN_MISMATCH,
    
      @SerializedName("three_d_secure_authentication")
      THREE_D_SECURE_AUTHENTICATION,
    
      @SerializedName("three_d_secure_connection_error")
      THREE_D_SECURE_CONNECTION_ERROR,
    
      @SerializedName("three_d_secure_credential_error")
      THREE_D_SECURE_CREDENTIAL_ERROR,
    
      @SerializedName("three_d_secure_not_supported")
      THREE_D_SECURE_NOT_SUPPORTED,
    
      @SerializedName("too_busy")
      TOO_BUSY,
    
      @SerializedName("too_many_attempts")
      TOO_MANY_ATTEMPTS,
    
      @SerializedName("total_credit_exceeds_capture")
      TOTAL_CREDIT_EXCEEDS_CAPTURE,
    
      @SerializedName("transaction_already_refunded")
      TRANSACTION_ALREADY_REFUNDED,
    
      @SerializedName("transaction_already_voided")
      TRANSACTION_ALREADY_VOIDED,
    
      @SerializedName("transaction_cannot_be_authorized")
      TRANSACTION_CANNOT_BE_AUTHORIZED,
    
      @SerializedName("transaction_cannot_be_refunded")
      TRANSACTION_CANNOT_BE_REFUNDED,
    
      @SerializedName("transaction_cannot_be_refunded_currently")
      TRANSACTION_CANNOT_BE_REFUNDED_CURRENTLY,
    
      @SerializedName("transaction_cannot_be_voided")
      TRANSACTION_CANNOT_BE_VOIDED,
    
      @SerializedName("transaction_failed_to_settle")
      TRANSACTION_FAILED_TO_SETTLE,
    
      @SerializedName("transaction_not_found")
      TRANSACTION_NOT_FOUND,
    
      @SerializedName("transaction_service_v2_disconnect")
      TRANSACTION_SERVICE_V2_DISCONNECT,
    
      @SerializedName("transaction_service_v2_unavailable")
      TRANSACTION_SERVICE_V2_UNAVAILABLE,
    
      @SerializedName("transaction_settled")
      TRANSACTION_SETTLED,
    
      @SerializedName("transaction_stale_at_gateway")
      TRANSACTION_STALE_AT_GATEWAY,
    
      @SerializedName("try_again")
      TRY_AGAIN,
    
      @SerializedName("unknown")
      UNKNOWN,
    
      @SerializedName("unmapped_partner_error")
      UNMAPPED_PARTNER_ERROR,
    
      @SerializedName("vaultly_service_unavailable")
      VAULTLY_SERVICE_UNAVAILABLE,
    
      @SerializedName("zero_dollar_auth_not_supported")
      ZERO_DOLLAR_AUTH_NOT_SUPPORTED,
    
    };
  
    public enum TaxIdentifierType {
      UNDEFINED,
    
      @SerializedName("cpf")
      CPF,
    
      @SerializedName("cnpj")
      CNPJ,
    
      @SerializedName("cuit")
      CUIT,
    
    };
  
    public enum DunningCycleType {
      UNDEFINED,
    
      @SerializedName("automatic")
      AUTOMATIC,
    
      @SerializedName("manual")
      MANUAL,
    
      @SerializedName("trial")
      TRIAL,
    
    };
  
    public enum AchType {
      UNDEFINED,
    
      @SerializedName("bacs")
      BACS,
    
      @SerializedName("becs")
      BECS,
    
    };
  
    public enum AchAccountType {
      UNDEFINED,
    
      @SerializedName("checking")
      CHECKING,
    
      @SerializedName("savings")
      SAVINGS,
    
    };
  
    public enum ExternalHppType {
      UNDEFINED,
    
      @SerializedName("adyen")
      ADYEN,
    
    };
  
    public enum OnlineBankingPaymentType {
      UNDEFINED,
    
      @SerializedName("ideal")
      IDEAL,
    
      @SerializedName("sofort")
      SOFORT,
    
    };
  
}
