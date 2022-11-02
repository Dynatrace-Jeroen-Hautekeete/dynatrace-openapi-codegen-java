

# Technology

Configuration of technology monitoring.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of the technology. |  |
|**monitoringEnabled** | **Boolean** | The monitoring of the technology is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**scope** | [**ScopeEnum**](#ScopeEnum) | The validity of the configuration:   * &#x60;HOST&#x60;: The setting is valid for OneAgent on host only. Other OneAgents, connected to the same Dynatrace server may have different setting.  * &#x60;ENVIRONMENT&#x60;: The setting is valid for all OneAgents, connected to the Dynatrace server. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AIX_KERNEL_EXT | &quot;AIX_KERNEL_EXT&quot; |
| APACHE | &quot;APACHE&quot; |
| CIM_V2 | &quot;CIM_V2&quot; |
| DOCKER | &quot;DOCKER&quot; |
| DOCKER_WIN | &quot;DOCKER_WIN&quot; |
| DOT_NET | &quot;DOT_NET&quot; |
| DOT_NET_CORE | &quot;DOT_NET_CORE&quot; |
| EXTENSIONS | &quot;EXTENSIONS&quot; |
| EXTENSIONS_DS_GENERIC | &quot;EXTENSIONS_DS_GENERIC&quot; |
| EXTENSIONS_STATSD | &quot;EXTENSIONS_STATSD&quot; |
| GARDEN | &quot;GARDEN&quot; |
| GO | &quot;GO&quot; |
| GO_STATIC | &quot;GO_STATIC&quot; |
| IBM_INTEGRATION_BUS | &quot;IBM_INTEGRATION_BUS&quot; |
| IIS | &quot;IIS&quot; |
| JAVA | &quot;JAVA&quot; |
| LOG_ANALYTICS | &quot;LOG_ANALYTICS&quot; |
| NETTRACER | &quot;NETTRACER&quot; |
| NETWORK | &quot;NETWORK&quot; |
| NGINX | &quot;NGINX&quot; |
| NODE_JS | &quot;NODE_JS&quot; |
| OPENTRACINGNATIVE | &quot;OPENTRACINGNATIVE&quot; |
| PHP | &quot;PHP&quot; |
| PHP_81 | &quot;PHP_81&quot; |
| PHP_CGI | &quot;PHP_CGI&quot; |
| PHP_CLI | &quot;PHP_CLI&quot; |
| PHP_WIN | &quot;PHP_WIN&quot; |
| PROCESS | &quot;PROCESS&quot; |
| RUBY | &quot;RUBY&quot; |
| SDK | &quot;SDK&quot; |
| VARNISH | &quot;VARNISH&quot; |
| Z_OS | &quot;Z_OS&quot; |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| ENVIRONMENT | &quot;ENVIRONMENT&quot; |
| HOST | &quot;HOST&quot; |



