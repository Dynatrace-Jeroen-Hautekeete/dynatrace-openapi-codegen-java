

# IpAddressComparison

Comparison for `IP_ADDRESS` attributes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operator** | [**OperatorEnum**](#OperatorEnum) | Operator of the comparison. You can reverse it by setting **negate** to &#x60;true&#x60;.   Possible values depend on the **type** of the comparison. Find the list of actual models in the description of the **type** field and check the description of the model you need. |  |
|**value** | **String** | The value to compare to. |  [optional] |
|**caseSensitive** | **Boolean** | The comparison is case-sensitive (&#x60;true&#x60;) or insensitive (&#x60;false&#x60;). |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| BEGINS_WITH | &quot;BEGINS_WITH&quot; |
| CONTAINS | &quot;CONTAINS&quot; |
| ENDS_WITH | &quot;ENDS_WITH&quot; |
| EQUALS | &quot;EQUALS&quot; |
| EXISTS | &quot;EXISTS&quot; |
| IS_IP_IN_RANGE | &quot;IS_IP_IN_RANGE&quot; |
| REGEX_MATCHES | &quot;REGEX_MATCHES&quot; |



