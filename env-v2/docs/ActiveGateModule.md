

# ActiveGateModule

Information about ActiveGate module

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**misconfigured** | **Boolean** | The module is misconfigured (&#x60;true&#x60;) or not (&#x60;false&#x60;). |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of ActiveGate module. |  [optional] [readonly] |
|**attributes** | **Map&lt;String, String&gt;** | The attributes of the ActiveGate module. |  [optional] [readonly] |
|**version** | **String** | The version of the ActiveGate module. |  [optional] [readonly] |
|**enabled** | **Boolean** | The module is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AWS | &quot;AWS&quot; |
| AZURE | &quot;AZURE&quot; |
| BEACON_FORWARDER | &quot;BEACON_FORWARDER&quot; |
| CLOUD_FOUNDRY | &quot;CLOUD_FOUNDRY&quot; |
| DB_INSIGHT | &quot;DB_INSIGHT&quot; |
| EXTENSIONS_V1 | &quot;EXTENSIONS_V1&quot; |
| EXTENSIONS_V2 | &quot;EXTENSIONS_V2&quot; |
| KUBERNETES | &quot;KUBERNETES&quot; |
| LOGS | &quot;LOGS&quot; |
| MEMORY_DUMPS | &quot;MEMORY_DUMPS&quot; |
| METRIC_API | &quot;METRIC_API&quot; |
| ONE_AGENT_ROUTING | &quot;ONE_AGENT_ROUTING&quot; |
| OTLP_INGEST | &quot;OTLP_INGEST&quot; |
| REST_API | &quot;REST_API&quot; |
| SYNTHETIC | &quot;SYNTHETIC&quot; |
| VMWARE | &quot;VMWARE&quot; |
| Z_OS | &quot;Z_OS&quot; |



