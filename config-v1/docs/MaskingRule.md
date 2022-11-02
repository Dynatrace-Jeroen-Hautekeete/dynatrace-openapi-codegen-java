

# MaskingRule

The masking rule defining how data is hidden.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maskingRuleType** | [**MaskingRuleTypeEnum**](#MaskingRuleTypeEnum) | The type of the masking rule. |  |
|**selector** | **String** | The selector for the element or the attribute to be masked.   Specify a CSS expression for an element or a [regular expression](https://dt-url.net/k9e0iaq) for an attribute. |  |
|**userInteractionHidden** | **Boolean** | Interactions with the element are (&#x60;true&#x60;) or are not (&#x60;false) masked. |  |



## Enum: MaskingRuleTypeEnum

| Name | Value |
|---- | -----|
| ATTRIBUTE | &quot;ATTRIBUTE&quot; |
| ELEMENT | &quot;ELEMENT&quot; |



