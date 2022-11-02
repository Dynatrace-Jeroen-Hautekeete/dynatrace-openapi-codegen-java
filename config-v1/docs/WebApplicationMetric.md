

# WebApplicationMetric

Descriptor of the calculated web application metric.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationIdentifier** | **String** | The Dynatrace entity ID of the application to which the metric belongs. |  |
|**name** | **String** | The displayed name of the metric. |  |
|**metricKey** | **String** | The unique key of the metric.    The key must have the &#x60;calc:apps&#x60; prefix. |  |
|**enabled** | **Boolean** | The metric is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**metricDefinition** | [**WebApplicationMetricDefinition**](WebApplicationMetricDefinition.md) |  |  |
|**dimensions** | [**List&lt;WebApplicationDimensionDefinition&gt;**](WebApplicationDimensionDefinition.md) | A list of metric dimensions. |  [optional] |
|**userActionFilter** | [**UserActionFilter**](UserActionFilter.md) |  |  [optional] |



