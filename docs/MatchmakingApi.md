# MatchmakingApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findNodeCandidates**](MatchmakingApi.md#findNodeCandidates) | **POST** /nodeCandidates | 
[**getNodeCandidate**](MatchmakingApi.md#getNodeCandidate) | **GET** /nodeCandidates/{id} | 
[**getSolution**](MatchmakingApi.md#getSolution) | **GET** /solution/{id} | 
[**solveMatchmaking**](MatchmakingApi.md#solveMatchmaking) | **PUT** /matchmaking | 


<a name="findNodeCandidates"></a>
# **findNodeCandidates**
> List&lt;NodeCandidate&gt; findNodeCandidates(nodeRequirements)



Returns possible node candidates. 

### Example
```java
// Import classes:
import io.github.cloudiator.rest.ApiClient;
import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.Configuration;
import io.github.cloudiator.rest.auth.*;
import io.github.cloudiator.rest.models.*;
import io.github.cloudiator.rest.api.MatchmakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:9000");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MatchmakingApi apiInstance = new MatchmakingApi(defaultClient);
    List<Requirement> nodeRequirements = Arrays.asList(); // List<Requirement> | Node Request 
    try {
      List<NodeCandidate> result = apiInstance.findNodeCandidates(nodeRequirements);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatchmakingApi#findNodeCandidates");
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
 **nodeRequirements** | [**List&lt;Requirement&gt;**](Requirement.md)| Node Request  | [optional]

### Return type

[**List&lt;NodeCandidate&gt;**](NodeCandidate.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | ACCEPTED |  -  |

<a name="getNodeCandidate"></a>
# **getNodeCandidate**
> NodeCandidate getNodeCandidate(id)



Returns the node candidate with the given id if it exists. 

### Example
```java
// Import classes:
import io.github.cloudiator.rest.ApiClient;
import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.Configuration;
import io.github.cloudiator.rest.auth.*;
import io.github.cloudiator.rest.models.*;
import io.github.cloudiator.rest.api.MatchmakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:9000");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MatchmakingApi apiInstance = new MatchmakingApi(defaultClient);
    String id = "id_example"; // String | Unique identifier of the resource
    try {
      NodeCandidate result = apiInstance.getNodeCandidate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatchmakingApi#getNodeCandidate");
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

[**NodeCandidate**](NodeCandidate.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The node candidate identified with the id  |  -  |

<a name="getSolution"></a>
# **getSolution**
> Solution getSolution(id)



Returns a solution of the matchmaking process (if it is still available) 

### Example
```java
// Import classes:
import io.github.cloudiator.rest.ApiClient;
import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.Configuration;
import io.github.cloudiator.rest.auth.*;
import io.github.cloudiator.rest.models.*;
import io.github.cloudiator.rest.api.MatchmakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:9000");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MatchmakingApi apiInstance = new MatchmakingApi(defaultClient);
    String id = "id_example"; // String | Unique identifier of the resource
    try {
      Solution result = apiInstance.getSolution(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatchmakingApi#getSolution");
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

[**Solution**](Solution.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The solution identified with the id  |  -  |

<a name="solveMatchmaking"></a>
# **solveMatchmaking**
> Queue solveMatchmaking(nodeRequirements)



Solves a matchmaking problem

### Example
```java
// Import classes:
import io.github.cloudiator.rest.ApiClient;
import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.Configuration;
import io.github.cloudiator.rest.auth.*;
import io.github.cloudiator.rest.models.*;
import io.github.cloudiator.rest.api.MatchmakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:9000");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MatchmakingApi apiInstance = new MatchmakingApi(defaultClient);
    NodeRequirements nodeRequirements = new NodeRequirements(); // NodeRequirements | The requirements with respect to nodes
    try {
      Queue result = apiInstance.solveMatchmaking(nodeRequirements);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatchmakingApi#solveMatchmaking");
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
 **nodeRequirements** | [**NodeRequirements**](NodeRequirements.md)| The requirements with respect to nodes |

### Return type

[**Queue**](Queue.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | ACCEPTED |  -  |

