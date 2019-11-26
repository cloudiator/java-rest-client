

# Queue

Represents a queued task within the system. Used to execute long running requests. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for the queued task |  [optional]
**status** | [**QueueStatus**](QueueStatus.md) |  |  [optional]
**start** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**end** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**diagnosis** | **String** | Gives human-readable feedback |  [optional]
**location** | **String** | Location of the original entity |  [optional]
**taskId** | **String** | Id of the original entity |  [optional]



