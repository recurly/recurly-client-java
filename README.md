# Recurly

[![Maven Central](https://img.shields.io/static/v1?label=Maven%20Central&message=recurly&color=purple)](https://search.maven.org/artifact/com.recurly.v3/api-client)
[![Contributor Covenant](https://img.shields.io/badge/Contributor%20Covenant-v2.0%20adopted-ff69b4.svg)](CODE_OF_CONDUCT.md)

This repository houses the official java client for Recurly's V3 API.

> *Note*:
> If you were looking for a V2 client, we recommend the [open source KillBilling library](https://github.com/killbilling/recurly-java-library/).

Documentation for the HTTP API and example code can be found
[on our Developer Portal](https://developers.recurly.com/api/v2019-10-10/).

## Getting Started

### Installing

As a Maven dependency:

```xml
<dependency>
  <groupId>com.recurly.v3</groupId>
  <artifactId>api-client</artifactId>
  <version>4.23.0</version>
</dependency>
```

Gradle:

```groovy
implementation 'com.recurly.v3:api-client:4.23.0'
```

You can find further release and distribution details on
[Maven Central](https://search.maven.org/artifact/com.recurly.v3/api-client/)

> *Note*: We try to follow [semantic versioning](https://semver.org/) and will only apply breaking changes to major versions.

### Creating a client

Client instances provide one place where every operation on the Recurly API can be found (rather than
having them spread out amongst classes). A new client can be initialized with its constructor. It only requires
an API key which can be obtained on the [API Credentials Page](https://app.recurly.com/go/integrations/api_keys).

```java
import com.recurly.v3.Client;
import com.recurly.v3.resources.Subscription;

String apiKey = "83749879bbde395b5fe0cc1a5abf8e5";
final Client client = new Client(apiKey);
final Subscription sub = client.getSubscription("uuid-abcd123456");
```

To access Recurly API in Europe, you will need to specify the EU Region in the `ClientOptions`:
```java
import com.recurly.v3.Client;
import com.recurly.v3.resources.Subscription;

String apiKey = "83749879bbde395b5fe0cc1a5abf8e5";
final ClientOptions options = new ClientOptions();
options.setRegion(ClientOptions.Regions.EU);
final Client client = new Client(apiKey, options);
final Subscription sub = client.getSubscription("uuid-abcd123456");
```

### Operations

Every operation that can be performed against the API has a corresponding method in the `Client` class.

### Pagination

Pagination is accomplished using the `Pager<>` object. A pager is created by the `list*` operations of the client.
`Pager` implements [`Iterable`](https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html), so it exposes
a `forEach` method and can be used with enhanced for loops and lambdas:

```java
Pager<Account> accounts = client.listAccounts(new QueryParams());

// For loop
for (Account account : accounts) {
    System.out.println(account.getCode());
}

// Lambda
accounts.forEach(account -> System.out.println(account.getCode()));
```

Note that the `Pager` implementation of `forEach` fetches the next page automatically. For more control over the
fetching of the next page, it is possible to use the `getNextPage()` and `hasMore()` methods directly. In order
to work with the `List` of data directly, it is accessible via the `getData()` method. We recommend using this
interface for writing scripts that iterate over many pages. This allows you to catch exceptions and safely retry
without double processing or missing some elements:

```java
Pager<Account> accounts = client.listAccounts(new QueryParams());

while (accounts.hasMore()) {
    System.out.println("Fetching next page...");
    accounts.getNextPage();
    for (Account acct : accounts.getData()) {
        System.out.println(acct.getCode());
    }
}
```

#### Query Parameters

Every `List*` endpoint accepts a number of query parameters that allow you to sort or filter the results.
These can be set using the `QueryParams` object. This object contains the union of all parameters across every endpoint, and thus it's up to the programmer to determine which parameters are supported by the endpoint. You can find this list by looking at the `QUERY PARAMETERS` section of the endpoint's docs. For an example, see [list_account](https://developers.recurly.com/api/latest#operation/list_accounts).

```java
QueryParams params = new QueryParams();
params.setBeginTime(new DateTime(2020, 1, 1, 0, 0)); // midnight, Jan 1, 2020 UTC
params.setEndTime(new DateTime(2020, 6, 1, 0, 0)); // midnight, June 1, 2020 UTC
params.setSort("created_at"); // sort by `created_at` property
params.setOrder("asc"); // "ascending" order
params.setSubscriber(new Boolean(true)); // must be a subscriber
params.setLimit(200); // Fetch 200 records per page
Pager<Account> accounts = client.listAccounts(params);

for (Account acct : accounts) {
    System.out.println(acct.getCode());
}
```

#### Additional Pager Methods

In addition to the methods to facilitate pagination, the Pager class provides 2 helper methods:

1. getFirst
2. getCount

##### First

The Pager's `getFirst` method can be used to fetch only the first resource from the endpoint for the given QueryParams.

```java
QueryParams params = new QueryParams();
params.setBeginTime(new DateTime(2020, 1, 1, 0, 0));
Pager<Account> accounts = client.listAccounts(params);
// Get the first Account created in 2020 UTC
Account account = accounts.getFirst();
System.out.println(account.getCode());
```

##### Count

The Pager's `getCount` method will return the total number of resources that are available at the requested endpoint for the given QueryParams.

```java
DateTime beginTime = new DateTime(2020, 1, 1, 0, 0);
QueryParams params = new QueryParams();
params.setBeginTime(beginTime);
Pager<Account> accounts = client.listAccounts(params);
int total = accounts.getCount();
System.out.println("There are " + total + " accounts since " + beginTime);
```

### Creating Resources

Every `create*` and `update*` method on the client takes a `Request` object that forms the request. This allows you
to create requests in a type-safe manner. Request types are not necessarily 1-to-1 mappings of response types.

```java
import com.recurly.v3.requests.AccountCreate;
import com.recurly.v3.requests.Address;
import com.recurly.v3.resources.Account;

final AccountCreate accountReq = new AccountCreate();
final Address address = new Address();

accountReq.setCode("myaccountcode");
accountReq.setFirstName("Aaron");
accountReq.setLastName("Du Monde");

address.setStreet1("900 Camp St.");
address.setCity("New Orleans");
address.setRegion("LA");
address.setCountry("US");
address.setPostalCode("70115");

accountReq.setAddress(address);

// createAccount takes an AccountCreate object and returns an Account object
final Account account = client.createAccount(accountReq);
System.out.println(account.getAddress().getCity()); // New Orleans
```

### Error Handling

This library throws two types of unchecked exceptions. They both subclass from `RecurlyException`:

1. `ApiException`
2. `NetworkException`

`ApiException` is thrown when the Recurly API responds with an error. Each endpoint in the reference documentation describes
the types of errors it may return. These errors generally mean that something was wrong with the request. There are a number
of subclasses to `ApiException` which are derived from the error responses `type` json key. A common scenario might be
a `ValidationException`:

```java
import com.recurly.v3.requests.AccountCreate;
import com.recurly.v3.exception.ValidationException;
import com.recurly.v3.ApiException;

try {
    final AccountCreate accountReq = new AccountCreate();
    accountReq.setCode("myaccountcode");

    final Account account = client.createAccount(accountReq);
} catch (ValidationException e) {
    // Here we have a validation error and might want to
    // pass this information back to the user to fix
    System.out.println("Validation Error: " + e.getError().getMessage());
} catch (ApiException e) {
    // Use the base ApiException to catch a generic error from the API
    System.out.println("Unexpected Recurly Error: " + e.getError().getMessage());
}
```

`NetworkException`s don't come from Recurly's servers, but instead are triggered by some problem related to the network.
Depending on the context, you can often automatically retry these calls. GETs are always safe to retry but be careful
about automatically re-trying any other call that might mutate state on the server side as we cannot guarantee that it
will not be executed twice.

```java
import com.recurly.v3.resources.Account;
import com.recurly.v3.NetworkException;

try {
    final Account account = client.getAccount("code-myaccountcode");
} catch (NetworkException e) {
    // You may want to find out the root cause
    System.out.println(e.getCause().getCause());
} 
```
## Support

Looking for help? Please contact [support@recurly.com](mailto:support@recurly.com) or visit
[support.recurly.com](https://support.recurly.com).

It's also acceptable to post a question, problem, or request as a GitHub issue on this repository and the developers
will try to get back to you in a timely manner.

### Contributing

Please see our [Contributing Guide](CONTRIBUTING.md).
