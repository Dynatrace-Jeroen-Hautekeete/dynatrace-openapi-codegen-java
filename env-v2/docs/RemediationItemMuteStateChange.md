

# RemediationItemMuteStateChange

An updated configuration of the remediation item's mute state.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**muted** | **Boolean** | The desired mute state of the remediation item. |  |
|**reason** | [**ReasonEnum**](#ReasonEnum) | The reason for the mute state change. |  |
|**comment** | **String** | A comment about the mute state change reason. |  |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| AFFECTED | &quot;AFFECTED&quot; |
| CONFIGURATION_NOT_AFFECTED | &quot;CONFIGURATION_NOT_AFFECTED&quot; |
| FALSE_POSITIVE | &quot;FALSE_POSITIVE&quot; |
| IGNORE | &quot;IGNORE&quot; |
| INITIAL_STATE | &quot;INITIAL_STATE&quot; |
| OTHER | &quot;OTHER&quot; |
| VULNERABLE_CODE_NOT_IN_USE | &quot;VULNERABLE_CODE_NOT_IN_USE&quot; |



