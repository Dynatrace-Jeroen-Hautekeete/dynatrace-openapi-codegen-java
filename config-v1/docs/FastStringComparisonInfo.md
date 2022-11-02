

# FastStringComparisonInfo

Comparison for `FAST_STRING` attributes. Use it for all service property attributes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comparison** | [**ComparisonEnum**](#ComparisonEnum) | Operator of the comparision. You can reverse it by setting **negate** to &#x60;true&#x60;. |  |
|**value** | **String** | The value to compare to. |  [optional] |
|**values** | **Set&lt;String&gt;** | The values to compare to. |  [optional] |
|**caseSensitive** | **Boolean** | The comparison is case-sensitive (&#x60;true&#x60;) or not case-sensitive (&#x60;false&#x60;). |  [optional] |



## Enum: ComparisonEnum

| Name | Value |
|---- | -----|
| CONTAINS | &quot;CONTAINS&quot; |
| EQUALS | &quot;EQUALS&quot; |
| EQUALS_ANY_OF | &quot;EQUALS_ANY_OF&quot; |



