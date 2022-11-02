

# ManagementZone

The configuration of the management zone. It defines how the management zone applies.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**id** | **String** | The ID of the management zone. |  [optional] |
|**name** | **String** | The name of the management zone. |  |
|**description** | **String** | The description of the management zone. |  [optional] |
|**rules** | [**List&lt;MzRule&gt;**](MzRule.md) | A list of rules for management zone usage.   If several rules are specified, the **OR** logic applies. |  [optional] |
|**dimensionalRules** | [**List&lt;MzDimensionalRule&gt;**](MzDimensionalRule.md) | A list of dimensional data rules for management zone usage.   If several rules are specified, the **OR** logic applies. |  [optional] |
|**entitySelectorBasedRules** | [**List&lt;EntitySelectorBasedMzRule&gt;**](EntitySelectorBasedMzRule.md) | A list of entity-selector based rules for management zone usage.  If several rules are specified, the **OR** logic applies. |  [optional] |



