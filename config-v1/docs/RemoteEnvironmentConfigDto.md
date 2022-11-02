

# RemoteEnvironmentConfigDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**networkScope** | [**NetworkScopeEnum**](#NetworkScopeEnum) | The network scope of the remote environment: * &#x60;EXTERNAL&#x60;: The remote environment is located in an another network.  * &#x60;INTERNAL&#x60;: The remote environment is located in the same network.  * &#x60;CLUSTER&#x60;: The remote environment is located in the same cluster.   Dynatrace SaaS can only use &#x60;EXTERNAL&#x60;.  If not set, &#x60;EXTERNAL&#x60; is used. |  [optional] |
|**displayName** | **String** | The display name of the remote environment. |  |
|**id** | **String** | The ID of the configuration. |  [optional] |
|**uri** | **String** | The URI of the remote environment. |  |
|**token** | **String** | The API token granting access to the remote environment.   The token must have the **Fetch data from a remote environment** (&#x60;RestRequestForwarding&#x60;) scope.   For security reasons, GET requests return this field as &#x60;null&#x60;. |  [optional] |



## Enum: NetworkScopeEnum

| Name | Value |
|---- | -----|
| CLUSTER | &quot;CLUSTER&quot; |
| EXTERNAL | &quot;EXTERNAL&quot; |
| INTERNAL | &quot;INTERNAL&quot; |



