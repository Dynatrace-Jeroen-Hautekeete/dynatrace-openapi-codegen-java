

# RemediationItem

A possible remediation for a security problem.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the remediation item. |  [optional] [readonly] |
|**entityIds** | **Set&lt;String&gt;** | A list of related entities, represented by entity IDs. |  [optional] [readonly] |
|**name** | **String** | The name of the entity. |  [optional] [readonly] |
|**firstAffectedTimestamp** | **Long** | The timestamp when the entity has first been related to the vulnerability. |  [optional] [readonly] |
|**assessment** | [**RemediationAssessment**](RemediationAssessment.md) |  |  [optional] |
|**resolvedTimestamp** | **Long** | The timestamp (UTC milliseconds) when the vulnerability has been resolved for related entities. |  [optional] [readonly] |
|**vulnerabilityState** | [**VulnerabilityStateEnum**](#VulnerabilityStateEnum) | The current state of related entities for the vulnerability. |  [optional] [readonly] |
|**muteState** | [**RemediationItemMuteState**](RemediationItemMuteState.md) |  |  [optional] |
|**vulnerableComponents** | [**List&lt;VulnerableComponent&gt;**](VulnerableComponent.md) | A list of vulnerable components of the remediation item.   A vulnerable component is what causes the security problem. |  [optional] [readonly] |
|**remediationProgress** | [**RemediationProgress**](RemediationProgress.md) |  |  [optional] |



## Enum: VulnerabilityStateEnum

| Name | Value |
|---- | -----|
| RESOLVED | &quot;RESOLVED&quot; |
| VULNERABLE | &quot;VULNERABLE&quot; |



