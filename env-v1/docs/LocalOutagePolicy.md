

# LocalOutagePolicy

Local outage handling configuration.    Alert if **affectedLocations** of locations are unable to access the web application **consecutiveRuns** times consecutively.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**affectedLocations** | **Integer** | The number of affected locations to trigger an alert. |  |
|**consecutiveRuns** | **Integer** | The number of consecutive fails to trigger an alert. |  |



