

# CalculatedMobileMetric

Definition of the calculated metric for mobile or custom app.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationIdentifier** | **String** | The Dynatrace entity ID of the application to which the metric belongs. |  |
|**name** | **String** | The name of the metric, displayed in the UI. |  |
|**metricKey** | **String** | The unique key of the metric.    The key must have the &#x60;calc:apps&#x60; prefix. |  |
|**enabled** | **Boolean** | The metric is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**metricType** | [**MetricTypeEnum**](#MetricTypeEnum) | The type of the metric. |  |
|**dimensions** | [**List&lt;CalculatedMobileMetricDimension&gt;**](CalculatedMobileMetricDimension.md) | A list of metric dimensions. |  [optional] |
|**userActionFilter** | [**CalculatedMobileMetricUserActionFilter**](CalculatedMobileMetricUserActionFilter.md) |  |  [optional] |



## Enum: MetricTypeEnum

| Name | Value |
|---- | -----|
| REPORTED_ERROR_COUNT | &quot;REPORTED_ERROR_COUNT&quot; |
| USER_ACTION_DURATION | &quot;USER_ACTION_DURATION&quot; |
| WEB_REQUEST_COUNT | &quot;WEB_REQUEST_COUNT&quot; |
| WEB_REQUEST_ERROR_COUNT | &quot;WEB_REQUEST_ERROR_COUNT&quot; |



