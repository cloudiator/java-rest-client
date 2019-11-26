# QueueApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findQueuedTask**](QueueApi.md#findQueuedTask) | **GET** /queue/{id} | 
[**getQueuedTasks**](QueueApi.md#getQueuedTasks) | **GET** /queue | 


<a name="findQueuedTask"></a>
# **findQueuedTask**
> Queue findQueuedTask(id)



Returns the queued task with the given id. 

### Example
```java
// Import classes:
import io.github.cloudiator.rest.ApiClient;
import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.Configuration;
import io.github.cloudiator.rest.auth.*;
import io.github.cloudiator.rest.models.*;
import io.github.cloudiator.rest.api.QueueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:9000");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    QueueApi apiInstance = new QueueApi(defaultClient);
    String id = "id_example"; // String | Unique identifier of the resource
    try {
      Queue result = apiInstance.findQueuedTask(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#findQueuedTask");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

[**Queue**](Queue.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, code, message, 

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Authorization for this action is missing |  -  |
**403** | Forbidden action |  -  |
**500** | An unexpected Error occured |  -  |
**504** | Server temporary not available |  -  |

<a name="getQueuedTasks"></a>
# **getQueuedTasks**
> List&lt;Queue&gt; getQueuedTasks()



Returns all running queued tasks visible to the user 

### Example
```java
// Import classes:
import io.github.cloudiator.rest.ApiClient;
import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.Configuration;
import io.github.cloudiator.rest.auth.*;
import io.github.cloudiator.rest.models.*;
import io.github.cloudiator.rest.api.QueueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:9000");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    QueueApi apiInstance = new QueueApi(defaultClient);
    try {
      List<Queue> result = apiInstance.getQueuedTasks();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#getQueuedTasks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Queue&gt;**](Queue.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, code, message, 

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Authorization for this action is missing |  -  |
**403** | Forbidden action |  -  |
**500** | An unexpected Error occured |  -  |
**504** | Server temporary not available |  -  |

