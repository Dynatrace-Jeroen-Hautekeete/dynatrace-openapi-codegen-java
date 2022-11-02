

# DataExplorerFilter

Filter for data explorer queries.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filter** | **String** |  |  [optional] |
|**globalEntity** | **String** |  |  [optional] |
|**filterType** | [**FilterTypeEnum**](#FilterTypeEnum) |  |  [optional] |
|**filterOperator** | [**FilterOperatorEnum**](#FilterOperatorEnum) |  |  [optional] |
|**entityAttribute** | **String** |  |  [optional] |
|**relationship** | [**DexpFilterRelationship**](DexpFilterRelationship.md) |  |  [optional] |
|**nestedFilters** | [**Set&lt;DataExplorerFilter&gt;**](DataExplorerFilter.md) |  |  [optional] |
|**criteria** | [**Set&lt;DexpFilterCriterion&gt;**](DexpFilterCriterion.md) |  |  [optional] |



## Enum: FilterTypeEnum

| Name | Value |
|---- | -----|
| DIMENSION | &quot;DIMENSION&quot; |
| ENTITY_ATTRIBUTE | &quot;ENTITY_ATTRIBUTE&quot; |
| ID | &quot;ID&quot; |
| NAME | &quot;NAME&quot; |
| TAG | &quot;TAG&quot; |



## Enum: FilterOperatorEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| NOT | &quot;NOT&quot; |
| OR | &quot;OR&quot; |



