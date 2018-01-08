# JobApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addJob**](JobApi.md#addJob) | **POST** /jobs | 
[**addTask**](JobApi.md#addTask) | **POST** /tasks | 
[**findJobs**](JobApi.md#findJobs) | **GET** /jobs | 
[**findTasks**](JobApi.md#findTasks) | **GET** /tasks | 


<a name="addJob"></a>
# **addJob**
> Job addJob(job)



Creates a new job

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.api.JobApi;


JobApi apiInstance = new JobApi();
Job job = new Job(); // Job | Job to be created. 
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
 **job** | [**Job**](Job.md)| Job to be created.  |

### Return type

[**Job**](Job.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addTask"></a>
# **addTask**
> Task addTask(task)



Creates a new task 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.api.JobApi;


JobApi apiInstance = new JobApi();
Task task = new Task(); // Task | Task to be created 
try {
    Task result = apiInstance.addTask(task);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#addTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task** | [**Task**](Task.md)| Task to be created  |

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findJobs"></a>
# **findJobs**
> List&lt;Job&gt; findJobs()



Returns all jobs visible to the user 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.api.JobApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findTasks"></a>
# **findTasks**
> List&lt;Task&gt; findTasks()



Returns all tasks visible to the user 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.api.JobApi;


JobApi apiInstance = new JobApi();
try {
    List<Task> result = apiInstance.findTasks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#findTasks");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Task&gt;**](Task.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

