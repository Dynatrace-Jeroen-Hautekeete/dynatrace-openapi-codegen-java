

# SchemaType

A list of definitions of types.    A type is a complex property that contains its own set of subproperties.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**summaryPattern** | **String** | The pattern for the summary (for example, \&quot;Alert after *X* minutes.\&quot;) of the configuration in the UI. |  |
|**searchPattern** | **String** | The pattern for the summary search(for example, \&quot;Alert after *X* minutes.\&quot;) of the configuration in the UI. |  [optional] |
|**versionInfo** | **String** | A short description of the version. |  [optional] |
|**properties** | [**Map&lt;String, PropertyDefinition&gt;**](PropertyDefinition.md) | Definition of properties that can be persisted. |  |
|**version** | **String** | The version of the type. |  |
|**constraints** | [**List&lt;ComplexConstraint&gt;**](ComplexConstraint.md) | A list of constraints limiting the values to be accepted. |  [optional] |
|**documentation** | **String** | An extended description and/or links to documentation. |  |
|**displayName** | **String** | The display name of the property. |  [optional] |
|**description** | **String** | A short description of the property. |  |



