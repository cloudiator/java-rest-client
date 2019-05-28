
# CloudiatorProcess

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**originId** | **String** |  |  [optional]
**processType** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**schedule** | **String** | The id of the schedule this process belongs to. |  [optional]
**task** | **String** | The id of the task that is instantiated by this process. |  [optional]
**taskInterface** | **String** | The task interface used for running the process. |  [optional]
**diagnostic** | **String** | Diagnostic information about this process |  [optional]
**reason** | **String** | Reason this process was created |  [optional]
**owner** | **String** | The user this process was created for |  [optional]
**ipAddresses** | [**List&lt;IpAddress&gt;**](IpAddress.md) | The public/private ip addresses under which this process is reachable.  |  [optional]
**endpoint** | **String** | The endpoint where this process is reachable.  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
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
FAAS | &quot;FAAS&quot;
SIMULATION | &quot;SIMULATION&quot;
UNKNOWN | &quot;UNKNOWN&quot;



