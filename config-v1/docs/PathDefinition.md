

# PathDefinition

A filtering criterion for log path.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**definition** | **String** | The path to the required log path.    If the **type** is set to &#x60;WILDCARD&#x60;, it may contain wildcard characters (&#x60;*&#x60;). |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the log path **definition**: fixed or an expression with wildcards. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FIXED | &quot;FIXED&quot; |
| WILDCARD | &quot;WILDCARD&quot; |



