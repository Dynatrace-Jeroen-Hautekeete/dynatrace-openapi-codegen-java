

# TimeseriesDataPointQueryResult

List of metric's datapoints, as well as their parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataPoints** | **Map&lt;String, List&lt;List&lt;Float&gt;&gt;&gt;** | Data points of a metric.   A JSON object that maps the ID of the entity that delivered the data points and an array, which consists of arrays of the data point float values.   May contain more than one entity ID per record (for example, a host and its network interface). In such cases, entity IDs are separated by commas.   A datapoint contains a value and a timestamp, at which the value was recorded.    Dynatrace stores data in time slots. The **dataPoints** object shows the *starting* timestamp of the slot. If the **startTimestamp** or **endTimestamp** of your query lies inside of the data time slot, this time slot is included into response. Due to the fact that the timestamp of the first data point lies outside of the specified timeframe, you will see *earlier* timestamp than the specified **startTimestamp** in the first data point of the response.   There are three versions of data points:   * Numeric datapoint: Contains a numeric value.   * Enum datapoint: Contains an enum value, currently only for availability timeseries.   * Prediction datapoint: Similar to the numeric datapoint, but it contains a confidence interval, within which the future values are expected to be. |  [optional] |
|**timeseriesId** | **String** | The ID of the metric. |  [optional] |
|**unit** | [**UnitEnum**](#UnitEnum) | The unit of data points. |  [optional] |
|**resolutionInMillisUTC** | **Long** | The resolution of data points. |  [optional] |
|**aggregationType** | [**AggregationTypeEnum**](#AggregationTypeEnum) | The type of data points aggregation. |  [optional] |
|**entities** | **Map&lt;String, String&gt;** | The list of entities where the data points originate.  A JSON object that maps the entity ID in Dynatrace and the actual name of the entity. |  [optional] |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| BILLION_BILCOUNT_ | &quot;Billion (bilcount)&quot; |
| BIT_BIT_ | &quot;Bit (bit)&quot; |
| BITPERHOUR_BIT_H_ | &quot;BitPerHour (bit/h)&quot; |
| BITPERMINUTE_BIT_MIN_ | &quot;BitPerMinute (bit/min)&quot; |
| BITPERSECOND_BIT_S_ | &quot;BitPerSecond (bit/s)&quot; |
| BYTE_B_ | &quot;Byte (B)&quot; |
| BYTEPERHOUR_B_H_ | &quot;BytePerHour (B/h)&quot; |
| BYTEPERMINUTE_B_MIN_ | &quot;BytePerMinute (B/min)&quot; |
| BYTEPERSECOND_B_S_ | &quot;BytePerSecond (B/s)&quot; |
| CORES | &quot;Cores&quot; |
| COUNT_COUNT_ | &quot;Count (count)&quot; |
| DAY_DS_ | &quot;Day (ds)&quot; |
| DECIBELMILLIWATT_DBM_ | &quot;DecibelMilliWatt (dBm)&quot; |
| G | &quot;G&quot; |
| GIBIBYTE_GIB_ | &quot;GibiByte (GiB)&quot; |
| GIGABYTE_GB_ | &quot;GigaByte (GB)&quot; |
| HOUR_HS_ | &quot;Hour (hs)&quot; |
| KIBIBYTE_KIB_ | &quot;KibiByte (KiB)&quot; |
| KIBIBYTEPERHOUR_KIB_H_ | &quot;KibiBytePerHour (KiB/h)&quot; |
| KIBIBYTEPERMINUTE_KIB_MIN_ | &quot;KibiBytePerMinute (KiB/min)&quot; |
| KIBIBYTEPERSECOND_KIB_S_ | &quot;KibiBytePerSecond (KiB/s)&quot; |
| KILOBYTE_KB_ | &quot;KiloByte (kB)&quot; |
| KILOBYTEPERHOUR_KB_H_ | &quot;KiloBytePerHour (kB/h)&quot; |
| KILOBYTEPERMINUTE_KB_MIN_ | &quot;KiloBytePerMinute (kB/min)&quot; |
| KILOBYTEPERSECOND_KB_S_ | &quot;KiloBytePerSecond (kB/s)&quot; |
| M | &quot;M&quot; |
| MSU | &quot;MSU&quot; |
| MEBIBYTE_MIB_ | &quot;MebiByte (MiB)&quot; |
| MEBIBYTEPERHOUR_MIB_H_ | &quot;MebiBytePerHour (MiB/h)&quot; |
| MEBIBYTEPERMINUTE_MIB_MIN_ | &quot;MebiBytePerMinute (MiB/min)&quot; |
| MEBIBYTEPERSECOND_MIB_S_ | &quot;MebiBytePerSecond (MiB/s)&quot; |
| MEGABYTE_MB_ | &quot;MegaByte (MB)&quot; |
| MEGABYTEPERHOUR_MB_H_ | &quot;MegaBytePerHour (MB/h)&quot; |
| MEGABYTEPERMINUTE_MB_MIN_ | &quot;MegaBytePerMinute (MB/min)&quot; |
| MEGABYTEPERSECOND_MB_S_ | &quot;MegaBytePerSecond (MB/s)&quot; |
| MICROSECOND_S_ | &quot;MicroSecond (µs)&quot; |
| MILLISECOND_MS_ | &quot;MilliSecond (ms)&quot; |
| MILLISECONDPERMINUTE_MS_MIN_ | &quot;MilliSecondPerMinute (ms/min)&quot; |
| MILLION_MILCOUNT_ | &quot;Million (milcount)&quot; |
| MINUTE_MINS_ | &quot;Minute (mins)&quot; |
| MONTH_MOS_ | &quot;Month (mos)&quot; |
| N_A | &quot;N/A&quot; |
| NANOSECOND_NS_ | &quot;NanoSecond (ns)&quot; |
| NANOSECONDPERMINUTE_NS_MIN_ | &quot;NanoSecondPerMinute (ns/min)&quot; |
| PERHOUR_COUNT_H_ | &quot;PerHour (count/h)&quot; |
| PERMINUTE_COUNT_MIN_ | &quot;PerMinute (count/min)&quot; |
| PERSECOND_COUNT_S_ | &quot;PerSecond (count/s)&quot; |
| PERCENT_ | &quot;Percent (%)&quot; |
| PIXEL_PX_ | &quot;Pixel (px)&quot; |
| PROMILLE_ | &quot;Promille (‰)&quot; |
| RATIO | &quot;Ratio&quot; |
| SECOND_S_ | &quot;Second (s)&quot; |
| STATE | &quot;State&quot; |
| UNSPECIFIED | &quot;Unspecified&quot; |
| WEEK_WS_ | &quot;Week (ws)&quot; |
| YEAR_YS_ | &quot;Year (ys)&quot; |
| K | &quot;k&quot; |
| KM_H | &quot;km/h&quot; |
| M_H | &quot;m/h&quot; |
| M_S | &quot;m/s&quot; |
| MCORES | &quot;mCores&quot; |



## Enum: AggregationTypeEnum

| Name | Value |
|---- | -----|
| AVG | &quot;AVG&quot; |
| COUNT | &quot;COUNT&quot; |
| MAX | &quot;MAX&quot; |
| MEDIAN | &quot;MEDIAN&quot; |
| MIN | &quot;MIN&quot; |
| PERCENTILE | &quot;PERCENTILE&quot; |
| SUM | &quot;SUM&quot; |



