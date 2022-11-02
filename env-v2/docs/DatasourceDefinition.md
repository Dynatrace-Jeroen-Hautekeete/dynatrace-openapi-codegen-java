

# DatasourceDefinition

Configuration of a datasource for a property.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fullContext** | **Boolean** | Whether this datasource expects full setting payload as the context. |  |
|**useApiSearch** | **Boolean** | If true, the datasource should use the api to filter the results instead of client-side filtering. |  |
|**resetValue** | [**ResetValueEnum**](#ResetValueEnum) | When to reset datasource value in the UI on filter change. |  [optional] |
|**validate** | **Boolean** | Whether to validate input to only allow values returned by the datasource. |  |
|**filterProperties** | **Set&lt;String&gt;** | The properties to filter the datasource options on. |  |
|**identifier** | **String** | The identifier of a custom data source of the property&#39;s value. |  |



## Enum: ResetValueEnum

| Name | Value |
|---- | -----|
| ALWAYS | &quot;ALWAYS&quot; |
| INVALID_ONLY | &quot;INVALID_ONLY&quot; |
| NEVER | &quot;NEVER&quot; |



