

# AutoTag

Configuration of an auto-tag. It defines the conditions of tag usage and the tag value.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**id** | **UUID** | The ID of the auto-tag. |  [optional] |
|**name** | **String** | The name of the auto-tag, which is applied to entities.   Additionally you can specify a **valueFormat** in the tag rule. In that case the tag is used in the &#x60;name:valueFormat&#x60; format.   For example you can extend the &#x60;Infrastructure&#x60; tag to &#x60;Infrastructure:Windows&#x60; and &#x60;Infrastructure:Linux&#x60;. |  |
|**description** | **String** | The description of the auto-tag. |  [optional] |
|**rules** | [**List&lt;AutoTagRule&gt;**](AutoTagRule.md) | The list of rules for tag usage.   When there are multiple rules, the OR logic applies. |  [optional] |
|**entitySelectorBasedRules** | [**List&lt;EntitySelectorBasedAutoTagRule&gt;**](EntitySelectorBasedAutoTagRule.md) | A list of entity-selector based rules for auto tagging usage.  If several rules are specified, the **OR** logic applies. |  [optional] |



