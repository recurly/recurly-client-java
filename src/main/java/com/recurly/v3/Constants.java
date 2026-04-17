/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3;

public class Constants {
  
    public static class ProrationSettingsCharge {
    
      public static final String FULL_AMOUNT = "full_amount";
    
      public static final String PRORATED_AMOUNT = "prorated_amount";
    
      public static final String NONE = "none";
    
    }
  
    public static class ProrationSettingsCredit {
    
      public static final String FULL_AMOUNT = "full_amount";
    
      public static final String PRORATED_AMOUNT = "prorated_amount";
    
      public static final String NONE = "none";
    
    }
  
    public static class SubscriptionCreateProrationSettingsCharge {
    
      public static final String FULL_AMOUNT = "full_amount";
    
      public static final String PRORATED_AMOUNT = "prorated_amount";
    
    }
  
    public static class RelatedType {
    
      public static final String ACCOUNT = "account";
    
      public static final String ITEM = "item";
    
      public static final String PLAN = "plan";
    
      public static final String SUBSCRIPTION = "subscription";
    
      public static final String CHARGE = "charge";
    
    }
  
    public static class RefundType {
    
      public static final String FULL = "full";
    
      public static final String NONE = "none";
    
      public static final String PARTIAL = "partial";
    
    }
  
    public static class AlphanumericSort {
    
      public static final String ASC = "asc";
    
      public static final String DESC = "desc";
    
    }
  
    public static class UsageSort {
    
      public static final String RECORDED_TIMESTAMP = "recorded_timestamp";
    
      public static final String USAGE_TIMESTAMP = "usage_timestamp";
    
    }
  
    public static class UsageType {
    
      public static final String PRICE = "price";
    
      public static final String PERCENTAGE = "percentage";
    
    }
  
    public static class UsageCalculationType {
    
      public static final String CUMULATIVE = "cumulative";
    
      public static final String LAST_IN_PERIOD = "last_in_period";
    
    }
  
    public static class BillingStatus {
    
      public static final String UNBILLED = "unbilled";
    
      public static final String BILLED = "billed";
    
      public static final String ALL = "all";
    
    }
  
    public static class TimestampSort {
    
      public static final String CREATED_AT = "created_at";
    
      public static final String UPDATED_AT = "updated_at";
    
    }
  
    public static class ActiveState {
    
      public static final String ACTIVE = "active";
    
      public static final String INACTIVE = "inactive";
    
    }
  
    public static class FilterSubscriptionState {
    
      public static final String ACTIVE = "active";
    
      public static final String CANCELED = "canceled";
    
      public static final String EXPIRED = "expired";
    
      public static final String FUTURE = "future";
    
      public static final String IN_TRIAL = "in_trial";
    
      public static final String LIVE = "live";
    
    }
  
    public static class FilterLimitedSubscriptionState {
    
      public static final String ACTIVE = "active";
    
      public static final String CANCELED = "canceled";
    
      public static final String EXPIRED = "expired";
    
      public static final String FUTURE = "future";
    
    }
  
    public static class True {
    
      public static final String TRUE = "true";
    
    }
  
    public static class LineItemState {
    
      public static final String INVOICED = "invoiced";
    
      public static final String PENDING = "pending";
    
    }
  
    public static class LineItemType {
    
      public static final String CHARGE = "charge";
    
      public static final String CREDIT = "credit";
    
    }
  
    public static class VertexTransactionType {
    
      public static final String SALE = "sale";
    
      public static final String RENTAL = "rental";
    
      public static final String LEASE = "lease";
    
    }
  
    public static class FilterTransactionType {
    
      public static final String AUTHORIZATION = "authorization";
    
      public static final String CAPTURE = "capture";
    
      public static final String PAYMENT = "payment";
    
      public static final String PURCHASE = "purchase";
    
      public static final String REFUND = "refund";
    
      public static final String VERIFY = "verify";
    
    }
  
    public static class FilterInvoiceType {
    
      public static final String CHARGE = "charge";
    
      public static final String CREDIT = "credit";
    
      public static final String LEGACY = "legacy";
    
      public static final String NON_LEGACY = "non-legacy";
    
    }
  
    public static class FilterRedeemed {
    
      public static final String TRUE = "true";
    
      public static final String FALSE = "false";
    
    }
  
    public static class Channel {
    
      public static final String ADVERTISING = "advertising";
    
      public static final String BLOG = "blog";
    
      public static final String DIRECT_TRAFFIC = "direct_traffic";
    
      public static final String EMAIL = "email";
    
      public static final String EVENTS = "events";
    
      public static final String MARKETING_CONTENT = "marketing_content";
    
      public static final String ORGANIC_SEARCH = "organic_search";
    
      public static final String OTHER = "other";
    
      public static final String OUTBOUND_SALES = "outbound_sales";
    
      public static final String PAID_SEARCH = "paid_search";
    
      public static final String PUBLIC_RELATIONS = "public_relations";
    
      public static final String REFERRAL = "referral";
    
      public static final String SOCIAL_MEDIA = "social_media";
    
    }
  
    public static class PreferredLocale {
    
      public static final String DA_DK = "da-DK";
    
      public static final String DE_CH = "de-CH";
    
      public static final String DE_DE = "de-DE";
    
      public static final String EN_AU = "en-AU";
    
      public static final String EN_CA = "en-CA";
    
      public static final String EN_GB = "en-GB";
    
      public static final String EN_IE = "en-IE";
    
      public static final String EN_NZ = "en-NZ";
    
      public static final String EN_US = "en-US";
    
      public static final String ES_ES = "es-ES";
    
      public static final String ES_MX = "es-MX";
    
      public static final String ES_US = "es-US";
    
      public static final String FI_FI = "fi-FI";
    
      public static final String FR_BE = "fr-BE";
    
      public static final String FR_CA = "fr-CA";
    
      public static final String FR_CH = "fr-CH";
    
      public static final String FR_FR = "fr-FR";
    
      public static final String HI_IN = "hi-IN";
    
      public static final String IT_IT = "it-IT";
    
      public static final String JA_JP = "ja-JP";
    
      public static final String KO_KR = "ko-KR";
    
      public static final String NL_BE = "nl-BE";
    
      public static final String NL_NL = "nl-NL";
    
      public static final String PL_PL = "pl-PL";
    
      public static final String PT_BR = "pt-BR";
    
      public static final String PT_PT = "pt-PT";
    
      public static final String RO_RO = "ro-RO";
    
      public static final String RU_RU = "ru-RU";
    
      public static final String SK_SK = "sk-SK";
    
      public static final String SV_SE = "sv-SE";
    
      public static final String TR_TR = "tr-TR";
    
      public static final String ZH_CN = "zh-CN";
    
    }
  
    public static class BillTo {
    
      public static final String PARENT = "parent";
    
      public static final String SELF = "self";
    
    }
  
    public static class DeliveryMethod {
    
      public static final String EMAIL = "email";
    
      public static final String POST = "post";
    
    }
  
    public static class PaymentGatewayReferences {
    
      public static final String STRIPE_CONFIRMATION_TOKEN = "stripe_confirmation_token";
    
      public static final String UPI_VPA = "upi_vpa";
    
    }
  
    public static class GatewayTransactionType {
    
      public static final String MOTO = "moto";
    
    }
  
    public static class KountDecision {
    
      public static final String APPROVE = "approve";
    
      public static final String DECLINE = "decline";
    
      public static final String ESCALATE = "escalate";
    
      public static final String REVIEW = "review";
    
    }
  
    public static class CouponState {
    
      public static final String EXPIRED = "expired";
    
      public static final String MAXED_OUT = "maxed_out";
    
      public static final String REDEEMABLE = "redeemable";
    
    }
  
    public static class CouponDuration {
    
      public static final String FOREVER = "forever";
    
      public static final String SINGLE_USE = "single_use";
    
      public static final String TEMPORAL = "temporal";
    
    }
  
    public static class TemporalUnit {
    
      public static final String DAY = "day";
    
      public static final String MONTH = "month";
    
      public static final String WEEK = "week";
    
      public static final String YEAR = "year";
    
    }
  
    public static class FreeTrialUnit {
    
      public static final String DAY = "day";
    
      public static final String MONTH = "month";
    
      public static final String WEEK = "week";
    
    }
  
    public static class RedemptionResource {
    
      public static final String ACCOUNT = "account";
    
      public static final String SUBSCRIPTION = "subscription";
    
    }
  
    public static class CouponType {
    
      public static final String BULK = "bulk";
    
      public static final String SINGLE_CODE = "single_code";
    
    }
  
    public static class DiscountType {
    
      public static final String FIXED = "fixed";
    
      public static final String FREE_TRIAL = "free_trial";
    
      public static final String PERCENT = "percent";
    
    }
  
    public static class AddOnSource {
    
      public static final String PLAN_ADD_ON = "plan_add_on";
    
      public static final String ITEM = "item";
    
    }
  
    public static class AddOnType {
    
      public static final String FIXED = "fixed";
    
      public static final String USAGE = "usage";
    
    }
  
    public static class AddOnTypeCreate {
    
      public static final String FIXED = "fixed";
    
      public static final String USAGE = "usage";
    
    }
  
    public static class UsageTypeCreate {
    
      public static final String PRICE = "price";
    
      public static final String PERCENTAGE = "percentage";
    
    }
  
    public static class TierType {
    
      public static final String FLAT = "flat";
    
      public static final String TIERED = "tiered";
    
      public static final String STAIRSTEP = "stairstep";
    
      public static final String VOLUME = "volume";
    
    }
  
    public static class UsageTimeframe {
    
      public static final String BILLING_PERIOD = "billing_period";
    
      public static final String SUBSCRIPTION_TERM = "subscription_term";
    
    }
  
    public static class UsageTimeframeCreate {
    
      public static final String BILLING_PERIOD = "billing_period";
    
      public static final String SUBSCRIPTION_TERM = "subscription_term";
    
    }
  
    public static class CreditPaymentAction {
    
      public static final String PAYMENT = "payment";
    
      public static final String REDUCTION = "reduction";
    
      public static final String REFUND = "refund";
    
      public static final String WRITE_OFF = "write_off";
    
    }
  
    public static class UserAccess {
    
      public static final String API_ONLY = "api_only";
    
      public static final String READ_ONLY = "read_only";
    
      public static final String WRITE = "write";
    
      public static final String SET_ONLY = "set_only";
    
    }
  
    public static class PricingModelType {
    
      public static final String FIXED = "fixed";
    
      public static final String RAMP = "ramp";
    
    }
  
    public static class RevenueScheduleType {
    
      public static final String AT_RANGE_END = "at_range_end";
    
      public static final String AT_RANGE_START = "at_range_start";
    
      public static final String EVENLY = "evenly";
    
      public static final String NEVER = "never";
    
    }
  
    public static class NetTermsType {
    
      public static final String NET = "net";
    
      public static final String EOM = "eom";
    
    }
  
    public static class InvoiceType {
    
      public static final String CHARGE = "charge";
    
      public static final String CREDIT = "credit";
    
      public static final String LEGACY = "legacy";
    
    }
  
    public static class Origin {
    
      public static final String CARRYFORWARD_CREDIT = "carryforward_credit";
    
      public static final String CARRYFORWARD_GIFT_CREDIT = "carryforward_gift_credit";
    
      public static final String CREDIT = "credit";
    
      public static final String EXTERNAL_REFUND = "external_refund";
    
      public static final String GIFT_CARD = "gift_card";
    
      public static final String IMMEDIATE_CHANGE = "immediate_change";
    
      public static final String IMPORT = "import";
    
      public static final String LINE_ITEM_REFUND = "line_item_refund";
    
      public static final String OPEN_AMOUNT_REFUND = "open_amount_refund";
    
      public static final String PREPAYMENT = "prepayment";
    
      public static final String PURCHASE = "purchase";
    
      public static final String REFUND = "refund";
    
      public static final String RENEWAL = "renewal";
    
      public static final String TERMINATION = "termination";
    
      public static final String USAGE_CORRECTION = "usage_correction";
    
      public static final String WRITE_OFF = "write_off";
    
    }
  
    public static class InvoiceState {
    
      public static final String OPEN = "open";
    
      public static final String PENDING = "pending";
    
      public static final String PROCESSING = "processing";
    
      public static final String PAST_DUE = "past_due";
    
      public static final String PAID = "paid";
    
      public static final String CLOSED = "closed";
    
      public static final String FAILED = "failed";
    
      public static final String VOIDED = "voided";
    
    }
  
    public static class InvoiceStateQueryParam {
    
      public static final String PENDING = "pending";
    
      public static final String PROCESSING = "processing";
    
      public static final String PAST_DUE = "past_due";
    
      public static final String PAID = "paid";
    
      public static final String FAILED = "failed";
    
      public static final String OPEN = "open";
    
      public static final String CLOSED = "closed";
    
      public static final String VOIDED = "voided";
    
    }
  
    public static class CollectionMethod {
    
      public static final String AUTOMATIC = "automatic";
    
      public static final String MANUAL = "manual";
    
    }
  
    public static class CreditApplicationMode {
    
      public static final String ALL = "all";
    
      public static final String NONE = "none";
    
    }
  
    public static class CreditApplicationAllowedOriginType {
    
      public static final String LINE_ITEM_REFUND = "line_item_refund";
    
      public static final String OPEN_AMOUNT_REFUND = "open_amount_refund";
    
      public static final String IMMEDIATE_CHANGE = "immediate_change";
    
      public static final String TERMINATION = "termination";
    
      public static final String CREDIT = "credit";
    
      public static final String WRITE_OFF = "write_off";
    
      public static final String REFUND = "refund";
    
      public static final String EXTERNAL_REFUND = "external_refund";
    
      public static final String CARRYFORWARD_CREDIT = "carryforward_credit";
    
      public static final String USAGE_CORRECTION = "usage_correction";
    
      public static final String PREPAYMENT = "prepayment";
    
      public static final String GIFT_CARD = "gift_card";
    
      public static final String CARRYFORWARD_GIFT_CREDIT = "carryforward_gift_credit";
    
    }
  
    public static class InvoiceRefundType {
    
      public static final String AMOUNT = "amount";
    
      public static final String PERCENTAGE = "percentage";
    
      public static final String LINE_ITEMS = "line_items";
    
    }
  
    public static class RefundMethod {
    
      public static final String ALL_CREDIT = "all_credit";
    
      public static final String ALL_TRANSACTION = "all_transaction";
    
      public static final String CREDIT_FIRST = "credit_first";
    
      public static final String TRANSACTION_FIRST = "transaction_first";
    
    }
  
    public static class ExternalPaymentMethod {
    
      public static final String BACS = "bacs";
    
      public static final String ACH = "ach";
    
      public static final String AMAZON = "amazon";
    
      public static final String APPLE_PAY = "apple_pay";
    
      public static final String BRAINTREE_APPLE_PAY = "braintree_apple_pay";
    
      public static final String CHECK = "check";
    
      public static final String CREDIT_CARD = "credit_card";
    
      public static final String EFT = "eft";
    
      public static final String GOOGLE_PAY = "google_pay";
    
      public static final String MERCADOPAGO = "mercadopago";
    
      public static final String MONEY_ORDER = "money_order";
    
      public static final String OTHER = "other";
    
      public static final String PAYPAL = "paypal";
    
      public static final String PIX_AUTOMATICO = "pix_automatico";
    
      public static final String ROKU = "roku";
    
      public static final String SEPADIRECTDEBIT = "sepadirectdebit";
    
      public static final String WIRE_TRANSFER = "wire_transfer";
    
    }
  
    public static class LineItemRevenueScheduleType {
    
      public static final String AT_INVOICE = "at_invoice";
    
      public static final String AT_RANGE_END = "at_range_end";
    
      public static final String AT_RANGE_START = "at_range_start";
    
      public static final String EVENLY = "evenly";
    
      public static final String NEVER = "never";
    
    }
  
    public static class LegacyCategory {
    
      public static final String APPLIED_CREDIT = "applied_credit";
    
      public static final String CARRYFORWARD = "carryforward";
    
      public static final String CHARGE = "charge";
    
      public static final String CREDIT = "credit";
    
    }
  
    public static class LineItemOrigin {
    
      public static final String ADD_ON = "add_on";
    
      public static final String ADD_ON_TRIAL = "add_on_trial";
    
      public static final String CARRYFORWARD = "carryforward";
    
      public static final String COUPON = "coupon";
    
      public static final String CREDIT = "credit";
    
      public static final String DEBIT = "debit";
    
      public static final String ONE_TIME = "one_time";
    
      public static final String PLAN = "plan";
    
      public static final String PLAN_TRIAL = "plan_trial";
    
      public static final String SETUP_FEE = "setup_fee";
    
      public static final String PREPAYMENT = "prepayment";
    
    }
  
    public static class FullCreditReasonCode {
    
      public static final String GENERAL = "general";
    
      public static final String GIFT_CARD = "gift_card";
    
      public static final String PROMOTIONAL = "promotional";
    
      public static final String REFUND = "refund";
    
      public static final String SERVICE = "service";
    
      public static final String WRITE_OFF = "write_off";
    
    }
  
    public static class PartialCreditReasonCode {
    
      public static final String GENERAL = "general";
    
      public static final String PROMOTIONAL = "promotional";
    
      public static final String SERVICE = "service";
    
    }
  
    public static class LineItemCreateOrigin {
    
      public static final String EXTERNAL_GIFT_CARD = "external_gift_card";
    
      public static final String PREPAYMENT = "prepayment";
    
    }
  
    public static class IntervalUnit {
    
      public static final String DAYS = "days";
    
      public static final String MONTHS = "months";
    
    }
  
    public static class AddressRequirement {
    
      public static final String FULL = "full";
    
      public static final String NONE = "none";
    
      public static final String STREETZIP = "streetzip";
    
      public static final String ZIP = "zip";
    
    }
  
    public static class SiteMode {
    
      public static final String DEVELOPMENT = "development";
    
      public static final String PRODUCTION = "production";
    
      public static final String SANDBOX = "sandbox";
    
    }
  
    public static class Features {
    
      public static final String CREDIT_MEMOS = "credit_memos";
    
      public static final String MANUAL_INVOICING = "manual_invoicing";
    
      public static final String ONLY_BILL_WHAT_CHANGED = "only_bill_what_changed";
    
      public static final String SUBSCRIPTION_TERMS = "subscription_terms";
    
    }
  
    public static class SubscriptionState {
    
      public static final String ACTIVE = "active";
    
      public static final String CANCELED = "canceled";
    
      public static final String EXPIRED = "expired";
    
      public static final String FAILED = "failed";
    
      public static final String FUTURE = "future";
    
      public static final String PAUSED = "paused";
    
    }
  
    public static class Timeframe {
    
      public static final String BILL_DATE = "bill_date";
    
      public static final String TERM_END = "term_end";
    
    }
  
    public static class ChangeTimeframe {
    
      public static final String BILL_DATE = "bill_date";
    
      public static final String NOW = "now";
    
      public static final String RENEWAL = "renewal";
    
      public static final String TERM_END = "term_end";
    
    }
  
    public static class TransactionType {
    
      public static final String AUTHORIZATION = "authorization";
    
      public static final String CAPTURE = "capture";
    
      public static final String PURCHASE = "purchase";
    
      public static final String REFUND = "refund";
    
      public static final String VERIFY = "verify";
    
    }
  
    public static class TransactionOrigin {
    
      public static final String API = "api";
    
      public static final String CHARGEBACK = "chargeback";
    
      public static final String EXTERNAL_RECOVERY = "external_recovery";
    
      public static final String FORCE_COLLECT = "force_collect";
    
      public static final String HPP = "hpp";
    
      public static final String MERCHANT = "merchant";
    
      public static final String RECURLY_ADMIN = "recurly_admin";
    
      public static final String RECURLYJS = "recurlyjs";
    
      public static final String RECURRING = "recurring";
    
      public static final String REFUNDED_EXTERNALLY = "refunded_externally";
    
      public static final String TRANSPARENT = "transparent";
    
      public static final String TOKEN_API = "token_api";
    
      public static final String API_FORCE_COLLECT = "api_force_collect";
    
      public static final String API_SUB_CHANGE = "api_sub_change";
    
      public static final String API_VERIFY_CARD = "api_verify_card";
    
      public static final String REFUND_BALANCE = "refund_balance";
    
      public static final String AMAZON_V2_IPN = "amazon_v2_ipn";
    
    }
  
    public static class TransactionStatus {
    
      public static final String CHARGEBACK = "chargeback";
    
      public static final String DECLINED = "declined";
    
      public static final String ERROR = "error";
    
      public static final String PENDING = "pending";
    
      public static final String PROCESSING = "processing";
    
      public static final String SCHEDULED = "scheduled";
    
      public static final String SUCCESS = "success";
    
      public static final String VOID = "void";
    
    }
  
    public static class NextActionType {
    
      public static final String QR_CODE = "qr_code";
    
    }
  
    public static class CvvCheck {
    
      public static final String D = "D";
    
      public static final String I = "I";
    
      public static final String M = "M";
    
      public static final String N = "N";
    
      public static final String P = "P";
    
      public static final String S = "S";
    
      public static final String U = "U";
    
      public static final String X = "X";
    
    }
  
    public static class AvsCheck {
    
      public static final String A = "A";
    
      public static final String B = "B";
    
      public static final String C = "C";
    
      public static final String D = "D";
    
      public static final String E = "E";
    
      public static final String F = "F";
    
      public static final String G = "G";
    
      public static final String H = "H";
    
      public static final String I = "I";
    
      public static final String J = "J";
    
      public static final String K = "K";
    
      public static final String L = "L";
    
      public static final String M = "M";
    
      public static final String N = "N";
    
      public static final String O = "O";
    
      public static final String P = "P";
    
      public static final String Q = "Q";
    
      public static final String R = "R";
    
      public static final String S = "S";
    
      public static final String T = "T";
    
      public static final String U = "U";
    
      public static final String V = "V";
    
      public static final String W = "W";
    
      public static final String X = "X";
    
      public static final String Y = "Y";
    
      public static final String Z = "Z";
    
    }
  
    public static class CouponCodeState {
    
      public static final String EXPIRED = "expired";
    
      public static final String INACTIVE = "inactive";
    
      public static final String MAXED_OUT = "maxed_out";
    
      public static final String REDEEMABLE = "redeemable";
    
    }
  
    public static class PaymentMethod {
    
      public static final String BACS = "bacs";
    
      public static final String AMAZON = "amazon";
    
      public static final String AMAZON_BILLING_AGREEMENT = "amazon_billing_agreement";
    
      public static final String APPLE_PAY = "apple_pay";
    
      public static final String APPLE_PAY_MERCHANT_TOKEN = "apple_pay_merchant_token";
    
      public static final String BANK_ACCOUNT_INFO = "bank_account_info";
    
      public static final String BRAINTREE_APPLE_PAY = "braintree_apple_pay";
    
      public static final String CHECK = "check";
    
      public static final String CREDIT_CARD = "credit_card";
    
      public static final String EFT = "eft";
    
      public static final String GATEWAY_TOKEN = "gateway_token";
    
      public static final String GOOGLE_PAY = "google_pay";
    
      public static final String GOOGLE_PAY_DEVICE_PAN = "google_pay_device_pan";
    
      public static final String IBAN_BANK_ACCOUNT = "iban_bank_account";
    
      public static final String MONEY_ORDER = "money_order";
    
      public static final String OTHER = "other";
    
      public static final String PAYPAL = "paypal";
    
      public static final String PAYPAL_BILLING_AGREEMENT = "paypal_billing_agreement";
    
      public static final String ROKU = "roku";
    
      public static final String SEPADIRECTDEBIT = "sepadirectdebit";
    
      public static final String VENMO = "venmo";
    
      public static final String WIRE_TRANSFER = "wire_transfer";
    
      public static final String BRAINTREE_V_ZERO = "braintree_v_zero";
    
      public static final String BOLETO = "boleto";
    
      public static final String CASH_APP = "cash_app";
    
      public static final String UPI_AUTOPAY = "upi_autopay";
    
      public static final String PIX_AUTOMATICO = "pix_automatico";
    
      public static final String MERCADOPAGO = "mercadopago";
    
      public static final String KLARNA = "klarna";
    
      public static final String BRAINTREE_GOOGLE_PAY = "braintree_google_pay";
    
    }
  
    public static class CardType {
    
      public static final String AMERICAN_EXPRESS = "American Express";
    
      public static final String DANKORT = "Dankort";
    
      public static final String DINERS_CLUB = "Diners Club";
    
      public static final String DISCOVER = "Discover";
    
      public static final String ELO = "ELO";
    
      public static final String FORBRUGSFORENINGEN = "Forbrugsforeningen";
    
      public static final String HIPERCARD = "Hipercard";
    
      public static final String JCB = "JCB";
    
      public static final String LASER = "Laser";
    
      public static final String MAESTRO = "Maestro";
    
      public static final String MASTERCARD = "MasterCard";
    
      public static final String TEST_CARD = "Test Card";
    
      public static final String UNION_PAY = "Union Pay";
    
      public static final String UNKNOWN = "Unknown";
    
      public static final String VISA = "Visa";
    
      public static final String TARJETA_NARANJA = "Tarjeta Naranja";
    
    }
  
    public static class CardNetwork {
    
      public static final String BANCONTACT = "Bancontact";
    
      public static final String CARTESBANCAIRES = "CartesBancaires";
    
      public static final String DANKORT = "Dankort";
    
      public static final String MASTERCARD = "MasterCard";
    
      public static final String VISA = "Visa";
    
    }
  
    public static class CardFundingSource {
    
      public static final String CREDIT = "credit";
    
      public static final String DEBIT = "debit";
    
      public static final String CHARGE = "charge";
    
      public static final String PREPAID = "prepaid";
    
      public static final String DEFERRED_DEBIT = "deferred_debit";
    
    }
  
    public static class AccountType {
    
      public static final String CHECKING = "checking";
    
      public static final String SAVINGS = "savings";
    
    }
  
    public static class ErrorType {
    
      public static final String BAD_REQUEST = "bad_request";
    
      public static final String IMMUTABLE_SUBSCRIPTION = "immutable_subscription";
    
      public static final String INTERNAL_SERVER_ERROR = "internal_server_error";
    
      public static final String INVALID_API_KEY = "invalid_api_key";
    
      public static final String INVALID_API_VERSION = "invalid_api_version";
    
      public static final String INVALID_CONTENT_TYPE = "invalid_content_type";
    
      public static final String INVALID_PERMISSIONS = "invalid_permissions";
    
      public static final String INVALID_TOKEN = "invalid_token";
    
      public static final String MISSING_FEATURE = "missing_feature";
    
      public static final String NOT_FOUND = "not_found";
    
      public static final String RATE_LIMITED = "rate_limited";
    
      public static final String SERVICE_NOT_AVAILABLE = "service_not_available";
    
      public static final String SIMULTANEOUS_REQUEST = "simultaneous_request";
    
      public static final String TAX_SERVICE_ERROR = "tax_service_error";
    
      public static final String TRANSACTION = "transaction";
    
      public static final String UNAUTHORIZED = "unauthorized";
    
      public static final String UNAVAILABLE_IN_API_VERSION = "unavailable_in_api_version";
    
      public static final String UNKNOWN_API_VERSION = "unknown_api_version";
    
      public static final String VALIDATION = "validation";
    
    }
  
    public static class ErrorCategory {
    
      public static final String THREE_D_SECURE_REQUIRED = "three_d_secure_required";
    
      public static final String THREE_D_SECURE_ACTION_REQUIRED = "three_d_secure_action_required";
    
      public static final String AMAZON = "amazon";
    
      public static final String API_ERROR = "api_error";
    
      public static final String APPROVED = "approved";
    
      public static final String COMMUNICATION = "communication";
    
      public static final String CONFIGURATION = "configuration";
    
      public static final String DUPLICATE = "duplicate";
    
      public static final String FRAUD = "fraud";
    
      public static final String HARD = "hard";
    
      public static final String INVALID = "invalid";
    
      public static final String NOT_ENABLED = "not_enabled";
    
      public static final String NOT_SUPPORTED = "not_supported";
    
      public static final String RECURLY = "recurly";
    
      public static final String REFERRAL = "referral";
    
      public static final String SKLES = "skles";
    
      public static final String SOFT = "soft";
    
      public static final String UNKNOWN = "unknown";
    
    }
  
    public static class ErrorCode {
    
      public static final String ACH_CANCEL = "ach_cancel";
    
      public static final String ACH_CHARGEBACK = "ach_chargeback";
    
      public static final String ACH_CREDIT_RETURN = "ach_credit_return";
    
      public static final String ACH_EXCEPTION = "ach_exception";
    
      public static final String ACH_RETURN = "ach_return";
    
      public static final String ACH_TRANSACTIONS_NOT_SUPPORTED = "ach_transactions_not_supported";
    
      public static final String ACH_VALIDATION_EXCEPTION = "ach_validation_exception";
    
      public static final String AMAZON_AMOUNT_EXCEEDED = "amazon_amount_exceeded";
    
      public static final String AMAZON_DECLINED_REVIEW = "amazon_declined_review";
    
      public static final String AMAZON_INVALID_AUTHORIZATION_STATUS = "amazon_invalid_authorization_status";
    
      public static final String AMAZON_INVALID_CLOSE_ATTEMPT = "amazon_invalid_close_attempt";
    
      public static final String AMAZON_INVALID_CREATE_ORDER_REFERENCE = "amazon_invalid_create_order_reference";
    
      public static final String AMAZON_INVALID_ORDER_STATUS = "amazon_invalid_order_status";
    
      public static final String AMAZON_NOT_AUTHORIZED = "amazon_not_authorized";
    
      public static final String AMAZON_ORDER_NOT_MODIFIABLE = "amazon_order_not_modifiable";
    
      public static final String AMAZON_TRANSACTION_COUNT_EXCEEDED = "amazon_transaction_count_exceeded";
    
      public static final String API_ERROR = "api_error";
    
      public static final String APPROVED = "approved";
    
      public static final String APPROVED_FRAUD_REVIEW = "approved_fraud_review";
    
      public static final String AUTHORIZATION_ALREADY_CAPTURED = "authorization_already_captured";
    
      public static final String AUTHORIZATION_AMOUNT_DEPLETED = "authorization_amount_depleted";
    
      public static final String AUTHORIZATION_EXPIRED = "authorization_expired";
    
      public static final String BATCH_PROCESSING_ERROR = "batch_processing_error";
    
      public static final String BILLING_AGREEMENT_ALREADY_ACCEPTED = "billing_agreement_already_accepted";
    
      public static final String BILLING_AGREEMENT_NOT_ACCEPTED = "billing_agreement_not_accepted";
    
      public static final String BILLING_AGREEMENT_NOT_FOUND = "billing_agreement_not_found";
    
      public static final String BILLING_AGREEMENT_REPLACED = "billing_agreement_replaced";
    
      public static final String CALL_ISSUER = "call_issuer";
    
      public static final String CALL_ISSUER_UPDATE_CARDHOLDER_DATA = "call_issuer_update_cardholder_data";
    
      public static final String CANCELLED = "cancelled";
    
      public static final String CANNOT_REFUND_UNSETTLED_TRANSACTIONS = "cannot_refund_unsettled_transactions";
    
      public static final String CARD_NOT_ACTIVATED = "card_not_activated";
    
      public static final String CARD_TYPE_NOT_ACCEPTED = "card_type_not_accepted";
    
      public static final String CARDHOLDER_REQUESTED_STOP = "cardholder_requested_stop";
    
      public static final String CONTACT_GATEWAY = "contact_gateway";
    
      public static final String CONTRACT_NOT_FOUND = "contract_not_found";
    
      public static final String CURRENCY_NOT_SUPPORTED = "currency_not_supported";
    
      public static final String CUSTOMER_CANCELED_TRANSACTION = "customer_canceled_transaction";
    
      public static final String CVV_REQUIRED = "cvv_required";
    
      public static final String DECLINED = "declined";
    
      public static final String DECLINED_CARD_NUMBER = "declined_card_number";
    
      public static final String DECLINED_EXCEPTION = "declined_exception";
    
      public static final String DECLINED_EXPIRATION_DATE = "declined_expiration_date";
    
      public static final String DECLINED_MISSING_DATA = "declined_missing_data";
    
      public static final String DECLINED_SAVEABLE = "declined_saveable";
    
      public static final String DECLINED_SECURITY_CODE = "declined_security_code";
    
      public static final String DEPOSIT_REFERENCED_CHARGEBACK = "deposit_referenced_chargeback";
    
      public static final String DIRECT_DEBIT_TYPE_NOT_ACCEPTED = "direct_debit_type_not_accepted";
    
      public static final String DUPLICATE_TRANSACTION = "duplicate_transaction";
    
      public static final String EXCEEDS_DAILY_LIMIT = "exceeds_daily_limit";
    
      public static final String EXCEEDS_MAX_AMOUNT = "exceeds_max_amount";
    
      public static final String EXPIRED_CARD = "expired_card";
    
      public static final String FINBOT_DISCONNECT = "finbot_disconnect";
    
      public static final String FINBOT_UNAVAILABLE = "finbot_unavailable";
    
      public static final String FRAUD_ADDRESS = "fraud_address";
    
      public static final String FRAUD_ADDRESS_RECURLY = "fraud_address_recurly";
    
      public static final String FRAUD_ADVANCED_VERIFICATION = "fraud_advanced_verification";
    
      public static final String FRAUD_GATEWAY = "fraud_gateway";
    
      public static final String FRAUD_GENERIC = "fraud_generic";
    
      public static final String FRAUD_IP_ADDRESS = "fraud_ip_address";
    
      public static final String FRAUD_MANUAL_DECISION = "fraud_manual_decision";
    
      public static final String FRAUD_RISK_CHECK = "fraud_risk_check";
    
      public static final String FRAUD_SECURITY_CODE = "fraud_security_code";
    
      public static final String FRAUD_STOLEN_CARD = "fraud_stolen_card";
    
      public static final String FRAUD_TOO_MANY_ATTEMPTS = "fraud_too_many_attempts";
    
      public static final String FRAUD_VELOCITY = "fraud_velocity";
    
      public static final String GATEWAY_ACCOUNT_SETUP_INCOMPLETE = "gateway_account_setup_incomplete";
    
      public static final String GATEWAY_ERROR = "gateway_error";
    
      public static final String GATEWAY_RATE_LIMITED = "gateway_rate_limited";
    
      public static final String GATEWAY_TIMEOUT = "gateway_timeout";
    
      public static final String GATEWAY_TOKEN_NOT_FOUND = "gateway_token_not_found";
    
      public static final String GATEWAY_UNAVAILABLE = "gateway_unavailable";
    
      public static final String GATEWAY_VALIDATION_EXCEPTION = "gateway_validation_exception";
    
      public static final String INSUFFICIENT_FUNDS = "insufficient_funds";
    
      public static final String INVALID_ACCOUNT_NUMBER = "invalid_account_number";
    
      public static final String INVALID_AMOUNT = "invalid_amount";
    
      public static final String INVALID_BILLING_AGREEMENT_STATUS = "invalid_billing_agreement_status";
    
      public static final String INVALID_CARD_NUMBER = "invalid_card_number";
    
      public static final String INVALID_DATA = "invalid_data";
    
      public static final String INVALID_EMAIL = "invalid_email";
    
      public static final String INVALID_GATEWAY_ACCESS_TOKEN = "invalid_gateway_access_token";
    
      public static final String INVALID_GATEWAY_CONFIGURATION = "invalid_gateway_configuration";
    
      public static final String INVALID_ISSUER = "invalid_issuer";
    
      public static final String INVALID_LOGIN = "invalid_login";
    
      public static final String INVALID_MERCHANT_TYPE = "invalid_merchant_type";
    
      public static final String INVALID_NAME = "invalid_name";
    
      public static final String INVALID_PAYMENT_METHOD = "invalid_payment_method";
    
      public static final String INVALID_PAYMENT_METHOD_HARD = "invalid_payment_method_hard";
    
      public static final String INVALID_TRANSACTION = "invalid_transaction";
    
      public static final String ISSUER_UNAVAILABLE = "issuer_unavailable";
    
      public static final String LIFECYCLE_DECLINE = "lifecycle_decline";
    
      public static final String MERCH_MAX_TRANSACTION_LIMIT_EXCEEDED = "merch_max_transaction_limit_exceeded";
    
      public static final String MONEYBOT_DISCONNECT = "moneybot_disconnect";
    
      public static final String MONEYBOT_UNAVAILABLE = "moneybot_unavailable";
    
      public static final String NO_BILLING_INFORMATION = "no_billing_information";
    
      public static final String NO_GATEWAY = "no_gateway";
    
      public static final String NO_GATEWAY_FOUND_FOR_TRANSACTION_AMOUNT = "no_gateway_found_for_transaction_amount";
    
      public static final String PARTIAL_APPROVAL = "partial_approval";
    
      public static final String PARTIAL_CREDITS_NOT_SUPPORTED = "partial_credits_not_supported";
    
      public static final String PAYER_AUTHENTICATION_REJECTED = "payer_authentication_rejected";
    
      public static final String PAYMENT_CANNOT_VOID_AUTHORIZATION = "payment_cannot_void_authorization";
    
      public static final String PAYMENT_NOT_ACCEPTED = "payment_not_accepted";
    
      public static final String PAYPAL_ACCOUNT_ISSUE = "paypal_account_issue";
    
      public static final String PAYPAL_CANNOT_PAY_SELF = "paypal_cannot_pay_self";
    
      public static final String PAYPAL_DECLINED_USE_ALTERNATE = "paypal_declined_use_alternate";
    
      public static final String PAYPAL_EXPIRED_REFERENCE_ID = "paypal_expired_reference_id";
    
      public static final String PAYPAL_HARD_DECLINE = "paypal_hard_decline";
    
      public static final String PAYPAL_INVALID_BILLING_AGREEMENT = "paypal_invalid_billing_agreement";
    
      public static final String PAYPAL_PRIMARY_DECLINED = "paypal_primary_declined";
    
      public static final String PROCESSOR_NOT_AVAILABLE = "processor_not_available";
    
      public static final String PROCESSOR_UNAVAILABLE = "processor_unavailable";
    
      public static final String RECURLY_CREDENTIALS_NOT_FOUND = "recurly_credentials_not_found";
    
      public static final String RECURLY_ERROR = "recurly_error";
    
      public static final String RECURLY_FAILED_TO_GET_TOKEN = "recurly_failed_to_get_token";
    
      public static final String RECURLY_TOKEN_MISMATCH = "recurly_token_mismatch";
    
      public static final String RECURLY_TOKEN_NOT_FOUND = "recurly_token_not_found";
    
      public static final String REFERENCE_TRANSACTIONS_NOT_ENABLED = "reference_transactions_not_enabled";
    
      public static final String RESTRICTED_CARD = "restricted_card";
    
      public static final String RESTRICTED_CARD_CHARGEBACK = "restricted_card_chargeback";
    
      public static final String RJS_TOKEN_EXPIRED = "rjs_token_expired";
    
      public static final String ROKU_INVALID_CARD_NUMBER = "roku_invalid_card_number";
    
      public static final String ROKU_INVALID_CIB = "roku_invalid_cib";
    
      public static final String ROKU_INVALID_PAYMENT_METHOD = "roku_invalid_payment_method";
    
      public static final String ROKU_ZIP_CODE_MISMATCH = "roku_zip_code_mismatch";
    
      public static final String SIMULTANEOUS = "simultaneous";
    
      public static final String SSL_ERROR = "ssl_error";
    
      public static final String TEMPORARY_HOLD = "temporary_hold";
    
      public static final String THREE_D_SECURE_ACTION_REQUIRED = "three_d_secure_action_required";
    
      public static final String THREE_D_SECURE_ACTION_RESULT_TOKEN_MISMATCH = "three_d_secure_action_result_token_mismatch";
    
      public static final String THREE_D_SECURE_AUTHENTICATION = "three_d_secure_authentication";
    
      public static final String THREE_D_SECURE_CONNECTION_ERROR = "three_d_secure_connection_error";
    
      public static final String THREE_D_SECURE_CREDENTIAL_ERROR = "three_d_secure_credential_error";
    
      public static final String THREE_D_SECURE_NOT_SUPPORTED = "three_d_secure_not_supported";
    
      public static final String TOO_BUSY = "too_busy";
    
      public static final String TOO_MANY_ATTEMPTS = "too_many_attempts";
    
      public static final String TOTAL_CREDIT_EXCEEDS_CAPTURE = "total_credit_exceeds_capture";
    
      public static final String TRANSACTION_ALREADY_REFUNDED = "transaction_already_refunded";
    
      public static final String TRANSACTION_ALREADY_VOIDED = "transaction_already_voided";
    
      public static final String TRANSACTION_CANNOT_BE_AUTHORIZED = "transaction_cannot_be_authorized";
    
      public static final String TRANSACTION_CANNOT_BE_REFUNDED = "transaction_cannot_be_refunded";
    
      public static final String TRANSACTION_CANNOT_BE_REFUNDED_CURRENTLY = "transaction_cannot_be_refunded_currently";
    
      public static final String TRANSACTION_CANNOT_BE_VOIDED = "transaction_cannot_be_voided";
    
      public static final String TRANSACTION_FAILED_TO_SETTLE = "transaction_failed_to_settle";
    
      public static final String TRANSACTION_NOT_FOUND = "transaction_not_found";
    
      public static final String TRANSACTION_SERVICE_V2_DISCONNECT = "transaction_service_v2_disconnect";
    
      public static final String TRANSACTION_SERVICE_V2_UNAVAILABLE = "transaction_service_v2_unavailable";
    
      public static final String TRANSACTION_SETTLED = "transaction_settled";
    
      public static final String TRANSACTION_STALE_AT_GATEWAY = "transaction_stale_at_gateway";
    
      public static final String TRY_AGAIN = "try_again";
    
      public static final String UNKNOWN = "unknown";
    
      public static final String UNMAPPED_PARTNER_ERROR = "unmapped_partner_error";
    
      public static final String VAULTLY_SERVICE_UNAVAILABLE = "vaultly_service_unavailable";
    
      public static final String ZERO_DOLLAR_AUTH_NOT_SUPPORTED = "zero_dollar_auth_not_supported";
    
    }
  
    public static class DeclineCode {
    
      public static final String ACCOUNT_CLOSED = "account_closed";
    
      public static final String CALL_ISSUER = "call_issuer";
    
      public static final String CARD_NOT_ACTIVATED = "card_not_activated";
    
      public static final String CARD_NOT_SUPPORTED = "card_not_supported";
    
      public static final String CARDHOLDER_REQUESTED_STOP = "cardholder_requested_stop";
    
      public static final String DO_NOT_HONOR = "do_not_honor";
    
      public static final String DO_NOT_TRY_AGAIN = "do_not_try_again";
    
      public static final String EXCEEDS_DAILY_LIMIT = "exceeds_daily_limit";
    
      public static final String GENERIC_DECLINE = "generic_decline";
    
      public static final String EXPIRED_CARD = "expired_card";
    
      public static final String FRAUDULENT = "fraudulent";
    
      public static final String INSUFFICIENT_FUNDS = "insufficient_funds";
    
      public static final String INCORRECT_ADDRESS = "incorrect_address";
    
      public static final String INCORRECT_SECURITY_CODE = "incorrect_security_code";
    
      public static final String INVALID_AMOUNT = "invalid_amount";
    
      public static final String INVALID_NUMBER = "invalid_number";
    
      public static final String INVALID_TRANSACTION = "invalid_transaction";
    
      public static final String ISSUER_UNAVAILABLE = "issuer_unavailable";
    
      public static final String LIFECYCLE_DECLINE = "lifecycle_decline";
    
      public static final String LOST_CARD = "lost_card";
    
      public static final String PICKUP_CARD = "pickup_card";
    
      public static final String POLICY_DECLINE = "policy_decline";
    
      public static final String RESTRICTED_CARD = "restricted_card";
    
      public static final String RESTRICTED_CARD_CHARGEBACK = "restricted_card_chargeback";
    
      public static final String SECURITY_DECLINE = "security_decline";
    
      public static final String STOLEN_CARD = "stolen_card";
    
      public static final String TRY_AGAIN = "try_again";
    
      public static final String UPDATE_CARDHOLDER_DATA = "update_cardholder_data";
    
      public static final String REQUIRES_3D_SECURE = "requires_3d_secure";
    
    }
  
    public static class TaxIdentifierType {
    
      public static final String CPF = "cpf";
    
      public static final String CNPJ = "cnpj";
    
      public static final String CUIT = "cuit";
    
    }
  
    public static class DunningCycleType {
    
      public static final String AUTOMATIC = "automatic";
    
      public static final String MANUAL = "manual";
    
      public static final String TRIAL = "trial";
    
    }
  
    public static class AchType {
    
      public static final String BACS = "bacs";
    
      public static final String BECS = "becs";
    
      public static final String PIX_AUTOMATICO = "pix-automatico";
    
      public static final String MERCADOPAGO = "mercadopago";
    
    }
  
    public static class AchAccountType {
    
      public static final String CHECKING = "checking";
    
      public static final String SAVINGS = "savings";
    
    }
  
    public static class ExternalHppType {
    
      public static final String ADYEN = "adyen";
    
    }
  
    public static class OnlineBankingPaymentType {
    
      public static final String IDEAL = "ideal";
    
      public static final String SOFORT = "sofort";
    
    }
  
    public static class ExternalInvoiceState {
    
      public static final String PAID = "paid";
    
    }
  
    public static class GeneralLedgerAccountType {
    
      public static final String LIABILITY = "liability";
    
      public static final String REVENUE = "revenue";
    
    }
  
    public static class OriginTaxAddressSource {
    
      public static final String ORIGIN = "origin";
    
      public static final String DESTINATION = "destination";
    
    }
  
    public static class DestinationTaxAddressSource {
    
      public static final String DESTINATION = "destination";
    
      public static final String ORIGIN = "origin";
    
    }
  
    public static class TransactionMerchantReasonCode {
    
      public static final String INCREMENTAL = "incremental";
    
      public static final String NO_SHOW = "no_show";
    
      public static final String RESUBMISSION = "resubmission";
    
      public static final String SERVICE_EXTENSION = "service_extension";
    
      public static final String SPLIT_SHIPMENT = "split_shipment";
    
      public static final String TOP_UP = "top_up";
    
    }
  
    public static class TransactionInitiator {
    
      public static final String CUSTOMER = "customer";
    
      public static final String MERCHANT = "merchant";
    
    }
  
}
