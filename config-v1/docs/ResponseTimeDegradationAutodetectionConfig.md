

# ResponseTimeDegradationAutodetectionConfig

Parameters of the response time degradation auto-detection. Required if the **detectionMode** is `DETECT_AUTOMATICALLY`. Not applicable otherwise.   Violation of **any** criterion triggers an alert.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**responseTimeDegradationMilliseconds** | **Integer** | Alert if the response time degrades beyond *X* milliseconds. |  |
|**responseTimeDegradationPercent** | **Integer** | Alert if the response time degrades beyond *X* %. |  |
|**slowestResponseTimeDegradationMilliseconds** | **Integer** | Alert if the response time of the slowest 10% degrades beyond *X* milliseconds. |  |
|**slowestResponseTimeDegradationPercent** | **Integer** | Alert if the response time of the slowest 10% degrades beyond *X* %. |  |
|**loadThreshold** | [**LoadThresholdEnum**](#LoadThresholdEnum) | Minimal service load to detect response time degradation.    Response time degradation of services with smaller load won&#39;t trigger alerts. |  |



## Enum: LoadThresholdEnum

| Name | Value |
|---- | -----|
| FIFTEEN_REQUESTS_PER_MINUTE | &quot;FIFTEEN_REQUESTS_PER_MINUTE&quot; |
| FIVE_REQUESTS_PER_MINUTE | &quot;FIVE_REQUESTS_PER_MINUTE&quot; |
| ONE_REQUEST_PER_MINUTE | &quot;ONE_REQUEST_PER_MINUTE&quot; |
| TEN_REQUESTS_PER_MINUTE | &quot;TEN_REQUESTS_PER_MINUTE&quot; |



