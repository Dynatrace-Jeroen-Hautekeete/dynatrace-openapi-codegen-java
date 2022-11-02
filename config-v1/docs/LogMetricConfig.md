

# LogMetricConfig

Custom log metric definition.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metricKey** | **String** | The unique key of the metric.   The key must have the &#x60;calc:log.&#x60; prefix. |  |
|**active** | **Boolean** | The metric is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  [optional] |
|**displayName** | **String** | The name of the metric, displayed in the UI. |  |
|**unit** | [**UnitEnum**](#UnitEnum) | The unit of the metric. |  |
|**unitDisplayName** | **String** | The display name of the unit.    Only applicable if the **unit** is set to &#x60;UNSPECIFIED&#x60;. |  [optional] |
|**searchString** | **String** | The pattern to look for in logs.    Use the [Dynatrace search query language](https://dt-url.net/vv83rhp) to specify it. Quotes must be escaped.    To return all results, leave the field blank. |  |
|**metricValueType** | [**MetricValueTypeEnum**](#MetricValueTypeEnum) | The type of the metric data points calculation. For now the only allowed value is &#x60;OCCURRENCES&#x60;. |  |
|**columnDefiningValue** | [**ColumnDefinition**](ColumnDefinition.md) |  |  [optional] |
|**logSourceFilters** | [**List&lt;LogSourceFilter&gt;**](LogSourceFilter.md) | A list of filters to define the logs to look into.    If several filters are specified, the OR logic applies. |  |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| BILLION | &quot;BILLION&quot; |
| BIT | &quot;BIT&quot; |
| BIT_PER_HOUR | &quot;BIT_PER_HOUR&quot; |
| BIT_PER_MINUTE | &quot;BIT_PER_MINUTE&quot; |
| BIT_PER_SECOND | &quot;BIT_PER_SECOND&quot; |
| BYTE | &quot;BYTE&quot; |
| BYTE_PER_HOUR | &quot;BYTE_PER_HOUR&quot; |
| BYTE_PER_MINUTE | &quot;BYTE_PER_MINUTE&quot; |
| BYTE_PER_SECOND | &quot;BYTE_PER_SECOND&quot; |
| CORES | &quot;CORES&quot; |
| COUNT | &quot;COUNT&quot; |
| DAY | &quot;DAY&quot; |
| DECIBEL_MILLI_WATT | &quot;DECIBEL_MILLI_WATT&quot; |
| GIBI_BYTE | &quot;GIBI_BYTE&quot; |
| GIGA | &quot;GIGA&quot; |
| GIGA_BYTE | &quot;GIGA_BYTE&quot; |
| HOUR | &quot;HOUR&quot; |
| KIBI_BYTE | &quot;KIBI_BYTE&quot; |
| KIBI_BYTE_PER_HOUR | &quot;KIBI_BYTE_PER_HOUR&quot; |
| KIBI_BYTE_PER_MINUTE | &quot;KIBI_BYTE_PER_MINUTE&quot; |
| KIBI_BYTE_PER_SECOND | &quot;KIBI_BYTE_PER_SECOND&quot; |
| KILO | &quot;KILO&quot; |
| KILO_BYTE | &quot;KILO_BYTE&quot; |
| KILO_BYTE_PER_HOUR | &quot;KILO_BYTE_PER_HOUR&quot; |
| KILO_BYTE_PER_MINUTE | &quot;KILO_BYTE_PER_MINUTE&quot; |
| KILO_BYTE_PER_SECOND | &quot;KILO_BYTE_PER_SECOND&quot; |
| KILO_METRE_PER_HOUR | &quot;KILO_METRE_PER_HOUR&quot; |
| MEBI_BYTE | &quot;MEBI_BYTE&quot; |
| MEBI_BYTE_PER_HOUR | &quot;MEBI_BYTE_PER_HOUR&quot; |
| MEBI_BYTE_PER_MINUTE | &quot;MEBI_BYTE_PER_MINUTE&quot; |
| MEBI_BYTE_PER_SECOND | &quot;MEBI_BYTE_PER_SECOND&quot; |
| MEGA | &quot;MEGA&quot; |
| MEGA_BYTE | &quot;MEGA_BYTE&quot; |
| MEGA_BYTE_PER_HOUR | &quot;MEGA_BYTE_PER_HOUR&quot; |
| MEGA_BYTE_PER_MINUTE | &quot;MEGA_BYTE_PER_MINUTE&quot; |
| MEGA_BYTE_PER_SECOND | &quot;MEGA_BYTE_PER_SECOND&quot; |
| METRE_PER_HOUR | &quot;METRE_PER_HOUR&quot; |
| METRE_PER_SECOND | &quot;METRE_PER_SECOND&quot; |
| MICRO_SECOND | &quot;MICRO_SECOND&quot; |
| MILLION | &quot;MILLION&quot; |
| MILLI_CORES | &quot;MILLI_CORES&quot; |
| MILLI_SECOND | &quot;MILLI_SECOND&quot; |
| MILLI_SECOND_PER_MINUTE | &quot;MILLI_SECOND_PER_MINUTE&quot; |
| MINUTE | &quot;MINUTE&quot; |
| MONTH | &quot;MONTH&quot; |
| MSU | &quot;MSU&quot; |
| NANO_SECOND | &quot;NANO_SECOND&quot; |
| NANO_SECOND_PER_MINUTE | &quot;NANO_SECOND_PER_MINUTE&quot; |
| NOT_APPLICABLE | &quot;NOT_APPLICABLE&quot; |
| PERCENT | &quot;PERCENT&quot; |
| PER_HOUR | &quot;PER_HOUR&quot; |
| PER_MINUTE | &quot;PER_MINUTE&quot; |
| PER_SECOND | &quot;PER_SECOND&quot; |
| PIXEL | &quot;PIXEL&quot; |
| PROMILLE | &quot;PROMILLE&quot; |
| RATIO | &quot;RATIO&quot; |
| SECOND | &quot;SECOND&quot; |
| STATE | &quot;STATE&quot; |
| UNSPECIFIED | &quot;UNSPECIFIED&quot; |
| WEEK | &quot;WEEK&quot; |
| YEAR | &quot;YEAR&quot; |



## Enum: MetricValueTypeEnum

| Name | Value |
|---- | -----|
| FP_COLUMN_AVG | &quot;FP_COLUMN_AVG&quot; |
| FP_COLUMN_COUNT | &quot;FP_COLUMN_COUNT&quot; |
| FP_COLUMN_MAX | &quot;FP_COLUMN_MAX&quot; |
| FP_COLUMN_MIN | &quot;FP_COLUMN_MIN&quot; |
| FP_COLUMN_SUM | &quot;FP_COLUMN_SUM&quot; |
| FP_COLUMN_TOP_X_AVG | &quot;FP_COLUMN_TOP_X_AVG&quot; |
| FP_COLUMN_TOP_X_COUNT | &quot;FP_COLUMN_TOP_X_COUNT&quot; |
| FP_COLUMN_TOP_X_MAX | &quot;FP_COLUMN_TOP_X_MAX&quot; |
| FP_COLUMN_TOP_X_MIN | &quot;FP_COLUMN_TOP_X_MIN&quot; |
| FP_COLUMN_TOP_X_SUM | &quot;FP_COLUMN_TOP_X_SUM&quot; |
| INT_COLUMN_AVG | &quot;INT_COLUMN_AVG&quot; |
| INT_COLUMN_COUNT | &quot;INT_COLUMN_COUNT&quot; |
| INT_COLUMN_MAX | &quot;INT_COLUMN_MAX&quot; |
| INT_COLUMN_MIN | &quot;INT_COLUMN_MIN&quot; |
| INT_COLUMN_SUM | &quot;INT_COLUMN_SUM&quot; |
| INT_COLUMN_TOP_X_AVG | &quot;INT_COLUMN_TOP_X_AVG&quot; |
| INT_COLUMN_TOP_X_COUNT | &quot;INT_COLUMN_TOP_X_COUNT&quot; |
| INT_COLUMN_TOP_X_MAX | &quot;INT_COLUMN_TOP_X_MAX&quot; |
| INT_COLUMN_TOP_X_MIN | &quot;INT_COLUMN_TOP_X_MIN&quot; |
| INT_COLUMN_TOP_X_SUM | &quot;INT_COLUMN_TOP_X_SUM&quot; |
| OCCURRENCES | &quot;OCCURRENCES&quot; |



