

# CalculatedServiceMetric

Descriptor of a calculated service metric.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**tsmMetricKey** | **String** | The key of the calculated service metric. |  |
|**name** | **String** | The displayed name of the metric. |  |
|**enabled** | **Boolean** | The metric is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**ignoreMutedRequests** | **Boolean** | Metric should (&#x60;true&#x60;) or not (&#x60;false&#x60;) ignore muted requests. |  [optional] |
|**metricDefinition** | [**CalculatedMetricDefinition**](CalculatedMetricDefinition.md) |  |  |
|**unit** | [**UnitEnum**](#UnitEnum) | The unit of the metric. |  |
|**unitDisplayName** | **String** | The display name of the metric&#39;s unit.    Only applicable when the **unit** parameter is set to &#x60;UNSPECIFIED&#x60;. |  [optional] |
|**entityId** | **String** | Restricts the metric usage to the specified service.    This field is mutually exclusive with the **managementZones** field. |  [optional] |
|**managementZones** | **List&lt;String&gt;** | Restricts the metric usage to specified management zones.    This field is mutually exclusive with the **entityId** field. |  [optional] |
|**conditions** | [**List&lt;Condition&gt;**](Condition.md) | The set of conditions for the metric usage.    **All** the specified conditions must be fulfilled to use the metric. |  [optional] |
|**dimensionDefinition** | [**DimensionDefinition**](DimensionDefinition.md) |  |  [optional] |



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



