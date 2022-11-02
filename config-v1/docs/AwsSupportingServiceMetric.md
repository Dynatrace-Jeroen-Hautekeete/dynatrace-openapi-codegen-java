

# AwsSupportingServiceMetric

A metric of service to be monitored.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the metric of the service. |  |
|**statistic** | [**StatisticEnum**](#StatisticEnum) | The statistic (aggregation) to be used for the metric. AVG_MIN_MAX value is 3 statistics at once: AVERAGE, MINIMUM and MAXIMUM |  |
|**dimensions** | **List&lt;String&gt;** | A list of metric&#39;s dimensions names. |  |



## Enum: StatisticEnum

| Name | Value |
|---- | -----|
| AVERAGE | &quot;AVERAGE&quot; |
| AVG_MIN_MAX | &quot;AVG_MIN_MAX&quot; |
| MAXIMUM | &quot;MAXIMUM&quot; |
| MINIMUM | &quot;MINIMUM&quot; |
| SAMPLE_COUNT | &quot;SAMPLE_COUNT&quot; |
| SUM | &quot;SUM&quot; |



