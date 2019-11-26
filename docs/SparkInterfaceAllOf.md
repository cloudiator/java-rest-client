

# SparkInterfaceAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file** | **String** | An URI where the executable of the Spark Application can be retrieved. Either a URL pointing to a web endpoint, or a locally available file.  |  [optional]
**className** | **String** | Optional className of the class containing the main method. Only required for Java.  |  [optional]
**arguments** | **List&lt;String&gt;** | Array of arguments passed to the application.  |  [optional]
**sparkArguments** | **Map&lt;String, String&gt;** | A key - value type of Map using &lt;String, String&gt;.  |  [optional]
**sparkConfiguration** | **Map&lt;String, String&gt;** | A key - value type of Map using &lt;String, String&gt;.  |  [optional]
**processMapping** | [**ProcessMapping**](ProcessMapping.md) |  |  [optional]



