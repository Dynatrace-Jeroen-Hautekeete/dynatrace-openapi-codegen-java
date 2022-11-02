

# RemoteEnvironmentConfigStub

The short representation of a remote environment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**networkScope** | [**NetworkScopeEnum**](#NetworkScopeEnum) | The network scope of the remote environment: * &#x60;EXTERNAL&#x60;: The remote environment is located in an another network.  * &#x60;INTERNAL&#x60;: The remote environment is located in the same network.  * &#x60;CLUSTER&#x60;: The remote environment is located in the same cluster.   Dynatrace SaaS can only use &#x60;EXTERNAL&#x60;.  If not set, &#x60;EXTERNAL&#x60; is used. |  [optional] |
|**name** | **String** |  |  [optional] |
|**id** | **String** |  |  |
|**uri** | **String** | The display name of the remote environment. |  [optional] |



## Enum: NetworkScopeEnum

| Name | Value |
|---- | -----|
| CLUSTER | &quot;CLUSTER&quot; |
| EXTERNAL | &quot;EXTERNAL&quot; |
| INTERNAL | &quot;INTERNAL&quot; |



