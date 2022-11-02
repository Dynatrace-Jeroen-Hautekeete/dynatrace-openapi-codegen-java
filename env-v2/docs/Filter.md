

# Filter

A dimensional or series filter on a metric.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**referenceValue** | **BigDecimal** | For the operands of &#x60;series&#x60; filters that match against a number, holds the number to compare against. |  [optional] |
|**targetDimension** | **String** | If the type applies to a dimension, then holds the target dimension. |  [optional] |
|**targetDimensions** | **List&lt;String&gt;** | If the type applies to n dimensions, then holds the target dimensions. Currently only used for the &#x60;remainder&#x60; filter. |  [optional] |
|**referenceString** | **String** | For filters that match a dimension against a valkue, such as &#x60;eq&#x60; or &#x60;ne&#x60;, holds the value to compare the dimension against. |  [optional] |
|**rollup** | [**Rollup**](Rollup.md) |  |  [optional] |
|**referenceInvocation** | [**Invocation**](Invocation.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of this filter, determines which other fields are present.Can be any of:  * &#x60;eq&#x60;, * &#x60;ne&#x60;, * &#x60;prefix&#x60;, * &#x60;in&#x60;, * &#x60;remainder&#x60;, * &#x60;suffix&#x60;, * &#x60;contains&#x60;, * &#x60;existsKey&#x60;, * &#x60;series&#x60;, * &#x60;or&#x60;, * &#x60;and&#x60;, * &#x60;not&#x60;, * &#x60;ge&#x60;, * &#x60;gt&#x60;, * &#x60;le&#x60;, * &#x60;lt&#x60;, * &#x60;otherwise&#x60;. |  [optional] |
|**operands** | [**List&lt;Filter&gt;**](Filter.md) | If the type is &#x60;not&#x60;, &#x60;and&#x60; or &#x60;or&#x60;, then holds the contained filters. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AND | &quot;and&quot; |
| CONTAINS | &quot;contains&quot; |
| EQ | &quot;eq&quot; |
| EXISTSKEY | &quot;existsKey&quot; |
| GE | &quot;ge&quot; |
| GT | &quot;gt&quot; |
| IN | &quot;in&quot; |
| LE | &quot;le&quot; |
| LT | &quot;lt&quot; |
| NE | &quot;ne&quot; |
| NOT | &quot;not&quot; |
| OR | &quot;or&quot; |
| OTHERWISE | &quot;otherwise&quot; |
| PREFIX | &quot;prefix&quot; |
| REMAINDER | &quot;remainder&quot; |
| SERIES | &quot;series&quot; |
| SUFFIX | &quot;suffix&quot; |



