

# ExtensionState

The state of the extension.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extensionId** | **String** | The ID of the extension. |  [optional] |
|**version** | **String** | The version of the extension (for example &#x60;1.0.0&#x60;). |  [optional] |
|**endpointId** | **String** | The ID of the endpoint where the state is detected - Active Gate only. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | The state of the extension. |  [optional] |
|**stateDescription** | **String** | A short description of the state. |  [optional] |
|**timestamp** | **Long** | The timestamp when the state was detected, in UTC milliseconds. |  [optional] |
|**hostId** | **String** | The ID of the host on which the extension runs. |  [optional] |
|**processId** | **String** | The ID of the entity on which the extension is active. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ERROR_AUTH | &quot;ERROR_AUTH&quot; |
| ERROR_COMMUNICATION_FAILURE | &quot;ERROR_COMMUNICATION_FAILURE&quot; |
| ERROR_CONFIG | &quot;ERROR_CONFIG&quot; |
| ERROR_TIMEOUT | &quot;ERROR_TIMEOUT&quot; |
| ERROR_UNKNOWN | &quot;ERROR_UNKNOWN&quot; |
| INCOMPATIBLE | &quot;INCOMPATIBLE&quot; |
| LIMIT_REACHED | &quot;LIMIT_REACHED&quot; |
| NOTHING_TO_REPORT | &quot;NOTHING_TO_REPORT&quot; |
| OK | &quot;OK&quot; |
| STATE_TYPE_UNKNOWN | &quot;STATE_TYPE_UNKNOWN&quot; |
| UNINITIALIZED | &quot;UNINITIALIZED&quot; |
| UNSUPPORTED | &quot;UNSUPPORTED&quot; |
| WAITING_FOR_STATE | &quot;WAITING_FOR_STATE&quot; |



