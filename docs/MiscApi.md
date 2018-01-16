# MiscApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**solveOCL**](MiscApi.md#solveOCL) | **PUT** /ocl | 


<a name="solveOCL"></a>
# **solveOCL**
> OclSolution solveOCL(oclProblem)



Solves an Ocl Problem

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.MiscApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MiscApi apiInstance = new MiscApi();
OclProblem oclProblem = new OclProblem(); // OclProblem | OCL Problem to solve
try {
    OclSolution result = apiInstance.solveOCL(oclProblem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscApi#solveOCL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oclProblem** | [**OclProblem**](OclProblem.md)| OCL Problem to solve |

### Return type

[**OclSolution**](OclSolution.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

