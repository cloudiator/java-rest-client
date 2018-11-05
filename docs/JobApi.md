# JobApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addJob**](JobApi.md#addJob) | **POST** /jobs | 
[**addSchedule**](JobApi.md#addSchedule) | **POST** /schedule | 
[**createProcess**](JobApi.md#createProcess) | **POST** /process | 
[**deleteProcess**](JobApi.md#deleteProcess) | **DELETE** /process/{id} | 
[**findJob**](JobApi.md#findJob) | **GET** /jobs/{id} | 
[**findJobs**](JobApi.md#findJobs) | **GET** /jobs | 
[**findProcess**](JobApi.md#findProcess) | **GET** /process/{id} | 
[**findSchedule**](JobApi.md#findSchedule) | **GET** /schedule/{id} | 
[**getProcesses**](JobApi.md#getProcesses) | **GET** /process | 
[**getSchedules**](JobApi.md#getSchedules) | **GET** /schedule | 
[**jobGraph**](JobApi.md#jobGraph) | **GET** /jobs/{id}/graph | 


<a name="addJob"></a>
# **addJob**
> Job addJob(job)



Creates a new job

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
JobNew job = new JobNew(); // JobNew | Job to be created. 
try {
    Job result = apiInstance.addJob(job);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#addJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job** | [**JobNew**](JobNew.md)| Job to be created.  |

### Return type

[**Job**](Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
//import io.github.cloudiator.rest.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
ScheduleNew schedule = new ScheduleNew(); // ScheduleNew | Schedule to be created 
try {
    Queue result = apiInstance.addSchedule(schedule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#addSchedule");
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
//import io.github.cloudiator.rest.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
ProcessNew process = new ProcessNew(); // ProcessNew | Process to be created 
try {
    Queue result = apiInstance.createProcess(process);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#createProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **process** | [**ProcessNew**](ProcessNew.md)| Process to be created  |

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
//import io.github.cloudiator.rest.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    Queue result = apiInstance.deleteProcess(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#deleteProcess");
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

<a name="findJob"></a>
# **findJob**
> Job findJob(id)



Returns the job with the given id. 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    Job result = apiInstance.findJob(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#findJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

[**Job**](Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findJobs"></a>
# **findJobs**
> List&lt;Job&gt; findJobs()



Returns all jobs visible to the user 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
try {
    List<Job> result = apiInstance.findJobs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#findJobs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Job&gt;**](Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findProcess"></a>
# **findProcess**
> Process findProcess(id)



Finds the process corresponding to the given id. 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    Process result = apiInstance.findProcess(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#findProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

[**Process**](Process.md)

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
//import io.github.cloudiator.rest.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    Schedule result = apiInstance.findSchedule(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#findSchedule");
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
> List&lt;Process&gt; getProcesses(scheduleId)



Retrieves all process of the current user matching the parameters. 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
String scheduleId = "scheduleId_example"; // String | Id of the schedule. 
try {
    List<Process> result = apiInstance.getProcesses(scheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getProcesses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleId** | **String**| Id of the schedule.  | [optional]

### Return type

[**List&lt;Process&gt;**](Process.md)

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
//import io.github.cloudiator.rest.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
try {
    List<Schedule> result = apiInstance.getSchedules();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getSchedules");
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

<a name="jobGraph"></a>
# **jobGraph**
> Object jobGraph(id)



Returns a json graph representation usable by cyctoscape.js 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobApi apiInstance = new JobApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    Object result = apiInstance.jobGraph(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#jobGraph");
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

