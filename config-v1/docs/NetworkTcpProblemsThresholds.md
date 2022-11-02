

# NetworkTcpProblemsThresholds

Custom thresholds for TCP connection problems. If not set, automatic mode is used.    **All** of these conditions must be met to trigger an alert.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**newConnectionFailuresPercentage** | **Integer** | Percentage of new connection failures is higher than *X*% in 3 out of 5 samples. |  |
|**failedConnectionsNumberPerMinute** | **Integer** | Number of failed connections is higher than *X* connections per minute in 3 out of 5 samples. |  |



