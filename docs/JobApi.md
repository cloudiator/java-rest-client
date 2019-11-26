# JobApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addJob**](JobApi.md#addJob) | **POST** /jobs | 
[**findJob**](JobApi.md#findJob) | **GET** /jobs/{id} | 
[**findJobs**](JobApi.md#findJobs) | **GET** /jobs | 
[**jobGraph**](JobApi.md#jobGraph) | **GET** /jobs/{id}/graph | 


<a name="addJob"></a>
# **addJob**
> Job addJob(job)



Creates a new job

### Example
```java
// Import classes:
import io.github.cloudiator.rest.ApiClient;
import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.Configuration;
import io.github.cloudiator.rest.auth.*;
import io.github.cloudiator.rest.models.*;
import io.github.cloudiator.rest.api.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:9000");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JobApi apiInstance = new JobApi(defaultClient);
    JobNew job = new JobNew(); // JobNew | Job to be created. 
    try {
      Job result = apiInstance.addJob(job);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#addJob");
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
 **job** | [**JobNew**](JobNew.md)| Job to be created.  |

### Return type

[**Job**](Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, code, message, 

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK  |  -  |
**400** | Bad Request |  -  |
**401** | Authorization for this action is missing |  -  |
**403** | Forbidden action |  -  |
**404** | Item not found |  -  |
**500** | An unexpected Error occured |  -  |
**504** | Server temporary not available |  -  |

<a name="findJob"></a>
# **findJob**
> Job findJob(id)



Returns the job with the given id. 

### Example
```java
// Import classes:
import io.github.cloudiator.rest.ApiClient;
import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.Configuration;
import io.github.cloudiator.rest.auth.*;
import io.github.cloudiator.rest.models.*;
import io.github.cloudiator.rest.api.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:9000");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JobApi apiInstance = new JobApi(defaultClient);
    String id = "id_example"; // String | Unique identifier of the resource
    try {
      Job result = apiInstance.findJob(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#findJob");
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

[**Job**](Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, code, message, 

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The job identified by the id  |  -  |
**401** | Authorization for this action is missing |  -  |
**403** | Forbidden action |  -  |
**500** | An unexpected Error occured |  -  |
**504** | Server temporary not available |  -  |

<a name="findJobs"></a>
# **findJobs**
> List&lt;Job&gt; findJobs()



Returns all jobs visible to the user 

### Example
```java
// Import classes:
import io.github.cloudiator.rest.ApiClient;
import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.Configuration;
import io.github.cloudiator.rest.auth.*;
import io.github.cloudiator.rest.models.*;
import io.github.cloudiator.rest.api.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:9000");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JobApi apiInstance = new JobApi(defaultClient);
    try {
      List<Job> result = apiInstance.findJobs();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#findJobs");
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

[**List&lt;Job&gt;**](Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, code, message, 

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK  |  -  |
**401** | Authorization for this action is missing |  -  |
**403** | Forbidden action |  -  |
**500** | An unexpected Error occured |  -  |
**504** | Server temporary not available |  -  |

<a name="jobGraph"></a>
# **jobGraph**
> Object jobGraph(id)



Returns a json graph representation usable by cyctoscape.js 

### Example
```java
// Import classes:
import io.github.cloudiator.rest.ApiClient;
import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.Configuration;
import io.github.cloudiator.rest.auth.*;
import io.github.cloudiator.rest.models.*;
import io.github.cloudiator.rest.api.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:9000");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    JobApi apiInstance = new JobApi(defaultClient);
    String id = "id_example"; // String | Unique identifier of the resource
    try {
      Object result = apiInstance.jobGraph(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#jobGraph");
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

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | See js.cyctoscape.org  |  -  |

