
# NewPlatformRuntime

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | human readable name | 
**language** | [**LanguageEnum**](#LanguageEnum) | the specific runtime language | 
**languageVersion** | **Double** | language version number |  [optional]
**runtimeType** | [**RuntimeTypeEnum**](#RuntimeTypeEnum) | specifies the runtime type | 
**version** | **Double** | the version of the specified type | 


<a name="LanguageEnum"></a>
## Enum: LanguageEnum
Name | Value
---- | -----
PHP | &quot;PHP&quot;
JAVA | &quot;JAVA&quot;
RUBY | &quot;RUBY&quot;
PYTHON | &quot;PYTHON&quot;


<a name="RuntimeTypeEnum"></a>
## Enum: RuntimeTypeEnum
Name | Value
---- | -----
STANDALONE | &quot;standalone&quot;
SERVER | &quot;server&quot;



