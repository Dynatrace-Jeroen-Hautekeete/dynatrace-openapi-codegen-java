

# AwsSupportingServiceConfig

A service to be monitored.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the service. Valid supported service names can be discovered using /aws/supportedServices restAPI |  |
|**monitoredMetrics** | [**List&lt;AwsSupportingServiceMetric&gt;**](AwsSupportingServiceMetric.md) | A list of metrics to be monitored for this service. If the list is null then recommended list of metrics for this service will be monitored. |  [optional] |



