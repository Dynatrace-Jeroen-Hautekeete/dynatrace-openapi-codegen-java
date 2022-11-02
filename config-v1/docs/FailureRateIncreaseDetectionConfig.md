

# FailureRateIncreaseDetectionConfig

Configuration of failure rate increase detection.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**detectionMode** | [**DetectionModeEnum**](#DetectionModeEnum) | How to detect failure rate increase: automatically, or based on fixed thresholds, or do not detect. |  |
|**automaticDetection** | [**FailureRateIncreaseAutodetectionConfig**](FailureRateIncreaseAutodetectionConfig.md) |  |  [optional] |
|**thresholds** | [**FailureRateIncreaseThresholdConfig**](FailureRateIncreaseThresholdConfig.md) |  |  [optional] |



## Enum: DetectionModeEnum

| Name | Value |
|---- | -----|
| DETECT_AUTOMATICALLY | &quot;DETECT_AUTOMATICALLY&quot; |
| DETECT_USING_FIXED_THRESHOLDS | &quot;DETECT_USING_FIXED_THRESHOLDS&quot; |
| DONT_DETECT | &quot;DONT_DETECT&quot; |



