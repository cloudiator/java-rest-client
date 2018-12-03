
# CloudiatorProcess

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**processType** | [**ProcessTypeEnum**](#ProcessTypeEnum) |  | 
**type** | [**TypeEnum**](#TypeEnum) |  | 
**schedule** | **String** | The id of the schedule this process belongs to. | 
**task** | **String** | The id of the task that is instantiated by this process. | 


<a name="ProcessTypeEnum"></a>
## Enum: ProcessTypeEnum
Name | Value
---- | -----
SINGLE | &quot;SINGLE&quot;
CLUSTER | &quot;CLUSTER&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
LANCE | &quot;LANCE&quot;
SPARK | &quot;SPARK&quot;



