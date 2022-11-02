

# TimeseriesRegistrationMessage

The definition of a custom metric.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** | The name of the metric that will appear in the user interface. It is limited to 256 characters.   To edit the value of that field, you need the **Write configuration** (&#x60;WriteConfig&#x60;) or the **Write settings** (&#x60;settings.write&#x60;) permission assigned to your API token. |  [optional] |
|**unit** | [**UnitEnum**](#UnitEnum) | The unit the metric will use.    To edit the value of that field, you need the **Write configuration** (&#x60;WriteConfig&#x60;) or the **Write settings** (&#x60;settings.write&#x60;) permission assigned to your API token. |  [optional] |
|**dimensions** | **List&lt;String&gt;** | The metric dimension key that will be used to report multiple dimensions. For example, a dimension key to report the metric for different network cards for the same firewall.   You can use alphanumeric characters and the following punctuation marks: periods (&#x60;.&#x60;), hyphens (&#x60;-&#x60;), and underscores (&#x60;_&#x60;).   The CUSTOM_DEVICE dimension is added to each new custom metric automatically.   The length of dimension keys and values is limited to **128 characters** each. |  [optional] |
|**types** | **Set&lt;String&gt;** | The definition of the technology type. It is used to group metrics under a logical technology name in the UI.   Metrics must be assigned a software technology type that is identical to the technology type of the custom device you are sending the metric to.   For example, if you define your custom device using type &#x60;F5-Firewall&#x60; you must also register all related custom metrics as type &#x60;F5-Firewall&#x60;.   The field is **required** when creating a new metric. |  [optional] |



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



