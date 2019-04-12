# ProcessApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSchedule**](ProcessApi.md#addSchedule) | **POST** /schedule | 
[**createProcess**](ProcessApi.md#createProcess) | **POST** /process | 
[**deleteProcess**](ProcessApi.md#deleteProcess) | **DELETE** /process/{id} | 
[**deleteSchedule**](ProcessApi.md#deleteSchedule) | **DELETE** /schedule/{id} | 
[**findProcess**](ProcessApi.md#findProcess) | **GET** /process/{id} | 
[**findSchedule**](ProcessApi.md#findSchedule) | **GET** /schedule/{id} | 
[**getProcesses**](ProcessApi.md#getProcesses) | **GET** /process | 
[**getSchedules**](ProcessApi.md#getSchedules) | **GET** /schedule | 
[**scheduleGraph**](ProcessApi.md#scheduleGraph) | **GET** /schedule/{id}/graph | 


<a name="addSchedule"></a>
# **addSchedule**
> Queue addSchedule(schedule)



Creates a new schedule 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.ProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessApi apiInstance = new ProcessApi();
ScheduleNew schedule = new ScheduleNew(); // ScheduleNew | Schedule to be created 
try {
    Queue result = apiInstance.addSchedule(schedule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessApi#addSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedule** | [**ScheduleNew**](ScheduleNew.md)| Schedule to be created  |

### Return type

[**Queue**](Queue.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProcess"></a>
# **createProcess**
> Queue createProcess(process)



Creates a new process 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.ProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessApi apiInstance = new ProcessApi();
CloudiatorProcessNew process = new CloudiatorProcessNew(); // CloudiatorProcessNew | Process to be created 
try {
    Queue result = apiInstance.createProcess(process);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessApi#createProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **process** | [**CloudiatorProcessNew**](CloudiatorProcessNew.md)| Process to be created  |

### Return type

[**Queue**](Queue.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProcess"></a>
# **deleteProcess**
> Queue deleteProcess(id)



Deletes the process corresponding to the given id. 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.ProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessApi apiInstance = new ProcessApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    Queue result = apiInstance.deleteProcess(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessApi#deleteProcess");
    e.printStackTrace();
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
 - **Accept**: application/json

<a name="deleteSchedule"></a>
# **deleteSchedule**
> Queue deleteSchedule(id)



Deletes the schedule identified by the given id and all corresponding processes and nodes. 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.ProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessApi apiInstance = new ProcessApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    Queue result = apiInstance.deleteSchedule(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessApi#deleteSchedule");
    e.printStackTrace();
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
 - **Accept**: application/json

<a name="findProcess"></a>
# **findProcess**
> CloudiatorProcess findProcess(id)



Finds the process corresponding to the given id. 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.ProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessApi apiInstance = new ProcessApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    CloudiatorProcess result = apiInstance.findProcess(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessApi#findProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

[**CloudiatorProcess**](CloudiatorProcess.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findSchedule"></a>
# **findSchedule**
> Schedule findSchedule(id)



Retrieves the schedule identified by parameter id. 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.ProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessApi apiInstance = new ProcessApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    Schedule result = apiInstance.findSchedule(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessApi#findSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

[**Schedule**](Schedule.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcesses"></a>
# **getProcesses**
> List&lt;CloudiatorProcess&gt; getProcesses(scheduleId)



Retrieves all process of the current user matching the parameters. 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.ProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessApi apiInstance = new ProcessApi();
String scheduleId = "scheduleId_example"; // String | Id of the schedule. 
try {
    List<CloudiatorProcess> result = apiInstance.getProcesses(scheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessApi#getProcesses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleId** | **String**| Id of the schedule.  | [optional]

### Return type

[**List&lt;CloudiatorProcess&gt;**](CloudiatorProcess.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSchedules"></a>
# **getSchedules**
> List&lt;Schedule&gt; getSchedules()



Retrieves all schedules by the current user. 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.ProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessApi apiInstance = new ProcessApi();
try {
    List<Schedule> result = apiInstance.getSchedules();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessApi#getSchedules");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Schedule&gt;**](Schedule.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="scheduleGraph"></a>
# **scheduleGraph**
> Object scheduleGraph(id)



Returns a json graph representation usable by cyctoscape.js 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.ProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessApi apiInstance = new ProcessApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    Object result = apiInstance.scheduleGraph(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessApi#scheduleGraph");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

