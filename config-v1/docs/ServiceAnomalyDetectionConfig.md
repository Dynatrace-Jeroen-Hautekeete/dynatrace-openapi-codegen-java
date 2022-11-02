

# ServiceAnomalyDetectionConfig

Dynatrace automatically detects service-related performance anomalies such as response time degradations and failure rate increases. Use these settings to configure detection sensitivity, set alert thresholds, or disable alerting for certain services.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**responseTimeDegradation** | [**ResponseTimeDegradationDetectionConfig**](ResponseTimeDegradationDetectionConfig.md) |  |  |
|**loadDrop** | [**LoadDropDetectionConfig**](LoadDropDetectionConfig.md) |  |  [optional] |
|**loadSpike** | [**LoadSpikeDetectionConfig**](LoadSpikeDetectionConfig.md) |  |  [optional] |
|**failureRateIncrease** | [**FailureRateIncreaseDetectionConfig**](FailureRateIncreaseDetectionConfig.md) |  |  |



