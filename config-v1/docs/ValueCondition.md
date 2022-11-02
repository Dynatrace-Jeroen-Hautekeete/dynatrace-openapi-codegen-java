

# ValueCondition

IBM integration bus label node name condition for which the value is captured.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operator** | [**OperatorEnum**](#OperatorEnum) | Operator comparing the extracted value to the comparison value. |  |
|**negate** | **Boolean** | Negate the comparison. |  |
|**value** | **String** | The value to compare to. |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| BEGINS_WITH | &quot;BEGINS_WITH&quot; |
| BEGINS_WITH_ANY_OF | &quot;BEGINS_WITH_ANY_OF&quot; |
| CONTAINS | &quot;CONTAINS&quot; |
| ENDS_WITH | &quot;ENDS_WITH&quot; |
| ENDS_WITH_ANY_OF | &quot;ENDS_WITH_ANY_OF&quot; |
| EQUALS | &quot;EQUALS&quot; |
| EQUALS_ANY_OF | &quot;EQUALS_ANY_OF&quot; |



