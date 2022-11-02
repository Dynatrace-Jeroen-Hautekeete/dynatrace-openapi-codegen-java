

# Schedule

The schedule of the maintenance window.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recurrenceType** | [**RecurrenceTypeEnum**](#RecurrenceTypeEnum) | The type of the schedule recurrence. |  |
|**recurrence** | [**Recurrence**](Recurrence.md) |  |  [optional] |
|**start** | **String** | The start date and time of the maintenance window validity period in yyyy-mm-dd HH:mm format. |  |
|**end** | **String** | The end date and time of the maintenance window validity period in yyyy-mm-dd HH:mm format. |  |
|**zoneId** | **String** | The time zone of the start and end time. Default time zone is UTC.   You can use either UTC offset &#x60;UTC+01:00&#x60; format or the IANA Time Zone Database format (for example, &#x60;Europe/Vienna&#x60;). |  |



## Enum: RecurrenceTypeEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;DAILY&quot; |
| MONTHLY | &quot;MONTHLY&quot; |
| ONCE | &quot;ONCE&quot; |
| WEEKLY | &quot;WEEKLY&quot; |



