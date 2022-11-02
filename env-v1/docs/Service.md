

# Service


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityId** | **String** | The Dynatrace entity ID of the required entity. |  [optional] |
|**displayName** | **String** | The name of the Dynatrace entity as displayed in the UI. |  [optional] |
|**customizedName** | **String** | The customized name of the entity |  [optional] |
|**discoveredName** | **String** | The discovered name of the entity |  [optional] |
|**firstSeenTimestamp** | **Long** | The timestamp of when the entity was first detected, in UTC milliseconds |  [optional] |
|**lastSeenTimestamp** | **Long** | The timestamp of when the entity was last detected, in UTC milliseconds |  [optional] |
|**tags** | [**Set&lt;TagInfo&gt;**](TagInfo.md) | The list of entity tags. |  [optional] |
|**fromRelationships** | [**ServiceFromRelationships**](ServiceFromRelationships.md) |  |  [optional] |
|**toRelationships** | [**ServiceToRelationships**](ServiceToRelationships.md) |  |  [optional] |
|**iibApplicationName** | **String** | The IIB application name. |  [optional] |
|**esbApplicationName** | **String** | The ESB application name. |  [optional] |
|**webServiceName** | **String** |  |  [optional] |
|**path** | **String** |  |  [optional] |
|**ibmCtgGatewayUrl** | **String** | The IBM CTG gateway URL. |  [optional] |
|**softwareTechnologies** | [**List&lt;TechnologyInfo&gt;**](TechnologyInfo.md) |  |  [optional] |
|**ibmCtgServerName** | **String** | The IBM CICS Transaction Gateway name. |  [optional] |
|**serviceTechnologyTypes** | **List&lt;String&gt;** |  |  [optional] |
|**databaseHostNames** | **List&lt;String&gt;** |  |  [optional] |
|**ipAddresses** | **List&lt;String&gt;** |  |  [optional] |
|**isExternalService** | **Boolean** |  |  [optional] |
|**akkaActorSystem** | **String** | The services of the akka actor system. |  [optional] |
|**serviceType** | [**ServiceTypeEnum**](#ServiceTypeEnum) |  |  [optional] |
|**port** | **Integer** |  |  [optional] |
|**databaseVendor** | **String** |  |  [optional] |
|**webServerName** | **String** |  |  [optional] |
|**className** | **String** |  |  [optional] |
|**remoteServiceName** | **String** | The name of the remote service. |  [optional] |
|**remoteEndpoint** | **String** | The endpoint of the remote service. |  [optional] |
|**managementZones** | [**List&lt;EntityShortRepresentation&gt;**](EntityShortRepresentation.md) | The management zones that the entity is part of. |  [optional] |
|**databaseName** | **String** |  |  [optional] |
|**agentTechnologyType** | [**AgentTechnologyTypeEnum**](#AgentTechnologyTypeEnum) |  |  [optional] |
|**contextRoot** | **String** |  |  [optional] |
|**webServiceNamespace** | **String** |  |  [optional] |
|**webApplicationId** | **String** |  |  [optional] |



## Enum: ServiceTypeEnum

| Name | Value |
|---- | -----|
| AMP | &quot;AMP&quot; |
| CICS | &quot;Cics&quot; |
| CICSINTERACTION | &quot;CicsInteraction&quot; |
| CUSTOMAPPLICATION | &quot;CustomApplication&quot; |
| DATABASE | &quot;Database&quot; |
| ENTERPRISESERVICEBUS | &quot;EnterpriseServiceBus&quot; |
| EXTERNAL | &quot;External&quot; |
| IMS | &quot;Ims&quot; |
| IMSINTERACTION | &quot;ImsInteraction&quot; |
| MESSAGING | &quot;Messaging&quot; |
| METHOD | &quot;Method&quot; |
| MOBILE | &quot;Mobile&quot; |
| PROCESS | &quot;Process&quot; |
| QUEUEINTERACTION | &quot;QueueInteraction&quot; |
| QUEUELISTENER | &quot;QueueListener&quot; |
| REMOTECALL | &quot;RemoteCall&quot; |
| RMI | &quot;Rmi&quot; |
| SAASVENDOR | &quot;SaasVendor&quot; |
| SPAN | &quot;Span&quot; |
| UNKNOWN | &quot;Unknown&quot; |
| WEBREQUEST | &quot;WebRequest&quot; |
| WEBSERVICE | &quot;WebService&quot; |
| WEBSITE | &quot;WebSite&quot; |
| ZOSCONNECT | &quot;ZosConnect&quot; |



## Enum: AgentTechnologyTypeEnum

| Name | Value |
|---- | -----|
| APACHE | &quot;APACHE&quot; |
| DOTNET | &quot;DOTNET&quot; |
| DUMPPROC | &quot;DUMPPROC&quot; |
| GO | &quot;GO&quot; |
| IIS | &quot;IIS&quot; |
| JAVA | &quot;JAVA&quot; |
| LOG_ANALYTICS | &quot;LOG_ANALYTICS&quot; |
| N_A | &quot;N/A&quot; |
| NET | &quot;NET&quot; |
| NETTRACER | &quot;NETTRACER&quot; |
| NGINX | &quot;NGINX&quot; |
| NODEJS | &quot;NODEJS&quot; |
| OPENTRACINGNATIVE | &quot;OPENTRACINGNATIVE&quot; |
| OS | &quot;OS&quot; |
| PHP | &quot;PHP&quot; |
| PLUGIN | &quot;PLUGIN&quot; |
| PROCESS | &quot;PROCESS&quot; |
| PYTHON | &quot;PYTHON&quot; |
| REMOTE_PLUGIN | &quot;REMOTE_PLUGIN&quot; |
| RUBY | &quot;RUBY&quot; |
| SDK | &quot;SDK&quot; |
| UPDATER | &quot;UPDATER&quot; |
| VARNISH | &quot;VARNISH&quot; |
| WSMB | &quot;WSMB&quot; |
| Z | &quot;Z&quot; |



