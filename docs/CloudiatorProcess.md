
# CloudiatorProcess

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**processType** | **String** |  | 
**state** | [**StateEnum**](#StateEnum) |  | 
**type** | [**TypeEnum**](#TypeEnum) |  | 
**schedule** | **String** | The id of the schedule this process belongs to. | 
**task** | **String** | The id of the task that is instantiated by this process. | 
**diagnostic** | **String** | Diagnostic information about this process |  [optional]
**reason** | **String** | Reason this process was created |  [optional]
**owner** | **String** | The user this process was created for |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
CREATED | &quot;CREATED&quot;
FAILED | &quot;FAILED&quot;
RUNNING | &quot;RUNNING&quot;
ERROR | &quot;ERROR&quot;
DELETED | &quot;DELETED&quot;
FINISHED | &quot;FINISHED&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
LANCE | &quot;LANCE&quot;
SPARK | &quot;SPARK&quot;



