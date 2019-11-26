

# PlatformRuntime

Repesents a PaaS environemnt to run an component 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | human readable name | 
**language** | [**LanguageEnum**](#LanguageEnum) | the specific runtime language | 
**languageVersion** | **Double** | language version number |  [optional]
**runtimeType** | [**RuntimeTypeEnum**](#RuntimeTypeEnum) | specifies the runtime type | 
**version** | **Double** | the version of the specified type | 
**id** | **String** | Unique identifier for the hardwareRuntime |  [optional]



## Enum: LanguageEnum

Name | Value
---- | -----
PHP | &quot;PHP&quot;
JAVA | &quot;JAVA&quot;
RUBY | &quot;RUBY&quot;
PYTHON | &quot;PYTHON&quot;



## Enum: RuntimeTypeEnum

Name | Value
---- | -----
STANDALONE | &quot;standalone&quot;
SERVER | &quot;server&quot;



