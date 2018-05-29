# MonitoringApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMonitor**](MonitoringApi.md#addMonitor) | **POST** /monitors | 
[**deleteMonitor**](MonitoringApi.md#deleteMonitor) | **DELETE** /monitors/{id} | 
[**findMonitors**](MonitoringApi.md#findMonitors) | **GET** /monitors | 
[**getMonitor**](MonitoringApi.md#getMonitor) | **GET** /monitors/{id} | 


<a name="addMonitor"></a>
# **addMonitor**
> Monitor addMonitor(monitor)



Creates a monitor 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MonitoringApi apiInstance = new MonitoringApi();
MonitorNew monitor = new MonitorNew(); // MonitorNew | Monitor to be created 
try {
    Monitor result = apiInstance.addMonitor(monitor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#addMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **monitor** | [**MonitorNew**](MonitorNew.md)| Monitor to be created  |

### Return type

[**Monitor**](Monitor.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMonitor"></a>
# **deleteMonitor**
> deleteMonitor(id)



Deletes the monitor identified by the given id paramater. 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MonitoringApi apiInstance = new MonitoringApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    apiInstance.deleteMonitor(id);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#deleteMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findMonitors"></a>
# **findMonitors**
> List&lt;Monitor&gt; findMonitors()



Returns all monitors visible to the user 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MonitoringApi apiInstance = new MonitoringApi();
try {
    List<Monitor> result = apiInstance.findMonitors();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#findMonitors");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Monitor&gt;**](Monitor.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMonitor"></a>
# **getMonitor**
> List&lt;Monitor&gt; getMonitor(id)



Retrieves the monitor with the given id parameter 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MonitoringApi apiInstance = new MonitoringApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    List<Monitor> result = apiInstance.getMonitor(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#getMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

[**List&lt;Monitor&gt;**](Monitor.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

