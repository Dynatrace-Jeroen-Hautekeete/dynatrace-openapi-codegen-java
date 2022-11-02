

# NumberRequestAttributeComparisonInfo

Comparison for `NUMBER_REQUEST_ATTRIBUTE` attributes, specifically of the generic **Number** type.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comparison** | [**ComparisonEnum**](#ComparisonEnum) | Operator of the comparision. You can reverse it by setting **negate** to &#x60;true&#x60;. |  |
|**value** | **BigDecimal** | The value to compare to. |  [optional] |
|**values** | **Set&lt;BigDecimal&gt;** | The values to compare to. |  [optional] |
|**requestAttribute** | **String** |  |  |
|**matchOnChildCalls** | **Boolean** | If &#x60;true&#x60;, the request attribute is matched on child service calls.     Default is &#x60;false&#x60;. |  [optional] |
|**source** | [**PropagationSource**](PropagationSource.md) |  |  [optional] |



## Enum: ComparisonEnum

| Name | Value |
|---- | -----|
| EQUALS | &quot;EQUALS&quot; |
| EQUALS_ANY_OF | &quot;EQUALS_ANY_OF&quot; |
| EXISTS | &quot;EXISTS&quot; |
| GREATER_THAN | &quot;GREATER_THAN&quot; |
| GREATER_THAN_OR_EQUAL | &quot;GREATER_THAN_OR_EQUAL&quot; |
| LOWER_THAN | &quot;LOWER_THAN&quot; |
| LOWER_THAN_OR_EQUAL | &quot;LOWER_THAN_OR_EQUAL&quot; |



