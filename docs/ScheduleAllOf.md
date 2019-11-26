

# ScheduleAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**owner** | **String** |  |  [optional]
**processes** | [**List&lt;CloudiatorProcess&gt;**](CloudiatorProcess.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
RUNNING | &quot;RUNNING&quot;
ERROR | &quot;ERROR&quot;
RESTORING | &quot;RESTORING&quot;
DELETED | &quot;DELETED&quot;
MANUAL | &quot;MANUAL&quot;



