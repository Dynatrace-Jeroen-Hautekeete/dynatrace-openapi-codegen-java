

# WebApplicationDimensionDefinition

Dimension of the calculated web application metrics.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**topX** | **Integer** | The number of top values to be calculated. |  |
|**dimension** | [**DimensionEnum**](#DimensionEnum) | The dimension of the metric. |  |
|**propertyKey** | **String** | The key of the user action property.    Only applicable for the &#x60;StringProperty&#x60; dimension. |  [optional] |



## Enum: DimensionEnum

| Name | Value |
|---- | -----|
| APDEXTYPE | &quot;ApdexType&quot; |
| BROWSER | &quot;Browser&quot; |
| ERRORCONTEXT | &quot;ErrorContext&quot; |
| ERRORORIGIN | &quot;ErrorOrigin&quot; |
| ERRORTYPE | &quot;ErrorType&quot; |
| GEOLOCATION | &quot;GeoLocation&quot; |
| STRINGPROPERTY | &quot;StringProperty&quot; |
| USERACTIONTYPE | &quot;UserActionType&quot; |



