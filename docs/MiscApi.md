# MiscApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**decrypt**](MiscApi.md#decrypt) | **GET** /decryption/{text} | 
[**encrypt**](MiscApi.md#encrypt) | **GET** /encryption/{text} | 
[**installTools**](MiscApi.md#installTools) | **POST** /installer | 


<a name="decrypt"></a>
# **decrypt**
> Text decrypt(text)



Decrypts the given string

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.MiscApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MiscApi apiInstance = new MiscApi();
String text = "text_example"; // String | Text to decrypt
try {
    Text result = apiInstance.decrypt(text);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscApi#decrypt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Text to decrypt |

### Return type

[**Text**](Text.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="encrypt"></a>
# **encrypt**
> Text encrypt(text)



Encrypts the given string

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.MiscApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MiscApi apiInstance = new MiscApi();
String text = "text_example"; // String | Text to encrypt
try {
    Text result = apiInstance.encrypt(text);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscApi#encrypt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Text to encrypt |

### Return type

[**Text**](Text.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="installTools"></a>
# **installTools**
> installTools(installRequest)



Installs Cloudiator tools on provided node

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.MiscApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MiscApi apiInstance = new MiscApi();
InstallationRequest installRequest = new InstallationRequest(); // InstallationRequest | a request to install the cloudiator tools on a provided node
try {
    apiInstance.installTools(installRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscApi#installTools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installRequest** | [**InstallationRequest**](InstallationRequest.md)| a request to install the cloudiator tools on a provided node |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

