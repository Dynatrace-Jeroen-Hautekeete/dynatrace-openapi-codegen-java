

# Extension

General configuration of an extension.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the extension, for example &#x60;custom.remote.python.demo&#x60;. |  [optional] |
|**name** | **String** | The name of the extension, displayed in Dynatrace. |  [optional] |
|**version** | **String** | The version of the extension, displayed in Dynatrace. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the extension. It indicates the runtime environment of the extension (for example, ACTIVEGATE). |  [optional] |
|**metricGroup** | **String** | The metricGroup of the extension used for grouping custom metrics into a hierarchical namespace. |  [optional] |
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**properties** | [**List&lt;ExtensionProperty&gt;**](ExtensionProperty.md) | A list of extension properties. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ACTIVEGATE | &quot;ACTIVEGATE&quot; |
| CODEMODULE | &quot;CODEMODULE&quot; |
| JMX | &quot;JMX&quot; |
| ONEAGENT | &quot;ONEAGENT&quot; |
| PMI | &quot;PMI&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



