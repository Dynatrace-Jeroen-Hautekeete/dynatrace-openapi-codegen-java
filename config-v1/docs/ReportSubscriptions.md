

# ReportSubscriptions

Configuration of a report subscription.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schedule** | [**ScheduleEnum**](#ScheduleEnum) | The schedule of the subscription.    * Weekly subscribers receive the report every Monday at midnight.   * Monthly subscribers receive the report on the first Monday of the month at midnight. |  |
|**recipients** | **Set&lt;String&gt;** | A list of the recipients.   You can specify email addresses or Dynatrace user IDs here. |  |



## Enum: ScheduleEnum

| Name | Value |
|---- | -----|
| MONTH | &quot;MONTH&quot; |
| WEEK | &quot;WEEK&quot; |



