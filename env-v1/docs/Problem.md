

# Problem

The properties of a problem.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the problem. |  [optional] |
|**startTime** | **Long** | The start timestamp of the problem, in UTC milliseconds. |  [optional] |
|**endTime** | **Long** | The end timestamp of the problem, in UTC milliseconds.    Has the value &#x60;-1&#x60; if the problem is still open. |  [optional] |
|**displayName** | **String** | The name of the problem, displayed in the UI. |  [optional] |
|**impactLevel** | [**ImpactLevelEnum**](#ImpactLevelEnum) | The impact level of the problem. It shows what is affected by the problem: infrastructure, service, or application. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the problem. |  [optional] |
|**severityLevel** | [**SeverityLevelEnum**](#SeverityLevelEnum) | The severity of the problem. |  [optional] |
|**commentCount** | **Integer** | The number of comments to the problem. |  [optional] |
|**tagsOfAffectedEntities** | [**Set&lt;TagInfo&gt;**](TagInfo.md) | Tags of entities affected by the problem. |  [optional] |
|**rankedEvents** | [**List&lt;Event&gt;**](Event.md) | The list of events related to the problem. |  [optional] |
|**rankedImpacts** | [**List&lt;EventRestImpact&gt;**](EventRestImpact.md) | Provides impact information of the events in an aggregated form. For a more detailed impact analysis, see &#x60;rankedEvents&#x60;. |  [optional] |
|**affectedCounts** | [**ProblemAffectedCounts**](ProblemAffectedCounts.md) |  |  [optional] |
|**recoveredCounts** | [**ProblemRecoveredCounts**](ProblemRecoveredCounts.md) |  |  [optional] |
|**hasRootCause** | **Boolean** | Indicates whether Dynatrace has found at least one possible root cause for the problem. |  [optional] |



## Enum: ImpactLevelEnum

| Name | Value |
|---- | -----|
| APPLICATION | &quot;APPLICATION&quot; |
| ENVIRONMENT | &quot;ENVIRONMENT&quot; |
| INFRASTRUCTURE | &quot;INFRASTRUCTURE&quot; |
| SERVICE | &quot;SERVICE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CLOSED | &quot;CLOSED&quot; |
| OPEN | &quot;OPEN&quot; |



## Enum: SeverityLevelEnum

| Name | Value |
|---- | -----|
| AVAILABILITY | &quot;AVAILABILITY&quot; |
| CUSTOM_ALERT | &quot;CUSTOM_ALERT&quot; |
| ERROR | &quot;ERROR&quot; |
| MONITORING_UNAVAILABLE | &quot;MONITORING_UNAVAILABLE&quot; |
| PERFORMANCE | &quot;PERFORMANCE&quot; |
| RESOURCE_CONTENTION | &quot;RESOURCE_CONTENTION&quot; |



