
# Node

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeId** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**loginCredential** | [**LoginCredential**](LoginCredential.md) |  |  [optional]
**nodeType** | [**NodeTypeEnum**](#NodeTypeEnum) |  |  [optional]
**ipAddresses** | [**List&lt;IpAddress&gt;**](IpAddress.md) |  |  [optional]
**nodeProperties** | [**NodeProperties**](NodeProperties.md) |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OK | &quot;OK&quot;
ERROR | &quot;ERROR&quot;


<a name="NodeTypeEnum"></a>
## Enum: NodeTypeEnum
Name | Value
---- | -----
UNKNOWN_TYPE | &quot;UNKNOWN_TYPE&quot;
VM | &quot;VM&quot;
BYON | &quot;BYON&quot;
CONTAINER | &quot;CONTAINER&quot;
FAAS | &quot;FAAS&quot;



