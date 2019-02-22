
# Cloud

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpoint** | **String** | URI where the api of this cloud provider can be accessed. |  [optional]
**cloudType** | [**CloudType**](CloudType.md) |  | 
**api** | [**Api**](Api.md) |  | 
**credential** | [**CloudCredential**](CloudCredential.md) |  | 
**cloudConfiguration** | [**CloudConfiguration**](CloudConfiguration.md) |  |  [optional]
**id** | **String** | Unique identifier for the cloud |  [optional]
**owner** | **String** | Id of the user owning this cloud.  |  [optional]
**state** | [**StateEnum**](#StateEnum) | State of the cloud |  [optional]
**diagnostic** | **String** | Diagnostic information for the cloud |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OK | &quot;OK&quot;
ERROR | &quot;ERROR&quot;



