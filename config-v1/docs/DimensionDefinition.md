

# DimensionDefinition

Parameters of a definition of a calculated service metric.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the dimension. |  |
|**dimension** | **String** | The dimension value pattern.    You can define custom placeholders in the **placeholders** field and use them here. |  |
|**placeholders** | [**List&lt;Placeholder&gt;**](Placeholder.md) | The list of custom placeholders to be used in a dimension value pattern. |  [optional] |
|**topX** | **Integer** | The number of top values to be calculated. |  |
|**topXDirection** | [**TopXDirectionEnum**](#TopXDirectionEnum) | How to calculate the **topX** values. |  |
|**topXAggregation** | [**TopXAggregationEnum**](#TopXAggregationEnum) | The aggregation of the dimension. |  |



## Enum: TopXDirectionEnum

| Name | Value |
|---- | -----|
| ASCENDING | &quot;ASCENDING&quot; |
| DESCENDING | &quot;DESCENDING&quot; |



## Enum: TopXAggregationEnum

| Name | Value |
|---- | -----|
| AVERAGE | &quot;AVERAGE&quot; |
| COUNT | &quot;COUNT&quot; |
| MAX | &quot;MAX&quot; |
| MIN | &quot;MIN&quot; |
| OF_INTEREST_RATIO | &quot;OF_INTEREST_RATIO&quot; |
| OTHER_RATIO | &quot;OTHER_RATIO&quot; |
| SINGLE_VALUE | &quot;SINGLE_VALUE&quot; |
| SUM | &quot;SUM&quot; |



