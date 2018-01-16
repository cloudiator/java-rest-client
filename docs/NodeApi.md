# NodeApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNode**](NodeApi.md#addNode) | **POST** /node | 


<a name="addNode"></a>
# **addNode**
> LongRunningRequest addNode(nodeRequirements)



Create a new node request

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.NodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

NodeApi apiInstance = new NodeApi();
NodeRequirements nodeRequirements = new NodeRequirements(); // NodeRequirements | Node Request
try {
    LongRunningRequest result = apiInstance.addNode(nodeRequirements);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodeApi#addNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeRequirements** | [**NodeRequirements**](NodeRequirements.md)| Node Request |

### Return type

[**LongRunningRequest**](LongRunningRequest.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

