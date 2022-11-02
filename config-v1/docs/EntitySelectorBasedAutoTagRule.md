

# EntitySelectorBasedAutoTagRule

The entity-selector-based rule for auto tag usage. It allows tagging entities via an entity selector.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | The rule is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  [optional] |
|**entitySelector** | **String** | The entity selector string, by which the entities are selected. |  |
|**valueFormat** | **String** | The value of the entity-selector-based auto-tag. If specified, the tag is used in the &#x60;name:valueFormat&#x60; format.   For example, you can extend the &#x60;Infrastructure&#x60; tag to &#x60;Infrastructure:Windows&#x60; and &#x60;Infrastructure:Linux&#x60;.    |  [optional] |
|**normalization** | [**NormalizationEnum**](#NormalizationEnum) | Changes applied to the value after applying the value format. Default is LEAVE_TEXT_AS_IS. |  [optional] |



## Enum: NormalizationEnum

| Name | Value |
|---- | -----|
| LEAVE_TEXT_AS_IS | &quot;LEAVE_TEXT_AS_IS&quot; |
| TO_LOWER_CASE | &quot;TO_LOWER_CASE&quot; |
| TO_UPPER_CASE | &quot;TO_UPPER_CASE&quot; |



