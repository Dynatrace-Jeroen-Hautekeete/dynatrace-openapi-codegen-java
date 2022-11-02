

# MetricEventDimensions

A single filter for the metrics dimensions.  The actual set of fields depends on type of the filter. Find the list of actual objects in the description of the **filterType** field or see [Metric events anomaly detection API - JSON models](https://dt-url.net/ql63sap).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filterType** | [**FilterTypeEnum**](#FilterTypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;ENTITY&#x60; -&gt; MetricEventEntityDimensions  * &#x60;STRING&#x60; -&gt; MetricEventStringDimensions   |  |
|**key** | **String** | The dimensions key on the metric. |  [optional] |



## Enum: FilterTypeEnum

| Name | Value |
|---- | -----|
| ENTITY | &quot;ENTITY&quot; |
| STRING | &quot;STRING&quot; |



