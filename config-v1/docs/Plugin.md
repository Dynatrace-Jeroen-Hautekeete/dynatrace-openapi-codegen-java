

# Plugin

General configuration of a plugin.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**id** | **String** | The ID of the plugin, for example &#x60;custom.remote.python.demo&#x60;. |  [optional] |
|**name** | **String** | The name of the plugin, displayed in Dynatrace. |  [optional] |
|**version** | **String** | The version of the plugin, displayed in Dynatrace. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the plugin. It indicates the runtime environment of the plugin (for example, ActiveGate). |  [optional] |
|**metricGroup** | **String** | The metric group of the plugin. All the metrics, captured by the plugin are children of this group. |  [optional] |
|**properties** | [**List&lt;PluginProperty&gt;**](PluginProperty.md) | A list of plugin properties. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ACTIVEGATE | &quot;ActiveGate&quot; |
| JMX | &quot;JMX&quot; |
| ONEAGENT | &quot;OneAgent&quot; |
| PMI | &quot;PMI&quot; |



