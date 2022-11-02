

# StringComparisonInfo

Comparison for `STRING` attributes.

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
| BEGINS_WITH | &quot;BEGINS_WITH&quot; |
| BEGINS_WITH_ANY_OF | &quot;BEGINS_WITH_ANY_OF&quot; |
| CONTAINS | &quot;CONTAINS&quot; |
| ENDS_WITH | &quot;ENDS_WITH&quot; |
| ENDS_WITH_ANY_OF | &quot;ENDS_WITH_ANY_OF&quot; |
| EQUALS | &quot;EQUALS&quot; |
| EQUALS_ANY_OF | &quot;EQUALS_ANY_OF&quot; |
| EXISTS | &quot;EXISTS&quot; |
| REGEX_MATCHES | &quot;REGEX_MATCHES&quot; |



