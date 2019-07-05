
# ByonNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Human-readable name for the node.  |  [optional]
**loginCredential** | [**LoginCredential**](LoginCredential.md) |  |  [optional]
**ipAddresses** | [**List&lt;IpAddress&gt;**](IpAddress.md) | The public/private ip addresses under which this node is reachable.  |  [optional]
**nodeProperties** | [**NodeProperties**](NodeProperties.md) | Further properties of this node.  |  [optional]
**reason** | **String** | Reason this node was created  |  [optional]
**diagnostic** | **String** | Diagnostic information about the node state  |  [optional]
**nodeCandidate** | **String** | The node candidate this node was created from if applicable.  |  [optional]
**id** | **String** | Unique identifier of this BYON.  |  [optional]
**userId** | **String** | User id of the owner of this node.  |  [optional]
**allocated** | **Boolean** | Signals if the node was allocated by cloudiator  |  [optional]



