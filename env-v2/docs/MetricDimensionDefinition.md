

# MetricDimensionDefinition

The dimension of a metric.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** | The display name of the dimension. |  |
|**name** | **String** | The name of the dimension. |  |
|**key** | **String** | The key of the dimension.    It must be unique within the metric. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the dimension. |  |
|**index** | **Integer** | The unique 0-based index of the dimension.    Appending transformations such as :names or :parents may change the indexes of dimensions. &#x60;null&#x60; is used for the dimensions of a metric with flexible dimensions, which can be referenced with their dimension key, but do not have an intrinsic order that could be used for the index. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ENTITY | &quot;ENTITY&quot; |
| NUMBER | &quot;NUMBER&quot; |
| OTHER | &quot;OTHER&quot; |
| STRING | &quot;STRING&quot; |
| VOID | &quot;VOID&quot; |



