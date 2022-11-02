

# MetricEvidence

The metric evidence of the problem.   A change of metric behavior that indicates the problem and/or is its root cause.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**valueBeforeChangePoint** | **Float** | The metric&#39;s value before the problem start. |  |
|**valueAfterChangePoint** | **Float** | The metric&#39;s value after the problem start. |  |
|**metricId** | **String** | The ID of the metric. |  |
|**endTime** | **Long** | The end time of the evidence, in UTC milliseconds.  The value &#x60;null&#x60; indicates that the evidence is still open. |  |
|**unit** | [**UnitEnum**](#UnitEnum) | The unit of the metric. |  |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| BILLION | &quot;Billion&quot; |
| BIT | &quot;Bit&quot; |
| BITPERHOUR | &quot;BitPerHour&quot; |
| BITPERMINUTE | &quot;BitPerMinute&quot; |
| BITPERSECOND | &quot;BitPerSecond&quot; |
| BYTE | &quot;Byte&quot; |
| BYTEPERHOUR | &quot;BytePerHour&quot; |
| BYTEPERMINUTE | &quot;BytePerMinute&quot; |
| BYTEPERSECOND | &quot;BytePerSecond&quot; |
| CORES | &quot;Cores&quot; |
| COUNT | &quot;Count&quot; |
| DAY | &quot;Day&quot; |
| DECIBELMILLIWATT | &quot;DecibelMilliWatt&quot; |
| GIBIBYTE | &quot;GibiByte&quot; |
| GIGA | &quot;Giga&quot; |
| GIGABYTE | &quot;GigaByte&quot; |
| HOUR | &quot;Hour&quot; |
| KIBIBYTE | &quot;KibiByte&quot; |
| KIBIBYTEPERHOUR | &quot;KibiBytePerHour&quot; |
| KIBIBYTEPERMINUTE | &quot;KibiBytePerMinute&quot; |
| KIBIBYTEPERSECOND | &quot;KibiBytePerSecond&quot; |
| KILO | &quot;Kilo&quot; |
| KILOBYTE | &quot;KiloByte&quot; |
| KILOBYTEPERHOUR | &quot;KiloBytePerHour&quot; |
| KILOBYTEPERMINUTE | &quot;KiloBytePerMinute&quot; |
| KILOBYTEPERSECOND | &quot;KiloBytePerSecond&quot; |
| KILOMETREPERHOUR | &quot;KiloMetrePerHour&quot; |
| MSU | &quot;MSU&quot; |
| MEBIBYTE | &quot;MebiByte&quot; |
| MEBIBYTEPERHOUR | &quot;MebiBytePerHour&quot; |
| MEBIBYTEPERMINUTE | &quot;MebiBytePerMinute&quot; |
| MEBIBYTEPERSECOND | &quot;MebiBytePerSecond&quot; |
| MEGA | &quot;Mega&quot; |
| MEGABYTE | &quot;MegaByte&quot; |
| MEGABYTEPERHOUR | &quot;MegaBytePerHour&quot; |
| MEGABYTEPERMINUTE | &quot;MegaBytePerMinute&quot; |
| MEGABYTEPERSECOND | &quot;MegaBytePerSecond&quot; |
| METREPERHOUR | &quot;MetrePerHour&quot; |
| METREPERSECOND | &quot;MetrePerSecond&quot; |
| MICROSECOND | &quot;MicroSecond&quot; |
| MILLICORES | &quot;MilliCores&quot; |
| MILLISECOND | &quot;MilliSecond&quot; |
| MILLISECONDPERMINUTE | &quot;MilliSecondPerMinute&quot; |
| MILLION | &quot;Million&quot; |
| MINUTE | &quot;Minute&quot; |
| MONTH | &quot;Month&quot; |
| NANOSECOND | &quot;NanoSecond&quot; |
| NANOSECONDPERMINUTE | &quot;NanoSecondPerMinute&quot; |
| NOTAPPLICABLE | &quot;NotApplicable&quot; |
| PERHOUR | &quot;PerHour&quot; |
| PERMINUTE | &quot;PerMinute&quot; |
| PERSECOND | &quot;PerSecond&quot; |
| PERCENT | &quot;Percent&quot; |
| PIXEL | &quot;Pixel&quot; |
| PROMILLE | &quot;Promille&quot; |
| RATIO | &quot;Ratio&quot; |
| SECOND | &quot;Second&quot; |
| STATE | &quot;State&quot; |
| UNSPECIFIED | &quot;Unspecified&quot; |
| WEEK | &quot;Week&quot; |
| YEAR | &quot;Year&quot; |



