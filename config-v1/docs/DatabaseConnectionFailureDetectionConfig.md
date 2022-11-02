

# DatabaseConnectionFailureDetectionConfig

Parameters of the failed database connections detection.   The alert is triggered when failed connections number exceeds **connectionFailsCount** during any **timePeriodMinutes** minutes period.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | The detection is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**connectionFailsCount** | **Integer** | Number of failed database connections during any **timePeriodMinutes** minutes period to trigger an alert. |  [optional] |
|**timePeriodMinutes** | **Integer** | The *X* minutes time period during which the **connectionFailsCount** is evaluated. |  [optional] |



