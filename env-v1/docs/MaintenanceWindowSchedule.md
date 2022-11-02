

# MaintenanceWindowSchedule

An object defining date, time, and recurrence of the maintenance window.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Recurrence of the schedule. |  |
|**timezoneId** | **String** | The time zone of the start and end time. Default time zone is UTC.    You can user either UTC offset &#x60;UTC+01:00&#x60; format or the IANA Time Zone Database format. |  [optional] |
|**maintenanceStart** | **String** | The start date and time of the maintenance window in the &#x60;yyyy-MM-dd HH:mm&#x60; format. |  |
|**maintenanceEnd** | **String** | The end date and time of the maintenance window in the &#x60;yyyy-MM-dd HH:mm&#x60; format. |  |
|**recurrence** | [**MaintenanceWindowRecurrence**](MaintenanceWindowRecurrence.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DAY | &quot;Day&quot; |
| MONTH | &quot;Month&quot; |
| ONCE | &quot;Once&quot; |
| WEEK | &quot;Week&quot; |



