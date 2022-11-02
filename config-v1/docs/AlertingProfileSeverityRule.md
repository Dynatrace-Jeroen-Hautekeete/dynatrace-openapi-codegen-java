

# AlertingProfileSeverityRule

A severity rule of the alerting profile.    A severity rule defines the level of severity that must be met before an alert is sent our for a detected problem. Additionally it restricts the alerting to certain monitored entities.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**severityLevel** | [**SeverityLevelEnum**](#SeverityLevelEnum) | The severity level to trigger the alert. |  |
|**tagFilter** | [**AlertingProfileTagFilter**](AlertingProfileTagFilter.md) |  |  |
|**delayInMinutes** | **Integer** | Send a notification if a problem remains open longer than *X* minutes. |  |



## Enum: SeverityLevelEnum

| Name | Value |
|---- | -----|
| AVAILABILITY | &quot;AVAILABILITY&quot; |
| CUSTOM_ALERT | &quot;CUSTOM_ALERT&quot; |
| ERROR | &quot;ERROR&quot; |
| MONITORING_UNAVAILABLE | &quot;MONITORING_UNAVAILABLE&quot; |
| PERFORMANCE | &quot;PERFORMANCE&quot; |
| RESOURCE_CONTENTION | &quot;RESOURCE_CONTENTION&quot; |



