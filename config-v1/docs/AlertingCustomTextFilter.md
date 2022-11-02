

# AlertingCustomTextFilter

Configuration of a matching filter.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | The filter is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**value** | **String** | The value to compare to. |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) | Operator of the comparison.    You can reverse it by setting **negate** to &#x60;true&#x60;. |  |
|**negate** | **Boolean** | Reverses the comparison **operator**. For example it turns the **begins with** into **does not begin with**. |  |
|**caseInsensitive** | **Boolean** | The condition is case sensitive (&#x60;false&#x60;) or case insensitive (&#x60;true&#x60;).    If not set, then &#x60;false&#x60; is used, making the condition case sensitive. |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| BEGINS_WITH | &quot;BEGINS_WITH&quot; |
| CONTAINS | &quot;CONTAINS&quot; |
| CONTAINS_REGEX | &quot;CONTAINS_REGEX&quot; |
| ENDS_WITH | &quot;ENDS_WITH&quot; |
| EQUALS | &quot;EQUALS&quot; |



