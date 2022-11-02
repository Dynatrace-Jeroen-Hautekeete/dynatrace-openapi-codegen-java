

# MetricData

A list of metrics and their data points.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resolution** | **String** | The timeslot resolution in the result. |  |
|**nextPageKey** | **String** | Deprecated. This field is returned for compatibility reasons. It always has the value of &#x60;null&#x60;. |  [optional] |
|**totalCount** | **Long** | The total number of primary entities in the result.   Has the &#x60;0&#x60; value if none of the requested metrics is suitable for pagination. |  |
|**result** | [**List&lt;MetricSeriesCollection&gt;**](MetricSeriesCollection.md) | A list of metrics and their data points. |  |
|**warnings** | **List&lt;String&gt;** | A list of warnings |  [optional] |



