
# FaasInterface

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**functionName** | **String** | Unique name of the function.  |  [optional]
**sourceCodeUrl** | **String** | URL path to ZIP artifact.  |  [optional]
**handler** | **String** | function in the code to be invoked.  |  [optional]
**triggers** | [**List&lt;Trigger&gt;**](Trigger.md) | Events on which function will be invoked.  |  [optional]
**timeout** | **Integer** | Allowed time in seconds for function to finish its task.  |  [optional]
**functionEnvironment** | [**java.util.Map**](java.util.Map.md) | Environment variables passed to function.  |  [optional]



