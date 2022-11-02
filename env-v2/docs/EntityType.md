

# EntityType

A list of properties of the monitored entity type.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityLimitExceeded** | **Boolean** | Whether the entity creation limit for the given type has been exceeded |  [optional] |
|**tags** | **String** | The placeholder for the list of tags of an actual entity. |  [optional] |
|**managementZones** | **String** | The placeholder for the list of management zones of an actual entity. |  [optional] |
|**fromRelationships** | [**List&lt;ToPosition&gt;**](ToPosition.md) | A list of possible relationships where the monitored entity type occupies the FROM position |  [optional] |
|**toRelationships** | [**List&lt;FromPosition&gt;**](FromPosition.md) | A list of possible relationships where the monitored entity type occupies the TO position. |  [optional] |
|**dimensionKey** | **String** | The dimension key used within metrics for this monitored entity. |  [optional] |
|**displayName** | **String** | The display name of the monitored entity. |  [optional] |
|**properties** | [**List&lt;EntityTypePropertyDto&gt;**](EntityTypePropertyDto.md) | A list of additional properties of the monitored entity type. |  [optional] |
|**type** | **String** | The type of the monitored entity. |  [optional] |



