

# NewPlatformRuntime

Represents a runtime for a Platform component, e.g. Java, PHP, Tomcat
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | human readable name | 
**language** | [**LanguageEnum**](#LanguageEnum) | the specific runtime language | 
**languageVersion** | **Double** | language version number |  [optional]
**runtimeType** | [**RuntimeTypeEnum**](#RuntimeTypeEnum) | specifies the runtime type | 
**version** | **Double** | the version of the specified type | 



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



