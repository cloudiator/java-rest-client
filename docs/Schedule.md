
# Schedule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job** | **String** | The identifier of the job |  [optional]
**instantiation** | [**InstantiationEnum**](#InstantiationEnum) | If the instantiation should be handled AUTOMATIC or MANUAL |  [optional]
**id** | **String** |  |  [optional]
**owner** | **String** |  |  [optional]
**processes** | [**List&lt;CloudiatorProcess&gt;**](CloudiatorProcess.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]


<a name="InstantiationEnum"></a>
## Enum: InstantiationEnum
Name | Value
---- | -----
AUTOMATIC | &quot;AUTOMATIC&quot;
MANUAL | &quot;MANUAL&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
RUNNING | &quot;RUNNING&quot;
ERROR | &quot;ERROR&quot;
RESTORING | &quot;RESTORING&quot;
DELETED | &quot;DELETED&quot;
MANUAL | &quot;MANUAL&quot;



