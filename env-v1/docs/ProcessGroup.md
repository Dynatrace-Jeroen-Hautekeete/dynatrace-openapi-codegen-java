

# ProcessGroup

Parameters of a process group.

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
|**fromRelationships** | [**ProcessGroupFromRelationships**](ProcessGroupFromRelationships.md) |  |  [optional] |
|**toRelationships** | [**ProcessGroupToRelationships**](ProcessGroupToRelationships.md) |  |  [optional] |
|**metadata** | [**ProcessGroupMetadata**](ProcessGroupMetadata.md) |  |  [optional] |
|**listenPorts** | **List&lt;Integer&gt;** |  |  [optional] |
|**azureHostName** | **String** |  |  [optional] |
|**azureSiteName** | **String** |  |  [optional] |
|**softwareTechnologies** | [**List&lt;TechnologyInfo&gt;**](TechnologyInfo.md) |  |  [optional] |
|**managementZones** | [**List&lt;EntityShortRepresentation&gt;**](EntityShortRepresentation.md) | The management zones that the entity is part of. |  [optional] |



