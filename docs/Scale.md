

# Scale

Scaling action object containing the required information to scale an Cloudiator cluster process 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schedule** | **String** | The identifier of the schedule |  [optional]
**task** | **String** | The identifier of the task |  [optional]
**scaleDirection** | [**ScaleDirectionEnum**](#ScaleDirectionEnum) |  |  [optional]
**nodes** | **List&lt;String&gt;** | An optional list of nodes for the scaling process |  [optional]



## Enum: ScaleDirectionEnum

Name | Value
---- | -----
IN | &quot;SCALE_IN&quot;
OUT | &quot;SCALE_OUT&quot;



