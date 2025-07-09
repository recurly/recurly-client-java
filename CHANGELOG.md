# Changelog

## [5.2.0](https://github.com/recurly/recurly-client-java/tree/5.2.0) (2025-07-09)

[Full Changelog](https://github.com/recurly/recurly-client-java/compare/5.1.0...5.2.0)


**Merged Pull Requests**

- Generated Latest Changes for v2021-02-25 [#301](https://github.com/recurly/recurly-client-java/pull/301) ([recurly-integrations](https://github.com/recurly-integrations))



## [5.1.0](https://github.com/recurly/recurly-client-java/tree/5.1.0) (2025-06-11)

[Full Changelog](https://github.com/recurly/recurly-client-java/compare/5.0.0...5.1.0)


**Merged Pull Requests**

- Generated Latest Changes for v2021-02-25 [#300](https://github.com/recurly/recurly-client-java/pull/300) ([recurly-integrations](https://github.com/recurly-integrations))



## [5.0.0](https://github.com/recurly/recurly-client-java/tree/5.0.0) (2025-05-16)


# Major Version Release

The 5.x major version of the client pairs with the `v2021-02-25` API version. While there are no breaking changes in the API, the client code does include breaking changes.

## Breaking Changes in the Client

- The `SubscriptionRampInterval` request class incorrectly sets the type of `UnitAmount` as `Integer`. This is being corrected to reflect the correct type of `BigDecimal`.


