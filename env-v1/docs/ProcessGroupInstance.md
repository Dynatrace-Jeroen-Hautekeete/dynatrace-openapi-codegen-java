

# ProcessGroupInstance

Parameters of a process.

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
|**fromRelationships** | [**ProcessGroupInstanceFromRelationships**](ProcessGroupInstanceFromRelationships.md) |  |  [optional] |
|**toRelationships** | [**ProcessGroupInstanceToRelationships**](ProcessGroupInstanceToRelationships.md) |  |  [optional] |
|**metadata** | [**ProcessGroupMetadata**](ProcessGroupMetadata.md) |  |  [optional] |
|**monitoringState** | [**MonitoringState**](MonitoringState.md) |  |  [optional] |
|**listenPorts** | **List&lt;Integer&gt;** |  |  [optional] |
|**agentVersions** | [**List&lt;AgentVersion&gt;**](AgentVersion.md) | Versions of OneAgents currently running on the entity. |  [optional] |
|**azureHostName** | **String** |  |  [optional] |
|**azureSiteName** | **String** |  |  [optional] |
|**versionedModules** | [**List&lt;ProcessGroupInstanceModule&gt;**](ProcessGroupInstanceModule.md) |  |  [optional] |
|**bitness** | [**BitnessEnum**](#BitnessEnum) |  |  [optional] |
|**modules** | **List&lt;String&gt;** |  |  [optional] |
|**softwareTechnologies** | [**List&lt;TechnologyInfo&gt;**](TechnologyInfo.md) |  |  [optional] |
|**managementZones** | [**List&lt;EntityShortRepresentation&gt;**](EntityShortRepresentation.md) | The management zones that the entity is part of. |  [optional] |



## Enum: BitnessEnum

| Name | Value |
|---- | -----|
| _32BIT | &quot;32bit&quot; |
| _64BIT | &quot;64bit&quot; |



