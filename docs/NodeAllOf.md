

# NodeAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
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



