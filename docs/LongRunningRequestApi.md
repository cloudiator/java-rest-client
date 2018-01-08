# LongRunningRequestApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAllLongRunningRequest**](LongRunningRequestApi.md#findAllLongRunningRequest) | **GET** /longRunningRequests | 
[**findLongRunningRequest**](LongRunningRequestApi.md#findLongRunningRequest) | **GET** /longRunningRequests/{id} | 


<a name="findAllLongRunningRequest"></a>
# **findAllLongRunningRequest**
> List&lt;LongRunningRequest&gt; findAllLongRunningRequest()



Returns all running LLRs visible to the user 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.api.LongRunningRequestApi;


LongRunningRequestApi apiInstance = new LongRunningRequestApi();
try {
    List<LongRunningRequest> result = apiInstance.findAllLongRunningRequest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LongRunningRequestApi#findAllLongRunningRequest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;LongRunningRequest&gt;**](LongRunningRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findLongRunningRequest"></a>
# **findLongRunningRequest**
> LongRunningRequest findLongRunningRequest(id)



Returns the LRR identified by the id parameter. 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.api.LongRunningRequestApi;


LongRunningRequestApi apiInstance = new LongRunningRequestApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    LongRunningRequest result = apiInstance.findLongRunningRequest(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LongRunningRequestApi#findLongRunningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

[**LongRunningRequest**](LongRunningRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

