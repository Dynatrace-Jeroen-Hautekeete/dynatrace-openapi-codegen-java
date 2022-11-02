

# CustomFilterChartSeriesConfig

Configuration of a charted metric.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metric** | **String** | The name of the charted metric. |  |
|**aggregation** | [**AggregationEnum**](#AggregationEnum) | The charted aggregation of the metric. |  |
|**percentile** | **Long** | The charted percentile.    Only applicable if the **aggregation** is set to &#x60;PERCENTILE&#x60;. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The visualization of the timeseries chart. |  |
|**entityType** | **String** | The type of the Dynatrace entity that delivered the charted metric. |  |
|**dimensions** | [**List&lt;CustomFilterChartSeriesDimensionConfig&gt;**](CustomFilterChartSeriesDimensionConfig.md) | Configuration of the charted metric splitting. |  |
|**sortAscending** | **Boolean** | Sort ascending (&#x60;true&#x60;) or descending (&#x60;false&#x60;).  |  [optional] |
|**sortColumn** | **Boolean** |  |  [optional] |
|**aggregationRate** | [**AggregationRateEnum**](#AggregationRateEnum) |  |  [optional] |



## Enum: AggregationEnum

| Name | Value |
|---- | -----|
| AVG | &quot;AVG&quot; |
| COUNT | &quot;COUNT&quot; |
| DISTINCT | &quot;DISTINCT&quot; |
| FASTEST10PERCENT | &quot;FASTEST10PERCENT&quot; |
| MAX | &quot;MAX&quot; |
| MEDIAN | &quot;MEDIAN&quot; |
| MIN | &quot;MIN&quot; |
| NONE | &quot;NONE&quot; |
| OF_INTEREST_RATIO | &quot;OF_INTEREST_RATIO&quot; |
| OTHER_RATIO | &quot;OTHER_RATIO&quot; |
| PERCENTILE | &quot;PERCENTILE&quot; |
| PER_MIN | &quot;PER_MIN&quot; |
| SLOWEST10PERCENT | &quot;SLOWEST10PERCENT&quot; |
| SLOWEST5PERCENT | &quot;SLOWEST5PERCENT&quot; |
| SUM | &quot;SUM&quot; |
| SUM_DIMENSIONS | &quot;SUM_DIMENSIONS&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AREA | &quot;AREA&quot; |
| BAR | &quot;BAR&quot; |
| LINE | &quot;LINE&quot; |



## Enum: AggregationRateEnum

| Name | Value |
|---- | -----|
| HOUR | &quot;HOUR&quot; |
| MINUTE | &quot;MINUTE&quot; |
| SECOND | &quot;SECOND&quot; |
| TOTAL | &quot;TOTAL&quot; |



