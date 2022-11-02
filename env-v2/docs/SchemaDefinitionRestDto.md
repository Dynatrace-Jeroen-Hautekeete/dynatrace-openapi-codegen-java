

# SchemaDefinitionRestDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dynatrace** | **String** | The version of the data format. |  |
|**schemaId** | **String** | The ID of the schema. |  |
|**displayName** | **String** | The display name of the schema. |  |
|**description** | **String** | A short description of the schema. |  |
|**documentation** | **String** | An extended description of the schema and/or links to documentation. |  [optional] |
|**schemaGroups** | **Set&lt;String&gt;** | Names of the groups, which the schema belongs to. |  [optional] |
|**version** | **String** | The version of the schema. |  |
|**multiObject** | **Boolean** | Multiple (&#x60;true&#x60;) objects per scope are permitted or a single (&#x60;false&#x60;) object per scope is permitted. |  |
|**ordered** | **Boolean** | If &#x60;true&#x60; the order of objects has semantic significance.   Only applicable when **multiObject** is set to &#x60;true&#x60;. |  [optional] |
|**maxObjects** | **Integer** | The maximum amount of objects per scope.   Only applicable when **multiObject** is set to &#x60;true&#x60;. |  |
|**allowedScopes** | **List&lt;String&gt;** | A list of scopes where the schema can be used. |  |
|**enums** | [**Map&lt;String, EnumType&gt;**](EnumType.md) | A list of definitions of enum properties. |  |
|**types** | [**Map&lt;String, SchemaType&gt;**](SchemaType.md) | A list of definitions of types.    A type is a complex property that contains its own set of subproperties. |  |
|**properties** | [**Map&lt;String, PropertyDefinition&gt;**](PropertyDefinition.md) | A list of schema&#39;s properties. |  |
|**constraints** | [**List&lt;ComplexConstraint&gt;**](ComplexConstraint.md) | A list of constrains limiting the values to be accepted by the schema. |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Metadata of the setting. |  [optional] |
|**uiCustomization** | [**UiCustomization**](UiCustomization.md) |  |  [optional] |



