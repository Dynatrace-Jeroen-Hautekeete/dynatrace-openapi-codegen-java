

# MetricEventStaticThresholdMonitoringStrategyAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**samples** | **Integer** | The number of one-minute samples that form the sliding evaluation window. |  [optional] |
|**violatingSamples** | **Integer** | The number of one-minute samples within the evaluation window that must violate the threshold to trigger an event. |  [optional] |
|**dealertingSamples** | **Integer** | The number of one-minute samples within the evaluation window that must go back to normal to close the event. |  [optional] |
|**alertCondition** | [**AlertConditionEnum**](#AlertConditionEnum) | The condition for the **threshold** value check: above or below. |  [optional] |
|**alertingOnMissingData** | **Boolean** | If true, also one-minute samples without data are counted as violating samples. |  [optional] |
|**threshold** | **Double** | The value of the static threshold based on the specified unit. |  [optional] |
|**unit** | [**UnitEnum**](#UnitEnum) | The unit of the threshold, matching the metric definition. |  [optional] |



## Enum: AlertConditionEnum

| Name | Value |
|---- | -----|
| ABOVE | &quot;ABOVE&quot; |
| BELOW | &quot;BELOW&quot; |



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



