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
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.api.NodeApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

