# YamlApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**parseYAML**](YamlApi.md#parseYAML) | **POST** /yaml | 


<a name="parseYAML"></a>
# **parseYAML**
> Job parseYAML(yaml)



### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.YamlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

YamlApi apiInstance = new YamlApi();
String yaml = "yaml_example"; // String | YAML payload
try {
    Job result = apiInstance.parseYAML(yaml);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling YamlApi#parseYAML");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **yaml** | **String**| YAML payload |

### Return type

[**Job**](Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/yaml
 - **Accept**: application/json

