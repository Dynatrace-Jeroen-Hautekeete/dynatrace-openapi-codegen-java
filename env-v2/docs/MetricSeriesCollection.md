

# MetricSeriesCollection

Data points of a metric.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appliedOptionalFilters** | [**List&lt;AppliedFilter&gt;**](AppliedFilter.md) | A list of filtered metric keys along with filters that have been applied to these keys, from the &#x60;optionalFilter&#x60; parameter. |  [optional] |
|**dataPointCountRatio** | **Float** | The ratio of queried data points divided by the maximum number of data points per metric that are allowed in a single query. |  |
|**dimensionCountRatio** | **Float** | The ratio of queried dimension tuples divided by the maximum number of dimension tuples allowed in a single query. |  |
|**metricId** | **String** | The key of the metric.   If any transformation is applied, it is included here. |  |
|**data** | [**List&lt;MetricSeries&gt;**](MetricSeries.md) | Data points of the metric. |  |
|**warnings** | **List&lt;String&gt;** | A list of potential warnings that affect this ID. For example deprecated feature usage etc. |  [optional] |



