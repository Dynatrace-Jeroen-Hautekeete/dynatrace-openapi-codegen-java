

# SecurityProblemEvent

The event of a security problem.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timestamp** | **Long** | The timestamp when the event occurred. |  [optional] [readonly] |
|**reason** | [**ReasonEnum**](#ReasonEnum) | The reason of the event creation. |  [optional] [readonly] |
|**riskAssessmentSnapshot** | [**RiskAssessmentSnapshot**](RiskAssessmentSnapshot.md) |  |  [optional] |
|**muteState** | [**MuteState**](MuteState.md) |  |  [optional] |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;SECURITY_PROBLEM_CREATED&quot; |
| MUTED | &quot;SECURITY_PROBLEM_MUTED&quot; |
| REOPENED | &quot;SECURITY_PROBLEM_REOPENED&quot; |
| RESOLVED | &quot;SECURITY_PROBLEM_RESOLVED&quot; |
| UNMUTED | &quot;SECURITY_PROBLEM_UNMUTED&quot; |



