

# IntegerComparison

Comparison for `INTEGER` attributes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operator** | [**OperatorEnum**](#OperatorEnum) | Operator of the comparison. You can reverse it by setting **negate** to &#x60;true&#x60;.   Possible values depend on the **type** of the comparison. Find the list of actual models in the description of the **type** field and check the description of the model you need. |  |
|**value** | **Integer** | The value to compare to. |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| EQUALS | &quot;EQUALS&quot; |
| EXISTS | &quot;EXISTS&quot; |
| GREATER_THAN | &quot;GREATER_THAN&quot; |
| GREATER_THAN_OR_EQUAL | &quot;GREATER_THAN_OR_EQUAL&quot; |
| LOWER_THAN | &quot;LOWER_THAN&quot; |
| LOWER_THAN_OR_EQUAL | &quot;LOWER_THAN_OR_EQUAL&quot; |



