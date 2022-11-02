

# MzDimensionalRuleCondition

A condition of the management zone dimensional rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conditionType** | [**ConditionTypeEnum**](#ConditionTypeEnum) | The type of the condition. |  |
|**ruleMatcher** | [**RuleMatcherEnum**](#RuleMatcherEnum) | How we compare the values. |  |
|**key** | **String** | The reference value for comparison.   For conditions of the &#x60;DIMENSION&#x60; type, specify the key here. |  |
|**value** | **String** | The value of the dimension.   Only applicable when the **conditionType** is set to &#x60;DIMENSION&#x60;. |  [optional] |



## Enum: ConditionTypeEnum

| Name | Value |
|---- | -----|
| DIMENSION | &quot;DIMENSION&quot; |
| LOG_FILE_NAME | &quot;LOG_FILE_NAME&quot; |
| METRIC_KEY | &quot;METRIC_KEY&quot; |



## Enum: RuleMatcherEnum

| Name | Value |
|---- | -----|
| BEGINS_WITH | &quot;BEGINS_WITH&quot; |
| EQUALS | &quot;EQUALS&quot; |



