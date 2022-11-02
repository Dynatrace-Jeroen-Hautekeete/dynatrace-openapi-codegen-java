

# Recurrence

The recurrence of the maintenance window.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dayOfWeek** | [**DayOfWeekEnum**](#DayOfWeekEnum) | The day of the week for weekly maintenance.   The format is the full name of the day in upper case, for example &#x60;THURSDAY&#x60;. |  [optional] |
|**dayOfMonth** | **Integer** | The day of the month for monthly maintenance.   The value of &#x60;31&#x60; is treated as the last day of the month for months that don&#39;t have a 31st day. The value of &#x60;30&#x60; is also treated as the last day of the month for February. |  [optional] |
|**startTime** | **String** | The start time of the maintenance window in HH:mm format. |  |
|**durationMinutes** | **Integer** | The duration of the maintenance window in minutes. |  |



## Enum: DayOfWeekEnum

| Name | Value |
|---- | -----|
| FRIDAY | &quot;FRIDAY&quot; |
| MONDAY | &quot;MONDAY&quot; |
| SATURDAY | &quot;SATURDAY&quot; |
| SUNDAY | &quot;SUNDAY&quot; |
| THURSDAY | &quot;THURSDAY&quot; |
| TUESDAY | &quot;TUESDAY&quot; |
| WEDNESDAY | &quot;WEDNESDAY&quot; |



