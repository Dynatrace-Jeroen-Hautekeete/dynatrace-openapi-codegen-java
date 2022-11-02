

# MzDimensionalRule

The dimensional rule of the management zone usage. It defines how the management zone applies.    Each rule is evaluated independently of all other rules.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | The rule is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**appliesTo** | [**AppliesToEnum**](#AppliesToEnum) | The target of the rule. |  |
|**conditions** | [**List&lt;MzDimensionalRuleCondition&gt;**](MzDimensionalRuleCondition.md) | A list of conditions for the management zone.    The management zone applies only if **all** conditions are fulfilled. |  |



## Enum: AppliesToEnum

| Name | Value |
|---- | -----|
| ANY | &quot;ANY&quot; |
| LOG | &quot;LOG&quot; |
| METRIC | &quot;METRIC&quot; |



