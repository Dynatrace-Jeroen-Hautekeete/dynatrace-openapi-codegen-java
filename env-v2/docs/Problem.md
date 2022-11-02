

# Problem

The properties of a problem.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**affectedEntities** | [**Set&lt;EntityStub&gt;**](EntityStub.md) | A list of all entities that are affected by the problem. |  |
|**evidenceDetails** | [**EvidenceDetails**](EvidenceDetails.md) |  |  [optional] |
|**recentComments** | [**CommentsList**](CommentsList.md) |  |  [optional] |
|**impactAnalysis** | [**ImpactAnalysis**](ImpactAnalysis.md) |  |  [optional] |
|**linkedProblemInfo** | [**LinkedProblem**](LinkedProblem.md) |  |  [optional] |
|**rootCauseEntity** | [**EntityStub**](EntityStub.md) |  |  [optional] |
|**impactedEntities** | [**Set&lt;EntityStub&gt;**](EntityStub.md) | A list of all entities that are impacted by the problem. |  |
|**problemFilters** | [**Set&lt;AlertingProfileStub&gt;**](AlertingProfileStub.md) | A list of alerting profiles that match the problem. |  |
|**displayId** | **String** | The display ID of the problem. |  |
|**managementZones** | [**Set&lt;ManagementZone&gt;**](ManagementZone.md) | A list of all management zones that the problem belongs to. |  |
|**impactLevel** | [**ImpactLevelEnum**](#ImpactLevelEnum) | The impact level of the problem. It shows what is affected by the problem. |  |
|**severityLevel** | [**SeverityLevelEnum**](#SeverityLevelEnum) | The severity of the problem. |  |
|**entityTags** | [**Set&lt;METag&gt;**](METag.md) | A list of all entity tags of the problem. |  [optional] |
|**problemId** | **String** | The ID of the problem. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the problem. |  |
|**startTime** | **Long** | The start timestamp of the problem, in UTC milliseconds. |  |
|**endTime** | **Long** | The end timestamp of the problem, in UTC milliseconds.    Has &#x60;-1&#x60; value, if the problem is still open. |  |
|**title** | **String** | The name of the problem, displayed in the UI. |  |



## Enum: ImpactLevelEnum

| Name | Value |
|---- | -----|
| APPLICATION | &quot;APPLICATION&quot; |
| ENVIRONMENT | &quot;ENVIRONMENT&quot; |
| INFRASTRUCTURE | &quot;INFRASTRUCTURE&quot; |
| SERVICES | &quot;SERVICES&quot; |



## Enum: SeverityLevelEnum

| Name | Value |
|---- | -----|
| AVAILABILITY | &quot;AVAILABILITY&quot; |
| CUSTOM_ALERT | &quot;CUSTOM_ALERT&quot; |
| ERROR | &quot;ERROR&quot; |
| INFO | &quot;INFO&quot; |
| MONITORING_UNAVAILABLE | &quot;MONITORING_UNAVAILABLE&quot; |
| PERFORMANCE | &quot;PERFORMANCE&quot; |
| RESOURCE_CONTENTION | &quot;RESOURCE_CONTENTION&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CLOSED | &quot;CLOSED&quot; |
| OPEN | &quot;OPEN&quot; |



