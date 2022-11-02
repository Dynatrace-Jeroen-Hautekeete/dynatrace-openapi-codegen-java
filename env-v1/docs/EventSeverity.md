

# EventSeverity

Additional data on the event severity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**context** | [**ContextEnum**](#ContextEnum) | The metric used in the event severity calculation. |  [optional] |
|**value** | **Float** | The value of the severity. |  [optional] |
|**unit** | [**UnitEnum**](#UnitEnum) | The unit of the severity value. |  [optional] |



## Enum: ContextEnum

| Name | Value |
|---- | -----|
| COMMAND_ABORT | &quot;COMMAND_ABORT&quot; |
| CPU_READY_TIME | &quot;CPU_READY_TIME&quot; |
| CPU_USAGE | &quot;CPU_USAGE&quot; |
| CRASH_RATE | &quot;CRASH_RATE&quot; |
| FAILURE_RATE | &quot;FAILURE_RATE&quot; |
| HYPERVISOR_PACKETS_RECEIVED_DROPPED | &quot;HYPERVISOR_PACKETS_RECEIVED_DROPPED&quot; |
| HYPERVISOR_PACKETS_TRANSMITTED_DROPPED | &quot;HYPERVISOR_PACKETS_TRANSMITTED_DROPPED&quot; |
| MEMORY_COMPRESSION_RATE | &quot;MEMORY_COMPRESSION_RATE&quot; |
| MEMORY_DECOMPRESSION_RATE | &quot;MEMORY_DECOMPRESSION_RATE&quot; |
| MEMORY_SWAP_IN_RATE | &quot;MEMORY_SWAP_IN_RATE&quot; |
| MEMORY_SWAP_OUT_RATE | &quot;MEMORY_SWAP_OUT_RATE&quot; |
| MEMORY_USAGE | &quot;MEMORY_USAGE&quot; |
| NETWORK_HIGH_RECEIVED_UTILIZATION_RATE | &quot;NETWORK_HIGH_RECEIVED_UTILIZATION_RATE&quot; |
| NETWORK_HIGH_TRANSMITTED_UTILIZATION_RATE | &quot;NETWORK_HIGH_TRANSMITTED_UTILIZATION_RATE&quot; |
| NETWORK_PACKETS_RECEIVED_DROPPED | &quot;NETWORK_PACKETS_RECEIVED_DROPPED&quot; |
| NETWORK_PACKETS_TRANSMITTED_DROPPED | &quot;NETWORK_PACKETS_TRANSMITTED_DROPPED&quot; |
| NETWORK_RECEIVED_ERROR_RATE | &quot;NETWORK_RECEIVED_ERROR_RATE&quot; |
| NETWORK_TRANSMITTED_ERROR_RATE | &quot;NETWORK_TRANSMITTED_ERROR_RATE&quot; |
| PAGE_FAULTS | &quot;PAGE_FAULTS&quot; |
| PG_AVAILABLE | &quot;PG_AVAILABLE&quot; |
| RESPONSE_TIME_50TH_PERCENTILE | &quot;RESPONSE_TIME_50TH_PERCENTILE&quot; |
| RESPONSE_TIME_90TH_PERCENTILE | &quot;RESPONSE_TIME_90TH_PERCENTILE&quot; |



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



