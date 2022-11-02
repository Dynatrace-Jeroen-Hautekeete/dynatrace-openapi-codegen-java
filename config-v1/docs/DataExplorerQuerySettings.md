

# DataExplorerQuerySettings

Configuration for the queries

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resolution** | **String** | The resolution |  [optional] |
|**foldTransformation** | [**FoldTransformationEnum**](#FoldTransformationEnum) | The fold transformation |  [optional] |
|**foldAggregation** | [**FoldAggregationEnum**](#FoldAggregationEnum) | The fold aggregation |  [optional] |



## Enum: FoldTransformationEnum

| Name | Value |
|---- | -----|
| LAST_VALUE | &quot;LAST_VALUE&quot; |
| TOTAL | &quot;TOTAL&quot; |



## Enum: FoldAggregationEnum

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



