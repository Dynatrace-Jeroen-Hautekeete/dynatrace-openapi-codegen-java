

# DataExplorerQuery

Configuration of a data explorer query.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The id of the query |  |
|**metric** | **String** | The metric id |  |
|**spaceAggregation** | [**SpaceAggregationEnum**](#SpaceAggregationEnum) | Space aggregation applied to the query |  |
|**timeAggregation** | [**TimeAggregationEnum**](#TimeAggregationEnum) | Time roll up applied to the query |  |
|**splitBy** | **List&lt;String&gt;** | The splittings applied to the query |  |
|**sortBy** | [**SortByEnum**](#SortByEnum) | The sorting applied to the query |  [optional] |
|**filterBy** | [**DataExplorerFilter**](DataExplorerFilter.md) |  |  |
|**limit** | **Integer** | Limit the results of the query |  [optional] |
|**metricSelector** | **String** | The metric selector |  [optional] |
|**foldTransformation** | [**FoldTransformationEnum**](#FoldTransformationEnum) | The fold transformation |  [optional] |
|**enabled** | **Boolean** | Status of the query |  |
|**generatedMetricSelector** | **String** | Generated metric selector |  [optional] |



## Enum: SpaceAggregationEnum

| Name | Value |
|---- | -----|
| AVG | &quot;AVG&quot; |
| COUNT | &quot;COUNT&quot; |
| MAX | &quot;MAX&quot; |
| MEDIAN | &quot;MEDIAN&quot; |
| MIN | &quot;MIN&quot; |
| PERCENTILE_10 | &quot;PERCENTILE_10&quot; |
| PERCENTILE_75 | &quot;PERCENTILE_75&quot; |
| PERCENTILE_90 | &quot;PERCENTILE_90&quot; |
| SUM | &quot;SUM&quot; |
| VALUE | &quot;VALUE&quot; |



## Enum: TimeAggregationEnum

| Name | Value |
|---- | -----|
| AVG | &quot;AVG&quot; |
| COUNT | &quot;COUNT&quot; |
| DEFAULT | &quot;DEFAULT&quot; |
| MAX | &quot;MAX&quot; |
| MEDIAN | &quot;MEDIAN&quot; |
| MIN | &quot;MIN&quot; |
| SUM | &quot;SUM&quot; |
| VALUE | &quot;VALUE&quot; |



## Enum: SortByEnum

| Name | Value |
|---- | -----|
| ASC | &quot;ASC&quot; |
| DESC | &quot;DESC&quot; |



## Enum: FoldTransformationEnum

| Name | Value |
|---- | -----|
| LAST_VALUE | &quot;LAST_VALUE&quot; |
| TOTAL | &quot;TOTAL&quot; |



