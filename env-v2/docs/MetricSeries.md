

# MetricSeries

Data points per dimension of a metric.   The data is represented by two arrays of the same length: **timestamps** and **values**. Entries of the same index from both arrays form a timestamped data point.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dimensionMap** | **Map&lt;String, String&gt;** |  |  |
|**timestamps** | **List&lt;Long&gt;** | A list of timestamps of data points.   The value of data point for each time from this array is located in **values** array at the same index. |  |
|**dimensions** | **List&lt;String&gt;** | The ordered list of dimensions to which the data point list belongs.    Each metric can have a certain number of dimensions. Dimensions exceeding this number are aggregated into one, which is shown as &#x60;null&#x60; here. |  |
|**values** | **List&lt;Double&gt;** | A list of values of data points.   The timestamp of data point for each value from this array is located in **timestamps** array at the same index. |  |



