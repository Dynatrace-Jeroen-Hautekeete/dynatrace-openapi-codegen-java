

# UserActionNamingRuleCondition

The settings of conditions for user action naming.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operand1** | **String** | Must be a defined placeholder wrapped in curly braces |  |
|**operand2** | **String** | Must be null if operator is \&quot;IS_EMPTY\&quot;, a regex if operator is \&quot;MATCHES_REGULAR_ERPRESSION\&quot;. In all other cases the value can be a freetext or a placeholder wrapped in curly braces |  [optional] |
|**operator** | [**OperatorEnum**](#OperatorEnum) | The operator of the condition |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| CONTAINS | &quot;CONTAINS&quot; |
| ENDS_WITH | &quot;ENDS_WITH&quot; |
| EQUALS | &quot;EQUALS&quot; |
| IS_EMPTY | &quot;IS_EMPTY&quot; |
| IS_NOT_EMPTY | &quot;IS_NOT_EMPTY&quot; |
| MATCHES_REGULAR_EXPRESSION | &quot;MATCHES_REGULAR_EXPRESSION&quot; |
| NOT_CONTAINS | &quot;NOT_CONTAINS&quot; |
| NOT_ENDS_WITH | &quot;NOT_ENDS_WITH&quot; |
| NOT_EQUALS | &quot;NOT_EQUALS&quot; |
| NOT_MATCHES_REGULAR_EXPRESSION | &quot;NOT_MATCHES_REGULAR_EXPRESSION&quot; |
| NOT_STARTS_WITH | &quot;NOT_STARTS_WITH&quot; |
| STARTS_WITH | &quot;STARTS_WITH&quot; |



