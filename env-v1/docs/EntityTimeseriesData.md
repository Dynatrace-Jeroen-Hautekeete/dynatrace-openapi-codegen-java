

# EntityTimeseriesData

Information about a metric and its data points.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timeseriesId** | **String** | The ID of the metric, where you want to post data points. |  |
|**dimensions** | **Map&lt;String, String&gt;** | Dimensions of the data points you&#39;re posting.   The key of the metric dimension must be defined earlier in the metric definition. |  [optional] |
|**dataPoints** | **List&lt;List&lt;Float&gt;&gt;** | List of data points.   Each data point is an array, containing the timestamp and the value.   Timestamp is UTC milliseconds reported as a number, for example: &#x60;1520523365557&#x60;.   You have the guaranteed timeframe of **30 minutes** into the past.   A custom metric must be registered **before** you can report a metric value. Therefore, the timestamp for reporting a value must be after the registration time of the metric. |  |



