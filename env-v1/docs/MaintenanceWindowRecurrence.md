

# MaintenanceWindowRecurrence

The recurrence of the maintenance window.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**day** | [**DayEnum**](#DayEnum) | The day of the week for weekly maintenance.    The format is the full name of the day in upper case, for example &#x60;WEDNESDAY&#x60;. |  [optional] |
|**dayOfMonth** | **Integer** | The day of the month for monthly maintenance. |  [optional] |
|**start** | **String** | The start time of the maintenance window. The format is &#x60;HH:mm&#x60;. |  |
|**duration** | **Integer** | The duration of the maintenance window in minutes. |  |



## Enum: DayEnum

| Name | Value |
|---- | -----|
| FRIDAY | &quot;FRIDAY&quot; |
| MONDAY | &quot;MONDAY&quot; |
| SATURDAY | &quot;SATURDAY&quot; |
| SUNDAY | &quot;SUNDAY&quot; |
| THURSDAY | &quot;THURSDAY&quot; |
| TUESDAY | &quot;TUESDAY&quot; |
| WEDNESDAY | &quot;WEDNESDAY&quot; |



