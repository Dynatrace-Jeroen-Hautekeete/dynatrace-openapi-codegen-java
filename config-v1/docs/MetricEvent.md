

# MetricEvent

The configuration of the metric event.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**id** | **String** | The ID of the metric event. |  [optional] |
|**metricId** | **String** | The ID of the metric evaluated by the metric event. |  [optional] |
|**metricSelector** | **String** | The metric selector that should be executed. |  [optional] |
|**name** | **String** | The name of the metric event displayed in the UI. |  |
|**description** | **String** | The description of the metric event. |  |
|**aggregationType** | [**AggregationTypeEnum**](#AggregationTypeEnum) | How the metric data points are aggregated for the evaluation.    The timeseries must support this aggregation. |  [optional] |
|**severity** | [**SeverityEnum**](#SeverityEnum) | The type of the event to trigger on the threshold violation.   The &#x60;CUSTOM_ALERT&#x60; type is not correlated with other alerts. The &#x60;INFO&#x60; type does not open a problem. |  [optional] |
|**enabled** | **Boolean** | The metric event is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**disabledReason** | [**DisabledReasonEnum**](#DisabledReasonEnum) | The reason of automatic disabling.   The &#x60;NONE&#x60; means config was not disabled automatically. |  [optional] [readonly] |
|**warningReason** | [**WarningReasonEnum**](#WarningReasonEnum) | The reason of a warning set on the config.   The &#x60;NONE&#x60; means config has no warnings. |  [optional] [readonly] |
|**alertingScope** | [**List&lt;MetricEventAlertingScope&gt;**](MetricEventAlertingScope.md) | Defines the scope of the metric event. Only one filter is allowed per filter type, except for tags, where up to 3 are allowed. The filters are combined by conjunction. |  [optional] |
|**metricDimensions** | [**List&lt;MetricEventDimensions&gt;**](MetricEventDimensions.md) | Defines the dimensions of the metric to alert on. The filters are combined by conjunction. |  [optional] |
|**monitoringStrategy** | [**MetricEventMonitoringStrategy**](MetricEventMonitoringStrategy.md) |  |  |
|**primaryDimensionKey** | **String** | Defines which dimension key should be used for the **alertingScope**. |  [optional] |
|**queryOffset** | **Long** | Defines the query offset to adapt the evaluation timeframe for known metric latency. |  [optional] |



## Enum: AggregationTypeEnum

| Name | Value |
|---- | -----|
| AVG | &quot;AVG&quot; |
| COUNT | &quot;COUNT&quot; |
| MAX | &quot;MAX&quot; |
| MEDIAN | &quot;MEDIAN&quot; |
| MIN | &quot;MIN&quot; |
| P90 | &quot;P90&quot; |
| SUM | &quot;SUM&quot; |
| VALUE | &quot;VALUE&quot; |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| AVAILABILITY | &quot;AVAILABILITY&quot; |
| CUSTOM_ALERT | &quot;CUSTOM_ALERT&quot; |
| ERROR | &quot;ERROR&quot; |
| INFO | &quot;INFO&quot; |
| PERFORMANCE | &quot;PERFORMANCE&quot; |
| RESOURCE_CONTENTION | &quot;RESOURCE_CONTENTION&quot; |



## Enum: DisabledReasonEnum

| Name | Value |
|---- | -----|
| METRIC_DEFINITION_INCONSISTENCY | &quot;METRIC_DEFINITION_INCONSISTENCY&quot; |
| NONE | &quot;NONE&quot; |
| TOO_MANY_DIMS | &quot;TOO_MANY_DIMS&quot; |
| TOPX_FORCIBLY_DEACTIVATED | &quot;TOPX_FORCIBLY_DEACTIVATED&quot; |



## Enum: WarningReasonEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| TOO_MANY_DIMS | &quot;TOO_MANY_DIMS&quot; |



