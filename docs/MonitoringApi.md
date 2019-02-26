# MonitoringApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMonitor**](MonitoringApi.md#addMonitor) | **POST** /monitors | 
[**deleteMonitor**](MonitoringApi.md#deleteMonitor) | **DELETE** /monitors/{metric} | 
[**findMonitors**](MonitoringApi.md#findMonitors) | **GET** /monitors | 
[**getMonitor**](MonitoringApi.md#getMonitor) | **GET** /monitors/{metric} | 
[**updateMonitor**](MonitoringApi.md#updateMonitor) | **PUT** /monitors/{metric} | 


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
Monitor monitor = new Monitor(); // Monitor | Monitor to be created 
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
 **monitor** | [**Monitor**](Monitor.md)| Monitor to be created  |

### Return type

[**Monitor**](Monitor.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMonitor"></a>
# **deleteMonitor**
> deleteMonitor(metric, target)



Deletes the monitor identified by the given metric name. 

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
String metric = "metric_example"; // String | Unique identifier of a monitor
MonitoringTarget target = new MonitoringTarget(); // MonitoringTarget | Target of the Monitor 
try {
    apiInstance.deleteMonitor(metric, target);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#deleteMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metric** | **String**| Unique identifier of a monitor |
 **target** | [**MonitoringTarget**](MonitoringTarget.md)| Target of the Monitor  |

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
> Monitor getMonitor(metric, target)



Retrieves the monitor with the given metric name 

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
String metric = "metric_example"; // String | Unique identifier of a monitor
MonitoringTarget target = new MonitoringTarget(); // MonitoringTarget | Target of the Monitor 
try {
    Monitor result = apiInstance.getMonitor(metric, target);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#getMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metric** | **String**| Unique identifier of a monitor |
 **target** | [**MonitoringTarget**](MonitoringTarget.md)| Target of the Monitor  |

### Return type

[**Monitor**](Monitor.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateMonitor"></a>
# **updateMonitor**
> Monitor updateMonitor(metric, monitor)



Updating a monitor 

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
String metric = "metric_example"; // String | Unique identifier of a monitor
Monitor monitor = new Monitor(); // Monitor | Monitor to be updated 
try {
    Monitor result = apiInstance.updateMonitor(metric, monitor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#updateMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metric** | **String**| Unique identifier of a monitor |
 **monitor** | [**Monitor**](Monitor.md)| Monitor to be updated  |

### Return type

[**Monitor**](Monitor.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

