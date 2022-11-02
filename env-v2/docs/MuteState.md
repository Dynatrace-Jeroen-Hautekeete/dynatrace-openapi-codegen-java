

# MuteState

Metadata of the muted state of a security problem in relation to an event.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**user** | **String** | The user who has muted or unmuted the problem. |  [optional] [readonly] |
|**reason** | [**ReasonEnum**](#ReasonEnum) | The reason for the mute state change. |  [optional] [readonly] |
|**comment** | **String** | A user&#39;s comment. |  [optional] [readonly] |



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



