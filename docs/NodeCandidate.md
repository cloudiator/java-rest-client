

# NodeCandidate

A node creatable by the system
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**nodeCandidateType** | [**NodeCandidateTypeEnum**](#NodeCandidateTypeEnum) |  |  [optional]
**price** | **Double** |  |  [optional]
**cloud** | [**Cloud**](Cloud.md) |  |  [optional]
**image** | [**Image**](Image.md) |  |  [optional]
**hardware** | [**Hardware**](Hardware.md) |  |  [optional]
**location** | [**Location**](Location.md) |  |  [optional]
**pricePerInvocation** | **Double** |  |  [optional]
**memoryPrice** | **Double** |  |  [optional]
**environment** | [**Environment**](Environment.md) |  |  [optional]



## Enum: NodeCandidateTypeEnum

Name | Value
---- | -----
IAAS | &quot;IAAS&quot;
FAAS | &quot;FAAS&quot;
PAAS | &quot;PAAS&quot;
BYON | &quot;BYON&quot;
SIMULATION | &quot;SIMULATION&quot;



