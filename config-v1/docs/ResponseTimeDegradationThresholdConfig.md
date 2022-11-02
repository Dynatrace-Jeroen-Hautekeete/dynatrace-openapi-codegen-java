

# ResponseTimeDegradationThresholdConfig

Fixed thresholds for response time degradation detection.    Required if **detectionMode** is `DETECT_USING_FIXED_THRESHOLDS`. Not applicable otherwise.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**responseTimeThresholdMilliseconds** | **Integer** | Response time during any 5-minute period to trigger an alert, in milliseconds. |  |
|**slowestResponseTimeThresholdMilliseconds** | **Integer** | Response time of the 10% slowest during any 5-minute period to trigger an alert, in milliseconds. |  |
|**loadThreshold** | [**LoadThresholdEnum**](#LoadThresholdEnum) | Minimal service load to detect response time degradation.    Response time degradation of services with smaller load won&#39;t trigger alerts. |  |
|**sensitivity** | [**SensitivityEnum**](#SensitivityEnum) | Sensitivity of the threshold.   With &#x60;low&#x60; sensitivity, high statistical confidence is used. Brief violations (for example, due to a surge in load) won&#39;t trigger alerts.   With &#x60;high&#x60; sensitivity, no statistical confidence is used. Each violation triggers an alert. |  |



## Enum: LoadThresholdEnum

| Name | Value |
|---- | -----|
| FIFTEEN_REQUESTS_PER_MINUTE | &quot;FIFTEEN_REQUESTS_PER_MINUTE&quot; |
| FIVE_REQUESTS_PER_MINUTE | &quot;FIVE_REQUESTS_PER_MINUTE&quot; |
| ONE_REQUEST_PER_MINUTE | &quot;ONE_REQUEST_PER_MINUTE&quot; |
| TEN_REQUESTS_PER_MINUTE | &quot;TEN_REQUESTS_PER_MINUTE&quot; |



## Enum: SensitivityEnum

| Name | Value |
|---- | -----|
| HIGH | &quot;HIGH&quot; |
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |



