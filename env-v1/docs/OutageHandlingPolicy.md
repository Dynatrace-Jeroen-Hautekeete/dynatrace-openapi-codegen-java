

# OutageHandlingPolicy

Outage handling configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**globalOutage** | **Boolean** | When enabled (&#x60;true&#x60;), generate a problem and send an alert when the monitor is unavailable at all configured locations. |  |
|**globalOutagePolicy** | [**GlobalOutagePolicy**](GlobalOutagePolicy.md) |  |  [optional] |
|**localOutage** | **Boolean** | When enabled (&#x60;true&#x60;), generate a problem and send an alert when the monitor is unavailable for one or more consecutive runs at any location. |  |
|**localOutagePolicy** | [**LocalOutagePolicy**](LocalOutagePolicy.md) |  |  |
|**retryOnError** | **Boolean** | Schedule retry if browser monitor execution results in a fail. For HTTP monitors this property is ignored. |  [optional] |



