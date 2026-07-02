# Changelog

## [6.1.0](https://github.com/recurly/recurly-client-java/tree/6.1.0) (2026-07-02)

[Full Changelog](https://github.com/recurly/recurly-client-java/compare/6.0.0...6.1.0)


**Merged Pull Requests**

- Generated Latest Changes for v2021-02-25 [#333](https://github.com/recurly/recurly-client-java/pull/333) ([recurly-integrations](https://github.com/recurly-integrations))



## [6.0.0](https://github.com/recurly/recurly-client-java/tree/6.0.0) (2026-06-18)


# Major Version Release

The 6.x major version of the client pairs with the `v2021-02-25` API version. While there are no breaking changes in the API, the client code does include breaking changes.

## Breaking Changes in the Client

- Replace the global `QueryParams` class with a per-operation class of optional parameters that extends `AbstractQueryParams`
- Replace `joda-time` dependency and updated other dependencies

## Additional Changes

- Added overloaded methods for any API operations that include optional parameters. It is no longer necessary to instantiate a `QueryParams` (now per-operation params class) if the request is not leveraging any of the optional parameters.


