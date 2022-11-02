

# FailureRateIncreaseThresholdConfig

Fixed thresholds for failure rate increase detection.    Required if **detectionMode** is `DETECT_USING_FIXED_THRESHOLDS`. Not applicable otherwise.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**threshold** | **Integer** | Failure rate during any 5-minute period to trigger an alert, %. |  |
|**sensitivity** | [**SensitivityEnum**](#SensitivityEnum) | Sensitivity of the threshold.   With &#x60;low&#x60; sensitivity, high statistical confidence is used. Brief violations (for example, due to a surge in load) won&#39;t trigger alerts.   With &#x60;high&#x60; sensitivity, no statistical confidence is used. Each violation triggers alert. |  |



## Enum: SensitivityEnum

| Name | Value |
|---- | -----|
| HIGH | &quot;HIGH&quot; |
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |



