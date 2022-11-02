

# RemediationItemMuteState

The mute state of a remediation item of a security problem.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**muted** | **Boolean** | The remediation is (&#x60;true&#x60;) or is not (&#x60;false&#x60;) muted. |  [optional] [readonly] |
|**user** | **String** | The user who last changed the mute state. |  [optional] [readonly] |
|**lastUpdatedTimestamp** | **Long** | The timestamp (UTC milliseconds) of the last update of the mute state. |  [optional] [readonly] |
|**reason** | [**ReasonEnum**](#ReasonEnum) | The reason for the most recent mute state change. |  [optional] [readonly] |
|**comment** | **String** | A short comment about the most recent mute state change. |  [optional] [readonly] |



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



