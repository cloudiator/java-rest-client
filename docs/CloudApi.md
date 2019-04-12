# CloudApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCloud**](CloudApi.md#addCloud) | **POST** /clouds | 
[**addVM**](CloudApi.md#addVM) | **POST** /vm | 
[**deleteCloud**](CloudApi.md#deleteCloud) | **DELETE** /clouds/{id} | 
[**discoveryStatus**](CloudApi.md#discoveryStatus) | **GET** /discovery/status | 
[**editHardware**](CloudApi.md#editHardware) | **PUT** /hardware/{id} | 
[**editImage**](CloudApi.md#editImage) | **PUT** /images/{id} | 
[**editLocation**](CloudApi.md#editLocation) | **PUT** /locations/{id} | 
[**findCloud**](CloudApi.md#findCloud) | **GET** /clouds/{id} | 
[**findClouds**](CloudApi.md#findClouds) | **GET** /clouds | 
[**findFunctions**](CloudApi.md#findFunctions) | **GET** /function | 
[**findHardware**](CloudApi.md#findHardware) | **GET** /hardware | 
[**findImages**](CloudApi.md#findImages) | **GET** /images | 
[**findLocations**](CloudApi.md#findLocations) | **GET** /locations | 
[**findVMs**](CloudApi.md#findVMs) | **GET** /vm | 
[**getFunction**](CloudApi.md#getFunction) | **GET** /function/{id} | 
[**getHardware**](CloudApi.md#getHardware) | **GET** /hardware/{id} | 
[**getImage**](CloudApi.md#getImage) | **GET** /images/{id} | 
[**getLocation**](CloudApi.md#getLocation) | **GET** /locations/{id} | 
[**getVM**](CloudApi.md#getVM) | **GET** /vm/{id} | 


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
> Queue addVM(virtualMachineRequest)



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
    Queue result = apiInstance.addVM(virtualMachineRequest);
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

[**Queue**](Queue.md)

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

<a name="discoveryStatus"></a>
# **discoveryStatus**
> Map&lt;String, String&gt; discoveryStatus()



Gets the status of the discovery engine 

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
    Map<String, String> result = apiInstance.discoveryStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#discoveryStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Map&lt;String, String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editHardware"></a>
# **editHardware**
> Hardware editHardware(id, hardware)



Updates a specific hardware 

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
Hardware hardware = new Hardware(); // Hardware | Hardware to update 
try {
    Hardware result = apiInstance.editHardware(id, hardware);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#editHardware");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |
 **hardware** | [**Hardware**](Hardware.md)| Hardware to update  |

### Return type

[**Hardware**](Hardware.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="editLocation"></a>
# **editLocation**
> Location editLocation(id, location)



Updates a specific location 

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
Location location = new Location(); // Location | Location to update 
try {
    Location result = apiInstance.editLocation(id, location);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#editLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |
 **location** | [**Location**](Location.md)| Location to update  |

### Return type

[**Location**](Location.md)

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

<a name="findFunctions"></a>
# **findFunctions**
> List&lt;Function&gt; findFunctions()



Finds all functions the user has access to

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
    List<Function> result = apiInstance.findFunctions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#findFunctions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Function&gt;**](Function.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findHardware"></a>
# **findHardware**
> List&lt;Hardware&gt; findHardware(cloudId)



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
String cloudId = "cloudId_example"; // String | (Optional) Unique identifier to filter a specific cloud
try {
    List<Hardware> result = apiInstance.findHardware(cloudId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#findHardware");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| (Optional) Unique identifier to filter a specific cloud | [optional]

### Return type

[**List&lt;Hardware&gt;**](Hardware.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findImages"></a>
# **findImages**
> List&lt;Image&gt; findImages(cloudId)



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
String cloudId = "cloudId_example"; // String | (Optional) Unique identifier to filter a specific cloud
try {
    List<Image> result = apiInstance.findImages(cloudId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#findImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| (Optional) Unique identifier to filter a specific cloud | [optional]

### Return type

[**List&lt;Image&gt;**](Image.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findLocations"></a>
# **findLocations**
> List&lt;Location&gt; findLocations(cloudId)



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
String cloudId = "cloudId_example"; // String | (Optional) Unique identifier to filter a specific cloud
try {
    List<Location> result = apiInstance.findLocations(cloudId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#findLocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| (Optional) Unique identifier to filter a specific cloud | [optional]

### Return type

[**List&lt;Location&gt;**](Location.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findVMs"></a>
# **findVMs**
> List&lt;VirtualMachine&gt; findVMs(cloudId)



Finds all virtual machines the user has access to

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
String cloudId = "cloudId_example"; // String | (Optional) Unique identifier to filter a specific cloud
try {
    List<VirtualMachine> result = apiInstance.findVMs(cloudId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#findVMs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| (Optional) Unique identifier to filter a specific cloud | [optional]

### Return type

[**List&lt;VirtualMachine&gt;**](VirtualMachine.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFunction"></a>
# **getFunction**
> Function getFunction(id)



Finds the function identified by the given id parameter

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
    Function result = apiInstance.getFunction(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#getFunction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

[**Function**](Function.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHardware"></a>
# **getHardware**
> Hardware getHardware(id)



Retrieves the hardware with the given id. 

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
    Hardware result = apiInstance.getHardware(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#getHardware");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

[**Hardware**](Hardware.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getImage"></a>
# **getImage**
> Image getImage(id)



Retrieves the image with the given id. 

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
    Image result = apiInstance.getImage(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#getImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

[**Image**](Image.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLocation"></a>
# **getLocation**
> Location getLocation(id)



Retrieves the location with the given id. 

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
    Location result = apiInstance.getLocation(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#getLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

[**Location**](Location.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVM"></a>
# **getVM**
> VirtualMachine getVM(id)



Finds the virtual machine identified by the given id parameter

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
    VirtualMachine result = apiInstance.getVM(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#getVM");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

[**VirtualMachine**](VirtualMachine.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

