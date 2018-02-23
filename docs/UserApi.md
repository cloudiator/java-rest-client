# UserApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTenant**](UserApi.md#createTenant) | **POST** /tenants | 
[**createUser**](UserApi.md#createUser) | **POST** /users | 
[**login**](UserApi.md#login) | **POST** /login | 


<a name="createTenant"></a>
# **createTenant**
> Tenant createTenant(tenant)



Creates a new tenant 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Tenant tenant = new Tenant(); // Tenant | Tenant creation request 
try {
    Tenant result = apiInstance.createTenant(tenant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createTenant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | [**Tenant**](Tenant.md)| Tenant creation request  | [optional]

### Return type

[**Tenant**](Tenant.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUser"></a>
# **createUser**
> User createUser(user)



Creates a new user 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
UserNew user = new UserNew(); // UserNew | User creation request 
try {
    User result = apiInstance.createUser(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**UserNew**](UserNew.md)| User creation request  | [optional]

### Return type

[**User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="login"></a>
# **login**
> Token login(login)



Authenticates a user 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Login login = new Login(); // Login | User login request 
try {
    Token result = apiInstance.login(login);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | [**Login**](Login.md)| User login request  | [optional]

### Return type

[**Token**](Token.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

