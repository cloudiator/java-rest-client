# CloudApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCloud**](CloudApi.md#addCloud) | **POST** /clouds | 
[**addVM**](CloudApi.md#addVM) | **POST** /vm | 
[**deleteCloud**](CloudApi.md#deleteCloud) | **DELETE** /clouds/{id} | 
[**editImage**](CloudApi.md#editImage) | **PUT** /images/{id} | 
[**findCloud**](CloudApi.md#findCloud) | **GET** /clouds/{id} | 
[**findClouds**](CloudApi.md#findClouds) | **GET** /clouds | 
[**findHardware**](CloudApi.md#findHardware) | **GET** /hardware | 
[**findImages**](CloudApi.md#findImages) | **GET** /images | 
[**findLocations**](CloudApi.md#findLocations) | **GET** /locations | 
[**findNodeCandidates**](CloudApi.md#findNodeCandidates) | **POST** /nodeCandidates | 


<a name="addCloud"></a>
# **addCloud**
> Cloud addCloud(cloud)



Creates a new cloud.

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CloudApi apiInstance = new CloudApi();
NewCloud cloud = new NewCloud(); // NewCloud | Cloud to add
try {
    Cloud result = apiInstance.addCloud(cloud);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#addCloud");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloud** | [**NewCloud**](NewCloud.md)| Cloud to add |

### Return type

[**Cloud**](Cloud.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addVM"></a>
# **addVM**
> LongRunningRequest addVM(virtualMachineRequest)



Creates a new virtual machine request

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CloudApi apiInstance = new CloudApi();
VirtualMachineRequest virtualMachineRequest = new VirtualMachineRequest(); // VirtualMachineRequest | VirtualMachine Request
try {
    LongRunningRequest result = apiInstance.addVM(virtualMachineRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#addVM");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **virtualMachineRequest** | [**VirtualMachineRequest**](VirtualMachineRequest.md)| VirtualMachine Request |

### Return type

[**LongRunningRequest**](LongRunningRequest.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCloud"></a>
# **deleteCloud**
> deleteCloud(id)



Deletes the cloud identified by the given id paramater. 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CloudApi apiInstance = new CloudApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    apiInstance.deleteCloud(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#deleteCloud");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editImage"></a>
# **editImage**
> Image editImage(id, image)



Updates a specific image 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CloudApi apiInstance = new CloudApi();
String id = "id_example"; // String | Unique identifier of the resource
Image image = new Image(); // Image | Image to update 
try {
    Image result = apiInstance.editImage(id, image);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#editImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |
 **image** | [**Image**](Image.md)| Image to update  |

### Return type

[**Image**](Image.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findCloud"></a>
# **findCloud**
> Cloud findCloud(id)



Returns the cloud identified by the given id parameter 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CloudApi apiInstance = new CloudApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    Cloud result = apiInstance.findCloud(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#findCloud");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

[**Cloud**](Cloud.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findClouds"></a>
# **findClouds**
> List&lt;Cloud&gt; findClouds()



Returns all clouds from the system that the user has access to 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CloudApi apiInstance = new CloudApi();
try {
    List<Cloud> result = apiInstance.findClouds();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#findClouds");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Cloud&gt;**](Cloud.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findHardware"></a>
# **findHardware**
> List&lt;Hardware&gt; findHardware()



Returns all hardware visible to the user 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CloudApi apiInstance = new CloudApi();
try {
    List<Hardware> result = apiInstance.findHardware();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#findHardware");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Hardware&gt;**](Hardware.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findImages"></a>
# **findImages**
> List&lt;Image&gt; findImages()



Returns all images visable to the user 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CloudApi apiInstance = new CloudApi();
try {
    List<Image> result = apiInstance.findImages();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#findImages");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Image&gt;**](Image.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findLocations"></a>
# **findLocations**
> List&lt;Location&gt; findLocations()



Returns all locations visible to the user 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CloudApi apiInstance = new CloudApi();
try {
    List<Location> result = apiInstance.findLocations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#findLocations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Location&gt;**](Location.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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
//import io.github.cloudiator.rest.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CloudApi apiInstance = new CloudApi();
NodeRequirements nodeRequirements = new NodeRequirements(); // NodeRequirements | Node Request 
try {
    List<NodeCandidate> result = apiInstance.findNodeCandidates(nodeRequirements);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#findNodeCandidates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeRequirements** | [**NodeRequirements**](NodeRequirements.md)| Node Request  | [optional]

### Return type

[**List&lt;NodeCandidate&gt;**](NodeCandidate.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

