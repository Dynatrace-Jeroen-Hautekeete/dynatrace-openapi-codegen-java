

# PropertyDefinition

Configuration of a property in a settings schema.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**referencedType** | **String** | The type referenced by the property value |  [optional] |
|**maxObjects** | **Integer** | The maximum number of **objects** in a collection property.    Has the value of &#x60;1&#x60; for singletons. |  |
|**uiCustomization** | [**UiCustomization**](UiCustomization.md) |  |  [optional] |
|**documentation** | **String** | An extended description and/or links to documentation. |  [optional] |
|**precondition** | [**Precondition**](Precondition.md) |  |  [optional] |
|**datasource** | [**DatasourceDefinition**](DatasourceDefinition.md) |  |  [optional] |
|**minObjects** | **Integer** | The minimum number of **objects** in a collection property. |  [optional] |
|**modificationPolicy** | [**ModificationPolicyEnum**](#ModificationPolicyEnum) | Modification policy of the property. |  [optional] |
|**items** | [**Item**](Item.md) |  |  [optional] |
|**subType** | **String** | The subtype of the property&#39;s value. |  [optional] |
|**displayName** | **String** | The display name of the property. |  [optional] |
|**_default** | **Object** | The default value to be used when no value is provided.   If a non-singleton has the value of &#x60;null&#x60;, it means an empty collection. |  [optional] |
|**type** | **Object** | The type of the property&#39;s value. |  |
|**description** | **String** | A short description of the property. |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Metadata of the property. |  [optional] |
|**constraints** | [**List&lt;Constraint&gt;**](Constraint.md) | A list of constraints limiting the values to be accepted. |  [optional] |
|**nullable** | **Boolean** | The value can (&#x60;true&#x60;) or can&#39;t (&#x60;false&#x60;) be &#x60;null&#x60;. |  |



## Enum: ModificationPolicyEnum

| Name | Value |
|---- | -----|
| ALWAYS | &quot;ALWAYS&quot; |
| DEFAULT | &quot;DEFAULT&quot; |
| NEVER | &quot;NEVER&quot; |



