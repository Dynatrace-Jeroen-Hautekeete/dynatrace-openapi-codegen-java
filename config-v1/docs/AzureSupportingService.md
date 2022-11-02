

# AzureSupportingService

A service to be monitored.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the service. Valid supported service names can be discovered using /azure/supportedServices restAPI |  |
|**monitoredMetrics** | [**List&lt;AzureMonitoredMetric&gt;**](AzureMonitoredMetric.md) | A list of metrics to be monitored for this service. It must include all the recommended metrics. If the list is null then recommended list of metrics for this service will be monitored. |  [optional] |



