

# TagComparisonInfo

Comparison for `TAG` attributes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comparison** | [**ComparisonEnum**](#ComparisonEnum) | Operator of the comparision. You can reverse it by setting **negate** to &#x60;true&#x60;. |  |
|**value** | [**TagInfo**](TagInfo.md) |  |  [optional] |
|**values** | [**Set&lt;TagInfo&gt;**](TagInfo.md) | The values to compare to. |  [optional] |



## Enum: ComparisonEnum

| Name | Value |
|---- | -----|
| EQUALS | &quot;EQUALS&quot; |
| EQUALS_ANY_OF | &quot;EQUALS_ANY_OF&quot; |
| TAG_KEY_EQUALS | &quot;TAG_KEY_EQUALS&quot; |
| TAG_KEY_EQUALS_ANY_OF | &quot;TAG_KEY_EQUALS_ANY_OF&quot; |



