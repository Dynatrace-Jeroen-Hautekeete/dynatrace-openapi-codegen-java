

# MonitoringConfig

Monitoring configuration of OneAgent.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**id** | **String** | The Dynatrace entity ID of the host where OneAgent is deployed. |  [optional] [readonly] |
|**monitoringEnabled** | **Boolean** | The monitoring is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**monitoringMode** | [**MonitoringModeEnum**](#MonitoringModeEnum) | The monitoring mode for the host: full stack or infrastructure only. |  |
|**autoInjectionEnabled** | **Boolean** | Code modules will be injected automatically into monitored applications if this setting is enabled. This setting won&#39;t apply if auto-injection is disabled via oneagentctl (see https://dt-url.net/oneagentctl). |  [optional] |



## Enum: MonitoringModeEnum

| Name | Value |
|---- | -----|
| CLOUD_INFRASTRUCTURE | &quot;CLOUD_INFRASTRUCTURE&quot; |
| FULL_STACK | &quot;FULL_STACK&quot; |



