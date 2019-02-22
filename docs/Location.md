
# Location

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier | 
**name** | **String** | Human-readable name | 
**providerId** | **String** | Original id issued by the provider | 
**locationScope** | [**LocationScopeEnum**](#LocationScopeEnum) | Scope of the location | 
**isAssignable** | **Boolean** | True of the location can be used to start virtual machines, false if not | 
**geoLocation** | [**GeoLocation**](GeoLocation.md) |  |  [optional]
**parent** | [**Location**](Location.md) |  |  [optional]
**state** | [**DiscoveryItemState**](DiscoveryItemState.md) |  |  [optional]
**owner** | **String** |  |  [optional]


<a name="LocationScopeEnum"></a>
## Enum: LocationScopeEnum
Name | Value
---- | -----
PROVIDER | &quot;PROVIDER&quot;
REGION | &quot;REGION&quot;
ZONE | &quot;ZONE&quot;
HOST | &quot;HOST&quot;



