

# CalculatedMetricDefinition

The definition of a calculated service metric.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metric** | [**MetricEnum**](#MetricEnum) | The metric to be captured. |  |
|**requestAttribute** | **String** | The request attribute to be captured.    Only applicable when the **metric** parameter is set to &#x60;REQUEST_ATTRIBUTE&#x60;. |  [optional] |



## Enum: MetricEnum

| Name | Value |
|---- | -----|
| CPU_TIME | &quot;CPU_TIME&quot; |
| DATABASE_CHILD_CALL_COUNT | &quot;DATABASE_CHILD_CALL_COUNT&quot; |
| DATABASE_CHILD_CALL_TIME | &quot;DATABASE_CHILD_CALL_TIME&quot; |
| DISK_IO_TIME | &quot;DISK_IO_TIME&quot; |
| EXCEPTION_COUNT | &quot;EXCEPTION_COUNT&quot; |
| FAILED_REQUEST_COUNT | &quot;FAILED_REQUEST_COUNT&quot; |
| FAILED_REQUEST_COUNT_CLIENT | &quot;FAILED_REQUEST_COUNT_CLIENT&quot; |
| FAILURE_RATE | &quot;FAILURE_RATE&quot; |
| FAILURE_RATE_CLIENT | &quot;FAILURE_RATE_CLIENT&quot; |
| HTTP_4XX_ERROR_COUNT | &quot;HTTP_4XX_ERROR_COUNT&quot; |
| HTTP_4XX_ERROR_COUNT_CLIENT | &quot;HTTP_4XX_ERROR_COUNT_CLIENT&quot; |
| HTTP_5XX_ERROR_COUNT | &quot;HTTP_5XX_ERROR_COUNT&quot; |
| HTTP_5XX_ERROR_COUNT_CLIENT | &quot;HTTP_5XX_ERROR_COUNT_CLIENT&quot; |
| IO_TIME | &quot;IO_TIME&quot; |
| LOCK_TIME | &quot;LOCK_TIME&quot; |
| NETWORK_IO_TIME | &quot;NETWORK_IO_TIME&quot; |
| NON_DATABASE_CHILD_CALL_COUNT | &quot;NON_DATABASE_CHILD_CALL_COUNT&quot; |
| NON_DATABASE_CHILD_CALL_TIME | &quot;NON_DATABASE_CHILD_CALL_TIME&quot; |
| PROCESSING_TIME | &quot;PROCESSING_TIME&quot; |
| REQUEST_ATTRIBUTE | &quot;REQUEST_ATTRIBUTE&quot; |
| REQUEST_COUNT | &quot;REQUEST_COUNT&quot; |
| RESPONSE_TIME | &quot;RESPONSE_TIME&quot; |
| RESPONSE_TIME_CLIENT | &quot;RESPONSE_TIME_CLIENT&quot; |
| SUCCESSFUL_REQUEST_COUNT | &quot;SUCCESSFUL_REQUEST_COUNT&quot; |
| SUCCESSFUL_REQUEST_COUNT_CLIENT | &quot;SUCCESSFUL_REQUEST_COUNT_CLIENT&quot; |
| WAIT_TIME | &quot;WAIT_TIME&quot; |



