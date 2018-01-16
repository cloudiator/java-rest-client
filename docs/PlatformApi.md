# PlatformApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPlatform**](PlatformApi.md#addPlatform) | **POST** /platform | 
[**addPlatformEnvironment**](PlatformApi.md#addPlatformEnvironment) | **POST** /platformEnvironment | 
[**addPlatformHardware**](PlatformApi.md#addPlatformHardware) | **POST** /platformHardware | 
[**addPlatformRuntime**](PlatformApi.md#addPlatformRuntime) | **POST** /platformRuntime | 
[**deletePlatform**](PlatformApi.md#deletePlatform) | **DELETE** /platform/{id} | 
[**findPlatform**](PlatformApi.md#findPlatform) | **GET** /platform/{id} | 
[**findPlatformEnvironment**](PlatformApi.md#findPlatformEnvironment) | **GET** /platformEnvironment/{id} | 
[**findPlatformEnvironments**](PlatformApi.md#findPlatformEnvironments) | **GET** /platformEnvironment | 
[**findPlatformHardware**](PlatformApi.md#findPlatformHardware) | **GET** /platformHardware/{id} | 
[**findPlatformHardwares**](PlatformApi.md#findPlatformHardwares) | **GET** /platformHardware | 
[**findPlatformRuntime**](PlatformApi.md#findPlatformRuntime) | **GET** /platformRuntime/{id} | 
[**findPlatformRuntimes**](PlatformApi.md#findPlatformRuntimes) | **GET** /platformRuntime | 
[**findPlatforms**](PlatformApi.md#findPlatforms) | **GET** /platform | 


<a name="addPlatform"></a>
# **addPlatform**
> Platform addPlatform(platform)



Creates a new platform.

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.PlatformApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PlatformApi apiInstance = new PlatformApi();
NewPlatform platform = new NewPlatform(); // NewPlatform | Platform to add
try {
    Platform result = apiInstance.addPlatform(platform);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformApi#addPlatform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | [**NewPlatform**](NewPlatform.md)| Platform to add |

### Return type

[**Platform**](Platform.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPlatformEnvironment"></a>
# **addPlatformEnvironment**
> PlatformEnvironment addPlatformEnvironment(platformEnvironment)



Creates a new PlatformEnvironment 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.PlatformApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PlatformApi apiInstance = new PlatformApi();
NewPlatformEnvironment platformEnvironment = new NewPlatformEnvironment(); // NewPlatformEnvironment | PlatformEnvironment to be created 
try {
    PlatformEnvironment result = apiInstance.addPlatformEnvironment(platformEnvironment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformApi#addPlatformEnvironment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platformEnvironment** | [**NewPlatformEnvironment**](NewPlatformEnvironment.md)| PlatformEnvironment to be created  |

### Return type

[**PlatformEnvironment**](PlatformEnvironment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPlatformHardware"></a>
# **addPlatformHardware**
> PlatformHardware addPlatformHardware(platformHardware)



Creates a new PlatformHardware 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.PlatformApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PlatformApi apiInstance = new PlatformApi();
NewPlatformHardware platformHardware = new NewPlatformHardware(); // NewPlatformHardware | PlatformHardware to be created 
try {
    PlatformHardware result = apiInstance.addPlatformHardware(platformHardware);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformApi#addPlatformHardware");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platformHardware** | [**NewPlatformHardware**](NewPlatformHardware.md)| PlatformHardware to be created  |

### Return type

[**PlatformHardware**](PlatformHardware.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPlatformRuntime"></a>
# **addPlatformRuntime**
> PlatformRuntime addPlatformRuntime(platformRuntime)



Creates a new PlatformRuntime 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.PlatformApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PlatformApi apiInstance = new PlatformApi();
NewPlatformRuntime platformRuntime = new NewPlatformRuntime(); // NewPlatformRuntime | PlatformRuntime to be created 
try {
    PlatformRuntime result = apiInstance.addPlatformRuntime(platformRuntime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformApi#addPlatformRuntime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platformRuntime** | [**NewPlatformRuntime**](NewPlatformRuntime.md)| PlatformRuntime to be created  |

### Return type

[**PlatformRuntime**](PlatformRuntime.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePlatform"></a>
# **deletePlatform**
> deletePlatform(id)



Deletes the platform identified by the given id paramater. 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.PlatformApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PlatformApi apiInstance = new PlatformApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    apiInstance.deletePlatform(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformApi#deletePlatform");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPlatform"></a>
# **findPlatform**
> Platform findPlatform(id)



Returns the platform identified by the given id parameter 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.PlatformApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PlatformApi apiInstance = new PlatformApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    Platform result = apiInstance.findPlatform(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformApi#findPlatform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

[**Platform**](Platform.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findPlatformEnvironment"></a>
# **findPlatformEnvironment**
> PlatformEnvironment findPlatformEnvironment(id)



Returns the PlatformEnvironment identified by the id parameter. 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.PlatformApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PlatformApi apiInstance = new PlatformApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    PlatformEnvironment result = apiInstance.findPlatformEnvironment(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformApi#findPlatformEnvironment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

[**PlatformEnvironment**](PlatformEnvironment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findPlatformEnvironments"></a>
# **findPlatformEnvironments**
> List&lt;PlatformEnvironment&gt; findPlatformEnvironments()



Returns all platform environment  visible to the user 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.PlatformApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PlatformApi apiInstance = new PlatformApi();
try {
    List<PlatformEnvironment> result = apiInstance.findPlatformEnvironments();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformApi#findPlatformEnvironments");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PlatformEnvironment&gt;**](PlatformEnvironment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findPlatformHardware"></a>
# **findPlatformHardware**
> PlatformHardware findPlatformHardware(id)



Returns the PlatformHardware identified by the id parameter. 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.PlatformApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PlatformApi apiInstance = new PlatformApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    PlatformHardware result = apiInstance.findPlatformHardware(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformApi#findPlatformHardware");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

[**PlatformHardware**](PlatformHardware.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findPlatformHardwares"></a>
# **findPlatformHardwares**
> List&lt;PlatformHardware&gt; findPlatformHardwares()



Returns all platform hardware visible to the user 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.PlatformApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PlatformApi apiInstance = new PlatformApi();
try {
    List<PlatformHardware> result = apiInstance.findPlatformHardwares();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformApi#findPlatformHardwares");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PlatformHardware&gt;**](PlatformHardware.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findPlatformRuntime"></a>
# **findPlatformRuntime**
> PlatformRuntime findPlatformRuntime(id)



Returns the PlatformRuntime identified by the id parameter. 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.PlatformApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PlatformApi apiInstance = new PlatformApi();
String id = "id_example"; // String | Unique identifier of the resource
try {
    PlatformRuntime result = apiInstance.findPlatformRuntime(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformApi#findPlatformRuntime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier of the resource |

### Return type

[**PlatformRuntime**](PlatformRuntime.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findPlatformRuntimes"></a>
# **findPlatformRuntimes**
> List&lt;PlatformRuntime&gt; findPlatformRuntimes()



Returns all platform runtime  visible to the user 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.PlatformApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PlatformApi apiInstance = new PlatformApi();
try {
    List<PlatformRuntime> result = apiInstance.findPlatformRuntimes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformApi#findPlatformRuntimes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PlatformRuntime&gt;**](PlatformRuntime.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findPlatforms"></a>
# **findPlatforms**
> List&lt;Platform&gt; findPlatforms()



Returns all platform from the system that the user has access to 

### Example
```java
// Import classes:
//import io.github.cloudiator.rest.ApiClient;
//import io.github.cloudiator.rest.ApiException;
//import io.github.cloudiator.rest.Configuration;
//import io.github.cloudiator.rest.auth.*;
//import io.github.cloudiator.rest.api.PlatformApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PlatformApi apiInstance = new PlatformApi();
try {
    List<Platform> result = apiInstance.findPlatforms();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformApi#findPlatforms");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Platform&gt;**](Platform.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

