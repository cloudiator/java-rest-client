
# Node

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of this node.  |  [optional]
**originId** | **String** | Original id of this node. Is present of the node was created e.g. at a cloud provider.  |  [optional]
**userId** | **String** | User id of the owner of this node.  |  [optional]
**name** | **String** | Human-readable name for the node.  |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state the node is currently in.  |  [optional]
**loginCredential** | [**LoginCredential**](LoginCredential.md) |  |  [optional]
**nodeType** | [**NodeTypeEnum**](#NodeTypeEnum) | The type of this node.  |  [optional]
**ipAddresses** | [**List&lt;IpAddress&gt;**](IpAddress.md) | The public/private ip addresses under which this node is reachable.  |  [optional]
**nodeProperties** | [**NodeProperties**](NodeProperties.md) | Further properties of this node.  |  [optional]
**reason** | **String** | Reason this node was created  |  [optional]
**diagnostic** | **String** | Diagnostic information about the node state  |  [optional]
**nodeCandidate** | **String** | The node candidate this node was created from if applicable.  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
CREATED | &quot;CREATED&quot;
FAILED | &quot;FAILED&quot;
RUNNING | &quot;RUNNING&quot;
ERROR | &quot;ERROR&quot;
DELETED | &quot;DELETED&quot;


<a name="NodeTypeEnum"></a>
## Enum: NodeTypeEnum
Name | Value
---- | -----
UNKNOWN_TYPE | &quot;UNKNOWN_TYPE&quot;
VM | &quot;VM&quot;
BYON | &quot;BYON&quot;
CONTAINER | &quot;CONTAINER&quot;
FAAS | &quot;FAAS&quot;



