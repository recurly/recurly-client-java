# Recurly

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
  <version>3.4.1</version>
</dependency>
```

Gradle:

```groovy
implementation 'com.recurly.v3:api-client:3.4.1'
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
