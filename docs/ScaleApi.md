# ScaleApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**triggerScale**](ScaleApi.md#triggerScale) | **POST** /scale | 


<a name="triggerScale"></a>
# **triggerScale**
> Queue triggerScale(scale)



Triggers a new scaling action 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.ScaleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ScaleApi apiInstance = new ScaleApi();
Scale scale = new Scale(); // Scale | Scaling action to be executed 
try {
    Queue result = apiInstance.triggerScale(scale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScaleApi#triggerScale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scale** | [**Scale**](Scale.md)| Scaling action to be executed  |

### Return type

[**Queue**](Queue.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

