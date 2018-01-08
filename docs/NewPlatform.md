
# NewPlatform

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Human-readable name | 
**type** | [**TypeEnum**](#TypeEnum) | PaaS stack type |  [optional]
**api** | [**Api**](Api.md) |  | 
**credential** | [**CloudCredential**](CloudCredential.md) |  | 
**endpoint** | **String** | URI where the api of this platform provider can be accessed. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
HEROKU | &quot;HEROKU&quot;
OPENSHIFT | &quot;OPENSHIFT&quot;
CLOUDFOUNDRY | &quot;CLOUDFOUNDRY&quot;



