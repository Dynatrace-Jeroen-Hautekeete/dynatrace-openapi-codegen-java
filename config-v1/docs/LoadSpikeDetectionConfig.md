

# LoadSpikeDetectionConfig

The configuration of load spikes detection.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | The detection is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**loadSpikePercent** | **Integer** | Alert if the observed load is more than *X* % of the expected value. |  [optional] |
|**minAbnormalStateDurationInMinutes** | **Integer** | Alert if the service stays in abnormal state for at least *X* minutes. |  [optional] |



