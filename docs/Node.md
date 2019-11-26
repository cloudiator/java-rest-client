

# Node

Representation of a node used by Cloudiator
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Human-readable name for the node.  |  [optional]
**loginCredential** | [**LoginCredential**](LoginCredential.md) |  |  [optional]
**ipAddresses** | [**List&lt;IpAddress&gt;**](IpAddress.md) | The public/private ip addresses under which this node is reachable.  |  [optional]
**nodeProperties** | [**NodeProperties**](NodeProperties.md) |  |  [optional]
**reason** | **String** | Reason this node was created  |  [optional]
**diagnostic** | **String** | Diagnostic information about the node state  |  [optional]
**nodeCandidate** | **String** | The node candidate this node was created from if applicable.  |  [optional]
**id** | **String** | Unique identifier of this node.  |  [optional]
**originId** | **String** | Original id of this node. Is present of the node was created e.g. at a cloud provider.  |  [optional]
**userId** | **String** | User id of the owner of this node.  |  [optional]
**nodeType** | [**NodeTypeEnum**](#NodeTypeEnum) | The type of this node.  |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state the node is currently in.  |  [optional]



## Enum: NodeTypeEnum

Name | Value
---- | -----
UNKNOWN_TYPE | &quot;UNKNOWN_TYPE&quot;
VM | &quot;VM&quot;
BYON | &quot;BYON&quot;
CONTAINER | &quot;CONTAINER&quot;
FAAS | &quot;FAAS&quot;



## Enum: StateEnum

Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
RUNNING | &quot;RUNNING&quot;
ERROR | &quot;ERROR&quot;
DELETED | &quot;DELETED&quot;



