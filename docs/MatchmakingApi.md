# MatchmakingApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findNodeCandidates**](MatchmakingApi.md#findNodeCandidates) | **POST** /nodeCandidates | 
[**solveMatchmaking**](MatchmakingApi.md#solveMatchmaking) | **PUT** /matchmaking | 


<a name="findNodeCandidates"></a>
# **findNodeCandidates**
> List&lt;NodeCandidate&gt; findNodeCandidates(nodeRequirements)



Returns possible node candidates. 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.MatchmakingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MatchmakingApi apiInstance = new MatchmakingApi();
List<Requirement> nodeRequirements = Arrays.asList(new Requirement()); // List<Requirement> | Node Request 
try {
    List<NodeCandidate> result = apiInstance.findNodeCandidates(nodeRequirements);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchmakingApi#findNodeCandidates");
    e.printStackTrace();
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

<a name="solveMatchmaking"></a>
# **solveMatchmaking**
> List&lt;NodeCandidate&gt; solveMatchmaking(nodeRequirements)



Solves a matchmaking problem

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.MatchmakingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MatchmakingApi apiInstance = new MatchmakingApi();
NodeRequirements nodeRequirements = new NodeRequirements(); // NodeRequirements | The requirements with respect to nodes
try {
    List<NodeCandidate> result = apiInstance.solveMatchmaking(nodeRequirements);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MatchmakingApi#solveMatchmaking");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeRequirements** | [**NodeRequirements**](NodeRequirements.md)| The requirements with respect to nodes |

### Return type

[**List&lt;NodeCandidate&gt;**](NodeCandidate.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

