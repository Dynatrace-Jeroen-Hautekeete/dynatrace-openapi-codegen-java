

# FailureRateIncreaseAutodetectionConfig

Parameters of failure rate increase auto-detection. Required if **detectionMode** is `DETECT_AUTOMATICALLY`. Not applicable otherwise.   The absolute and relative thresholds **both** must exceed to trigger an alert.   Example: If the expected error rate is 1.5%, and you set an absolute increase of 1%, and a relative increase of 50%, the thresholds will be:  Absolute: 1.5% + **1%** = 2.5%  Relative: 1.5% + 1.5% * **50%** = 2.25%

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**failingServiceCallPercentageIncreaseAbsolute** | **Integer** | Absolute increase of failing service calls to trigger an alert, %. |  |
|**failingServiceCallPercentageIncreaseRelative** | **Integer** | Relative increase of failing service calls to trigger an alert, %. |  |



