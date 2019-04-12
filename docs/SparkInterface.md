
# SparkInterface

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file** | **String** | An URI where the executable of the Spark Application can be retrieved. Either a URL pointing to a web endpoint, or a locally available file.  |  [optional]
**className** | **String** | Optional className of the class containing the main method. Only required for Java.  |  [optional]
**arguments** | **List&lt;String&gt;** | Array of arguments passed to the application.  |  [optional]
**sparkArguments** | [**java.util.Map**](java.util.Map.md) | Additional Arguments passed to Spark.  |  [optional]
**sparkConfiguration** | [**java.util.Map**](java.util.Map.md) | Spark configuration properties.  |  [optional]
**processMapping** | [**ProcessMappingEnum**](#ProcessMappingEnum) |  |  [optional]


<a name="ProcessMappingEnum"></a>
## Enum: ProcessMappingEnum
Name | Value
---- | -----
SINGLE | &quot;SINGLE&quot;
CLUSTER | &quot;CLUSTER&quot;



