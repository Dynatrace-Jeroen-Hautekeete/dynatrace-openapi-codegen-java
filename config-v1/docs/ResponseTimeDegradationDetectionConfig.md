

# ResponseTimeDegradationDetectionConfig

Configuration of response time degradation detection.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**detectionMode** | [**DetectionModeEnum**](#DetectionModeEnum) | How to detect response time degradation: automatically, or based on fixed thresholds, or do not detect. |  |
|**automaticDetection** | [**ResponseTimeDegradationAutodetectionConfig**](ResponseTimeDegradationAutodetectionConfig.md) |  |  [optional] |
|**thresholds** | [**ResponseTimeDegradationThresholdConfig**](ResponseTimeDegradationThresholdConfig.md) |  |  [optional] |



## Enum: DetectionModeEnum

| Name | Value |
|---- | -----|
| DETECT_AUTOMATICALLY | &quot;DETECT_AUTOMATICALLY&quot; |
| DETECT_USING_FIXED_THRESHOLDS | &quot;DETECT_USING_FIXED_THRESHOLDS&quot; |
| DONT_DETECT | &quot;DONT_DETECT&quot; |



